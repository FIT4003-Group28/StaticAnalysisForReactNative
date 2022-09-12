package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cudn  reason: default package */
/* loaded from: classes5.dex */
final class cudn extends cugd {
    private final byte[] a;
    private final int b;
    private final int c;
    private final dbsg<Integer> d;
    private final String e;

    public cudn(byte[] bArr, int i, int i2, dbsg<Integer> dbsgVar, String str) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = dbsgVar;
        this.e = str;
    }

    @Override // defpackage.cugd
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.cugd
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cugd
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cugd
    public final dbsg<Integer> d() {
        return this.d;
    }

    @Override // defpackage.cugd
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cugd) {
            cugd cugdVar = (cugd) obj;
            if (Arrays.equals(this.a, cugdVar instanceof cudn ? ((cudn) cugdVar).a : cugdVar.a()) && this.b == cugdVar.b() && this.c == cugdVar.c() && this.d.equals(cugdVar.d()) && this.e.equals(cugdVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        int i = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 87 + String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append("LighterIcon{icon=");
        sb.append(arrays);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", color=");
        sb.append(valueOf);
        sb.append(", talkBackDescription=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
