package defpackage;
/* compiled from: PG */
/* renamed from: ppz  reason: default package */
/* loaded from: classes4.dex */
public final class ppz {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public ppz(Object obj) {
        this(obj, -1, -1, -1L, -1);
    }

    public ppz(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public ppz(ppz ppzVar) {
        this.a = ppzVar.a;
        this.b = ppzVar.b;
        this.c = ppzVar.c;
        this.d = ppzVar.d;
        this.e = ppzVar.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final ppz b(Object obj) {
        return new ppz(!this.a.equals(obj) ? new ppz(obj, this.b, this.c, this.d, this.e) : this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppz)) {
            return false;
        }
        ppz ppzVar = (ppz) obj;
        return this.a.equals(ppzVar.a) && this.b == ppzVar.b && this.c == ppzVar.c && this.d == ppzVar.d && this.e == ppzVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public ppz(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public ppz(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
