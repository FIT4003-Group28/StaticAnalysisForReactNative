package defpackage;

import com.google.protos.youtube.api.innertube.InAppUpdateCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eyr  reason: default package */
/* loaded from: classes3.dex */
public final class eyr implements aafl {
    private final azqb a;
    private final aacz b;

    public eyr(azqb azqbVar, aacz aaczVar) {
        this.a = azqbVar;
        this.b = aaczVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aveq aveqVar = this.b.b().u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        if (!aveqVar.k) {
            return;
        }
        ((eys) this.a.get()).j((arim) apzgVar.qm(InAppUpdateCommandOuterClass.inAppUpdateCommand));
    }
}
