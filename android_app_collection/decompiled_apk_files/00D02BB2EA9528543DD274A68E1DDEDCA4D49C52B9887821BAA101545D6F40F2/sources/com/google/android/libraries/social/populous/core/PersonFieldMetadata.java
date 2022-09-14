package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
import java.util.EnumSet;
import java.util.HashSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class PersonFieldMetadata implements Parcelable {
    public PeopleApiAffinity h;
    public double i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public dcdc<MatchInfo> n;
    public dcdc<EdgeKeyInfo> o;
    public EnumSet<cygl> p = EnumSet.noneOf(cygl.class);
    public dcdc<ContainerInfo> q;

    public static cygd l() {
        cybr cybrVar = new cybr();
        cybrVar.f = PeopleApiAffinity.e;
        cybrVar.g = ((C$AutoValue_PeopleApiAffinity) PeopleApiAffinity.e).a;
        cybrVar.e(false);
        cybrVar.f(false);
        cybrVar.d(false);
        cybrVar.b(duej.UNKNOWN_CONTAINER);
        cybrVar.i = dcdc.e();
        cybrVar.l = false;
        cybrVar.m = false;
        return cybrVar;
    }

    private static boolean o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract duej d();

    @dzsi
    public abstract String e();

    @dzsi
    public abstract String f();

    @dzsi
    public abstract Long g();

    public final Boolean h() {
        return Boolean.valueOf(dcft.j(this.p, cygb.a));
    }

    public final String i() {
        if (!cyeq.c(d()) || !b()) {
            EdgeKeyInfo edgeKeyInfo = (EdgeKeyInfo) dcft.m(this.o, cygc.a).f();
            if (edgeKeyInfo == null) {
                return null;
            }
            return edgeKeyInfo.a();
        }
        return e();
    }

    public final boolean j(PersonFieldMetadata personFieldMetadata) {
        if (d() != duej.UNKNOWN_CONTAINER) {
            if (cyeq.a(d(), personFieldMetadata.d()) && o(e(), personFieldMetadata.e())) {
                return true;
            }
            dcdc<EdgeKeyInfo> dcdcVar = this.o;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                EdgeKeyInfo edgeKeyInfo = dcdcVar.get(i);
                if (cyeq.a(edgeKeyInfo.b(), personFieldMetadata.d()) && o(edgeKeyInfo.a(), personFieldMetadata.e())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void k(@dzsi PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            HashSet hashSet = new HashSet(this.o);
            hashSet.addAll(personFieldMetadata.o);
            n(dcdc.r(hashSet));
        }
        if (personFieldMetadata == null) {
            return;
        }
        this.p.addAll(personFieldMetadata.p);
    }

    public final void m(cygl cyglVar) {
        this.p.add(cyglVar);
    }

    public final void n(dcdc<EdgeKeyInfo> dcdcVar) {
        this.o = dcdc.u(dcdcVar);
    }
}
