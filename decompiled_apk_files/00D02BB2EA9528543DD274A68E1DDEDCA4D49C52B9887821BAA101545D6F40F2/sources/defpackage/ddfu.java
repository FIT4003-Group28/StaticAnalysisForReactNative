package defpackage;
/* compiled from: PG */
/* renamed from: ddfu  reason: default package */
/* loaded from: classes5.dex */
final class ddfu {
    final int a;
    final int b = 0;

    public ddfu(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddfu) {
            ddfu ddfuVar = (ddfu) obj;
            if (this.a == ddfuVar.a) {
                int i = ddfuVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
