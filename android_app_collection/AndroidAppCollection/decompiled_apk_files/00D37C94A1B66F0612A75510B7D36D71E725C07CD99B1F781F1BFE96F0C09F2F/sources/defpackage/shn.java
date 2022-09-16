package defpackage;
/* compiled from: PG */
/* renamed from: shn  reason: default package */
/* loaded from: classes4.dex */
public final class shn {
    public final Object a;
    public final Object b;

    public shn(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof shn)) {
            return false;
        }
        shn shnVar = (shn) obj;
        Object obj2 = shnVar.a;
        Object obj3 = this.a;
        if (obj2 == obj3) {
            return true;
        }
        return (obj2.equals(obj3) && shnVar.b == this.b) || shnVar.b.equals(this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
