package defpackage;

import android.app.Activity;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bthy  reason: default package */
/* loaded from: classes4.dex */
public class bthy implements bthv {
    public final Activity a;
    public boolean b;
    private final bths c;
    private final Runnable d;
    private final cjqy e;

    public bthy(Activity activity, bths bthsVar, Runnable runnable, cjqy cjqyVar) {
        this.a = activity;
        this.c = bthsVar;
        this.d = runnable;
        this.e = cjqyVar;
        this.b = !bthsVar.c().a();
    }

    @Override // defpackage.bthv
    public cqsn a() {
        return cqsk.a(this.c.a());
    }

    @Override // defpackage.bthv
    public cqsn b() {
        return cqsk.a(this.c.b());
    }

    @Override // defpackage.bthv
    public cqsn c() {
        return cqsk.a(this.c.d());
    }

    @Override // defpackage.bthv
    public cqsn d() {
        return cqrt.l(R.string.CANCEL_BUTTON);
    }

    @Override // defpackage.bthv
    public cqsn e() {
        return cqsk.a(this.c.c().a() ? this.c.c().b() : "");
    }

    @Override // defpackage.bthv
    public cqkl f() {
        this.c.f().a(this.a);
        this.e.i(this.c.g());
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.bthv
    public cqkl g() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.bthv
    public CompoundButton.OnCheckedChangeListener h() {
        return new bthx(this);
    }

    @Override // defpackage.bthv
    public Boolean i() {
        return Boolean.valueOf(this.c.c().a());
    }

    @Override // defpackage.bthv
    public Boolean j() {
        return Boolean.valueOf(this.b);
    }
}
