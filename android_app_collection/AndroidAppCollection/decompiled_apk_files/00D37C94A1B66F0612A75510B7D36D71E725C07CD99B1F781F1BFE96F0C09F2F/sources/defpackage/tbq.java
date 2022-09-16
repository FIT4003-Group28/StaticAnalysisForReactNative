package defpackage;

import com.google.android.libraries.elements.interfaces.Component;
/* compiled from: PG */
/* renamed from: tbq  reason: default package */
/* loaded from: classes4.dex */
public final class tbq {
    public final azpq a;
    public Component b;
    public final String c;
    public awqm d;
    public final Object e;

    public tbq(String str) {
        this(str, null);
    }

    public final void a(awqm awqmVar) {
        synchronized (this.e) {
            this.d = awqmVar;
        }
    }

    public final String toString() {
        String str = this.c;
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("DebuggerInfo(");
        sb.append(str);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public tbq(String str, Component component) {
        this.a = azpq.e();
        this.e = new Object();
        this.c = str;
        this.b = component;
    }
}
