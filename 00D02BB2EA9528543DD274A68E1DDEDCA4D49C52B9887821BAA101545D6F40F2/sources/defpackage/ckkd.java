package defpackage;
/* compiled from: PG */
/* renamed from: ckkd  reason: default package */
/* loaded from: classes4.dex */
public final class ckkd {
    public static final ckhg a = new ckhg("StreetViewInitTime", ckgy.STREETVIEW);
    public static final ckhg b = new ckhg("StreetViewFrameTime", ckgy.STREETVIEW);
    public static final ckhg c;
    public static final ckgu d;

    static {
        new ckhg("StreetViewPrepareTime", ckgy.STREETVIEW);
        new ckhg("StreetViewProtoLoadTime", ckgy.STREETVIEW);
        c = new ckhg("StreetViewTileLoadTime", ckgy.STREETVIEW);
        new ckgu("StreetViewPrepareFailureCount", ckgy.STREETVIEW);
        new ckgu("StreetViewProtoLoadFailureCount", ckgy.STREETVIEW);
        d = new ckgu("StreetViewTileLoadFailureCount", ckgy.STREETVIEW);
    }
}
