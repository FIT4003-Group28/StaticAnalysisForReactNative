package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akc  reason: default package */
/* loaded from: classes2.dex */
public final class akc implements akd {
    final Intent a;
    final int b;
    final /* synthetic */ akh c;

    public akc(akh akhVar, Intent intent, int i) {
        this.c = akhVar;
        this.a = intent;
        this.b = i;
    }

    @Override // defpackage.akd
    public final Intent a() {
        return this.a;
    }

    @Override // defpackage.akd
    public final void b() {
        this.c.stopSelf(this.b);
    }
}
