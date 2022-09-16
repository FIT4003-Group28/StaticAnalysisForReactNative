package defpackage;

import com.google.common.util.concurrent.SettableFuture;
/* compiled from: PG */
/* renamed from: sjw  reason: default package */
/* loaded from: classes4.dex */
public final class sjw implements skk {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/components/web/WebBridge");
    public final skl b;
    public final SettableFuture c = SettableFuture.f();
    public skr d;

    public sjw(skl sklVar) {
        this.b = sklVar;
        ((skc) sklVar).c = this;
    }

    public final void a(awfl awflVar) {
        if (this.d == null) {
            ((amzw) ((amzw) a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "sendMessageToWeb", 71, "WebBridge.java")).q("sendMessageToWeb before context initialized.");
        } else {
            anlz.A(this.c, new sjv(this, awflVar), this.d.c);
        }
    }
}
