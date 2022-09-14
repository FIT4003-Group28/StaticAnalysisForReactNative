package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: bxpr  reason: default package */
/* loaded from: classes4.dex */
public class bxpr implements bxob {
    public final ges a;
    public final dzsj<glj> b;
    @dzsi
    private cqix<?> c;
    private final cqix<?> d;
    private final bxko e;

    public bxpr(bxpz bxpzVar, bxko bxkoVar, fd fdVar, dzsj<glj> dzsjVar, dxio<bxqs> dxioVar) {
        bxhg bxhgVar = new bxhg();
        bxqs a = dxioVar.a();
        Activity activity = (Activity) ((dxjd) a.a).a;
        bxqs.a(activity, 1);
        dxio a2 = ((dxjh) a.b).a();
        bxqs.a(a2, 2);
        bxqs.a(bxpzVar, 3);
        bxqs.a(bxkoVar, 4);
        this.d = cqgr.fT(bxhgVar, new bxqr(activity, a2, bxpzVar, bxkoVar));
        this.e = bxkoVar;
        this.a = (ges) fdVar;
        this.b = dzsjVar;
    }

    @Override // defpackage.bxob
    public cqix<?> a() {
        return this.d;
    }

    @Override // defpackage.bxob
    @dzsi
    public cqix<?> b() {
        return this.c;
    }

    @Override // defpackage.bxob
    public Boolean c() {
        boolean z = false;
        if (this.c != null && dbsj.d(this.e.d())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxob
    public View.OnTouchListener d() {
        return new bxpq(this);
    }

    public <T extends cqkp> void e(cqiw<T> cqiwVar, T t) {
        this.c = cqgr.fT(cqiwVar, t);
    }
}
