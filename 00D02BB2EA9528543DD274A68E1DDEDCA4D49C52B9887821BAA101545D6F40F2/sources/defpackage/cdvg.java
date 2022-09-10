package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.an;
/* compiled from: PG */
/* renamed from: cdvg  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdvg<T extends an> extends ges {
    protected T ai;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(i(), viewGroup, false);
    }

    protected abstract Class<T> g();

    protected abstract int i();

    @Override // defpackage.ges, defpackage.fd
    public void l(Bundle bundle) {
        super.l(bundle);
        fd fdVar = (fd) dbsg.j(this.D).c(this);
        ff J = fdVar.J();
        dbsk.s(J);
        this.ai = (T) av.b(fdVar, new af(J.getApplication(), fdVar, null)).a(g());
    }

    public final T w() {
        T t = this.ai;
        dbsk.s(t);
        return t;
    }
}
