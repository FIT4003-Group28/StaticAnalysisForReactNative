package defpackage;
/* compiled from: PG */
/* renamed from: ckam  reason: default package */
/* loaded from: classes4.dex */
public enum ckam implements dbty<cqiw<oxr>> {
    GENERIC_PHOTO_CAROUSEL_4_ITEMS,
    PLACE_PHOTO_CAROUSEL_4_ITEMS,
    PLACE_SNIPPET_CAROUSEL,
    LIST_ITEM_WITH_PHOTO_CAROUSEL;

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ cqiw<oxr> a() {
        ckaq ckaqVar = ckaq.PROFILE_RATING_PICKER;
        ckaj ckajVar = ckaj.FOOTER_SIMPLE;
        ckar ckarVar = ckar.PROFILE_SUMMARY;
        ckao ckaoVar = ckao.PLACE_SUMMARY;
        ckas ckasVar = ckas.TILED_ICON_EXPANDER;
        ckal ckalVar = ckal.PLACE_PHOTO_LIST;
        ckap ckapVar = ckap.PLACE_SUMMARY_COMPACT_WITH_DIRECTIONS_ACTION;
        ckak ckakVar = ckak.NEARBY_STATION_SUMMARY;
        ckan ckanVar = ckan.PROFILE_ACTIVITY;
        ckat ckatVar = ckat.DIRECTIONS_SUMMARY_COMPACT;
        ckai ckaiVar = ckai.HORIZONTAL_LIST_SCROLLABLE;
        int ordinal = ordinal();
        return (ordinal == 0 || ordinal == 1) ? new okp() : ordinal != 2 ? ordinal != 3 ? ckau.a(this) : new ohz() : new onf();
    }
}
