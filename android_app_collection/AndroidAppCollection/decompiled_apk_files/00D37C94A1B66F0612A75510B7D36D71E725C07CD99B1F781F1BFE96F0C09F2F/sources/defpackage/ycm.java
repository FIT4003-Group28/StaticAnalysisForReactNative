package defpackage;

import com.google.protos.youtube.api.innertube.YpcUpdateFopEndpoint$YPCUpdateFopEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ycm  reason: default package */
/* loaded from: classes4.dex */
public final class ycm implements aafl, afzf {
    private final aafo a;
    private final abek b;
    private final yzj c;

    public ycm(aafo aafoVar, abek abekVar, yzj yzjVar) {
        this.b = abekVar;
        this.a = aafoVar;
        this.c = yzjVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        abek abekVar = this.b;
        abej abejVar = new abej(abekVar.e, abekVar.a.c());
        abejVar.a = ((YpcUpdateFopEndpoint$YPCUpdateFopEndpoint) apzgVar.qm(YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.ypcUpdateFopEndpoint)).b;
        abejVar.j(apzgVar.c);
        this.b.b.e(abejVar, this);
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        yzj yzjVar = this.c;
        yzjVar.d(yzjVar.b(cffVar));
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        apzg apzgVar;
        arth arthVar = (arth) obj;
        int i = arthVar.b;
        if (i == 3) {
            apzgVar = (apzg) arthVar.c;
        } else {
            apzgVar = i == 4 ? (apzg) arthVar.c : null;
        }
        if (apzgVar != null) {
            this.a.c(apzgVar, null);
        }
    }
}
