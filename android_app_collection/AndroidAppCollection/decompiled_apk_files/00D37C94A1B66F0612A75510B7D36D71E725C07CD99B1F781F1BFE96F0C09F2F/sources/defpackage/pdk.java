package defpackage;

import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: pdk  reason: default package */
/* loaded from: classes4.dex */
final class pdk {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public pdr d;
    public boolean e;

    public pdk(int i, String str, pdr pdrVar) {
        this.a = i;
        this.b = str;
        this.d = pdrVar;
    }

    public final pdy a(long j) {
        pdy pdyVar = new pdy(this.b, j, -1L, -9223372036854775807L, null);
        pdy pdyVar2 = (pdy) this.c.floor(pdyVar);
        if (pdyVar2 == null || pdyVar2.b + pdyVar2.c <= j) {
            pdy pdyVar3 = (pdy) this.c.ceiling(pdyVar);
            return pdyVar3 == null ? pdy.d(this.b, j) : new pdy(this.b, j, pdyVar3.b - j, -9223372036854775807L, null);
        }
        return pdyVar2;
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pdk pdkVar = (pdk) obj;
            if (this.a == pdkVar.a && this.b.equals(pdkVar.b) && this.c.equals(pdkVar.c) && this.d.equals(pdkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}
