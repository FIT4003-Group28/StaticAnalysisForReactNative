package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ycl  reason: default package */
/* loaded from: classes7.dex */
public class ycl implements xzr {
    public static final dcqe a = dcqe.c("ycl");
    private final xyu b;
    private final xzq c;
    private final xkl d;
    private final Runnable e;
    private final cjta f;

    static {
        cqta.e(6052956);
    }

    public ycl(xyu xyuVar, xzq xzqVar, cjta cjtaVar, xkl xklVar, Runnable runnable) {
        this.b = xyuVar;
        this.c = xzqVar;
        this.f = cjtaVar;
        this.d = xklVar;
        this.e = runnable;
    }

    @Override // defpackage.xyv
    public void a(Context context) {
    }

    @Override // defpackage.xyv
    public boolean b() {
        return false;
    }

    @Override // defpackage.xzr
    public xyu c() {
        return this.b;
    }

    @Override // defpackage.xzr
    public xzq d() {
        return this.c;
    }

    @Override // defpackage.xzr
    public cqkl e() {
        this.e.run();
        return cqkl.a;
    }

    @Override // defpackage.xzr
    public cjtd f(ddho ddhoVar) {
        cjta cjtaVar = this.f;
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    @Override // defpackage.xzr
    public Boolean g() {
        return Boolean.valueOf(!this.d.a());
    }
}
