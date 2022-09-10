package defpackage;
/* compiled from: PG */
/* renamed from: bbie  reason: default package */
/* loaded from: classes3.dex */
public class bbie implements jbc, bbhl {
    public final dxio<bqji> a;
    public final bwrs<ilo> b;
    public final bbhm c;
    public final gga d;
    public float e = 0.0f;

    public bbie(dxio<bqji> dxioVar, gga ggaVar, bwrs<ilo> bwrsVar, bbhm bbhmVar) {
        this.a = dxioVar;
        this.d = ggaVar;
        this.b = bwrsVar;
        this.c = bbhmVar;
    }

    @Override // defpackage.jbc
    public Float a() {
        return Float.valueOf(this.e);
    }

    @Override // defpackage.jbc
    @dzsi
    public jez b() {
        return new jez(this) { // from class: bbic
            private final bbie a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                bbie bbieVar = this.a;
                bbieVar.e = f;
                bqku c = bqla.c();
                bqkw k = bqkx.k();
                ilo c2 = bbieVar.b.c();
                dbsk.s(c2);
                k.c(c2.ai());
                k.f((int) f);
                k.e("");
                c.b(k.h());
                bbieVar.a.a().c(c.d(), bbieVar.b, new bbid(bbieVar));
                bbieVar.c.c(bbhn.PLACE_RATED, null);
            }
        };
    }

    @Override // defpackage.jbc
    @dzsi
    public cjtd c() {
        return cjtd.a(dtxo.bd);
    }

    @Override // defpackage.bbhl
    public cqix<jbc> d() {
        return cqgr.fT(new bbhk(), this);
    }
}
