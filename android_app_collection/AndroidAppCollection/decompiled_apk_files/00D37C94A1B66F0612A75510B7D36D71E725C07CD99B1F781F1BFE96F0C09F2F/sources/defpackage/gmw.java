package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gmw  reason: default package */
/* loaded from: classes3.dex */
public final class gmw implements aknw {
    final /* synthetic */ auod a;
    final /* synthetic */ Map b;
    final /* synthetic */ gmx c;

    public gmw(gmx gmxVar, auod auodVar, Map map) {
        this.c = gmxVar;
        this.a = auodVar;
        this.b = map;
    }

    @Override // defpackage.aknw
    public final void a() {
    }

    @Override // defpackage.aknw
    public final void b() {
        gmx gmxVar = this.c;
        auod auodVar = this.a;
        boolean z = (auodVar.b & 64) != 0;
        apzg apzgVar = auodVar.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        gmxVar.b(z, apzgVar, this.b);
    }

    @Override // defpackage.aknw
    public final void c() {
        Executor executor = this.c.b;
        final auod auodVar = this.a;
        final Map map = this.b;
        executor.execute(new Runnable() { // from class: gmv
            @Override // java.lang.Runnable
            public final void run() {
                gmw gmwVar = gmw.this;
                gmwVar.c.c(auodVar, map);
            }
        });
    }
}
