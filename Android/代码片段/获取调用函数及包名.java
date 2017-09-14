//获取调用包名
        try {

            //this is just a work-around for testWebViewClipWithCircle
            String callingPackage = mPackageManager.getNameForUid(Binder.getCallingUid());
            if(callingPackage.equals("com.android.XXX")){
                doSomeThing();
            }

        }catch (Exception e){
            //Just ignore it now
        }

//获取调用函数
//一定要try ctatch
  try{
	StackTraceElement[] stacks = new Throwable().getStackTrace();

       if(stacks[level].getMethodName().equals("xxxxxxx")){
               doSomeThing();

       }
  } catch (Exception e) {
            e.printStackTrace();
  }
