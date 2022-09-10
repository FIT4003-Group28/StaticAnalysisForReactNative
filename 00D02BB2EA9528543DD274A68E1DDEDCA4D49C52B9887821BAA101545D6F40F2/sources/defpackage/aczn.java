package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aczn  reason: default package */
/* loaded from: classes.dex */
public final class aczn {
    static final List<dkss> a;
    public static final /* synthetic */ int e = 0;
    public final dbty<dkur> b;
    public final dbty<List<dkss>> c = dbud.a(new dbty(this) { // from class: aczl
        private final aczn a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            dkuq dkuqVar = this.a.b.a().V;
            if (dkuqVar == null) {
                dkuqVar = dkuq.b;
            }
            return aczn.a(dkuqVar);
        }
    });
    public final dbty<List<dkss>> d = dbud.a(new dbty(this) { // from class: aczm
        private final aczn a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            aczn acznVar = this.a;
            acznVar.c.a();
            dkuq dkuqVar = acznVar.b.a().W;
            if (dkuqVar == null) {
                dkuqVar = dkuq.b;
            }
            return aczn.a(dkuqVar);
        }
    });

    static {
        dccx F = dcdc.F();
        F.h(dkss.PROMINENT_MAJOR_EVENTS, dkss.IMPORTANT_VENUES, dkss.PARKING_PAYMENT, dkss.EXPLORE_AREA_SUMMARY, dkss.CRISIS, dkss.GEO_VERTICALS, dkss.EXPLORE_CELEBRATION_CONTENT, dkss.NEARBY_PLACE_SETS, dkss.HERO_MAJOR_EVENTS, dkss.PERSONAL_INTEREST_PLACES, dkss.TOURIST_PLACES, dkss.NEARBY_HOTELS, dkss.AREA_QUESTIONS_AND_ANSWERS, dkss.BEST_OF_LISTS, dkss.SCAVENGER_HUNT, dkss.VIDEO_LISTS, dkss.EXPLORE_ACTIVITIES, dkss.EXPLORE_ENTRYPOINT, dkss.MAJOR_EVENTS, dkss.NEARBY_EXPERIENCES, dkss.KNOWN_PLACES, dkss.RECOMMENDED_PLACES, dkss.EXPLORE_CATEGORIES, dkss.EXPLORE_PHOTOS, dkss.EXPLORE_FACTS, dkss.VISUAL_EXPLORE_TEASER, dkss.POPULAR_AREAS_CAROUSEL, dkss.NEWLY_OPENED_PLACE_SETS, dkss.PLACE_IN_THE_NEWS_SETS, dkss.PLACES_FROM_THE_NEWS, dkss.UGC_REVIEWS);
        F.h(dkss.FEEDBACK, dkss.LEGAL_DISCLAIMER, dkss.EXPLORE_EXPERIMENTAL_CONTENT);
        F.g(dkss.YOUR_EXPLORE_FEED);
        a = F.f();
    }

    public aczn(final btvo btvoVar, dxio<bzmc> dxioVar) {
        this.b = dbud.a(new dbty(btvoVar) { // from class: aczk
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                btvo btvoVar2 = this.a;
                int i = aczn.e;
                return btvoVar2.getPassiveAssistParameters().a();
            }
        });
    }

    public static List<dkss> a(dkuq dkuqVar) {
        aih aihVar = new aih();
        ArrayList arrayList = new ArrayList();
        for (dksu dksuVar : dkuqVar.a) {
            dkss b = dkss.b(dksuVar.a);
            if (b == null) {
                b = dkss.UNKNOWN_ASSISTIVE_CONTENT_TYPE;
            }
            if (!aihVar.contains(b)) {
                dkss b2 = dkss.b(dksuVar.a);
                if (b2 == null) {
                    b2 = dkss.UNKNOWN_ASSISTIVE_CONTENT_TYPE;
                }
                aihVar.add(b2);
                dkss b3 = dkss.b(dksuVar.a);
                if (b3 == null) {
                    b3 = dkss.UNKNOWN_ASSISTIVE_CONTENT_TYPE;
                }
                arrayList.add(b3);
            }
        }
        for (dkss dkssVar : a) {
            if (!aihVar.contains(dkssVar)) {
                aihVar.add(dkssVar);
                arrayList.add(dkssVar);
            }
        }
        return arrayList;
    }
}
