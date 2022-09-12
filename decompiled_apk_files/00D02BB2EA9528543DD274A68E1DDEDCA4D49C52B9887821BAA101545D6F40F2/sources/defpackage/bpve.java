package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
/* compiled from: PG */
/* renamed from: bpve  reason: default package */
/* loaded from: classes4.dex */
public final class bpve {
    public static CharSequence a(Context context, long j) {
        dbsk.a(j > 0);
        return DateUtils.formatDateTime(context, j, 98326);
    }

    public static CharSequence b(Context context, long j) {
        dbsk.a(j > 0);
        return DateUtils.formatDateTime(context, j, 1);
    }
}
