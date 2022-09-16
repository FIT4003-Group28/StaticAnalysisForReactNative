package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ClientActionEndpointOuterClass$ClientActionEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yfe  reason: default package */
/* loaded from: classes4.dex */
public final class yfe extends ajsl {
    public final Context a;
    public final ImageView b;
    public awid c;
    private final aafo d;
    private final LinearLayout e;
    private final LinearLayout f;
    private final LinearLayout g;
    private final TextView h;
    private final View i;
    private final View j;
    private final yfd k;
    private final LinearLayout l;
    private final LinearLayout m;
    private final TextView n;
    private int o;
    private List p;
    private ajrs q;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ajsa] */
    public yfe(Context context, aafo aafoVar, ajyi ajyiVar) {
        this.a = context;
        aafoVar.getClass();
        this.d = aafoVar;
        this.o = 0;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ypc_offers_list_layout, (ViewGroup) null);
        this.e = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.collapsed_offers);
        this.l = linearLayout2;
        this.m = (LinearLayout) linearLayout.findViewById(R.id.expanded_offers);
        this.h = (TextView) linearLayout.findViewById(R.id.offer_info_header);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.expand_button);
        this.b = imageView;
        this.i = linearLayout.findViewById(R.id.separator);
        this.j = linearLayout.findViewById(R.id.expanded_separator);
        this.g = (LinearLayout) linearLayout.findViewById(R.id.additional_offer_info_list_container);
        linearLayout2.setOnClickListener(new yfb(this, 1));
        imageView.setOnClickListener(new yfb(this));
        this.f = (LinearLayout) linearLayout.findViewById(R.id.single_ypc_offers);
        this.k = new yfd(context, ajyiVar.get());
        this.n = (TextView) linearLayout2.findViewById(R.id.more_offer_info_header);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        ArrayList arrayList;
        this.c = (awid) obj;
        this.q = ajrsVar;
        this.f.removeAllViews();
        amuk c = yce.c(this.c);
        for (int i = 0; i < c.size(); i++) {
            awia awiaVar = (awia) c.get(i);
            if (awiaVar != null) {
                this.f.addView(this.k.c(this.k.d(this.q), awiaVar));
            }
        }
        LinearLayout linearLayout = this.f;
        zag.o(linearLayout, linearLayout.getChildCount() > 0);
        awhw d = yce.d(this.c);
        awhw d2 = yce.d(this.c);
        arag aragVar = null;
        if (d2 == null || d2.e.size() == 0) {
            arrayList = null;
        } else {
            aopu<awhz> aopuVar = d2.e;
            arrayList = new ArrayList(aopuVar.size());
            for (awhz awhzVar : aopuVar) {
                if ((awhzVar.b & 1) != 0) {
                    awia awiaVar2 = awhzVar.c;
                    if (awiaVar2 == null) {
                        awiaVar2 = awia.a;
                    }
                    arrayList.add(awiaVar2);
                }
            }
        }
        this.p = arrayList;
        if (d == null || arrayList == null) {
            zag.o(this.n, false);
            zag.o(this.m, false);
            zag.o(this.l, false);
            zag.o(this.j, false);
        } else {
            if (this.o == 0) {
                this.o = true != d.c ? 2 : 1;
            }
            TextView textView = this.n;
            if ((d.b & 2) != 0 && (aragVar = d.d) == null) {
                aragVar = arag.a;
            }
            zag.m(textView, aafv.a(aragVar, new aafo() { // from class: yfc
                @Override // defpackage.aafo
                public final /* synthetic */ void a(apzg apzgVar) {
                    aafn.a(this, apzgVar);
                }

                @Override // defpackage.aafo
                public final /* synthetic */ void b(List list) {
                    aafn.b(this, list);
                }

                @Override // defpackage.aafo
                public final void c(apzg apzgVar, Map map) {
                    yfe yfeVar = yfe.this;
                    ClientActionEndpointOuterClass$ClientActionEndpoint clientActionEndpointOuterClass$ClientActionEndpoint = (ClientActionEndpointOuterClass$ClientActionEndpoint) apzgVar.qm(ClientActionEndpointOuterClass$ClientActionEndpoint.clientActionEndpoint);
                    int i2 = 1;
                    if ((clientActionEndpointOuterClass$ClientActionEndpoint.b & 1) != 0) {
                        apvr apvrVar = clientActionEndpointOuterClass$ClientActionEndpoint.c;
                        if (apvrVar == null) {
                            apvrVar = apvr.a;
                        }
                        int d3 = apwt.d(apvrVar.b);
                        if (d3 != 0) {
                            i2 = d3;
                        }
                        if (i2 - 1 != 2) {
                            return;
                        }
                        yfeVar.g();
                        yfeVar.h();
                    }
                }

                @Override // defpackage.aafo
                public final /* synthetic */ void d(List list, Map map) {
                    aafn.c(this, list, map);
                }

                @Override // defpackage.aafo
                public final /* synthetic */ void e(List list, Object obj2) {
                    aafn.d(this, list, obj2);
                }
            }, false));
            int i2 = this.o;
            if (i2 == 2) {
                g();
                h();
            } else if (i2 == 1) {
                zag.o(this.l, true);
                zag.o(this.n, true);
                zag.o(this.m, false);
                zag.o(this.j, true);
                this.o = 1;
            }
        }
        arag aragVar2 = this.c.h;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        Spanned b = ajgl.b(aragVar2);
        if (TextUtils.isEmpty(b)) {
            zag.o(this.h, false);
            zag.o(this.b, false);
            zag.o(this.g, false);
            zag.o(this.i, false);
            return;
        }
        zag.m(this.h, b);
        CharSequence[] e = yce.e(this.c.i, this.d);
        if (e == null || e.length == 0) {
            zag.o(this.b, false);
            zag.o(this.g, false);
            return;
        }
        zag.o(this.b, true);
        zag.o(this.g, true);
        if (this.b.isSelected()) {
            f(this.c);
        } else {
            j();
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awid) obj).j.I();
    }

    public final void f(awid awidVar) {
        CharSequence[] e = yce.e(awidVar.i, this.d);
        if (e == null || e.length <= 0) {
            zag.o(this.g, false);
            return;
        }
        zag.o(this.g, true);
        int i = 0;
        while (i < e.length) {
            if (i >= this.g.getChildCount()) {
                View.inflate(this.a, R.layout.ypc_offers_list_additional_offer_info_text, this.g);
            }
            zag.m((TextView) this.g.getChildAt(i), e[i]);
            i++;
        }
        while (i < this.g.getChildCount()) {
            zag.o(this.g.getChildAt(i), false);
            i++;
        }
    }

    public final void g() {
        this.m.removeAllViews();
        if (this.p != null) {
            for (int i = 0; i < this.p.size(); i++) {
                awia awiaVar = (awia) this.p.get(i);
                if (awiaVar != null) {
                    this.m.addView(this.k.c(this.k.d(this.q), awiaVar));
                }
            }
        }
    }

    public final void h() {
        zag.o(this.l, false);
        zag.o(this.n, false);
        zag.o(this.m, true);
        zag.o(this.j, false);
        this.o = 2;
    }

    public final void j() {
        zag.o(this.g, false);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.o = 0;
        this.k.e(this.f);
        this.m.removeAllViews();
        List list = this.p;
        if (list != null) {
            list.clear();
        }
    }
}
