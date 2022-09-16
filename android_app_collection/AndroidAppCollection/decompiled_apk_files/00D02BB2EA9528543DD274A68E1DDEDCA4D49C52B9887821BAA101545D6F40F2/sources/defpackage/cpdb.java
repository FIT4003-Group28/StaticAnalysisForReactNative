package defpackage;

import com.google.android.gms.udc.CheckConsentRequest;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cpdb  reason: default package */
/* loaded from: classes5.dex */
public final class cpdb {
    public int a = -1;
    @dzsi
    public String b;
    @dzsi
    private int[] c;

    public final CheckConsentRequest a() {
        boolean z = true;
        cnwc.c(this.a != -1, "productId must be set.");
        if (this.c == null) {
            z = false;
        }
        cnwc.c(z, "settingIds must be set.");
        return new CheckConsentRequest(this.a, this.c, this.b, "me");
    }

    public final void b(int[] iArr) {
        boolean z = false;
        if (iArr != null && iArr.length > 0) {
            z = true;
        }
        cnwc.e(z, "Empty settingIds is not allowed!");
        this.c = Arrays.copyOf(iArr, iArr.length);
    }
}
