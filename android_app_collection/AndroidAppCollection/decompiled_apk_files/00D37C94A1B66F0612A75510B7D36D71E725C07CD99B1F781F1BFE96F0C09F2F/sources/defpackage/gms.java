package defpackage;

import com.google.protos.youtube.api.innertube.PreloadAppStoreCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gms  reason: default package */
/* loaded from: classes3.dex */
public final class gms implements aafl {
    private volatile boolean a = false;
    private final alsc b;

    public gms(alsc alscVar, final efz efzVar, Executor executor, final ayor ayorVar, aacz aaczVar) {
        this.b = alscVar;
        apdl n = xrz.n(aaczVar);
        if (n == null || !n.p) {
            b();
        } else {
            executor.execute(new Runnable() { // from class: gmr
                @Override // java.lang.Runnable
                public final void run() {
                    final gms gmsVar = gms.this;
                    efz efzVar2 = efzVar;
                    efzVar2.b().B(ayorVar).R(new aypv() { // from class: gmq
                        @Override // defpackage.aypv
                        public final void a() {
                            gms.this.b();
                        }
                    });
                }
            });
        }
    }

    public final void b() {
        this.a = true;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar.qn(PreloadAppStoreCommandOuterClass.preloadAppStoreCommand) && this.a) {
            augl auglVar = (augl) apzgVar.qm(PreloadAppStoreCommandOuterClass.preloadAppStoreCommand);
            alsa alsaVar = new alsa();
            if ((auglVar.b & 4) != 0) {
                alsaVar.a.add(auglVar.c);
            }
            alsc alscVar = this.b;
            alsb alsbVar = new alsb(alsaVar);
            alsf alsfVar = alscVar.a;
            if (alsfVar.b == null) {
                alsf.a.a("error: %s", "Play Store not found.");
                return;
            }
            alvg alvgVar = new alvg();
            alsfVar.b.b(new alse(alsfVar, alvgVar, alsbVar, alvgVar), alvgVar);
        }
    }
}
