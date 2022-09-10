package defpackage;

import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
/* compiled from: PG */
/* renamed from: cxtf  reason: default package */
/* loaded from: classes5.dex */
final class cxtf implements Runnable {
    final /* synthetic */ Stopwatch a;
    final /* synthetic */ cxrb b;
    final /* synthetic */ int c;
    final /* synthetic */ cxti d;

    public cxtf(cxti cxtiVar, Stopwatch stopwatch, cxrb cxrbVar, int i) {
        this.d = cxtiVar;
        this.a = stopwatch;
        this.b = cxrbVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxqo cxqoVar = this.d.e;
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
        int g = this.d.e.g();
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
            eazlVar2.c = 1;
            int i2 = eazlVar2.a | 2;
            eazlVar2.a = i2;
            int i3 = this.b.a;
            eazlVar2.a = i2 | 4;
            eazlVar2.d = i3;
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
                cxqo cxqoVar2 = this.d.e;
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
                long a2 = this.d.e.a("FaceRowTopSuggestionsTime").a();
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
                int g2 = this.d.e.g();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                eazl eazlVar3 = (eazl) bZ6.b;
                int i4 = g2 - 1;
                if (g2 != 0) {
                    eazlVar3.b = i4;
                    eazlVar3.a |= 1;
                    eazl eazlVar4 = (eazl) bZ6.b;
                    eazlVar4.c = 1;
                    int i5 = eazlVar4.a | 2;
                    eazlVar4.a = i5;
                    int i6 = this.b.a;
                    eazlVar4.a = i5 | 4;
                    eazlVar4.d = i6;
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
                } else {
                    throw null;
                }
            } else {
                cxqo cxqoVar3 = this.d.e;
                eazd bZ7 = eaze.g.bZ();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                eaze eazeVar7 = (eaze) bZ7.b;
                eazeVar7.b = 1;
                eazeVar7.a |= 1;
                eazb bZ8 = eazc.g.bZ();
                int size = this.d.l.size();
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                eazc eazcVar = (eazc) bZ8.b;
                eazcVar.a |= 1;
                eazcVar.b = size;
                long a3 = this.d.e.a("FaceRowTopSuggestionsTime").a();
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
                eazcVar3.a |= 8;
                eazcVar3.d = a4;
                boolean e = this.d.f.e();
                if (bZ8.c) {
                    bZ8.bF();
                    bZ8.c = false;
                }
                eazc eazcVar4 = (eazc) bZ8.b;
                int i7 = eazcVar4.a | 16;
                eazcVar4.a = i7;
                eazcVar4.e = e;
                int i8 = this.c;
                eazcVar4.a = i7 | 64;
                eazcVar4.f = i8;
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
                int g3 = this.d.e.g();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                eazl eazlVar5 = (eazl) bZ9.b;
                int i9 = g3 - 1;
                if (g3 == 0) {
                    throw null;
                }
                eazlVar5.b = i9;
                eazlVar5.a |= 1;
                eazl eazlVar6 = (eazl) bZ9.b;
                eazlVar6.c = 1;
                int i10 = eazlVar6.a | 2;
                eazlVar6.a = i10;
                int i11 = this.b.a;
                eazlVar6.a = i10 | 4;
                eazlVar6.d = i11;
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
            }
            Stopwatch a5 = this.d.e.a("TotalInitialize");
            if (!a5.c) {
                return;
            }
            a5.d();
            cxqo cxqoVar4 = this.d.e;
            eazd bZ10 = eaze.g.bZ();
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            eaze eazeVar10 = (eaze) bZ10.b;
            eazeVar10.b = 4;
            eazeVar10.a |= 1;
            eazh bZ11 = eazi.e.bZ();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            eazi eaziVar5 = (eazi) bZ11.b;
            eaziVar5.b = 12;
            eaziVar5.a |= 1;
            long a6 = a5.a();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            eazi eaziVar6 = (eazi) bZ11.b;
            eaziVar6.a |= 2;
            eaziVar6.c = a6;
            int i12 = this.d.e.i();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            eazi eaziVar7 = (eazi) bZ11.b;
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            eaziVar7.d = i13;
            eaziVar7.a |= 4;
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            eaze eazeVar11 = (eaze) bZ10.b;
            eazi bK7 = bZ11.bK();
            bK7.getClass();
            eazeVar11.e = bK7;
            eazeVar11.a |= 8;
            eazk bZ12 = eazl.e.bZ();
            int g4 = this.d.e.g();
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            eazl eazlVar7 = (eazl) bZ12.b;
            int i14 = g4 - 1;
            if (g4 == 0) {
                throw null;
            }
            eazlVar7.b = i14;
            eazlVar7.a |= 1;
            eazl eazlVar8 = (eazl) bZ12.b;
            eazlVar8.c = 1;
            int i15 = eazlVar8.a | 2;
            eazlVar8.a = i15;
            int i16 = this.b.a;
            eazlVar8.a = 4 | i15;
            eazlVar8.d = i16;
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            eaze eazeVar12 = (eaze) bZ10.b;
            eazl bK8 = bZ12.bK();
            bK8.getClass();
            eazeVar12.c = bK8;
            eazeVar12.a |= 2;
            cxqoVar4.b(bZ10.bK());
            return;
        }
        throw null;
    }
}
