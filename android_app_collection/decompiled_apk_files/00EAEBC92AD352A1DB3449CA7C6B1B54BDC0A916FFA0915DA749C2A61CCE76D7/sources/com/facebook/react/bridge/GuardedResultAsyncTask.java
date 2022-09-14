package com.facebook.react.bridge;

import android.os.AsyncTask;
/* loaded from: classes.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    protected GuardedResultAsyncTask(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public GuardedResultAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return mo212doInBackgroundGuarded();
        } catch (RuntimeException e2) {
            this.mExceptionHandler.handleException(e2);
            throw e2;
        }
    }

    /* renamed from: doInBackgroundGuarded */
    protected abstract Result mo212doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e2) {
            this.mExceptionHandler.handleException(e2);
        }
    }

    protected abstract void onPostExecuteGuarded(Result result);
}
