package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: alth  reason: default package */
/* loaded from: classes.dex */
public final class alth implements Runnable {
    public final float a;
    public final akpq b;
    public boolean e;
    public final Collection<bnvp> d = dchl.a();
    private final Collection<amye> f = dchl.a();
    public final Collection<amye> c = dchl.a();

    public alth(float f, akpq akpqVar) {
        this.a = f;
        this.b = akpqVar;
    }

    public final void a(amye amyeVar) {
        if (this.a < 0.0f) {
            this.f.add(amyeVar);
            this.b.b(this);
            this.b.d();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (bnvp bnvpVar : this.d) {
            bnvpVar.f(true != this.e ? 0.0f : 1.0f);
        }
        int i = true != this.e ? 1 : 3;
        for (amye amyeVar : this.c) {
            amyeVar.v = true;
            amyeVar.w = 519;
            amyeVar.x = i;
            amyeVar.y = 3;
        }
        for (amye amyeVar2 : this.f) {
            amyeVar2.v(1, 1);
        }
    }
}
