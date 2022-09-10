package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: arpw  reason: default package */
/* loaded from: classes.dex */
public final class arpw extends afhx implements Runnable {
    private final gga c;
    private final dxio<ascb> d;
    @dzsi
    private final dpjs e;
    private final cjqy i;
    private final cjqq j;
    private static final dcqe b = dcqe.c("arpw");
    public static final dbsl<afga> a = arpv.a;

    public arpw(Intent intent, @dzsi String str, gga ggaVar, dxio<ascb> dxioVar, cjqy cjqyVar, cjqq cjqqVar) {
        super(intent, str, afid.LAUNCHER_SHORTCUT);
        this.c = ggaVar;
        this.d = dxioVar;
        Bundle extras = intent.getExtras();
        dpjs dpjsVar = null;
        if (extras != null) {
            if (extras.getBoolean("extra_destination_home_key", false)) {
                dpjsVar = dpjs.ENTITY_TYPE_HOME;
            } else if (extras.getBoolean("extra_destination_work_key", false)) {
                dpjsVar = dpjs.ENTITY_TYPE_WORK;
            }
        }
        this.e = dpjsVar;
        this.i = cjqyVar;
        this.j = cjqqVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        dpjs dpjsVar = this.e;
        if (dpjsVar != null) {
            if (dpjsVar == dpjs.ENTITY_TYPE_HOME) {
                cjtd a2 = cjtd.a(dtxu.k);
                this.i.j(this.j.g().d(a2), a2);
            } else if (this.e == dpjs.ENTITY_TYPE_WORK) {
                cjtd a3 = cjtd.a(dtxu.l);
                this.i.j(this.j.g().d(a3), a3);
            } else {
                bvoo.h("No logging implemented for launcher shortcut intents with entityType: %s this may indicate a user-facing bug.", this.e);
            }
            this.c.B(this);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_LAUNCHER_SHORTCUT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qcw x = qcx.x();
        x.k(qbs.NAVIGATION);
        x.r(amvh.i(this.c));
        amvg amvgVar = new amvg();
        dpjs dpjsVar = this.e;
        dbsk.s(dpjsVar);
        amvgVar.a = dpjsVar;
        x.u(amvgVar.a());
        this.d.a().d(x.a(), asca.LAUNCHER_SHORTCUT);
    }
}
