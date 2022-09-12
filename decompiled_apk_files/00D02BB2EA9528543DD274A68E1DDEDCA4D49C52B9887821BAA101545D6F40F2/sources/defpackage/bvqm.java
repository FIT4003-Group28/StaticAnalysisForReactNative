package defpackage;

import android.content.Context;
import android.os.HandlerThread;
/* compiled from: PG */
/* renamed from: bvqm  reason: default package */
/* loaded from: classes.dex */
public final class bvqm extends HandlerThread implements bvri {
    private Runnable a;
    private final bvrj b;

    public bvqm(Context context, bvrj bvrjVar, String str) {
        super(str, bvrjVar.J);
        this.a = null;
        this.b = bvrjVar;
        bvqo.a(this, context);
    }

    public static bvqm a(Context context, bvrj bvrjVar, bvrb bvrbVar) {
        bvqm bvqmVar = new bvqm(context, bvrjVar, bvrjVar.K);
        bvqmVar.start();
        bvql bvqlVar = new bvql(bvqmVar.getLooper());
        if (bvrbVar != null) {
            bvrg i = bvrbVar.i();
            i.a(bvrjVar, bvqlVar);
            bvqmVar.a = new bvqk(i, bvrjVar);
        }
        return bvqmVar;
    }

    @Override // defpackage.bvri
    public final bvrj b() {
        return this.b;
    }

    @Override // android.os.HandlerThread
    public final boolean quit() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return super.quit();
    }
}
