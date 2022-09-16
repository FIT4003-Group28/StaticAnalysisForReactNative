package defpackage;

import android.os.Handler;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aanm  reason: default package */
/* loaded from: classes.dex */
public final class aanm extends pco {
    public Handler o;
    public afde p;

    public aanm(String str, pca pcaVar, pcb pcbVar, int i) {
        super(str, pcaVar, pcbVar, i);
    }

    @Override // defpackage.pco, defpackage.pbv
    public final void n(pbx pbxVar) {
        super.n(pbxVar);
        Handler handler = this.o;
        if (handler == null || this.p == null) {
            return;
        }
        handler.post(new qvl(7));
    }

    @Override // defpackage.pco, defpackage.pbv
    public final void o(pbx pbxVar, final IOException iOException) {
        super.o(pbxVar, iOException);
        Handler handler = this.o;
        if (handler == null || this.p == null) {
            return;
        }
        handler.post(new Runnable() { // from class: aanl
            @Override // java.lang.Runnable
            public final void run() {
                aanm aanmVar = aanm.this;
                IOException iOException2 = iOException;
                afde afdeVar = aanmVar.p;
                if (afdeVar != null) {
                    afdv afdvVar = afdeVar.a;
                    afdvVar.f.g(afdvVar.l.a(iOException2, afdvVar.g(), afdeVar.a.b, afkl.DEFAULT, afdeVar.a.t));
                }
            }
        });
    }
}
