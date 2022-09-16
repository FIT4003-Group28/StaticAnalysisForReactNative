package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yto  reason: default package */
/* loaded from: classes4.dex */
public final class yto implements ysq {
    public final AtomicReference a;
    private final SettableFuture b;
    private final yua c;
    private final aabf d;

    public yto(final SettableFuture settableFuture, aabf aabfVar, yua yuaVar) {
        this.b = settableFuture;
        yuaVar.getClass();
        this.c = yuaVar;
        this.d = aabfVar;
        this.a = new AtomicReference(null);
        settableFuture.qY(new Runnable() { // from class: ytn
            @Override // java.lang.Runnable
            public final void run() {
                yto ytoVar = yto.this;
                if (!settableFuture.isCancelled() || ytoVar.a.get() == null) {
                    return;
                }
                ((UrlRequest) ytoVar.a.get()).cancel();
            }
        }, anjk.a);
    }

    @Override // defpackage.ysq
    public final void a(yua yuaVar, cfb cfbVar) {
        if (!this.b.isCancelled()) {
            cff cffVar = cfbVar.c;
            if (cffVar != null) {
                this.b.e(cffVar);
            } else {
                this.b.o(cfbVar);
            }
            aabf aabfVar = this.d;
            if (aabfVar == null) {
                return;
            }
            aabfVar.a(yuaVar, cfbVar);
        }
    }

    @Override // defpackage.ysq
    public final void b(UrlRequest urlRequest) {
        this.a.set(urlRequest);
    }

    @Override // defpackage.ysq
    public final boolean c() {
        return this.c.q() || this.b.isCancelled();
    }

    @Override // defpackage.ysq
    public final void d() {
        if (!this.b.isCancelled()) {
            this.b.cancel(true);
        }
        this.c.n();
    }
}
