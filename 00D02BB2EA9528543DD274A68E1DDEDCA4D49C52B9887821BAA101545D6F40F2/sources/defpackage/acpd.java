package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: acpd  reason: default package */
/* loaded from: classes2.dex */
public final class acpd {
    public static acmw a(CharSequence charSequence) {
        charSequence.toString();
        acmw acmwVar = new acmw(amb.a(Locale.getDefault()) == 1 ? String.format("· %s", charSequence) : String.format("%s ·", charSequence), 0);
        acmwVar.l(cqrt.d(R.dimen.stark_badge_text_size));
        acmwVar.m(cqrp.d(dcyn.a));
        acmwVar.k(cqrp.d(1.0d), cqrp.d(dcyn.a), cqrp.d(dcyn.a), cqrp.d(1.0d));
        acmwVar.o(irg.J());
        acmwVar.p(1);
        return acmwVar;
    }

    public static acmw b(CharSequence charSequence, int i, Resources resources) {
        int c = c(i, resources);
        acmw acmwVar = new acmw(charSequence, c);
        if (i == 4) {
            acmwVar.j(cqrp.d(-1.0d), cqrp.d(-1.0d), cqrp.d(3.0d));
            acmwVar.n(aclp.a(cqta.f(), cqta.d(c), cqrp.d(1.0d), cqrp.d(2.0d)));
            acmwVar.o(cqrt.c(R.color.ad_badge_background_green));
        }
        return acmwVar;
    }

    public static int c(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 != 2) {
            if (i2 == 3) {
                return resources.getColor(R.color.ad_badge_background_green);
            }
            return resources.getColor(R.color.ad_badge_background_yellow);
        }
        return resources.getColor(R.color.ad_badge_background_purple);
    }
}
