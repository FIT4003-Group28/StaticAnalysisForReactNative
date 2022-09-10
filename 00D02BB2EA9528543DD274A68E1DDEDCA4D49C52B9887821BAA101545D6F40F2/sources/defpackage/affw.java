package defpackage;

import android.content.Intent;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: affw  reason: default package */
/* loaded from: classes.dex */
public final class affw {
    public static final cjtd e = cjtd.b;
    public static final cjtd f = cjtd.a(dtxo.cP);
    public final eeu a;
    public final dxio<bvkx> b;
    @dzsi
    public afhx c;
    @dzsi
    public cjtd d;
    private final btvo g;
    private final cjqy h;
    private final cjqq i;
    private final dxio<afgx> j;
    private final affz k;

    public affw(eeu eeuVar, btvo btvoVar, cjqy cjqyVar, cjqq cjqqVar, affz affzVar, dxio<afgx> dxioVar, dxio<bvkx> dxioVar2) {
        this.a = eeuVar;
        this.g = btvoVar;
        this.h = cjqyVar;
        this.i = cjqqVar;
        this.j = dxioVar;
        this.k = affzVar;
        this.b = dxioVar2;
    }

    public static void a(Intent intent, gga ggaVar, Runnable runnable) {
        if (b(intent)) {
            runnable.run();
        } else {
            ggaVar.B(runnable);
        }
    }

    public static boolean b(Intent intent) {
        return intent.getBooleanExtra("extra_is_launched_from_inbox_key", false);
    }

    public static boolean e(Intent intent) {
        return intent != null && !"android.intent.action.MAIN".equals(intent.getAction());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final afhx c(Intent intent, @dzsi String str) {
        afhy c;
        if ((intent.getFlags() & ImageMetadata.SHADING_MODE) != 0 || ("android.intent.action.MAIN".equals(intent.getAction()) && !btbb.d(intent))) {
            return null;
        }
        dbsg<afid> d = d(intent);
        if (d.a() && (c = this.j.a().c(d.b())) != null) {
            c.getClass();
            return c.a(intent, str);
        }
        return null;
    }

    public final dbsg<afid> d(Intent intent) {
        final afga a = this.k.a(intent);
        final afgx a2 = this.j.a();
        return dcbg.b(a2.a()).r(new dbsl(a2, a) { // from class: affu
            private final afgx a;
            private final afga b;

            {
                this.a = a2;
                this.b = a;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                afgx afgxVar = this.a;
                final afga afgaVar = this.b;
                cjtd cjtdVar = affw.e;
                return ((Boolean) dbsg.j(afgxVar.b((afid) obj)).h(new dbrn(afgaVar) { // from class: affv
                    private final afga a;

                    {
                        this.a = afgaVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        afga afgaVar2 = this.a;
                        cjtd cjtdVar2 = affw.e;
                        return Boolean.valueOf(((dbsl) obj2).a(afgaVar2));
                    }
                }).c(false)).booleanValue();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final afhx f() {
        String str;
        afhx afhxVar = this.c;
        this.c = null;
        cjtd cjtdVar = this.d;
        this.d = null;
        if (cjtdVar != null) {
            if (!cjtdVar.equals(e)) {
                if (this.g.getLoggingParameters().l) {
                    cjsa cjsaVar = cjtdVar.m;
                    ddho ddhoVar = cjtdVar.g;
                    if (cjsaVar != null) {
                        this.i.b(cjsaVar);
                    } else if (ddhoVar != null) {
                        this.i.b(new cjsd(this.h.r(new cjsv(ddhoVar)), cjtdVar.e, cjtdVar.d));
                    } else {
                        this.i.b(null);
                    }
                }
                if (afhxVar != null && afhxVar.c() != null && afhxVar.g()) {
                    if (afhxVar.f.getDataString() != null) {
                        str = afhxVar.f.getDataString();
                        dbsk.s(str);
                    } else {
                        str = "";
                    }
                    cjqy cjqyVar = this.h;
                    ddjr k = afhxVar.k();
                    durz c = afhxVar.c();
                    dbsk.s(c);
                    cjqyVar.s(str, k, c, dukj.EXTERNAL_INVOCATION_COMPLETED, afhxVar.g, false);
                }
            } else {
                this.i.b(null);
                this.h.s("", null, durz.EIT_MAIN, dukj.EXTERNAL_INVOCATION_COMPLETED, "", false);
            }
        }
        return afhxVar;
    }
}
