package c.e.a.b.d.g;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q2 extends k2<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(r2 r2Var, String str, Boolean bool, boolean z) {
        super(r2Var, str, bool, z, null);
    }

    @Override // c.e.a.b.d.g.k2
    final /* synthetic */ Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (v1.f4468c.matcher(str).matches()) {
                return true;
            }
            if (v1.f4469d.matcher(str).matches()) {
                return false;
            }
        }
        String a2 = super.a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(a2);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
