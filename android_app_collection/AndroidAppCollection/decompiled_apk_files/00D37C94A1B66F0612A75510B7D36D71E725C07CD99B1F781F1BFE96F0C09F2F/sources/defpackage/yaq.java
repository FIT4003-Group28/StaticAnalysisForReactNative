package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
/* compiled from: PG */
/* renamed from: yaq  reason: default package */
/* loaded from: classes4.dex */
final class yaq implements yiu {
    final /* synthetic */ yar a;
    private final byte[] b;

    public yaq(yar yarVar, byte[] bArr) {
        this.a = yarVar;
        this.b = bArr;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        apzg apzgVar;
        apzg apzgVar2;
        if (i == 1900) {
            if (i2 == -1) {
                for (ycf ycfVar : this.a.c) {
                    ycfVar.b.a.b();
                    aafo aafoVar = ycfVar.b.b;
                    YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = ycfVar.a;
                    if (ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.b == 3) {
                        apzgVar2 = (apzg) ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.c;
                    } else {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar.c(apzgVar2, null);
                    this.a.b(this.b, 3);
                }
                this.a.c.clear();
            } else if (i2 == 0) {
                for (ycf ycfVar2 : this.a.c) {
                    ycfVar2.b.a.b();
                    this.a.b(this.b, 4);
                }
                this.a.c.clear();
            } else if (i2 == 1) {
                for (ycf ycfVar3 : this.a.c) {
                    aafo aafoVar2 = ycfVar3.b.b;
                    YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2 = ycfVar3.a;
                    if (ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2.d == 5) {
                        apzgVar = (apzg) ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2.e;
                    } else {
                        apzgVar = apzg.a;
                    }
                    aafoVar2.c(apzgVar, null);
                    this.a.b(this.b, 5);
                }
                this.a.c.clear();
            }
        }
    }
}
