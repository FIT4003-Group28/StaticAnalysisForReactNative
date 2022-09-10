package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgvz  reason: default package */
/* loaded from: classes3.dex */
public class bgvz extends bgvy {
    private final dxio<apun> a;
    private final String b;
    private final String c;

    public bgvz(Activity activity, bhat bhatVar, dxio<apun> dxioVar) {
        super(bhatVar, dtxy.kd);
        this.a = dxioVar;
        this.b = activity.getString(bgud.REOPEN_THIS_BUSINESS_TITLE);
        this.c = activity.getString(bgud.REOPEN_THIS_BUSINESS_DESCRIPTION);
    }

    @Override // defpackage.bgvy
    public final void a(ilo iloVar) {
        this.a.a().e(iloVar, apum.CLOSURE);
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return this.c;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.b;
    }
}
