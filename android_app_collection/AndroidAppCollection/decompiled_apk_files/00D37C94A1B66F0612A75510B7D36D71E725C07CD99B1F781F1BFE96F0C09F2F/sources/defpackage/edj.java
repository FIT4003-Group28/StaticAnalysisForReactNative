package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER, c = {xay.class})
/* renamed from: edj  reason: default package */
/* loaded from: classes3.dex */
public final class edj extends edm implements wls {
    public ViewGroup a;
    public ajrs b;
    private int e;
    private final wmk f;

    public edj(wmk wmkVar, edb edbVar, wqf wqfVar, xdu xduVar, xci xciVar, aqtb aqtbVar) {
        super(edbVar, wqfVar, xduVar, xciVar, aqtbVar, null, null);
        this.f = wmkVar;
        this.c = new edl() { // from class: edi
            @Override // defpackage.edl
            public final ViewGroup a() {
                return edj.this.a;
            }
        };
        this.d = new edk() { // from class: edh
            @Override // defpackage.edk
            public final ajrs a() {
                return edj.this.b;
            }
        };
    }

    private final void h(View view) {
        if (view == null) {
            this.a = null;
        } else {
            this.a = (ViewGroup) zag.g(view, R.id.element_companion_card_stub, R.id.element_companion_card);
        }
    }

    @Override // defpackage.edm, defpackage.wqg
    public final void b() {
        this.f.a(this);
    }

    @Override // defpackage.wls
    public final void f() {
        h(null);
        this.b = null;
    }

    @Override // defpackage.wls
    public final void g(View view, ajrs ajrsVar) {
        h(view);
        this.b = ajrsVar;
        if (this.e == 1) {
            this.e = 2;
            super.qI();
        }
    }

    @Override // defpackage.edm, defpackage.wqg
    public final void qH() {
        this.f.a.remove(this);
    }

    @Override // defpackage.edm, defpackage.wqg
    public final void qI() {
        this.e = 1;
        if (this.a != null) {
            this.e = 2;
            super.qI();
        }
    }

    @Override // defpackage.edm, defpackage.wqg
    public final void qJ(int i) {
        this.e = 0;
        super.qJ(i);
    }
}
