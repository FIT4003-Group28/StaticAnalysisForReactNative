package defpackage;
/* compiled from: PG */
/* renamed from: sek  reason: default package */
/* loaded from: classes4.dex */
public final class sek {
    public Object a;
    public Object b;

    public sek(Object obj, Object obj2) {
        b(obj, obj2);
    }

    public final sek a() {
        return new sek(this.a, this.b);
    }

    public final void b(Object obj, Object obj2) {
        sho.h(obj);
        this.a = obj;
        sho.h(obj2);
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sek) {
            sek sekVar = (sek) obj;
            if (this.a.equals(sekVar.a) && this.b.equals(sekVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("[%s, %s]", this.a.toString(), this.b.toString());
    }
}
