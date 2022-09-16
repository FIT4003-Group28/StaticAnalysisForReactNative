package defpackage;
/* compiled from: PG */
/* renamed from: aenn  reason: default package */
/* loaded from: classes.dex */
public final class aenn extends Exception {
    public final int a;

    public aenn(int i, String str) {
        super(str);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof aenn) && this.a == ((aenn) obj).a);
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
