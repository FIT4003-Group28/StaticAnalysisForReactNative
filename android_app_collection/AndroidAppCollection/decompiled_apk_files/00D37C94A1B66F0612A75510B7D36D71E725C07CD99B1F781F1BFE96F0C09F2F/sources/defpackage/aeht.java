package defpackage;
/* compiled from: PG */
/* renamed from: aeht  reason: default package */
/* loaded from: classes.dex */
public final class aeht extends Exception {
    public final int a;

    public aeht(int i, String str) {
        super(str);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aeht) && this.a == ((aeht) obj).a;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public aeht(String str, Exception exc) {
        super(str, exc);
        this.a = 5;
    }
}
