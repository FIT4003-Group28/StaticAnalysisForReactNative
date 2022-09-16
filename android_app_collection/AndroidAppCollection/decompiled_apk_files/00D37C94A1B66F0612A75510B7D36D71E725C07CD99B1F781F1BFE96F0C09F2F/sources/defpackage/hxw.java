package defpackage;

import com.google.protos.youtube.api.innertube.DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hxw  reason: default package */
/* loaded from: classes3.dex */
public final class hxw implements aafl {
    private final igr a;

    public hxw(igr igrVar) {
        this.a = igrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Optional empty;
        aqxo.p(apzgVar.qn(DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.dismissSfvElementsBottomSheetCommand));
        DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand = (DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand) apzgVar.qm(DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.dismissSfvElementsBottomSheetCommand);
        igr igrVar = this.a;
        if ((dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.b & 2) != 0) {
            apzg apzgVar2 = dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            empty = Optional.of(apzgVar2);
        } else {
            empty = Optional.empty();
        }
        igrVar.h = empty;
        igrVar.z();
    }
}
