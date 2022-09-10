package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aksg  reason: default package */
/* loaded from: classes.dex */
public final class aksg {
    public final akqq a;
    public final akqq b;
    public final akqq c;
    public final akqq d;
    public final akqs e;

    public aksg(akqq akqqVar, akqq akqqVar2, akqq akqqVar3, akqq akqqVar4, akqs akqsVar) {
        this.a = akqqVar;
        this.b = akqqVar2;
        this.c = akqqVar3;
        this.d = akqqVar4;
        this.e = akqsVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aksg)) {
            return false;
        }
        aksg aksgVar = (aksg) obj;
        return this.a.equals(aksgVar.a) && this.b.equals(aksgVar.b) && this.c.equals(aksgVar.c) && this.d.equals(aksgVar.d) && this.e.equals(aksgVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("nearLeft", this.a);
        b.b("nearRight", this.b);
        b.b("farLeft", this.c);
        b.b("farRight", this.d);
        b.b("latLngBounds", this.e);
        return b.toString();
    }
}
