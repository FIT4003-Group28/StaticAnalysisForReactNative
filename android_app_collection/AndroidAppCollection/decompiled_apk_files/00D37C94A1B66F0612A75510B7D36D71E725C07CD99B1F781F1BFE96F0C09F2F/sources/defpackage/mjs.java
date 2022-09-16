package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: mjs  reason: default package */
/* loaded from: classes3.dex */
public final class mjs extends ajsl {
    final RelativeLayout a;
    final RelativeLayout b;
    final ImageView c;
    final TextView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final View h;
    final ktz i;
    private final Context j;
    private final Resources k;
    private final aafo l;
    private final ajrx m;
    private final View n;
    private final ajmy o;
    private final ajyc p;
    private final LinearLayout q;
    private final ajrp r;
    private CharSequence s;
    private arfb t;

    public mjs(Context context, gem gemVar, ajmy ajmyVar, ajyc ajycVar, aafo aafoVar, kua kuaVar) {
        ajrp ajrpVar = new ajrp(aafoVar, gemVar);
        this.r = ajrpVar;
        this.j = context;
        aafoVar.getClass();
        this.l = aafoVar;
        this.m = gemVar;
        ajmyVar.getClass();
        this.o = ajmyVar;
        this.p = ajycVar;
        this.k = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.grid_show_item, (ViewGroup) null);
        this.n = inflate;
        this.q = (LinearLayout) inflate.findViewById(R.id.grid_show_view);
        this.a = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.b = (RelativeLayout) inflate.findViewById(R.id.text_layout);
        this.c = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.d = (TextView) inflate.findViewById(R.id.bottom_panel);
        this.h = inflate.findViewById(R.id.contextual_menu_anchor);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.short_byline);
        this.g = (TextView) inflate.findViewById(R.id.long_byline);
        this.i = kuaVar.a((ViewStub) inflate.findViewById(R.id.bottom_title_standalone_red_badge));
        gemVar.c(inflate);
        inflate.setOnClickListener(ajrpVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.m).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        asxo asxoVar;
        int dimension;
        avhn avhnVar;
        atep atepVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arfb arfbVar = (arfb) obj;
        apmi apmiVar = null;
        if (!arfbVar.equals(this.t)) {
            this.s = null;
        }
        this.t = arfbVar;
        ajrp ajrpVar = this.r;
        acti actiVar = ajrsVar.a;
        if ((arfbVar.b & 4) != 0) {
            apzgVar = arfbVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        if (hqs.q(ajrsVar)) {
            this.q.setOrientation(1);
            layoutParams.width = -1;
            this.e.setMaxLines(this.k.getInteger(R.integer.compact_renderer_title_grid_mode_max_lines));
            dimension = 0;
        } else {
            this.q.setOrientation(0);
            Resources resources = this.k;
            arfb arfbVar2 = this.t;
            if ((arfbVar2.b & 1024) != 0) {
                asxoVar = arfbVar2.k;
                if (asxoVar == null) {
                    asxoVar = asxo.a;
                }
            } else {
                asxoVar = null;
            }
            mpe.e(resources, asxoVar, layoutParams, layoutParams2);
            Resources resources2 = this.k;
            asxo asxoVar2 = this.t.k;
            if (asxoVar2 == null) {
                asxoVar2 = asxo.a;
            }
            this.e.setMaxLines(mpe.c(resources2, asxoVar2));
            dimension = (int) this.k.getDimension(R.dimen.compact_video_thumbnail_margin);
        }
        layoutParams.setMarginEnd(dimension);
        this.o.e(this.c);
        ajmy ajmyVar = this.o;
        ImageView imageView = this.c;
        auvu auvuVar = this.t.d;
        if (auvuVar == null) {
            auvuVar = auvu.a;
        }
        if ((auvuVar.b & 1) != 0) {
            auvu auvuVar2 = this.t.d;
            if (auvuVar2 == null) {
                auvuVar2 = auvu.a;
            }
            auvt auvtVar = auvuVar2.c;
            if (auvtVar == null) {
                auvtVar = auvt.a;
            }
            avhnVar = auvtVar.b;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.d;
        if (this.s == null) {
            ArrayList arrayList = new ArrayList();
            for (avhc avhcVar : this.t.e) {
                avgs avgsVar = avhcVar.d;
                if (avgsVar == null) {
                    avgsVar = avgs.a;
                }
                if ((avgsVar.b & 1) != 0) {
                    avgs avgsVar2 = avhcVar.d;
                    if (avgsVar2 == null) {
                        avgsVar2 = avgs.a;
                    }
                    arag aragVar4 = avgsVar2.c;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    arrayList.add(ajgl.b(aragVar4));
                }
            }
            this.s = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        zag.m(textView, this.s);
        acti actiVar2 = ajrsVar.a;
        ajyc ajycVar = this.p;
        View view = ((gem) this.m).b;
        View view2 = this.h;
        ates atesVar = arfbVar.j;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = arfbVar.j;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atep atepVar2 = atesVar2.c;
            if (atepVar2 == null) {
                atepVar2 = atep.a;
            }
            atepVar = atepVar2;
        } else {
            atepVar = null;
        }
        ajycVar.e(view, view2, atepVar, arfbVar, actiVar2);
        TextView textView2 = this.e;
        if ((arfbVar.b & 1) != 0) {
            aragVar = arfbVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView2, ajgl.b(aragVar));
        if ((arfbVar.b & 16) != 0) {
            aragVar2 = arfbVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned a = aafv.a(aragVar2, this.l, false);
        if (!TextUtils.isEmpty(a)) {
            zag.m(this.f, a);
            this.g.setVisibility(8);
        } else {
            TextView textView3 = this.g;
            if ((arfbVar.b & 32) != 0) {
                aragVar3 = arfbVar.h;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            zag.m(textView3, aafv.a(aragVar3, this.l, false));
            this.f.setVisibility(8);
        }
        ktz ktzVar = this.i;
        apmg apmgVar = this.t.i;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            apmg apmgVar2 = this.t.i;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmiVar = apmgVar2.d;
            if (apmiVar == null) {
                apmiVar = apmi.a;
            }
        }
        ktzVar.a(apmiVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arfb) obj).l.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.r.c();
    }
}
