package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
/* compiled from: PG */
/* renamed from: fsa  reason: default package */
/* loaded from: classes3.dex */
public final class fsa {
    public final CharSequence a;
    public final View b;
    public final amvn c;
    public final ActionBarColor d;
    public final int e;

    public fsa() {
    }

    public fsa(CharSequence charSequence, View view, amvn amvnVar, ActionBarColor actionBarColor, int i) {
        this.a = charSequence;
        this.b = view;
        this.c = amvnVar;
        this.d = actionBarColor;
        this.e = i;
    }

    public static frz a() {
        frz frzVar = new frz();
        frzVar.d(amyg.a);
        frzVar.b(hve.j());
        frzVar.c(0);
        return frzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fsa) {
            fsa fsaVar = (fsa) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(fsaVar.a) : fsaVar.a == null) {
                View view = this.b;
                if (view != null ? view.equals(fsaVar.b) : fsaVar.b == null) {
                    if (this.c.equals(fsaVar.c) && this.d.equals(fsaVar.d) && this.e == fsaVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        View view = this.b;
        if (view != null) {
            i = view.hashCode();
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int i = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 87 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ActionBarModel{title=");
        sb.append(valueOf);
        sb.append(", customView=");
        sb.append(valueOf2);
        sb.append(", menuItems=");
        sb.append(valueOf3);
        sb.append(", iconTintColor=");
        sb.append(valueOf4);
        sb.append(", homeAction=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
