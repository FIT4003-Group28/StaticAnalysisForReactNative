package defpackage;
/* compiled from: PG */
/* renamed from: deph  reason: default package */
/* loaded from: classes6.dex */
final class deph {
    public final boolean a;
    private final Class<?> b;

    public deph(Class<?> cls, boolean z) {
        this.b = cls;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof deph) {
            deph dephVar = (deph) obj;
            if (dephVar.b.equals(this.b) && dephVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
