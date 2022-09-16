package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: cybl  reason: default package */
/* loaded from: classes5.dex */
public final class cybl extends cybn<cybo> {
    public static final ConcurrentMap<String, dbty<cybo>> a = new ConcurrentHashMap();

    @Override // defpackage.cybn
    protected final ConcurrentMap<String, dbty<cybo>> a() {
        return a;
    }

    @Override // defpackage.cybn
    public final cybo c() {
        return new cybo(this);
    }
}
