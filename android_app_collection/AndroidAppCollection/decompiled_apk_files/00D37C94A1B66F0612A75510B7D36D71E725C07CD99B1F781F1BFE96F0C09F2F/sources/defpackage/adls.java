package defpackage;
/* compiled from: PG */
/* renamed from: adls  reason: default package */
/* loaded from: classes.dex */
public final class adls {
    public final admj a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public adls(admj admjVar, int i, int i2, int i3, int i4) {
        this.a = admjVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((adls) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
