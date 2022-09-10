package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgvv  reason: default package */
/* loaded from: classes3.dex */
public class bgvv extends bgvy {
    private final dxio<apun> a;
    private final String b;
    private final String c;

    public bgvv(Activity activity, bhat bhatVar, dxio<apun> dxioVar) {
        super(bhatVar, dtxy.kb);
        this.a = dxioVar;
        this.b = activity.getString(bgud.EDIT_BIZ_INFO_TITLE);
        this.c = activity.getString(bgud.EDIT_BIZ_INFO_DESCRIPTION);
    }

    @Override // defpackage.bgvy
    public final void a(ilo iloVar) {
        this.a.a().e(iloVar, apum.MAIN);
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
