package defpackage;

import com.google.android.libraries.geophotouploader.PeriodicWorker;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cruw  reason: default package */
/* loaded from: classes5.dex */
public final class cruw {
    public final bcl a;

    public cruw(bcl bclVar) {
        this.a = bclVar;
    }

    public final void a(crwb crwbVar) {
        bbo bboVar = new bbo();
        bboVar.e("geo.uploader.gpu_config_key", datl.a(crwbVar.bS()));
        bbp a = bboVar.a();
        int i = crwbVar.e ? 3 : 2;
        bbk bbkVar = new bbk();
        bbkVar.c = i;
        bbl a2 = bbkVar.a();
        crwd crwdVar = crwbVar.g;
        if (crwdVar == null) {
            crwdVar = crwd.f;
        }
        boolean z = crwdVar.e;
        this.a.f("geo.uploader.periodic_check", 1, new bch(PeriodicWorker.class, crwbVar.q, TimeUnit.SECONDS, crwbVar.r, TimeUnit.SECONDS).d("geo.uploader.periodic_check").b(a2).c(a).f());
        int i2 = crwbVar.q;
    }
}
