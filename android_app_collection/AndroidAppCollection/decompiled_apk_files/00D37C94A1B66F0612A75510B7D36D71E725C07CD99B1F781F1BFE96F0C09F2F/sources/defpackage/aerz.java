package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aerz  reason: default package */
/* loaded from: classes.dex */
public final class aerz implements aesg {
    private final arqz a;
    private final amuk b;
    private final Map c;

    public aerz(arqz arqzVar) {
        afms.a(arqzVar);
        this.a = arqzVar;
        if (arqzVar.g.size() == 0) {
            this.b = amuk.q();
            this.c = Collections.emptyMap();
            return;
        }
        amuf f = amuk.f();
        this.c = new HashMap();
        for (arqx arqxVar : arqzVar.g) {
            int g = aqxo.g(arqxVar.b);
            int i = 1;
            f.h(Integer.valueOf((g == 0 ? 1 : g) - 1));
            Map map = this.c;
            String d = afca.d(arqxVar.c.I());
            int g2 = aqxo.g(arqxVar.b);
            if (g2 != 0) {
                i = g2;
            }
            map.put(d, Integer.valueOf(i - 1));
        }
        this.b = f.g();
    }

    @Override // defpackage.aesg
    public final amuk a() {
        return this.b;
    }

    @Override // defpackage.aesg
    public final String b() {
        return this.a.d;
    }

    @Override // defpackage.aesg
    public final boolean c() {
        return this.a.h;
    }

    @Override // defpackage.aesg
    public final boolean d() {
        afms.d(!e());
        return this.a.e;
    }

    public final boolean e() {
        int f = aqxo.f(this.a.c);
        return f != 0 && f == 2;
    }

    @Override // defpackage.aesg
    public final byte[] f() {
        return this.a.f.I();
    }

    public final String toString() {
        return "";
    }
}
