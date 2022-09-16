package defpackage;

import com.google.protos.youtube.api.innertube.ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hyf  reason: default package */
/* loaded from: classes3.dex */
public final class hyf implements aafl {
    private final yrj a;
    private final lmo b;
    private final igq c;

    public hyf(yrj yrjVar, lmo lmoVar, igq igqVar) {
        this.a = yrjVar;
        this.b = lmoVar;
        this.c = igqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, ajsa] */
    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqxo.p(apzgVar.qn(ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.showBrowseElementsBottomSheetCommand));
        if (!this.a.o()) {
            this.b.b();
            return;
        }
        ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand = (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand) apzgVar.qm(ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.showBrowseElementsBottomSheetCommand);
        if (this.c.I()) {
            this.c.z();
        }
        igq igqVar = this.c;
        apzg apzgVar2 = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.b;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        apzg apzgVar3 = apzgVar2;
        arag aragVar = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        float f = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.d;
        float f2 = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.e;
        if (apzgVar3 == null) {
            afus.b(2, 24, "ReelBrowseElementsBottomSheet without valid command");
        } else if (aragVar == null) {
            afus.b(2, 24, "ReelBrowseElementsBottomSheet without valid title");
        } else {
            igqVar.D(f);
            igqVar.C(f2);
            igqVar.E(false);
            igqVar.o = aragVar;
            igqVar.G();
            final hqj hqjVar = igqVar.b;
            final igp igpVar = new igp(igqVar);
            final igp igpVar2 = new igp(igqVar, 1);
            azpx aO = azpq.e().aO();
            aypg as = aO.af(new ayqe() { // from class: hqe
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    ampr amprVar = (ampr) obj;
                    eyy a = hqj.this.f.a((aatf) amprVar.a);
                    return ayoi.U(a.b.h(hqc.a).h(new inx(a.a, 1)).w(new hqf(amprVar, 1)).h(hqc.b).O(), a.a.E(new hqf(amprVar)).m(iod.b).k()).aB(gam.m);
                }
            }).as(new ayqb() { // from class: hqd
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    Consumer consumer = Consumer.this;
                    Consumer consumer2 = igpVar2;
                    hqi hqiVar = (hqi) obj;
                    hqiVar.a.ifPresent(consumer);
                    hqiVar.b.ifPresent(consumer2);
                }
            });
            aO.c(ite.p(hqjVar.a.e(), apzgVar3, false, hqjVar.b, hqjVar.g, hqjVar.d, hqjVar.e, hqjVar.c));
            igqVar.d = as;
            if (!igqVar.c.isPresent()) {
                igqVar.c = Optional.of(igqVar.k.a(null, igqVar.m, igqVar.e, igqVar.l, igqVar.j.a(igqVar.l, igqVar.h.oi()), igqVar.h.oi(), igqVar.i.get(), akai.Ws, ajzs.d, ajkb.OTHERS, igqVar.n, igqVar.g));
                ((ajzq) igqVar.c.get()).c();
            }
            ((ajzq) igqVar.c.get()).h();
            ((ajzq) igqVar.c.get()).O();
            igqVar.a.addView(igqVar.e);
        }
    }
}
