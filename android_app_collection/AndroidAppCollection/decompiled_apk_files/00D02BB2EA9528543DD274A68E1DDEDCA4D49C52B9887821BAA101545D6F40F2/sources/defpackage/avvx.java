package defpackage;

import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avvx  reason: default package */
/* loaded from: classes3.dex */
public class avvx implements avwq {
    public final avwp a;
    private final ges b;
    private final dlug c;
    private final dxio<avik> d;

    public avvx(ges gesVar, avwp avwpVar, dlug dlugVar, dxio<avik> dxioVar) {
        this.b = gesVar;
        this.a = avwpVar;
        this.c = dlugVar;
        this.d = dxioVar;
    }

    @Override // defpackage.avwq
    public Boolean a() {
        return false;
    }

    @Override // defpackage.avwq
    public Boolean b() {
        return false;
    }

    @Override // defpackage.avwq
    public jht c() {
        return jhv.h().b();
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return cqrt.f(2131232822);
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.b.aD) {
            this.d.a().n(this.c);
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtxx.bB);
    }

    @Override // defpackage.avwq
    public View.OnTouchListener i() {
        return new View.OnTouchListener(this) { // from class: avvw
            private final avvx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                avvx avvxVar = this.a;
                int action = motionEvent.getAction();
                if (action == 0) {
                    avvxVar.a.a();
                    return false;
                } else if (action != 1 && action != 3) {
                    return false;
                } else {
                    avvxVar.a.b();
                    return false;
                }
            }
        };
    }

    @Override // defpackage.avwq
    public Boolean j() {
        return false;
    }

    @Override // defpackage.avwq
    @dzsi
    public Spannable k(bvsx bvsxVar, cklf cklfVar) {
        return null;
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        boolean z = this.b.aD;
        return "";
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.b.Rp(R.string.OFFLINE_DYNAMIC_PADDING_DISPLAY_REGION_NAME);
    }

    @Override // defpackage.avwq
    @dzsi
    public String n() {
        return null;
    }
}
