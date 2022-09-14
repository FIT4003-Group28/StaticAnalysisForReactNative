package c.e.a.b.d.g;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o2 extends k2<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(r2 r2Var, String str, Double d2, boolean z) {
        super(r2Var, str, d2, z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // c.e.a.b.d.g.k2
    /* renamed from: b */
    public final Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a2 = super.a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(a2);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
