package defpackage;
/* compiled from: PG */
/* renamed from: bwec  reason: default package */
/* loaded from: classes4.dex */
final class bwec {
    private static final dcdn<ddho, czgq> a;
    private static final dcdn<Integer, czgq> b;

    static {
        dcdg p = dcdn.p();
        p.f(dtxn.aF, czgq.MAPS_DIRECTIONS_DETAILS_SHEET_SHARE_BUTTON);
        p.f(dtxo.T, czgq.MAPS_EDIT_PLACE_LIST_SAVE_BUTTON);
        p.f(dtxo.bR, czgq.MAPS_EXPERIENCE_DETAILS_ON_MAP_CARD_SHARE_BUTTON);
        p.f(dtxo.ce, czgq.MAPS_EXPERIENCE_DETAILS_TITLE_SHARE_BUTTON);
        p.f(dtxu.aE, czgq.MAPS_LOCAL_POST_LEAF_PAGE_SHARE_BUTTON);
        p.f(dtxu.ba, czgq.MAPS_LOCAL_POST_VIDEO_LIGHTBOX_SHARE_BUTTON);
        p.f(dtxu.cA, czgq.MAPS_LOCAL_STREAM_SHARE_BUTTON);
        p.f(dtxv.eI, czgq.MAPS_MY_MAPS_SHARE_BUTTON);
        p.f(dtxy.es, czgq.MAPS_PLACE_LIST_DETAILS_SHARE_BUTTON);
        p.f(dtxy.et, czgq.MAPS_PLACE_LIST_DETAILS_SHARE_THIRD_PARTY_BUTTON);
        p.f(dtxy.eL, czgq.MAPS_PLACE_LIST_SHARING_OPTIONS_ADD_PARTICIPANTS_BUTTON);
        p.f(dtxy.hm, czgq.MAPS_PLACE_SHEET_ADDRESS_SHARE_BUTTON);
        p.f(dtxy.jC, czgq.MAPS_PLACE_SHEET_LOCAL_POST_STREAM_SHARE_BUTTON);
        p.f(dtxy.mq, czgq.MAPS_PLACE_SHEET_SHARE_BUTTON);
        p.f(dtxy.oL, czgq.MAPS_PUBLIC_CONTRIBUTIONS_SHARE_CONTRIBUTIONS_PAGE_BUTTON);
        p.f(dtya.dS, czgq.MAPS_REVIEW_SHARE_BUTTON);
        p.f(dtyb.aa, czgq.MAPS_SAVED_PARKING_PLACE_SHEET_SHARE_BUTTON);
        p.f(dtyb.dK, czgq.MAPS_PLAN_SHARE_BUTTON);
        p.f(dtyb.eq, czgq.MAPS_STREET_VIEW_SHARE_BUTTON);
        p.f(dtyd.aP, czgq.MAPS_UGC_TASKS_TOOLBAR_SHARE_BUTTON);
        p.f(dtyd.cq, czgq.MAPS_USER_CONTRIBUTIONS_SHARE_CONTRIBUTIONS_PAGE_BUTTON);
        p.f(dtyf.S, czgq.MAPS_WRITE_REVIEW_THANK_YOU_PAGE_SHARE_BUTTON);
        final dcdn<ddho, czgq> b2 = p.b();
        a = b2;
        dcdn o = dcjz.o(b2.keySet(), bwea.a);
        b2.getClass();
        b = dcdn.r(dcjz.s(o, new dbrn(b2) { // from class: bweb
            private final dcdn a;

            {
                this.a = b2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.get((ddho) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static czgq a(@dzsi ddho ddhoVar) {
        if (ddhoVar == null) {
            return czgq.UNKNOWN;
        }
        return b.getOrDefault(Integer.valueOf(ddhoVar.b()), czgq.UNKNOWN);
    }
}
