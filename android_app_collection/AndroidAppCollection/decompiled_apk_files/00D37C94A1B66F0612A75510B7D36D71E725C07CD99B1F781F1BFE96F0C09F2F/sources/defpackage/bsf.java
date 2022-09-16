package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsf  reason: default package */
/* loaded from: classes2.dex */
public final class bsf implements Runnable {
    private final bsi a;
    private final Intent b;
    private final int c;

    public bsf(bsi bsiVar, Intent intent, int i) {
        this.a = bsiVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c);
    }
}
