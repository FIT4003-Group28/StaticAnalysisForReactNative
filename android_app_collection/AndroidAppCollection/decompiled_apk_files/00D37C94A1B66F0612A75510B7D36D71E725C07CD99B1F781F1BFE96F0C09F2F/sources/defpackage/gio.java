package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gio  reason: default package */
/* loaded from: classes3.dex */
public final class gio implements aafl, eoy {
    private final Context a;
    private final gbh b;
    private final gbv c;
    private final yni d;
    private final afvn e;
    private final fcl f;
    private final ipn g;
    private final ind h;
    private final isd i;
    private final azqb j;
    private final aacz k;
    private final sdb l;

    public gio(Context context, gbh gbhVar, yni yniVar, afvn afvnVar, sdb sdbVar, fcl fclVar, ipn ipnVar, ind indVar, azqb azqbVar, gbv gbvVar, aacz aaczVar, isd isdVar, byte[] bArr) {
        this.a = context;
        gbhVar.getClass();
        this.b = gbhVar;
        yniVar.getClass();
        this.d = yniVar;
        afvnVar.getClass();
        this.e = afvnVar;
        this.l = sdbVar;
        this.f = fclVar;
        this.g = ipnVar;
        this.h = indVar;
        this.i = isdVar;
        this.j = azqbVar;
        this.c = gbvVar;
        this.k = aaczVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        PaneDescriptor a;
        awhd awhdVar;
        int p = akzj.p(((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).k);
        boolean z = true;
        if (p == 0) {
            p = 1;
        }
        if (p == 5) {
            giq giqVar = (giq) this.j.get();
            aatf f = giqVar.b.f();
            aopa mo52toBuilder = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).mo52toBuilder();
            f.t(((apnv) mo52toBuilder.instance).c);
            f.v(((apnv) mo52toBuilder.instance).d);
            f.j(apzgVar.c);
            if ((((apnv) mo52toBuilder.instance).b & 64) != 0) {
                aopa createBuilder = arln.a.createBuilder();
                apny apnyVar = ((apnv) mo52toBuilder.instance).h;
                if (apnyVar == null) {
                    apnyVar = apny.a;
                }
                createBuilder.af(apnyVar.d);
                apny apnyVar2 = ((apnv) mo52toBuilder.instance).h;
                if (apnyVar2 == null) {
                    apnyVar2 = apny.a;
                }
                if (apnyVar2.b == 328644166) {
                    awhdVar = (awhd) apnyVar2.c;
                } else {
                    awhdVar = awhd.a;
                }
                createBuilder.copyOnWrite();
                arln arlnVar = (arln) createBuilder.instance;
                awhdVar.getClass();
                arlnVar.c = awhdVar;
                arlnVar.b = 328644166;
                f.t = (arln) createBuilder.mo39build();
                mo52toBuilder.copyOnWrite();
                apnv apnvVar = (apnv) mo52toBuilder.instance;
                apnvVar.h = null;
                apnvVar.b &= -65;
            }
            giqVar.f.show(giqVar.a.getFragmentManager(), yat.a);
            ylx.n(giqVar.a, giqVar.b.h(f, giqVar.g), new gip(giqVar), new gip(giqVar, 1));
            return;
        }
        this.d.d(new ewr());
        boolean z2 = (((Integer) zew.J(map, "com.google.android.apps.youtube.app.endpoint.flags", 0)).intValue() & 16) != 0;
        if (!"FElibrary".equals(((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c) || !this.e.t() || (this.l.a && !this.f.d())) {
            z = false;
        }
        if (!eog.ak(this.k)) {
            if (z && zew.m(this.a) == 4) {
                a = this.g.a(apzgVar);
            }
            if (map != null) {
            }
            a = this.h.a(apzgVar);
        } else {
            if (z) {
                a = this.i.a(apzgVar);
            }
            if (map != null || !map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
                a = this.h.a(apzgVar);
            } else {
                ajrs ajrsVar = (ajrs) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext");
                a = this.h.c(apzgVar, false, ajrsVar.j("nested_fragment_key", false), ajrsVar.j("selection_panel", false));
            }
        }
        a.b.putBoolean("pivot", z2);
        ampt amptVar = (ampt) zew.K(map, "replace_pane_predicate", ampt.class);
        if (amptVar == null && p == 2) {
            amptVar = new gaz();
        }
        a.c = amptVar;
        asxj asxjVar = this.k.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.ch && "FEnotifications_inbox".equals(((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c) && this.e.t() && (!this.l.a || this.f.d())) {
            this.c.b(PanelsConfiguration.b(PaneFragmentPanelDescriptor.b(a)));
        }
        this.b.d(a);
    }
}
