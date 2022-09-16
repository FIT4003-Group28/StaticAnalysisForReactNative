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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: mic  reason: default package */
/* loaded from: classes3.dex */
public final class mic extends ajsl {
    public final RelativeLayout a;
    public final Context b;
    public final Resources c;
    public aqep d;
    private final ajrx e;
    private final aafo f;
    private final ajmy g;
    private final View h;
    private final ajyc i;
    private final View j;
    private final ImageView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final ktz p;
    private final ajrp q;
    private CharSequence r;

    public mic(Context context, gem gemVar, ajmy ajmyVar, ajyc ajycVar, aafo aafoVar, kua kuaVar) {
        ajrp ajrpVar = new ajrp(aafoVar, gemVar);
        this.q = ajrpVar;
        this.b = context;
        this.e = gemVar;
        this.i = ajycVar;
        ajmyVar.getClass();
        this.g = ajmyVar;
        aafoVar.getClass();
        this.f = aafoVar;
        this.c = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_show_item, (ViewGroup) null);
        this.h = inflate;
        this.a = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.k = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = inflate.findViewById(R.id.contextual_menu_anchor);
        this.o = (TextView) inflate.findViewById(R.id.bottom_text);
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.short_byline);
        this.n = (TextView) inflate.findViewById(R.id.long_byline);
        this.p = kuaVar.a((ViewStub) inflate.findViewById(R.id.bottom_title_standalone_red_badge));
        gemVar.c(inflate);
        inflate.setOnClickListener(ajrpVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.e).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        avhn avhnVar;
        atep atepVar;
        arag aragVar;
        aqep aqepVar = (aqep) obj;
        apmi apmiVar = null;
        if (!aqepVar.equals(this.d)) {
            this.r = null;
        }
        this.d = aqepVar;
        ajrp ajrpVar = this.q;
        acti actiVar = ajrsVar.a;
        if ((aqepVar.b & 4) != 0) {
            apzgVar = aqepVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        this.a.getViewTreeObserver().addOnPreDrawListener(new mib(this));
        this.g.e(this.k);
        ajmy ajmyVar = this.g;
        ImageView imageView = this.k;
        auvu auvuVar = this.d.d;
        if (auvuVar == null) {
            auvuVar = auvu.a;
        }
        if ((auvuVar.b & 1) != 0) {
            auvu auvuVar2 = this.d.d;
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
        TextView textView = this.o;
        if (this.r == null) {
            ArrayList arrayList = new ArrayList();
            for (avhc avhcVar : this.d.e) {
                avgs avgsVar = avhcVar.d;
                if (avgsVar == null) {
                    avgsVar = avgs.a;
                }
                if ((avgsVar.b & 1) != 0) {
                    avgs avgsVar2 = avhcVar.d;
                    if (avgsVar2 == null) {
                        avgsVar2 = avgs.a;
                    }
                    arag aragVar2 = avgsVar2.c;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    arrayList.add(ajgl.b(aragVar2));
                }
            }
            this.r = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        zag.m(textView, this.r);
        acti actiVar2 = ajrsVar.a;
        ajyc ajycVar = this.i;
        View view = ((gem) this.e).b;
        View view2 = this.j;
        ates atesVar = aqepVar.j;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = aqepVar.j;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        } else {
            atepVar = null;
        }
        ajycVar.e(view, view2, atepVar, aqepVar, actiVar2);
        TextView textView2 = this.l;
        arag aragVar3 = aqepVar.c;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar3));
        if ((aqepVar.b & 8) != 0) {
            aragVar = aqepVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned a = aafv.a(aragVar, this.f, false);
        if (!TextUtils.isEmpty(a)) {
            zag.m(this.m, a);
            this.n.setVisibility(8);
        } else {
            TextView textView3 = this.n;
            arag aragVar4 = aqepVar.h;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            zag.m(textView3, aafv.a(aragVar4, this.f, false));
            this.m.setVisibility(8);
        }
        ktz ktzVar = this.p;
        apmg apmgVar = this.d.i;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            apmg apmgVar2 = this.d.i;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmiVar = apmgVar2.d;
            if (apmiVar == null) {
                apmiVar = apmi.a;
            }
        }
        ktzVar.a(apmiVar);
        this.e.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqep) obj).l.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.q.c();
    }
}
