package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: amut  reason: default package */
/* loaded from: classes2.dex */
public final class amut {
    public final doxu a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    @dzsi
    public final String f;
    @dzsi
    public amuo g;
    public final int h;
    public final List<dbty<dbsg<amuw>>> i;

    public amut(amus amusVar) {
        this.a = amusVar.a;
        this.b = amusVar.b;
        this.c = amusVar.c;
        this.d = amusVar.d;
        this.e = amusVar.e;
        this.f = amusVar.f;
        this.h = amusVar.g;
        this.g = amusVar.h;
        this.i = amusVar.i;
    }

    public final amuo a() {
        amuo amuoVar = this.g;
        dbsk.s(amuoVar);
        return amuoVar;
    }

    public final String b() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        amuo amuoVar = this.g;
        dbsk.s(amuoVar);
        return amuoVar.q;
    }

    public final List<amuw> c() {
        ArrayList arrayList = new ArrayList();
        for (dbty<dbsg<amuw>> dbtyVar : this.i) {
            if (dbtyVar.a().a()) {
                arrayList.add(dbtyVar.a().b());
            }
        }
        return arrayList;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amut)) {
            return false;
        }
        amut amutVar = (amut) obj;
        return dbsd.a(this.a, amutVar.a) && this.b == amutVar.b && this.d == amutVar.d && this.c == amutVar.c && this.e == amutVar.e && dbsd.a(this.f, amutVar.f) && this.h == amutVar.h && dbsd.a(this.g, amutVar.g) && this.i.equals(amutVar.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.c), Boolean.valueOf(this.e), this.f, Integer.valueOf(this.h), this.g, this.i});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("guidanceType", this.a);
        b.f("relevanceRangeEndMeters", this.b);
        b.f("minRelevanceDistanceMeters", this.d);
        b.f("minRelevanceSeconds", this.c);
        b.h("isNextStepRelevant", this.e);
        b.f("cannedMessageId", this.h);
        b.b("spokenText", b());
        amuo amuoVar = this.g;
        b.b("step#", amuoVar != null ? Integer.valueOf(amuoVar.i) : null);
        b.b("overrideText", this.f);
        b.b("guidanceWithDistanceMessages", this.i.toString());
        return b.toString();
    }
}
