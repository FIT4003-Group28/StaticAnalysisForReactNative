package defpackage;

import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: kjo  reason: default package */
/* loaded from: classes3.dex */
public final class kjo {
    public final kjp a;

    public kjo(kjp kjpVar) {
        this.a = kjpVar;
    }

    public static final long d(kkb kkbVar) {
        if ((kkbVar.b & 2) != 0) {
            return kkbVar.d;
        }
        return -1L;
    }

    public final boolean a(kkb kkbVar) {
        return (kkbVar.b & 1) != 0 ? kkbVar.c : c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        AccessibilityManager a = zdg.a(this.a.a);
        return a != null && a.isEnabled();
    }

    public final boolean c() {
        return zdg.e(this.a.a);
    }
}
