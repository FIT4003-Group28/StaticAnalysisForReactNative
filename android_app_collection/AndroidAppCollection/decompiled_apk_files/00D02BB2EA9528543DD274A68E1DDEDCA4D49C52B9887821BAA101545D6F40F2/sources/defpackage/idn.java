package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: idn  reason: default package */
/* loaded from: classes6.dex */
public abstract class idn implements idl {
    public static idm i() {
        return new idh();
    }

    @Override // defpackage.idl
    public abstract CharSequence Pb();

    @Override // defpackage.idl
    public abstract CharSequence a();

    @Override // defpackage.idl
    public abstract CharSequence b();

    public abstract View.OnClickListener d();

    @Override // defpackage.idl
    public abstract cjtd e();

    @Override // defpackage.idl
    public View.OnClickListener f() {
        return d();
    }

    @Override // defpackage.idl
    public View.OnClickListener g() {
        return idk.a;
    }

    @Override // defpackage.idl
    public Boolean h() {
        return idj.a();
    }
}
