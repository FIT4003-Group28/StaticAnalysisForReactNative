package defpackage;

import android.content.Context;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;
/* compiled from: PG */
/* renamed from: una  reason: default package */
/* loaded from: classes4.dex */
public final class una {
    public final eo a;
    public final dt b;
    private final Context c;
    private final umz d;

    public una(Context context, eo eoVar, umz umzVar, dt dtVar) {
        this.c = context.getApplicationContext();
        this.a = eoVar;
        this.d = umzVar;
        this.b = dtVar;
        umx b = b(eoVar);
        if (b != null) {
            a(b);
        }
    }

    public static final umx b(eo eoVar) {
        return (umx) eoVar.f(umx.ae);
    }

    public final void a(umx umxVar) {
        Context context = this.c;
        umz umzVar = this.d;
        uoc uocVar = umzVar.a;
        uoe uoeVar = umzVar.b;
        AccountsModelUpdater accountsModelUpdater = (AccountsModelUpdater) umzVar.c.f();
        umxVar.ag = uocVar;
        if (uoeVar.a.f.h()) {
            umxVar.aj = ((uog) uoeVar.a.f.c()).b;
        } else {
            umxVar.aj = qvl.f;
            uod uodVar = new uod(uoeVar);
            uoj uojVar = new uoj(uoeVar.a);
            uojVar.b(vgh.d(context, umxVar.aj));
            uodVar.a = uojVar.a();
            uoeVar = uodVar.a();
        }
        umxVar.ah = uoeVar;
        umxVar.ai = accountsModelUpdater;
        final umj umjVar = umxVar.af;
        aqxo.z(umjVar.b.b(), "Object was not initialized");
        umr.b(new Runnable() { // from class: umh
            @Override // java.lang.Runnable
            public final void run() {
                umj.this.a();
            }
        });
    }
}
