package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aimt  reason: default package */
/* loaded from: classes.dex */
public final class aimt implements yre {
    private final yni a;
    private final WeakReference b;
    private final aady c = new aady();
    private final aadx d = new aadx();

    public aimt(yni yniVar, acvg acvgVar) {
        this.a = yniVar;
        this.b = new WeakReference(acvgVar);
    }

    @Override // defpackage.yre
    public final void a() {
    }

    @Override // defpackage.yre
    public final void b() {
    }

    @Override // defpackage.yre
    public final void c() {
        this.a.d(this.d);
        acvg acvgVar = (acvg) this.b.get();
        if (acvgVar != null) {
            acvgVar.c(this.d.f());
        }
    }

    @Override // defpackage.yre
    public final void d() {
        this.a.d(this.c);
        acvg acvgVar = (acvg) this.b.get();
        if (acvgVar != null) {
            acvgVar.c(this.c.f());
        }
    }
}
