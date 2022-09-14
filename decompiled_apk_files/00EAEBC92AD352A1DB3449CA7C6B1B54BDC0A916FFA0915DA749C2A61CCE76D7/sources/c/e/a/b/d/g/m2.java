package c.e.a.b.d.g;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m2 extends k2<Long> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(r2 r2Var, String str, Long l, boolean z) {
        super(r2Var, str, l, z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // c.e.a.b.d.g.k2
    /* renamed from: b */
    public final Long a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a2 = super.a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(a2);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
