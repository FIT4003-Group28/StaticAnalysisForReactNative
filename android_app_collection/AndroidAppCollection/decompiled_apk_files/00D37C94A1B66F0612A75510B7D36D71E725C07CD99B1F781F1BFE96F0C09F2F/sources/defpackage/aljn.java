package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: aljn  reason: default package */
/* loaded from: classes.dex */
final class aljn extends aljg {
    private final boolean a;
    private final boolean b;
    private final mb c;

    public aljn(View view, mb mbVar) {
        ColorStateList k;
        this.c = mbVar;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0) {
            z = true;
        }
        this.b = z;
        almx almxVar = BottomSheetBehavior.v(view).c;
        if (almxVar != null) {
            k = almxVar.a.d;
        } else {
            k = lj.k(view);
        }
        if (k != null) {
            this.a = amxp.A(k.getDefaultColor());
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.a = amxp.A(((ColorDrawable) view.getBackground()).getColor());
        } else {
            this.a = z;
        }
    }

    private final void c(View view) {
        if (view.getTop() < this.c.f()) {
            aljo.b(view, this.a);
            view.setPadding(view.getPaddingLeft(), this.c.f() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() == 0) {
        } else {
            aljo.b(view, this.b);
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.aljg
    public final void b(View view, int i) {
        c(view);
    }

    @Override // defpackage.aljg
    public final void ms(View view, float f) {
        c(view);
    }
}
