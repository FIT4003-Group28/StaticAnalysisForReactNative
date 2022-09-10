package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: drz  reason: default package */
/* loaded from: classes6.dex */
public final class drz<T> extends btrh<T> {
    private final int d;

    public drz(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            amwe amweVar = (amwe) obj;
            View view = ((drw) this.a).a.p;
            if (view == null) {
                return;
            }
            if (amweVar.a != amwd.COMPASS) {
                view.setVisibility(0);
                return;
            } else {
                view.setVisibility(8);
                return;
            }
        }
        alho alhoVar = (alho) obj;
        dql dqlVar = ((drw) this.a).a.q;
        if (dqlVar == null) {
            return;
        }
        alaq alaqVar = alhoVar.a;
        if (!(alaqVar instanceof alap)) {
            return;
        }
        ily ilyVar = new ily();
        ilyVar.q(alhoVar.a.l().S());
        ilyVar.i((alap) alaqVar);
        dqlVar.a.g(drq.a(bwrs.a(ilyVar.d())));
    }
}
