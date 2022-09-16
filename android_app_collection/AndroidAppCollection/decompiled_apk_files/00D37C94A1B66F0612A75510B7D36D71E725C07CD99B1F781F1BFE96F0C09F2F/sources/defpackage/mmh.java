package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mmh  reason: default package */
/* loaded from: classes3.dex */
public final class mmh implements ajru {
    public final View a;
    public final aafo b;
    public final acti c;
    public final DismissalFollowUpDialogFragmentController d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public mmh(View view, aafo aafoVar, acti actiVar, DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController) {
        this.a = view;
        this.b = aafoVar;
        this.c = actiVar;
        this.d = dismissalFollowUpDialogFragmentController;
        this.e = (TextView) view.findViewById(R.id.success_response_text);
        final TextView textView = (TextView) view.findViewById(R.id.undo_text);
        this.f = textView;
        this.g = (TextView) view.findViewById(R.id.dismissal_reasons_text);
        final int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.notification_text_min_touch_area_height);
        final View view2 = (View) textView.getParent();
        view2.post(new Runnable() { // from class: mme
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView2 = textView;
                int i = dimensionPixelSize;
                View view3 = view2;
                Rect rect = new Rect();
                textView2.getHitRect(rect);
                if (rect.height() >= i) {
                    return;
                }
                int height = (i - rect.height()) / 2;
                rect.top -= height;
                rect.bottom += height;
                view3.setTouchDelegate(new TouchDelegate(rect, textView2));
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, final atpl atplVar) {
        arag aragVar;
        arag aragVar2;
        final lsa lsaVar = null;
        ajrsVar.a.u(new acte(atplVar.f), null);
        TextView textView = this.e;
        arag aragVar3 = atplVar.c;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar3));
        TextView textView2 = this.e;
        arag aragVar4 = atplVar.c;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        textView2.setContentDescription(mmi.f(aragVar4));
        TextView textView3 = this.f;
        arag aragVar5 = atplVar.d;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar5));
        TextView textView4 = this.f;
        arag aragVar6 = atplVar.d;
        if (aragVar6 == null) {
            aragVar6 = arag.a;
        }
        textView4.setContentDescription(mmi.f(aragVar6));
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atplVar);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: mmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mmh mmhVar = mmh.this;
                atpl atplVar2 = atplVar;
                Map map = hashMap;
                if ((atplVar2.b & 4) != 0) {
                    aafo aafoVar = mmhVar.b;
                    apzg apzgVar = atplVar2.e;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, map);
                }
            }
        });
        if (!atplVar.qn(atpk.b)) {
            zag.o(this.g, false);
            return;
        }
        arro arroVar = (arro) atplVar.qm(atpk.b);
        TextView textView5 = this.g;
        if ((arroVar.b & 4) != 0) {
            aragVar = arroVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView5, ajgl.b(aragVar));
        TextView textView6 = this.g;
        if ((arroVar.b & 4) != 0) {
            aragVar2 = arroVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView6.setContentDescription(mmi.f(aragVar2));
        Object c = ajrsVar.c("sectionController");
        if (c instanceof lsa) {
            lsaVar = (lsa) c;
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: mmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mmh mmhVar = mmh.this;
                atpl atplVar2 = atplVar;
                lsa lsaVar2 = lsaVar;
                if ((atplVar2.b & 16) != 0) {
                    mmhVar.c.H(3, new acte(atplVar2.f.I()), null);
                }
                if (lsaVar2 != null) {
                    lsaVar2.q(atplVar2, atplVar2.qm(atpk.b));
                    return;
                }
                DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController = mmhVar.d;
                dismissalFollowUpDialogFragmentController.a = atplVar2;
                dismissalFollowUpDialogFragmentController.k();
                if (dismissalFollowUpDialogFragmentController.i() != null) {
                    return;
                }
                min minVar = new min();
                Bundle bundle = new Bundle();
                bundle.putByteArray("notification_text_renderer", atplVar2.toByteArray());
                minVar.ae(bundle);
                aqxo.y(true);
                dismissalFollowUpDialogFragmentController.j(minVar);
            }
        });
        ajrsVar.a.E(new acte(arroVar.c), new acte(atplVar.f));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
