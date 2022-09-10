package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asud  reason: default package */
/* loaded from: classes2.dex */
public class asud implements asuu {
    private final Runnable a;
    private final ddho b;
    private final Resources c;
    private boolean d;
    private final boolean e;

    public asud(Resources resources, Runnable runnable, ddho ddhoVar) {
        this(resources, runnable, ddhoVar, false, false);
    }

    public asud(Resources resources, Runnable runnable, ddho ddhoVar, boolean z, boolean z2) {
        this.a = runnable;
        this.b = ddhoVar;
        this.c = resources;
        this.d = false;
        this.e = z2;
    }

    @Override // defpackage.asuu
    public String a() {
        return this.c.getString(R.string.RECENTER_FOLLOW_MODE);
    }

    @Override // defpackage.asuu
    public cqtd b() {
        return cqrt.g(2131232359, ibl.H());
    }

    @Override // defpackage.asuu
    public cjtd c() {
        return cjtd.a(this.b);
    }

    @Override // defpackage.asuu
    public cqkl d() {
        this.a.run();
        return cqkl.a;
    }

    @Override // defpackage.asuu
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.asuu
    public void f(boolean z) {
        this.d = z;
    }

    @Override // defpackage.asuu
    public Boolean g() {
        return Boolean.valueOf(this.e);
    }
}
