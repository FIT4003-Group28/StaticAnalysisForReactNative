package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MultiItemCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: maa  reason: default package */
/* loaded from: classes3.dex */
public final class maa implements wkg, wkd, wkf {
    public static final LinearLayout.LayoutParams a = new LinearLayout.LayoutParams(0, -2, 1.0f);
    public static final LinearLayout.LayoutParams b = new LinearLayout.LayoutParams(-2, -2, 0.0f);
    public wzi c;
    public boolean d;
    public atir e;
    private final ajmy f;
    private final aafo g;
    private final acti h;
    private final Context i;
    private final lzu j;
    private final lzw k;
    private final lzs l;
    private final aaar m;
    private final View.OnClickListener n;
    private final ArrayList o = new ArrayList();
    private String p = "";
    private boolean q;
    private ViewGroup r;
    private ViewGroup s;
    private TextView t;
    private TextView u;
    private View v;
    private View w;
    private View x;
    private ImageView y;

    public maa(ajmy ajmyVar, aafo aafoVar, acti actiVar, Context context, wxc wxcVar, lzu lzuVar, lzw lzwVar, aaar aaarVar, lzs lzsVar) {
        this.f = ajmyVar;
        this.g = aafoVar;
        this.h = actiVar;
        this.i = context;
        this.j = lzuVar;
        this.k = lzwVar;
        new yzh(context);
        this.m = aaarVar;
        this.l = lzsVar;
        this.n = new lzy(this, wxcVar, aafoVar);
    }

    private final void b(View view) {
        if (view != null) {
            zag.g(view, R.id.multi_item_companion_card_stub, R.id.multi_item_companion_card).setVisibility(8);
        }
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.s.removeAllViews();
        }
        wzi wziVar = this.c;
        if (wziVar != null) {
            wziVar.c();
        }
        atir atirVar = this.e;
        if (atirVar != null && (atirVar.b & 1024) != 0) {
            lzu lzuVar = this.j;
            aunb aunbVar = atirVar.n;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            lzuVar.b(ajjh.k(aunbVar));
        }
        this.k.b();
    }

    private final void c() {
        ViewGroup viewGroup = this.r;
        if (viewGroup == null || this.e == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    @Override // defpackage.wke
    public final void a() {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.wke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r11, defpackage.ajrs r12) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.maa.d(android.view.View, ajrs):void");
    }

    @Override // defpackage.wke
    public final void e(View view) {
        this.d = false;
        b(view);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lzz lzzVar = (lzz) arrayList.get(i);
            lzzVar.c.setVisibility(8);
            lzzVar.e.setVisibility(8);
            lzzVar.f.setVisibility(8);
        }
        this.e = null;
    }

    @Override // defpackage.wke
    public final void f() {
        this.d = true;
        c();
    }

    @Override // defpackage.wkd
    public final boolean g(String str, PlayerResponseModel playerResponseModel, asit asitVar) {
        atir atirVar;
        this.p = str;
        this.e = null;
        asaj asajVar = playerResponseModel.a;
        atzu atzuVar = asajVar.A;
        if (atzuVar == null) {
            atzuVar = atzu.a;
        }
        if (atzuVar.b == 156112846) {
            atzu atzuVar2 = asajVar.A;
            if (atzuVar2 == null) {
                atzuVar2 = atzu.a;
            }
            if (atzuVar2.b == 156112846) {
                atirVar = (atir) atzuVar2.c;
            } else {
                atirVar = atir.a;
            }
            this.e = atirVar;
        }
        return this.e != null;
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
        atir atirVar;
        aaar aaarVar;
        aaar aaarVar2 = this.m;
        if (aaarVar2 != null && this.q) {
            this.q = false;
            aaarVar2.b();
        }
        atir atirVar2 = this.e;
        if (atirVar2 != null && (atirVar2.b & 4) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e);
            aafo aafoVar = this.g;
            apzg apzgVar = this.e.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        }
        if (wxoVar.a() == wzq.USER_SKIPPED && (atirVar = this.e) != null) {
            apzg apzgVar2 = atirVar.d;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            int ba = awwc.ba(((ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint) apzgVar2.qm(ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint)).b);
            if (ba != 0 && ba == 2 && (aaarVar = this.m) != null) {
                aaarVar.b();
            }
        }
        this.d = false;
    }

    @Override // defpackage.wkg
    public final boolean i(String str, aqfd aqfdVar, asit asitVar) {
        this.p = str;
        this.e = null;
        if ((aqfdVar.b & 16) != 0) {
            atir atirVar = aqfdVar.g;
            if (atirVar == null) {
                atirVar = atir.a;
            }
            this.e = atirVar;
            return true;
        }
        return false;
    }

    @Override // defpackage.wkf
    public final boolean j(String str, aunb aunbVar) {
        this.p = str;
        if (aunbVar == null || !aunbVar.qn(MultiItemCompanionAdRendererOuterClass.multiItemCompanionAdRenderer)) {
            return false;
        }
        this.e = (atir) aunbVar.qm(MultiItemCompanionAdRendererOuterClass.multiItemCompanionAdRenderer);
        return true;
    }

    @Override // defpackage.wkf
    public final boolean k(aunb aunbVar, boolean z) {
        if (!j(this.p, aunbVar)) {
            return false;
        }
        this.d = z;
        return true;
    }
}
