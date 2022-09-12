package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: actp  reason: default package */
/* loaded from: classes2.dex */
public class actp implements actm {
    private final String a;
    @dzsi
    private final acli b;
    @dzsi
    private final View.OnClickListener c;
    private final cqiw<actm> d;

    public actp(String str, @dzsi View.OnClickListener onClickListener, @dzsi acli acliVar, cqiw<actm> cqiwVar) {
        this.a = str;
        this.c = onClickListener;
        this.b = acliVar;
        this.d = cqiwVar;
    }

    @Override // defpackage.actk
    public void a(cqiv cqivVar) {
        cqivVar.a(this.d, this);
    }

    @Override // defpackage.actk
    @dzsi
    public View.OnClickListener b() {
        return this.c;
    }

    @Override // defpackage.actk
    @dzsi
    public acli c() {
        return this.b;
    }

    @Override // defpackage.actm
    public String d() {
        return this.a;
    }

    @Override // defpackage.actm
    public cqtv e() {
        return cqrp.d(160.0d);
    }

    @Override // defpackage.actm
    @dzsi
    public String f() {
        return null;
    }
}
