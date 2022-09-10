package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccev  reason: default package */
/* loaded from: classes4.dex */
final class ccev implements Runnable {
    final /* synthetic */ dlfh a;
    final /* synthetic */ ccey b;

    public ccev(ccey cceyVar, dlfh dlfhVar) {
        this.b = cceyVar;
        this.a = dlfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ccey cceyVar = this.b;
        Intent intent = cceyVar.f;
        gga ggaVar = cceyVar.b;
        final dlfh dlfhVar = this.a;
        affw.a(intent, ggaVar, new Runnable(this, dlfhVar) { // from class: cceu
            private final ccev a;
            private final dlfh b;

            {
                this.a = this;
                this.b = dlfhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ccev ccevVar = this.a;
                dlfh dlfhVar2 = this.b;
                ccey cceyVar2 = ccevVar.b;
                gga ggaVar2 = cceyVar2.b;
                cqkj cqkjVar = cceyVar2.j;
                bvrj.UI_THREAD.c();
                boks.a(dlfhVar2, ggaVar2, cqkjVar, null).show();
            }
        });
    }
}
