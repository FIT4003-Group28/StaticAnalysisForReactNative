package defpackage;
/* compiled from: PG */
/* renamed from: zvt  reason: default package */
/* loaded from: classes4.dex */
public final class zvt {
    public ampq a;
    public ampq b;
    private zvs c;
    private Integer d;
    private String e;

    public zvt() {
    }

    public zvt(byte[] bArr) {
        this.a = amon.a;
        this.b = amon.a;
    }

    public final void b(zvs zvsVar) {
        if (zvsVar != null) {
            this.c = zvsVar;
            return;
        }
        throw new NullPointerException("Null albumType");
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void d(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final zvu a() {
        Integer num;
        zvs zvsVar = this.c;
        if (zvsVar == null || (num = this.d) == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" albumType");
            }
            if (this.d == null) {
                sb.append(" fileCount");
            }
            if (this.e == null) {
                sb.append(" name");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new zvu(zvsVar, this.a, num.intValue(), this.e, this.b);
    }
}
