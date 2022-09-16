package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
/* compiled from: PG */
/* renamed from: adms  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adms implements ayqb {
    public final /* synthetic */ admv a;
    private final /* synthetic */ int b;

    public /* synthetic */ adms(admv admvVar, int i, byte[] bArr) {
        this.b = i;
        this.a = admvVar;
    }

    public /* synthetic */ adms(admv admvVar, byte[] bArr) {
        this.a = admvVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        boolean z = true;
        boolean z2 = false;
        if (i == 0) {
            final admv admvVar = this.a;
            ahgn ahgnVar = (ahgn) obj;
            boolean z3 = ahgnVar.c() == aijs.FULLSCREEN;
            admw admwVar = admvVar.a;
            if (ahgnVar.d() != aijs.REMOTE) {
                z = false;
            }
            admwVar.i = z;
            adii b = admvVar.a.g.b();
            if (ahgnVar.c() == aijs.MINIMIZED) {
                b.m(adij.BROWSE);
            } else if (z3) {
                b.m(adij.WATCH);
            } else if (ahgnVar.c() == aijs.DEFAULT) {
                if (ahgnVar.b() < 0 || ahgnVar.a() < 0) {
                    b.m(adij.BROWSE);
                } else {
                    new Handler().postDelayed(new Runnable(null) { // from class: admt
                        @Override // java.lang.Runnable
                        public final void run() {
                            admv admvVar2 = admv.this;
                            if (admvVar2.a.b.q() == null || admvVar2.a.g.g == adij.WATCH) {
                                return;
                            }
                            adii b2 = admvVar2.a.g.b();
                            b2.m(adij.WATCH);
                            admvVar2.a.h.c(b2.a());
                        }
                    }, 100L);
                }
            }
            b.h(z3);
            if (admvVar.a.i) {
                b.p(0);
            }
            b.f(admvVar.a.e.c());
            admvVar.a.h.c(b.a());
        } else if (i != 1) {
            admv admvVar2 = this.a;
            ahhw ahhwVar = (ahhw) obj;
            if (!ahhwVar.c().a(aika.NEW, aika.PLAYBACK_LOADED)) {
                return;
            }
            adii b2 = admvVar2.a.g.b();
            if (ahhwVar.c() == aika.NEW) {
                b2.i(false);
                b2.o(false);
                b2.n(false);
                b2.q(false);
            } else {
                b2.m(adij.WATCH);
                b2.g(ahhwVar.b().a());
                b2.a = ahhwVar.b().B();
                admw admwVar2 = admvVar2.a;
                if (!admwVar2.i) {
                    b2.p(admwVar2.g.n + 1);
                }
                b2.f(admvVar2.a.e.c());
            }
            admvVar2.a.h.c(b2.a());
        } else {
            admv admvVar3 = this.a;
            VideoQuality[] l = ((aesr) obj).l();
            if (l != null) {
                boolean z4 = false;
                for (VideoQuality videoQuality : l) {
                    int i2 = videoQuality.a;
                    if (i2 >= 720) {
                        z2 = true;
                        break;
                    }
                    z4 |= !(i2 < 480);
                }
                z2 = z4;
            }
            z = false;
            adii b3 = admvVar3.a.g.b();
            b3.i(z);
            b3.o(z2);
            b3.f(admvVar3.a.e.c());
            admvVar3.a.h.c(b3.a());
        }
    }
}
