package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: aioh  reason: default package */
/* loaded from: classes2.dex */
public final class aioh {
    public final ajsj a;
    public final Executor b;
    private final ailb<aigo> c;
    private final ailb<aihw> d;
    private final ailb<aiky> e;
    private final ailb<aiik> f;
    private final ailb<aile> g;
    private final aiok h;
    private final ajzz i;
    private final akai j;
    private final btvo k;
    private final Context l;
    private final cqat m;
    private final aila n;
    private final ConcurrentHashMap<dbsg<btlu>, aioc> o;
    private final ainq p;

    public aioh(ailb ailbVar, ailb ailbVar2, ailb ailbVar3, ailb ailbVar4, ailb ailbVar5, aiok aiokVar, final ajsj ajsjVar, ajzz ajzzVar, akai akaiVar, btvo btvoVar, btxc btxcVar, Context context, Executor executor, cqat cqatVar) {
        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.o = new ConcurrentHashMap<>();
        this.c = ailbVar;
        this.d = ailbVar2;
        this.e = ailbVar3;
        this.f = ailbVar4;
        this.g = ailbVar5;
        this.b = executor;
        this.h = aiokVar;
        this.i = ajzzVar;
        this.j = akaiVar;
        this.k = btvoVar;
        this.l = context;
        this.m = cqatVar;
        this.a = ajsjVar;
        aila ailaVar = new aila(this, newSingleThreadExecutor) { // from class: ainl
            private final aioh a;
            private final Executor b;

            {
                this.a = this;
                this.b = newSingleThreadExecutor;
            }

            @Override // defpackage.aila
            public final void b(final dbsg dbsgVar) {
                final aioh aiohVar = this.a;
                this.b.execute(new Runnable(aiohVar, dbsgVar) { // from class: ainp
                    private final aioh a;
                    private final dbsg b;

                    {
                        this.a = aiohVar;
                        this.b = dbsgVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k(this.b, dbpy.a);
                    }
                });
            }
        };
        this.n = ailaVar;
        ainq ainqVar = new ainq(this, newSingleThreadExecutor);
        this.p = ainqVar;
        aiokVar.b.add(ainqVar);
        ailbVar.c(ailaVar);
        ailbVar2.c(new aila(this, newSingleThreadExecutor) { // from class: ainr
            private final aioh a;
            private final Executor b;

            {
                this.a = this;
                this.b = newSingleThreadExecutor;
            }

            @Override // defpackage.aila
            public final void b(dbsg dbsgVar) {
                this.b.execute(new Runnable(this.a, dbsgVar) { // from class: ainn
                    private final aioh a;
                    private final dbsg b;

                    {
                        this.a = r1;
                        this.b = dbsgVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aioh aiohVar = this.a;
                        dbsg<btlu> dbsgVar2 = this.b;
                        aiohVar.k(dbsgVar2, dbpy.a);
                        aiohVar.j(dbsgVar2);
                        aioc l = aiohVar.l(dbsgVar2);
                        final int h = aiohVar.h(dbsgVar2);
                        synchronized (l) {
                            if (l.c() == h) {
                                return;
                            }
                            l.d(h);
                            Iterator<aiof> it = l.e.iterator();
                            while (it.hasNext()) {
                                final aiof next = it.next();
                                aiohVar.b.execute(new Runnable(next, h) { // from class: ainv
                                    private final aiof a;
                                    private final int b;

                                    {
                                        this.a = next;
                                        this.b = h;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.b(this.b);
                                    }
                                });
                            }
                        }
                    }
                });
            }
        });
        ailbVar3.c(ailaVar);
        ailbVar4.c(ailaVar);
        ailbVar5.c(ailaVar);
        newSingleThreadExecutor.execute(new Runnable(this, ajsjVar) { // from class: ains
            private final aioh a;
            private final ajsj b;

            {
                this.a = this;
                this.b = ajsjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k(this.b.d(), dbpy.a);
            }
        });
        ajzzVar.a(new ajzx(this, newSingleThreadExecutor) { // from class: aint
            private final aioh a;
            private final Executor b;

            {
                this.a = this;
                this.b = newSingleThreadExecutor;
            }

            @Override // defpackage.ajzx
            public final void a() {
                this.b.execute(new Runnable(this.a) { // from class: ainm
                    private final aioh a;

                    {
                        this.a = r1;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.i();
                    }
                });
            }
        });
        akaiVar.c(new aiob(this, newSingleThreadExecutor));
        btxcVar.a().d(new crzp(this) { // from class: ainu
            private final aioh a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.i();
            }
        }, newSingleThreadExecutor);
    }

    private final dbsg<aion> m(dbsg<btlu> dbsgVar) {
        dkof dkofVar = this.k.getLocationSharingParameters().q;
        if (dkofVar == null) {
            dkofVar = dkof.s;
        }
        if ((dkofVar.a & 2) != 0) {
            dkof dkofVar2 = this.k.getLocationSharingParameters().q;
            if (dkofVar2 == null) {
                dkofVar2 = dkof.s;
            }
            if (!dkofVar2.c.isEmpty()) {
                aiom aiomVar = aiom.INFO;
                String string = this.l.getString(R.string.MOD_WARNING_BANNER_UPDATE_MAPS);
                String string2 = this.l.getString(R.string.MOD_ACTION_UPDATE);
                dbpy<Object> dbpyVar = dbpy.a;
                dkof dkofVar3 = this.k.getLocationSharingParameters().q;
                if (dkofVar3 == null) {
                    dkofVar3 = dkof.s;
                }
                return dbsg.i(aion.g(aiomVar, string, string2, false, dbpyVar, dbsg.i(dkofVar3.c)));
            }
        }
        if (!this.i.c()) {
            return dbsg.i(aion.g(aiom.INFO, this.l.getString(R.string.MOD_WARNING_BANNER_CANNOT_REACH_GOOGLE), this.l.getString(R.string.MOD_ACTION_RETRY), false, dbsg.i(aiol.NETWORK_AVAILABILITY), dbpy.a));
        }
        dbsg<aihw> b = this.d.b(dbsgVar);
        boolean z = b.a() && b.b().d();
        if (dbsgVar.a() && z) {
            akah a = this.j.a(dbsgVar.b());
            if (!a.equals(akai.a)) {
                ajzf ajzfVar = (ajzf) a;
                if (!ajzfVar.b.isEmpty()) {
                    dcep<akaf> dcepVar = ajzfVar.b;
                    if (dcepVar.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE)) {
                        return dbsg.i(aion.g(aiom.WARN, this.l.getString(R.string.MOD_WARNING_BANNER_UNKNOWN_PROBLEM), this.l.getString(R.string.MOD_ACTION_HELP), false, o(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE), n(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE)));
                    }
                    if (dcepVar.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_DOMAIN_DISABLED_REPORTING)) {
                        dbsg<aiol> o = o(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_DOMAIN_DISABLED_REPORTING);
                        dbsg<String> n = n(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_DOMAIN_DISABLED_REPORTING);
                        return ajzfVar.c.a() ? dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNAVAILABLE_DOMAIN, ajzfVar.c.b()), this.l.getString(R.string.MOD_ACTION_HELP), false, o, n)) : dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNKNOWN_PROBLEM), this.l.getString(R.string.MOD_ACTION_HELP), false, o, n));
                    } else if (dcepVar.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_COUNTRY_DISALLOWS_REPORTING)) {
                        dbsg<aiol> o2 = o(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_COUNTRY_DISALLOWS_REPORTING);
                        dbsg<String> n2 = n(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_COUNTRY_DISALLOWS_REPORTING);
                        return ajzfVar.d.a() ? dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNAVAILABLE_COUNTRY, ajzfVar.d.b()), this.l.getString(R.string.MOD_ACTION_HELP), false, o2, n2)) : dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNKNOWN_PROBLEM), this.l.getString(R.string.MOD_ACTION_HELP), false, o2, n2));
                    } else if (dcepVar.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_INVALID_ACCOUNT_TYPE)) {
                        return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNAVAILABLE_ACCOUNT_TYPE), this.l.getString(R.string.MOD_ACTION_HELP), false, o(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_INVALID_ACCOUNT_TYPE), n(akaf.NOT_PRIMARY_REPORTING_DEVICE_AND_NOT_ELIGIBLE_INVALID_ACCOUNT_TYPE)));
                    } else {
                        if (dcepVar.contains(akaf.ULR_NOT_ALLOWED)) {
                            return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNKNOWN_PROBLEM), this.l.getString(R.string.MOD_ACTION_HELP), false, o(akaf.ULR_NOT_ALLOWED), n(akaf.ULR_NOT_ALLOWED)));
                        }
                        if (dcepVar.contains(akaf.UNKNOWN_ERROR)) {
                            return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNKNOWN_PROBLEM), this.l.getString(R.string.MOD_ACTION_HELP), false, o(akaf.UNKNOWN_ERROR), n(akaf.UNKNOWN_ERROR)));
                        }
                        if (dcepVar.contains(akaf.ACTIVITY_DETECTION_PERMISSION_NOT_GRANTED)) {
                            return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_ANDROID_PERMISSIONS_ACTIVITY_RECOGNITION), this.l.getString(R.string.MOD_ACTION_ALLOW), false, o(akaf.ACTIVITY_DETECTION_PERMISSION_NOT_GRANTED), n(akaf.ACTIVITY_DETECTION_PERMISSION_NOT_GRANTED)));
                        }
                        if (dcepVar.contains(akaf.BACKGROUND_LOCATION_PERMISSION_NOT_GRANTED) || dcepVar.contains(akaf.LOCATION_PERMISSION_NOT_GRANTED)) {
                            akaf akafVar = dcepVar.contains(akaf.BACKGROUND_LOCATION_PERMISSION_NOT_GRANTED) ? akaf.BACKGROUND_LOCATION_PERMISSION_NOT_GRANTED : akaf.LOCATION_PERMISSION_NOT_GRANTED;
                            return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_ANDROID_PERMISSIONS_VARIOUS), this.l.getString(R.string.MOD_ACTION_ALLOW), false, o(akafVar), n(akafVar)));
                        } else if (dcepVar.contains(akaf.DEVICE_LOCATION_DISABLED)) {
                            return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_UNKNOWN_PROBLEM), this.l.getString(R.string.MOD_ACTION_FIX), false, o(akaf.DEVICE_LOCATION_DISABLED), n(akaf.DEVICE_LOCATION_DISABLED)));
                        } else {
                            if (dcepVar.contains(akaf.BATTERY_SAVER_ENABLED)) {
                                return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_NOT_OPTIMAL), this.l.getString(R.string.MOD_ACTION_FIX), false, o(akaf.BATTERY_SAVER_ENABLED), n(akaf.BATTERY_SAVER_ENABLED)));
                            }
                            if (dcepVar.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE) || dcepVar.contains(akaf.PRIMARY_BUT_NOT_REPORTING)) {
                                akaf akafVar2 = dcepVar.contains(akaf.NOT_PRIMARY_REPORTING_DEVICE) ? akaf.NOT_PRIMARY_REPORTING_DEVICE : akaf.PRIMARY_BUT_NOT_REPORTING;
                                return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_DEVICE_NOT_PRIMARY), this.l.getString(R.string.MOD_ACTION_FIX), Boolean.valueOf(ajzfVar.a), o(akafVar2), n(akafVar2)));
                            } else if (dcepVar.contains(akaf.REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT) || dcepVar.contains(akaf.ULR_NOT_ENABLED)) {
                                akaf akafVar3 = dcepVar.contains(akaf.REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT) ? akaf.REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT : akaf.ULR_NOT_ENABLED;
                                return dbsg.i(aion.g(aiom.ERROR, this.l.getString(R.string.MOD_WARNING_BANNER_LOCATION_HISTORY_OFF), this.l.getString(R.string.MOD_ACTION_FIX), false, o(akafVar3), n(akafVar3)));
                            }
                        }
                    }
                }
            }
            return dbpy.a;
        }
        return dbpy.a;
    }

    private final dbsg<String> n(akaf akafVar) {
        return (akafVar.p || (this.k.getLocationSharingParameters().a & 256) == 0 || this.k.getLocationSharingParameters().f.isEmpty()) ? dbpy.a : dbsg.i(this.k.getLocationSharingParameters().f);
    }

    private static dbsg<aiol> o(akaf akafVar) {
        return akafVar.p ? dbsg.i(aiol.REPORTING_SETTINGS) : dbpy.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.aink p(com.google.android.apps.gmm.locationsharing.api.Profile r11, defpackage.aioc r12, boolean r13) {
        /*
            r10 = this;
            ailb<aihw> r0 = r10.d
            dbsg<btlu> r1 = r12.a
            dbsg r0 = r0.b(r1)
            boolean r1 = r0.a()
            if (r1 == 0) goto L19
            java.lang.Object r0 = r0.b()
            aihw r0 = (defpackage.aihw) r0
            dcdc r0 = r0.b(r11)
            goto L1d
        L19:
            dcdc r0 = defpackage.dcdc.e()
        L1d:
            r4 = r0
            ailb<aigo> r0 = r10.c
            dbsg<btlu> r1 = r12.a
            dbsg r0 = r0.b(r1)
            dcdc r1 = defpackage.dcdc.e()
            boolean r2 = r0.a()
            if (r2 == 0) goto L4c
            java.lang.Object r0 = r0.b()
            aigo r0 = (defpackage.aigo) r0
            dbsg r0 = r0.b(r11)
            boolean r2 = r0.a()
            if (r2 == 0) goto L4c
            java.lang.Object r0 = r0.b()
            ahvg r0 = (defpackage.ahvg) r0
            dcdc r0 = defpackage.dcdc.f(r0)
            r5 = r0
            goto L4d
        L4c:
            r5 = r1
        L4d:
            ailb<aiky> r0 = r10.e
            dbsg<btlu> r1 = r12.a
            dbsg r0 = r0.b(r1)
            boolean r1 = r0.a()
            r2 = 1
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.b()
            aiky r1 = (defpackage.aiky) r1
            boolean r1 = r1.a(r11)
            if (r1 == 0) goto L6b
            r0 = 3
            r7 = 3
            goto L80
        L6b:
            java.lang.Object r0 = r0.b()
            aiky r0 = (defpackage.aiky) r0
            cqat r1 = r10.m
            boolean r0 = r0.b(r1, r11)
            if (r2 == r0) goto L7c
            r0 = 4
            r7 = 4
            goto L80
        L7c:
            r0 = 2
            r7 = 2
            goto L80
        L7f:
            r7 = 1
        L80:
            aiok r0 = r10.h
            dbsg<btlu> r12 = r12.a
            com.google.android.apps.gmm.locationsharing.api.PersonId r1 = r11.a()
            dcep r6 = r0.a(r12, r1)
            cqat r9 = r10.m
            aimz r12 = new aimz
            dbsg r2 = defpackage.dbsg.i(r11)
            com.google.android.apps.gmm.locationsharing.api.PersonId r3 = r11.a()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aioh.p(com.google.android.apps.gmm.locationsharing.api.Profile, aioc, boolean):aink");
    }

    private final dbsg<aink> q(PersonId personId, aioc aiocVar) {
        dcep<aioj> a = this.h.a(aiocVar.a, personId);
        return !a.isEmpty() ? dbsg.i(aink.i(personId, dcdc.e(), a, this.m)) : dbpy.a;
    }

    private final void r(aioc aiocVar, PersonId personId, aink ainkVar) {
        int i;
        boolean z = true;
        if (aiocVar.c.containsKey(personId)) {
            z = true ^ aiocVar.c.get(personId).equals(ainkVar);
            i = 3;
        } else {
            i = 1;
        }
        if (z) {
            aiocVar.c.put(personId, ainkVar);
            s(aiocVar, personId, aioe.d(dbsg.i(ainkVar), personId, i));
        }
    }

    private final void s(aioc aiocVar, PersonId personId, final aioe aioeVar) {
        synchronized (aiocVar) {
            for (Map.Entry<aiod, Set<PersonId>> entry : aiocVar.b.entrySet()) {
                Set<PersonId> value = entry.getValue();
                if (value.isEmpty() || value.contains(personId)) {
                    final aiod key = entry.getKey();
                    this.b.execute(new Runnable(key, aioeVar) { // from class: ainy
                        private final aiod a;
                        private final aioe b;

                        {
                            this.a = key;
                            this.b = aioeVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a(dcdc.f(this.b));
                        }
                    });
                }
            }
        }
    }

    private final synchronized Enumeration<dbsg<btlu>> t() {
        return this.o.keys();
    }

    public final void a(List<PersonId> list, aiod aiodVar, dbsg<btlu> dbsgVar) {
        aioc l = l(dbsgVar);
        synchronized (l) {
            l.b.put(aiodVar, dcnm.e(list));
        }
    }

    public final void b(aiod aiodVar, dbsg<btlu> dbsgVar) {
        aioc l = l(dbsgVar);
        synchronized (l) {
            l.b.remove(aiodVar);
        }
    }

    public final dcdc<aink> c(dbsg<btlu> dbsgVar) {
        return dcdc.r(l(dbsgVar).c.values());
    }

    public final dbsg<aink> d(PersonId personId, dbsg<btlu> dbsgVar) {
        aioc l = l(dbsgVar);
        return l.c.containsKey(personId) ? dbsg.i(l.c.get(personId)) : dbpy.a;
    }

    public final void e(aiog aiogVar, dbsg<btlu> dbsgVar) {
        aioc l = l(dbsgVar);
        synchronized (l) {
            l.d.add(aiogVar);
        }
    }

    public final void f(aiog aiogVar, dbsg<btlu> dbsgVar) {
        aioc l = l(dbsgVar);
        synchronized (l) {
            l.d.remove(aiogVar);
        }
    }

    public final dbsg<aion> g(dbsg<btlu> dbsgVar) {
        return l(dbsgVar).a();
    }

    public final int h(dbsg<btlu> dbsgVar) {
        dbsg<aihw> b = this.d.b(dbsgVar);
        if (b.a()) {
            return b.b().e();
        }
        return 0;
    }

    public final void i() {
        Enumeration<dbsg<btlu>> t = t();
        while (t.hasMoreElements()) {
            j(t.nextElement());
        }
    }

    public final void j(dbsg<btlu> dbsgVar) {
        aioc l = l(dbsgVar);
        final dbsg<aion> m = m(dbsgVar);
        synchronized (l) {
            if (l.a().equals(m)) {
                return;
            }
            l.b(m);
            Iterator<aiog> it = l.d.iterator();
            while (it.hasNext()) {
                final aiog next = it.next();
                this.b.execute(new Runnable(next, m) { // from class: ainw
                    private final aiog a;
                    private final dbsg b;

                    {
                        this.a = next;
                        this.b = m;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c(this.b);
                    }
                });
            }
        }
    }

    public final void k(dbsg<btlu> dbsgVar, dbsg<PersonId> dbsgVar2) {
        aioc l = l(dbsgVar);
        HashSet e = dcnm.e(l.c.keySet());
        dbsg<aiik> b = this.f.b(l.a);
        dcdc<Profile> e2 = b.a() ? b.b().c : dcdc.e();
        HashSet e3 = dcnm.e(dcft.o(e2, ainx.a));
        int size = e2.size();
        for (int i = 0; i < size; i++) {
            Profile profile = e2.get(i);
            r(l, profile.a(), p(profile, l, false));
        }
        dbsg<aihw> b2 = this.d.b(l.a);
        if (b2.a()) {
            dcdc<ahwg> a = b2.b().a();
            int size2 = a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ahwg ahwgVar = a.get(i2);
                aink i3 = aink.i(ahwgVar.d(), dcdc.f(ahwgVar), this.h.a(l.a, ahwgVar.d()), this.m);
                e3.add(((aimz) i3).a);
                r(l, ahwgVar.d(), i3);
            }
        }
        if (b.a()) {
            dcdc<Profile> dcdcVar = b.b().b;
            int size3 = dcdcVar.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Profile profile2 = dcdcVar.get(i4);
                aink p = p(profile2, l, true);
                e3.add(((aimz) p).a);
                r(l, profile2.a(), p);
            }
        }
        if (dbsgVar2.a() && !e3.contains(dbsgVar2.b())) {
            dbsg<aink> q = q(dbsgVar2.b(), l);
            if (q.a()) {
                e3.add(dbsgVar2.b());
                r(l, dbsgVar2.b(), q.b());
            }
        }
        dcpd it = dcnm.p(e, e3).iterator();
        while (it.hasNext()) {
            PersonId personId = (PersonId) it.next();
            dbsg<aink> q2 = q(personId, l);
            if (q2.a()) {
                r(l, personId, q2.b());
            } else {
                l.c.remove(personId);
                s(l, personId, aioe.d(dbpy.a, personId, 2));
            }
        }
    }

    public final synchronized aioc l(dbsg<btlu> dbsgVar) {
        if (!this.o.containsKey(dbsgVar)) {
            this.o.put(dbsgVar, new aioc(dbsgVar, m(dbsgVar), h(dbsgVar)));
        }
        return this.o.get(dbsgVar);
    }
}
