package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: rsj  reason: default package */
/* loaded from: classes4.dex */
public final class rsj implements qsm {
    public final int a;
    private final String b = null;

    public rsj(rsi rsiVar) {
        this.a = rsiVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rsj)) {
            return false;
        }
        rsj rsjVar = (rsj) obj;
        if (this.a == rsjVar.a) {
            String str = rsjVar.b;
            if (tnk.j(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), null});
    }
}
