package defpackage;
/* compiled from: PG */
/* renamed from: adir  reason: default package */
/* loaded from: classes.dex */
public final class adir {
    public final adiq a;
    public final String b;
    public final String c;

    public adir(adiq adiqVar, String str, String str2) {
        this.a = adiqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof adir)) {
            return this.a.equals(((adir) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
