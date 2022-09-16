package defpackage;

import com.google.protos.youtube.api.innertube.ChannelHandleValidationResultRendererOuterClass;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ejd  reason: default package */
/* loaded from: classes3.dex */
public final class ejd implements Runnable {
    final /* synthetic */ ejf a;

    public ejd(ejf ejfVar) {
        this.a = ejfVar;
    }

    public final boolean a() {
        return this == this.a.m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.post(new Runnable() { // from class: ejc
            @Override // java.lang.Runnable
            public final void run() {
                ejd.this.a.f(new eje(3, null));
            }
        });
        String obj = this.a.h.getText().toString();
        ejf ejfVar = this.a;
        aauj aaujVar = ejfVar.c;
        aptv aptvVar = ejfVar.j;
        String str = aptvVar.e;
        String str2 = aptvVar.f;
        aaug aaugVar = new aaug(aaujVar.e, aaujVar.a);
        aaugVar.a = obj;
        aaugVar.b = str;
        aaugVar.c = str2;
        ejf ejfVar2 = this.a;
        aauj aaujVar2 = ejfVar2.c;
        Executor executor = ejfVar2.f;
        if (aaujVar2.c == null) {
            aaujVar2.c = new aaui(aaujVar2.b, aaujVar2.f);
        }
        ejfVar2.n = aaujVar2.c.b(aaugVar, executor);
        ylw ylwVar = new ylw() { // from class: ejb
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj2) {
                eje b;
                ejd ejdVar = ejd.this;
                asfw asfwVar = (asfw) obj2;
                if (!ejdVar.a()) {
                    return;
                }
                ejf ejfVar3 = ejdVar.a;
                aunb aunbVar = asfwVar.c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                apsg apsgVar = (apsg) aunbVar.qm(ChannelHandleValidationResultRendererOuterClass.channelHandleValidationResultRenderer);
                int F = almu.F(apsgVar.b);
                if (F == 0) {
                    F = 1;
                }
                int i = F - 1;
                if (i == 1) {
                    b = eje.b();
                } else if (i == 2 || i == 3 || i == 4) {
                    arag aragVar = apsgVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    b = eje.a(aragVar);
                } else {
                    b = eje.c();
                }
                ejfVar3.f(b);
            }
        };
        ylv ylvVar = new ylv() { // from class: eja
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                ejd ejdVar = ejd.this;
                if (!ejdVar.a()) {
                    return;
                }
                ejdVar.a.f(eje.c());
            }
        };
        ejf ejfVar3 = this.a;
        ylx.l(ejfVar3.n, ejfVar3.e, ylvVar, ylwVar, anlf.a);
    }
}
