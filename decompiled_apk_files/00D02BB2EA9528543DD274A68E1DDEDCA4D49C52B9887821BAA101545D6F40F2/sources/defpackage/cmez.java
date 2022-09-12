package defpackage;
/* compiled from: PG */
/* renamed from: cmez  reason: default package */
/* loaded from: classes5.dex */
public final class cmez {
    public final int a;
    public final boolean b;

    public cmez(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmez cmezVar = (cmez) obj;
            if (this.a == cmezVar.a && this.b == cmezVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
