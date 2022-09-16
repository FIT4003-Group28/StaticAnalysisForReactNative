package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: okx  reason: default package */
/* loaded from: classes3.dex */
public final class okx {
    private static final amvn a = amvn.t(oky.PIVOT_BAR_LIBRARY_TAB_VISITED, oky.PIVOT_BAR_ACCOUNT_HINT_SHOWN, oky.PIVOT_BAR_LIBRARY_HINT_TIMESTAMP);

    public static okz a(vlq vlqVar, okz okzVar) {
        aopa mo52toBuilder = okzVar.mo52toBuilder();
        if (vlqVar.e(oky.PIVOT_BAR_LIBRARY_TAB_VISITED)) {
            boolean b = ymf.b(oky.PIVOT_BAR_LIBRARY_TAB_VISITED, vlqVar);
            mo52toBuilder.copyOnWrite();
            okz okzVar2 = (okz) mo52toBuilder.instance;
            okzVar2.b |= 1;
            okzVar2.c = b;
        }
        if (vlqVar.e(oky.PIVOT_BAR_ACCOUNT_HINT_SHOWN)) {
            boolean b2 = ymf.b(oky.PIVOT_BAR_ACCOUNT_HINT_SHOWN, vlqVar);
            mo52toBuilder.copyOnWrite();
            okz okzVar3 = (okz) mo52toBuilder.instance;
            okzVar3.b |= 2;
            okzVar3.d = b2;
        }
        if (vlqVar.e(oky.PIVOT_BAR_LIBRARY_HINT_TIMESTAMP)) {
            long b3 = vlqVar.b(oky.PIVOT_BAR_LIBRARY_HINT_TIMESTAMP, 0L);
            mo52toBuilder.copyOnWrite();
            okz okzVar4 = (okz) mo52toBuilder.instance;
            okzVar4.b |= 4;
            okzVar4.e = b3;
        }
        return (okz) mo52toBuilder.mo39build();
    }

    public static yve b(Context context, azqb azqbVar, ankw ankwVar, String str, yke ykeVar) {
        return ymf.e("pivotbar_proto.pb", context, (vlk) azqbVar.get(), ankwVar, str, lto.d, okz.a, a, ykeVar);
    }
}
