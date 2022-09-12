package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
/* compiled from: PG */
/* renamed from: bgte  reason: default package */
/* loaded from: classes3.dex */
public class bgte implements bgsi {
    public final ScaleGestureDetector a;
    public final GestureDetector b;
    public final cjqy c;
    public boolean d;
    public ckqg e;
    private final ScaleGestureDetector.SimpleOnScaleGestureListener f;
    private final GestureDetector.SimpleOnGestureListener g;
    private final akpm h;
    private final dxio<begg> i;
    private final ckqf j;
    private jic k;
    private bwrs<ilo> l;

    public bgte(Activity activity, cqhn cqhnVar, akpm akpmVar, dxio<begg> dxioVar, cjqy cjqyVar) {
        bgtb bgtbVar = new bgtb(this);
        this.f = bgtbVar;
        bgtc bgtcVar = new bgtc();
        this.g = bgtcVar;
        this.j = new bgtd(this);
        this.h = akpmVar;
        this.i = dxioVar;
        this.c = cjqyVar;
        this.a = new ScaleGestureDetector(activity, bgtbVar);
        this.b = new GestureDetector(activity, bgtcVar);
    }

    private final String f() {
        String str = (String) dbsg.j((ilo) bwrs.b(this.l)).h(bgta.a).c("");
        return str.isEmpty() ? "" : new Uri.Builder().scheme("https").authority("www.google.com").encodedPath(str).toString();
    }

    @Override // defpackage.bgsi
    public View.OnTouchListener a() {
        return new View.OnTouchListener(this) { // from class: bgsz
            private final bgte a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                bgte bgteVar = this.a;
                bgteVar.a.onTouchEvent(motionEvent);
                if (bgteVar.b.onTouchEvent(motionEvent)) {
                    view.performClick();
                    return true;
                }
                return false;
            }
        };
    }

    @Override // defpackage.bhjp
    public Boolean b() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bhjp
    public jic c() {
        if (this.k == null) {
            this.k = new jic(f(), ckqc.PAINT_FE_SCALE2, 0, this.j);
        }
        return this.k;
    }

    @Override // defpackage.bhjp
    public Boolean d() {
        return Boolean.valueOf(!f().isEmpty());
    }

    @Override // defpackage.bhjp
    public cqkl e() {
        akqq aj;
        ilo iloVar = (ilo) bwrs.b(this.l);
        if (iloVar != null && (aj = iloVar.aj()) != null) {
            this.i.a().m(jjn.COLLAPSED);
            this.h.p(akyt.i(aj, 18.0f));
        }
        return cqkl.a;
    }

    @Override // defpackage.bgsj
    public boolean i() {
        return d().booleanValue();
    }

    @Override // defpackage.bgsj
    public void j(bwrs<ilo> bwrsVar) {
        this.k = null;
        this.l = bwrsVar;
    }

    @Override // defpackage.bgsj
    public void k() {
        this.d = false;
        this.k = null;
        this.l = null;
    }
}
