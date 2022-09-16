package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aimw  reason: default package */
/* loaded from: classes.dex */
public final class aimw implements yre {
    private final yni a;
    private final WeakReference b;
    private final aads c = new aads();
    private final aadr d = new aadr();
    private final aadq e = new aadq();
    private final aadp f = new aadp();

    public aimw(yni yniVar, acvg acvgVar) {
        this.a = yniVar;
        this.b = new WeakReference(acvgVar);
    }

    @Override // defpackage.yre
    public final void a() {
        this.a.d(this.d);
        acvg acvgVar = (acvg) this.b.get();
        if (acvgVar != null) {
            acvgVar.c(this.d.f());
        }
    }

    @Override // defpackage.yre
    public final void b() {
        this.a.d(this.c);
        acvg acvgVar = (acvg) this.b.get();
        if (acvgVar != null) {
            acvgVar.c(this.c.f());
        }
    }

    @Override // defpackage.yre
    public final void c() {
        this.a.d(this.f);
        acvg acvgVar = (acvg) this.b.get();
        if (acvgVar != null) {
            acvgVar.c(this.f.f());
        }
    }

    @Override // defpackage.yre
    public final void d() {
        this.a.d(this.e);
        acvg acvgVar = (acvg) this.b.get();
        if (acvgVar != null) {
            acvgVar.c(this.e.f());
        }
    }
}
