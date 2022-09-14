package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dagc  reason: default package */
/* loaded from: classes5.dex */
public final class dagc implements bbb {
    public int a;
    public int b;
    private final WeakReference<dagg> c;

    public dagc(dagg daggVar) {
        this.c = new WeakReference<>(daggVar);
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        dagg daggVar = this.c.get();
        if (daggVar != null) {
            int i3 = this.b;
            boolean z = false;
            boolean z2 = i3 != 2 || this.a == 1;
            if (i3 != 2 || this.a != 0) {
                z = true;
            }
            daggVar.setScrollPosition(i, f, z2, z);
        }
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        dagg daggVar = this.c.get();
        if (daggVar == null || daggVar.k() == i || i >= daggVar.i()) {
            return;
        }
        int i2 = this.b;
        boolean z = false;
        if (i2 == 0 || (i2 == 2 && this.a == 0)) {
            z = true;
        }
        daggVar.p(daggVar.j(i), z);
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        this.a = this.b;
        this.b = i;
    }
}
