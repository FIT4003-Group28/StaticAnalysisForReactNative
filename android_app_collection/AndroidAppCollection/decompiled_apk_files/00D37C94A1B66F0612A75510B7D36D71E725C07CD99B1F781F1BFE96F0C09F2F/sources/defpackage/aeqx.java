package defpackage;

import android.util.Base64;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aeqx  reason: default package */
/* loaded from: classes.dex */
public final class aeqx implements afip {
    private final String a;

    public aeqx(String str) {
        this.a = str;
    }

    @Override // defpackage.afip
    public final String a(long j) {
        if (this.a.length() > 85000) {
            try {
                return afca.d(Arrays.copyOf(Base64.decode(this.a, 11), 65000));
            } catch (IllegalArgumentException e) {
                afkj.c(afki.DRM, e, "Error base64 decoding. Falling back to basic string trimming.", new Object[0]);
                return String.format("%.65000s", this.a);
            }
        }
        return this.a;
    }
}
