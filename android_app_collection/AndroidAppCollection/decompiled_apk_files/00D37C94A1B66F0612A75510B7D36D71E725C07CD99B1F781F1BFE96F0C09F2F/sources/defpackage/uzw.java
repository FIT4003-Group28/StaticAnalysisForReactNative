package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: uzw  reason: default package */
/* loaded from: classes4.dex */
public final class uzw extends vtm implements uvo, uzr {
    public final axnm a;
    public final axnm b;
    public final vab c;
    public final AtomicReference d;
    private final ankx e;

    public uzw(uvn uvnVar, ankx ankxVar, axnm axnmVar, axnm axnmVar2, azqb azqbVar, vab vabVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        this.e = ankxVar;
        this.a = axnmVar;
        this.b = axnmVar2;
        this.c = vabVar;
        uvnVar.a(ankxVar, oim.c, azqbVar);
        new uzv(axnmVar);
        atomicReference.set(vabVar.a(1.0f));
    }

    @Override // defpackage.uvo, defpackage.ver
    public final void a() {
        anlz.t(new Runnable() { // from class: uzu
            @Override // java.lang.Runnable
            public final void run() {
                uzw uzwVar = uzw.this;
                try {
                    AtomicReference atomicReference = uzwVar.d;
                    vab vabVar = uzwVar.c;
                    uzq uzqVar = (uzq) uzwVar.a.get();
                    atomicReference.set(vabVar.a(((uzt) uzwVar.b.get()).a));
                } catch (Throwable unused) {
                    uzwVar.d.set(uzwVar.c.a(0.0f));
                }
            }
        }, this.e);
    }
}
