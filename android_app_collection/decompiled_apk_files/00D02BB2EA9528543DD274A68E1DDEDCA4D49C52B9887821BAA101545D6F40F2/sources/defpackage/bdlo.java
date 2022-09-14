package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdlo  reason: default package */
/* loaded from: classes3.dex */
public abstract class bdlo implements View.OnTouchListener, bdlm {
    protected final bbtj a;
    @dzsi
    protected Integer b;
    private boolean c;
    private final bdkm d;
    private final dxio<apni> e;

    public bdlo(bdkm bdkmVar, bbtj bbtjVar, dxio<apni> dxioVar) {
        this.d = bdkmVar;
        this.a = bbtjVar;
        this.e = dxioVar;
    }

    @Override // defpackage.bdlm
    public jic a() {
        ckql ckqlVar = new ckql();
        ckqlVar.e = true;
        String a = h().a();
        return new jic(a, jfv.a(a), cqrt.f(R.color.qu_grey_200), 0, null, ckqlVar);
    }

    @Override // defpackage.bdlm
    public Boolean b() {
        return true;
    }

    @Override // defpackage.bdlm
    public cqkl c() {
        this.d.a(this.a.q());
        return cqkl.a;
    }

    @Override // defpackage.bdlm
    public cqkl d() {
        this.d.b(this.a, true);
        this.c = true;
        return cqkl.a;
    }

    @Override // defpackage.bdlm
    public View.OnTouchListener e() {
        return this;
    }

    @Override // defpackage.bdlm
    public bbtm h() {
        return this.a.q();
    }

    @Override // defpackage.bdlm
    public Float i() {
        boolean b = this.e.a().b();
        Float valueOf = Float.valueOf(1.33f);
        return !b ? valueOf : (Float) this.a.q().E().h(bdln.a).c(valueOf);
    }

    @Override // defpackage.bdlm
    public void j(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action;
        if (this.c && ((action = motionEvent.getAction()) == 1 || action == 3 || action == 4)) {
            this.c = false;
            this.d.b(this.a, false);
        }
        return false;
    }
}
