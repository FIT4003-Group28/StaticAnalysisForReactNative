package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: owv  reason: default package */
/* loaded from: classes4.dex */
public final class owv {
    public final String a;
    public final byte[] b;

    public owv(String str, byte[] bArr) {
        this.a = str;
        this.b = (byte[]) pce.a(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof owv)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        owv owvVar = (owv) obj;
        return this.a.equals(owvVar.a) && Arrays.equals(this.b, owvVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Arrays.hashCode(this.b) * 31);
    }
}
