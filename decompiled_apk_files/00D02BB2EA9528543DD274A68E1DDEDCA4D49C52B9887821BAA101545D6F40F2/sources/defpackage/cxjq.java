package defpackage;

import android.util.Base64;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxjq  reason: default package */
/* loaded from: classes.dex */
public final class cxjq extends cxju {
    final /* synthetic */ cxjr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxjq(cxjs cxjsVar, String str, Object obj, boolean z, cxjr cxjrVar) {
        super(cxjsVar, str, obj, z);
        this.a = cxjrVar;
    }

    @Override // defpackage.cxju
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        String e = super.e();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid byte[] value for ");
        sb.append(e);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
