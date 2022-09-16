package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: abmc  reason: default package */
/* loaded from: classes.dex */
public abstract class abmc implements ajru {
    protected final View a;
    public final aafo b;
    public final acti c;
    private final TextView d = g();
    private final TextView e = f();
    private final ImageView f;
    private final ajnj g;

    public abmc(Context context, ajmr ajmrVar, aafo aafoVar, acth acthVar) {
        this.b = aafoVar;
        this.c = acthVar.oi();
        this.a = LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
        ImageView e = e();
        this.f = e;
        this.g = new ajnj(ajmrVar, e);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    protected abstract int d();

    protected abstract ImageView e();

    protected abstract TextView f();

    protected abstract TextView g();

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        final asqx asqxVar = (asqx) obj;
        TextView textView = this.d;
        arag aragVar = asqxVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.e;
        arag aragVar2 = asqxVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        if ((asqxVar.b & 128) != 0) {
            ajnj ajnjVar = this.g;
            avhn avhnVar = asqxVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajnjVar.k(avhnVar);
        }
        final acte acteVar = new acte(actj.LIVE_CHAT_DONATION_ANNOUNCEMENT_RENDERER);
        this.c.n(acteVar);
        if ((asqxVar.b & 1024) == 0 || this.b == null) {
            return;
        }
        this.a.setOnClickListener(new View.OnClickListener() { // from class: abmb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abmc abmcVar = abmc.this;
                asqx asqxVar2 = asqxVar;
                acte acteVar2 = acteVar;
                aafo aafoVar = abmcVar.b;
                apzg apzgVar = asqxVar2.g;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
                abmcVar.c.H(3, acteVar2, null);
            }
        });
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.setText((CharSequence) null);
        this.e.setText((CharSequence) null);
        this.a.setOnClickListener(null);
        this.g.a();
    }
}
