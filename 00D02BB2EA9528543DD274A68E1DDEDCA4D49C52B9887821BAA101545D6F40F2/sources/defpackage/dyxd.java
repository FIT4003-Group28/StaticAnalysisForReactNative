package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dyxd  reason: default package */
/* loaded from: classes6.dex */
public final class dyxd {
    public final dywr a;
    public final dyxz b;
    public int c;
    public final dyxb d;

    public dyxd(dywr dywrVar, dyxz dyxzVar) {
        this.a = dywrVar;
        dbsk.t(dyxzVar, "frameWriter");
        this.b = dyxzVar;
        this.c = 65535;
        this.d = new dyxb(this, 0, 65535);
    }

    private final dyxb e(dywk dywkVar) {
        Object obj = dywkVar.f;
        if (obj == null) {
            dyxb dyxbVar = new dyxb(this, dywkVar, this.c);
            dywkVar.f = dyxbVar;
            return dyxbVar;
        }
        return (dyxb) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z, int i, eaiz eaizVar, boolean z2) {
        dbsk.t(eaizVar, "source");
        dywk s = this.a.s(i);
        if (s == null) {
            return;
        }
        dyxb e = e(s);
        int b = e.b();
        boolean c = e.c();
        int i2 = (int) eaizVar.b;
        if (c || b < i2) {
            if (!c && b > 0) {
                e.d(eaizVar, b, false);
            }
            e.a.a(eaizVar, (int) eaizVar.b);
            e.f = z | e.f;
        } else {
            e.d(eaizVar, i2, z);
        }
        if (!z2) {
            return;
        }
        b();
    }

    public final void c() {
        dywk[] i = this.a.i();
        int i2 = this.d.c;
        int length = i.length;
        while (true) {
            int i3 = 0;
            if (length <= 0 || i2 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i2 / length);
            for (int i4 = 0; i4 < length && i2 > 0; i4++) {
                dywk dywkVar = i[i4];
                dyxb e = e(dywkVar);
                int min = Math.min(i2, Math.min(e.a(), ceil));
                if (min > 0) {
                    e.d += min;
                    i2 -= min;
                }
                if (e.a() > 0) {
                    i[i3] = dywkVar;
                    i3++;
                }
            }
            length = i3;
        }
        dyxc dyxcVar = new dyxc();
        for (dywk dywkVar2 : this.a.i()) {
            dyxb e2 = e(dywkVar2);
            e2.e(e2.d, dyxcVar);
            e2.d = 0;
        }
        if (dyxcVar.a()) {
            b();
        }
    }

    public final void d(@dzsi dywk dywkVar, int i) {
        if (dywkVar == null) {
            this.d.f(i);
            c();
            return;
        }
        dyxb e = e(dywkVar);
        e.f(i);
        dyxc dyxcVar = new dyxc();
        e.e(e.b(), dyxcVar);
        if (!dyxcVar.a()) {
            return;
        }
        b();
    }

    final void b() {
        try {
            this.b.c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
