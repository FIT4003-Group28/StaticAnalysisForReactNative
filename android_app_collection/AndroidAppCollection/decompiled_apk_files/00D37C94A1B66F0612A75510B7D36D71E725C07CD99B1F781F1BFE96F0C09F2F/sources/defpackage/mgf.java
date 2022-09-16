package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.widget.ActiveItemIndicatorView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mgf  reason: default package */
/* loaded from: classes3.dex */
public final class mgf implements mgd {
    mgd a;
    final /* synthetic */ mgk b;
    private final mgj c;
    private final mgh d;

    public mgf(mgk mgkVar, View view) {
        this.b = mgkVar;
        this.c = new mgj(mgkVar.a, mgkVar.g, (ViewGroup) view.findViewById(R.id.pagination_thumbnails), new mge(this));
        this.d = new mgh(mgkVar.a, (ActiveItemIndicatorView) view.findViewById(R.id.active_item_indicator));
    }

    @Override // defpackage.mgd
    public final int a() {
        mgd mgdVar = this.a;
        if (mgdVar != null) {
            return mgdVar.a();
        }
        return 0;
    }

    @Override // defpackage.mgd
    public final void b(apqk apqkVar) {
        apqk apqkVar2 = this.b.o;
        if (apqkVar2 != null && apqkVar2.i.size() != 0 && zew.y(this.b.a)) {
            this.a = this.c;
            this.d.d(false);
            this.c.d(true);
        } else {
            mgh mghVar = this.d;
            this.a = mghVar;
            ActiveItemIndicatorView activeItemIndicatorView = mghVar.a;
            mgk mgkVar = this.b;
            mgk.n(activeItemIndicatorView, mgkVar.c + (mgk.r(mgkVar.o) ? this.b.b : 0));
            this.c.d(false);
            this.d.d(true);
        }
        this.a.b(apqkVar);
    }

    @Override // defpackage.mgd
    public final void c(int i) {
        mgd mgdVar = this.a;
        if (mgdVar != null) {
            mgdVar.c(i);
        }
    }

    @Override // defpackage.mgd
    public final void d(boolean z) {
        mgd mgdVar = this.a;
        if (mgdVar != null) {
            mgdVar.d(false);
        }
    }
}
