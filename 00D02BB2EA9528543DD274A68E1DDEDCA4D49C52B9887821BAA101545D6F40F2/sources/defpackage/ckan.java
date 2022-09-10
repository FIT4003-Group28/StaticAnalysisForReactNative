package defpackage;
/* compiled from: PG */
/* renamed from: ckan  reason: default package */
/* loaded from: classes4.dex */
public enum ckan implements dbty<cqiw<blkw>> {
    PROFILE_ACTIVITY,
    PLACE_SNIPPET,
    PLACE_SNIPPET_WITH_CATEGORY,
    PLACE_SNIPPET_WITH_CATEGORY_BLURRED,
    GENERIC_PLACE_SNIPPET,
    PLACE_SNIPPET_WITH_RIGHT_BUTTON,
    PLACE_TITLE;

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ cqiw<blkw> a() {
        ckaq ckaqVar = ckaq.PROFILE_RATING_PICKER;
        ckaj ckajVar = ckaj.FOOTER_SIMPLE;
        ckar ckarVar = ckar.PROFILE_SUMMARY;
        ckao ckaoVar = ckao.PLACE_SUMMARY;
        ckas ckasVar = ckas.TILED_ICON_EXPANDER;
        ckam ckamVar = ckam.GENERIC_PHOTO_CAROUSEL_4_ITEMS;
        ckal ckalVar = ckal.PLACE_PHOTO_LIST;
        ckap ckapVar = ckap.PLACE_SUMMARY_COMPACT_WITH_DIRECTIONS_ACTION;
        ckak ckakVar = ckak.NEARBY_STATION_SUMMARY;
        ckat ckatVar = ckat.DIRECTIONS_SUMMARY_COMPACT;
        ckai ckaiVar = ckai.HORIZONTAL_LIST_SCROLLABLE;
        switch (ordinal()) {
            case 0:
                return new blbz();
            case 1:
                return new ouq();
            case 2:
                return new blbz();
            case 3:
                return new bfzm();
            case 4:
                return new ouq();
            case 5:
                return new ouq();
            case 6:
                return new opd();
            default:
                return ckau.a(this);
        }
    }
}
