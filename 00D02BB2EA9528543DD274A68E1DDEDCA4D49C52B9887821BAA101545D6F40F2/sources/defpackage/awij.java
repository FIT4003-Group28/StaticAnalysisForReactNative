package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: awij  reason: default package */
/* loaded from: classes3.dex */
public final class awij {
    public final String a;
    public final dkrl b;
    public final Map<String, dkrl> c = new HashMap();
    public final Map<String, dkrj> d = new HashMap();

    public awij(String str, dkrl dkrlVar) {
        this.a = str;
        this.b = dkrlVar;
    }

    public final void a(dkrj dkrjVar) {
        boolean z = true;
        dbsk.b(1 == (dkrjVar.a & 1), "missing policy id");
        if (this.d.put(dkrjVar.b, dkrjVar) != null) {
            z = false;
        }
        dbsk.g(z, "duplicate policy id %s", dkrjVar.b);
    }

    public final void b(dkrl dkrlVar) {
        boolean z = true;
        dbsk.b(1 == (dkrlVar.a & 1), "missing state id");
        if (this.c.put(dkrlVar.b, dkrlVar) != null) {
            z = false;
        }
        dbsk.g(z, "duplicate state id %s", dkrlVar.b);
    }
}
