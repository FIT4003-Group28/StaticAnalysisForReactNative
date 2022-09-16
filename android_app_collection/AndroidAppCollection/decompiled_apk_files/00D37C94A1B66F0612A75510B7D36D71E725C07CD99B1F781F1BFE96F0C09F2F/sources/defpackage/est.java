package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* compiled from: PG */
/* renamed from: est  reason: default package */
/* loaded from: classes3.dex */
public final class est implements yjo {
    private final String a = "FElibrary";
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final asxj e;

    public est(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, aacz aaczVar) {
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        asxj asxjVar = aaczVar.b().e;
        this.e = asxjVar == null ? asxj.a : asxjVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        arlt c;
        try {
            aath aathVar = (aath) this.b.get();
            aatf f = aathVar.f();
            f.t(this.a);
            f.b = true;
            f.i();
            if (this.e.bu) {
                f.q = ytz.LOW;
            }
            BrowseResponseModel browseResponseModel = (BrowseResponseModel) ylx.d(aathVar.h(f, anjk.a), egf.q);
            etd etdVar = (etd) this.d.get();
            browseResponseModel.getClass();
            etdVar.d().e(browseResponseModel);
            arlt arltVar = browseResponseModel.a;
            if (arltVar != null && (c = ess.c(arltVar)) != null) {
                etdVar.l(c);
            }
            arlt b = etdVar.e.b(arltVar);
            if (b != null) {
                etdVar.c().e(b);
            }
            ((afuy) this.c.get()).b();
            return 0;
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zep.d("Failed to fetch offline library browse", e);
            return 1;
        }
    }
}
