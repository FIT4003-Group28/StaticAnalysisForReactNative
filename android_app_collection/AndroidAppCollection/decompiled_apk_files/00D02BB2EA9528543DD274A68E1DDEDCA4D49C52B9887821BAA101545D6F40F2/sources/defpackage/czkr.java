package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czkr  reason: default package */
/* loaded from: classes5.dex */
public final class czkr {
    public Executor a;
    public czif b;
    private final czmt d = czmt.a;
    private final HashMap<String, czmn> c = new HashMap<>();

    public final czkq a() {
        return new czkq(this.a, this.b, this.d, this.c);
    }

    public final void b(czmn czmnVar) {
        String a = czmnVar.a(czjw.a);
        dbsk.g(!this.c.containsKey(a), "There is already a factory registered for the ID %s", a);
        this.c.put(a, czmnVar);
    }
}
