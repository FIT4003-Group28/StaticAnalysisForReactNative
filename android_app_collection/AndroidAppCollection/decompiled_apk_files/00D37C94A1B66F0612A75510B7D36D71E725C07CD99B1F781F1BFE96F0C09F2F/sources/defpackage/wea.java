package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: wea  reason: default package */
/* loaded from: classes4.dex */
public final class wea {
    public final azqb a;
    public String b;
    public final aacz c;
    public final vne d;

    public wea(azqb azqbVar, vne vneVar, aacz aaczVar) {
        this.a = azqbVar;
        this.d = vneVar;
        this.c = aaczVar;
    }

    public static boolean e(aacz aaczVar) {
        athd athdVar = aaczVar.b().o;
        if (athdVar == null) {
            athdVar = athd.a;
        }
        aujq aujqVar = athdVar.g;
        if (aujqVar == null) {
            aujqVar = aujq.a;
        }
        return aujqVar.f;
    }

    public static ankt f(vne vneVar, String str) {
        return vneVar.b(new wdx(str, 6), anjk.a);
    }

    public final ankt a() {
        return this.d.b(wdp.d, anjk.a);
    }

    public final ankt b() {
        if (!e(this.c)) {
            ((SharedPreferences) this.a.get()).edit().remove("pre_incognito_signed_in_user_id").apply();
            return ankq.a;
        }
        return f(this.d, "");
    }

    public final ankt c(String str) {
        return anii.h(this.d.a(), new wdx(str, 1), anjk.a);
    }

    public final ankt d() {
        return anii.h(this.d.a(), wdp.e, anjk.a);
    }
}
