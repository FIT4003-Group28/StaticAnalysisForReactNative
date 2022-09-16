package defpackage;
/* compiled from: PG */
/* renamed from: coau  reason: default package */
/* loaded from: classes5.dex */
public final class coau {
    public final String a;

    public coau(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof coau) {
            return this.a.equals(((coau) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
