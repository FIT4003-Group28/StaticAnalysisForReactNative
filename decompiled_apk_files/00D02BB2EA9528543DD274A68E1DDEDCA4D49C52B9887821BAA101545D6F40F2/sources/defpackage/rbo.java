package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rbo  reason: default package */
/* loaded from: classes7.dex */
public class rbo extends ixr implements rbd {
    private final qvm e;
    private final View.OnLayoutChangeListener f;

    public rbo(ixq ixqVar, qvm qvmVar, View.OnLayoutChangeListener onLayoutChangeListener) {
        super(ixqVar);
        this.e = qvmVar;
        this.f = onLayoutChangeListener;
    }

    @Override // defpackage.rbd
    public qvm a() {
        return this.e;
    }

    @Override // defpackage.ivk, defpackage.izs
    public Integer ac() {
        return Integer.valueOf((int) R.id.commute_search_omnibox_container);
    }

    public void ap() {
        ak(false);
        o(false);
        al(true);
    }

    @Override // defpackage.rbd
    public View.OnLayoutChangeListener b() {
        return this.f;
    }
}
