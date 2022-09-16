package defpackage;
/* compiled from: PG */
/* renamed from: ddct  reason: default package */
/* loaded from: classes5.dex */
final class ddct {
    final int a;
    final int b = 0;

    public ddct(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddct) {
            ddct ddctVar = (ddct) obj;
            if (this.a == ddctVar.a) {
                int i = ddctVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
