package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: ias  reason: default package */
/* loaded from: classes3.dex */
public final class ias {
    public int a;
    public final acth b;
    public final iel c;
    public View d;
    public AccessibilityManager e;
    public actj f;
    public boolean g;
    public boolean h;
    public int i = -1;
    private final iei j;

    public ias(acth acthVar, iei ieiVar, iel ielVar) {
        this.b = acthVar;
        this.j = ieiVar;
        this.c = ielVar;
    }

    public final void a() {
        View view = this.d;
        if (view != null) {
            hqs.c(view, false);
            c(true);
        }
    }

    public final void b() {
        if (this.d == null || !e()) {
            return;
        }
        a();
        if (this.f == null || this.a != 3) {
            return;
        }
        this.b.oi().H(3, new acte(this.f), null);
        this.f = null;
    }

    public final void c(boolean z) {
        ien ienVar;
        iet aF = this.j.aF();
        if (aF == null || (ienVar = aF.d) == null) {
            return;
        }
        ienVar.a(z);
    }

    public final boolean d() {
        return this.d != null && this.g;
    }

    public final boolean e() {
        View view = this.d;
        return view != null && view.getVisibility() == 0;
    }
}
