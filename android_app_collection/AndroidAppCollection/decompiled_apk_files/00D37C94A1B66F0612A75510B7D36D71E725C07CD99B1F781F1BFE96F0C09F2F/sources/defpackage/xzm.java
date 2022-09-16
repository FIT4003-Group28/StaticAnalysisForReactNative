package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xzm  reason: default package */
/* loaded from: classes4.dex */
public final class xzm extends ajsl implements ydp, zdx {
    private static final String d = System.getProperty("line.separator");
    public final aafo a;
    public final xzh b;
    public final LoadingFrameLayout c;
    private final xzu e;
    private final ydq f;
    private final View g;
    private final yak h;
    private final yak i;
    private final View j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;

    public xzm(Context context, ViewGroup viewGroup, aafo aafoVar, ydq ydqVar, yal yalVar, xzv xzvVar, xzh xzhVar) {
        xzy xzyVar = new xzy(aafoVar, new xzx(new Runnable() { // from class: xzl
            @Override // java.lang.Runnable
            public final void run() {
                xzm.this.b.a();
            }
        }, 1));
        this.a = xzyVar;
        this.f = ydqVar;
        this.b = xzhVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_membership_with_perks_offer_layout, viewGroup, false);
        this.g = inflate;
        this.e = xzvVar.a(inflate);
        View findViewById = inflate.findViewById(R.id.close_button);
        this.j = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: xzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xzm.this.b.a();
            }
        });
        this.h = yalVar.a(xzyVar, inflate.findViewById(R.id.yt_perks));
        this.i = yalVar.a(xzyVar, inflate.findViewById(R.id.custom_perks));
        this.m = (TextView) inflate.findViewById(R.id.offer_alerts);
        this.k = (TextView) inflate.findViewById(R.id.offer_price_text);
        this.l = (TextView) inflate.findViewById(R.id.offer_payment_clauses);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.purchase_button_container);
        this.c = loadingFrameLayout;
        loadingFrameLayout.a();
        this.n = (TextView) inflate.findViewById(R.id.purchase_button);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(final ajrs ajrsVar, Object obj) {
        arag aragVar;
        List asList;
        arag aragVar2;
        atec atecVar = (atec) obj;
        this.f.d(this);
        xzu xzuVar = this.e;
        avhn avhnVar = atecVar.k;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        avhn avhnVar2 = atecVar.e;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        avhn avhnVar3 = atecVar.d;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        arhs arhsVar = atecVar.f;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        xzuVar.a(avhnVar, avhnVar2, avhnVar3, arhsVar);
        View view = this.j;
        apok apokVar = atecVar.j;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if (apokVar != null) {
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            aovs aovsVar = apojVar.s;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            aovr aovrVar = aovsVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            if ((aovrVar.b & 2) != 0) {
                apoj apojVar2 = apokVar.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                aovs aovsVar2 = apojVar2.s;
                if (aovsVar2 == null) {
                    aovsVar2 = aovs.a;
                }
                aovr aovrVar2 = aovsVar2.c;
                if (aovrVar2 == null) {
                    aovrVar2 = aovr.a;
                }
                view.setContentDescription(aovrVar2.c);
            }
        }
        TextView textView = this.k;
        if ((atecVar.b & 16) != 0) {
            aragVar = atecVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        final TextView textView2 = this.k;
        textView2.getClass();
        textView2.post(new Runnable() { // from class: xzk
            @Override // java.lang.Runnable
            public final void run() {
                textView2.requestLayout();
            }
        });
        this.l.setText(ajgl.j(d, aafv.d(atecVar.h, this.a)));
        aopu<arag> aopuVar = atecVar.c;
        aafo aafoVar = this.a;
        if (aopuVar == null || aopuVar.isEmpty()) {
            asList = Arrays.asList(aafv.a);
        } else {
            asList = new ArrayList();
            for (arag aragVar3 : aopuVar) {
                asList.add(aafv.a(aragVar3, aafoVar, true));
            }
        }
        boolean z = !asList.isEmpty();
        if (z) {
            this.m.setText(ajgl.j(d, asList));
        }
        zag.o(this.m, z);
        apok apokVar2 = atecVar.i;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        final apoj apojVar3 = apokVar2.c;
        if (apojVar3 == null) {
            apojVar3 = apoj.a;
        }
        TextView textView3 = this.n;
        if ((apojVar3.b & 256) != 0) {
            aragVar2 = apojVar3.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView3.setText(ajgl.b(aragVar2));
        this.n.setOnClickListener(new View.OnClickListener() { // from class: xzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xzm xzmVar = xzm.this;
                apoj apojVar4 = apojVar3;
                ajrs ajrsVar2 = ajrsVar;
                xzmVar.c.c();
                Map f = actk.f(apojVar4);
                f.putAll(ajrsVar2.e());
                aafo aafoVar2 = xzmVar.a;
                apzg apzgVar = apojVar4.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar2.c(apzgVar, f);
            }
        });
        yak yakVar = this.h;
        aunb aunbVar = atecVar.l;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        xzu.c(yakVar, aunbVar);
        yak yakVar2 = this.i;
        aunb aunbVar2 = atecVar.m;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        xzu.c(yakVar2, aunbVar2);
        ajrsVar.a.u(new acte(apojVar3.t), null);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atec) obj).n.I();
    }

    @Override // defpackage.ydp
    public final void h() {
        this.c.a();
    }

    @Override // defpackage.zdx
    public final void j() {
        throw null;
    }

    @Override // defpackage.ydp
    public final void mE() {
        this.c.a();
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        this.c.a();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.e(this);
    }
}
