package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vbp  reason: default package */
/* loaded from: classes4.dex */
public final class vbp extends vbt {
    final /* synthetic */ vbq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbp(vbr vbrVar, String str, Object obj, boolean z, vbq vbqVar) {
        super(vbrVar, str, obj, z);
        this.a = vbqVar;
    }

    @Override // defpackage.vbt
    public final Object a(Object obj) {
        try {
            return this.a.a(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String d = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 27 + str.length());
            sb.append("Invalid byte[] value for ");
            sb.append(d);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
