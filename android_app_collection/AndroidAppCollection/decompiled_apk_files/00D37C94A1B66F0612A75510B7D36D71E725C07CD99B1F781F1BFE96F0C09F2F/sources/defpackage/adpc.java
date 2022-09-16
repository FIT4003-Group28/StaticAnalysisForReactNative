package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: adpc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adpc implements Runnable {
    public final /* synthetic */ adpl a;
    private final /* synthetic */ int b;

    public /* synthetic */ adpc(adpl adplVar, int i) {
        this.b = i;
        this.a = adplVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            adpl adplVar = this.a;
            adplVar.q.f();
            adplVar.aD();
        } else if (i == 1) {
            adpl adplVar2 = this.a;
            try {
                adtt adttVar = adplVar2.q;
                if (adttVar == null) {
                    return;
                }
                adttVar.e(adplVar2.o);
            } catch (IOException e) {
                zep.f(adpl.a, "Unable to start web socket server: ", e);
                afus.b(2, 21, "failed to start web socket server for local transport");
            }
        } else {
            this.a.j.d();
        }
    }
}
