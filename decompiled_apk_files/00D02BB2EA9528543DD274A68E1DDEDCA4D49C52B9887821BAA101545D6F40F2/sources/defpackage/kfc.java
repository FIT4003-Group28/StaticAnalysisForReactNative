package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: kfc  reason: default package */
/* loaded from: classes7.dex */
public final class kfc {
    public static final dcqe a = dcqe.c("kfc");
    @dzsi
    public Intent b;
    final cmvr c;
    private final Context d;
    private final cmwz e;
    private final cmze f;

    public kfc(Application application) {
        kfa kfaVar = new kfa();
        this.f = kfaVar;
        kfb kfbVar = new kfb(this);
        this.c = kfbVar;
        dbsk.s(application);
        this.d = application;
        cmwz a2 = kes.a(application, kfaVar, kez.a, kfbVar);
        this.e = a2;
        a2.c();
    }

    public final void a(Intent intent) {
        bvrj.UI_THREAD.c();
        dbsk.s(intent);
        intent.toUri(0);
        if (!this.e.b() || !this.e.a().a()) {
            this.b = intent;
            return;
        }
        try {
            this.e.a().f(intent);
        } catch (cmwm | IllegalArgumentException unused) {
        }
    }
}
