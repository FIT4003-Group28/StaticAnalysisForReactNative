package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vll  reason: default package */
/* loaded from: classes4.dex */
public final class vll {
    public Executor a;
    public vjb b;
    private final vnk d = vnk.a;
    private final HashMap c = new HashMap();

    public final vlk a() {
        return new vlk(this.a, this.b, this.d, this.c);
    }

    public final void b(vng vngVar) {
        String b = vngVar.b();
        aqxo.u(!this.c.containsKey(b), "There is already a factory registered for the ID %s", b);
        this.c.put(b, vngVar);
    }
}
