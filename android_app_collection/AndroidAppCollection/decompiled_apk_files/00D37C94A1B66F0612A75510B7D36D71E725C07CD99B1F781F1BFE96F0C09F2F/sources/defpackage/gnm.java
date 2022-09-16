package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.BackstageRepostCreationRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
import com.google.protos.youtube.api.innertube.CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnm  reason: default package */
/* loaded from: classes3.dex */
public final class gnm implements aafl {
    public static final /* synthetic */ int a = 0;
    private final azqb b;
    private final airr c;
    private final /* synthetic */ int d;

    public gnm(azqb azqbVar, airr airrVar, int i) {
        this.d = i;
        azqbVar.getClass();
        this.b = azqbVar;
        airrVar.getClass();
        this.c = airrVar;
    }

    public gnm(azqb azqbVar, airr airrVar) {
        azqbVar.getClass();
        this.b = azqbVar;
        airrVar.getClass();
        this.c = airrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apli apliVar = null;
        if (this.d == 0) {
            aunb aunbVar = (apzgVar.qn(CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.createBackstageRepostCommand) ? (CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand) apzgVar.qm(CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.createBackstageRepostCommand) : null).b;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aplp aplpVar = aunbVar.qn(BackstageRepostCreationRendererOuterClass.backstageRepostCreationRenderer) ? (aplp) aunbVar.qm(BackstageRepostCreationRendererOuterClass.backstageRepostCreationRenderer) : null;
            if (aplpVar == null) {
                zep.b("Executed createBackstageRepostCommand with no BackstageRepostCreationRenderer.");
                return;
            }
            if (this.c.d()) {
                this.c.a();
            }
            final xmc xmcVar = (xmc) zew.K(map, "com.google.android.libraries.youtube.comment.comment_thread_created_callback", xmc.class);
            xmc xmcVar2 = new xmc() { // from class: gnl
                @Override // defpackage.xmc
                public final void a(Object obj, boolean z) {
                    xmc xmcVar3 = xmc.this;
                    int i = gnm.a;
                    if (xmcVar3 != null) {
                        xmcVar3.a(obj, false);
                    }
                }
            };
            xkm xkmVar = (xkm) this.b.get();
            aunb aunbVar2 = aplpVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if ((((apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer)).b & 8192) == 0) {
                zep.b("Command for repost button is missing in BackstageRepostCreationRenderer");
                return;
            }
            ex l = xkmVar.a.getSupportFragmentManager().l();
            dp f = xkmVar.a.getSupportFragmentManager().f("backstage_repost_fragment");
            if (f != null) {
                l.m(f);
            }
            l.s();
            xkmVar.d = null;
            xxs xxsVar = xkmVar.e;
            xvj xvjVar = new xvj();
            Bundle bundle = new Bundle();
            aphq.m(bundle, "renderer", aplpVar);
            xvjVar.ae(bundle);
            xkmVar.d = xvjVar;
            xkl xklVar = xkmVar.c;
            xklVar.b = xmcVar2;
            xvk xvkVar = xkmVar.d;
            xklVar.c = xvkVar;
            ((xvj) xvkVar).aq = new xkj(xkmVar, aplpVar);
            xkmVar.d.s(l, "backstage_repost_fragment");
            return;
        }
        CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = apzgVar.qn(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint) ? (CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint) apzgVar.qm(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint) : null;
        if (createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint != null) {
            aqir aqirVar = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b;
            if (aqirVar == null) {
                aqirVar = aqir.a;
            }
            if (aqirVar.b == 118523928) {
                aqir aqirVar2 = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b;
                if (aqirVar2 == null) {
                    aqirVar2 = aqir.a;
                }
                if (aqirVar2.b == 118523928) {
                    apliVar = (apli) aqirVar2.c;
                } else {
                    apliVar = apli.a;
                }
            }
        }
        if (apliVar == null) {
            zep.b("Executed CreateBackstagePostDialogEndpoint with no BackstagePostDialogRenderer.");
            return;
        }
        if (this.c.d()) {
            this.c.a();
        }
        final Runnable runnable = (Runnable) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", Runnable.class);
        final xmc xmcVar3 = (xmc) zew.K(map, "com.google.android.libraries.youtube.comment.comment_thread_created_callback", xmc.class);
        ((xki) this.b.get()).a(apliVar, new xmc() { // from class: gnk
            @Override // defpackage.xmc
            public final void a(Object obj, boolean z) {
                Runnable runnable2 = runnable;
                xmc xmcVar4 = xmcVar3;
                int i = gnm.a;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (xmcVar4 != null) {
                    xmcVar4.a(obj, false);
                }
            }
        });
    }
}
