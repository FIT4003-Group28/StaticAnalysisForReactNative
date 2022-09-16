package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: hph  reason: default package */
/* loaded from: classes3.dex */
public final class hph implements zmv {
    public boolean a = false;
    private final TextView b;
    private final View c;
    private final hpg d;

    public hph(TextView textView, View view, hpg hpgVar) {
        this.b = textView;
        this.c = view;
        this.d = hpgVar;
    }

    @Override // defpackage.zmv
    public final void c() {
    }

    @Override // defpackage.zmv
    public final void e(float f, float f2) {
    }

    @Override // defpackage.zmv
    public final void md() {
    }

    @Override // defpackage.zmv
    public final void me(int i) {
        if (this.a) {
            this.a = false;
        } else if (!this.d.bo()) {
        } else {
            if (i == 3) {
                AnimatorSet c = gtd.c(this.b, -this.c.getWidth());
                if (c == null) {
                    return;
                }
                this.d.ba(3, this.b, c);
            } else if (i != 1) {
            } else {
                AnimatorSet c2 = gtd.c(this.b, this.c.getWidth());
                if (c2 == null) {
                    return;
                }
                this.d.ba(1, this.b, c2);
            }
        }
    }

    @Override // defpackage.zmv
    public final void mj(float f) {
    }
}
