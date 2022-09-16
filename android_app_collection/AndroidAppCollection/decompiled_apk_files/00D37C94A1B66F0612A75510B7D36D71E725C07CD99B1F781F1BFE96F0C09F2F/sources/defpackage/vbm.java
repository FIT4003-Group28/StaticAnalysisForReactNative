package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vbm  reason: default package */
/* loaded from: classes4.dex */
public final class vbm extends vbt {
    public vbm(vbr vbrVar, String str, Boolean bool) {
        super(vbrVar, str, bool, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vbt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (rxn.c.matcher(obj).matches()) {
            return true;
        }
        if (!rxn.d.matcher(obj).matches()) {
            String d = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 28 + str.length());
            sb.append("Invalid boolean value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
        return false;
    }
}
