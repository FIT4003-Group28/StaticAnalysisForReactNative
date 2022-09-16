package defpackage;

import android.os.AsyncTask;
import android.provider.ContactsContract;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bidj  reason: default package */
/* loaded from: classes3.dex */
public final class bidj extends AsyncTask<String, Integer, Integer> {
    final /* synthetic */ bidk a;

    public bidj(bidk bidkVar) {
        this.a = bidkVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Integer doInBackground(String[] strArr) {
        btop h = btoq.h();
        h.b("contact_id");
        h.c("sourceid=? and account_name=?");
        h.d(strArr[0], dbsj.e(this.a.c.o()));
        try {
            btou btouVar = new btou(this.a.a, ContactsContract.RawContacts.CONTENT_URI, h.a());
            Integer num = (Integer) btouVar.g(btouVar.b("contact_id")).c(0);
            btouVar.close();
            return num;
        } catch (btnx unused) {
            return 0;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Integer num) {
        this.a.g.a().f(this.a.a, bidk.k(String.valueOf(num)), 4);
    }
}
