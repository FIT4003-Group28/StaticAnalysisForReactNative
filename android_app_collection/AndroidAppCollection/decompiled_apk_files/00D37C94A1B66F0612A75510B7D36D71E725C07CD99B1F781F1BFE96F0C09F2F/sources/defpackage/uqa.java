package defpackage;
/* compiled from: PG */
/* renamed from: uqa  reason: default package */
/* loaded from: classes4.dex */
public final class uqa {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    private String i;
    private Boolean j;
    private Boolean k;
    private Boolean l;

    public final void b(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    public final void c(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final uqc a() {
        Boolean bool;
        String str = this.i;
        if (str == null || (bool = this.j) == null || this.k == null || this.l == null || this.h == 0 || this.g == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.i == null) {
                sb.append(" accountName");
            }
            if (this.j == null) {
                sb.append(" isMetadataAvailable");
            }
            if (this.k == null) {
                sb.append(" isG1User");
            }
            if (this.l == null) {
                sb.append(" isDasherUser");
            }
            if (this.h == 0) {
                sb.append(" isUnicornUser");
            }
            if (this.g == 0) {
                sb.append(" ageRange");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uqc(str, bool.booleanValue(), this.a, this.b, this.c, this.d, this.k.booleanValue(), this.l.booleanValue(), this.h, this.e, this.f, this.g);
    }
}
