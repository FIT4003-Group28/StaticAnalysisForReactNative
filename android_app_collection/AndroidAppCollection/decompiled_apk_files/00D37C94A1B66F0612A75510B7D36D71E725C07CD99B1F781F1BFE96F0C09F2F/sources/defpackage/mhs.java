package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: mhs  reason: default package */
/* loaded from: classes3.dex */
public final class mhs extends mfr {
    public final Context n;
    private final ajrx o;
    private final ajrp p;
    private final aafo q;
    private final ViewGroup r;
    private final TextView s;
    private final TextView t;
    private final ViewGroup u;
    private final akbm v;

    public mhs(Context context, ajmy ajmyVar, ajxz ajxzVar, ajrq ajrqVar, aafo aafoVar, ajyc ajycVar, akbn akbnVar, gem gemVar) {
        super(context, ajmyVar, ajycVar);
        this.p = ajrqVar.a(gemVar);
        this.q = aafoVar;
        this.n = context;
        ajxzVar.getClass();
        this.o = gemVar;
        this.r = (ViewGroup) this.d.findViewById(R.id.top_standalone_badges_container);
        this.s = (TextView) this.d.findViewById(R.id.top_metadata);
        this.t = (TextView) this.d.findViewById(R.id.bottom_metadata);
        this.u = (ViewGroup) this.d.findViewById(R.id.bottom_frame);
        this.v = akbnVar.a((TextView) this.d.findViewById(R.id.action_button));
        gemVar.c(this.d);
    }

    private final CharSequence d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(System.getProperty("line.separator"));
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            arag aragVar = (arag) it.next();
            if (!z) {
                arrayList.add(spannableStringBuilder);
            }
            arrayList.add(aafv.a(aragVar, this.q, false));
            z = false;
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return TextUtils.concat((CharSequence[]) arrayList.toArray(new CharSequence[0]));
    }

    private final void e(int i) {
        int i2 = zew.i(this.n.getResources().getDisplayMetrics(), i) / 2;
        f(this.i, 0, i2);
        f(this.s, i2, i2);
        f(this.j, i2, i2);
        f(this.r, i2, i2);
        f(this.m, i2, 0);
    }

    private static void f(View view, int i, int i2) {
        zgd.t(view, zgd.b(zgd.p(i), zgd.e(i2)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.o).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        int i;
        atep atepVar;
        apoj apojVar;
        aqea aqeaVar = (aqea) obj;
        ajrp ajrpVar = this.p;
        acti actiVar = ajrsVar.a;
        if ((aqeaVar.b & 131072) != 0) {
            apzgVar = aqeaVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajrsVar.a.u(new acte(aqeaVar.q), null);
        arag aragVar5 = aqeaVar.m;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(ajgl.b(aragVar5));
            this.h.setContentDescription(ajgl.i(aragVar5));
        }
        avhn avhnVar = aqeaVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            this.b.h(imageView, avhnVar);
        }
        if ((aqeaVar.b & 8) != 0) {
            aragVar = aqeaVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setText(b);
        }
        fsz.e(this.n, this.r, aqeaVar.e);
        ViewGroup viewGroup = this.r;
        boolean z = false;
        viewGroup.setVisibility(viewGroup.getChildCount() > 0 ? 0 : 8);
        if ((aqeaVar.b & 16) != 0) {
            aragVar2 = aqeaVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        TextView textView3 = this.j;
        if (textView3 != null) {
            zag.m(textView3, b2);
        }
        TextView textView4 = this.s;
        if ((aqeaVar.b & 32) != 0) {
            aragVar3 = aqeaVar.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView4, ajgl.b(aragVar3));
        CharSequence d = d(aqeaVar.h);
        TextView textView5 = this.k;
        if (textView5 != null) {
            zag.m(textView5, d);
        }
        if ((aqeaVar.b & 64) != 0) {
            aragVar4 = aqeaVar.i;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        Spanned b3 = ajgl.b(aragVar4);
        TextView textView6 = this.l;
        if (textView6 != null) {
            zag.m(textView6, b3);
        }
        zag.m(this.t, d(aqeaVar.j));
        apok apokVar = aqeaVar.k;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((aqeaVar.b & 256) == 0 || apokVar == null || (apokVar.b & 1) == 0) {
            apmg[] apmgVarArr = (apmg[]) aqeaVar.l.toArray(new apmg[0]);
            ViewGroup viewGroup2 = this.m;
            if (viewGroup2 != null) {
                fsz.d(this.a, viewGroup2, apmgVarArr);
                ViewGroup viewGroup3 = this.m;
                zag.o(viewGroup3, viewGroup3.getChildCount() > 0);
            }
            this.v.b(null, null);
            this.l.setMaxLines(4);
        } else {
            this.m.setVisibility(8);
            akbm akbmVar = this.v;
            if ((apokVar.b & 1) != 0) {
                apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            } else {
                apojVar = null;
            }
            akbmVar.b(apojVar, ajrsVar.a);
            this.l.setMaxLines(3);
        }
        if (!aqeaVar.r) {
            this.f.setScaleType(ImageView.ScaleType.CENTER_CROP);
            e(2);
            f(this.u, zew.i(this.n.getResources().getDisplayMetrics(), 2), 0);
            if (this.r.getChildCount() > 0) {
                this.s.setVisibility(8);
            }
            this.l.setVisibility(8);
            this.t.setVisibility(8);
            this.v.b(null, null);
            i = R.fraction.rounded_aspect_ratio_16_9;
        } else {
            this.f.setScaleType(ImageView.ScaleType.FIT_XY);
            e(8);
            i = R.fraction.movie_poster_aspect_ratio;
        }
        this.e.a = this.n.getResources().getFraction(i, 1, 1);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) this.n.getResources().getDimension(R.dimen.list_item_thumbnail_width);
        }
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = this.e;
        fixedAspectRatioFrameLayout.getViewTreeObserver().addOnPreDrawListener(new mhr(this, fixedAspectRatioFrameLayout, aqeaVar));
        View view = ((gem) this.o).b;
        ates atesVar = aqeaVar.o;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        acti actiVar2 = ajrsVar.a;
        View view2 = this.g;
        if (aqeaVar != null) {
            z = true;
        }
        zag.o(view2, z);
        ajyc ajycVar = this.c;
        View view3 = this.g;
        if (atesVar == null || (1 & atesVar.b) == 0) {
            atepVar = null;
        } else {
            atepVar = atesVar.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        }
        ajycVar.e(view, view3, atepVar, aqeaVar, actiVar2);
        this.o.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.p.c();
    }
}
