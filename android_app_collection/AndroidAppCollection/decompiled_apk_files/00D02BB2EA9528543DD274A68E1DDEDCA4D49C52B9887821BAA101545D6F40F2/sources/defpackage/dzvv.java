package defpackage;
/* compiled from: PG */
/* renamed from: dzvv  reason: default package */
/* loaded from: classes6.dex */
public class dzvv extends dzvr implements dzwp {
    private final int a;
    private final int f;

    public dzvv(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2);
        this.a = i;
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvv) {
            dzvv dzvvVar = (dzvv) obj;
            if (dzvx.d(d(), dzvvVar.d()) && this.c.equals(dzvvVar.c) && this.d.equals(dzvvVar.d)) {
                int i = dzvvVar.f;
                if (this.a == dzvvVar.a && dzvx.d(this.b, dzvvVar.b)) {
                    return true;
                }
            }
            return false;
        } else if (!(obj instanceof dzwp)) {
            return false;
        } else {
            return obj.equals(c());
        }
    }

    @Override // defpackage.dzvr
    protected final void f() {
        int i = dzwe.a;
    }

    public final int hashCode() {
        return (((d() == null ? 0 : d().hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        dzwm c = c();
        if (c != this) {
            return c.toString();
        }
        if ("<init>".equals(this.c)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.c + " (Kotlin reflection is not available)";
    }
}
