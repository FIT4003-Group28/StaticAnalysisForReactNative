package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
/* compiled from: PG */
/* renamed from: claw  reason: default package */
/* loaded from: classes5.dex */
public final class claw implements clau {
    public static final /* synthetic */ int a = 0;
    private static final dexo b = dexo.a(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.platform.appintegration.endpoint.AppIntegrationService"));
    private final dyhi c;
    private final cpys d;
    private final String e;
    private final dyzk<cpyx> f;
    @dzsi
    private dyzk<cpyv> g;

    public claw(Context context) {
        deyr a2 = deyr.a((Application) context.getApplicationContext(), b);
        a2.e = new dexz(cnnm.a(context));
        dyhi c = a2.c();
        String packageName = context.getPackageName();
        this.f = new clav();
        this.c = c;
        this.d = (cpys) cpys.b(new cpyr(), c);
        this.e = packageName;
    }

    @Override // defpackage.clau
    public final int a() {
        if (this.g == null) {
            return 0;
        }
        dyfk c = this.c.c(false);
        dyfk dyfkVar = dyfk.CONNECTING;
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        return ordinal != 1 ? 1 : 3;
    }

    @Override // defpackage.clau
    public final void b() {
        dyzk<cpyv> dyzkVar = this.g;
        if (dyzkVar != null) {
            dyzkVar.b();
            this.g = null;
        }
    }

    @Override // defpackage.clau
    public final boolean c() {
        return a() == 3;
    }

    @Override // defpackage.clau
    public final void d(cpzy cpzyVar) {
        dyzk<cpyv> dyzkVar = this.g;
        cpyu bZ = cpyv.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cpyv cpyvVar = (cpyv) bZ.b;
        cpzyVar.getClass();
        cpyvVar.c = cpzyVar;
        cpyvVar.a |= 2;
        dyzkVar.c(bZ.bK());
    }

    @Override // defpackage.clau
    public final void e() {
        cpys cpysVar = this.d;
        dyzk<cpyx> dyzkVar = this.f;
        dyeu dyeuVar = cpysVar.a;
        dyib<cpyv, cpyx> dyibVar = cpyt.a;
        if (dyibVar == null) {
            synchronized (cpyt.class) {
                dyibVar = cpyt.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.BIDI_STREAMING;
                    c.d = dyib.b("java.com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationService", "StartSession");
                    c.e = true;
                    c.a = dyyq.b(cpyv.d);
                    c.b = dyyq.b(cpyx.a);
                    dyibVar = c.a();
                    cpyt.a = dyibVar;
                }
            }
        }
        dyzk<cpyv> b2 = dyzf.b(dyeuVar.a(dyibVar, cpysVar.b), dyzkVar);
        this.g = b2;
        cpyu bZ = cpyv.d.bZ();
        String str = this.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cpyv cpyvVar = (cpyv) bZ.b;
        str.getClass();
        cpyvVar.a = 1 | cpyvVar.a;
        cpyvVar.b = str;
        b2.c(bZ.bK());
    }
}
