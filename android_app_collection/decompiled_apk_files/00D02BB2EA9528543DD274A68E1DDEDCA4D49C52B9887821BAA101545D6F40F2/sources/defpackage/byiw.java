package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byiw  reason: default package */
/* loaded from: classes4.dex */
public abstract class byiw implements qvm {
    protected final Activity a;
    public final dxio<ros> d;
    private final dxio<afwt> e;
    private final acyp f;

    public byiw(Activity activity, dxio<ros> dxioVar, dxio<afwt> dxioVar2, acyp acypVar) {
        this.a = activity;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = acypVar;
    }

    @Override // defpackage.qvm
    public View.OnClickListener OA() {
        return byit.a;
    }

    @Override // defpackage.qvm
    public Boolean OB() {
        return false;
    }

    @Override // defpackage.qvm
    public final jht OC() {
        jhu h = jhv.h();
        if (b()) {
            jhm jhmVar = new jhm();
            jhmVar.a = this.a.getText(R.string.COMMUTE_SETTINGS_MENU_ITEM);
            jhmVar.d(new View.OnClickListener(this) { // from class: byiu
                private final byiw a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d.a().e();
                }
            });
            jhmVar.f = cjtd.a(dtxl.al);
            h.d(jhmVar.c());
        }
        return ((jhi) h).b();
    }

    @Override // defpackage.qvm
    public qvn OD() {
        return new byiv();
    }

    @Override // defpackage.qvm
    public Boolean OE() {
        return false;
    }

    @Override // defpackage.qvm
    public Boolean OF() {
        return Boolean.valueOf(!this.f.f());
    }

    @Override // defpackage.qvm
    public final cqkl Ow() {
        this.e.a().p();
        return cqkl.a;
    }

    @Override // defpackage.qvm
    @dzsi
    public cjtd Oy() {
        return null;
    }

    @Override // defpackage.qvm
    @dzsi
    public cqix<?> a() {
        return null;
    }

    protected boolean b() {
        return true;
    }
}
