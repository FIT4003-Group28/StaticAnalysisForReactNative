package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bvod  reason: default package */
/* loaded from: classes4.dex */
public final class bvod {
    public static String a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd_kk.mm.ss", Locale.ROOT).format(date);
    }
}
