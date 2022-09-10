package defpackage;
/* compiled from: PG */
/* renamed from: bquv  reason: default package */
/* loaded from: classes4.dex */
public class bquv implements jbc {
    public Float a = Float.valueOf(0.0f);
    public final bquu b;
    public final gdf c;

    public bquv(bquu bquuVar, gdf gdfVar) {
        this.b = bquuVar;
        this.c = gdfVar;
    }

    @Override // defpackage.jbc
    public Float a() {
        return this.a;
    }

    @Override // defpackage.jbc
    @dzsi
    public jez b() {
        return new jez(this) { // from class: bqut
            private final bquv a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                bquv bquvVar = this.a;
                bquvVar.a = Float.valueOf(f);
                bquvVar.b.a((int) f);
                bquvVar.c.dismiss();
            }
        };
    }

    @Override // defpackage.jbc
    @dzsi
    public cjtd c() {
        return cjtd.a(dtyf.C);
    }
}
