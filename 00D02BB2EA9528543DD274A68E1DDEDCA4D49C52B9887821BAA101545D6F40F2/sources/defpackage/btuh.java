package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: btuh  reason: default package */
/* loaded from: classes4.dex */
public final class btuh implements btuw {
    private static final dcqe b = dcqe.c("btuh");
    public volatile boolean a;

    public btuh(btxc btxcVar, final ckcw ckcwVar) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.a = false;
        btxcVar.a().d(new crzp(this, ckcwVar) { // from class: btuf
            private final btuh a;
            private final ckcw b;

            {
                this.a = this;
                this.b = ckcwVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                btuh btuhVar = this.a;
                ckcw ckcwVar2 = this.b;
                btvo btvoVar = (btvo) crzmVar.l();
                if (btvoVar == null) {
                    return;
                }
                boolean z = false;
                if (btvoVar.getZeroRatingParameters().d && new Random().nextInt(100) < btvoVar.getZeroRatingParameters().e) {
                    z = true;
                }
                if (btuhVar.a == z) {
                    return;
                }
                btuhVar.a = z;
                ckcwVar2.b(ckgx.NETWORK_TYPE, new btug(btuhVar));
            }
        }, newSingleThreadExecutor);
    }

    @Override // defpackage.btuw
    public final URL a() {
        String str = true != this.a ? "https://clients4.google.com/glm/mmap" : "https://mobilemaps.googleapis.com/glm/mmap";
        if (!str.startsWith("https:")) {
            bvoo.h("Gmm server url should start with https.", new Object[0]);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
