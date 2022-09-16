package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: amjl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amjl implements Callable {
    public final /* synthetic */ amjo a;
    private final /* synthetic */ int b;

    public /* synthetic */ amjl(amjo amjoVar) {
        this.a = amjoVar;
    }

    public /* synthetic */ amjl(amjo amjoVar, int i) {
        this.b = i;
        this.a = amjoVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long c;
        aopa createBuilder;
        Long valueOf;
        ReentrantReadWriteLock reentrantReadWriteLock;
        if (this.b != 0) {
            amjo amjoVar = this.a;
            amvl i = amvn.i();
            try {
                for (Integer num : amjoVar.a().f) {
                    i.c(AccountId.b(num.intValue()));
                }
                return i.g();
            } catch (IOException e) {
                amjoVar.f(e);
                return i.g();
            }
        }
        amjo amjoVar2 = this.a;
        amjoVar2.b.writeLock().lock();
        try {
            if (!amjoVar2.e.get()) {
                try {
                    amkh a = amjoVar2.a();
                    c = a.c;
                    createBuilder = amkh.a.createBuilder();
                    createBuilder.mergeFrom((aopi) a);
                } catch (IOException e2) {
                    amjoVar2.f(e2);
                    c = amjoVar2.d.c();
                    createBuilder = amkh.a.createBuilder();
                }
                if (c > 0) {
                    amjoVar2.f = c;
                    amjoVar2.e.set(true);
                    valueOf = Long.valueOf(amjoVar2.f);
                    reentrantReadWriteLock = amjoVar2.b;
                } else {
                    long c2 = amjoVar2.d.c();
                    amjoVar2.f = c2;
                    createBuilder.copyOnWrite();
                    amkh amkhVar = (amkh) createBuilder.instance;
                    amkhVar.b |= 1;
                    amkhVar.c = c2;
                    try {
                        amjoVar2.e((amkh) createBuilder.mo39build());
                        amjoVar2.e.set(true);
                    } catch (IOException e3) {
                        ((amzw) ((amzw) ((amzw) amjo.a.g()).h(e3)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$getSyncEpoch$0", 'n', "SyncManagerDataStore.java")).q("Could not write sync epoch. Using current time but future runs may be delayed.");
                        amjoVar2.e.set(false);
                    }
                    valueOf = Long.valueOf(amjoVar2.f);
                    reentrantReadWriteLock = amjoVar2.b;
                }
            } else {
                valueOf = Long.valueOf(amjoVar2.f);
                reentrantReadWriteLock = amjoVar2.b;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return valueOf;
        } catch (Throwable th) {
            amjoVar2.b.writeLock().unlock();
            throw th;
        }
    }
}
