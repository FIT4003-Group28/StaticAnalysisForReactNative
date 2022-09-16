package defpackage;

import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgpr  reason: default package */
/* loaded from: classes3.dex */
final class bgpr implements apuo {
    final /* synthetic */ bgpt a;

    public bgpr(bgpt bgptVar) {
        this.a = bgptVar;
    }

    private final void d() {
        cqkx.p(this.a);
        this.a.g.a();
        this.a.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (defpackage.dcbg.b(r1.c).p(new defpackage.bgpo(r13)) != false) goto L17;
     */
    @Override // defpackage.apuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final defpackage.dipk r13) {
        /*
            r12 = this;
            bgpt r0 = r12.a
            ilo r1 = r0.o
            if (r1 == 0) goto L6d
            dvyw r1 = r1.h()
            if (r1 == 0) goto L6d
            ilo r1 = r0.o
            if (r1 != 0) goto L11
            goto L2d
        L11:
            dvyw r1 = r1.h()
            dipo r1 = r1.bb
            if (r1 != 0) goto L1b
            dipo r1 = defpackage.dipo.e
        L1b:
            dsrj<dipk> r1 = r1.c
            dcbg r1 = defpackage.dcbg.b(r1)
            bgpo r2 = new bgpo
            r2.<init>(r13)
            boolean r1 = r1.p(r2)
            if (r1 == 0) goto L2d
            goto L6d
        L2d:
            bgow r2 = r0.h
            apnq r6 = r0.i
            java.util.HashSet<bgqj> r7 = r0.t
            bgez r8 = r0.n
            defpackage.dbsk.s(r8)
            ilo r9 = r0.o
            defpackage.dbsk.s(r9)
            bgnk r10 = r0.q
            defpackage.dbsk.s(r10)
            bgnr r11 = r0.j
            r4 = 0
            r5 = 0
            r3 = r13
            bgov r13 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.List<bgns> r1 = r0.f
            r2 = 0
            r1.add(r2, r13)
            r13 = 1
        L52:
            java.util.List<bgns> r1 = r0.f
            int r1 = r1.size()
            if (r13 >= r1) goto L6d
            java.util.List<bgns> r1 = r0.f
            java.lang.Object r1 = r1.get(r13)
            bgov r1 = (defpackage.bgov) r1
            r1.s(r13)
            java.util.List<bgns> r2 = r0.f
            r2.set(r13, r1)
            int r13 = r13 + 1
            goto L52
        L6d:
            r12.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgpr.a(dipk):void");
    }

    @Override // defpackage.apuo
    public final void b(long j) {
        List<bgns> list;
        bgpt bgptVar = this.a;
        if (!bgptVar.f.isEmpty()) {
            int i = -1;
            for (int i2 = 0; i2 < bgptVar.f.size(); i2++) {
                bgov bgovVar = (bgov) bgptVar.f.get(i2);
                if (bgovVar.t() == j) {
                    i = i2;
                } else if (i >= 0 && i2 > i) {
                    int i3 = i2 - 1;
                    bgovVar.s(i3);
                    bgptVar.f.set(i3, bgovVar);
                }
            }
            if (i >= 0) {
                bgptVar.f.remove(list.size() - 1);
            }
        }
        d();
    }

    @Override // defpackage.apuo
    public final void c(dipk dipkVar) {
        bgpt bgptVar = this.a;
        int i = 0;
        while (true) {
            if (i >= bgptVar.f.size()) {
                break;
            } else if (((bgov) bgptVar.f.get(i)).t() == dipkVar.d) {
                bgow bgowVar = bgptVar.h;
                apnq apnqVar = bgptVar.i;
                HashSet<bgqj> hashSet = bgptVar.t;
                bgez bgezVar = bgptVar.n;
                dbsk.s(bgezVar);
                ilo iloVar = bgptVar.o;
                dbsk.s(iloVar);
                bgnk bgnkVar = bgptVar.q;
                dbsk.s(bgnkVar);
                bgptVar.f.set(i, bgowVar.a(dipkVar, false, i, apnqVar, hashSet, bgezVar, iloVar, bgnkVar, bgptVar.j));
                break;
            } else {
                i++;
            }
        }
        d();
    }
}
