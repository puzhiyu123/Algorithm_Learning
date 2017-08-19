// Returning Objects

class Errmsg {
    String msg; // the error message
    int severity; // indicating thr severity of the error

    Err (String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Outout Error";
            "Input Error";
            "Disk Full";
            "Index Out-of-Bounds";
};

    int howbad[]={3,3,2,4};
            // returning an object of type Errmsg
            Err getErrorInfo(int i){
            if(i>=0&i<msgs.length)
        return new Errmsg(msgs[i],howbad[i]);
        else
        return new Errmsg("Invalid Error Code",0);
        }
        }

class ErrorInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();
        Errmsg e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }

    // the expected output should be :
    // Disk Full severity: 2
    // Invalid Error Code severity: 0



}