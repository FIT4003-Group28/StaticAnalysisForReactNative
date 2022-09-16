package defpackage;

import android.os.ConditionVariable;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: aacy  reason: default package */
/* loaded from: classes.dex */
public final class aacy implements MessageQueue.IdleHandler, aacu {
    public final azqb b;
    public volatile int d;
    public final aacv f;
    public acrl g;
    private final Executor h;
    public final ConditionVariable c = new ConditionVariable();
    public final FutureTask e = new FutureTask(new Callable() { // from class: aacx
        @Override // java.util.concurrent.Callable
        public final Object call() {
            aacy aacyVar = aacy.this;
            aacyVar.d = ((aouc) ((yve) aacyVar.f.a.get()).c()).c;
            try {
                boolean z = false;
                if (aacyVar.d != 0) {
                    int a = ((zen) aacyVar.b.get()).a("failsafe_maxnumber_uncaught_exception", -1);
                    if (a <= 0) {
                        aacyVar.d = 0;
                        aacyVar.f.a();
                    } else if (aacyVar.d >= a) {
                        z = true;
                    }
                }
                aacyVar.c.open();
                return Boolean.valueOf(z);
            } catch (Throwable th) {
                aacyVar.c.open();
                throw th;
            }
        }
    });

    public aacy(azqb azqbVar, Executor executor, aacv aacvVar) {
        this.b = azqbVar;
        this.h = executor;
        this.f = aacvVar;
    }

    @Override // defpackage.aacu
    public final ConditionVariable a() {
        return this.c;
    }

    @Override // defpackage.aacu
    public final /* bridge */ /* synthetic */ Future b() {
        return this.e;
    }

    @Override // defpackage.aacu
    public final void c() {
        aacv aacvVar = this.f;
        aacvVar.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(aacvVar);
    }

    @Override // defpackage.aacu
    public final void d(Executor executor) {
        if (executor != null) {
            executor.execute(this.e);
        } else {
            this.e.run();
        }
    }

    @Override // defpackage.aacu
    public final void e(acrl acrlVar) {
        ylr.c();
        this.g = acrlVar;
        Looper.myQueue().addIdleHandler(this);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.h.execute(new Runnable() { // from class: aacw
            @Override // java.lang.Runnable
            public final void run() {
                aacy aacyVar = aacy.this;
                aacyVar.f.c = true;
                try {
                    if (((Boolean) aacyVar.e.get()).booleanValue() || aacyVar.d != 0) {
                        acrl acrlVar = aacyVar.g;
                        int i = aacyVar.d;
                        boolean booleanValue = ((Boolean) aacyVar.e.get()).booleanValue();
                        boolean e = acrlVar.b.e("failsafe_clear_cache_release_13_02", false);
                        aopa createBuilder = auza.a.createBuilder();
                        createBuilder.copyOnWrite();
                        auza auzaVar = (auza) createBuilder.instance;
                        auzaVar.b = 1 | auzaVar.b;
                        auzaVar.c = booleanValue;
                        createBuilder.copyOnWrite();
                        auza auzaVar2 = (auza) createBuilder.instance;
                        auzaVar2.b |= 4;
                        auzaVar2.d = i;
                        createBuilder.copyOnWrite();
                        auza auzaVar3 = (auza) createBuilder.instance;
                        auzaVar3.b |= 8;
                        auzaVar3.e = e;
                        arrf a = arrh.a();
                        a.copyOnWrite();
                        ((arrh) a.instance).dE((auza) createBuilder.mo39build());
                        ((acrr) acrlVar.a.get()).c((arrh) a.mo39build());
                    }
                    aacyVar.f.a();
                } catch (InterruptedException | ExecutionException unused) {
                    afus.b(2, 18, "Fail to read crashcounter");
                }
            }
        });
        return false;
    }
}
