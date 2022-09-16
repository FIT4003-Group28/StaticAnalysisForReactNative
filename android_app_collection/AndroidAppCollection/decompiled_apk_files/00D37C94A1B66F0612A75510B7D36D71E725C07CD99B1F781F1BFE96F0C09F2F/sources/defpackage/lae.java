package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lae  reason: default package */
/* loaded from: classes3.dex */
public final class lae extends mfs implements laq {
    private final TextView C;
    private final TextView D;
    private final ajrp a;
    private final ajrx b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;

    public lae(Context context, ajmy ajmyVar, aafo aafoVar, gem gemVar) {
        super(context, ajmyVar, aafoVar, gemVar, (int) R.layout.watch_card_one_vs_one_event_compact_video_item, (ViewGroup) null, (jkv) null, (ftb) null, (kua) null);
        this.b = gemVar;
        this.a = new ajrp(aafoVar, gemVar);
        View view = this.i;
        this.c = view.findViewById(R.id.thumbnail_layout);
        this.d = (TextView) view.findViewById(R.id.top_name);
        this.e = (TextView) view.findViewById(R.id.top_result);
        this.f = (TextView) view.findViewById(R.id.bottom_name);
        this.C = (TextView) view.findViewById(R.id.bottom_result);
        this.D = (TextView) view.findViewById(R.id.additional_event_description);
    }

    private static void d(View view, int i) {
        lj.Y(view, i, view.getPaddingTop(), lj.h(view), view.getPaddingBottom());
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.b).b;
    }

    @Override // defpackage.laq
    public final TextView f() {
        return this.D;
    }

    @Override // defpackage.laq
    public final TextView g() {
        return this.f;
    }

    @Override // defpackage.laq
    public final TextView h() {
        return this.C;
    }

    @Override // defpackage.laq
    public final TextView i() {
        return this.n;
    }

    @Override // defpackage.laq
    public final TextView j() {
        return this.d;
    }

    @Override // defpackage.laq
    public final TextView k() {
        return this.e;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        auyz auyzVar = (auyz) obj;
        ajrp ajrpVar = this.a;
        acti actiVar = ajrsVar.a;
        if ((auyzVar.b & 8) != 0) {
            apzgVar = auyzVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        ajrsVar.a.u(new acte(auyzVar.h), null);
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        ajrsVar2.b = auyzVar.h.I();
        auyy auyyVar = auyzVar.d;
        if (auyyVar == null) {
            auyyVar = auyy.h();
        }
        pns.k(this, auyyVar);
        int i = auyzVar.b;
        int i2 = 0;
        if ((i & 1) == 0) {
            this.c.setVisibility(8);
        } else {
            if ((i & 4) != 0) {
                aragVar = auyzVar.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b = ajgl.b(aragVar);
            if ((auyzVar.b & 4) != 0) {
                aragVar2 = auyzVar.e;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            p(b, ajgl.i(aragVar2), auyzVar.g, null);
            avhn avhnVar = auyzVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            z(avhnVar);
            this.c.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            Resources resources = this.g.getResources();
            i2 = resources.getDimensionPixelSize(R.dimen.watch_card_one_vs_one_event_padding_start);
            zgd.t(this.i, zgd.h(resources.getDimensionPixelSize(R.dimen.watch_card_one_vs_one_event_no_thumbnail_height) - resources.getDimensionPixelSize(R.dimen.line_separator_height)), ViewGroup.LayoutParams.class);
        }
        d(this.d, i2);
        d(this.f, i2);
        d(this.n, i2);
        d(this.D, i2);
        this.b.e(ajrsVar2);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.a.c();
    }
}
