package defpackage;
/* compiled from: PG */
/* renamed from: ucn  reason: default package */
/* loaded from: classes4.dex */
public final class ucn {
    public Long a;
    public Integer b;
    private byte[] c;

    public final void b(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final ucu a() {
        Integer num;
        byte[] bArr;
        Long l = this.a;
        if (l == null || (num = this.b) == null || (bArr = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" id");
            }
            if (this.b == null) {
                sb.append(" jobType");
            }
            if (this.c == null) {
                sb.append(" payload");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ucu(l, num, bArr);
    }
}
