package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: amsf  reason: default package */
/* loaded from: classes2.dex */
public final class amsf implements amri {
    public static final dcqe a = dcqe.c("amsf");
    private final List<amse> b;
    private final int c;

    public amsf(List<amse> list) {
        this.b = list;
        int i = 0;
        for (amse amseVar : list) {
            i += amseVar.c;
        }
        this.c = i;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        Iterator<amse> it = this.b.iterator();
        float f = 0.0f;
        while (true) {
            float f2 = 0.5f;
            if (!it.hasNext()) {
                int i = this.c;
                if (i <= 0) {
                    return 0.5f;
                }
                return f / i;
            }
            amse next = it.next();
            amri amriVar = next.a;
            float a2 = amriVar.a(aktcVar, amrkVar, akraVar, dmloVar);
            if (a2 < -1.0E-6f || a2 > 1.000001f || Float.isNaN(a2)) {
                String simpleName = amriVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 89);
                sb.append("Scorer '");
                sb.append(simpleName);
                sb.append("' returned a value outside the valid range [");
                sb.append(0.0f);
                sb.append(", ");
                sb.append(1.0f);
                sb.append("] -/+ ");
                sb.append(1.0E-6f);
                sb.append(": ");
                sb.append(a2);
                bvoo.j(new IllegalStateException(sb.toString()));
            }
            if (!Float.isNaN(a2)) {
                f2 = Math.max(0.0f, Math.min(1.0f, a2));
            }
            if (f2 > next.d) {
                return next.b ? 0.0f : 1.0f;
            }
            if (next.b) {
                f2 = 1.0f - f2;
            }
            f += f2 * next.c;
        }
    }
}
