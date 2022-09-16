package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agtr  reason: default package */
/* loaded from: classes.dex */
public final class agtr implements aikx, aikp {
    public final aimn a;
    public final ailf b;
    public final aimr c;
    private final zey d;
    private final aiko e;
    private final aimd f;
    private final agub g;
    private final aguk h;
    private final aadd i;
    private final ankx j;
    private final agpt k;
    private final ahdn l;
    private final agvq m;
    private final aiix n;

    public agtr(zey zeyVar, ailf ailfVar, aimr aimrVar, aimn aimnVar, aiko aikoVar, aimd aimdVar, agub agubVar, aadd aaddVar, agpt agptVar, ahdn ahdnVar, agvq agvqVar, aiix aiixVar, aguk agukVar, ankx ankxVar) {
        this.d = zeyVar;
        this.a = aimnVar;
        this.e = aikoVar;
        this.b = ailfVar;
        this.c = aimrVar;
        this.f = aimdVar;
        this.g = agubVar;
        this.h = agukVar;
        this.i = aaddVar;
        this.j = ankxVar;
        this.k = agptVar;
        this.l = ahdnVar;
        this.m = agvqVar;
        this.n = aiixVar;
    }

    private final long h() {
        auaf auafVar = this.i.a().j;
        if (auafVar == null) {
            auafVar = auaf.a;
        }
        if ((auafVar.b & 524288) != 0) {
            return auafVar.j;
        }
        return 1000L;
    }

