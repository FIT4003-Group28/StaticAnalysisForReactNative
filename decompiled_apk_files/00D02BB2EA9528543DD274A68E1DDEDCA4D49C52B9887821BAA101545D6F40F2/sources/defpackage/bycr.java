package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bycr  reason: default package */
/* loaded from: classes.dex */
public final class bycr {
    public static boolean a(bttf bttfVar) {
        return Locale.KOREA.getCountry().equals(bttfVar.a());
    }

    public static Locale b(bttf bttfVar) {
        return Locale.GERMANY.getCountry().equals(bttfVar.a()) ? Locale.GERMANY : Locale.getDefault();
    }
}
