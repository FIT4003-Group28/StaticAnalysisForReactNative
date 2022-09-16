package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vbl  reason: default package */
/* loaded from: classes4.dex */
public final class vbl extends vbt {
    public vbl(vbr vbrVar, String str, Long l) {
        super(vbrVar, str, l, true);
    }

    @Override // defpackage.vbt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String d = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
