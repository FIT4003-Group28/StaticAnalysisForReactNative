package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompanionAdRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: man  reason: default package */
/* loaded from: classes3.dex */
public final class man implements wkd, wkg, wkf {
    public final aafo a;
    public final wxc b;
    public wzi c;
    public aqfc d;
    private final ajmy e;
    private final acti f;
    private final lzu g;
    private final ajxz h;
    private final Context i;
    private final lzs j;
    private final fjn k;
    private mam l;
    private View m;
    private TextView n;
    private TextView o;
    private ViewGroup p;
    private ImageView q;
    private String r = "";
    private boolean s;
    private ImageView t;
    private View u;
    private fjs v;

    public man(ajmy ajmyVar, aafo aafoVar, wxc wxcVar, acti actiVar, lzu lzuVar, ajxz ajxzVar, Context context, lzs lzsVar, fjn fjnVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        wxcVar.getClass();
        this.b = wxcVar;
        ajmyVar.getClass();
        this.e = ajmyVar;
        ajxzVar.getClass();
        this.h = ajxzVar;
        actiVar.getClass();
        this.f = actiVar;
        this.g = lzuVar;
        this.i = context;
        this.j = lzsVar;
        this.k = fjnVar;
    }

    public static void c(aafo aafoVar, Object obj, apzg apzgVar, fjq fjqVar) {
        if (apzgVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (obj != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        }
        hashMap.put("hint_anchor_tag", fjqVar == null ? null : fjqVar.a);
        aafoVar.c(apzgVar, hashMap);
    }

    private final void l(View view, final aoyf aoyfVar) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(aoyfVar.d);
        if ((aoyfVar.b & 1) != 0) {
            apzg apzgVar = aoyfVar.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            arrayList.add(apzgVar);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: mah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                man manVar = man.this;
                aoyf aoyfVar2 = aoyfVar;
                List<apzg> list = arrayList;
                if (!list.isEmpty()) {
                    Map b = manVar.b(aoyfVar2);
                    for (apzg apzgVar2 : list) {
                        manVar.a.c(apzgVar2, b);
                    }
                }
            }
        });
        view.setClickable(true);
        this.f.u(new acte(aoyfVar.e), null);
    }

    private final void m(View view) {
        if (view != null) {
            zag.g(view, R.id.ad_companion_card_stub, R.id.ad_companion_card).setVisibility(8);
        }
        if (this.m != null) {
            this.e.e(this.t);
            this.m.setVisibility(8);
            this.m.setBackgroundColor(zhn.j(this.i, R.attr.adBackground1).orElse(0));
        }
        wzi wziVar = this.c;
        if (wziVar != null) {
            wziVar.c();
        }
        aqfc aqfcVar = this.d;
        if (aqfcVar != null) {
            aunb aunbVar = aqfcVar.o;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                lzu lzuVar = this.g;
                aunb aunbVar2 = this.d.o;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                lzuVar.b(aunbVar2.qm(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer));
            }
        }
        mam mamVar = this.l;
        if (mamVar != null) {
            mamVar.a.setOnClickListener(null);
            mamVar.a.setVisibility(8);
            mamVar.d.d();
            mamVar.f = null;
            mamVar.g = null;
        }
        fjs fjsVar = this.v;
        if (fjsVar != null) {
            fjsVar.d();
        }
    }

    private final void n() {
        View view;
        if (!this.s || this.d == null || (view = this.m) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // defpackage.wke
    public final void a() {
        n();
    }

    public final Map b(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{this.c});
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bf  */
    @Override // defpackage.wke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r9, defpackage.ajrs r10) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.man.d(android.view.View, ajrs):void");
    }

    @Override // defpackage.wke
    public final void e(View view) {
        m(view);
        this.r = "";
        this.s = false;
        this.d = null;
        this.m = null;
    }

    @Override // defpackage.wke
    public final void f() {
        this.s = true;
        n();
    }

    @Override // defpackage.wkd
    public final boolean g(String str, PlayerResponseModel playerResponseModel, asit asitVar) {
        aqfc aqfcVar;
        this.r = str;
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
            if (atzuVar.b == 55514441) {
                atzu atzuVar2 = asajVar.A;
                if (atzuVar2 == null) {
                    atzuVar2 = atzu.a;
                }
                if (atzuVar2.b == 55514441) {
                    aqfcVar = (aqfc) atzuVar2.c;
                } else {
                    aqfcVar = aqfc.a;
                }
                this.d = aqfcVar;
            }
        }
        return this.d != null;
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
        aafo aafoVar = this.a;
        aqfc aqfcVar = this.d;
        apzg apzgVar = null;
        if (aqfcVar != null && (aqfcVar.b & 8192) != 0 && (apzgVar = aqfcVar.n) == null) {
            apzgVar = apzg.a;
        }
        c(aafoVar, aqfcVar, apzgVar, this.v);
    }

    @Override // defpackage.wkg
    public final boolean i(String str, aqfd aqfdVar, asit asitVar) {
        this.r = str;
        if ((aqfdVar.b & 1) == 0) {
            this.d = null;
            return false;
        }
        aqfc aqfcVar = aqfdVar.c;
        if (aqfcVar == null) {
            aqfcVar = aqfc.a;
        }
        this.d = aqfcVar;
        return true;
    }

    @Override // defpackage.wkf
    public final boolean j(String str, aunb aunbVar) {
        this.r = str;
        if (aunbVar == null || !aunbVar.qn(CompanionAdRendererOuterClass.companionAdRenderer)) {
            return false;
        }
        this.d = (aqfc) aunbVar.qm(CompanionAdRendererOuterClass.companionAdRenderer);
        return true;
    }

    @Override // defpackage.wkf
    public final boolean k(aunb aunbVar, boolean z) {
        if (!j(this.r, aunbVar)) {
            return false;
        }
        this.s = true;
        return true;
    }
}
