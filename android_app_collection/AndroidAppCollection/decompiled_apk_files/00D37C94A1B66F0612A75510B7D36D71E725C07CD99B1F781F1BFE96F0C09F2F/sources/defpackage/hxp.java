package defpackage;

import com.google.protos.youtube.api.innertube.DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hxp  reason: default package */
/* loaded from: classes3.dex */
public final class hxp implements aafl {
    private final igq a;

    public hxp(igq igqVar) {
        this.a = igqVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Optional empty;
        aqxo.p(apzgVar.qn(DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.dismissBrowseElementsBottomSheetCommand));
        DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand = (DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand) apzgVar.qm(DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.dismissBrowseElementsBottomSheetCommand);
        igq igqVar = this.a;
        if ((dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.b & 1) != 0) {
            apzg apzgVar2 = dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            empty = Optional.of(apzgVar2);
        } else {
            empty = Optional.empty();
        }
        igqVar.f = empty;
        igqVar.d.qr();
        igqVar.z();
    }
}
