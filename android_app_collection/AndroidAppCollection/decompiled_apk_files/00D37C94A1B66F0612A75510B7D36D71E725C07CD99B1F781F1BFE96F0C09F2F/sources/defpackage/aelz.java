package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aelz  reason: default package */
/* loaded from: classes.dex */
final class aelz implements aemu {
    private final List a;
    private final long b;
    private boolean c;

    aelz() {
        this(0L);
    }

    @Override // defpackage.aemu
    public final synchronized int a(long j, int i, byte[] bArr, int i2) {
        aely aelyVar;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aelyVar = null;
                break;
            }
            aelyVar = (aely) it.next();
            if (aelyVar.a.b(j)) {
                break;
            }
        }
        if (aelyVar == null) {
            return 0;
        }
        return aelyVar.b.a(j - aelyVar.a.a, i, bArr, i2);
    }

    @Override // defpackage.aemu
    public final synchronized long b() {
        return this.b;
    }

    @Override // defpackage.aemu
    public final synchronized void c() {
        this.c = true;
    }

    @Override // defpackage.aemu
    public final synchronized void d(byte[] bArr, int i, int i2, aens aensVar) {
        aely aelyVar;
        if (aensVar == aent.a) {
            aelyVar = (aely) this.a.get(0);
        } else {
            Iterator it = this.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    aely aelyVar2 = (aely) it.next();
                    if (aelyVar2.a.b == aensVar.a) {
                        aelyVar = aelyVar2;
                        break;
                    }
                } else {
                    long j = aensVar.a;
                    aelyVar = new aely(aens.a(j, j), new aemc(this.b));
                    this.a.add(aelyVar);
                    break;
                }
            }
        }
        aelyVar.b.d(bArr, i, i2, aensVar);
        aens aensVar2 = aelyVar.a;
        aelyVar.a = aens.a(aensVar2.a, aensVar2.b + i2);
    }

    @Override // defpackage.aemu
    public final synchronized boolean e(long j) {
        boolean z;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((aely) it.next()).a.b(j)) {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // defpackage.aemu
    public final synchronized boolean f() {
        return this.c;
    }

    public aelz(long j) {
        this.c = false;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = j;
        arrayList.add(new aely(aens.a(0L, 0L), new aemc(j)));
    }
}
