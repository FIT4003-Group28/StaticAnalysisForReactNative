package defpackage;
/* compiled from: PG */
/* renamed from: btly  reason: default package */
/* loaded from: classes.dex */
public final class btly {
    public int a;

    public btly() {
        this(0);
    }

    public btly(int i) {
        this.a = i;
    }

    public final void a(int i) {
        this.a = i | this.a;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof btly) && this.a == ((btly) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
