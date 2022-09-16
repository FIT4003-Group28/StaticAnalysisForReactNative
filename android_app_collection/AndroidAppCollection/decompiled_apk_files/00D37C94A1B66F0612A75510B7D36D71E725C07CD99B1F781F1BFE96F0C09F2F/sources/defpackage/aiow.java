package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aiow  reason: default package */
/* loaded from: classes.dex */
public final class aiow {
    public final yve a;

    public aiow(yve yveVar) {
        this.a = yveVar;
    }

    public static String b(afvm afvmVar, String str) {
        String d = afvmVar.d();
        StringBuilder sb = new StringBuilder(str.length() + 1 + d.length());
        sb.append(str);
        sb.append(":");
        sb.append(d);
        return sb.toString();
    }

    public static boolean f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("playability_adult_confirmations:");
    }

    public final ankt a(afvm afvmVar) {
        return anii.h(this.a.a(), new aiov(b(afvmVar, "playability_adult_confirmations")), anjk.a);
    }

    public final void e(afvm afvmVar, boolean z) {
        ylx.m(this.a.b(new fco(b(afvmVar, "playability_adult_confirmations"), z, 3)), afsc.s);
    }
}
