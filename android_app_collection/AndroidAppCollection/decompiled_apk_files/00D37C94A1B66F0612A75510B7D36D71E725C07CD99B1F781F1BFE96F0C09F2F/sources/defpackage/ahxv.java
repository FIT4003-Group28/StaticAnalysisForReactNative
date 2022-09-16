package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: ahxv  reason: default package */
/* loaded from: classes.dex */
public final class ahxv implements AccessibilityManager.AccessibilityStateChangeListener {
    private final Context a;
    private final azpa b = azpa.as(ahxu.b(false));
    private Boolean c;
    private boolean d;

    public ahxv(Context context) {
        this.a = context;
    }

    public final aynx a() {
        return this.b.n();
    }

    public final void b() {
        boolean e = e();
        ahxu ahxuVar = (ahxu) this.b.at();
        if (ahxuVar == null || e != ahxuVar.a) {
            onAccessibilityStateChanged(e);
        }
    }

    public final void c() {
        if (!this.d) {
            return;
        }
        this.d = false;
        zdg.h(this.a, this);
    }

    public final void d() {
        boolean booleanValue;
        if (this.d) {
            return;
        }
        this.d = true;
        zdg.g(this.a, this);
        Boolean bool = this.c;
        if (bool == null) {
            Boolean bool2 = (Boolean) ylx.f(anlz.q(false), false);
            this.c = bool2;
            booleanValue = bool2.booleanValue();
        } else {
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            azpa azpaVar = this.b;
            ahxt ahxtVar = new ahxt(ahxu.b(true));
            ahxtVar.e(true);
            azpaVar.c(ahxtVar.a());
            return;
        }
        this.b.c(ahxu.b(e()));
    }

    protected final boolean e() {
        return zdg.e(this.a);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.b.c(ahxu.b(e()));
    }
}
