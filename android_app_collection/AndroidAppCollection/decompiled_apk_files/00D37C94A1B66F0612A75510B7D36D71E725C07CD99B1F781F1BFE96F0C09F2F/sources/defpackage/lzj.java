package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AppPromoCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: lzj  reason: default package */
/* loaded from: classes3.dex */
public final class lzj implements wkd, wkg, wkf {
    public final aafo a;
    public final wxc b;
    ImageView c;
    public apho d;
    private final Context e;
    private final ajmy f;
    private final acti g;
    private final lzu h;
    private final lzs i;
    private final fjn j;
    private String k;
    private View l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private View q;
    private View r;
    private ImageView s;
    private View t;
    private final int u;
    private wzi v;
    private fjm w;
    private fjs x;
    private maf y;
    private boolean z;

    public lzj(Context context, ajmy ajmyVar, aafo aafoVar, wxc wxcVar, acti actiVar, lzu lzuVar, lzs lzsVar, fjn fjnVar) {
        this.e = context;
        ajmyVar.getClass();
        this.f = ajmyVar;
        aafoVar.getClass();
        this.a = aafoVar;
        wxcVar.getClass();
        this.b = wxcVar;
        actiVar.getClass();
        this.g = actiVar;
        this.h = lzuVar;
        this.i = lzsVar;
        this.u = (int) context.getResources().getDimension(R.dimen.ad_companion_action_button_margin);
        this.j = fjnVar;
    }

    private final void l() {
        View view;
        if (!this.z || this.d == null || (view = this.l) == null) {
            return;
        }
        view.setVisibility(0);
    }

    private final void m(View view, aoyf aoyfVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aoyfVar.d);
        if ((aoyfVar.b & 1) != 0) {
            apzg apzgVar = aoyfVar.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            arrayList.add(apzgVar);
        }
        view.setOnClickListener(new lzi(this, aoyfVar, arrayList));
        view.setClickable(true);
        this.g.u(new acte(aoyfVar.e), null);
    }

    private final void n(View view) {
        if (view != null) {
            zag.g(view, R.id.app_promotion_companion_card_stub, R.id.app_promotion_companion_card).setVisibility(8);
        }
        if (this.l != null) {
            Object obj = null;
            this.m.setImageDrawable(null);
            this.s.setVisibility(4);
            this.s.setImageDrawable(null);
            this.f.e(this.m);
            this.l.setVisibility(8);
            this.l.setBackgroundColor(zhn.j(this.e, R.attr.adBackground1).orElse(0));
            this.v.c();
            apho aphoVar = this.d;
            if (aphoVar != null && (aphoVar.b & 1048576) != 0) {
                lzu lzuVar = this.h;
                aunb aunbVar = aphoVar.v;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                    aunb aunbVar2 = this.d.v;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    obj = aunbVar2.qm(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                }
                lzuVar.b(obj);
            }
            fjm fjmVar = this.w;
            if (fjmVar != null) {
                fjmVar.d();
            }
            maf mafVar = this.y;
            if (mafVar != null) {
                mafVar.a();
            }
            fjs fjsVar = this.x;
            if (fjsVar == null) {
                return;
            }
            fjsVar.d();
        }
    }

    @Override // defpackage.wke
    public final void a() {
        l();
    }

    public final Map b(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{this.v});
        return hashMap;
    }

    public final void c(Object obj, List list) {
        if (obj == null || this.b.d(obj)) {
            return;
        }
        aafx.d(this.a, list, b(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0213  */
    @Override // defpackage.wke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r12, defpackage.ajrs r13) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzj.d(android.view.View, ajrs):void");
    }

    @Override // defpackage.wke
    public final void e(View view) {
        this.k = "";
        this.z = false;
        n(view);
        this.l = null;
    }

    @Override // defpackage.wke
    public final void f() {
        this.z = true;
        l();
    }

    @Override // defpackage.wkd
    public final boolean g(String str, PlayerResponseModel playerResponseModel, asit asitVar) {
        apho aphoVar;
        this.k = str;
        asaj asajVar = null;
        this.d = null;
        if (playerResponseModel != null) {
            asajVar = playerResponseModel.a;
        }
        if (asajVar != null) {
            atzu atzuVar = asajVar.A;
            if (atzuVar == null) {
                atzuVar = atzu.a;
            }
            if (atzuVar.b == 65002523) {
                atzu atzuVar2 = asajVar.A;
                if (atzuVar2 == null) {
                    atzuVar2 = atzu.a;
                }
                if (atzuVar2.b == 65002523) {
                    aphoVar = (apho) atzuVar2.c;
                } else {
                    aphoVar = apho.a;
                }
                this.d = aphoVar;
            }
        }
        return this.d != null;
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
        aafo aafoVar = this.a;
        apho aphoVar = this.d;
        apzg apzgVar = null;
        if (aphoVar != null && (aphoVar.b & 16384) != 0 && (apzgVar = aphoVar.r) == null) {
            apzgVar = apzg.a;
        }
        man.c(aafoVar, aphoVar, apzgVar, this.x);
    }

    @Override // defpackage.wkg
    public final boolean i(String str, aqfd aqfdVar, asit asitVar) {
        this.k = str;
        this.d = null;
        if ((aqfdVar.b & 2) != 0) {
            apho aphoVar = aqfdVar.d;
            if (aphoVar == null) {
                aphoVar = apho.a;
            }
            this.d = aphoVar;
            return true;
        }
        return false;
    }

    @Override // defpackage.wkf
    public final boolean j(String str, aunb aunbVar) {
        this.k = str;
        if (aunbVar == null || !aunbVar.qn(AppPromoCompanionAdRendererOuterClass.appPromoCompanionAdRenderer)) {
            return false;
        }
        this.d = (apho) aunbVar.qm(AppPromoCompanionAdRendererOuterClass.appPromoCompanionAdRenderer);
        return true;
    }

    @Override // defpackage.wkf
    public final boolean k(aunb aunbVar, boolean z) {
        if (!j(this.k, aunbVar)) {
            return false;
        }
        this.z = true;
        return true;
    }
}
