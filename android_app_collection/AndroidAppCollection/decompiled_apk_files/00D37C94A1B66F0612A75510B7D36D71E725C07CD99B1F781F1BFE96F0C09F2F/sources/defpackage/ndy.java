package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: ndy  reason: default package */
/* loaded from: classes3.dex */
public final class ndy extends ajsl {
    private final ajmy a;
    private final fmh b;
    private final akbk c;
    private final View d;
    private final ViewGroup e;
    private final ImageView f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final fta n;
    private fmg o;
    private akbj p;

    public ndy(Activity activity, ajmy ajmyVar, ftb ftbVar, fmh fmhVar, akbk akbkVar) {
        this.a = ajmyVar;
        this.b = fmhVar;
        this.c = akbkVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.interactive_tabbed_header, (ViewGroup) null);
        this.d = inflate;
        this.e = (ViewGroup) inflate.findViewById(R.id.channel_banner_container);
        this.f = (ImageView) inflate.findViewById(R.id.banner);
        this.g = (ImageView) inflate.findViewById(R.id.box_art);
        this.h = (TextView) inflate.findViewById(R.id.channel_title);
        this.i = (TextView) inflate.findViewById(R.id.auto_generated_notice);
        this.j = (TextView) inflate.findViewById(R.id.description);
        this.k = (TextView) inflate.findViewById(R.id.metadata);
        this.l = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.m = (TextView) inflate.findViewById(R.id.subscriber_count);
        this.n = ftbVar.b(activity, (ViewStub) inflate.findViewById(R.id.metadata_badge));
    }

    private final void f() {
        this.g.setBackground(null);
        this.f.setBackground(null);
        this.h.setText((CharSequence) null);
        this.i.setText((CharSequence) null);
        TextView textView = this.j;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.k;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        askk askkVar = (askk) obj;
        f();
        avhn avhnVar2 = askkVar.i;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        boolean A = akel.A(avhnVar2);
        if (A) {
            this.a.h(this.f, avhnVar2);
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            zag.o(viewGroup, A);
        } else {
            zag.o(this.f, A);
        }
        if (askkVar.c == 6) {
            avhnVar = (avhn) askkVar.d;
        } else {
            avhnVar = avhn.a;
        }
        if (akel.A(avhnVar)) {
            this.a.h(this.g, avhnVar);
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
        TextView textView = this.h;
        arag aragVar5 = null;
        if ((askkVar.b & 2) != 0) {
            aragVar = askkVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.i;
        if ((askkVar.b & 64) != 0) {
            aragVar2 = askkVar.k;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = this.j;
        if (textView3 != null) {
            if ((askkVar.b & 4) != 0) {
                aragVar4 = askkVar.f;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            zag.m(textView3, ajgl.b(aragVar4));
        }
        TextView textView4 = this.k;
        if (textView4 != null) {
            if ((askkVar.b & 8) != 0) {
                aragVar3 = askkVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            zag.m(textView4, ajgl.b(aragVar3));
        }
        if (askkVar.h.size() > 0) {
            aunb aunbVar = (aunb) askkVar.h.get(0);
            if (aunbVar.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.n.f((atfh) aunbVar.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            }
        }
        for (aunb aunbVar2 : askkVar.j) {
            if (!aunbVar2.qn(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
                if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
                    akbj a = this.c.a(this.l);
                    this.p = a;
                    a.b((apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer), ajrsVar.a);
                    return;
                }
            } else {
                avaq avaqVar = (avaq) aunbVar2.qm(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                fmg a2 = this.b.a(this.l, null);
                this.o = a2;
                a2.i(avaqVar, ajrsVar.a);
                TextView textView5 = this.m;
                if ((avaqVar.b & 16) != 0 && (aragVar5 = avaqVar.i) == null) {
                    aragVar5 = arag.a;
                }
                zag.m(textView5, ajgl.b(aragVar5));
                return;
            }
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        askk askkVar = (askk) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        f();
        fmg fmgVar = this.o;
        if (fmgVar != null) {
            fmgVar.d();
            this.o = null;
        }
        this.p = null;
    }
}
