package defpackage;
/* compiled from: PG */
/* renamed from: bxt  reason: default package */
/* loaded from: classes.dex */
final class bxt implements bxy {
    int a;
    public Class<?> b;
    private final bxu c;

    public bxt(bxu bxuVar) {
        this.c = bxuVar;
    }

    @Override // defpackage.bxy
    public final void a() {
        this.c.b(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bxt) {
            bxt bxtVar = (bxt) obj;
            if (this.a == bxtVar.a && this.b == bxtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class<?> cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Key{size=");
        sb.append(i);
        sb.append("array=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}