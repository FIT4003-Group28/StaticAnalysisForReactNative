package defpackage;
/* compiled from: PG */
/* renamed from: hqc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hqc implements ayog {
    private final /* synthetic */ int f;
    public static final /* synthetic */ hqc e = new hqc(4);
    public static final /* synthetic */ hqc d = new hqc(3);
    public static final /* synthetic */ hqc c = new hqc(2);
    public static final /* synthetic */ hqc b = new hqc(1);
    public static final /* synthetic */ hqc a = new hqc();

    private /* synthetic */ hqc() {
    }

    private /* synthetic */ hqc(int i) {
        this.f = i;
    }

    @Override // defpackage.ayog
    public final ayof a(ayoc ayocVar) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                return ayocVar.w(gam.n).D(gam.o);
            }
            if (i == 2) {
                return ayocVar.w(inl.f).D(inl.g);
            }
            if (i == 3) {
                return ayocVar.A(ikb.o);
            }
            return ayocVar.r(noc.u).w(yps.h);
        }
        return ayocVar.A(ikb.b);
    }
}
