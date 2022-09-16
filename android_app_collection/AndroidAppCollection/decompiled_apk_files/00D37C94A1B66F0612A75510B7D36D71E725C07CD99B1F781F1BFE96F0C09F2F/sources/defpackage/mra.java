package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mra  reason: default package */
/* loaded from: classes3.dex */
public final class mra extends fsz {
    public TextView a;
    public float b;
    private final Context c;
    private final aafo g;
    private final ajxz h;
    private TextView i;

    public mra(View view, Context context, aafo aafoVar, ajxz ajxzVar) {
        super(view);
        this.c = context;
        this.g = aafoVar;
        this.h = ajxzVar;
    }

    public final void a(apmh apmhVar) {
        f(apmhVar, null);
    }

    public final void f(apmh apmhVar, acti actiVar) {
        arag aragVar;
        View view = this.f;
        if (apmhVar == null) {
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        if (actiVar != null) {
            arag aragVar2 = apmhVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            aczo.d(aragVar2, actiVar);
        }
        View c = c();
        this.i = (TextView) c.findViewById(R.id.collection_badge_icon);
        this.a = (TextView) c.findViewById(R.id.collection_badge_label);
        this.i.setIncludeFontPadding(false);
        this.a.setIncludeFontPadding(false);
        float f = this.b;
        if (f > 0.0f) {
            this.i.setTextSize(0, f);
            this.a.setTextSize(0, this.b);
        }
        c.setVisibility(0);
        zag.m(this.i, apmhVar.c);
        TextView textView = this.a;
        Context context = textView.getContext();
        if ((apmhVar.b & 2) != 0) {
            aragVar = apmhVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, aafv.b(context, aragVar, this.g, false));
        if ((apmhVar.b & 32) == 0) {
            this.a.setCompoundDrawables(null, null, null, null);
            return;
        }
        Resources resources = this.c.getResources();
        ajxz ajxzVar = this.h;
        arhs arhsVar = apmhVar.e;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        Drawable drawable = resources.getDrawable(ajxzVar.a(b));
        arag aragVar3 = apmhVar.d;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        if (aragVar3.c.size() > 0) {
            arag aragVar4 = apmhVar.d;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            if ((((arai) aragVar4.c.get(0)).b & 512) != 0) {
                drawable.setTint(zhn.j(this.c, R.attr.ytCallToAction).orElse(0));
            }
        }
        int lineHeight = this.a.getLineHeight();
        drawable.setBounds(0, 0, lineHeight, lineHeight);
        this.a.setCompoundDrawables(drawable, null, null, null);
    }

    public final boolean g() {
        TextView textView;
        TextView textView2;
        View view = this.f;
        return view != null && view.getVisibility() == 0 && (textView = this.a) != null && textView.getVisibility() == 0 && ((textView2 = this.i) == null || textView2.getVisibility() == 8);
    }

    public mra(ViewStub viewStub, Context context, aafo aafoVar, ajxz ajxzVar) {
        super(viewStub);
        this.c = context;
        aafoVar.getClass();
        this.g = aafoVar;
        this.h = ajxzVar;
    }
}
