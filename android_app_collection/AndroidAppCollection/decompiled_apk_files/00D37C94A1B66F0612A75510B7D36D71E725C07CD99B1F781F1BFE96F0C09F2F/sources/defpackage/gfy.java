package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: gfy  reason: default package */
/* loaded from: classes3.dex */
public final class gfy {
    private static final amvn a = amvn.w("app_theme_appearance_edu_shown", "app_theme_not_match_system_edu_shown", "app_theme_dark", "app_theme_appearance", "auto_switch_theme_on_battery_saver", "auto_switch_theme_on_battery_saver_settings_toggle", new String[0]);

    public static gft a(vlq vlqVar, gft gftVar) {
        aopa mo52toBuilder = gftVar.mo52toBuilder();
        if (vlqVar.e("app_theme_appearance_edu_shown")) {
            boolean b = ymf.b("app_theme_appearance_edu_shown", vlqVar);
            mo52toBuilder.copyOnWrite();
            gft gftVar2 = (gft) mo52toBuilder.instance;
            gftVar2.b |= 1;
            gftVar2.c = b;
        }
        if (vlqVar.e("app_theme_not_match_system_edu_shown")) {
            boolean b2 = ymf.b("app_theme_not_match_system_edu_shown", vlqVar);
            mo52toBuilder.copyOnWrite();
            gft gftVar3 = (gft) mo52toBuilder.instance;
            gftVar3.b |= 2;
            gftVar3.d = b2;
        }
        if (vlqVar.e("app_theme_dark")) {
            boolean b3 = ymf.b("app_theme_dark", vlqVar);
            mo52toBuilder.copyOnWrite();
            gft gftVar4 = (gft) mo52toBuilder.instance;
            gftVar4.b |= 4;
            gftVar4.e = b3;
        }
        if (vlqVar.e("app_theme_appearance")) {
            String d = vlqVar.d("app_theme_appearance", "APPEARANCE_SYSTEM");
            mo52toBuilder.copyOnWrite();
            gft gftVar5 = (gft) mo52toBuilder.instance;
            d.getClass();
            gftVar5.b |= 8;
            gftVar5.f = d;
        }
        if (vlqVar.e("auto_switch_theme_on_battery_saver")) {
            boolean b4 = ymf.b("auto_switch_theme_on_battery_saver", vlqVar);
            mo52toBuilder.copyOnWrite();
            gft gftVar6 = (gft) mo52toBuilder.instance;
            gftVar6.b |= 16;
            gftVar6.g = b4;
        }
        if (vlqVar.e("auto_switch_theme_on_battery_saver_settings_toggle")) {
            boolean b5 = ymf.b("auto_switch_theme_on_battery_saver_settings_toggle", vlqVar);
            mo52toBuilder.copyOnWrite();
            gft gftVar7 = (gft) mo52toBuilder.instance;
            gftVar7.b |= 32;
            gftVar7.h = b5;
        }
        return (gft) mo52toBuilder.mo39build();
    }

    public static yve b(Context context, azqb azqbVar, ankw ankwVar, String str) {
        vlk vlkVar = (vlk) azqbVar.get();
        fdj fdjVar = fdj.h;
        gft gftVar = gft.a;
        return new yvc(vmu.b(ymf.f("theme_proto.pb", context, vlkVar, ankwVar, str, fdjVar, gftVar, a)), gftVar);
    }
}
