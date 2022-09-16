package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: bmzp  reason: default package */
/* loaded from: classes3.dex */
public class bmzp implements bmzo {
    @dzsi
    protected Runnable a;
    @dzsi
    protected Runnable b;

    @Override // defpackage.bmzo
    @dzsi
    public cjtd a() {
        return null;
    }

    @Override // defpackage.bmzo
    @dzsi
    public cjtd b() {
        return null;
    }

    @Override // defpackage.bmzo
    @dzsi
    public cjtd c() {
        return null;
    }

    @Override // defpackage.bmzo
    public cqkl d() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.bmzo
    public cqkl e() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.bmzo
    public Boolean f() {
        return Boolean.valueOf(!TextUtils.isEmpty(g()));
    }

    @Override // defpackage.bmzo
    public CharSequence g() {
        throw new UnsupportedOperationException("Unsupported operation, must be overridden.");
    }

    @Override // defpackage.bmzo
    public CharSequence h() {
        throw new UnsupportedOperationException("Unsupported operation, must be overridden.");
    }

    @Override // defpackage.bmzo
    public CharSequence i() {
        throw new UnsupportedOperationException("Unsupported operation, must be overridden.");
    }

    @Override // defpackage.bmzo
    public void j(Runnable runnable) {
        this.b = runnable;
    }

    @Override // defpackage.bmzo
    public void k(Runnable runnable) {
        this.a = runnable;
    }
}
