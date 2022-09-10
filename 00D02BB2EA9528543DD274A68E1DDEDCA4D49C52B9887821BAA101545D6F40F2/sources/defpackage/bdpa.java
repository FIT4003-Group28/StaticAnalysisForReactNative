package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdpa  reason: default package */
/* loaded from: classes3.dex */
public class bdpa implements View.OnTouchListener, bdon {
    private final Activity a;
    private final btvo b;
    private final apqe c;
    private final bdol d;
    private final bwrs<bcan> e;
    private final bcpd f;
    private boolean g;
    private int h;
    private bdoz i;
    private bbtj j;
    @dzsi
    private cjtd k;

    public bdpa(bbtj bbtjVar, @dzsi cjtd cjtdVar, bwrs<bcan> bwrsVar, bdol bdolVar, bdoz bdozVar, bcpd bcpdVar, Activity activity, btvo btvoVar, apqe apqeVar) {
        this.j = bbtjVar;
        this.k = cjtdVar;
        this.e = bwrsVar;
        this.d = bdolVar;
        this.f = bcpdVar;
        this.a = activity;
        this.b = btvoVar;
        this.c = apqeVar;
        this.i = bdozVar;
        this.h = bdozVar.a;
        bdozVar.a();
    }

    private final boolean r() {
        bcan c = this.e.c();
        dbsk.s(c);
        return c.d();
    }

    @Override // defpackage.bdon
    public Boolean a() {
        bcan c = this.e.c();
        dbsk.s(c);
        return Boolean.valueOf(c.q(this.j));
    }

    @Override // defpackage.bdok
    public cqkl b() {
        if (a().booleanValue()) {
            this.d.c(this.j);
        } else {
            if (this.j.b().equals(bbti.VIDEO) && ((Boolean) this.j.t().h(bdoy.a).c(false)).booleanValue()) {
                this.f.d(R.string.VIDEO_TOO_LONG);
            }
            this.d.b(this.j);
        }
        return cqkl.a;
    }

    @Override // defpackage.bdon
    public cqkl c() {
        this.d.d(this.j, true);
        this.g = true;
        return cqkl.a;
    }

    @Override // defpackage.bdon
    public Boolean d() {
        boolean z = true;
        if (!r() && !a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdon
    public Boolean e() {
        int a = dvlz.a(this.b.getPhotoUploadParameters().b);
        if (a == 0) {
            a = 3;
        }
        bdlz bdlzVar = bdlz.GRANTED;
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            Object[] objArr = new Object[1];
            objArr[0] = a != 1 ? a != 2 ? "NEVER_SHOW" : "ALWAYS_SHOW" : "UNKNOWN_SELECTION_CIRCLE_MODE";
            bvoo.h("Invalid empty selection circle display mode: %s", objArr);
            return true;
        }
        return Boolean.valueOf(r());
    }

    @Override // defpackage.bdon
    public CharSequence f() {
        bbti b = this.j.b();
        if (!a().booleanValue()) {
            if (b.equals(bbti.VIDEO)) {
                return this.a.getResources().getString(R.string.UGC_MEDIA_ACCESSIBILITY_SELECT_VIDEO_THUMB_N_OF_M, Integer.valueOf(this.h + 1), Integer.valueOf(this.i.a));
            }
            return this.a.getResources().getString(R.string.UGC_MEDIA_ACCESSIBILITY_SELECT_PHOTO_THUMB_N_OF_M, Integer.valueOf(this.h + 1), Integer.valueOf(this.i.a));
        } else if (b.equals(bbti.VIDEO)) {
            return this.a.getResources().getString(R.string.UGC_MEDIA_ACCESSIBILITY_DESELECT_VIDEO_THUMB_N_OF_M, Integer.valueOf(this.h + 1), Integer.valueOf(this.i.a));
        } else {
            return this.a.getResources().getString(R.string.UGC_MEDIA_ACCESSIBILITY_DESELECT_PHOTO_THUMB_N_OF_M, Integer.valueOf(this.h + 1), Integer.valueOf(this.i.a));
        }
    }

    @Override // defpackage.bdon
    public View.OnTouchListener g() {
        return this;
    }

    @Override // defpackage.bdon
    public Boolean h() {
        return Boolean.valueOf(this.j.b().equals(bbti.VIDEO));
    }

    @Override // defpackage.bdon
    public CharSequence i() {
        dbsg<Long> t = this.j.t();
        final apqe apqeVar = this.c;
        apqeVar.getClass();
        return (CharSequence) t.h(new dbrn(apqeVar) { // from class: bdox
            private final apqe a;

            {
                this.a = apqeVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a(((Long) obj).longValue());
            }
        }).c("");
    }

    @Override // defpackage.bdon
    public jic j() {
        ckql ckqlVar = new ckql();
        ckqlVar.e = true;
        String uri = q().a().toString();
        return new jic(uri, jfv.a(uri), cqrt.f(R.color.qu_grey_200), 0, null, ckqlVar);
    }

    @Override // defpackage.bdon
    public cjtd k() {
        cjta c = cjtd.c(this.k);
        c.d = dtyd.bc;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = a().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        c.a = bZ.bK();
        return c.a();
    }

    public void l() {
        bcan c = this.e.c();
        dbsk.s(c);
        c.A(this.j);
        cqkx.p(this);
    }

    public void m(bbtj bbtjVar) {
        this.j = bbtjVar;
    }

    public void n(@dzsi cjtd cjtdVar) {
        this.k = cjtdVar;
    }

    public void o(bdoz bdozVar) {
        this.i = bdozVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action;
        if (this.g && ((action = motionEvent.getAction()) == 1 || action == 3 || action == 4)) {
            this.g = false;
            this.d.d(this.j, false);
        }
        return false;
    }

    public void p() {
        bdoz bdozVar = this.i;
        this.h = bdozVar.a;
        bdozVar.a();
    }

    public bbtj q() {
        return this.j;
    }
}
