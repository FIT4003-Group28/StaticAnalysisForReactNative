package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
/* compiled from: PG */
/* renamed from: ngp  reason: default package */
/* loaded from: classes3.dex */
public final class ngp {
    public amuk a;
    private ActionBarColor b;
    private ActionBarColor c;
    private ActionBarColor d;
    private ActionBarColor e;
    private ActionBarColor f;

    public final void b(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.d = actionBarColor;
            return;
        }
        throw new NullPointerException("Null background");
    }

    public final void c(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.f = actionBarColor;
            return;
        }
        throw new NullPointerException("Null iconTint");
    }

    public final void d(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.b = actionBarColor;
            return;
        }
        throw new NullPointerException("Null primaryText");
    }

    public final void e(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.c = actionBarColor;
            return;
        }
        throw new NullPointerException("Null secondaryText");
    }

    public final void f(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.e = actionBarColor;
            return;
        }
        throw new NullPointerException("Null statusBar");
    }

    public final ngq a() {
        ActionBarColor actionBarColor;
        ActionBarColor actionBarColor2;
        ActionBarColor actionBarColor3;
        ActionBarColor actionBarColor4;
        amuk amukVar;
        ActionBarColor actionBarColor5 = this.b;
        if (actionBarColor5 == null || (actionBarColor = this.c) == null || (actionBarColor2 = this.d) == null || (actionBarColor3 = this.e) == null || (actionBarColor4 = this.f) == null || (amukVar = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" primaryText");
            }
            if (this.c == null) {
                sb.append(" secondaryText");
            }
            if (this.d == null) {
                sb.append(" background");
            }
            if (this.e == null) {
                sb.append(" statusBar");
            }
            if (this.f == null) {
                sb.append(" iconTint");
            }
            if (this.a == null) {
                sb.append(" menuItems");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ngq(actionBarColor5, actionBarColor, actionBarColor2, actionBarColor3, actionBarColor4, amukVar);
    }
}
