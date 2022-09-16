package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jgu  reason: default package */
/* loaded from: classes3.dex */
public final class jgu {
    public final Map a = new ConcurrentHashMap();
    public final tdb b;
    public final ankw c;
    public String d;
    public String[] e;
    public avgi f;
    private final gfr g;
    private final gfu h;

    public jgu(tdb tdbVar, gfr gfrVar, gfu gfuVar, ankw ankwVar) {
        this.b = tdbVar;
        this.g = gfrVar;
        this.h = gfuVar;
        this.c = ankwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ampq ampqVar) {
        avgi avgiVar = this.f;
        if (avgiVar != null) {
            this.g.d(avgiVar, this.h.a().d);
            if (!ampqVar.h()) {
                return;
            }
            ((Runnable) ampqVar.c()).run();
        }
    }

    public final void b(String str, Runnable runnable) {
        aypg aypgVar = (aypg) this.a.remove(str);
        if (aypgVar != null) {
            aypgVar.qr();
        }
        if (this.a.isEmpty()) {
            a(ampq.j(runnable));
        }
    }
}
