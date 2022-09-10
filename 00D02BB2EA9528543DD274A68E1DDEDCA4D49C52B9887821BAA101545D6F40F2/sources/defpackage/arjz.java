package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: arjz  reason: default package */
/* loaded from: classes2.dex */
public final class arjz implements SharedPreferences.OnSharedPreferenceChangeListener, arla {
    public final bvjj a;
    public final z<arkz> b;
    public arkz c;
    private final arkz d;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
        if ((r4 == null ? defpackage.arkx.g : r4).b != r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public arjz(android.app.Application r9, defpackage.bvjj r10) {
        /*
            r8 = this;
            r8.<init>()
            z r0 = new z
            r0.<init>()
            r8.b = r0
            r8.a = r10
            long r1 = defpackage.bvoc.c(r9)
            arkz r9 = defpackage.arkz.g
            dsqp r9 = r9.bZ()
            arky r9 = (defpackage.arky) r9
            arkx r3 = defpackage.arkx.g
            dsqp r3 = r3.bZ()
            arkw r3 = (defpackage.arkw) r3
            boolean r4 = r3.c
            r5 = 0
            if (r4 == 0) goto L2a
            r3.bF()
            r3.c = r5
        L2a:
            MessageType extends dsqw<MessageType, BuilderType> r4 = r3.b
            arkx r4 = (defpackage.arkx) r4
            int r6 = r4.a
            r6 = r6 | 1
            r4.a = r6
            r4.b = r1
            boolean r4 = r9.c
            if (r4 == 0) goto L3f
            r9.bF()
            r9.c = r5
        L3f:
            MessageType extends dsqw<MessageType, BuilderType> r4 = r9.b
            arkz r4 = (defpackage.arkz) r4
            dsqw r3 = r3.bK()
            arkx r3 = (defpackage.arkx) r3
            r3.getClass()
            r4.b = r3
            int r3 = r4.a
            r3 = r3 | 1
            r4.a = r3
            dsqw r9 = r9.bK()
            arkz r9 = (defpackage.arkz) r9
            r8.d = r9
            bvjk r3 = defpackage.bvjk.iu
            arkz r4 = defpackage.arkz.g
            r6 = 7
            java.lang.Object r4 = r4.cu(r6)
            dssr r4 = (defpackage.dssr) r4
            dssj r3 = r10.L(r3, r4, r9)
            arkz r3 = (defpackage.arkz) r3
            arkx r4 = r3.b
            if (r4 != 0) goto L73
            arkx r4 = defpackage.arkx.g
        L73:
            int r4 = r4.a
            r4 = r4 & 1
            if (r4 == 0) goto L85
            arkx r4 = r3.b
            if (r4 != 0) goto L7f
            arkx r4 = defpackage.arkx.g
        L7f:
            long r6 = r4.b
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 == 0) goto Lc3
        L85:
            r1 = 5
            java.lang.Object r1 = r3.cu(r1)
            dsqp r1 = (defpackage.dsqp) r1
            r1.bC(r3)
            arky r1 = (defpackage.arky) r1
            arkx r9 = r9.b
            if (r9 != 0) goto L97
            arkx r9 = defpackage.arkx.g
        L97:
            boolean r2 = r1.c
            if (r2 == 0) goto La0
            r1.bF()
            r1.c = r5
        La0:
            MessageType extends dsqw<MessageType, BuilderType> r2 = r1.b
            arkz r2 = (defpackage.arkz) r2
            r9.getClass()
            r2.b = r9
            int r9 = r2.a
            r9 = r9 | 1
            r2.a = r9
            dsqw r9 = r1.bK()
            r3 = r9
            arkz r3 = (defpackage.arkz) r3
            bvjk r9 = defpackage.bvjk.iu
            boolean r9 = r10.i(r9)
            if (r9 == 0) goto Lc3
            bvjk r9 = defpackage.bvjk.iu
            r10.al(r9, r3)
        Lc3:
            r8.c = r3
            r0.f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arjz.<init>(android.app.Application, bvjj):void");
    }

    @Override // defpackage.arla
    public final arkz a() {
        return this.c;
    }

    @Override // defpackage.arla
    public final void b(arkz arkzVar) {
        arkz arkzVar2 = this.c;
        if (arkzVar2 == null || !arkzVar2.equals(arkzVar)) {
            this.c = arkzVar;
            this.a.al(bvjk.iu, arkzVar);
            this.b.f(arkzVar);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!bvjk.iu.toString().equals(str)) {
            return;
        }
        b((arkz) this.a.L(bvjk.iu, (dssr) arkz.g.cu(7), this.d));
    }
}
