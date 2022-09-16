package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ahfp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahfp implements ayqb {
    public final /* synthetic */ ahfq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahfp(ahfq ahfqVar) {
        this.a = ahfqVar;
    }

    public /* synthetic */ ahfp(ahfq ahfqVar, int i) {
        this.b = i;
        this.a = ahfqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        acvg acvgVar;
        switch (this.b) {
            case 0:
                ahgg ahggVar = (ahgg) obj;
                this.a.e();
                return;
            case 1:
                ahfq ahfqVar = this.a;
                aesr aesrVar = (aesr) obj;
                FormatStreamModel f = aesrVar.f();
                if (f == null) {
                    f = aesrVar.e();
                }
                acvg acvgVar2 = (acvg) ahfqVar.b.a();
                if (f == null || acvgVar2 == null) {
                    return;
                }
                aopa createBuilder = asno.a.createBuilder();
                aopa createBuilder2 = asnq.a.createBuilder();
                int e = f.e();
                createBuilder2.copyOnWrite();
                asnq asnqVar = (asnq) createBuilder2.instance;
                asnqVar.b = 1 | asnqVar.b;
                asnqVar.c = e;
                createBuilder.copyOnWrite();
                asno asnoVar = (asno) createBuilder.instance;
                asnq asnqVar2 = (asnq) createBuilder2.mo39build();
                asnqVar2.getClass();
                asnoVar.v = asnqVar2;
                asnoVar.c = 262144 | asnoVar.c;
                acvgVar2.a((asno) createBuilder.mo39build());
                return;
            case 2:
                ahgl ahglVar = (ahgl) obj;
                this.a.c();
                return;
            case 3:
                ahfq ahfqVar2 = this.a;
                ahgp ahgpVar = (ahgp) obj;
                if (((acvg) ahfqVar2.b.a()) == null) {
                    return;
                }
                ahfqVar2.d(ahgpVar);
                return;
            case 4:
                ahfq ahfqVar3 = this.a;
                ahgv ahgvVar = (ahgv) obj;
                acvg acvgVar3 = (acvg) ahfqVar3.b.a();
                int e2 = (int) ahfqVar3.a.e();
                if (acvgVar3 == null || ahfqVar3.d) {
                    return;
                }
                ahfqVar3.d(ahgvVar);
                ahfqVar3.d = true;
                if (e2 <= 0) {
                    return;
                }
                aopa createBuilder3 = asno.a.createBuilder();
                aopa createBuilder4 = asnq.a.createBuilder();
                createBuilder4.copyOnWrite();
                asnq asnqVar3 = (asnq) createBuilder4.instance;
                asnqVar3.b |= 64;
                asnqVar3.e = e2;
                createBuilder3.copyOnWrite();
                asno asnoVar2 = (asno) createBuilder3.instance;
                asnq asnqVar4 = (asnq) createBuilder4.mo39build();
                asnqVar4.getClass();
                asnoVar2.v = asnqVar4;
                asnoVar2.c |= 262144;
                acvgVar3.a((asno) createBuilder3.mo39build());
                return;
            case 5:
                ahfq ahfqVar4 = this.a;
                ahgz ahgzVar = (ahgz) obj;
                if (ahfqVar4.b.a() == null) {
                    return;
                }
                ahfqVar4.d(ahgzVar);
                return;
            case 6:
                this.a.c = (ahhh) obj;
                return;
            case 7:
                ahhw ahhwVar = (ahhw) obj;
                acvg acvgVar4 = (acvg) this.a.b.a();
                String e3 = ahhwVar.e();
                PlayerResponseModel b = ahhwVar.b();
                if (ahhwVar.c() != aika.PLAYBACK_LOADED || acvgVar4 == null || e3 == null || b == null) {
                    return;
                }
                acvgVar4.c("gv");
                aopa createBuilder5 = asno.a.createBuilder();
                createBuilder5.copyOnWrite();
                asno asnoVar3 = (asno) createBuilder5.instance;
                asnoVar3.b |= 1024;
                asnoVar3.j = e3;
                if (!b.B().isEmpty()) {
                    String B = b.B();
                    createBuilder5.copyOnWrite();
                    asno asnoVar4 = (asno) createBuilder5.instance;
                    B.getClass();
                    asnoVar4.b |= 16777216;
                    asnoVar4.o = B;
                }
                acvgVar4.a((asno) createBuilder5.mo39build());
                return;
            case 8:
                ahfq ahfqVar5 = this.a;
                ahfqVar5.c();
                ahfqVar5.a.f();
                ajff a = ((ahic) obj).a();
                if (a != null) {
                    ahfqVar5.b = a.b();
                    return;
                } else {
                    ahfqVar5.b = ahfk.c;
                    return;
                }
            case 9:
                ahfq ahfqVar6 = this.a;
                ahic ahicVar = (ahic) obj;
                acvg a2 = ahfqVar6.a();
                if (a2 != null && !ahfqVar6.e) {
                    aopa createBuilder6 = asno.a.createBuilder();
                    String Z = ahicVar.a().Z();
                    createBuilder6.copyOnWrite();
                    asno asnoVar5 = (asno) createBuilder6.instance;
                    Z.getClass();
                    asnoVar5.b |= 8192;
                    asnoVar5.k = Z;
                    PlayerResponseModel c = ahicVar.a().c();
                    if (c != null) {
                        String B2 = c.B();
                        createBuilder6.copyOnWrite();
                        asno asnoVar6 = (asno) createBuilder6.instance;
                        B2.getClass();
                        asnoVar6.b |= 67108864;
                        asnoVar6.p = B2;
                    }
                    a2.a((asno) createBuilder6.mo39build());
                    ahfqVar6.e = true;
                }
                ajff a3 = ahicVar.a();
                ahhh ahhhVar = ahfqVar6.c;
                if (ahhhVar != null && TextUtils.equals(a3.Z(), ahhhVar.b()) && (acvgVar = (acvg) a3.b().a()) != null) {
                    acvgVar.f(ahhhVar.a());
                }
                ahfqVar6.c = null;
                return;
            default:
                ahfq ahfqVar7 = this.a;
                ymg ymgVar = (ymg) obj;
                acvg acvgVar5 = (acvg) ahfqVar7.b.a();
                if (acvgVar5 == null) {
                    return;
                }
                if (!(ymgVar instanceof ahgq) && !(ymgVar instanceof ahgw)) {
                    return;
                }
                acvgVar5.c(ymgVar.f());
                ahfqVar7.e();
                return;
        }
    }
}
