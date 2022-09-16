package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: xtf  reason: default package */
/* loaded from: classes4.dex */
public final class xtf extends ajsl {
    public final aafo a;
    public final xte b;
    public final LinearLayout c;
    public ajrs d;
    private final Animator e;
    private final xyb f;
    private final View g;
    private final TextView h;
    private final int i;
    private final int j;
    private final int k;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ajsa] */
    public xtf(Context context, ajmy ajmyVar, aafo aafoVar, ajyi ajyiVar, xxt xxtVar, zhe zheVar, xyb xybVar) {
        context.getClass();
        ajmyVar.getClass();
        xxtVar.getClass();
        this.a = aafoVar;
        xybVar.getClass();
        this.f = xybVar;
        this.b = new xte(context, ajyiVar.get());
        int d = zhn.d(context, R.attr.cmtBgStyleDefault);
        this.j = d;
        int d2 = zhn.d(context, zheVar.a);
        this.k = d2;
        View inflate = View.inflate(context, R.layout.comment_replies, null);
        this.g = inflate;
        this.c = (LinearLayout) inflate.findViewById(R.id.comment_replies);
        this.h = (TextView) inflate.findViewById(R.id.detail_view_button);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.detail_view_button_margin_bottom);
        this.e = xxt.a(inflate, d, d2);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(final ajrs ajrsVar, Object obj) {
        arag aragVar;
        aqbm aqbmVar = (aqbm) obj;
        this.d = ajrsVar;
        apok apokVar = aqbmVar.g;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            this.h.setVisibility(8);
        } else {
            apok apokVar2 = aqbmVar.g;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            final apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            final acti actiVar = ajrsVar.a;
            this.h.setVisibility(0);
            TextView textView = this.h;
            if ((apojVar.b & 256) != 0) {
                aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            this.h.setOnClickListener(new View.OnClickListener() { // from class: xtd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xtf xtfVar = xtf.this;
                    ajrs ajrsVar2 = ajrsVar;
                    acti actiVar2 = actiVar;
                    apoj apojVar2 = apojVar;
                    view.performHapticFeedback(1);
                    HashMap hashMap = new HashMap(ajrsVar2.e());
                    hashMap.put("commentThreadMutator", ajrsVar2.c("commentThreadMutator"));
                    hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", actiVar2);
                    aafo aafoVar = xtfVar.a;
                    apzg apzgVar = apojVar2.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, hashMap);
                }
            });
            h();
        }
        for (aqax aqaxVar : this.f.a(aqbmVar)) {
            g(aqaxVar.b == 62285947 ? (aqav) aqaxVar.c : null);
        }
        Boolean bool = (Boolean) this.f.a.get(aqbmVar);
        if (bool == null ? aqbmVar.h : bool.booleanValue()) {
            this.e.start();
            this.f.a.put(aqbmVar, false);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqbm) obj).f.I();
    }

    public final int f(aqav aqavVar) {
        if (aqavVar != null) {
            int childCount = this.c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup viewGroup = (ViewGroup) this.c.getChildAt(i);
                boolean z = true;
                if (viewGroup.getChildCount() != 1) {
                    z = false;
                }
                aqxo.y(z);
                ajru g = akel.g(viewGroup.getChildAt(0));
                if ((g instanceof xtc) && aqavVar.equals(((xtc) g).y)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void g(aqav aqavVar) {
        this.c.addView(this.b.b(this.d, aqavVar, this.c.getChildCount()));
        h();
    }

    public final void h() {
        zgd.t(this.h, zgd.e(this.c.getChildCount() + (-1) > 0 ? this.i : 0), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.e.isRunning()) {
            this.e.end();
        }
        this.b.e(this.c);
    }
}
