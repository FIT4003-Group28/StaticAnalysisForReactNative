package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abil  reason: default package */
/* loaded from: classes.dex */
public final class abil {
    private final dxio<adce> a;
    private final dxio<adat> b;
    private final dxio<adfy> c;
    private final dxio<adbf> d;
    private final dxio<adbf> e;
    private final dxio<adbf> f;
    private final dxio<adah> g;
    private final dxio<adjl> h;
    private final dxio<adkf> i;
    private final dxio<adko> j;
    private final dxio<adjb> k;
    private final Map<dkss, dxio<? extends aczy<? extends aczr>>> l = new aif();

    public abil(final adau adauVar, final adcf adcfVar, final adfz adfzVar, final adkg adkgVar, final adkp adkpVar, final adbg adbgVar, final adai adaiVar, final adjm adjmVar, final adjc adjcVar, final adfu adfuVar, final absg absgVar) {
        this.a = btsp.b(new dbty(adcfVar, absgVar) { // from class: abhy
            private final adcf a;
            private final absg b;

            {
                this.a = adcfVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adcf adcfVar2 = this.a;
                absg absgVar2 = this.b;
                adcf.a(adcfVar2.a.a(), 1);
                acyr a = adcfVar2.b.a();
                adcf.a(a, 2);
                adci a2 = adcfVar2.c.a();
                adcf.a(a2, 3);
                adcf.a(absgVar2, 4);
                return new adce(a, a2, absgVar2);
            }
        });
        this.i = btsp.b(new dbty(adkgVar, absgVar) { // from class: abic
            private final adkg a;
            private final absg b;

            {
                this.a = adkgVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(this.b);
            }
        });
        this.b = btsp.b(new dbty(adauVar, absgVar) { // from class: abid
            private final adau a;
            private final absg b;

            {
                this.a = adauVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adau adauVar2 = this.a;
                absg absgVar2 = this.b;
                dktk dktkVar = dktk.EXPLORE;
                acyr a = adauVar2.a.a();
                adau.a(a, 1);
                adbb a2 = adauVar2.b.a();
                adau.a(a2, 2);
                adau.a(dktkVar, 3);
                adau.a(absgVar2, 4);
                return new adat(a, a2, dktkVar, absgVar2);
            }
        });
        this.e = btsp.b(new dbty(adbgVar, absgVar) { // from class: abie
            private final adbg a;
            private final absg b;

            {
                this.a = adbgVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(dpwr.HOMESCREEN_EXPLORE, this.b);
            }
        });
        this.f = btsp.b(new dbty(adbgVar, absgVar) { // from class: abif
            private final adbg a;
            private final absg b;

            {
                this.a = adbgVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(dpwr.HOMESCREEN_EXPLORE_PROMINENT, this.b);
            }
        });
        this.d = btsp.b(new dbty(adbgVar, absgVar) { // from class: abig
            private final adbg a;
            private final absg b;

            {
                this.a = adbgVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(dpwr.HOMESCREEN_EXPLORE_HERO, this.b);
            }
        });
        this.g = btsp.b(new dbty(adaiVar, absgVar) { // from class: abih
            private final adai a;
            private final absg b;

            {
                this.a = adaiVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adai adaiVar2 = this.a;
                absg absgVar2 = this.b;
                dpwr dpwrVar = dpwr.HOMESCREEN_EXPLORE;
                adai.a(dpwrVar, 1);
                adai.a(absgVar2, 2);
                dxio a = ((dxjh) adaiVar2.a).a();
                adai.a(a, 3);
                acyr a2 = adaiVar2.b.a();
                adai.a(a2, 4);
                return new adah(dpwrVar, absgVar2, a, a2);
            }
        });
        this.h = btsp.b(new dbty(adjmVar, absgVar) { // from class: abii
            private final adjm a;
            private final absg b;

            {
                this.a = adjmVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(awvv.n, awvv.o, this.b);
            }
        });
        btsp.b(new dbty(adjmVar, absgVar) { // from class: abij
            private final adjm a;
            private final absg b;

            {
                this.a = adjmVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a(awvv.p, null, this.b);
            }
        });
        this.k = btsp.b(new dbty(adjcVar, absgVar) { // from class: abik
            private final adjc a;
            private final absg b;

            {
                this.a = adjcVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adjc adjcVar2 = this.a;
                absg absgVar2 = this.b;
                adjc.a(adjcVar2.a.a(), 1);
                acyr a = adjcVar2.b.a();
                adjc.a(a, 2);
                adji a2 = adjcVar2.c.a();
                adjc.a(a2, 3);
                adjc.a(absgVar2, 4);
                return new adjb(a, a2, absgVar2);
            }
        });
        this.j = btsp.b(new dbty(adkpVar, absgVar) { // from class: abhz
            private final adkp a;
            private final absg b;

            {
                this.a = adkpVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adkp adkpVar2 = this.a;
                absg absgVar2 = this.b;
                adkp.a(adkpVar2.a.a(), 1);
                acyr a = adkpVar2.b.a();
                adkp.a(a, 2);
                adlh a2 = adkpVar2.c.a();
                adkp.a(a2, 3);
                adkp.a(absgVar2, 4);
                return new adko(a, a2, absgVar2);
            }
        });
        this.c = btsp.b(new dbty(adfzVar, absgVar) { // from class: abia
            private final adfz a;
            private final absg b;

            {
                this.a = adfzVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adfz adfzVar2 = this.a;
                absg absgVar2 = this.b;
                acyr a = adfzVar2.a.a();
                adfz.a(a, 1);
                adgh a2 = adfzVar2.b.a();
                adfz.a(a2, 2);
                adfz.a(absgVar2, 3);
                return new adfy(a, a2, absgVar2);
            }
        });
        btsp.b(new dbty(adfuVar) { // from class: abib
            private final adfu a;

            {
                this.a = adfuVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a;
            }
        });
    }

    public static final List<dxio<? extends aczy<? extends aczr>>> c(Map<dkss, dxio<? extends aczy<? extends aczr>>> map, List<dkss> list) {
        ArrayList arrayList = new ArrayList();
        for (dkss dkssVar : list) {
            if (map.containsKey(dkssVar)) {
                arrayList.add(map.get(dkssVar));
            }
        }
        return arrayList;
    }

    public final Map<dkss, dxio<? extends aczy<? extends aczr>>> a() {
        if (this.l.isEmpty()) {
            b(this.l);
            this.l.put(dkss.FEEDBACK, this.b);
            this.l.put(dkss.LEGAL_DISCLAIMER, this.c);
            this.l.put(dkss.BEST_OF_LISTS, this.a);
            this.l.put(dkss.TOURIST_PLACES, this.i);
            this.l.put(dkss.SCAVENGER_HUNT, this.h);
            this.l.put(dkss.VISUAL_EXPLORE_TEASER, this.j);
            this.l.put(dkss.NEARBY_EXPERIENCES, this.g);
            this.l.put(dkss.POPULAR_AREAS_CAROUSEL, this.k);
        }
        return this.l;
    }

    public final void b(Map<dkss, dxio<? extends aczy<? extends aczr>>> map) {
        if (!map.containsKey(dkss.PROMINENT_MAJOR_EVENTS)) {
            map.put(dkss.PROMINENT_MAJOR_EVENTS, this.f);
        }
        if (!map.containsKey(dkss.MAJOR_EVENTS)) {
            map.put(dkss.MAJOR_EVENTS, this.e);
        }
        if (!map.containsKey(dkss.HERO_MAJOR_EVENTS)) {
            map.put(dkss.HERO_MAJOR_EVENTS, this.d);
        }
    }
}
