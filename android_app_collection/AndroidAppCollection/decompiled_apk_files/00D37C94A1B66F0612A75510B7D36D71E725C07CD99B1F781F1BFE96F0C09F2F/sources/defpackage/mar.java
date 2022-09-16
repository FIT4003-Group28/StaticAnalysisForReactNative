package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mar  reason: default package */
/* loaded from: classes3.dex */
public final class mar extends mao {
    public mat ae;
    public gca af;
    public aafo ag;
    public argn ah;
    public mas ai;
    private ViewGroup aj;
    private View ak;
    private final map al = new map();

    private static int aH() {
        return Math.max(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
    }

    private final void aI(View view) {
        ((ViewGroup) this.aj.findViewById(R.id.home_ads_content)).addView(view);
    }

    private final void aJ() {
        ((ViewGroup) this.aj.findViewById(R.id.home_ads_content)).removeAllViews();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ajsa] */
    public final void aG() {
        if (this.aj == null || this.ah == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(rb());
        mat matVar = this.ae;
        mau mauVar = new mau(this.ah, matVar.a, matVar.b, matVar.c.oi(), ((ajyi) matVar.d.get()).get(), matVar.e.a(aari.n, matVar.c.oi()), matVar.f, matVar.g, (ajhl) matVar.h.get());
        mauVar.a = (ViewGroup) LayoutInflater.from(mauVar.c).inflate(R.layout.home_ads_panel, frameLayout);
        argn argnVar = mauVar.b;
        if ((argnVar.b & 2) != 0) {
            aunb aunbVar = argnVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                ajrs ajrsVar = new ajrs();
                ajrsVar.g(new HashMap());
                ajrsVar.a(mauVar.e);
                asjj asjjVar = ajrsVar.c;
                if (asjjVar != null) {
                    ajrsVar.c = asjjVar;
                }
                aunb aunbVar2 = mauVar.b.d;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                ajin ajinVar = (ajin) mauVar.i.get();
                mauVar.j.oK(ajrsVar, ajhh.a((aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer)));
                ((ViewGroup) mauVar.a.findViewById(R.id.home_ads_panel_header)).addView(mauVar.j.a());
            }
        }
        argn argnVar2 = mauVar.b;
        if ((argnVar2.b & 4) != 0) {
            aunb aunbVar3 = argnVar2.e;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (aunbVar3.qn(SectionListRendererOuterClass.sectionListRenderer)) {
                RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(mauVar.c).inflate(R.layout.section_list, (ViewGroup) null, false);
                gev a = mauVar.d.a(null, null, recyclerView, aari.n, mauVar.g, mauVar.e, mauVar.f, akai.Ws, ajzs.d, ajkb.ENGAGEMENT, mauVar.h, mauVar.c);
                aunb aunbVar4 = mauVar.b.e;
                if (aunbVar4 == null) {
                    aunbVar4 = aunb.a;
                }
                a.K(new aakw((auqh) aunbVar4.qm(SectionListRendererOuterClass.sectionListRenderer)));
                ((ViewGroup) mauVar.a.findViewById(R.id.home_ads_panel_content)).addView(recyclerView);
            }
        }
        aJ();
        if (this.ak == null) {
            this.ak = frameLayout;
            aI(frameLayout);
            return;
        }
        frameLayout.setVisibility(8);
        View view = this.ak;
        this.ak = frameLayout;
        aI(frameLayout);
        aI(view);
        map mapVar = this.al;
        View view2 = this.ak;
        mapVar.b = new yye(view, 500L, mapVar.a, 8);
        mapVar.c = new yye(view2, 500L, mapVar.a, 8);
        mapVar.b.b(true);
        mapVar.c.c(true);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(0, R.style.HomeAdsDialog);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.af.d(3);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.home_ads_panel_bottom_sheet, viewGroup);
        this.aj = viewGroup2;
        viewGroup2.setMinimumHeight(aH());
        aG();
        return this.aj;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        argn argnVar = this.ah;
        if ((argnVar.b & 8) != 0) {
            aafo aafoVar = this.ag;
            apzg apzgVar = argnVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.af.d(3);
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.af.d(0);
        mas masVar = this.ai;
        if (masVar != null) {
            masVar.c.clear();
        }
        aJ();
        this.aj = null;
    }

    @Override // defpackage.aljp, defpackage.ow, defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        ((aljo) oy).a().D((int) Math.floor(aH() * 0.9f));
        return oy;
    }
}
