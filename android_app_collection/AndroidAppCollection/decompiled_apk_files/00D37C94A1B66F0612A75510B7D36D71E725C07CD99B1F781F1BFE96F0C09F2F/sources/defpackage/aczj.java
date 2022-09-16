package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aczj  reason: default package */
/* loaded from: classes.dex */
public final class aczj implements qlt {
    final /* synthetic */ aczk b;
    boolean a = false;
    private final qjh c = new qjh() { // from class: aczi
        @Override // defpackage.qjh
        public final void a(String str, String str2) {
            aczj aczjVar = aczj.this;
            String str3 = aczk.a;
            String.valueOf(str).length();
            String.valueOf(str2).length();
            aczb aczbVar = aczjVar.b.i;
            if (aczbVar == null) {
                zep.m(aczk.a, "No handler set, dropped message.");
            } else {
                aczbVar.d(str2);
            }
        }
    };

    public aczj(aczk aczkVar) {
        this.b = aczkVar;
    }

    private final void k(qku qkuVar) {
        aczk aczkVar = this.b;
        aczb aczbVar = aczkVar.i;
        if (aczbVar != null) {
            try {
                String str = aczkVar.d;
                qjh qjhVar = this.c;
                qnm.g("Must be called from the main thread.");
                qjj qjjVar = qkuVar.c;
                if (qjjVar != null) {
                    qjjVar.c(str, qjhVar);
                }
                aczbVar.b(qkuVar);
                return;
            } catch (IOException e) {
                afus.c(2, 21, "setMessageReceivedCallbacks failed", e);
                zep.f(aczk.a, "setMessageReceivedCallbacks failed", e);
                aczbVar.c(0);
                return;
            }
        }
        zep.c(aczk.a, "notifySdkClientConsumerOfNewSession, castSdkClientConsumer is null");
        this.b.f();
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void a(qlr qlrVar, int i) {
        qku qkuVar = (qku) qlrVar;
        String str = aczk.a;
        aczb aczbVar = this.b.i;
        if (aczbVar == null) {
            zep.c(aczk.a, "onSessionEnded, consumer is null, attempt to stop session with device id");
            this.b.c.c(qkuVar.b() != null ? qkuVar.b().b() : "", ampq.j(Integer.valueOf(i)));
        } else {
            aczbVar.a(i);
        }
        this.b.f();
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void b(qlr qlrVar) {
        qku qkuVar = (qku) qlrVar;
        String str = aczk.a;
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void c(qlr qlrVar, int i) {
        qku qkuVar = (qku) qlrVar;
        String str = aczk.a;
        this.b.e.b(atcu.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_FAILED, Integer.valueOf(i), this.a);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void d(qlr qlrVar, boolean z) {
        qku qkuVar = (qku) qlrVar;
        String str = aczk.a;
        this.b.e.b(atcu.MDX_SESSION_CAST_EVENT_TYPE_RECONNECTED, null, this.a);
        ampq a = this.b.c.a(qkuVar);
        if (!a.h()) {
            return;
        }
        this.b.i = (aczb) a.c();
        aczk aczkVar = this.b;
        aczkVar.g = true;
        ((adnu) aczkVar.f.get()).c(8);
        k(qkuVar);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void e(qlr qlrVar, String str) {
        qku qkuVar = (qku) qlrVar;
        String str2 = aczk.a;
        this.b.e.b(atcu.MDX_SESSION_CAST_EVENT_TYPE_RECONNECTING, null, this.a);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void f(qlr qlrVar, int i) {
        qku qkuVar = (qku) qlrVar;
        j(i);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void g(qlr qlrVar, String str) {
        qku qkuVar = (qku) qlrVar;
        String str2 = aczk.a;
        ((adnu) this.b.f.get()).c(8);
        aczk aczkVar = this.b;
        if (!aczkVar.g) {
            aczkVar.e.b(atcu.MDX_SESSION_CAST_EVENT_TYPE_SCREEN_APP_LAUNCHED, null, this.a);
            this.b.g = true;
        }
        k(qkuVar);
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void h(qlr qlrVar) {
        String str = aczk.a;
        this.b.e.b(atcu.MDX_SESSION_CAST_EVENT_TYPE_CAST_STARTING, null, this.a);
        aczk aczkVar = this.b;
        aczkVar.g = false;
        ampq b = aczkVar.c.b(((qku) qlrVar).b());
        if (!b.h()) {
            j(0);
            return;
        }
        this.b.i = (aczb) b.c();
    }

    @Override // defpackage.qlt
    public final /* bridge */ /* synthetic */ void i(qlr qlrVar, int i) {
        qku qkuVar = (qku) qlrVar;
        String str = aczk.a;
        this.b.e.b(atcu.MDX_SESSION_CAST_EVENT_TYPE_SUSPENDED, Integer.valueOf(i), this.a);
    }

    public final void j(int i) {
        String str = aczk.a;
        this.b.e.b(atcu.MDX_SESSION_CAST_EVENT_TYPE_CAST_START_FAILED, Integer.valueOf(i), this.a);
        aczb aczbVar = this.b.i;
        if (aczbVar == null) {
            zep.c(aczk.a, "onSessionStartFailed, castSdkClientConsumer is null");
        } else {
            aczbVar.c(i);
        }
        this.b.f();
    }
}