    private final aimc i(final PlaybackStartDescriptor playbackStartDescriptor, final aijp aijpVar, String str, boolean z) {
        return aimd.a(playbackStartDescriptor, aijpVar, this.i, str, new agtp(this, aijpVar, 3), new ampg() { // from class: agto
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                agtr agtrVar = agtr.this;
                PlaybackStartDescriptor playbackStartDescriptor2 = (PlaybackStartDescriptor) obj;
                return agtrVar.c.b(playbackStartDescriptor, aijpVar);
            }
        }, z, this.j);
    }

    private static ankt j(ankt anktVar, int i) {
        return anii.h(anktVar, new fgn(i, 9), anjk.a);
    }

    private final ankt k(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aijp aijpVar) {
        this.b.d(playbackStartDescriptor, i);
        return this.b.b(playbackStartDescriptor, str, i, null, true, aijpVar);
    }

    private final boolean l(PlaybackStartDescriptor playbackStartDescriptor) {
        if (this.l.c()) {
            auaf auafVar = this.i.a().j;
            if (auafVar == null) {
                auafVar = auaf.a;
            }
            return auafVar.i && this.m.b().a(playbackStartDescriptor);
        }
        return false;
    }

    @Override // defpackage.aikx
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar, boolean z) {
        final aijp aijpVar2;
        aimc a;
        aynx a2;
        if (!playbackStartDescriptor.t() || !playbackStartDescriptor.t()) {
            if (!this.n.l(playbackStartDescriptor) || this.b.f(playbackStartDescriptor)) {
                aijpVar2 = aijpVar;
                a = aimd.a(playbackStartDescriptor, aijpVar, this.i, str, new agtq(this, z), new agtp(this, aijpVar2), z, this.j);
            } else {
                aaqk b = this.a.b(playbackStartDescriptor, str, aijpVar);
                aimd aimdVar = this.f;
                if (this.n.m()) {
                    a2 = (aynx) this.e.a(b.l(), new agtm(this, b, playbackStartDescriptor, str, aijpVar));
                } else {
                    a2 = this.a.a(b, playbackStartDescriptor, str, aijpVar);
                }
                aijpVar2 = aijpVar;
                a = aimdVar.b(playbackStartDescriptor, aijpVar, str, a2, new agtp(this, aijpVar, 2), new agtp(this, aijpVar, 1), z);
            }
            return Pair.create(a.b(), (ankt) a.a().d(new amqo() { // from class: agtl
                @Override // defpackage.amqo
                public final Object get() {
                    return agtr.this.f(playbackStartDescriptor, aijpVar2);
                }
            }));
        }
        return new Pair(this.g.a(playbackStartDescriptor), this.h.b(playbackStartDescriptor, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r2 != 3) goto L12;
     */
    @Override // defpackage.aikx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt b(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r15, java.lang.String r16, int r17, defpackage.aijp r18) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            int r2 = r15.A()
            boolean r3 = r15.t()
            if (r3 != 0) goto L66
            r3 = 5
            if (r2 != r3) goto L10
            goto L66
        L10:
            r3 = 4
            if (r2 != r3) goto L23
            ahdn r2 = r0.l
            boolean r2 = r2.c()
            if (r2 != 0) goto L1c
            goto L26
        L1c:
            agub r2 = r0.g
            ankt r1 = r2.a(r15)
            return r1
        L23:
            r3 = 3
            if (r2 == r3) goto L32
        L26:
            boolean r2 = r14.l(r15)
            if (r2 == 0) goto L2d
            goto L32
        L2d:
            ankt r1 = r14.k(r15, r16, r17, r18)
            return r1
        L32:
            agub r2 = r0.g
            ankt r2 = r2.b(r15)
            r3 = 2
            ankt r6 = j(r2, r3)
            ankt r1 = r14.k(r15, r16, r17, r18)
            r2 = 1
            ankt r5 = j(r1, r2)
            long r7 = r14.h()
            java.lang.Class<cff> r1 = defpackage.cff.class
            java.lang.Class<java.lang.NullPointerException> r2 = java.lang.NullPointerException.class
            java.lang.Class<agop> r3 = defpackage.agop.class
            java.lang.Class<agos> r4 = defpackage.agos.class
            java.lang.Class<android.database.sqlite.SQLiteException> r9 = android.database.sqlite.SQLiteException.class
            amvn r9 = defpackage.amvn.v(r1, r2, r3, r4, r9)
            ankx r10 = r0.j
            agpt r11 = r0.k
            zto r12 = defpackage.zto.l
            r13 = 2
            r4 = r16
            ankt r1 = defpackage.agtj.c(r4, r5, r6, r7, r9, r10, r11, r12, r13)
            return r1
        L66:
            agub r2 = r0.g
            ankt r1 = r2.b(r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtr.b(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, java.lang.String, int, aijp):ankt");
    }

    @Override // defpackage.aikx
    public final ankt c(PlaybackStartDescriptor playbackStartDescriptor) {
        return f(playbackStartDescriptor, aijp.a);
    }

    @Override // defpackage.aikx
    public final ankt d(String str, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, boolean z) {
        return aimd.a(playbackStartDescriptor, aijpVar, this.i, str, new agtq(this, z, 1), new ampg() { // from class: agtn
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return agtr.this.c((PlaybackStartDescriptor) obj);
            }
        }, z, this.j).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt e(defpackage.aimb r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = r11.c
            com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r1 = r11.a
            aijp r11 = r11.b
            int r2 = r1.A()
            boolean r3 = r1.t()
            if (r3 != 0) goto L70
            r3 = 5
            if (r2 != r3) goto L14
            goto L70
        L14:
            r3 = 4
            if (r2 != r3) goto L27
            ahdn r2 = r10.l
            boolean r2 = r2.c()
            if (r2 != 0) goto L20
            goto L2a
        L20:
            agub r11 = r10.g
            ankt r11 = r11.a(r1)
            return r11
        L27:
            r3 = 3
            if (r2 == r3) goto L3a
        L2a:
            boolean r2 = r10.l(r1)
            if (r2 == 0) goto L31
            goto L3a
        L31:
            aimc r11 = r10.i(r1, r11, r0, r12)
            ankt r11 = r11.b()
            return r11
        L3a:
            agub r2 = r10.g
            ankt r2 = r2.a(r1)
            r3 = 2
            ankt r2 = j(r2, r3)
            aimc r11 = r10.i(r1, r11, r0, r12)
            ankt r11 = r11.b()
            r12 = 1
            ankt r1 = j(r11, r12)
            long r3 = r10.h()
            java.lang.Class<cff> r11 = defpackage.cff.class
            java.lang.Class<java.lang.NullPointerException> r12 = java.lang.NullPointerException.class
            java.lang.Class<agop> r5 = defpackage.agop.class
            java.lang.Class<agos> r6 = defpackage.agos.class
            java.lang.Class<android.database.sqlite.SQLiteException> r7 = android.database.sqlite.SQLiteException.class
            amvn r5 = defpackage.amvn.v(r11, r12, r5, r6, r7)
            ankx r6 = r10.j
            agpt r7 = r10.k
            zto r8 = defpackage.zto.l
            r9 = 2
            ankt r11 = defpackage.agtj.c(r0, r1, r2, r3, r5, r6, r7, r8, r9)
            return r11
        L70:
            agub r11 = r10.g
            ankt r11 = r11.a(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtr.e(aimb, boolean):ankt");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r11.m.c().a(r12) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt f(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r12, defpackage.aijp r13) {
        /*
            r11 = this;
            boolean r0 = r12.t()
            if (r0 != 0) goto L76
            boolean r0 = r12.t()
            if (r0 != 0) goto L38
            ahdn r0 = r11.l
            boolean r0 = r0.c()
            if (r0 == 0) goto L31
            aadd r0 = r11.i
            arhd r0 = r0.a()
            atqv r0 = r0.g
            if (r0 != 0) goto L20
            atqv r0 = defpackage.atqv.a
        L20:
            boolean r0 = r0.k
            if (r0 == 0) goto L31
            agvq r0 = r11.m
            ampt r0 = r0.c()
            boolean r0 = r0.a(r12)
            if (r0 == 0) goto L31
            goto L38
        L31:
            aimr r0 = r11.c
            ankt r12 = r0.b(r12, r13)
            return r12
        L38:
            aguk r13 = r11.h
            r0 = 0
            ankt r3 = r13.b(r12, r0)
            aimr r13 = r11.c
            ankt r2 = r13.a(r12)
            aadd r12 = r11.i
            arhd r12 = r12.a()
            atqv r12 = r12.g
            if (r12 != 0) goto L51
            atqv r12 = defpackage.atqv.a
        L51:
            int r13 = r12.b
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r13 = r13 & r0
            if (r13 == 0) goto L5c
            int r12 = r12.l
            long r12 = (long) r12
            goto L5e
        L5c:
            r12 = 1000(0x3e8, double:4.94E-321)
        L5e:
            r4 = r12
            r1 = 0
            java.lang.Class<cff> r12 = defpackage.cff.class
            java.lang.Class<java.lang.NullPointerException> r13 = java.lang.NullPointerException.class
            java.lang.Class<android.database.sqlite.SQLiteException> r0 = android.database.sqlite.SQLiteException.class
            amvn r6 = defpackage.amvn.t(r12, r13, r0)
            ankx r7 = r11.j
            agpt r8 = r11.k
            zto r9 = defpackage.zto.m
            r10 = 3
            ankt r12 = defpackage.agtj.c(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r12
        L76:
            aguk r13 = r11.h
            r0 = 1
            ankt r12 = r13.b(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtr.f(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, aijp):ankt");
    }

    @Override // defpackage.aikp
    public final void g(PlaybackStartDescriptor playbackStartDescriptor, String str, Executor executor, aijp aijpVar) {
        if (this.n.l(playbackStartDescriptor)) {
            if (!this.n.m()) {
                return;
            }
            String h = playbackStartDescriptor.h(this.d);
            aaqk b = this.a.b(playbackStartDescriptor, h, aijpVar);
            this.e.b(b.l(), new agtm(this, b, playbackStartDescriptor, h, aijpVar, 1), executor);
            return;
        }
        this.b.e(playbackStartDescriptor, str, executor, aijpVar);
    }
}
