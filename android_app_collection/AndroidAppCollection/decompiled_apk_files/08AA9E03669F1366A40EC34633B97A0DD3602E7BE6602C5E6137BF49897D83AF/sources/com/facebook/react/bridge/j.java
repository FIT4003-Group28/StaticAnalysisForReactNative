package com.facebook.react.bridge;

import android.os.AsyncTask;
/* compiled from: GuardedAsyncTask.java */
/* loaded from: classes.dex */
public abstract class j<Params, Progress> extends AsyncTask<Params, Progress, Void> {

    /* renamed from: a  reason: collision with root package name */
    private final aj f3245a;

    protected abstract void b(Params... paramsArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public j(aj ajVar) {
        this.f3245a = ajVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final Void doInBackground(Params... paramsArr) {
        try {
            b(paramsArr);
            return null;
        } catch (RuntimeException e) {
            this.f3245a.a(e);
            return null;
        }
    }
}
