package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: ytq  reason: default package */
/* loaded from: classes4.dex */
final class ytq implements ysq {
    private final Executor a;
    private final yua b;
    private final aabf c;

    public ytq(Executor executor, aabf aabfVar, yua yuaVar) {
        this.a = executor;
        this.c = aabfVar;
        yuaVar.getClass();
        this.b = yuaVar;
    }

    @Override // defpackage.ysq
    public final void a(yua yuaVar, cfb cfbVar) {
        if (!yuaVar.q()) {
            this.a.execute(new ytp(yuaVar, cfbVar));
            aabf aabfVar = this.c;
            if (aabfVar == null) {
                return;
            }
            aabfVar.a(yuaVar, cfbVar);
        }
    }

    @Override // defpackage.ysq
    public final /* synthetic */ void b(UrlRequest urlRequest) {
    }

    @Override // defpackage.ysq
    public final boolean c() {
        return this.b.q();
    }

    @Override // defpackage.ysq
    public final void d() {
        this.b.n();
    }
}
