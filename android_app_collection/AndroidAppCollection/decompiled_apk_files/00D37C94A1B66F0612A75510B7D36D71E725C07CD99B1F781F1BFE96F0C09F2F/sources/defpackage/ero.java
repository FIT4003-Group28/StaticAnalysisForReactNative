package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ero  reason: default package */
/* loaded from: classes3.dex */
public final class ero implements aafl {
    public final akfb a;

    public ero(akfb akfbVar) {
        this.a = akfbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        akaf akafVar = (akaf) zew.K(map, "sectionListController", akaf.class);
        if (akafVar == null) {
            return;
        }
        final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint = (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint) apzgVar.qm(ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.scrollToSectionEndpoint);
        Runnable runnable = (scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.b & 2) != 0 ? new Runnable() { // from class: ern
            @Override // java.lang.Runnable
            public final void run() {
                ero eroVar = ero.this;
                ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint2 = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
                akfb akfbVar = eroVar.a;
                String str = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint2.d;
                akfbVar.a();
                akfa akfaVar = (akfa) akfbVar.d.get(str);
                if (akfaVar == null) {
                    return;
                }
                View view = (View) akfaVar.d.get();
                argj argjVar = (argj) akfaVar.a.get();
                acti actiVar = (acti) akfaVar.b.get();
                akev akevVar = (akev) akfaVar.c.get();
                if (view != null && argjVar != null && view.isShown() && view.isAttachedToWindow()) {
                    akfbVar.e(argjVar, view, null, actiVar, akfbVar.b, true, akevVar);
                } else {
                    akfbVar.d.remove(str);
                }
            }
        } : null;
        if (akafVar.ln(scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.c, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.e, runnable) || runnable == null) {
            return;
        }
        runnable.run();
    }
}
