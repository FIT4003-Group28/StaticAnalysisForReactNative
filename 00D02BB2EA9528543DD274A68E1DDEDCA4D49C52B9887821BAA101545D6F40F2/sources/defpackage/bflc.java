package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bflc  reason: default package */
/* loaded from: classes3.dex */
public class bflc implements bfkm {
    private final Context a;
    private int b;
    private float c;
    private float d;
    private float e;
    @dzsi
    private final cqtd f = cqrt.f(2131231692);

    public bflc(int i, Activity activity) {
        this.a = activity;
        this.b = bfki.d(activity.getResources()).c;
    }

    @Override // defpackage.bfkk
    public List A() {
        return bfkj.b(this);
    }

    @Override // defpackage.bfkk
    public Boolean B() {
        return bfkj.e();
    }

    @Override // defpackage.bfkk
    public cqix C() {
        return null;
    }

    @Override // defpackage.bfkk
    public Boolean D() {
        return bfkj.f();
    }

    @Override // defpackage.bfkk
    public cqtv E() {
        return bfkj.d();
    }

    @Override // defpackage.bfkk
    public Float F() {
        return bfkj.c();
    }

    @Override // defpackage.bfkk
    public void G(float f) {
    }

    @Override // defpackage.bfkk
    public void Pp(float f) {
        this.e = f;
    }

    @Override // defpackage.bfkk
    public void Pq(boolean z) {
    }

    @Override // defpackage.bfkk
    public void Pr(float f) {
        this.c = f;
    }

    @Override // defpackage.bfkk
    public void Ps(float f) {
        this.d = f;
    }

    @Override // defpackage.bfkk
    public cqss a() {
        return cqrt.c(R.color.qu_daynight_google_blue_700);
    }

    @Override // defpackage.bfkk
    public Boolean b() {
        boolean z = false;
        if (btpf.c(this.a).e && btpf.c(this.a).f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfkk
    public Boolean c() {
        return bfkj.a(this);
    }

    @Override // defpackage.bfkk
    @dzsi
    public cqtd d() {
        return this.f;
    }

    @Override // defpackage.bfkk
    public Boolean i() {
        return false;
    }

    @Override // defpackage.bfkk
    public void j(int i) {
        this.b = i;
    }

    @Override // defpackage.bfkk
    public Integer k() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.bfkk
    public Float l() {
        return Float.valueOf(bfki.a(this.a.getResources()));
    }

    @Override // defpackage.bfkk
    public Float m() {
        return Float.valueOf(this.c);
    }

    @Override // defpackage.bfkk
    public Float n() {
        return Float.valueOf(this.d);
    }

    @Override // defpackage.bfkk
    public Float o() {
        return Float.valueOf(this.e);
    }

    @Override // defpackage.bfkk
    @dzsi
    public jbo p() {
        return null;
    }

    @Override // defpackage.bfkk
    public Boolean q() {
        return false;
    }

    @Override // defpackage.bfkk
    @dzsi
    public cqix<? extends cqkp> r() {
        return null;
    }

    @Override // defpackage.bfkk
    public List<jbp> s() {
        return new ArrayList();
    }

    @Override // defpackage.bfkm
    public jbs u() {
        return bfkl.a(this);
    }

    @Override // defpackage.bfkm
    public View.OnAttachStateChangeListener v() {
        return null;
    }

    @Override // defpackage.bfkm
    public aeqd w() {
        return null;
    }

    @Override // defpackage.bfkk
    public void x(cqtv cqtvVar) {
    }

    @Override // defpackage.bfkm
    public Boolean y() {
        return bfkl.b();
    }

    @Override // defpackage.bfkk
    public Boolean z() {
        return bfkj.g();
    }
}
