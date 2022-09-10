package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: cwcy  reason: default package */
/* loaded from: classes5.dex */
class cwcy extends cwcb {
    private final cwcp g;
    public TextView j;
    public TextView k;
    public Chip l;
    public ImageView m;
    public cwje n;
    public int o;

    public cwcy(Context context, cwcp cwcpVar) {
        super(context, cwcpVar);
        this.g = cwcpVar;
    }

    @Override // defpackage.cwcb
    protected final void a(ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(this.a).inflate(R.layout.og_textual_card, viewGroup);
        this.j = (TextView) inflate.findViewById(R.id.og_text_card_title);
        this.k = (TextView) inflate.findViewById(R.id.og_text_card_subtitle);
        this.l = (Chip) inflate.findViewById(R.id.og_text_card_action);
        this.m = (ImageView) inflate.findViewById(R.id.og_text_card_trail_image);
        if (cwjd.a(this.a)) {
            this.l.setClickable(false);
            this.l.setFocusable(false);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.og_text_card_custom_content);
        if (g(viewGroup2) != null) {
            viewGroup2.setVisibility(0);
        }
        inflate.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this, inflate) { // from class: cwcr
            private final cwcy a;
            private final View b;

            {
                this.a = this;
                this.b = inflate;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                cwcy cwcyVar = this.a;
                int measuredWidth = this.b.getMeasuredWidth();
                if (measuredWidth != cwcyVar.o) {
                    cwcyVar.o = measuredWidth;
                    cwje cwjeVar = cwcyVar.n;
                    if (cwjeVar == null) {
                        return false;
                    }
                    cwjeVar.a(cwcyVar.l, measuredWidth);
                    return false;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwcb, defpackage.cwbt
    public void d(m mVar) {
        super.d(mVar);
        final Context context = this.a;
        this.g.q.b(mVar, new aa(this) { // from class: cwcs
            private final cwcy a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.j.setText((String) obj);
            }
        });
        this.g.r.b(mVar, new aa(this) { // from class: cwct
            private final cwcy a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                dbsg dbsgVar = (dbsg) obj;
                TextView textView = this.a.k;
                if (dbsgVar.a()) {
                    textView.setText((CharSequence) dbsgVar.b());
                    textView.setVisibility(0);
                    return;
                }
                textView.setVisibility(8);
            }
        });
        this.g.s.b(mVar, new aa(this) { // from class: cwcu
            private final cwcy a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwcy cwcyVar = this.a;
                dcdc dcdcVar = (dcdc) obj;
                if (dcdcVar.isEmpty()) {
                    cwcyVar.l.setVisibility(8);
                    return;
                }
                cwcyVar.l.setVisibility(0);
                cwcyVar.n = new cwje(dcdcVar);
                cwcyVar.n.a(cwcyVar.l, cwcyVar.o);
            }
        });
        this.g.t.b(mVar, new aa(this, context) { // from class: cwcv
            private final cwcy a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwcy cwcyVar = this.a;
                Context context2 = this.b;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwcyVar.l.setTextColor(ColorStateList.valueOf(((Integer) dbsgVar.b()).intValue()));
                } else {
                    cwcyVar.l.setTextColor(akm.b(context2, R.color.google_chip_assistive_text_color));
                }
            }
        });
        this.g.u.b(mVar, new aa(this) { // from class: cwcw
            private final cwcy a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwcy cwcyVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwcyVar.m.setImageDrawable((Drawable) dbsgVar.b());
                    cwcyVar.m.setVisibility(0);
                    return;
                }
                cwcyVar.m.setVisibility(8);
            }
        });
        this.g.f.b(mVar, new aa(this, context) { // from class: cwcx
            private final cwcy a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwcy cwcyVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (!cwjd.a(this.b)) {
                    cwcyVar.l.setOnClickListener((View.OnClickListener) dbsgVar.f());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwcb, defpackage.cwbt
    public void e(m mVar) {
        super.e(mVar);
        this.g.q.e(mVar);
        this.g.r.e(mVar);
        this.g.s.e(mVar);
        this.g.u.e(mVar);
        this.g.f.e(mVar);
    }

    protected View g(ViewGroup viewGroup) {
        return null;
    }
}
