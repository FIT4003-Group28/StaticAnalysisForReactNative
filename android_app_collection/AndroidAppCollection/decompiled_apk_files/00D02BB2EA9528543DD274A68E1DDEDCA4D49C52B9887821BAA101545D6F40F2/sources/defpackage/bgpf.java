package defpackage;

import android.app.Activity;
import android.text.Html;
import android.text.SpannableString;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bgpf  reason: default package */
/* loaded from: classes3.dex */
public class bgpf implements bgnw {
    public static final cqtd a = cqrt.g(2131232706, ibm.o());
    private final Activity b;
    private final btvo c;
    private final cjtd d;
    private final String e;
    private final Boolean f;
    private final dgbu g;
    private final dgbu h;
    @dzsi
    private acpa i;
    private int j;

    public bgpf(Activity activity, btvo btvoVar, ilo iloVar, dipk dipkVar, int i) {
        this.b = activity;
        this.c = btvoVar;
        this.j = i;
        this.d = iloVar.bZ();
        this.e = dipkVar.q;
        int a2 = dgby.a(dipkVar.t);
        boolean z = false;
        if (a2 != 0 && a2 == 2) {
            z = true;
        }
        this.f = Boolean.valueOf(z);
        this.g = q(dipkVar, 2);
        this.h = q(dipkVar, 3);
    }

    private static String o() {
        return String.format("https://support.google.com/business/answer/7213077?hl=%s", Locale.getDefault().getLanguage());
    }

    private static int p(dgbu dgbuVar) {
        long j = dgbuVar.b;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    private static dgbu q(dipk dipkVar, int i) {
        if ((dipkVar.a & ImageMetadata.LENS_APERTURE) != 0) {
            dgbw dgbwVar = dipkVar.u;
            if (dgbwVar == null) {
                dgbwVar = dgbw.b;
            }
            for (dgbu dgbuVar : dgbwVar.a) {
                int a2 = dgbt.a(dgbuVar.a);
                if (a2 == 0) {
                    a2 = 1;
                    continue;
                }
                if (a2 == i) {
                    return dgbuVar;
                }
            }
        }
        return dgbu.d;
    }

    @Override // defpackage.bgnw
    public Boolean a() {
        return this.f;
    }

    @Override // defpackage.bgnw
    public Boolean b() {
        boolean z = false;
        if (this.f.booleanValue() && !this.c.getMerchantExperienceParameters().f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgnw
    public Boolean c() {
        boolean z = true;
        if (this.g.b == 0 && this.h.b == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgnw
    public String d() {
        return this.b.getResources().getQuantityString(R.plurals.POST_INSIGHTS_VIEWS_PLURALS, p(this.g), this.g.c);
    }

    @Override // defpackage.bgnw
    public String e() {
        return this.b.getResources().getQuantityString(R.plurals.POST_INSIGHTS_CLICKS_PLURALS, p(this.h), this.h.c);
    }

    @Override // defpackage.bgnw
    public cjtd f(ddho ddhoVar) {
        cjta c = cjtd.c(this.d);
        c.d = ddhoVar;
        c.g(this.e);
        return c.a();
    }

    @Override // defpackage.bgnw
    public acpa g() {
        if (this.i == null) {
            this.i = new acpc(this.b.getString(R.string.POST_INSIGHTS_TOOLTIP), this.b.getString(R.string.POST_INSIGHTS_TOOLTIP_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.j + 1)}), a);
        }
        return this.i;
    }

    @Override // defpackage.bgnw
    public CharSequence h() {
        SpannableString spannableString = new SpannableString(Html.fromHtml(this.b.getString(R.string.POST_REMOVED_LABEL, new Object[]{o()})));
        jmw.i(spannableString, ibm.y().b(this.b));
        return spannableString;
    }

    @Override // defpackage.bgnw
    public cqkl i() {
        btme.a(this.b).b(o());
        return cqkl.a;
    }

    @Override // defpackage.bgnw
    public void j(int i) {
        this.j = i;
        this.i = new acpc(this.b.getString(R.string.POST_INSIGHTS_TOOLTIP), this.b.getString(R.string.POST_INSIGHTS_TOOLTIP_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(i + 1)}));
    }

    @Override // defpackage.bgnw
    public String k() {
        return this.b.getString(R.string.POST_INSIGHTS_NO_VALUES_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.j + 1)});
    }

    @Override // defpackage.bgnw
    public String l() {
        return this.b.getString(R.string.POST_INSIGHTS_VIEWS_AND_CLICKS_CONTENT_DESCRIPTION, new Object[]{d(), e(), Integer.valueOf(this.j + 1)});
    }

    @Override // defpackage.bgnw
    public String m() {
        return this.b.getString(R.string.POST_REMOVED_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.j + 1)});
    }

    @Override // defpackage.bgnw
    public String n() {
        return this.b.getString(R.string.POST_REMOVED_VISIBILITY_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.j + 1)});
    }
}
