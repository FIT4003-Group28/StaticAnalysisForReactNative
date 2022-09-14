package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: asuh  reason: default package */
/* loaded from: classes2.dex */
public class asuh extends ivw implements asuv {
    public boolean c;
    private final crzp<aufb> d;
    private final Context e;
    private final atcu f;
    private final btrm g;
    private final Executor h;
    private final aufc i;
    private final ckcw j;
    private final BroadcastReceiver k;
    private boolean l;
    private boolean m;
    private boolean n;
    private final Context o;
    private final AtomicReference<asug> p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public asuh(android.content.Context r13, defpackage.btrm r14, defpackage.atcu r15, java.util.concurrent.Executor r16, defpackage.aufc r17, defpackage.ckcw r18, defpackage.asbr r19) {
        /*
            r12 = this;
            r10 = r12
            r11 = r13
            ivu r2 = defpackage.ivu.FIXED
            jaq r3 = defpackage.jaq.NO_TINT_ON_WHITE_WITH_GREY_SHADOW
            boolean r0 = O(r13)
            if (r0 == 0) goto L18
            r0 = 2131886567(0x7f1201e7, float:1.9407716E38)
            cqss r1 = defpackage.ibl.s()
            cqtd r0 = defpackage.iup.c(r0, r1)
            goto L23
        L18:
            r0 = 2131886568(0x7f1201e8, float:1.9407719E38)
            cqss r1 = defpackage.ibl.s()
            cqtd r0 = defpackage.iup.c(r0, r1)
        L23:
            r4 = r0
            r0 = 2131955162(0x7f130dda, float:1.9546844E38)
            java.lang.String r5 = r13.getString(r0)
            ddho r0 = defpackage.dtxw.bH
            cjtd r6 = defpackage.cjtd.a(r0)
            boolean r0 = O(r13)
            if (r0 == 0) goto L3a
            ivv r0 = defpackage.ivv.MEDIUM
            goto L3c
        L3a:
            ivv r0 = defpackage.ivv.FULL
        L3c:
            r9 = r0
            r7 = 1
            r8 = 2131428321(0x7f0b03e1, float:1.8478283E38)
            r0 = r12
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            asue r0 = new asue
            r0.<init>(r12)
            r10.d = r0
            r0 = 1
            r10.l = r0
            r1 = 0
            r10.m = r1
            r10.c = r0
            r10.n = r1
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            asug r1 = defpackage.asug.UNREGISTERED
            r0.<init>(r1)
            r10.p = r0
            r10.o = r11
            r0 = r14
            r10.g = r0
            r0 = r15
            r10.f = r0
            r0 = r16
            r10.h = r0
            r0 = r17
            r10.i = r0
            r0 = r18
            r10.j = r0
            r0 = r19
            boolean r0 = r0.b
            r10.m = r0
            android.content.Context r0 = r13.getApplicationContext()
            r10.e = r0
            asuf r1 = new asuf
            r1.<init>(r12)
            r10.k = r1
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r1.onReceive(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asuh.<init>(android.content.Context, btrm, atcu, java.util.concurrent.Executor, aufc, ckcw, asbr):void");
    }

    private static boolean O(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp <= 360;
    }

    public void N() {
        K(O(this.o) ? ivv.MEDIUM : ivv.FULL);
    }

    @Override // defpackage.ivw
    protected final boolean NE() {
        return false;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Float NG() {
        return Float.valueOf(this.l ? super.NG().floatValue() : 0.25f);
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        if (this.c) {
            this.f.g(this.m);
        }
        return cqkl.a;
    }

    public void g(boolean z) {
        if (this.n != z) {
            this.n = z;
            h();
        }
    }

    public final void h() {
        jaq jaqVar;
        if (this.i.b()) {
            jaqVar = jaq.MOD_GREY_ON_NIGHTBLACK_WITH_WHITE_SHADOW;
        } else if (this.n) {
            jaqVar = jaq.MOD_GREY_ON_DARK_GREY_WITH_WHITE_SHADOW;
        } else {
            jaqVar = jaq.NO_TINT_ON_WHITE_WITH_GREY_SHADOW;
        }
        D(jaqVar);
        cqkx.p(this);
    }

    public void i() {
        try {
            if (this.p.compareAndSet(asug.UNREGISTERED, asug.REGISTERED)) {
                btrm btrmVar = this.g;
                dceq a = dcet.a();
                a.b(asbt.class, new asui(asbt.class, this));
                btrmVar.g(this, a.a());
                this.i.i().a(this.d, this.h);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                this.e.registerReceiver(this.k, intentFilter, null, null);
            }
        } catch (IllegalArgumentException | SecurityException e) {
            ((ckco) this.j.a(ckhi.aH)).a(0);
            bvoo.f(e);
        }
        h();
    }

    public void j() {
        try {
            if (!this.p.compareAndSet(asug.REGISTERED, asug.UNREGISTERED)) {
                return;
            }
            this.g.a(this);
            this.i.i().c(this.d);
            this.e.unregisterReceiver(this.k);
        } catch (IllegalArgumentException e) {
            ((ckco) this.j.a(ckhi.aH)).a(1);
            bvoo.f(e);
        }
    }

    public final void k() {
        boolean z = false;
        if (!this.m && this.c) {
            z = true;
        }
        if (this.l != z) {
            this.l = z;
            cqkx.p(this);
        }
    }

    public void l(asbt asbtVar) {
        if (asbtVar.a() != this.m) {
            boolean a = asbtVar.a();
            this.m = a;
            if (a) {
                ((ckcn) this.j.a(ckhi.aG)).a();
            }
            k();
        }
    }
}
