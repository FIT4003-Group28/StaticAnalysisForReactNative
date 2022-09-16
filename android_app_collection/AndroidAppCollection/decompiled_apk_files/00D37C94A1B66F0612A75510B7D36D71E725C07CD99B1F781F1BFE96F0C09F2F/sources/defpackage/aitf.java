package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitf  reason: default package */
/* loaded from: classes.dex */
public final class aitf implements yiw {
    final /* synthetic */ PlayerResponseModel a;
    final /* synthetic */ aitg b;
    final /* synthetic */ PlaybackStartDescriptor c;
    final /* synthetic */ acvg d;
    final /* synthetic */ aith e;

    public aitf(aith aithVar, PlayerResponseModel playerResponseModel, aitg aitgVar, PlaybackStartDescriptor playbackStartDescriptor, acvg acvgVar) {
        this.e = aithVar;
        this.a = playerResponseModel;
        this.b = aitgVar;
        this.c = playbackStartDescriptor;
        this.d = acvgVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Could not get playability result: ");
        sb.append(valueOf);
        afus.b(2, 10, sb.toString());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r14 = (Void) obj;
        final aiot aiotVar = (aiot) obj2;
        synchronized (this.e.a) {
            aith aithVar = this.e;
            final ajah ajahVar = aithVar.a.a;
            if (ajahVar == null) {
                return;
            }
            if (!aiix.h(aithVar.d)) {
                int i = aiotVar.c - 1;
                if (i == 0) {
                    this.e.d(this.a, this.c, this.d, ajahVar);
                } else if (i != 1) {
                    aitg aitgVar = this.b;
                    if (aitgVar != null) {
                        aitgVar.f();
                    }
                } else if (!this.e.f(this.a, ajahVar, this.b)) {
                    this.e.c(this.a, aiotVar.b, ajahVar);
                }
            } else {
                int i2 = aiotVar.c - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        aitg aitgVar2 = this.b;
                        if (aitgVar2 != null) {
                            aitgVar2.f();
                        }
                    } else {
                        Executor executor = this.e.b;
                        final PlayerResponseModel playerResponseModel = this.a;
                        final aitg aitgVar3 = this.b;
                        executor.execute(new Runnable() { // from class: aitd
                            @Override // java.lang.Runnable
                            public final void run() {
                                final aitf aitfVar = aitf.this;
                                final PlayerResponseModel playerResponseModel2 = playerResponseModel;
                                final ajah ajahVar2 = ajahVar;
                                aitg aitgVar4 = aitgVar3;
                                final aiot aiotVar2 = aiotVar;
                                if (!aitfVar.e.f(playerResponseModel2, ajahVar2, aitgVar4)) {
                                    aitfVar.e.c.execute(new Runnable() { // from class: aitb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            aitf aitfVar2 = aitf.this;
                                            PlayerResponseModel playerResponseModel3 = playerResponseModel2;
                                            aiot aiotVar3 = aiotVar2;
                                            aitfVar2.e.c(playerResponseModel3, aiotVar3.b, ajahVar2);
                                        }
                                    });
                                }
                            }
                        });
                    }
                } else if (aijr.h(this.a.t())) {
                    Executor executor2 = this.e.b;
                    final PlayerResponseModel playerResponseModel2 = this.a;
                    final aitg aitgVar4 = this.b;
                    final PlaybackStartDescriptor playbackStartDescriptor = this.c;
                    final acvg acvgVar = this.d;
                    executor2.execute(new Runnable() { // from class: aitc
                        @Override // java.lang.Runnable
                        public final void run() {
                            final aitf aitfVar = aitf.this;
                            final PlayerResponseModel playerResponseModel3 = playerResponseModel2;
                            final ajah ajahVar2 = ajahVar;
                            aitg aitgVar5 = aitgVar4;
                            final PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                            final acvg acvgVar2 = acvgVar;
                            if (!aitfVar.e.f(playerResponseModel3, ajahVar2, aitgVar5)) {
                                aitfVar.e.c.execute(new Runnable() { // from class: aite
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        aitf aitfVar2 = aitf.this;
                                        ajah ajahVar3 = ajahVar2;
                                        PlayerResponseModel playerResponseModel4 = playerResponseModel3;
                                        PlaybackStartDescriptor playbackStartDescriptor3 = playbackStartDescriptor2;
                                        acvg acvgVar3 = acvgVar2;
                                        if (ajahVar3.aa()) {
                                            aitfVar2.e.d(playerResponseModel4, playbackStartDescriptor3, acvgVar3, ajahVar3);
                                        }
                                    }
                                });
                            }
                        }
                    });
                } else {
                    this.e.d(this.a, this.c, this.d, ajahVar);
                }
            }
        }
    }
}
