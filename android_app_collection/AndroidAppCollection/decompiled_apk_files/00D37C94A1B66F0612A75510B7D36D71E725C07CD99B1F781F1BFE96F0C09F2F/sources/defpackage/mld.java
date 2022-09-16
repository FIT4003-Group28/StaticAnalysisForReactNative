package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mld  reason: default package */
/* loaded from: classes3.dex */
public final class mld implements ajru {
    public final ampq a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final gga e;
    private final gga f;
    private final ajrx g;
    private final ajxz h;

    public mld(Context context, ajsn ajsnVar, ajxz ajxzVar, ggb ggbVar, ampq ampqVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.limited_state_msg, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.lim_state_msg_header_text);
        this.c = (TextView) inflate.findViewById(R.id.lim_state_msg_subtext);
        this.d = (ImageView) inflate.findViewById(R.id.lim_state_msg_icon);
        this.e = ggbVar.a((TextView) inflate.findViewById(R.id.learn_more_button));
        this.f = ggbVar.a((TextView) inflate.findViewById(R.id.go_home_button));
        this.g = ajsnVar;
        this.h = ajxzVar;
        this.a = ampqVar;
        ajsnVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((ajsn) this.g).a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        apoj apojVar;
        aspd aspdVar = (aspd) obj;
        TextView textView = this.b;
        apoj apojVar2 = null;
        if ((aspdVar.b & 1) != 0) {
            aragVar = aspdVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.c;
        if ((aspdVar.b & 2) != 0) {
            aragVar2 = aspdVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        if ((aspdVar.b & 8) != 0) {
            aunb aunbVar = aspdVar.f;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                aunb aunbVar2 = aspdVar.f;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apojVar = null;
            }
            this.e.b(apojVar, ajrsVar.a);
        }
        if ((aspdVar.b & 16) != 0) {
            aunb aunbVar3 = aspdVar.g;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
                aunb aunbVar4 = aspdVar.g;
                if (aunbVar4 == null) {
                    aunbVar4 = aunb.a;
                }
                apojVar2 = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
            }
            this.f.b(apojVar2, ajrsVar.a);
            this.f.d = new akbi() { // from class: mlc
                @Override // defpackage.akbi
                public final void oL(aopc aopcVar) {
                    mld mldVar = mld.this;
                    if (mldVar.a.h()) {
                        ((ofu) mldVar.a.c()).h(false);
                    }
                }
            };
        }
        if ((aspdVar.b & 4) != 0) {
            ImageView imageView = this.d;
            arhs arhsVar = aspdVar.e;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = this.h.a(b);
            if (a != 0) {
                imageView.setImageResource(a);
                imageView.setVisibility(0);
            }
        }
        this.g.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
