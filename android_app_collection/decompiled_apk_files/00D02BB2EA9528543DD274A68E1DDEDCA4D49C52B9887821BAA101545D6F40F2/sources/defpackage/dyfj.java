package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: dyfj  reason: default package */
/* loaded from: classes6.dex */
public final class dyfj {
    public static final dyfj a = new dyfj(new dyff(), dyfg.a);
    private final ConcurrentMap<String, dyfi> b = new ConcurrentHashMap();

    public dyfj(dyfi... dyfiVarArr) {
        for (dyfi dyfiVar : dyfiVarArr) {
            this.b.put(dyfiVar.a(), dyfiVar);
        }
    }
}
