package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: mct  reason: default package */
/* loaded from: classes3.dex */
public final class mct implements fzq {
    public final ajmy a;
    public final avhn b;
    public final ajmu c;
    public final WeakReference d;

    public mct(mbw mbwVar, ajmy ajmyVar, String str, awny awnyVar, WeakReference weakReference) {
        this.a = ajmyVar;
        this.d = weakReference;
        this.b = aolu.u(awnyVar);
        mcs mcsVar = new mcs(awnyVar, mbwVar, str);
        ajmt a = ajmu.a();
        a.c = mcsVar;
        this.c = a.a();
    }

    @Override // defpackage.fzq
    public final View g() {
        return null;
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
        fin finVar = (fin) this.d.get();
        if (finVar == null) {
            return;
        }
        if (z) {
            finVar.b(new mcr(this));
        } else {
            finVar.a(false);
        }
    }

    @Override // defpackage.fzq
    public final mct j() {
        return this;
    }
}
