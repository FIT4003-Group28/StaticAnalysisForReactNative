package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: fpj  reason: default package */
/* loaded from: classes3.dex */
public final class fpj extends ajsl {
    final LinearLayout a;
    private final Context b;
    private final ajrx c;
    private final ggb d;
    private final yni e;
    private final View f;

    public fpj(Context context, gem gemVar, ggb ggbVar, yni yniVar) {
        this.b = context;
        this.c = gemVar;
        this.d = ggbVar;
        this.e = yniVar;
        View inflate = View.inflate(context, R.layout.compact_multi_offer_view, null);
        this.f = inflate;
        this.a = (LinearLayout) inflate.findViewById(R.id.offer_rows);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        int i;
        apoj apojVar;
        aopu aopuVar = ((aqee) obj).b;
        this.a.removeAllViews();
        Iterator it = aopuVar.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            aqed aqedVar = (aqed) it.next();
            if (aqedVar.b.size() > 0) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.b).inflate(R.layout.compact_multi_offer_payment_row, (ViewGroup) this.a, false);
                for (aqec aqecVar : aqedVar.b) {
                    apok apokVar = aqecVar.b;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    if ((apokVar.b & 1) != 0) {
                        apok apokVar2 = aqecVar.b;
                        if (apokVar2 == null) {
                            apokVar2 = apok.a;
                        }
                        apojVar = apokVar2.c;
                        if (apojVar == null) {
                            apojVar = apoj.a;
                        }
                    } else {
                        apojVar = null;
                    }
                    acti actiVar = ajrsVar.a;
                    YouTubeTextView youTubeTextView = (YouTubeTextView) LayoutInflater.from(this.b).inflate(R.layout.compact_multi_offer_payment_cell, (ViewGroup) linearLayout, false);
                    gga a = this.d.a(youTubeTextView);
                    a.d = new fpi(this.e, actiVar);
                    a.b(apojVar, actiVar);
                    linearLayout.addView(youTubeTextView);
                }
                this.a.addView(linearLayout);
            }
        }
        LinearLayout linearLayout2 = this.a;
        if (linearLayout2.getChildCount() <= 0) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqee) obj).c.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
