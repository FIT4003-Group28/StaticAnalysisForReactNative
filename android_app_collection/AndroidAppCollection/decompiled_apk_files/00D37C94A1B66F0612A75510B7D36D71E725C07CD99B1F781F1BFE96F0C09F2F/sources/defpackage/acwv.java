package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: acwv  reason: default package */
/* loaded from: classes.dex */
public abstract class acwv implements acxq {
    private static final String a = zep.a("MDX.BaseBackgroundScanClient");
    private final acxu b;
    private boolean c;

    public acwv(acxu acxuVar) {
        this.b = acxuVar;
    }

    @Override // defpackage.acxq
    public void h() {
        this.c = true;
    }

    public final void rl() {
        if (!this.c) {
            zep.m(a, String.format(Locale.US, "Client %s attempted to notify configuration change when it hasn't been registered.", b()));
            return;
        }
        acxu acxuVar = this.b;
        String b = b();
        if (b.length() != 0) {
            "Client configuration changed: ".concat(b);
        }
        acxuVar.a.e("mdx_background_scanner", 0L, true, 0, null, acya.a, false);
    }
}
