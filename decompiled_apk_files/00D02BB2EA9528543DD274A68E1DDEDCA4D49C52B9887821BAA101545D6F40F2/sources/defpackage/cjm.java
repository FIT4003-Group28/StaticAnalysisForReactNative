package defpackage;
/* compiled from: PG */
/* renamed from: cjm  reason: default package */
/* loaded from: classes.dex */
public final class cjm {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public cjm() {
    }

    public cjm(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cjm cjmVar = (cjm) obj;
        return this.a.equals(cjmVar.a) && this.b.equals(cjmVar.b) && cjp.j(this.c, cjmVar.c);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("MultiClassKey{first=");
        sb.append(valueOf);
        sb.append(", second=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
