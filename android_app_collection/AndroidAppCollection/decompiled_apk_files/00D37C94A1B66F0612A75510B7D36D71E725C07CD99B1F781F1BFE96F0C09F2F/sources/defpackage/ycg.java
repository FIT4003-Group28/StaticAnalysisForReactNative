package defpackage;

import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ycg  reason: default package */
/* loaded from: classes4.dex */
public final class ycg implements aafl {
    public final ydq a;
    public final aafo b;
    private final yar c;

    public ycg(yar yarVar, ydq ydqVar, aafo aafoVar) {
        this.c = yarVar;
        this.a = ydqVar;
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint) apzgVar.qm(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.ypcFixInstrumentEndpoint);
        yar yarVar = this.c;
        byte[] I = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.f.I();
        byte[] I2 = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.g.I();
        yarVar.c.add(new ycf(this, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint));
        ylx.n(yarVar.a, ((abfh) yarVar.b.get()).c(), new yap(yarVar, I, I2), new yap(yarVar, I, I2, 1));
    }
}
