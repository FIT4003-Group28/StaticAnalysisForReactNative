package defpackage;
/* compiled from: PG */
/* renamed from: jac  reason: default package */
/* loaded from: classes3.dex */
public final class jac implements aajj {
    public static final aaji a = new aaji();
    public final boolean b;
    private final String c;

    public jac() {
    }

    public jac(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public static String b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "InboxNotificationEntity".concat(valueOf) : new String("InboxNotificationEntity");
    }

    @Override // defpackage.aajj
    public final /* synthetic */ amvn a() {
        return amyg.a;
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        String valueOf = String.valueOf(getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("toByteArray is not supported by ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        jab jabVar = new jab();
        jabVar.c(this.c);
        jabVar.d(this.b);
        return jabVar;
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jac) {
            jac jacVar = (jac) obj;
            if (this.c.equals(jacVar.c) && this.b == jacVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aajj
    /* renamed from: getType */
    public aaji mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return ((this.c.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("entityKey", this.c);
        c.g("shouldIndicate", this.b);
        return c.toString();
    }
}
