package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: whc */
/* loaded from: classes4.dex */
public final class whc implements whf {
    public final amag a;
    public final ambz b;
    private final amcj c;
    private final ankw d;
    private final Executor e;

    public whc(amag amagVar, ambz ambzVar, amcj amcjVar, ankw ankwVar, Executor executor) {
        this.a = amagVar;
        this.b = ambzVar;
        this.c = amcjVar;
        this.d = ankwVar;
        this.e = executor;
    }

    public static /* synthetic */ void a(Throwable th) {
        throw new IllegalStateException("DefaultTikTokBridge: switch account error", th);
    }

    @Override // defpackage.whf
    public final void b(final afvm afvmVar) {
        ylx.j(amne.f(this.c.a()).i(new anir() { // from class: whb
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                whc whcVar = whc.this;
                afvm afvmVar2 = afvmVar;
                return whcVar.b.a(wey.b(afvmVar2), wey.c(afvmVar2));
            }
        }, this.d).i(new anir() { // from class: wha
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                whc whcVar = whc.this;
                if (((AccountId) obj) != null) {
                    return whcVar.a.e();
                }
                afus.b(2, 25, "[Clockwork][DefaultTikTokBridge] notifyRequirementStateChanged: AccountId was null");
                return anlz.p(new IllegalStateException("AccountId was null"));
            }
        }, this.d), this.e, ngc.i);
    }
}
