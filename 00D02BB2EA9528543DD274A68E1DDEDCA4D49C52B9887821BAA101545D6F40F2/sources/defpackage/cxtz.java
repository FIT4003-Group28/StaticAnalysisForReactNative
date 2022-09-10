package defpackage;

import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
/* compiled from: PG */
/* renamed from: cxtz  reason: default package */
/* loaded from: classes5.dex */
final class cxtz implements Runnable {
    final /* synthetic */ Stopwatch a;
    final /* synthetic */ int b;
    final /* synthetic */ cxrb c;
    final /* synthetic */ cxua d;

    public cxtz(cxua cxuaVar, Stopwatch stopwatch, int i, cxrb cxrbVar) {
        this.d = cxuaVar;
        this.a = stopwatch;
        this.b = i;
        this.c = cxrbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxqo cxqoVar = this.d.f;
        eazd bZ = eaze.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar = (eaze) bZ.b;
        eazeVar.b = 4;
        eazeVar.a |= 1;
        eazh bZ2 = eazi.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eazi eaziVar = (eazi) bZ2.b;
        eaziVar.b = 2;
        eaziVar.a |= 1;
        long a = this.a.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eazi eaziVar2 = (eazi) bZ2.b;
        eaziVar2.a |= 2;
        eaziVar2.c = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar2 = (eaze) bZ.b;
        eazi bK = bZ2.bK();
        bK.getClass();
        eazeVar2.e = bK;
        eazeVar2.a |= 8;
        eazk bZ3 = eazl.e.bZ();
        int g = this.d.f.g();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        eazl eazlVar = (eazl) bZ3.b;
        int i = g - 1;
        if (g != 0) {
            eazlVar.b = i;
            eazlVar.a |= 1;
            eazl eazlVar2 = (eazl) bZ3.b;
            eazlVar2.c = 3;
            eazlVar2.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar3 = (eaze) bZ.b;
            eazl bK2 = bZ3.bK();
            bK2.getClass();
            eazeVar3.c = bK2;
            eazeVar3.a |= 2;
            cxqoVar.b(bZ.bK());
            if (cxsg.e()) {
                cxqo cxqoVar2 = this.d.f;
                eazd bZ4 = eaze.g.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                eaze eazeVar4 = (eaze) bZ4.b;
                eazeVar4.b = 4;
                eazeVar4.a |= 1;
                eazh bZ5 = eazi.e.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                eazi eaziVar3 = (eazi) bZ5.b;
                eaziVar3.b = 8;
                eaziVar3.a |= 1;
                long a2 = this.d.f.a("ListViewDeviceSuggestionsTime").a();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                eazi eaziVar4 = (eazi) bZ5.b;
                eaziVar4.a |= 2;
                eaziVar4.c = a2;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                eaze eazeVar5 = (eaze) bZ4.b;
                eazi bK3 = bZ5.bK();
                bK3.getClass();
                eazeVar5.e = bK3;
                eazeVar5.a |= 8;
                eazk bZ6 = eazl.e.bZ();
                int g2 = this.d.f.g();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                eazl eazlVar3 = (eazl) bZ6.b;
                int i2 = g2 - 1;
                if (g2 != 0) {
                    eazlVar3.b = i2;
                    eazlVar3.a |= 1;
                    eazl eazlVar4 = (eazl) bZ6.b;
                    eazlVar4.c = 3;
                    eazlVar4.a |= 2;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    eaze eazeVar6 = (eaze) bZ4.b;
                    eazl bK4 = bZ6.bK();
                    bK4.getClass();
                    eazeVar6.c = bK4;
                    eazeVar6.a |= 2;
                    cxqoVar2.b(bZ4.bK());
                    return;
                }
                throw null;
            }
            cxqo cxqoVar3 = this.d.f;
            eazd bZ7 = eaze.g.bZ();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            eaze eazeVar7 = (eaze) bZ7.b;
            eazeVar7.b = 1;
            eazeVar7.a |= 1;
            eazb bZ8 = eazc.g.bZ();
            int i3 = this.b;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            eazc eazcVar = (eazc) bZ8.b;
            eazcVar.a |= 1;
            eazcVar.b = i3;
            long a3 = this.d.f.a("ListViewDeviceSuggestionsTime").a();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            eazc eazcVar2 = (eazc) bZ8.b;
            eazcVar2.a |= 2;
            eazcVar2.c = a3;
            boolean a4 = cxse.a(this.d.a);
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            eazc eazcVar3 = (eazc) bZ8.b;
            eazcVar3.a = 8 | eazcVar3.a;
            eazcVar3.d = a4;
            boolean e = this.d.e.e();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            eazc eazcVar4 = (eazc) bZ8.b;
            int i4 = eazcVar4.a | 16;
            eazcVar4.a = i4;
            eazcVar4.e = e;
            int i5 = this.c.c;
            eazcVar4.a = i4 | 64;
            eazcVar4.f = i5;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            eaze eazeVar8 = (eaze) bZ7.b;
            eazc bK5 = bZ8.bK();
            bK5.getClass();
            eazeVar8.f = bK5;
            eazeVar8.a |= 32;
            eazk bZ9 = eazl.e.bZ();
            int g3 = this.d.f.g();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            eazl eazlVar5 = (eazl) bZ9.b;
            int i6 = g3 - 1;
            if (g3 != 0) {
                eazlVar5.b = i6;
                eazlVar5.a |= 1;
                eazl eazlVar6 = (eazl) bZ9.b;
                eazlVar6.c = 3;
                eazlVar6.a |= 2;
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                eaze eazeVar9 = (eaze) bZ7.b;
                eazl bK6 = bZ9.bK();
                bK6.getClass();
                eazeVar9.c = bK6;
                eazeVar9.a |= 2;
                cxqoVar3.b(bZ7.bK());
                return;
            }
            throw null;
        }
        throw null;
    }
}
