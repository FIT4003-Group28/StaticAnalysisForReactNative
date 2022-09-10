package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: bzsx  reason: default package */
/* loaded from: classes4.dex */
final class bzsx {
    public static String a(Iterable<bztm> iterable) {
        if (dcft.w(iterable)) {
            return null;
        }
        return TextUtils.join(" AND ", dcft.o(iterable, bzsw.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String b(Iterable iterable) {
        return "photo_uri IN (" + TextUtils.join(",", dcft.o(iterable, bzsv.a)) + ")";
    }
}
