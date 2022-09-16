package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abnc  reason: default package */
/* loaded from: classes.dex */
public abstract class abnc extends abnb {
    private final acte j;
    private final ImageView k;
    private final ajnj l;

    public abnc(Context context, acth acthVar, aafo aafoVar, ajmr ajmrVar) {
        super(context, acthVar, aafoVar);
        this.j = new acte(actj.PDG_LIVE_CHAT_TICKER_PAID_MESSAGE);
        ImageView imageView = (ImageView) this.b.findViewById(R.id.currency_image);
        this.k = imageView;
        this.l = new ajnj(ajmrVar, imageView);
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int f(Object obj) {
        return ((astb) obj).e;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int g(Object obj) {
        return ((astb) obj).g;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int h(Object obj) {
        return ((astb) obj).f;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return ((astb) obj).j * 1000;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ long j(Object obj) {
        return ((astb) obj).k * 1000;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ Spanned k(Object obj) {
        arag aragVar;
        astb astbVar = (astb) obj;
        if ((astbVar.b & 2) != 0) {
            aragVar = astbVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.abnb
    protected final acte l() {
        return this.j;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ apzg m(Object obj) {
        apzg apzgVar = ((astb) obj).l;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ avhn n(Object obj) {
        avhn avhnVar = ((astb) obj).i;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    @Override // defpackage.abnb, defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        astb astbVar = (astb) obj;
        super.oK(ajrsVar, astbVar);
        if (astbVar == null) {
            avhnVar = null;
        } else {
            aqjv aqjvVar = astbVar.h;
            if (aqjvVar == null) {
                aqjvVar = aqjv.a;
            }
            avhnVar = aqjvVar.b;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        }
        if (akel.A(avhnVar)) {
            this.k.setVisibility(0);
            this.l.k(avhnVar);
            return;
        }
        this.k.setVisibility(8);
    }

    @Override // defpackage.abnb, defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.l.a();
    }
}
