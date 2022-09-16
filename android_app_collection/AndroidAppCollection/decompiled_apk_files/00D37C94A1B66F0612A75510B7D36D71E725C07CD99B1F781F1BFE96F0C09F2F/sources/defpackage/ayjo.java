package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayjo  reason: default package */
/* loaded from: classes2.dex */
public final class ayjo extends aygz {
    public final ayjn c;
    private static final ReferenceQueue d = new ReferenceQueue();
    private static final ConcurrentMap e = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(ayjo.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayjo(ayal ayalVar) {
        super(ayalVar);
        ReferenceQueue referenceQueue = d;
        ConcurrentMap concurrentMap = e;
        this.c = new ayjn(this, ayalVar, referenceQueue, concurrentMap);
    }
}
