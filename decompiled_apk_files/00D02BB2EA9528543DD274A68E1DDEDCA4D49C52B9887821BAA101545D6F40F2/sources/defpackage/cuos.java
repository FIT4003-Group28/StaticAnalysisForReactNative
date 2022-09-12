package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cuos  reason: default package */
/* loaded from: classes5.dex */
final class cuos extends cupp {
    private final byte[] a;
    private final cugd b;
    private final String c;
    private final ctzl d;

    public cuos(byte[] bArr, cugd cugdVar, String str, ctzl ctzlVar) {
        this.a = bArr;
        this.b = cugdVar;
        this.c = str;
        this.d = ctzlVar;
    }

    @Override // defpackage.cupp
    @Deprecated
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.cupp
    public final cugd b() {
        return this.b;
    }

    @Override // defpackage.cupp
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cupp
    public final ctzl d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cupp) {
            cupp cuppVar = (cupp) obj;
            if (Arrays.equals(this.a, cuppVar instanceof cuos ? ((cuos) cuppVar).a : cuppVar.a()) && this.b.equals(cuppVar.b()) && this.c.equals(cuppVar.c()) && this.d.equals(cuppVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("VerticalLayoutButton{icon=");
        sb.append(arrays);
        sb.append(", lighterIcon=");
        sb.append(valueOf);
        sb.append(", displayText=");
        sb.append(str);
        sb.append(", action=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
