package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: axys  reason: default package */
/* loaded from: classes2.dex */
public final class axys {
    public static final axys a = new axys(new axyp(1), axyp.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public axys(axyr... axyrVarArr) {
        for (axyr axyrVar : axyrVarArr) {
            this.b.put(axyrVar.b(), axyrVar);
        }
    }
}
