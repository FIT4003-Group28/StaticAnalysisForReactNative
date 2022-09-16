package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: mpn  reason: default package */
/* loaded from: classes3.dex */
public final class mpn implements ajru {
    private final Context a;
    private final aafo b;
    private final ajyc c;
    private final ajmy d;
    private final FrameLayout e;
    private final ajrp f;
    private final kua g;
    private mpm h;
    private mpm i;
    private mpm j;

    public mpn(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, kua kuaVar) {
        this.b = aafoVar;
        this.a = context;
        this.c = ajycVar;
        ajmyVar.getClass();
        this.d = ajmyVar;
        this.g = kuaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setBackground(new frf(zhn.d(context, R.attr.yt10PercentLayer), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
        this.f = new ajrp(aafoVar, frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        atep atepVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        apmi apmiVar;
        itw itwVar = (itw) obj;
        ajrp ajrpVar = this.f;
        acti actiVar = ajrsVar.a;
        apzg apzgVar = itwVar.a().g;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        this.e.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation == 2) {
            if (this.i == null) {
                this.i = new mpm(this.a, this.d, this.b, this.c, this.g);
            }
            this.j = this.i;
        } else {
            if (this.h == null) {
                this.h = new mpm(this.a, this.d, this.b, this.c, this.g);
            }
            this.j = this.h;
        }
        mpm mpmVar = this.j;
        itwVar.getClass();
        auvo a = itwVar.a();
        a.getClass();
        avhn avhnVar2 = null;
        if (!a.equals(mpmVar.n)) {
            mpmVar.o = null;
        }
        mpmVar.n = a;
        ajrsVar.a.u(new acte(mpmVar.n.l), null);
        aafx.c(mpmVar.b, itwVar.a.i, mpmVar.n);
        mpmVar.e.e(mpmVar.c);
        ajmy ajmyVar = mpmVar.e;
        ImageView imageView = mpmVar.c;
        auvu auvuVar = mpmVar.n.d;
        if (auvuVar == null) {
            auvuVar = auvu.a;
        }
        if ((auvuVar.b & 1) != 0) {
            auvu auvuVar2 = mpmVar.n.d;
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
        View view = mpmVar.i;
        if (view != null) {
            if (mpmVar.p == null) {
                mpmVar.p = new fmk((ViewStub) view);
            }
            fmk fmkVar = mpmVar.p;
            if (mpmVar.o == null) {
                ArrayList arrayList = new ArrayList();
                for (avhc avhcVar : mpmVar.n.e) {
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
                mpmVar.o = TextUtils.join(System.getProperty("line.separator"), arrayList);
            }
            CharSequence charSequence = mpmVar.o;
            if (!TextUtils.isEmpty(charSequence)) {
                if (!fmkVar.b) {
                    fmkVar.c = (TextView) fmkVar.a.inflate();
                    fmkVar.b = true;
                }
                fmkVar.c.setText(charSequence);
                fmkVar.a.setVisibility(0);
                fmkVar.c.setVisibility(0);
            } else {
                fmkVar.a.setVisibility(8);
            }
        }
        View view2 = mpmVar.h;
        if (view2 != null) {
            if (mpmVar.q == null) {
                mpmVar.q = new ggm((ViewStub) view2);
            }
            mpmVar.q.a(ohn.f(mpmVar.n.e));
        }
        acti actiVar2 = ajrsVar.a;
        ajyc ajycVar = mpmVar.f;
        View view3 = mpmVar.a;
        View view4 = mpmVar.g;
        ates atesVar = mpmVar.n.k;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = mpmVar.n.k;
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
        ajycVar.e(view3, view4, atepVar, mpmVar.n, actiVar2);
        TextView textView = mpmVar.j;
        auvo auvoVar = mpmVar.n;
        if ((auvoVar.b & 1) != 0) {
            aragVar = auvoVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        auvo auvoVar2 = mpmVar.n;
        if ((auvoVar2.b & 16) != 0) {
            aragVar2 = auvoVar2.h;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned a2 = aafv.a(aragVar2, mpmVar.b, false);
        if (!TextUtils.isEmpty(a2)) {
            zag.m(mpmVar.k, a2);
            mpmVar.l.setVisibility(8);
        } else {
            TextView textView2 = mpmVar.l;
            auvo auvoVar3 = mpmVar.n;
            if ((auvoVar3.b & 32) != 0) {
                aragVar3 = auvoVar3.i;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            zag.m(textView2, aafv.a(aragVar3, mpmVar.b, false));
            mpmVar.k.setVisibility(8);
        }
        ktz ktzVar = mpmVar.m;
        apmg apmgVar = mpmVar.n.j;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            apmg apmgVar2 = mpmVar.n.j;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmiVar = apmgVar2.d;
            if (apmiVar == null) {
                apmiVar = apmi.a;
            }
        } else {
            apmiVar = null;
        }
        ktzVar.a(apmiVar);
        mpmVar.e.e(mpmVar.d);
        ajmy ajmyVar2 = mpmVar.e;
        ImageView imageView2 = mpmVar.d;
        apuq apuqVar = mpmVar.n.f;
        if (apuqVar == null) {
            apuqVar = apuq.a;
        }
        apur apurVar = apuqVar.c;
        if (apurVar == null) {
            apurVar = apur.a;
        }
        if ((apurVar.b & 1) != 0) {
            apuq apuqVar2 = mpmVar.n.f;
            if (apuqVar2 == null) {
                apuqVar2 = apuq.a;
            }
            apur apurVar2 = apuqVar2.c;
            if (apurVar2 == null) {
                apurVar2 = apur.a;
            }
            avhnVar2 = apurVar2.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
        }
        ajmyVar2.h(imageView2, avhnVar2);
        this.e.addView(this.j.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.c();
    }
}
