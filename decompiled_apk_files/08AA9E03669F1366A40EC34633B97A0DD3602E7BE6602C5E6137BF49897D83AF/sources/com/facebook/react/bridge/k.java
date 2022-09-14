package com.facebook.react.bridge;

import android.os.AsyncTask;
/* compiled from: GuardedResultAsyncTask.java */
/* loaded from: classes.dex */
public abstract class k<Result> extends AsyncTask<Void, Void, Result> {

    /* renamed from: a  reason: collision with root package name */
    private final aj f3246a;

    protected abstract Result a();

    protected abstract void a(Result result);

    /* JADX INFO: Access modifiers changed from: protected */
    public k(aj ajVar) {
        this.f3246a = ajVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final Result doInBackground(Void... voidArr) {
        try {
            return a();
        } catch (RuntimeException e) {
            this.f3246a.a(e);
            throw e;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        try {
            a((k<Result>) result);
        } catch (RuntimeException e) {
            this.f3246a.a(e);
        }
    }
}
