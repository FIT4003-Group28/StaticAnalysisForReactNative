package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vbn  reason: default package */
/* loaded from: classes4.dex */
public final class vbn extends vbt {
    public vbn(vbr vbrVar, String str, Double d) {
        super(vbrVar, str, d, true);
    }

    @Override // defpackage.vbt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String d = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
