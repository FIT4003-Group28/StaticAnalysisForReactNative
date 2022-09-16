package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awqw  reason: default package */
/* loaded from: classes3.dex */
public final class awqw implements Runnable {
    final /* synthetic */ awqy a;

    public awqw(awqy awqyVar) {
        this.a = awqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bvrj.UI_THREAD.d();
        try {
            awqy awqyVar = this.a;
            awqyVar.c = awqyVar.e.e.a().get(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
            this.a.c = null;
        }
        awqy awqyVar2 = this.a;
        awqyVar2.e.c.b(awqyVar2.d, bvrj.UI_THREAD);
    }
}
