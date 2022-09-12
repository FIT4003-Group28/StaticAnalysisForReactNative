package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: btbp  reason: default package */
/* loaded from: classes4.dex */
public final class btbp {
    public static final dbsg<String> a(Locale locale) {
        return dbsg.i(locale.toLanguageTag());
    }

    public static final dbsg<Locale> b(@dzsi String str) {
        return !dbsj.d(str) ? dbsg.i(Locale.forLanguageTag(str)) : dbpy.a;
    }
}
