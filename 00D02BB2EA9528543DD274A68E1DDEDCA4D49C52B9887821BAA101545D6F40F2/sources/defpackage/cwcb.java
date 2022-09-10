package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwcb  reason: default package */
/* loaded from: classes5.dex */
abstract class cwcb extends cwbt {
    public ImageView f;
    private final cwbz g;

    public cwcb(Context context, cwbz cwbzVar) {
        super(context, cwbzVar);
        this.g = cwbzVar;
    }

    protected abstract void a(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwbt
    public void d(m mVar) {
        this.b.l(mVar);
        this.b.f.b(mVar, new aa(this) { // from class: cwbp
            private final cwbt a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.c.setOnClickListener((View.OnClickListener) ((dbsg) obj).f());
            }
        });
        this.b.g.b(mVar, new aa(this) { // from class: cwbq
            private final cwbt a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwbt cwbtVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwbtVar.c.setContentDescription((CharSequence) dbsgVar.b());
                }
            }
        });
        this.b.h.b(mVar, new aa(this) { // from class: cwbr
            private final cwbt a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwbt cwbtVar = this.a;
                Boolean bool = (Boolean) obj;
                int i = 8;
                cwbtVar.d.setVisibility(true != bool.booleanValue() ? 8 : 0);
                ViewGroup viewGroup = cwbtVar.e;
                if (true != bool.booleanValue()) {
                    i = 0;
                }
                viewGroup.setVisibility(i);
            }
        });
        this.g.k.b(mVar, new aa(this) { // from class: cwca
            private final cwcb a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.f.setImageDrawable((Drawable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwbt
    public void e(m mVar) {
        this.b.e(mVar);
        this.b.f.e(mVar);
        this.b.g.e(mVar);
        this.b.h.e(mVar);
        this.g.k.e(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwbt
    public final void f(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.og_icon_dynamic_card, viewGroup);
        this.f = (ImageView) inflate.findViewById(R.id.og_card_icon);
        a((ViewGroup) inflate.findViewById(R.id.og_card_view_container));
    }
}
