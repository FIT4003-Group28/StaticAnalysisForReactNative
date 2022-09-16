package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acav  reason: default package */
/* loaded from: classes.dex */
public final class acav implements afzf {
    public final abzj a;
    private final Handler b;
    private final acti c;

    public acav(Handler handler, acti actiVar, abzj abzjVar) {
        this.b = handler;
        this.c = actiVar;
        this.a = abzjVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        Handler handler = this.b;
        final abzj abzjVar = this.a;
        handler.post(new Runnable() { // from class: acat
            @Override // java.lang.Runnable
            public final void run() {
                abzj.this.e();
            }
        });
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        final artf artfVar = (artf) obj;
        if (artfVar != null) {
            this.c.D(new acte(artfVar.e.I()));
        }
        this.b.post(new Runnable() { // from class: acau
            @Override // java.lang.Runnable
            public final void run() {
                acav acavVar = acav.this;
                acavVar.a.h(artfVar);
            }
        });
    }
}
