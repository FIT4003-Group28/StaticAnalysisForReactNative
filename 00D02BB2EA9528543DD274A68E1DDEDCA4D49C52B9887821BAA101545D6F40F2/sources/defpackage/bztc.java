package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bztc  reason: default package */
/* loaded from: classes4.dex */
public final class bztc {
    private static final dcqe a = dcqe.c("bztc");
    private final bzwh<bztb> b;
    private boolean c = false;
    private dbsg<akqi> d = dbpy.a;
    private dcdc<Uri> e = dcdc.e();

    public bztc(bzwg bzwgVar) {
        this.b = bzwgVar.a("photo_taken_notification_state", bztb.class);
    }

    private final void c() {
        this.d = dbpy.a;
        this.e = dcdc.e();
        this.c = true;
    }

    public final synchronized void a() {
        c();
    }

    public final synchronized void b() {
        if (!this.c) {
            if (bvrj.UI_THREAD.b()) {
                bvoo.h("Loading state should never be called on the UI thread.", new Object[0]);
            }
            bztb a2 = this.b.a();
            if (a2 != null) {
                this.d = dbsg.i(a2.a());
                this.e = dcdc.q(dcft.o(a2.b(), new bzta()));
            } else {
                c();
            }
            this.c = true;
        }
        if (!this.d.a() || this.e.isEmpty()) {
            bzwh<bztb> bzwhVar = this.b;
            bzwhVar.a.b(bzwhVar.d());
            bzwhVar.a.b(bzwhVar.c());
            return;
        }
        this.b.b(new bzrx(this.d.b(), dcbg.b(this.e).s(dbrr.a).z()));
    }
}
