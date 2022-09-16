package defpackage;
/* compiled from: PG */
/* renamed from: qvb  reason: default package */
/* loaded from: classes4.dex */
public final class qvb {
    public final Object a;
    public final String b;

    public qvb(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvb)) {
            return false;
        }
        qvb qvbVar = (qvb) obj;
        return this.a == qvbVar.a && this.b.equals(qvbVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
