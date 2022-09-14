package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cjte  reason: default package */
/* loaded from: classes.dex */
public class cjte {
    public final deaf a;
    @dzsi
    public final dead b;

    public cjte(deaf deafVar) {
        this(deafVar, null);
    }

    public cjte(deaf deafVar, @dzsi dead deadVar) {
        this.a = deafVar;
        this.b = deadVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjte)) {
            return false;
        }
        cjte cjteVar = (cjte) obj;
        return this.a == cjteVar.a && this.b == cjteVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("action", this.a);
        b.b("cardinalDirection", this.b);
        return b.toString();
    }
}
