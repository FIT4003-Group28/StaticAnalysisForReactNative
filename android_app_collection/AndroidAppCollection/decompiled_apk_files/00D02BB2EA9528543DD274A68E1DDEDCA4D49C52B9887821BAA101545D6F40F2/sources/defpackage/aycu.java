package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aycu  reason: default package */
/* loaded from: classes3.dex */
public final class aycu extends cqiw<aydl> {
    public static final cqrp a;
    public static final cqrp b;
    public static final cqtv c;
    public static final cqtv d;
    public final boolean e;
    private final cqrp f;
    private final cqtv g;
    private final cqtv h;

    static {
        cqrp d2 = cqrp.d(32.0d);
        a = d2;
        cqrp f = cqrp.f(18.0d);
        b = f;
        cqrp cqrpVar = ayct.a;
        Float valueOf = Float.valueOf(2.0f);
        c = cqsg.d(d2, cqsg.f(cqrpVar, valueOf));
        d = cqsg.d(f, cqsg.f(ayct.a, valueOf));
    }

    public aycu() {
        this(false);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aydl aydlVar, Context context, cqiv cqivVar) {
        aydl aydlVar2 = aydlVar;
        cqivVar.f(new ayct(this.f, this.g, this.h), aydlVar2.e());
        if (aydlVar2.f().booleanValue()) {
            cqivVar.a(new aycq(this.e, this.g, this.h), aydlVar2.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aydl> a() {
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(this.h), cqgr.ck(C()), cqqx.G(), cqgr.aX(ayco.a), cqgr.fD(aycm.a), cqgr.az(false), cqgr.dF(cqsg.f(this.g, Float.valueOf(-1.0f))), cqgr.P(false)};
        cqmh cqmhVar = new cqmh(aydd.class, new cqmp[0]);
        cqmhVar.f(cqmpVarArr);
        return cqgr.fY(cqgr.cg(new cqlc(this) { // from class: aycn
            private final aycu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                aydl aydlVar = (aydl) cqkpVar;
                return Integer.valueOf(true != this.a.e ? -2 : -1);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bp(-2), cqmhVar);
    }

    public aycu(boolean z) {
        super(Boolean.valueOf(z));
        this.e = z;
        cqrp cqrpVar = z ? b : a;
        this.f = cqrpVar;
        this.g = cqsg.g(cqsg.f(cqrpVar, Float.valueOf(-0.125f)), cqsg.f(ayct.a, Float.valueOf(2.0f)));
        this.h = z ? d : c;
    }
}
