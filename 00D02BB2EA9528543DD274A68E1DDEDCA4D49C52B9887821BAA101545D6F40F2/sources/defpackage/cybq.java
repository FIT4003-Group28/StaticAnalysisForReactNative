package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.core.Experiments;
import com.google.android.libraries.social.populous.core.SessionContextRuleSet;
import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
/* compiled from: PG */
/* renamed from: cybq  reason: default package */
/* loaded from: classes5.dex */
public final class cybq {
    public static cyec a() {
        cyec f = ClientConfigInternal.f();
        f.h(15);
        f.d(dcep.E(cydt.EMAIL, cydt.PHONE_NUMBER, cydt.PROFILE_ID, cydt.IN_APP_NOTIFICATION_TARGET));
        f.j(duey.UNKNOWN);
        f.b = true;
        f.e(ClientConfigInternal.a);
        f.d = Long.valueOf(ClientConfigInternal.b);
        f.g(cygp.COALESCED);
        f.r = true;
        f.i(cyeh.CONTACT_PREFERRED);
        f.e = true;
        cygp cygpVar = cygp.FIELD_FLATTENED;
        dbsk.s(cygpVar);
        f.p = cygpVar;
        dcmr<Object> dcmrVar = dcmr.a;
        dbsk.s(dcmrVar);
        f.f = dcmrVar;
        dcep<dhfr> G = dcep.G(dhfr.CONTACT, dhfr.PROFILE, dhfr.DOMAIN_CONTACT, dhfr.DOMAIN_PROFILE, dhfr.GOOGLE_GROUP, dhfr.AFFINITY, new dhfr[0]);
        dbsk.s(G);
        f.t = G;
        f.g = false;
        f.l(false);
        f.m(false);
        f.l = false;
        f.c = true;
        f.o(false);
        f.o = true;
        f.q = false;
        f.n(true);
        cygu a = SocialAffinityAllEventSource.a();
        a.c(1);
        a.g(1);
        a.e(1);
        a.b(1);
        a.f(1);
        a.d(1);
        f.h = a.a();
        cyfk cyfkVar = cyfk.SOCIAL_AFFINITY;
        dbsk.s(cyfkVar);
        f.i = cyfkVar;
        cyfk cyfkVar2 = cyfk.PEOPLE_AUTOCOMPLETE;
        dbsk.s(cyfkVar2);
        f.j = cyfkVar2;
        dcmr<Object> dcmrVar2 = dcmr.a;
        dbsk.s(dcmrVar2);
        f.k = dcmrVar2;
        f.m = true;
        cyei cyeiVar = cyei.PARTIAL;
        dbsk.s(cyeiVar);
        f.n = cyeiVar;
        f.s = SessionContextRuleSet.a;
        f.k(dhdj.EMAIL_CENTRIC);
        f.u = false;
        f.v = false;
        dcmr<Object> dcmrVar3 = dcmr.a;
        dbsk.s(dcmrVar3);
        f.w = dcmrVar3;
        f.x = false;
        f.y = false;
        f.z = false;
        cyfd c = Experiments.c();
        c.c(cyfe.b);
        c.c(cyfe.c);
        f.c(c.a());
        f.k(dhdj.MINIMAL_DOMAIN_GLOBAL);
        f.i(cyeh.PROFILE_PREFERRED);
        f.e(ClientConfigInternal.c);
        f.n(false);
        f.x = true;
        f.f(ClientId.e);
        dued duedVar = dued.MAPS_SHARING_AFFINITY;
        dbsk.s(duedVar);
        f.a = duedVar;
        f.d(dcep.D(cydt.EMAIL, cydt.PROFILE_ID, cydt.IN_APP_NOTIFICATION_TARGET));
        f.A = 138;
        f.j(duey.MAPS);
        f.o(true);
        f.B = 16;
        return f;
    }

    public static cydz b() {
        cyec a = a();
        a.f(ClientId.e);
        a.d(dcep.E(cydt.EMAIL, cydt.PHONE_NUMBER, cydt.PROFILE_ID, cydt.IN_APP_NOTIFICATION_TARGET));
        cygu a2 = SocialAffinityAllEventSource.a();
        a2.c(168);
        a2.g(166);
        a2.e(218);
        a2.b(169);
        a2.f(167);
        a2.d(219);
        a.h = a2.a();
        return a.b();
    }
}
