package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.u;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EmbedFragmentServiceFactoryService extends IEmbedFragmentServiceFactoryService.Stub {
    public final Handler a;
    public final oqi b;
    public final ooh c;

    public EmbedFragmentServiceFactoryService(Handler handler, oqi oqiVar, ooh oohVar) {
        handler.getClass();
        this.a = handler;
        oqiVar.getClass();
        this.b = oqiVar;
        this.c = oohVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
    public final IEmbedFragmentService a(final u uVar, final int i) {
        uVar.getClass();
        ylr.b();
        final ConditionVariable conditionVariable = new ConditionVariable();
        final AtomicReference atomicReference = new AtomicReference();
        this.a.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentServiceFactoryService.1
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentServiceFactoryService embedFragmentServiceFactoryService = EmbedFragmentServiceFactoryService.this;
                final EmbedFragmentService embedFragmentService = new EmbedFragmentService(embedFragmentServiceFactoryService.a, uVar, embedFragmentServiceFactoryService.c, embedFragmentServiceFactoryService.b, i);
                embedFragmentService.q = new aafo() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda4
                    @Override // defpackage.aafo
                    public final /* synthetic */ void a(apzg apzgVar) {
                        aafn.a(this, apzgVar);
                    }

                    @Override // defpackage.aafo
                    public final /* synthetic */ void b(List list) {
                        aafn.b(this, list);
                    }

                    @Override // defpackage.aafo
                    public final void c(apzg apzgVar, Map map) {
                        u uVar2 = EmbedFragmentService.this.d;
                        if (uVar2 == null) {
                            return;
                        }
                        try {
                            uVar2.g(new CommandWrapper(apzgVar));
                        } catch (RemoteException unused) {
                        }
                    }

                    @Override // defpackage.aafo
                    public final /* synthetic */ void d(List list, Map map) {
                        aafn.c(this, list, map);
                    }

                    @Override // defpackage.aafo
                    public final /* synthetic */ void e(List list, Object obj) {
                        aafn.d(this, list, obj);
                    }
                };
                embedFragmentService.g = new b(embedFragmentService.q, embedFragmentService.c);
                embedFragmentService.i = embedFragmentService.a.e().a(embedFragmentService.q);
                embedFragmentService.k = embedFragmentService.a.f().a(embedFragmentService.q);
                embedFragmentService.m = embedFragmentService.a.g().a(embedFragmentService.q);
                embedFragmentService.h = embedFragmentService.g;
                embedFragmentService.j = embedFragmentService.i;
                embedFragmentService.l = embedFragmentService.k;
                embedFragmentService.n = embedFragmentService.m;
                embedFragmentService.b.a(embedFragmentService);
                try {
                    u uVar2 = embedFragmentService.d;
                    if (uVar2 != null) {
                        uVar2.asBinder().linkToDeath(embedFragmentService, 0);
                    }
                } catch (RemoteException unused) {
                    embedFragmentService.i();
                }
                atomicReference.set(embedFragmentService);
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        return (IEmbedFragmentService) atomicReference.get();
    }
}
