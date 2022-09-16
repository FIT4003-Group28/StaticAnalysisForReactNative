package defpackage;
/* compiled from: PG */
/* renamed from: utb  reason: default package */
/* loaded from: classes4.dex */
public final class utb {
    public final String a;

    public utb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof utb) {
            return this.a.equals(((utb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
