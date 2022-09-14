package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bec  reason: default package */
/* loaded from: classes3.dex */
public final class bec implements Runnable {
    private final bef a;
    private final Intent b;
    private final int c;

    public bec(bef befVar, Intent intent, int i) {
        this.a = befVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c);
    }
}
