package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cwjv  reason: default package */
/* loaded from: classes.dex */
public final class cwjv<T> extends cwjw<T> {
    private final cnjz a;
    private final cnjz b;
    private final String c;
    private final cwfn d;

    public cwjv(cwfn cwfnVar, Context context) {
        cnjz cnjzVar = new cnjz(context, "ONEGOOGLE_MOBILE", null);
        cnjz a = cnjz.a(context, "ONEGOOGLE_MOBILE");
        this.a = cnjzVar;
        this.b = a;
        this.d = cwfnVar;
        this.c = context.getApplicationContext().getPackageName();
    }

    private final void c(int i, T t, dtgb dtgbVar) {
        cnjv d;
        CharSequence b;
        int a = dtgk.a(dtgbVar.b);
        int i2 = 1;
        dbsk.a((a == 0 || a == 1) ? false : true);
        dtgh b2 = dtgh.b(dtgbVar.c);
        if (b2 == null) {
            b2 = dtgh.UNKNOWN_COMPONENT;
        }
        dbsk.a(b2 != dtgh.UNKNOWN_COMPONENT);
        int a2 = dtgf.a(dtgbVar.e);
        dbsk.a((a2 == 0 || a2 == 1) ? false : true);
        dtgc bZ = dtgd.c.bZ();
        dsqp dsqpVar = (dsqp) dtgbVar.cu(5);
        dsqpVar.bC(dtgbVar);
        dtga dtgaVar = (dtga) dsqpVar;
        String str = this.c;
        if (dtgaVar.c) {
            dtgaVar.bF();
            dtgaVar.c = false;
        }
        dtgb dtgbVar2 = (dtgb) dtgaVar.b;
        str.getClass();
        dtgbVar2.a |= 64;
        dtgbVar2.f = str;
        dtgb bK = dtgaVar.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtgd dtgdVar = (dtgd) bZ.b;
        bK.getClass();
        dtgdVar.b = bK;
        dtgdVar.a |= 1;
        dtgd bK2 = bZ.bK();
        int i3 = i - 1;
        if (i3 == 0) {
            d = this.a.d(bK2.bS());
            b = ((cwfm) t).b();
            d.f(String.valueOf(b));
        } else if (i3 != 1) {
            d = this.b.d(bK2.bS());
        } else {
            d = this.a.d(bK2.bS());
        }
        int a3 = dtgk.a(dtgbVar.b);
        if (a3 != 0) {
            i2 = a3;
        }
        d.d(i2 - 1);
        d.a();
    }

    @Override // defpackage.cwjw, defpackage.cwjx
    public final void a(T t, dtgb dtgbVar) {
        csfs b;
        String b2;
        if (t != null) {
            cwfn.f(t);
            b2 = ((cwfm) t).b();
            b = csfs.a(b2);
        } else {
            b = csfs.b();
        }
        int i = b.b;
        if (i == 4) {
            return;
        }
        if (i == 1) {
            if (t != null) {
                cwfn.f(t);
            } else {
                i = 2;
            }
        }
        c(i, t, dtgbVar);
    }

    @Override // defpackage.cwjx
    public final void b(dtgb dtgbVar) {
        c(3, null, dtgbVar);
    }
}
