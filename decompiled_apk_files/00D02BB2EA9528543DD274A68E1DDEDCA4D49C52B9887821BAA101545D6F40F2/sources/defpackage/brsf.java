package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: brsf  reason: default package */
/* loaded from: classes4.dex */
public final class brsf extends cqiw<bruv> {
    public static final /* synthetic */ int b = 0;
    public final boolean a;

    public brsf(boolean z) {
        super(Boolean.valueOf(z));
        this.a = z;
    }

    private final cqmp<bruv> e() {
        return cqjv.v(B().a()).booleanValue() ? cqmp.e : new bmoj(ckgo.h);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bruv bruvVar, Context context, cqiv cqivVar) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        for (brvb brvbVar : bruvVar.a()) {
            int i2 = ((z && brvbVar.e().booleanValue()) || (z && z2) || z3) ? 0 : 6;
            boolean booleanValue = brvbVar.m().booleanValue();
            cqivVar.a(new brse(this, new Object[]{context, Integer.valueOf(i2), Boolean.valueOf(booleanValue)}, booleanValue, i2), brvbVar);
            z3 &= booleanValue;
            z = brvbVar.e().booleanValue();
            z2 = brvbVar.p().booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bruv> a() {
        if (this.a) {
            return cqgr.ga(iue.b(B().b()), cqgr.ep(false), cqgr.L(false), e(), jgi.d(cqgr.cY(brsd.a), cqgr.ck(C())));
        }
        return jga.a(iue.b(B().b()), e(), cqgr.ck(C()));
    }
}
