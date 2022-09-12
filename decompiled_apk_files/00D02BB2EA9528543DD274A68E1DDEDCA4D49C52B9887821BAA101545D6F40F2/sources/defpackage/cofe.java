package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cofe  reason: default package */
/* loaded from: classes5.dex */
final class cofe implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ Intent b;
    final /* synthetic */ cofg c;

    public cofe(cofg cofgVar, Intent intent, Intent intent2) {
        this.c = cofgVar;
        this.a = intent;
        this.b = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.a);
        this.c.b(this.b);
    }
}
