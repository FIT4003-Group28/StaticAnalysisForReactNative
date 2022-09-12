package defpackage;
/* compiled from: PG */
/* renamed from: eanz  reason: default package */
/* loaded from: classes6.dex */
public abstract class eanz {
    public final String d;
    public final int e;

    /* JADX INFO: Access modifiers changed from: protected */
    public eanz(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i, int i2);

    public abstract boolean c(int[] iArr, int i);

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return this.d;
    }
}
