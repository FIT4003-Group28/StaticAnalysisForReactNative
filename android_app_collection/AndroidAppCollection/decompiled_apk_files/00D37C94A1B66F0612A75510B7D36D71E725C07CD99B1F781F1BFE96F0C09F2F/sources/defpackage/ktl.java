package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.red.presenter.CompactYpcOfferModuleView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ktl  reason: default package */
/* loaded from: classes3.dex */
public final class ktl extends ajsl {
    private final CompactYpcOfferModuleView a;
    private final ajrx b;
    private final gga c;
    private final aafo d;
    private final acuh e;

    public ktl(Context context, gem gemVar, aafo aafoVar, ggb ggbVar, acuh acuhVar) {
        context.getClass();
        aafoVar.getClass();
        this.b = gemVar;
        this.d = aafoVar;
        this.e = acuhVar;
        CompactYpcOfferModuleView compactYpcOfferModuleView = (CompactYpcOfferModuleView) LayoutInflater.from(context).inflate(R.layout.compact_ypc_offer_module_custom_view, (ViewGroup) null);
        this.a = compactYpcOfferModuleView;
        this.c = ggbVar.a(compactYpcOfferModuleView.c);
        gemVar.c(compactYpcOfferModuleView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.b).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        aqef aqefVar = (aqef) obj;
        if (!this.e.b(aqefVar)) {
            this.e.a(aqefVar);
            aafx.c(this.d, aqefVar.g, aqefVar);
        }
        TextView textView = this.a.a;
        apoj apojVar = null;
        if (textView != null) {
            if ((aqefVar.b & 2) != 0) {
                aragVar2 = aqefVar.c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            zag.m(textView, ajgl.b(aragVar2));
        }
        TextView textView2 = this.a.b;
        if (textView2 != null) {
            if ((aqefVar.b & 4) != 0) {
                aragVar = aqefVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView2, ajgl.b(aragVar));
        }
        if (this.a.c != null) {
            gga ggaVar = this.c;
            apok apokVar = aqefVar.e;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) != 0) {
                apok apokVar2 = aqefVar.e;
                if (apokVar2 == null) {
                    apokVar2 = apok.a;
                }
                apojVar = apokVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            }
            ggaVar.b(apojVar, ajrsVar.a);
        }
        this.b.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqef) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
