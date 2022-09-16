package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amvx  reason: default package */
/* loaded from: classes.dex */
public final class amvx {
    @dzsi
    public final String a;
    @dzsi
    private final Object b;

    public amvx(@dzsi String str, @dzsi Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof amvx)) {
            return false;
        }
        amvx amvxVar = (amvx) obj;
        return dbsd.a(this.a, amvxVar.a) && dbsd.a(this.b, amvxVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("displayName", this.a);
        return b.toString();
    }
}
