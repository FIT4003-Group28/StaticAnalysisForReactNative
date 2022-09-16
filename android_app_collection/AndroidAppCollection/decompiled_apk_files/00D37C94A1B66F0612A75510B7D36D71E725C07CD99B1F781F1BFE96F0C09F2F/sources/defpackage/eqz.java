package defpackage;

import com.google.protos.youtube.api.innertube.PlayerToastCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqz  reason: default package */
/* loaded from: classes3.dex */
public final class eqz implements aafl {
    private final ffs a;

    public eqz(ffs ffsVar) {
        this.a = ffsVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aubz aubzVar = (aubz) apzgVar.qm(PlayerToastCommandOuterClass.playerToastCommand);
        ffs ffsVar = this.a;
        arag aragVar = aubzVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        ffsVar.nB(new ffr(ajgl.b(aragVar), aubzVar.c));
    }
}
