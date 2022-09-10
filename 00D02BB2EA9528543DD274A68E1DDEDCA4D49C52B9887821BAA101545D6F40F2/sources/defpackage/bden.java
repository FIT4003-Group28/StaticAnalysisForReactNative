package defpackage;

import android.view.View;
import android.widget.Toast;
/* compiled from: PG */
/* renamed from: bden  reason: default package */
/* loaded from: classes3.dex */
public class bden extends bdbe implements bdav {
    public static final /* synthetic */ int j = 0;
    private final View.OnAttachStateChangeListener k;

    public bden(dwfl dwflVar, ckqd ckqdVar, int i, Toast toast, @dzsi cqtd cqtdVar, ckcw ckcwVar, cjqq cjqqVar, ckmm ckmmVar, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        super(dwflVar, ckqdVar, i, toast, cqtdVar, ckcwVar, cjqqVar, ckmmVar);
        this.k = onAttachStateChangeListener;
    }

    @Override // defpackage.bdav
    public View.OnAttachStateChangeListener d() {
        return this.k;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcyd(), this);
    }
}
