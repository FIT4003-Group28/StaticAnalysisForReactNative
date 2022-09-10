package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cscq  reason: default package */
/* loaded from: classes5.dex */
public final class cscq {
    public final Context a;
    @dzsi
    public cscp c;
    @dzsi
    public ckyg f;
    @dzsi
    public ckyj g;
    private final btso h;
    public boolean d = false;
    public final Object e = new Object();
    public final csco b = new csco(this);

    public cscq(Context context, btso btsoVar) {
        this.a = context;
        this.h = btsoVar;
    }

    public final void a(ckyi ckyiVar) {
        synchronized (this.e) {
            dbsk.t(this.c, "connect() must be called before setMicrophoneLevelCallback().");
            this.c.a = ckyiVar;
            ckyj ckyjVar = this.g;
            if (ckyjVar != null) {
                try {
                    ckyjVar.g(ckyiVar);
                } catch (RemoteException e) {
                    e.toString();
                }
            }
        }
    }

    public final void b() {
        String str = "com.google.android.carassistant";
        if (!this.h.a(this.a.getPackageManager(), str)) {
            str = this.h.a(this.a.getPackageManager(), "com.google.android.googlequicksearchbox") ? "com.google.android.googlequicksearchbox" : "";
        }
        if (str.isEmpty()) {
            return;
        }
        Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
        intent.setPackage(str);
        Context context = this.a;
        cscp cscpVar = this.c;
        dbsk.s(cscpVar);
        this.d = context.bindService(intent, cscpVar, 1);
    }
}
