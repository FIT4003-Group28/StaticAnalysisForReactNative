package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
/* compiled from: PG */
/* renamed from: yer  reason: default package */
/* loaded from: classes4.dex */
public final class yer extends ajsl implements ynl {
    public final View a;
    public final TextView b;
    public final Context c;
    public awia d;
    public acti e;
    public final int f;
    public Drawable g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final akbm k;
    private final aafo l;
    private final LinearLayout m;
    private final LinearLayout n;
    private final yni o;
    private final int p;

    public yer(Context context, akbn akbnVar, aafo aafoVar, yni yniVar) {
        this.c = context;
        View inflate = View.inflate(context, R.layout.single_ypc_offer_item, null);
        this.a = inflate;
        this.h = (TextView) inflate.findViewById(R.id.metadata);
        this.i = (TextView) inflate.findViewById(R.id.name);
        this.j = (TextView) inflate.findViewById(R.id.promotion_text);
        this.l = aafoVar;
        this.o = yniVar;
        this.p = context.getResources().getDimensionPixelSize(R.dimen.offer_container_margin);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.offer_container);
        this.m = linearLayout;
        this.n = (LinearLayout) linearLayout.findViewById(R.id.offer_info);
        TextView textView = (TextView) linearLayout.findViewById(R.id.price);
        this.b = textView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.price_icon_size);
        this.f = dimensionPixelSize;
        textView.addOnLayoutChangeListener(akel.a(textView, dimensionPixelSize));
        akbm a = akbnVar.a(textView);
        this.k = a;
        a.e(R.dimen.price_icon_compound_padding);
        a.g();
        a.d = new akbi() { // from class: yep
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                yer yerVar = yer.this;
                if (aopcVar == null || yerVar.e == null) {
                    return;
                }
                apzg apzgVar = ((apoj) aopcVar.instance).o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (!apzgVar.qn(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint)) {
                    apzg apzgVar2 = ((apoj) aopcVar.instance).o;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    if (!apzgVar2.qn(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)) {
                        return;
                    }
                }
                acti actiVar = yerVar.e;
                apzg apzgVar3 = ((apoj) aopcVar.instance).o;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                actiVar.H(3, new acte(apzgVar3.c), null);
            }
        };
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yer.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awia) obj).f.I();
    }

    public final void g(int i) {
        int i2;
        int i3;
        if (this.m.getOrientation() == i) {
            return;
        }
        this.m.setOrientation(i);
        int i4 = -2;
        if (i == 0) {
            i2 = 0;
            i4 = 0;
            i3 = -2;
        } else {
            i2 = this.p;
            i3 = 0;
        }
        zgd.v(this.n, i4, i3);
        zgd.t(this.b, zgd.m(0, i2, 0, 0), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        apzg apzgVar;
        arag aragVar;
        apzg apzgVar2;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    apzg a = ((aawf) obj).a();
                    apok apokVar = this.d.g;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    apoj apojVar = apokVar.c;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                    if ((apojVar.b & 8192) != 0) {
                        apok apokVar2 = this.d.g;
                        if (apokVar2 == null) {
                            apokVar2 = apok.a;
                        }
                        apoj apojVar2 = apokVar2.c;
                        if (apojVar2 == null) {
                            apojVar2 = apoj.a;
                        }
                        apzgVar2 = apojVar2.n;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                    } else {
                        apzgVar2 = null;
                    }
                    if (!akzj.f(a, apzgVar2)) {
                        return null;
                    }
                    LayerDrawable layerDrawable = (LayerDrawable) this.c.getResources().getDrawable(R.drawable.indeterminate_loading_indicator);
                    int measuredWidth = this.b.getMeasuredWidth();
                    this.b.setCompoundDrawablesRelative(layerDrawable, null, null, null);
                    TextView textView = this.b;
                    textView.setPadding((measuredWidth / 2) - (this.f / 2), textView.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
                    ObjectAnimator.ofInt(layerDrawable.getDrawable(0), "level", 0, 20000).setDuration(3000L).start();
                    ObjectAnimator.ofInt(layerDrawable.getDrawable(1), "level", 0, 20000).setDuration(3000L).start();
                    this.b.setText("");
                    this.b.setWidth(measuredWidth);
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            apzg a2 = ((aawe) obj).a();
            apok apokVar3 = this.d.g;
            if (apokVar3 == null) {
                apokVar3 = apok.a;
            }
            apoj apojVar3 = apokVar3.c;
            if (apojVar3 == null) {
                apojVar3 = apoj.a;
            }
            if ((apojVar3.b & 8192) != 0) {
                apok apokVar4 = this.d.g;
                if (apokVar4 == null) {
                    apokVar4 = apok.a;
                }
                apoj apojVar4 = apokVar4.c;
                if (apojVar4 == null) {
                    apojVar4 = apoj.a;
                }
                apzgVar = apojVar4.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            if (!akzj.f(a2, apzgVar) || this.g == null) {
                return null;
            }
            this.b.setPadding(this.c.getResources().getDimensionPixelSize(R.dimen.price_text_padding_start_default), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
            TextView textView2 = this.b;
            apok apokVar5 = this.d.g;
            if (apokVar5 == null) {
                apokVar5 = apok.a;
            }
            apoj apojVar5 = apokVar5.c;
            if (apojVar5 == null) {
                apojVar5 = apoj.a;
            }
            if ((apojVar5.b & 256) != 0) {
                apok apokVar6 = this.d.g;
                if (apokVar6 == null) {
                    apokVar6 = apok.a;
                }
                apoj apojVar6 = apokVar6.c;
                if (apojVar6 == null) {
                    apojVar6 = apoj.a;
                }
                aragVar = apojVar6.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView2.setText(ajgl.b(aragVar));
            this.b.setCompoundDrawablesRelative(this.g, null, null, null);
            return null;
        }
        return new Class[]{aawe.class, aawf.class};
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.o.m(this);
        this.d = null;
    }
}
