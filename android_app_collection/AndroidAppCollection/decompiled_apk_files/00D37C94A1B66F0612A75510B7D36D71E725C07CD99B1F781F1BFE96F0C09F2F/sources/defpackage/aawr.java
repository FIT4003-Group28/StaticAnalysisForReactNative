package defpackage;
/* compiled from: PG */
/* renamed from: aawr  reason: default package */
/* loaded from: classes.dex */
public final class aawr {
    public final aruk a;

    public aawr(aruk arukVar) {
        this.a = arukVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aawr) {
            return this.a.equals(((aawr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
