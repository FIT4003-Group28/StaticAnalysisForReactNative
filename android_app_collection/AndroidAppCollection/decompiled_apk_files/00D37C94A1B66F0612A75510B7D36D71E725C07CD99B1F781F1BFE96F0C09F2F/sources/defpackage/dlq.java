package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dlq  reason: default package */
/* loaded from: classes3.dex */
public final class dlq extends ne {
    public dln a;
    public xw b;
    private final djg c;
    private View d;
    private int e = -1;

    public dlq(djg djgVar) {
        this.c = djgVar;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        int c = ((dlc) this.c).H.c();
        if (c != -1) {
            int i3 = c;
            while (true) {
                if (i3 < 0) {
                    i3 = -1;
                    break;
                } else if (this.c.k(i3)) {
                    break;
                } else {
                    i3--;
                }
            }
            ComponentTree j = this.c.j(c);
            View view = this.d;
            if (view != null && j != null && view != j.getLithoView()) {
                this.d.setTranslationY(0.0f);
                this.d = null;
            }
            if (i3 == -1 || j == null) {
                this.a.p();
                this.e = -1;
            } else if (c == i3) {
                dci lithoView = j.getLithoView();
                if (lithoView == null) {
                    boolean at = this.a.l.at();
                    String f = j.f();
                    boolean z = j.p;
                    boolean s = j.s();
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 141);
                    sb.append("First visible sticky header item is null, RV.hasPendingAdapterUpdates: ");
                    sb.append(at);
                    sb.append(", first visible component: ");
                    sb.append(f);
                    sb.append(", hasMounted: ");
                    sb.append(z);
                    sb.append(", isReleased: ");
                    sb.append(s);
                    czq.a(2, "StickyHeaderControllerImpl:FirstVisibleStickyHeaderNull", sb.toString());
                } else {
                    int i4 = i3 + 1;
                    if (!this.c.l(i4) || !this.c.k(i4)) {
                        lithoView.setTranslationY(-lithoView.getTop());
                    }
                }
                this.d = lithoView;
                this.a.p();
                this.e = -1;
            } else {
                int i5 = 0;
                if (this.a.k.getVisibility() == 8 || i3 != this.e) {
                    ComponentTree j2 = this.c.j(i3);
                    dci lithoView2 = j2.getLithoView();
                    if (lithoView2 != null && lithoView2.getWindowToken() != null) {
                        lithoView2.onStartTemporaryDetach();
                    }
                    dln dlnVar = this.a;
                    if (j2.getLithoView() != null) {
                        dci lithoView3 = j2.getLithoView();
                        lithoView3.z = lithoView3.r;
                    }
                    dlnVar.k.G(j2);
                    dlnVar.q(dlnVar.getWidth());
                    dln dlnVar2 = this.a;
                    dlnVar2.k.setVisibility(0);
                    dlnVar2.k.A();
                }
                int e = ((dlc) this.c).H.e();
                while (true) {
                    if (c > e) {
                        break;
                    } else if (this.c.k(c)) {
                        i5 = Math.min((this.b.S(c).getTop() - this.a.k.getBottom()) + this.a.getPaddingTop(), 0);
                        break;
                    } else {
                        c++;
                    }
                }
                this.a.k.setTranslationY(i5);
                this.e = i3;
            }
        }
    }
}
