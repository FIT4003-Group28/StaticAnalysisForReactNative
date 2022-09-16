package defpackage;

import android.view.SurfaceHolder;
/* compiled from: PG */
/* renamed from: acnb  reason: default package */
/* loaded from: classes.dex */
final class acnb implements Runnable {
    final /* synthetic */ SurfaceHolder a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ acnf d;

    public acnb(acnf acnfVar, SurfaceHolder surfaceHolder, int i, int i2) {
        this.d = acnfVar;
        this.a = surfaceHolder;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abta abtaVar = this.d.e;
        SurfaceHolder surfaceHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        synchronized (abtaVar.b) {
            abtaVar.d = i;
            abtaVar.e = i2;
            abtaVar.c = surfaceHolder;
        }
        abtaVar.a.a();
    }
}
