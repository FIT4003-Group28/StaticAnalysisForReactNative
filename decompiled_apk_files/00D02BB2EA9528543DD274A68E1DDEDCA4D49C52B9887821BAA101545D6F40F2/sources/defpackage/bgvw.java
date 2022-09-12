package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgvw  reason: default package */
/* loaded from: classes3.dex */
public class bgvw extends bgvy {
    private final dxio<apun> a;
    private final String b;
    private final String c;

    public bgvw(Activity activity, bhat bhatVar, dxio<apun> dxioVar, @dzsi ilo iloVar) {
        super(dtxy.kc, (ilo) null);
        this.a = dxioVar;
        this.b = activity.getString(bgud.EDIT_HOURS_TITLE);
        this.c = activity.getString(bgud.EDIT_HOURS_DESCRIPTION);
    }

    @Override // defpackage.bgvy
    public final void a(ilo iloVar) {
        this.a.a().e(iloVar, apum.HOURS);
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
