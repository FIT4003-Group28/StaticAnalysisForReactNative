package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ahqb  reason: default package */
/* loaded from: classes.dex */
public final class ahqb implements ahpy, airt, ynl {
    public final ahkv a;
    private final Set b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final kdj g;

    public ahqb(kdj kdjVar, ahkv ahkvVar) {
        kdjVar.getClass();
        this.g = kdjVar;
        ahkvVar.getClass();
        this.a = ahkvVar;
        this.b = Collections.newSetFromMap(new WeakHashMap());
        kdjVar.a.a = this;
    }

    private final void d() {
        boolean z = false;
        if (this.c && this.d && !this.e) {
            z = true;
        }
        if (z) {
            this.g.a.b = this.f;
        }
        for (ahqa ahqaVar : this.b) {
            ahqaVar.oh(z);
        }
    }

    public final void a(ahqa ahqaVar) {
        this.b.add(ahqaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahgn ahgnVar) {
        this.c = ahgnVar.f();
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r4.m != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ahhw r4) {
        /*
            r3 = this;
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r0 = r0.c
            if (r0 == 0) goto L1e
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r0 = r0.c
            boolean r0 = r0.H()
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.d = r0
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            if (r0 == 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r0.c()
            boolean r0 = r0.am()
            if (r0 != 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r0.c()
            boolean r0 = r0.aD()
            if (r0 == 0) goto L45
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            r3.e = r0
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            if (r0 == 0) goto L68
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r4 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4 = r4.c()
            atzv r4 = r4.c
            int r0 = r4.c
            r0 = r0 & r1
            if (r0 == 0) goto L68
            awbw r4 = r4.v
            if (r4 != 0) goto L63
            awbw r4 = defpackage.awbw.a
        L63:
            boolean r4 = r4.m
            if (r4 == 0) goto L68
            goto L69
        L68:
            r1 = 0
        L69:
            r3.f = r1
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahqb.c(ahhw):void");
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 64L)).h(aiwv.l(1)).aa(new ahpz(this), ahqs.b), airwVar.s().b.h(aiwv.n(airwVar.aB(), 64L)).h(aiwv.l(0)).aa(new ahpz(this, 1), ahqs.b)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((ahgn) obj);
                return null;
            } else if (i == 1) {
                c((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhw.class};
    }
}
