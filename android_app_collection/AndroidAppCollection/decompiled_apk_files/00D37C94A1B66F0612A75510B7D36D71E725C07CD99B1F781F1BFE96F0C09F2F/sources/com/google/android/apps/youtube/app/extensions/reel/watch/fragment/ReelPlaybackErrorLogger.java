package com.google.android.apps.youtube.app.extensions.reel.watch.fragment;

import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPlaybackErrorLogger implements f, ynl {
    private final airr a;
    private final acrr b;
    private final aeov c;
    private final yni d;
    private final airw e;
    private final aypf f = new aypf();
    private String g;
    private String h;
    private final aacz i;

    public ReelPlaybackErrorLogger(airr airrVar, acrr acrrVar, aeov aeovVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.a = airrVar;
        this.b = acrrVar;
        this.c = aeovVar;
        this.d = yniVar;
        this.e = airwVar;
        this.i = aaczVar;
    }

    public final void g(ahhw ahhwVar) {
        aika aikaVar = aika.NEW;
        afte afteVar = afte.NATIVE_MEDIA_PLAYER;
        if (ahhwVar.c().ordinal() != 7) {
            return;
        }
        this.h = ahhwVar.b().B();
        this.g = ahhwVar.e();
    }

    public final void h(int i) {
        String str = this.h;
        i((str == null || this.g == null || !str.equals(this.a.q())) ? "" : this.g, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r6, int r7) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger.i(java.lang.String, int):void");
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        if (eog.aq(this.i)) {
            this.f.d(this.e.G().b.aa(new ayqb() { // from class: ial
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    ReelPlaybackErrorLogger.this.g((ahhw) obj);
                }
            }, fzc.u));
        } else {
            this.d.g(this);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                g((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        if (eog.aq(this.i)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
