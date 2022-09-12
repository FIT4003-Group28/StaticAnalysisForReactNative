package defpackage;
/* compiled from: PG */
/* renamed from: ddgi  reason: default package */
/* loaded from: classes5.dex */
public final class ddgi {
    final int a;
    final int b = 0;

    public ddgi(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddgi) {
            ddgi ddgiVar = (ddgi) obj;
            if (this.a == ddgiVar.a) {
                int i = ddgiVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
