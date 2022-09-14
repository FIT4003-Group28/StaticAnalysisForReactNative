package defpackage;

import android.os.AsyncTask;
/* compiled from: PG */
/* renamed from: ctld  reason: default package */
/* loaded from: classes5.dex */
final class ctld extends AsyncTask {
    final /* synthetic */ ctlf a;

    public ctld(ctlf ctlfVar) {
        this.a = ctlfVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.a.q.d();
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
        this.a.o();
        ctlf ctlfVar = this.a;
        ctlfVar.p = false;
        if (ctlfVar.d) {
            String valueOf = String.valueOf(ctlfVar.i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
            sb.append("delivering: ");
            sb.append(valueOf);
            sb.toString();
            cstl.a("DatabaseUriMonitor");
            ctlfVar.q.a(obj);
        }
    }
}
