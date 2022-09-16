package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ghb  reason: default package */
/* loaded from: classes3.dex */
final class ghb {
    private final Class a;
    private final byte[] b;

    public ghb(Class cls, byte[] bArr) {
        this.a = cls;
        this.b = (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ghb)) {
            return false;
        }
        ghb ghbVar = (ghb) obj;
        return this.a.equals(ghbVar.a) && Arrays.equals(this.b, ghbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
    }
}
