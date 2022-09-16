package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountLinkButtonRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ndv  reason: default package */
/* loaded from: classes3.dex */
public final class ndv extends ajsl {
    public final ImageView a;
    public final Activity b;
    public final aafo c;
    public aowb d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final aagi i;
    private aypg j;
    private final ajmy k;

    public ndv(Activity activity, aafo aafoVar, ajmy ajmyVar, aagi aagiVar) {
        this.b = activity;
        aafoVar.getClass();
        this.c = aafoVar;
        this.i = aagiVar;
        this.k = ajmyVar;
        View inflate = View.inflate(activity, R.layout.account_link_setting_item, null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.link_status);
        this.a = (ImageView) inflate.findViewById(R.id.avatar);
        this.h = inflate.findViewById(R.id.item_view);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aowc aowcVar = (aowc) obj;
        aunb aunbVar = aowcVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        this.d = (aowb) aunbVar.qm(AccountLinkButtonRendererOuterClass.accountLinkButtonRenderer);
        TextView textView = this.f;
        if ((aowcVar.b & 2) != 0) {
            aragVar = aowcVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        this.j = this.i.c().h(this.d.f, false).X(aypa.a()).at(new ayqb() { // from class: ndr
            @Override // defpackage.ayqb
            public final void a(Object obj2) {
                ndv ndvVar = ndv.this;
                aajj aajjVar = ((aajp) obj2).c;
                if (aajjVar instanceof aowf) {
                    ndvVar.g(((aowf) aajjVar).getLinked().booleanValue());
                } else {
                    zep.b("Entity update does not have account link status.");
                }
            }
        }, kjt.r);
        f(new ndp(this));
        this.h.setClickable(true);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: ndo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndv ndvVar = ndv.this;
                ndvVar.f(new ndp(ndvVar, 1));
            }
        });
        zag.k(this.h, null);
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.third_party_icon_size);
        avhn avhnVar = aowcVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        Uri s = akel.s(avhnVar, dimensionPixelSize);
        if (s != null) {
            this.a.setImageDrawable(akf.a(this.b, R.drawable.third_party_icon_placeholder));
            this.k.l(s, new ndt(this));
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aowc) obj).f.I();
    }

    public final void f(final ndu nduVar) {
        this.i.c().f(this.d.f).y(aypa.a()).o(new ayqb() { // from class: ndq
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ndu.this.a(((aowf) ((aajj) obj)).getLinked().booleanValue());
            }
        }).l(fzb.j).S();
    }

    public final void g(boolean z) {
        arag aragVar;
        TextView textView = this.g;
        if (z) {
            apok apokVar = this.d.d;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            apok apokVar2 = this.d.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            aragVar = apojVar2.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        }
        textView.setText(ajgl.b(aragVar));
        this.h.setClickable(true);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        aypg aypgVar = this.j;
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        ayqi.c((AtomicReference) this.j);
    }
}
