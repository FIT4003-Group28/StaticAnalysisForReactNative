package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ByteStoreConfig;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
/* compiled from: PG */
/* renamed from: aagg  reason: default package */
/* loaded from: classes.dex */
public final class aagg {
    public final ByteStore a;
    private final aaki b;
    private final aake c;
    private final FaultSubscription unusedFaultSubscription;
    private final Subscription unusedSubscription;

    public aagg(Observer observer, FaultObserver faultObserver, aaki aakiVar, aake aakeVar) {
        smc.b();
        ByteStore create = ByteStore.create(new ByteStoreConfig());
        this.a = create;
        this.b = aakiVar;
        this.c = aakeVar;
        this.unusedSubscription = create.subscribe(null, observer);
        this.unusedFaultSubscription = create.subscribeToFaults(faultObserver);
    }

    public static aajk f(awsz awszVar) {
        if (awszVar != null) {
            aqwb aqwbVar = awszVar.c;
            if (aqwbVar == null) {
                aqwbVar = aqwb.a;
            }
            return aajk.b(aqwbVar);
        }
        return aajk.a;
    }

    private final void i(String str) {
        this.b.a("InMemoryEntityStore", str);
    }

    public final Snapshot a() {
        Snapshot snapshot = this.a.snapshot();
        if (snapshot == null) {
            i("Failed to create snapshot");
            return null;
        }
        return snapshot;
    }

    public final aagf b(String str) {
        return c(str, a());
    }

    public final aagf c(String str, Snapshot snapshot) {
        aajj e = !snapshot.contains(str) ? null : e(snapshot, str);
        awsz g = g(snapshot, str);
        if (g == null) {
            g = awsz.a;
        }
        return new aagf(e, g);
    }

    public final aajj d(String str) {
        return e(a(), str);
    }

    public final aajj e(Snapshot snapshot, String str) {
        byte[] find;
        if (snapshot == null || (find = snapshot.find(str)) == null) {
            return null;
        }
        return this.c.a(str, find);
    }

    public final awsz g(Snapshot snapshot, String str) {
        byte[] retrieveMetadata;
        if (snapshot == null || (retrieveMetadata = snapshot.retrieveMetadata(str)) == null) {
            return null;
        }
        try {
            return (awsz) aopi.parseFrom(awsz.a, retrieveMetadata, aoos.b());
        } catch (aopx unused) {
            String valueOf = String.valueOf(str);
            i(valueOf.length() != 0 ? "Unparseable companion for ".concat(valueOf) : new String("Unparseable companion for "));
            return null;
        }
    }

    public final void h(aajj aajjVar, awsz awszVar) {
        this.a.setWithMetadata(aajjVar.d(), aajjVar.c(), awszVar.toByteArray());
    }
}
