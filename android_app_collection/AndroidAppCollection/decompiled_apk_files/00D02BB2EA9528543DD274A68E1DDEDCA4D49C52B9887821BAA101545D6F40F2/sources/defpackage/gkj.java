package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: gkj  reason: default package */
/* loaded from: classes.dex */
public final class gkj<T extends View> {
    final int a;
    public T b;
    public final Rect c = new Rect();
    public boolean d;
    @dzsi
    public gkj<? extends View> e;
    @dzsi
    public gkj<? extends View> f;
    private boolean g;

    public gkj(int i) {
        this.a = i;
    }

    public final void a(int i, int i2) {
        b(i, 1073741824, i2, 1073741824);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(i3, i4));
        this.c.set(0, 0, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        T t = this.b;
        if (t == null || this.g) {
            return;
        }
        gkj<? extends View> gkjVar = this.e;
        if (gkjVar == null && this.f == null) {
            return;
        }
        if (gkjVar != null && gkjVar.b == null) {
            return;
        }
        gkj<? extends View> gkjVar2 = this.f;
        if (gkjVar2 != null && gkjVar2.b == null) {
            return;
        }
        t.setImportantForAccessibility(1);
        od.c(this.b, new gki(this));
        this.g = true;
        gkj<? extends View> gkjVar3 = this.e;
        if (gkjVar3 != null) {
            gkjVar3.c();
        }
        gkj<? extends View> gkjVar4 = this.f;
        if (gkjVar4 == null) {
            return;
        }
        gkjVar4.c();
    }

    public final void d(int i, int i2) {
        Rect rect = this.c;
        rect.set(i, i2, rect.width() + i, this.c.height() + i2);
    }

    public final void e(int i, int i2, int i3, boolean z) {
        if (z) {
            d((i3 - i) - this.c.width(), i2);
        } else {
            d(i, i2);
        }
    }

    public final void f() {
        this.b.layout(this.c.left, this.c.top, this.c.right, this.c.bottom);
    }
}
