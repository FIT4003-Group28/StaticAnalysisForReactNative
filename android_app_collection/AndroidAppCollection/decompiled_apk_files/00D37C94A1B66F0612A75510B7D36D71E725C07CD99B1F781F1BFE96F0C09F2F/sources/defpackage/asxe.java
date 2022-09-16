package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asxe  reason: default package */
/* loaded from: classes2.dex */
public final class asxe {
    public final aajl a;
    public final aswy b;

    public asxe(aswy aswyVar, aajl aajlVar) {
        this.b = aswyVar;
        this.a = aajlVar;
    }

    public final awmt a() {
        awmt awmtVar = this.b.h;
        return awmtVar == null ? awmt.a : awmtVar;
    }

    public final List b() {
        amuf amufVar = new amuf();
        for (asww aswwVar : this.b.d) {
            aopa mo52toBuilder = aswwVar.mo52toBuilder();
            amufVar.h(new aswx((asww) mo52toBuilder.mo39build(), this.a));
        }
        return amufVar.g();
    }

    public final boolean c() {
        return (this.b.b & 32) != 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asxe) && this.b.equals(((asxe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("MacroMarkersListMessageModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
