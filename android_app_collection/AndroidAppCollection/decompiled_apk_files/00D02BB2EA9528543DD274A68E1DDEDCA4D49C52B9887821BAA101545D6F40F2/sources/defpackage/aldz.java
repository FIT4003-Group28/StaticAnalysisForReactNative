package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aldz  reason: default package */
/* loaded from: classes2.dex */
final class aldz {
    private final int a;
    private final int b;

    public aldz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aldz)) {
            return false;
        }
        aldz aldzVar = (aldz) obj;
        return this.a == aldzVar.a && this.b == aldzVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
