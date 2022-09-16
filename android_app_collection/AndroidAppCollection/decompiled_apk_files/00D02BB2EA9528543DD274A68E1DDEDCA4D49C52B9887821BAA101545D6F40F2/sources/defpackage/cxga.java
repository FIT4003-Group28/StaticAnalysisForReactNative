package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cxga  reason: default package */
/* loaded from: classes5.dex */
public final class cxga {
    static final cxfz<eacc> a = new cxfw();
    static final cxfz<dzxz> b = new cxfx();
    static final cxfz<eaak> c = new cxfy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends dssi> void a(cxfz<T> cxfzVar, T t) {
        if (TextUtils.isEmpty(cxfzVar.c(t))) {
            cxfzVar.a(t, deka.a(cxfzVar.b(t)));
        } else {
            cxfzVar.a(t, null);
        }
        cxfzVar.d(t);
    }

    public static String[] b(String str) {
        return str.replaceFirst("^/+", "").split("/+");
    }
}
