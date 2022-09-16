package defpackage;

import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dcj  reason: default package */
/* loaded from: classes3.dex */
public final class dcj implements YogaMeasureFunction {
    /* JADX WARN: Type inference failed for: r2v0, types: [cyz, java.lang.Object, dbk] */
    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(dna dnaVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int C;
        int i;
        float f3;
        float f4;
        int i2;
        ?? p = dnaVar.p();
        cyr W = p.W();
        cyv cyvVar = W.q;
        if (cyvVar == null || !cyvVar.k()) {
            czz czzVar = (czz) p;
            cyr cyrVar = null;
            dae daeVar = czzVar.d ? czzVar.c : null;
            int z = czu.z(f, yogaMeasureMode);
            int z2 = czu.z(f2, yogaMeasureMode2);
            czzVar.e = z;
            czzVar.f = z2;
            cyv cyvVar2 = czzVar.a;
            if (cyr.A(cyvVar2, W) || p.aM()) {
                cyr V = p.V();
                if (W != V) {
                    cyrVar = V;
                } else if (p.al() != null) {
                    cyrVar = p.al().W();
                }
                if (cyrVar != null) {
                    cyvVar2 = cyrVar.q;
                }
                dbk e = dbm.e(cyvVar2, p, z, z2);
                int H = e.H();
                C = e.C();
                i = H;
            } else if (daeVar != null && daeVar.e() == z && daeVar.d() == z2) {
                W.ao();
                i = (int) daeVar.b();
                C = (int) daeVar.a();
            } else {
                ddj ddjVar = new ddj(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                W.R(cyvVar, p, z, z2, ddjVar);
                int i3 = ddjVar.a;
                if (i3 < 0 || (i2 = ddjVar.b) < 0) {
                    String valueOf = String.valueOf(W);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                    sb.append("MeasureOutput not set, ComponentLifecycle is: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                dae daeVar2 = czzVar.c;
                if (daeVar2 != null) {
                    daeVar2.kn(z);
                    czzVar.c.kk(z2);
                    czzVar.c.km(i3);
                    czzVar.c.kl(i2);
                }
                C = i2;
                i = i3;
            }
            czzVar.g = i;
            czzVar.h = C;
            return Float.floatToRawIntBits(f4) | (Float.floatToRawIntBits(f3) << 32);
        }
        return 0L;
    }
}
