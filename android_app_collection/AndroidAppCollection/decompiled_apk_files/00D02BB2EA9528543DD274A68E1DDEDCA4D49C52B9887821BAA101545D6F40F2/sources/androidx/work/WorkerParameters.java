package androidx.work;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkerParameters {
    public UUID a;
    public bbp b;
    public Set<String> c;
    public Executor d;
    public bcq e;

    public WorkerParameters(UUID uuid, bbp bbpVar, Collection collection, Executor executor, bcq bcqVar) {
        this.a = uuid;
        this.b = bbpVar;
        this.c = new HashSet(collection);
        this.d = executor;
        this.e = bcqVar;
    }
}
