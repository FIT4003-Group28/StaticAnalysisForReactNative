package defpackage;
/* compiled from: PG */
/* renamed from: ddfr  reason: default package */
/* loaded from: classes5.dex */
final class ddfr {
    final int a;
    final int b = 0;

    public ddfr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddfr) {
            ddfr ddfrVar = (ddfr) obj;
            if (this.a == ddfrVar.a) {
                int i = ddfrVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
