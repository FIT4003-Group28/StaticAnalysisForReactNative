package defpackage;

import com.google.apps.tiktok.account.AutoValue_AccountId;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: amjk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amjk implements Runnable {
    public final /* synthetic */ amjo a;
    public final /* synthetic */ Set b;
    private final /* synthetic */ int c;

    public /* synthetic */ amjk(amjo amjoVar, Set set) {
        this.a = amjoVar;
        this.b = set;
    }

    public /* synthetic */ amjk(amjo amjoVar, Set set, int i) {
        this.c = i;
        this.a = amjoVar;
        this.b = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amjo amjoVar;
        amkh a;
        amkh a2;
        if (this.c != 0) {
            amjoVar = this.a;
            Set set = this.b;
            amjoVar.b.writeLock().lock();
            try {
                amkh amkhVar = amkh.a;
                try {
                    a2 = amjoVar.a();
                } catch (IOException e) {
                    if (!amjoVar.f(e)) {
                        ((amzw) ((amzw) ((amzw) amjo.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$removeSyncRequests$6", (char) 405, "SyncManagerDataStore.java")).q("Unable to read or clear store. Cannot remove account.");
                        return;
                    }
                }
                aopa createBuilder = amkh.a.createBuilder();
                createBuilder.mergeFrom((aopi) a2);
                createBuilder.copyOnWrite();
                ((amkh) createBuilder.instance).d = amkh.emptyProtobufList();
                for (amkg amkgVar : a2.d) {
                    amkj amkjVar = amkgVar.c;
                    if (amkjVar == null) {
                        amkjVar = amkj.a;
                    }
                    if (!set.contains(amjv.a(amkjVar))) {
                        createBuilder.I(amkgVar);
                    }
                }
                try {
                    amjoVar.e((amkh) createBuilder.mo39build());
                } catch (IOException e2) {
                    ((amzw) ((amzw) ((amzw) amjo.a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$removeSyncRequests$6", (char) 425, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot remove account.");
                }
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        amjoVar = this.a;
        Set<amjv> set2 = this.b;
        amjoVar.b.writeLock().lock();
        try {
            amkh amkhVar2 = amkh.a;
            try {
                a = amjoVar.a();
            } catch (IOException e3) {
                if (!amjoVar.f(e3)) {
                    ((amzw) ((amzw) ((amzw) amjo.a.f()).h(e3)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateScheduledAccountIds$5", (char) 365, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update scheduled account ids. ");
                }
            }
            aopa createBuilder2 = amkh.a.createBuilder();
            createBuilder2.mergeFrom((aopi) a);
            createBuilder2.copyOnWrite();
            ((amkh) createBuilder2.instance).f = amkh.emptyIntList();
            TreeSet treeSet = new TreeSet();
            for (amjv amjvVar : set2) {
                if (amjvVar.b()) {
                    treeSet.add(Integer.valueOf(((AutoValue_AccountId) amjvVar.c).a));
                }
            }
            createBuilder2.copyOnWrite();
            amkh amkhVar3 = (amkh) createBuilder2.instance;
            aopq aopqVar = amkhVar3.f;
            if (!aopqVar.c()) {
                amkhVar3.f = aopi.mutableCopy(aopqVar);
            }
            aonk.addAll((Iterable) treeSet, (List) amkhVar3.f);
            try {
                amjoVar.e((amkh) createBuilder2.mo39build());
            } catch (IOException e4) {
                ((amzw) ((amzw) ((amzw) amjo.a.f()).h(e4)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateScheduledAccountIds$5", (char) 386, "SyncManagerDataStore.java")).q("Error writing scheduled account ids");
            }
        } finally {
            amjoVar.b.writeLock().unlock();
        }
    }
}
