package defpackage;

import android.os.Handler;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: afao  reason: default package */
/* loaded from: classes.dex */
public final class afao implements afbd {
    public final afal a;
    final afai b;
    public final afbi c;
    public final Object d = new Object();
    public final afan e;
    public final Handler f;
    public final EnumSet g;
    public afae h;
    public final afbf i;
    private final afmw j;

    public afao(afbi afbiVar, afan afanVar, pht phtVar, pnp pnpVar, afmw afmwVar, Handler handler, Handler handler2) {
        this.c = afbiVar;
        this.e = afanVar;
        this.j = afmwVar;
        this.f = handler;
        axf axfVar = new axf(false, afbiVar.a().h() * 1024);
        long j = afbiVar.f * 1000;
        afal afalVar = new afal(axfVar, phtVar.c(), pnpVar, new pnj(), j);
        this.a = afalVar;
        afbf afbfVar = new afbf(this, afalVar, handler2, j);
        this.i = afbfVar;
        afbfVar.w(phk.c(afbiVar.b().d), afbiVar);
        this.b = new afai(afalVar);
        this.g = EnumSet.noneOf(orl.class);
        b();
        e(d());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[Catch: all -> 0x00db, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0016, B:10:0x001e, B:12:0x0035, B:14:0x003d, B:16:0x006a, B:18:0x0074, B:22:0x007b, B:24:0x0090, B:26:0x0098, B:27:0x00d4, B:28:0x00d9), top: B:33:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.afae d() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.d
            monitor-enter(r0)
            afbi r1 = r12.c     // Catch: java.lang.Throwable -> Ldb
            aegu r1 = r1.c()     // Catch: java.lang.Throwable -> Ldb
            java.util.EnumSet r2 = r12.g     // Catch: java.lang.Throwable -> Ldb
            orl r3 = defpackage.orl.TRACK_TYPE_AUDIO     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> Ldb
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L69
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r2 = r1.b     // Catch: java.lang.Throwable -> Ldb
            int r2 = r2.length     // Catch: java.lang.Throwable -> Ldb
            if (r2 <= 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            defpackage.afms.d(r2)     // Catch: java.lang.Throwable -> Ldb
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r2 = r1.b     // Catch: java.lang.Throwable -> Ldb
            r2 = r2[r4]     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r2.t()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = r1.c()     // Catch: java.lang.Throwable -> Ldb
            afbi r7 = r12.c     // Catch: java.lang.Throwable -> Ldb
            aflj r7 = r7.o     // Catch: java.lang.Throwable -> Ldb
            int r8 = r7.b     // Catch: java.lang.Throwable -> Ldb
            if (r8 == 0) goto L69
            java.util.Set r8 = r7.a     // Catch: java.lang.Throwable -> Ldb
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Ldb
            if (r8 != 0) goto L69
            java.lang.String r8 = defpackage.aanp.b(r2)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = defpackage.aanp.a(r2)     // Catch: java.lang.Throwable -> Ldb
            int r7 = r7.b     // Catch: java.lang.Throwable -> Ldb
            int r9 = defpackage.afag.e(r7)     // Catch: java.lang.Throwable -> Ldb
            pis r10 = new pis     // Catch: java.lang.Throwable -> Ldb
            r10.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r11 = "audio"
            r10.a = r11     // Catch: java.lang.Throwable -> Ldb
            r10.b = r6     // Catch: java.lang.Throwable -> Ldb
            r10.j = r8     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r8 = defpackage.pwl.d(r2)     // Catch: java.lang.Throwable -> Ldb
            r10.k = r8     // Catch: java.lang.Throwable -> Ldb
            r10.h = r2     // Catch: java.lang.Throwable -> Ldb
            com.google.android.exoplayer2.Format r2 = r10.a()     // Catch: java.lang.Throwable -> Ldb
            afad r2 = defpackage.afad.h(r7, r9, r2, r6)     // Catch: java.lang.Throwable -> Ldb
            goto L6a
        L69:
            r2 = r5
        L6a:
            java.util.EnumSet r6 = r12.g     // Catch: java.lang.Throwable -> Ldb
            orl r7 = defpackage.orl.TRACK_TYPE_VIDEO     // Catch: java.lang.Throwable -> Ldb
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> Ldb
            if (r6 == 0) goto Ld4
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r6 = r1.a     // Catch: java.lang.Throwable -> Ldb
            int r6 = r6.length     // Catch: java.lang.Throwable -> Ldb
            if (r6 <= 0) goto L7a
            goto L7b
        L7a:
            r3 = 0
        L7b:
            defpackage.afms.d(r3)     // Catch: java.lang.Throwable -> Ldb
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel[] r1 = r1.a     // Catch: java.lang.Throwable -> Ldb
            r1 = r1[r4]     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = r1.t()     // Catch: java.lang.Throwable -> Ldb
            afbi r3 = r12.c     // Catch: java.lang.Throwable -> Ldb
            aflk r3 = r3.h()     // Catch: java.lang.Throwable -> Ldb
            int r4 = r3.c     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto Ld4
            java.util.Set r4 = r3.a     // Catch: java.lang.Throwable -> Ldb
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> Ldb
            if (r4 != 0) goto Ld4
            afmw r4 = r12.j     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = defpackage.aanp.b(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = defpackage.aanp.a(r1)     // Catch: java.lang.Throwable -> Ldb
            int r3 = r3.c     // Catch: java.lang.Throwable -> Ldb
            int r7 = defpackage.afag.f(r3)     // Catch: java.lang.Throwable -> Ldb
            pis r8 = new pis     // Catch: java.lang.Throwable -> Ldb
            r8.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r9 = "video"
            r8.a = r9     // Catch: java.lang.Throwable -> Ldb
            r8.j = r6     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = defpackage.pwl.g(r1)     // Catch: java.lang.Throwable -> Ldb
            r8.k = r6     // Catch: java.lang.Throwable -> Ldb
            r8.h = r1     // Catch: java.lang.Throwable -> Ldb
            r1 = r4
            afmv r1 = (defpackage.afmv) r1     // Catch: java.lang.Throwable -> Ldb
            int r1 = r1.c     // Catch: java.lang.Throwable -> Ldb
            r8.p = r1     // Catch: java.lang.Throwable -> Ldb
            afmv r4 = (defpackage.afmv) r4     // Catch: java.lang.Throwable -> Ldb
            int r1 = r4.d     // Catch: java.lang.Throwable -> Ldb
            r8.q = r1     // Catch: java.lang.Throwable -> Ldb
            com.google.android.exoplayer2.Format r1 = r8.a()     // Catch: java.lang.Throwable -> Ldb
            afad r5 = defpackage.afad.h(r3, r7, r1, r5)     // Catch: java.lang.Throwable -> Ldb
        Ld4:
            afae r1 = new afae     // Catch: java.lang.Throwable -> Ldb
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            return r1
        Ldb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ldb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afao.d():afae");
    }

    private final void e(afae afaeVar) {
        this.h = afaeVar;
        this.c.n(afaeVar);
        this.i.t(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.c.c().a.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        boolean z;
        synchronized (this.d) {
            EnumSet clone = this.g.clone();
            this.g.clear();
            if (this.c.c().b.length > 0) {
                this.g.add(orl.TRACK_TYPE_AUDIO);
            }
            if (((afau) this.e).j && a()) {
                this.g.add(orl.TRACK_TYPE_VIDEO);
            }
            z = !this.g.equals(clone);
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        boolean z2;
        synchronized (this.d) {
            afae d = d();
            afae afaeVar = this.h;
            afad afadVar = afaeVar.b;
            z = true;
            if (!afad.g(d.b, afadVar)) {
                afadVar = d.b;
                z2 = true;
            } else {
                z2 = false;
            }
            afad afadVar2 = afaeVar.c;
            if (!afad.g(d.c, afadVar2)) {
                afadVar2 = d.c;
            } else {
                z = z2;
            }
            if (z) {
                e(new afae(afadVar, afadVar2));
            }
        }
        return z;
    }
}
