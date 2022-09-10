package defpackage;

import android.os.AsyncTask;
/* compiled from: PG */
/* renamed from: cswd  reason: default package */
/* loaded from: classes5.dex */
public final class cswd<T> extends AsyncTask<Void, Void, T> {
    final cswc<T> a;
    final cxju<T> b;

    public cswd(cswc<T> cswcVar, cxju<T> cxjuVar) {
        this.a = cswcVar;
        this.b = cxjuVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
        return this.b.f();
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(T t) {
        this.a.a(t);
    }
}
