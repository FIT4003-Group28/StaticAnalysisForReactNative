package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: jyu  reason: default package */
/* loaded from: classes3.dex */
public final class jyu implements aibg {
    private static final amuk a = amuk.t("en_US", "en_CA", "es_MX");
    private final akfg b;
    private final dt c;
    private final airr d;
    private final jxt e;
    private final jyt f;
    private final Context g;
    private boolean h;
    private final aacz i;

    public jyu(Context context, dt dtVar, airr airrVar, jyt jytVar, akfg akfgVar, aacz aaczVar) {
        this.g = context;
        dtVar.getClass();
        this.c = dtVar;
        this.d = airrVar;
        this.f = jytVar;
        this.b = akfgVar;
        jxt jxtVar = new jxt(dtVar.getString(R.string.subtitles), new jys(this));
        this.e = jxtVar;
        jxtVar.g(true);
        this.i = aaczVar;
    }

    private static String f(SubtitleTrack subtitleTrack) {
        if (subtitleTrack == null || subtitleTrack.p() || subtitleTrack.l()) {
            return null;
        }
        return subtitleTrack.toString();
    }

    public final jxt a() {
        if (eog.aM(this.i) && !eog.aN(this.i)) {
            this.e.g(false);
        }
        return this.e;
    }

    public final void b() {
        this.d.C(new jyr(this));
    }

    public final void c() {
        akfg akfgVar = this.b;
        fvg d = fvl.d();
        d.e(true);
        d.k(this.c.getString(R.string.no_subtitles));
        d.i(-1);
        akfgVar.n(d.b());
    }

    public final void d(SubtitleTrack subtitleTrack) {
        if (subtitleTrack == null || subtitleTrack.p()) {
            akfg akfgVar = this.b;
            fvg d = fvl.d();
            d.e(true);
            d.k(this.c.getString(R.string.subtitles_cc_turned_off));
            d.i(-1);
            akfgVar.n(d.b());
            return;
        }
        akfg akfgVar2 = this.b;
        fvg d2 = fvl.d();
        d2.e(true);
        d2.k(this.c.getString(R.string.subtitles_cc_turned_on_with_language, new Object[]{f(subtitleTrack)}));
        d2.i(-1);
        akfgVar2.n(d2.b());
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
        this.e.e = zag.f(this.g, a.contains(this.c.getResources().getConfiguration().locale.toString()) ? true != z ? 2131233365 : 2131233223 : true != z ? 2131232770 : 2131232769, R.attr.ytTextPrimary);
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
        this.h = z;
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
        String string;
        this.f.a(subtitleTrack);
        jxt jxtVar = this.e;
        if (this.h) {
            string = f(subtitleTrack);
        } else {
            string = this.c.getString(R.string.subtitles_unavailable_menu_item_secondary_text);
        }
        jxtVar.d(string);
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        this.f.b(aibfVar);
    }

    @Override // defpackage.aibg
    public final void r(List list) {
        this.f.c(list);
        this.f.d(this.c);
    }
}
