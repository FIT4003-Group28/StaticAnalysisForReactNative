package defpackage;

import j$.util.Objects;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pdz  reason: default package */
/* loaded from: classes4.dex */
public final class pdz {
    public final byte[] a;
    public final int b;
    public final int c;

    public pdz(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pdz)) {
            return false;
        }
        pdz pdzVar = (pdz) obj;
        return Arrays.equals(this.a, pdzVar.a) && this.b == pdzVar.b && this.c == pdzVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
