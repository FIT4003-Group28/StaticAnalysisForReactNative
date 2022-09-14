package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: clkp  reason: default package */
/* loaded from: classes5.dex */
public final class clkp {
    public final Map<String, cllf> a = new HashMap();
    public Executor b;
    public clja c;
    public clkv d;

    public final void a(String str, cllf cllfVar) {
        dbsk.g(cllfVar.b().contains(str), "Provided UrlEngine must support URL scheme: %s", str);
        dbsk.g(!this.a.containsKey(str), "Requested scheme already has a UrlEngine registered: %s", str);
        this.a.put(str, cllfVar);
    }
}
