package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: amed  reason: default package */
/* loaded from: classes.dex */
final class amed implements ankb {
    final /* synthetic */ ankt a;
    final /* synthetic */ String b;

    public amed(ankt anktVar, String str) {
        this.a = anktVar;
        this.b = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (!(th instanceof TimeoutException) || this.a.isDone()) {
            return;
        }
        ((amzw) ((amzw) ((amzw) amee.a.f()).h(ammu.a(th))).i("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 183, "AndroidFutures.java")).s("exceeded timeout: %s", this.b);
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
    }
}
