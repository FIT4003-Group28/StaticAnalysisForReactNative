package defpackage;
/* compiled from: PG */
/* renamed from: ddcz  reason: default package */
/* loaded from: classes.dex */
public final class ddcz {
    final int a;
    final int b = 0;

    public ddcz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddcz) {
            ddcz ddczVar = (ddcz) obj;
            if (this.a == ddczVar.a) {
                int i = ddczVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
