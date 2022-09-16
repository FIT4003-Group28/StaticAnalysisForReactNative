package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: nxh  reason: default package */
/* loaded from: classes3.dex */
public final class nxh implements nxi {
    public final aynx a;
    private final azpa d;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    public int b = 0;

    public nxh() {
        azpa as = azpa.as(0);
        this.d = as;
        this.a = as.L().aj().b(0);
    }

    public final void a(nxg nxgVar) {
        this.c.add(nxgVar);
    }

    public final void b(nxg nxgVar) {
        this.c.remove(nxgVar);
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean d() {
        return this.b == 3;
    }

    public final boolean e() {
        return this.b == 1;
    }

    @Override // defpackage.nxi
    public final boolean f() {
        return this.b == 2;
    }

    @Override // defpackage.nxi
    public final boolean g() {
        return nwp.f(this.b);
    }

    public final boolean h(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        for (nxg nxgVar : this.c) {
            nxgVar.n(i);
        }
        this.d.c(Integer.valueOf(i));
        return true;
    }
}
