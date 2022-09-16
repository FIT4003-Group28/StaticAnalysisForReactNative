package defpackage;
/* compiled from: PG */
/* renamed from: ndj  reason: default package */
/* loaded from: classes3.dex */
public final class ndj {
    public apqk a;

    public ndj(apqk apqkVar) {
        apqkVar.getClass();
        this.a = apqkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ndj) {
            return this.a.equals(((ndj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 29;
    }
}
