package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: shx  reason: default package */
/* loaded from: classes4.dex */
public final class shx implements skm, skq, sks, skn {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/components/lifecycle/LifecycleController");
    public final Context b;
    public final SettableFuture c;
    public final SettableFuture d;
    public skr e;
    public boolean f;
    public boolean g;
    private final Executor h;
    private final Executor i;
    private boolean j;

    public shx(Context context, Executor executor, Executor executor2) {
        SettableFuture f = SettableFuture.f();
        this.c = f;
        SettableFuture f2 = SettableFuture.f();
        this.d = f2;
        this.f = false;
        this.b = context;
        this.h = executor;
        this.i = executor2;
        anlz.A(sic.b(context, executor), new shw(this, 1), executor2);
        f2.lV(anii.h(f, ryj.i, executor));
    }

    @Override // defpackage.skm
    public final void a() {
        anvn a2;
        skr skrVar = this.e;
        if (skrVar != null) {
            skrVar.e.c().e();
            sie sieVar = this.e.e.a;
            for (amqi amqiVar : sieVar.f.values()) {
                if (amqiVar.a) {
                    amqiVar.g();
                }
            }
            skr skrVar2 = sieVar.c;
            if (skrVar2 != null) {
                a2 = skrVar2.e.b.a();
            } else {
                a2 = anvo.a();
            }
            sieVar.a(a2);
            this.e.e.b.a.e();
        }
    }

    @Override // defpackage.skq
    public final void b() {
    }

    @Override // defpackage.skq
    public final void c(skr skrVar) {
        this.e = skrVar;
        skrVar.e.a.f(skt.ASSET_DOWNLOAD);
        sju sjuVar = (sju) skrVar.e.c();
        anlz.A(sjuVar.j.b(new sjm(sjuVar)), new shw(this), skrVar.c);
        if (!skrVar.a.a()) {
            this.f = true;
        }
    }

    @Override // defpackage.skn
    public final void d() {
        this.g = false;
        this.j = true;
        f();
    }

    @Override // defpackage.skm
    public final void e() {
        skr skrVar = this.e;
        if (skrVar != null) {
            sie sieVar = skrVar.e.a;
            if (!((amqi) sieVar.f.get(sid.EXPERIENCE)).a) {
                ((amqi) sieVar.f.get(sid.EXPERIENCE)).f();
            }
            if (!this.f || this.g) {
                return;
            }
            f();
        }
    }

    public final void f() {
        skr skrVar;
        if (!this.j) {
            this.g = true;
            this.e.e.b().a();
        } else if (!this.f || (skrVar = this.e) == null) {
        } else {
            final siq siqVar = ((sju) skrVar.e.c()).h;
            siqVar.b(new Runnable() { // from class: sil
                @Override // java.lang.Runnable
                public final void run() {
                    siq.this.n = true;
                }
            });
            sjw sjwVar = ((sjy) this.e.e.d()).b;
            aopa createBuilder = awfl.a.createBuilder();
            awfq awfqVar = awfq.a;
            createBuilder.copyOnWrite();
            awfl awflVar = (awfl) createBuilder.instance;
            awfqVar.getClass();
            awflVar.c = awfqVar;
            awflVar.b = 12;
            sjwVar.a((awfl) createBuilder.mo39build());
        }
    }
}
