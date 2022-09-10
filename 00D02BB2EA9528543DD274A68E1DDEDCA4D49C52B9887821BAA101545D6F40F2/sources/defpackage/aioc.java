package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: aioc  reason: default package */
/* loaded from: classes2.dex */
public final class aioc {
    final dbsg<btlu> a;
    final ConcurrentHashMap<aiod, Set<PersonId>> b = new ConcurrentHashMap<>();
    final ConcurrentHashMap<PersonId, aink> c = new ConcurrentHashMap<>();
    final CopyOnWriteArraySet<aiog> d = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<aiof> e = new CopyOnWriteArraySet<>();
    private dbsg<aion> f;
    private int g;

    public aioc(dbsg<btlu> dbsgVar, dbsg<aion> dbsgVar2, int i) {
        this.g = 0;
        this.a = dbsgVar;
        this.f = dbsgVar2;
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dbsg<aion> a() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(dbsg<aion> dbsgVar) {
        this.f = dbsgVar;
    }

    public final synchronized int c() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(int i) {
        this.g = i;
    }
}
