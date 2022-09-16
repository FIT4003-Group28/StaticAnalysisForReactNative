package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
/* compiled from: PG */
/* renamed from: frz  reason: default package */
/* loaded from: classes3.dex */
public final class frz {
    public CharSequence a;
    public View b;
    private amvn c;
    private ActionBarColor d;
    private Integer e;

    public frz() {
    }

    public frz(fsa fsaVar) {
        this.a = fsaVar.a;
        this.b = fsaVar.b;
        this.c = fsaVar.c;
        this.d = fsaVar.d;
        this.e = Integer.valueOf(fsaVar.e);
    }

    public final void b(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.d = actionBarColor;
            return;
        }
        throw new NullPointerException("Null iconTintColor");
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void d(amvn amvnVar) {
        if (amvnVar != null) {
            this.c = amvnVar;
            return;
        }
        throw new NullPointerException("Null menuItems");
    }

    public final void e(ampg ampgVar) {
        amvl i = amvn.i();
        amvn amvnVar = this.c;
        if (amvnVar == null) {
            throw new IllegalStateException("Property \"menuItems\" has not been set");
        }
        i.j(amvnVar);
        d(((amvl) ampgVar.apply(i)).g());
    }

    public final fsa a() {
        ActionBarColor actionBarColor;
        Integer num;
        amvn amvnVar = this.c;
        if (amvnVar == null || (actionBarColor = this.d) == null || (num = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" menuItems");
            }
            if (this.d == null) {
                sb.append(" iconTintColor");
            }
            if (this.e == null) {
                sb.append(" homeAction");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new fsa(this.a, this.b, amvnVar, actionBarColor, num.intValue());
    }
}
