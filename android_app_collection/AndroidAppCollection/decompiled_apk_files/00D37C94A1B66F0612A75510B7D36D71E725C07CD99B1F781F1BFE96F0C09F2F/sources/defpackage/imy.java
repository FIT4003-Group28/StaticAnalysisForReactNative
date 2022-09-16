package defpackage;

import com.google.protos.youtube.api.innertube.UpdateFlowCommandOuterClass$UpdateFlowCommand;
import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: imy  reason: default package */
/* loaded from: classes3.dex */
public final class imy implements aafl {
    private final imx a;
    private final aafo b;

    public imy(imx imxVar, aafo aafoVar) {
        this.a = imxVar;
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        UpdateFlowCommandOuterClass$UpdateFlowCommand updateFlowCommandOuterClass$UpdateFlowCommand = (UpdateFlowCommandOuterClass$UpdateFlowCommand) apzgVar.qm(UpdateFlowCommandOuterClass$UpdateFlowCommand.updateFlowCommand);
        imx imxVar = this.a;
        imv imvVar = (imv) imxVar.b.get(updateFlowCommandOuterClass$UpdateFlowCommand.c);
        if (imvVar == null) {
            return;
        }
        if (updateFlowCommandOuterClass$UpdateFlowCommand.d.size() > 0) {
            imv.b(imvVar.j, updateFlowCommandOuterClass$UpdateFlowCommand.d);
            imvVar.k.c(new Object());
        }
        if ((updateFlowCommandOuterClass$UpdateFlowCommand.b & 4) != 0) {
            apzg apzgVar2 = updateFlowCommandOuterClass$UpdateFlowCommand.f;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            imvVar.o = Optional.of(apzgVar2);
        }
        if ((updateFlowCommandOuterClass$UpdateFlowCommand.b & 2) == 0) {
            return;
        }
        aafo aafoVar = this.b;
        apzg apzgVar3 = updateFlowCommandOuterClass$UpdateFlowCommand.e;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        aafoVar.a(apzgVar3);
    }
}
