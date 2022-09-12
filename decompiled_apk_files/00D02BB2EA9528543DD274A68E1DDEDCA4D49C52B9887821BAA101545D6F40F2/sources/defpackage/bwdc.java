package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bwdc  reason: default package */
/* loaded from: classes4.dex */
public class bwdc {
    private final dxio<bttf> a;

    public bwdc(dxio<bttf> dxioVar) {
        this.a = dxioVar;
    }

    public static String b(String str, String str2, String str3) {
        debv a = debv.a(str);
        a.e(str2, str3);
        return a.c().toString();
    }

    public final String a(String str) {
        String a = bvom.a(Locale.getDefault());
        debv a2 = debv.a(str);
        a2.e("hl", a);
        a2.e("gl", this.a.a().a());
        return a2.c().toString();
    }
}
