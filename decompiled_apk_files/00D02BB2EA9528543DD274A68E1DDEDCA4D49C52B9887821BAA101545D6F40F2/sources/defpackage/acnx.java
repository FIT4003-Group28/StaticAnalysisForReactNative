package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acnx  reason: default package */
/* loaded from: classes2.dex */
public final class acnx implements View.OnClickListener {
    private final acnz a;
    private final acnv b;
    private final acnw c;
    private final cjqy d;

    public acnx(acnz acnzVar, acnv acnvVar, acnw acnwVar, cjqy cjqyVar) {
        this.a = acnzVar;
        this.b = acnvVar;
        this.c = acnwVar;
        this.d = cjqyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cjql e = cjqg.e(view);
        cjtd k = cjqg.k(view);
        if (e == null || k == null) {
            int i = acnz.d;
        } else {
            this.d.j(e, k);
        }
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            if (view == this.b.getChildAt(i2)) {
                this.c.a(this.a.b(), i2, false, true);
                view.sendAccessibilityEvent(8);
                return;
            }
        }
    }
}
