package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fv  reason: default package */
/* loaded from: classes3.dex */
public final class fv extends fx {
    private final et g;

    public fv(int i, int i2, et etVar, akl aklVar) {
        super(i, i2, etVar.b, aklVar);
        this.g = etVar;
    }

    @Override // defpackage.fx
    public final void a() {
        super.a();
        this.g.e();
    }

    @Override // defpackage.fx
    public final void b() {
        if (this.f == 2) {
            dp dpVar = this.g.b;
            View findFocus = dpVar.O.findFocus();
            if (findFocus != null) {
                dpVar.af(findFocus);
                if (eo.X(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Saved focused view ");
                    sb.append(findFocus);
                    sb.append(" for Fragment ");
                    sb.append(dpVar);
                }
            }
            View K = this.a.K();
            if (K.getParent() == null) {
                this.g.b();
                K.setAlpha(0.0f);
            }
            if (K.getAlpha() == 0.0f && K.getVisibility() == 0) {
                K.setVisibility(4);
            }
            dm dmVar = dpVar.R;
            K.setAlpha(dmVar == null ? 1.0f : dmVar.l);
        }
    }
}
