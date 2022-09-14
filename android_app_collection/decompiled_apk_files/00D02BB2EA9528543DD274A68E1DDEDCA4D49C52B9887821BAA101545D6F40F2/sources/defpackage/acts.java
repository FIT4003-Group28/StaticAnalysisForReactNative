package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: acts  reason: default package */
/* loaded from: classes2.dex */
public abstract class acts implements actl {
    @dzsi
    private View.OnClickListener a;
    @dzsi
    private View.OnClickListener b;
    public final cjqy d;
    private List<actk> c = dchl.a();
    private final View.OnAttachStateChangeListener e = new actq(this);
    private final View.OnTouchListener f = new actr(this);

    public acts(cjqy cjqyVar) {
        this.d = cjqyVar;
    }

    @dzsi
    public View.OnTouchListener A() {
        return this.f;
    }

    @Override // defpackage.actl
    public Boolean a() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.actl
    public Boolean b() {
        return Boolean.valueOf(this.a != null);
    }

    @Override // defpackage.actl
    public List<? extends actk> j() {
        return this.c;
    }

    @Override // defpackage.actl
    @dzsi
    public View.OnClickListener k() {
        return this.b;
    }

    @Override // defpackage.actl
    @dzsi
    public View.OnClickListener l() {
        return this.a;
    }

    @Override // defpackage.actl
    public cqtd m() {
        return cqrt.h(2131232481, ibm.x());
    }

    @Override // defpackage.actl
    public cqvf n() {
        return cqrt.l(R.string.CAROUSEL_ADD_PHOTOS);
    }

    @Override // defpackage.actl
    public Boolean o() {
        return a();
    }

    @Override // defpackage.actl
    public Boolean p() {
        boolean z = false;
        if (a().booleanValue() && !o().booleanValue() && !cqjv.v(n()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.actl
    public Boolean q() {
        return a();
    }

    @Override // defpackage.actl
    @dzsi
    public View.OnAttachStateChangeListener r() {
        return this.e;
    }

    @Override // defpackage.actl
    public cqtv s() {
        return cqrp.d(160.0d);
    }

    @Override // defpackage.actl
    public cqtv v() {
        return cqrp.d(8.0d);
    }

    public void x(List<actk> list, @dzsi View.OnClickListener onClickListener, @dzsi View.OnClickListener onClickListener2, int i) {
        this.a = onClickListener;
        this.b = onClickListener2;
        this.c = list.subList(0, Math.min(list.size(), i));
    }

    public void y(List<actk> list, @dzsi View.OnClickListener onClickListener, @dzsi View.OnClickListener onClickListener2) {
        this.a = onClickListener;
        this.b = onClickListener2;
        this.c = list;
    }

    public Boolean z() {
        return Boolean.valueOf(!j().isEmpty());
    }
}
