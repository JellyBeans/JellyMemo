//��ȡ���ð���
        try {

            //this is just a work-around for testWebViewClipWithCircle
            String callingPackage = mPackageManager.getNameForUid(Binder.getCallingUid());
            if(callingPackage.equals("com.android.XXX")){
                doSomeThing();
            }

        }catch (Exception e){
            //Just ignore it now
        }

//��ȡ���ú���
//һ��Ҫtry ctatch
  try{
	StackTraceElement[] stacks = new Throwable().getStackTrace();

       if(stacks[level].getMethodName().equals("xxxxxxx")){
               doSomeThing();

       }
  } catch (Exception e) {
            e.printStackTrace();
  }