package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atb  reason: default package */
/* loaded from: classes2.dex */
public final class atb implements atd {
    final /* synthetic */ String a;
    final /* synthetic */ adxw b;
    final /* synthetic */ Executor c;
    final /* synthetic */ aepf d;
    final /* synthetic */ atts e;
    final /* synthetic */ axxm f;
    final /* synthetic */ aadd g;
    final /* synthetic */ String h;
    final /* synthetic */ aeju i;
    final /* synthetic */ adzo j;
    final /* synthetic */ aehz k;

    public atb() {
        new ath();
    }

    @Override // defpackage.asu
    /* renamed from: b */
    public final ati a() {
        String str;
        aejv a;
        ati c = adyf.c(this.a, this.b, this.c, this.d, this.e, this.f);
        arhd a2 = this.g.a();
        if (a2 != null) {
            atdy atdyVar = a2.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            if (attvVar == null) {
                attvVar = attv.a;
            }
            attt atttVar = attvVar.g;
            if (atttVar == null) {
                atttVar = attt.b;
            }
            if (atttVar.i && (str = this.h) != null && (a = this.i.a(str)) != null) {
                c = this.j.a(c, a);
            }
        }
        return this.k.a(c);
    }

    public atb(String str, adxw adxwVar, Executor executor, aepf aepfVar, atts attsVar, axxm axxmVar, aadd aaddVar, String str2, aeju aejuVar, adzo adzoVar, aehz aehzVar) {
        this.a = str;
        this.b = adxwVar;
        this.c = executor;
        this.d = aepfVar;
        this.e = attsVar;
        this.f = axxmVar;
        this.g = aaddVar;
        this.h = str2;
        this.i = aejuVar;
        this.j = adzoVar;
        this.k = aehzVar;
        new ath();
    }
}
