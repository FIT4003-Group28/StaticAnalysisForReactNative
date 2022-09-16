package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mfq  reason: default package */
/* loaded from: classes3.dex */
public final class mfq implements ajru {
    public aqbf a;
    private final Activity b;
    private final ajxz c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final fmg h;

    public mfq(Activity activity, final aafo aafoVar, ajxz ajxzVar, fmh fmhVar, fnz fnzVar) {
        this.b = activity;
        this.c = ajxzVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.backstage_subscribe_bar, (ViewGroup) null);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.channel_title);
        this.f = (TextView) inflate.findViewById(R.id.channel_subscribers);
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.g = textView;
        this.h = fmhVar.a(textView, fnzVar.a(inflate.findViewById(R.id.subscription_notification_view)));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: mfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mfq mfqVar = mfq.this;
                aafo aafoVar2 = aafoVar;
                aqbf aqbfVar = mfqVar.a;
                if (aqbfVar == null || (aqbfVar.b & 2) == 0) {
                    return;
                }
                apzg apzgVar = aqbfVar.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar2.c(apzgVar, null);
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        int i;
        arag aragVar2;
        aqbf aqbfVar = (aqbf) obj;
        this.a = aqbfVar;
        aunb aunbVar = aqbfVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        avaq avaqVar = (avaq) aunbVar.qm(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        acti actiVar = ajrsVar.a;
        TextView textView = this.e;
        arag aragVar3 = null;
        if ((aqbfVar.b & 1) != 0) {
            aragVar = aqbfVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        if ((aqbfVar.b & 8) != 0) {
            ajxz ajxzVar = this.c;
            arhs arhsVar = aqbfVar.f;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i = ajxzVar.a(b);
        } else {
            i = 0;
        }
        if (i > 0) {
            Drawable drawable = this.b.getResources().getDrawable(i);
            drawable.mutate().setColorFilter(this.e.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
            drawable.setBounds(0, 0, 55, 55);
            this.e.setCompoundDrawablesRelative(null, null, drawable, null);
            this.e.setCompoundDrawablePadding(2);
        } else {
            this.e.setCompoundDrawablesRelative(null, null, null, null);
        }
        TextView textView2 = this.f;
        if ((avaqVar.b & 64) != 0) {
            aragVar2 = avaqVar.k;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        aopa mo52toBuilder = avaqVar.mo52toBuilder();
        Activity activity = this.b;
        aqbf aqbfVar2 = this.a;
        if ((aqbfVar2.b & 1) != 0 && (aragVar3 = aqbfVar2.c) == null) {
            aragVar3 = arag.a;
        }
        fyv.d(activity, mo52toBuilder, ajgl.b(aragVar3));
        this.h.i((avaq) mo52toBuilder.mo39build(), actiVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h.d();
    }
}
