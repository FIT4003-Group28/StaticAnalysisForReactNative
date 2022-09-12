package defpackage;
/* compiled from: PG */
/* renamed from: yor  reason: default package */
/* loaded from: classes7.dex */
public class yor extends yob implements ynl {
    public final yow d;
    private final yiw e;

    public yor(cqhn cqhnVar, cqhu cqhuVar, vwv vwvVar, douz douzVar, yiu yiuVar, yiw yiwVar) {
        final boolean z = true;
        final boolean z2 = !vwvVar.e && ((douzVar.a & 1) == 0 || douzVar.c);
        z = (!vwvVar.l || !douzVar.e) ? false : z;
        this.e = yiwVar;
        dcep B = dcbg.c(zeg.values()).o(new dbsl(z) { // from class: yoo
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((zeg) obj) != zeg.LOWEST_COST || this.a;
            }
        }).o(new dbsl(z2) { // from class: yop
            private final boolean a;

            {
                this.a = z2;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((zeg) obj) != zeg.PREFER_ACCESSIBLE || this.a;
            }
        }).B();
        dqvb b = dqvb.b(yiuVar.b);
        this.d = new yow(B, b == null ? dqvb.TRANSIT_BEST : b, new yov(this) { // from class: yoq
            private final yor a;

            {
                this.a = this;
            }

            @Override // defpackage.yov
            public final void a() {
                cqkx.p(this.a.d);
            }
        });
    }

    @Override // defpackage.ynl
    /* renamed from: b */
    public yow a() {
        return this.d;
    }

    public yiu c() {
        yit bZ = yiu.c.bZ();
        dqvb k = this.d.k();
        if (k != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            yiu yiuVar = (yiu) bZ.b;
            yiuVar.b = k.f;
            yiuVar.a |= 1;
        }
        return bZ.bK();
    }

    @Override // defpackage.yni
    public cqkl e() {
        this.e.a(null);
        return cqkl.a;
    }

    @Override // defpackage.yni
    public cqkl f() {
        yiw yiwVar = this.e;
        yim bZ = yiv.e.bZ();
        yiu c = c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar = (yiv) bZ.b;
        c.getClass();
        yivVar.c = c;
        yivVar.a |= 2;
        yiwVar.a(bZ.bK());
        return cqkl.a;
    }
}
