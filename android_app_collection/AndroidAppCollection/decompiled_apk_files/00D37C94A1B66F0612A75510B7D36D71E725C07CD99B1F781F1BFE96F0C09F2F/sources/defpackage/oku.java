package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: oku  reason: default package */
/* loaded from: classes3.dex */
public final class oku implements mes {
    public final snc a;
    public final axnm b;
    public final apy c;
    public int d = 0;
    private final akfb e;
    private final acth f;

    public oku(snc sncVar, akfb akfbVar, acth acthVar, axnm axnmVar, apy apyVar) {
        this.a = sncVar;
        this.e = akfbVar;
        this.f = acthVar;
        this.b = axnmVar;
        this.c = apyVar;
    }

    @Override // defpackage.mes
    public final akev a() {
        return new okt(this);
    }

    @Override // defpackage.mes
    public final void b(PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null || paneDescriptor.e() == null) {
            return;
        }
        apnv apnvVar = (apnv) paneDescriptor.e().qm(BrowseEndpointOuterClass.browseEndpoint);
        if ((apnvVar.b & 1) == 0 || !"FElibrary".equals(apnvVar.c)) {
            return;
        }
        ylx.n(this.c, ((yve) this.b.get()).b(meo.n), mbi.g, ylx.b);
    }

    @Override // defpackage.mes
    public final void c(zdt zdtVar) {
        ylx.p(this.c, ((yve) this.b.get()).a(), mbi.h, new okr(this, zdtVar, 1));
    }

    @Override // defpackage.mes
    public final void d(zdt zdtVar) {
        ylx.p(this.c, ((yve) this.b.get()).a(), mbi.i, new okr(this, zdtVar));
    }

    @Override // defpackage.mes
    public final void e() {
        this.d++;
    }

    @Override // defpackage.mes
    public final void f(View view, atjf atjfVar) {
        argj argjVar;
        if ((atjfVar.b & 1024) != 0) {
            atje atjeVar = atjfVar.h;
            if (atjeVar == null) {
                atjeVar = atje.a;
            }
            if (atjeVar.b == 102716411) {
                argjVar = (argj) atjeVar.c;
            } else {
                argjVar = argj.a;
            }
        } else {
            argjVar = null;
        }
        argj argjVar2 = argjVar;
        if (view == null || argjVar2 == null) {
            return;
        }
        this.e.c(argjVar2, view, atjfVar, this.f.oi(), new okt(this, 1));
    }

    @Override // defpackage.mes
    public final void g(meq meqVar, View view, akev akevVar) {
        this.e.c((argj) meqVar.b.get(), view, meqVar.a, this.f.oi(), akevVar);
    }
}
