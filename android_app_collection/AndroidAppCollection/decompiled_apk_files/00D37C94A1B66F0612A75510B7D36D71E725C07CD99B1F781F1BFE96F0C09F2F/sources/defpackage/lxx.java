package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: lxx  reason: default package */
/* loaded from: classes3.dex */
public final class lxx {
    private static final amvn a = amvn.s(lxy.FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, lxy.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT);

    public static lxz a(vlq vlqVar, lxz lxzVar) {
        aopa mo52toBuilder = lxzVar.mo52toBuilder();
        if (vlqVar.e(lxy.FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP)) {
            long b = vlqVar.b(lxy.FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, -1L);
            mo52toBuilder.copyOnWrite();
            lxz lxzVar2 = (lxz) mo52toBuilder.instance;
            lxzVar2.b |= 1;
            lxzVar2.c = b;
        }
        if (vlqVar.e(lxy.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT)) {
            int a2 = vlqVar.a(lxy.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT, 0);
            mo52toBuilder.copyOnWrite();
            lxz lxzVar3 = (lxz) mo52toBuilder.instance;
            lxzVar3.b |= 2;
            lxzVar3.d = a2;
        }
        return (lxz) mo52toBuilder.mo39build();
    }

    public static yve b(Context context, azqb azqbVar, ankw ankwVar, String str, yke ykeVar) {
        return ymf.e("topbar_proto.pb", context, (vlk) azqbVar.get(), ankwVar, str, lto.c, lxz.a, a, ykeVar);
    }
}
