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
/* renamed from: fpl  reason: default package */
/* loaded from: classes3.dex */
public final class fpl extends ajsl {
    private final ajrx a;
    private final ajmy b;
    private final ajrp c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final akbm i;
    private final int j;

    public fpl(Context context, ViewGroup viewGroup, gem gemVar, ajmy ajmyVar, aafo aafoVar, akbn akbnVar) {
        this.a = gemVar;
        this.b = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_tvfilm_entry_point_item, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) inflate.findViewById(R.id.action_button);
        this.h = textView;
        this.i = akbnVar.a(textView);
        gemVar.c(inflate);
        this.c = new ajrp(aafoVar, gemVar);
        this.j = zew.i(context.getResources().getDisplayMetrics(), 8);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        apoj apojVar;
        aqex aqexVar = (aqex) obj;
        ajmy ajmyVar = this.b;
        ImageView imageView = this.e;
        avhn avhnVar = aqexVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.f;
        if ((aqexVar.b & 2) != 0) {
            aragVar = aqexVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.g;
        if ((aqexVar.b & 4) != 0) {
            aragVar2 = aqexVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        if ((aqexVar.b & 8) != 0) {
            aunb aunbVar = aqexVar.f;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        this.i.b(apojVar, ajrsVar.a);
        if ((aqexVar.b & 16) != 0) {
            ajrp ajrpVar = this.c;
            acti actiVar = ajrsVar.a;
            apzg apzgVar = aqexVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
            zag.k(this.d, null);
            this.h.setClickable(false);
        }
        zgd.t(this.d, zgd.e(this.j), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqex) obj).h.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
