package defpackage;

import com.google.android.libraries.social.populous.core.C$AutoValue_PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.core.SourceIdentity;
/* compiled from: PG */
/* renamed from: cywi  reason: default package */
/* loaded from: classes5.dex */
public abstract class cywi {
    public static final cyvy a;
    public static final InAppNotificationTarget b;

    static {
        cyvx i = cyvy.i();
        i.f(cyfj.PROFILE_ID);
        i.j("");
        i.d("");
        i.h(PersonFieldMetadata.l().i());
        a = i.k();
        cyfi n = InAppNotificationTarget.n();
        n.h("");
        cygd l = PersonFieldMetadata.l();
        l.j(cygl.PAPI_TOPN);
        l.f = PeopleApiAffinity.e;
        l.g = ((C$AutoValue_PeopleApiAffinity) PeopleApiAffinity.e).a;
        n.e(l.i());
        ((cyca) n).b = 1;
        b = n.i();
    }

    public static cywf s() {
        cyus cyusVar = new cyus();
        cyusVar.c(0);
        cyusVar.d(dcdc.e());
        cyusVar.e(dcdc.e());
        cyusVar.f(dcdc.e());
        cyusVar.i(dcdc.e());
        cyusVar.k(dcdc.e());
        return cyusVar;
    }

    public abstract cyxk a();

    public abstract dcdc<cywh> b();

    public abstract dcdc<String> c();

    public abstract dcdc<SourceIdentity> d();

    public abstract dcdc<cyvy> e();

    public abstract dcdc<cyvy> f();

    public abstract dcdc<InAppNotificationTarget> g();

    public abstract dcdc<Photo> h();

    public abstract PeopleApiAffinity i();

    @dzsi
    public abstract PersonExtendedData j();

    public abstract int k();

    @dzsi
    public abstract dcdc<GroupOrigin> l();

    @dzsi
    public abstract String m();

    @dzsi
    public abstract dcdc<cywi> n();

    public abstract int o();

    public final Iterable<cyvy> p() {
        return dcbg.d(dcft.i(e(), cywb.a), dcft.i(f(), cywc.a));
    }

    public final Iterable<InAppNotificationTarget> q() {
        return dcft.i(g(), cywd.a);
    }

    public final Iterable<cyvy> r() {
        return dcft.i(p(), cywe.a);
    }

    public final cyvt t(boolean z) {
        cyvt a2 = cyvt.a();
        a2.a = a();
        a2.h = cyvr.a(o());
        a2.i = i().b();
        a2.b = i();
        a2.c = i().a();
        a2.f = c();
        a2.k = j();
        a2.l = d();
        dcdc<Photo> h = h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            Photo photo = h.get(i);
            cygi e = photo.e();
            cygd l = PersonFieldMetadata.l();
            l.k(photo.b());
            e.c(l.i());
            a2.f(e.a());
        }
        for (InAppNotificationTarget inAppNotificationTarget : q()) {
            a2.e(inAppNotificationTarget.m().i());
        }
        Iterable<cyvy> r = z ? r() : p();
        for (cyvy cyvyVar : r) {
            a2.d(cyvi.h(cyvyVar).h());
        }
        if (!b().isEmpty()) {
            dcdc<cywh> b2 = b();
            int size2 = b2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cywh cywhVar = b2.get(i2);
                cyvu g = cyvv.g();
                g.e(cywhVar.a());
                cyum cyumVar = (cyum) g;
                cyumVar.a = cywhVar.b();
                cyumVar.b = cywhVar.c();
                g.d(o());
                cygd l2 = PersonFieldMetadata.l();
                l2.j = cyvr.a(o());
                l2.b(cywhVar.d());
                ((cybr) l2).a = cywhVar.e();
                l2.e(cywhVar.f());
                l2.l = !h().isEmpty();
                g.c(l2.i());
                a2.c(g.f());
            }
        } else if (!dcbg.b(r).y()) {
            a2.d = dcdc.e();
        }
        a2.m = k();
        a2.n = l() != null ? l() : dcdc.e();
        a2.p = m();
        if (n() != null) {
            int min = Math.min(n().size(), 4);
            for (int i3 = 0; i3 < min; i3++) {
                cyvs u = n().get(i3).u(z);
                if (a2.o.size() < 4) {
                    a2.o.add(u);
                }
            }
        }
        return a2;
    }

    public final cyvs u(boolean z) {
        return t(z).b();
    }
}
