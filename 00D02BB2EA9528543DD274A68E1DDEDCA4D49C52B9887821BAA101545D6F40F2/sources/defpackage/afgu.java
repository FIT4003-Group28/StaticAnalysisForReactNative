package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afgu  reason: default package */
/* loaded from: classes2.dex */
final class afgu implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ afgw b;

    public afgu(afgw afgwVar, Intent intent) {
        this.b = afgwVar;
        this.a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.putExtra("isIntentRepost", true);
        this.b.d.a().f(this.b.b, this.a, 2);
    }
}
