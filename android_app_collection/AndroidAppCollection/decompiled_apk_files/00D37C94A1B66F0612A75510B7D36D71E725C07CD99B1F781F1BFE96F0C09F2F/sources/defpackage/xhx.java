package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: xhx  reason: default package */
/* loaded from: classes4.dex */
public class xhx {
    private final Drawable a;
    private final float b;
    protected final View c;
    public aoyj d;
    public boolean e;

    public xhx(View view, Drawable drawable, float f) {
        view.getClass();
        this.c = view;
        this.a = drawable;
        this.b = f;
        this.d = null;
    }

    public void a() {
        aoyi aoyiVar;
        aoyj aoyjVar = this.d;
        aoyk aoykVar = null;
        if (aoyjVar == null || (aoyjVar.b & 1) == 0) {
            aoyiVar = null;
        } else {
            aoyiVar = aoyjVar.c;
            if (aoyiVar == null) {
                aoyiVar = aoyi.a;
            }
        }
        Drawable background = this.c.getBackground();
        if (aoyiVar == null) {
            this.c.setBackground(this.a);
        } else if (background == null || !(background instanceof ColorDrawable) || aoyiVar.b != ((ColorDrawable) background).getColor()) {
            this.c.setBackground(new ColorDrawable(aoyiVar.b));
        }
        aoyj aoyjVar2 = this.d;
        if (aoyjVar2 != null && (aoyjVar2.b & 2) != 0 && (aoykVar = aoyjVar2.d) == null) {
            aoykVar = aoyk.a;
        }
        float f = aoykVar == null ? this.b : aoykVar.b;
        if (f != this.c.getAlpha()) {
            this.c.setAlpha(f);
        }
        aoyj aoyjVar3 = this.d;
        int i = 0;
        boolean z = (aoyjVar3 != null && aoyjVar3.e) || this.e;
        if ((this.c.getVisibility() == 8) != z) {
            View view = this.c;
            if (true == z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
