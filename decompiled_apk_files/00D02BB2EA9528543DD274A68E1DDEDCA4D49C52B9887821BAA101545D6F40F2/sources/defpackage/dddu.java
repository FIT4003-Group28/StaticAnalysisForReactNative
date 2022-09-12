package defpackage;
/* compiled from: PG */
/* renamed from: dddu  reason: default package */
/* loaded from: classes5.dex */
public final class dddu {
    final int a;
    final int b = 0;

    public dddu(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dddu) {
            dddu ddduVar = (dddu) obj;
            if (this.a == ddduVar.a) {
                int i = ddduVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
