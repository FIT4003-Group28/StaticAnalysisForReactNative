package defpackage;
/* compiled from: PG */
/* renamed from: ancf  reason: default package */
/* loaded from: classes.dex */
public final class ancf {
    public final andm a;
    public final String b;

    public ancf(andm andmVar, String str) {
        anha.c(andmVar, "parser");
        this.a = andmVar;
        anha.c(str, "message");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ancf) {
            ancf ancfVar = (ancf) obj;
            if (this.a.equals(ancfVar.a) && this.b.equals(ancfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
