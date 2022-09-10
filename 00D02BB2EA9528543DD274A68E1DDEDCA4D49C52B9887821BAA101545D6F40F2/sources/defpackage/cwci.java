package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.progressindicator.ProgressIndicator;
/* compiled from: PG */
/* renamed from: cwci  reason: default package */
/* loaded from: classes5.dex */
public final class cwci extends cwcy {
    public ProgressIndicator g;
    public TextView h;
    public boolean i;
    private final cwcc p;

    public cwci(Context context, cwcc cwccVar) {
        super(context, cwccVar);
        this.i = false;
        this.p = cwccVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwcy, defpackage.cwcb, defpackage.cwbt
    public final void d(m mVar) {
        super.d(mVar);
        this.p.a.b(mVar, new aa(this) { // from class: cwce
            private final cwci a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwci cwciVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwciVar.g.setMax(((Integer) dbsgVar.b()).intValue());
                }
            }
        });
        this.p.b.b(mVar, new aa(this) { // from class: cwcf
            private final cwci a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwci cwciVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwciVar.g.setProgressCompat(((Integer) dbsgVar.b()).intValue(), cwciVar.i);
                }
            }
        });
        this.p.c.b(mVar, new aa(this) { // from class: cwcg
            private final cwci a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwci cwciVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwciVar.g.setIndicatorColors((int[]) dbsgVar.b());
                }
            }
        });
        this.p.d.b(mVar, new aa(this) { // from class: cwch
            private final cwci a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwci cwciVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    cwciVar.h.setVisibility(0);
                    cwciVar.h.setText((CharSequence) dbsgVar.b());
                    return;
                }
                cwciVar.h.setVisibility(8);
            }
        });
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwcy, defpackage.cwcb, defpackage.cwbt
    public final void e(m mVar) {
        super.e(mVar);
        this.p.a.e(mVar);
        this.p.b.e(mVar);
        this.p.c.e(mVar);
        this.p.d.e(mVar);
        this.i = false;
    }

    @Override // defpackage.cwcy
    protected final View g(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.og_progress_card_content, viewGroup);
        this.g = (ProgressIndicator) inflate.findViewById(R.id.og_card_progress_indicator);
        this.h = (TextView) inflate.findViewById(R.id.og_card_progress_subtitle);
        return inflate;
    }
}
