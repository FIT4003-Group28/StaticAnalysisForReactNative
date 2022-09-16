package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipConfirmCancelRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yaf  reason: default package */
/* loaded from: classes4.dex */
public final class yaf extends xzg {
    public final aafo c;
    public final LoadingFrameLayout d;
    public final xzh e;
    private final xzu f;
    private final View g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private auxy k;

    public yaf(Context context, aafo aafoVar, ycs ycsVar, xzv xzvVar, ViewGroup viewGroup, xzh xzhVar, xyw xywVar) {
        super(xywVar);
        this.e = xzhVar;
        this.c = new xzy(aafoVar, new xzx(new Runnable() { // from class: yad
            @Override // java.lang.Runnable
            public final void run() {
                yaf.this.e.a();
            }
        }, 1));
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_sponsorship_confirm_cancel_layout, viewGroup, false);
        this.g = inflate;
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.j = (TextView) inflate.findViewById(R.id.description);
        this.f = xzvVar.a(inflate);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.confirm_button_container);
        this.d = loadingFrameLayout;
        loadingFrameLayout.a();
        this.h = (TextView) inflate.findViewById(R.id.confirm_button);
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: yab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yaf.this.e.a();
            }
        });
        ycsVar.a(new yae(this));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.xzg
    public final void d() {
        aafn.c(this.c, this.k.h, null);
    }

    @Override // defpackage.xzg, defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(final ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        auxy auxyVar = (auxy) obj;
        this.a.a.add(this);
        this.b = true;
        this.k = auxyVar;
        aunb aunbVar = auxyVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        auxz auxzVar = (auxz) aunbVar.qm(SponsorshipConfirmCancelRendererOuterClass.sponsorshipDialogHeaderRenderer);
        xzu xzuVar = this.f;
        avhn avhnVar = auxzVar.b;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        avhn avhnVar2 = auxzVar.d;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        avhn avhnVar3 = auxzVar.c;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        arhs arhsVar = auxzVar.e;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        xzuVar.a(avhnVar, avhnVar2, avhnVar3, arhsVar);
        TextView textView = this.i;
        if ((auxyVar.b & 2) != 0) {
            aragVar = auxyVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.j;
        if ((auxyVar.b & 4) != 0) {
            aragVar2 = auxyVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        apok apokVar = auxyVar.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        final apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        TextView textView3 = this.h;
        arag aragVar3 = apojVar.i;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar3));
        this.h.setOnClickListener(new View.OnClickListener() { // from class: yac
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yaf yafVar = yaf.this;
                apoj apojVar2 = apojVar;
                ajrs ajrsVar2 = ajrsVar;
                yafVar.b = false;
                yafVar.d.c();
                Map f = actk.f(apojVar2);
                f.putAll(ajrsVar2.e());
                aafo aafoVar = yafVar.c;
                apzg apzgVar = apojVar2.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, f);
            }
        });
        acti actiVar = ajrsVar.a;
        actiVar.u(new acte(auxyVar.i), null);
        actiVar.u(new acte(apojVar.t), null);
        aafn.c(this.c, auxyVar.g, null);
    }
}
