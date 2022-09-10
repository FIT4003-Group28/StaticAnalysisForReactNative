package defpackage;

import android.content.Context;
import android.os.AsyncTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpwo  reason: default package */
/* loaded from: classes5.dex */
public final class cpwo extends AsyncTask<Void, Void, cpyz> {
    private final cqan a;
    private final deig<cpyz> b;

    public cpwo(Context context, deig<cpyz> deigVar) {
        this.a = new cqan(context.getContentResolver());
        this.b = deigVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ defpackage.cpyz doInBackground(java.lang.Void[] r8) {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            cqan r8 = r7.a
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "com.google.android.googlequicksearchbox.GsaPublicContentProvider"
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = "publicvalue"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "opa_app_integration_data"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            android.net.Uri r2 = r0.build()
            r0 = 0
            android.content.ContentResolver r1 = r8.a     // Catch: java.lang.Exception -> L5d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L5d
            if (r8 == 0) goto L5a
            int r1 = r8.getCount()     // Catch: java.lang.Throwable -> L50
            if (r1 > 0) goto L39
            goto L5a
        L39:
            java.lang.String r1 = "value"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L50
            if (r1 >= 0) goto L45
        L41:
            r8.close()     // Catch: java.lang.Exception -> L5d
            goto L5d
        L45:
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L50
            r8.close()     // Catch: java.lang.Exception -> L5d
            goto L5e
        L50:
            r1 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r8 = move-exception
            defpackage.deki.a(r1, r8)     // Catch: java.lang.Exception -> L5d
        L59:
            throw r1     // Catch: java.lang.Exception -> L5d
        L5a:
            if (r8 == 0) goto L5d
            goto L41
        L5d:
            r1 = r0
        L5e:
            if (r1 != 0) goto L61
            goto L84
        L61:
            r8 = 0
            byte[] r8 = android.util.Base64.decode(r1, r8)
            cpyz r1 = defpackage.cpyz.i     // Catch: defpackage.dsrm -> L84
            dsqw r8 = defpackage.dsqw.cq(r1, r8)     // Catch: defpackage.dsrm -> L84
            cpyz r8 = (defpackage.cpyz) r8     // Catch: defpackage.dsrm -> L84
            r8.toString()     // Catch: defpackage.dsrm -> L84
            deig<cpyz> r0 = r7.b
            if (r8 != 0) goto L80
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to query to AGSA."
            r1.<init>(r2)
            r0.k(r1)
            goto L83
        L80:
            r0.j(r8)
        L83:
            r0 = r8
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpwo.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(cpyz cpyzVar) {
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Void[] voidArr) {
    }
}
