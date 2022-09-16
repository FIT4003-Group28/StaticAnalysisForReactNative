package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ipm  reason: default package */
/* loaded from: classes3.dex */
public final class ipm extends ipa implements esr {
    public ess cq;
    public fcl cr;
    public axnm cs;
    public String ct;
    private final List cu = new ArrayList();
    private boolean cv;
    private cff cw;

    @Override // defpackage.esr
    public final boolean a() {
        return this.cv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iou
    public final void bf(cff cffVar) {
        arlt arltVar;
        armc armcVar;
        avfo avfoVar;
        if (!this.ch) {
            this.cw = cffVar;
            super.bf(cffVar);
        } else if (!"FElibrary".equals(((apnv) this.ai.qm(BrowseEndpointOuterClass.browseEndpoint)).c) || !(cffVar instanceof cev)) {
            String str = this.aI.a(cffVar).a;
            for (ipk ipkVar : this.cu) {
                ipkVar.g(str);
            }
        } else {
            etd etdVar = (etd) this.aP.get();
            try {
                apzg apzgVar = this.ai;
                ess essVar = this.cq;
                String str2 = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c;
                BrowseResponseModel browseResponseModel = null;
                BrowseResponseModel g = str2.equals("FElibrary") ? etdVar.g() : null;
                if (g == null) {
                    arlt i = etdVar.i();
                    if (i != null) {
                        i = essVar.b(i);
                    }
                    if (i != null) {
                        browseResponseModel = new BrowseResponseModel(i);
                    }
                } else {
                    browseResponseModel = g;
                }
                if (browseResponseModel != null && (arltVar = browseResponseModel.a) != null && (arltVar.b & 64) != 0) {
                    arlu arluVar = arltVar.f;
                    if (arluVar == null) {
                        arluVar = arlu.a;
                    }
                    if (arluVar.b == 58173949) {
                        armcVar = (armc) arluVar.c;
                    } else {
                        armcVar = armc.a;
                    }
                    if (armcVar.c.size() > 0 && ((arlw) armcVar.c.get(0)).b == 58174010) {
                        arlw arlwVar = (arlw) armcVar.c.get(0);
                        if (arlwVar.b == 58174010) {
                            avfoVar = (avfo) arlwVar.c;
                        } else {
                            avfoVar = avfo.a;
                        }
                        aopa mo52toBuilder = avfoVar.mo52toBuilder();
                        mo52toBuilder.copyOnWrite();
                        avfo avfoVar2 = (avfo) mo52toBuilder.instance;
                        str2.getClass();
                        avfoVar2.b |= 1;
                        avfoVar2.c = str2;
                        avfo avfoVar3 = (avfo) mo52toBuilder.mo39build();
                        aopc aopcVar = (aopc) browseResponseModel.a.mo52toBuilder();
                        arlu arluVar2 = browseResponseModel.a.f;
                        if (arluVar2 == null) {
                            arluVar2 = arlu.a;
                        }
                        aopa mo52toBuilder2 = arluVar2.mo52toBuilder();
                        aopa mo52toBuilder3 = armcVar.mo52toBuilder();
                        aopa mo52toBuilder4 = ((arlw) armcVar.c.get(0)).mo52toBuilder();
                        mo52toBuilder4.copyOnWrite();
                        arlw arlwVar2 = (arlw) mo52toBuilder4.instance;
                        avfoVar3.getClass();
                        arlwVar2.c = avfoVar3;
                        arlwVar2.b = 58174010;
                        mo52toBuilder3.copyOnWrite();
                        armc armcVar2 = (armc) mo52toBuilder3.instance;
                        arlw arlwVar3 = (arlw) mo52toBuilder4.mo39build();
                        arlwVar3.getClass();
                        armcVar2.a();
                        armcVar2.c.set(0, arlwVar3);
                        mo52toBuilder2.copyOnWrite();
                        arlu arluVar3 = (arlu) mo52toBuilder2.instance;
                        armc armcVar3 = (armc) mo52toBuilder3.mo39build();
                        armcVar3.getClass();
                        arluVar3.c = armcVar3;
                        arluVar3.b = 58173949;
                        aopcVar.copyOnWrite();
                        arlt arltVar2 = (arlt) aopcVar.instance;
                        arlu arluVar4 = (arlu) mo52toBuilder2.mo39build();
                        arluVar4.getClass();
                        arltVar2.f = arluVar4;
                        arltVar2.b |= 64;
                        browseResponseModel = new BrowseResponseModel((arlt) aopcVar.mo39build());
                    }
                }
                if (browseResponseModel == null) {
                    return;
                }
                this.cv = true;
                iok a = iol.a();
                a.c(apzgVar);
                a.b(browseResponseModel);
                a.e(true);
                a.f(false);
                a.d(false);
                super.aE(a.a());
            } catch (IOException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Failed to get offline browse: ");
                sb.append(valueOf);
                zep.b(sb.toString());
                String N = N(R.string.offline_not_available);
                SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) ((iou) this).c.get();
                specificNetworkErrorViewLoadingFrameLayout.c.e(N);
                specificNetworkErrorViewLoadingFrameLayout.c.d(false);
                specificNetworkErrorViewLoadingFrameLayout.c.b(false);
                specificNetworkErrorViewLoadingFrameLayout.h(3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iou
    public final void bg(apzg apzgVar) {
        super.bg(apzgVar);
        this.cu.clear();
        this.cw = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iou
    public final void bh(iol iolVar) {
        apzg s;
        super.bh(iolVar);
        BrowseResponseModel browseResponseModel = iolVar.b;
        if (browseResponseModel != null && this.ch && !eog.aI(this.av) && !this.cr.h()) {
            amuk g = browseResponseModel.g();
            int size = g.size();
            int i = 0;
            while (i < size) {
                aaky aakyVar = (aaky) g.get(i);
                aopa mo52toBuilder = aakyVar.a.mo52toBuilder();
                if (!"FEaccount".equals(((avfo) mo52toBuilder.instance).c)) {
                    i++;
                    if ("FElibrary".equals(((avfo) mo52toBuilder.instance).c)) {
                    }
                }
                aopa createBuilder = avfk.a.createBuilder();
                auqh auqhVar = auqh.a;
                createBuilder.copyOnWrite();
                avfk avfkVar = (avfk) createBuilder.instance;
                auqhVar.getClass();
                avfkVar.c = auqhVar;
                avfkVar.b |= 1;
                mo52toBuilder.copyOnWrite();
                avfo avfoVar = (avfo) mo52toBuilder.instance;
                avfk avfkVar2 = (avfk) createBuilder.mo39build();
                avfkVar2.getClass();
                avfoVar.k = avfkVar2;
                avfoVar.b |= 8192;
                aakyVar.b((avfo) mo52toBuilder.mo39build());
                break;
            }
        }
        BrowseResponseModel browseResponseModel2 = iolVar.b;
        String str = this.ct;
        if (str == null || str.isEmpty() || browseResponseModel2 == null) {
            return;
        }
        amuk g2 = browseResponseModel2.g();
        int size2 = g2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            aaky aakyVar2 = (aaky) g2.get(i2);
            aopa mo52toBuilder2 = aakyVar2.a.mo52toBuilder();
            boolean equals = this.ct.equals(((avfo) mo52toBuilder2.instance).c);
            mo52toBuilder2.copyOnWrite();
            avfo avfoVar2 = (avfo) mo52toBuilder2.instance;
            avfoVar2.b |= 8;
            avfoVar2.f = equals;
            if (equals && (s = s()) != null && s.qn(BrowseEndpointOuterClass.browseEndpoint)) {
                aopa mo52toBuilder3 = ((apnv) s.qm(BrowseEndpointOuterClass.browseEndpoint)).mo52toBuilder();
                String str2 = ((avfo) mo52toBuilder2.instance).c;
                mo52toBuilder3.copyOnWrite();
                apnv apnvVar = (apnv) mo52toBuilder3.instance;
                str2.getClass();
                apnvVar.b |= 1;
                apnvVar.c = str2;
                aopc aopcVar = (aopc) s.mo52toBuilder();
                aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) mo52toBuilder3.mo39build());
                bp((apzg) aopcVar.mo39build());
            }
            aakyVar2.b((avfo) mo52toBuilder2.mo39build());
        }
        this.ct = null;
    }

    @Override // defpackage.iou
    protected final void bi(akaf akafVar) {
        if (this.ch) {
            ipk ipkVar = new ipk(this);
            cff cffVar = this.cw;
            if (cffVar == null) {
                ajyu a = ajyv.a();
                a.a = ajxe.a();
                ipkVar.f(a.a());
            } else {
                ipkVar.g(this.aI.a(cffVar).a);
            }
            this.cu.add(ipkVar);
            mbt mbtVar = (mbt) akafVar;
            ajqm ajqmVar = mbtVar.d;
            if (ajqmVar == ipkVar) {
                return;
            }
            if (ajqmVar != null) {
                mbtVar.c.q(ajqmVar);
            }
            mbtVar.d = ipkVar;
            mbtVar.c.m(ipkVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iou
    public final void bl() {
        super.bl();
        this.d.e(new ipl(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iou
    public final boolean bw() {
        sdb sdbVar = this.cn;
        return (sdbVar == null || !sdbVar.a) && super.bw();
    }

    @Override // defpackage.iou, defpackage.imz
    public final void l() {
        if (this.cv || this.ch || this.cw != null || n() == 3) {
            ll();
        }
    }

    @Override // defpackage.iou, defpackage.akai
    public final void ll() {
        if (!this.cn.a) {
            super.ll();
            return;
        }
        View view = this.O;
        if (view == null) {
            return;
        }
        view.postDelayed(new Runnable() { // from class: ipi
            @Override // java.lang.Runnable
            public final void run() {
                ipm ipmVar = ipm.this;
                ipmVar.bz();
                ipmVar.bj.b();
            }
        }, rh().getInteger(17694722));
    }

    @Override // defpackage.iou, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.cv = bundle.getBoolean("instance_is_rendering_offline_browse_response");
        }
        return super.mc(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.iou, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putBoolean("instance_is_rendering_offline_browse_response", this.cv);
    }
}
