package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: emf  reason: default package */
/* loaded from: classes3.dex */
public final class emf implements fmf {
    public final ajgj a;
    public final fmg b;
    public final ViewGroup c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    private final fny g;
    private final TextView h;
    private final TextView i;

    public emf(Context context, fmh fmhVar, fnz fnzVar, ViewGroup viewGroup) {
        ajgi a = ajgj.a();
        a.a = context;
        this.a = a.a();
        this.c = viewGroup;
        this.h = (TextView) viewGroup.findViewById(R.id.promo_text);
        this.i = (TextView) viewGroup.findViewById(R.id.promo_text_additional);
        fny a2 = fnzVar.a(viewGroup.findViewById(R.id.subscription_notification_view));
        this.g = a2;
        this.b = fmhVar.a((TextView) viewGroup.findViewById(R.id.subscribe_button), a2);
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        if (z3) {
            bno.b(this.c, null);
        }
        if (z != z2) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        } else if (!z2) {
            zag.m(this.h, this.d);
            zag.m(this.i, this.e);
        } else {
            zag.m(this.h, this.f);
            this.i.setVisibility(8);
        }
    }

    @Override // defpackage.fmf
    public final void oc(boolean z, boolean z2) {
        b(z, z2, true);
    }
}
