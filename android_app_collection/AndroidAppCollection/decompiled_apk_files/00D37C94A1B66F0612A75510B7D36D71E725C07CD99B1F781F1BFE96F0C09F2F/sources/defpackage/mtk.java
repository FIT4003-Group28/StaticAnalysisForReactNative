package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mtk  reason: default package */
/* loaded from: classes3.dex */
public final class mtk extends mfs {
    private final ajrx C;
    private final ajrp D;
    private final mww E;
    public final RelativeLayout a;
    public aqen b;
    private final LinearLayout c;
    private final TextView d;
    private final Resources e;
    private final ajyc f;

    public mtk(Context context, ajmy ajmyVar, aafo aafoVar, gem gemVar, ajyc ajycVar, tjv tjvVar, enm enmVar) {
        super(context, ajmyVar, aafoVar, gemVar, R.layout.compact_promoted_video_item, null, null);
        this.C = gemVar;
        this.e = context.getResources();
        ajycVar.getClass();
        this.f = ajycVar;
        this.D = new ajrp(aafoVar, gemVar);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.c = linearLayout;
        this.a = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.ad_call_to_action);
        this.d = textView;
        textView.setOnClickListener(new mti(this, aafoVar));
        this.E = new mww(aafoVar, tjvVar, enmVar, a());
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.C).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        aozy aozyVar;
        arag aragVar;
        arag aragVar2;
        Spanned spanned;
        arag aragVar3;
        arag aragVar4;
        int dimension;
        aqen aqenVar = (aqen) obj;
        ajrp ajrpVar = this.D;
        acti actiVar = ajrsVar.a;
        if ((aqenVar.b & 512) != 0) {
            apzgVar = aqenVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        aqenVar.getClass();
        this.b = aqenVar;
        mww mwwVar = this.E;
        acti actiVar2 = ajrsVar.a;
        String str = aqenVar.q;
        amuk a = mww.a(aqenVar.k);
        if ((aqenVar.b & 65536) != 0) {
            aozy aozyVar2 = aqenVar.o;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        mwwVar.d(actiVar2, aqenVar, str, a, aozyVar, aqenVar.j.I());
        if ((aqenVar.b & 4) != 0) {
            aragVar = aqenVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        B(ajgl.b(aragVar));
        if ((aqenVar.b & 16) != 0) {
            aragVar2 = aqenVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b = ajgl.b(aragVar2);
        int i = aqenVar.b;
        if ((i & 128) != 0) {
            arag aragVar5 = aqenVar.g;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            spanned = ajgl.b(aragVar5);
        } else if ((i & 64) != 0) {
            arag aragVar6 = aqenVar.f;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            spanned = ajgl.b(aragVar6);
        } else {
            spanned = null;
        }
        m(b, spanned, false);
        if ((aqenVar.b & 256) != 0) {
            aragVar3 = aqenVar.h;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b2 = ajgl.b(aragVar3);
        if ((aqenVar.b & 256) != 0) {
            aragVar4 = aqenVar.h;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        o(b2, ajgl.i(aragVar4));
        if (hqs.q(ajrsVar)) {
            this.c.setOrientation(1);
            this.z = this.e.getInteger(R.integer.compact_renderer_title_grid_mode_max_lines);
            zgd.t(this.a, zgd.r(-1), LinearLayout.LayoutParams.class);
            dimension = 0;
        } else {
            this.c.setOrientation(0);
            this.z = this.e.getInteger(R.integer.compact_renderer_title_max_lines);
            dimension = (int) this.e.getDimension(R.dimen.compact_video_thumbnail_margin);
            this.a.getViewTreeObserver().addOnPreDrawListener(new mtj(this, aqenVar));
        }
        zgd.t(this.a, zgd.k(dimension), LinearLayout.LayoutParams.class);
        avhn avhnVar = aqenVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        z(avhnVar);
        aqem aqemVar = this.b.p;
        if (aqemVar == null) {
            aqemVar = aqem.a;
        }
        if ((aqemVar.b & 1) == 0) {
            this.n.setVisibility(0);
            this.d.setVisibility(8);
        } else {
            aqem aqemVar2 = this.b.p;
            if (aqemVar2 == null) {
                aqemVar2 = aqem.a;
            }
            aujn aujnVar = aqemVar2.c;
            if (aujnVar == null) {
                aujnVar = aujn.a;
            }
            arag aragVar7 = aujnVar.c;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            Spanned b3 = ajgl.b(aragVar7);
            if (!TextUtils.isEmpty(b3)) {
                this.d.setText(b3);
                this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else {
                this.d.setText((CharSequence) null);
                kz.t(this.d, 0, 2131230868);
            }
            this.n.setVisibility(4);
            this.d.setVisibility(0);
        }
        ates atesVar = aqenVar.m;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) == 0) {
            this.y.setVisibility(8);
        } else {
            ajyc ajycVar = this.f;
            View view = ((gem) this.C).b;
            View view2 = this.y;
            ates atesVar2 = aqenVar.m;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atep atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
            ajycVar.e(view, view2, atepVar, aqenVar, ajrsVar.a);
            this.y.setVisibility(0);
        }
        this.C.e(ajrsVar);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.D.c();
        this.E.c();
    }
}
