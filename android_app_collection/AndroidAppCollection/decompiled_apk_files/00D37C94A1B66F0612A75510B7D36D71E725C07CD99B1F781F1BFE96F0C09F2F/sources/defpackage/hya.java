package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hya  reason: default package */
/* loaded from: classes3.dex */
public final class hya implements aafl {
    private final yrj a;
    private final lmo b;
    private final igr c;

    public hya(yrj yrjVar, lmo lmoVar, igr igrVar) {
        this.a = yrjVar;
        this.b = lmoVar;
        this.c = igrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Optional empty;
        aqxo.p(apzgVar.qn(ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.showSfvElementsBottomSheetCommand));
        if (!this.a.o()) {
            this.b.b();
            return;
        }
        ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand = (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand) apzgVar.qm(ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.showSfvElementsBottomSheetCommand);
        if (this.c.I()) {
            this.c.z();
        }
        if (map != null) {
            empty = Optional.ofNullable((ajrs) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext"));
        } else {
            empty = Optional.empty();
        }
        igr igrVar = this.c;
        aunb aunbVar = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        arag aragVar = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        float f = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.d;
        float f2 = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.e;
        if (aunbVar == null || !aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
            afus.b(2, 24, "Creation bottom sheet without valid renderer");
        } else if (aragVar == null) {
            afus.b(2, 24, "Creation bottom sheet without valid title");
        } else {
            if (igrVar.i == 0) {
                igrVar.i = igrVar.d.b();
            }
            igrVar.D(f);
            igrVar.C(f2);
            igrVar.E(igrVar.f);
            igrVar.g = aragVar;
            igrVar.G();
            ajin ajinVar = igrVar.a;
            ajhh a = ajhh.a((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer));
            if (!empty.isPresent()) {
                empty = Optional.of(akel.e(igrVar.b.a()));
            }
            if (empty.isPresent() && ((ajrs) empty.get()).a == acti.l) {
                ((ajrs) empty.get()).a(igrVar.e.oi());
            }
            igrVar.b.oK((ajrs) empty.get(), a);
            igrVar.c.removeAllViews();
            igrVar.c.addView(igrVar.b.a());
        }
    }
}
