package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: alwd  reason: default package */
/* loaded from: classes.dex */
public final class alwd implements Serializable {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public alwd(String str, int i, int i2) {
        this(str, i, i2, akvs.d);
    }

    public alwd(String str, int i, int i2, akvs akvsVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = akvsVar.b;
        this.e = akvsVar.c;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alwd)) {
            return false;
        }
        alwd alwdVar = (alwd) obj;
        return this.a.equals(alwdVar.a) && this.b == alwdVar.b && this.c == alwdVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + this.b) * 31) + this.c;
    }
}
