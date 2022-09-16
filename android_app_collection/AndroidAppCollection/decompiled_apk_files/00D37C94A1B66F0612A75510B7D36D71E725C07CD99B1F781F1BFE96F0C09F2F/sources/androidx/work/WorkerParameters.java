package androidx.work;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public bpx b;
    public Set c;
    public int d;
    public Executor e;
    public bqt f;
    public bqa g;

    public WorkerParameters(UUID uuid, bpx bpxVar, Collection collection, int i, Executor executor, bqt bqtVar, bqa bqaVar) {
        this.a = uuid;
        this.b = bpxVar;
        this.c = new HashSet(collection);
        this.d = i;
        this.e = executor;
        this.f = bqtVar;
        this.g = bqaVar;
    }
}
