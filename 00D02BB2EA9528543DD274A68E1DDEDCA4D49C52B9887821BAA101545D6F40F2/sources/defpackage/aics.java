package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aics  reason: default package */
/* loaded from: classes2.dex */
final class aics implements Iterable<PersonId> {
    public final ahvf a;
    public final List<aicq> b;
    public final akra c;
    public final int d;
    public final boolean e;
    public final aicq f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public aics(List<aicq> list, ajsc ajscVar, dbsg<PersonId> dbsgVar, dbsg<akra> dbsgVar2, boolean z, boolean z2) {
        boolean z3;
        this.i = z2;
        boolean z4 = true;
        dbsk.a(!list.isEmpty());
        aicq aicqVar = list.get(0);
        for (aicq aicqVar2 : list) {
            if (aicqVar2.b().q(aicqVar.b()) && aicqVar2.d().a()) {
                aicqVar = aicqVar2;
            }
        }
        if (dbsgVar.a()) {
            z3 = false;
            for (aicq aicqVar3 : list) {
                boolean equals = aicqVar3.a().a().equals(dbsgVar.b());
                if (true == equals) {
                    aicqVar = aicqVar3;
                }
                z3 |= equals;
            }
        } else {
            z3 = false;
        }
        this.b = list;
        this.c = dbsgVar2.c((akra) aicqVar.d().h(aicp.a).b());
        this.f = aicqVar;
        int i = 0;
        for (aicq aicqVar4 : list) {
            i += aicqVar4.a().a().hashCode();
        }
        this.d = i + (z ? 1 : 0);
        this.e = true == z3;
        boolean z5 = false;
        for (aicq aicqVar5 : list) {
            z5 |= aicqVar5.f().a();
        }
        this.g = true != z5 ? false : z4;
        if (aicqVar.a().a().equals(PersonId.a)) {
            this.a = ahvf.SUPER_FRESH;
        } else {
            this.a = this.f.c();
        }
        dbsg<dqyh> g = aicqVar.g();
        if (aicqVar.a().a().equals(PersonId.a)) {
            this.h = ajscVar.a(0L).toString();
        } else if (!z5 || !g.a()) {
            this.h = ajscVar.a(aicqVar.b().b).toString();
        } else {
            this.h = g.b().d;
        }
    }

    public final int a() {
        return this.b.size();
    }

    public final int b() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.f.a().a(), Boolean.valueOf(this.e), this.a, this.h, Boolean.valueOf(this.g)});
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof aics) && b() == ((aics) obj).b();
    }

    public final int hashCode() {
        return b();
    }

    @Override // java.lang.Iterable
    public final Iterator<PersonId> iterator() {
        return dcft.o(this.b, aicn.a).iterator();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("ID", this.d);
        b.f("hash", b());
        b.f("size", this.b.size());
        b.b("containing", this.b.get(0).a().b().c(""));
        return b.toString();
    }
}
