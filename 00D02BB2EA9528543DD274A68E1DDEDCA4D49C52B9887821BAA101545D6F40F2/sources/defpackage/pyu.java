package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: pyu  reason: default package */
/* loaded from: classes7.dex */
public class pyu implements qab {
    private final dxio<qbt> a;
    private final dxio<afha> b;
    private final dqtp c;
    private final boolean d;
    private final Uri e;
    private final String f;
    @dzsi
    private final String g;

    public pyu(btpc btpcVar, dxio<qbt> dxioVar, dxio<afha> dxioVar2, dqtp dqtpVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dqtpVar;
        this.e = pzj.a(dqtpVar.e);
        this.d = btpcVar.k();
        int i = dqtpVar.a & 1;
        this.f = i != 0 ? dqtpVar.b : dqtpVar.c;
        this.g = i != 0 ? dqtpVar.c : null;
    }

    @Override // defpackage.qab
    public Boolean a() {
        return Boolean.valueOf((this.c.a & 4) != 0);
    }

    @Override // defpackage.qab
    public CharSequence b() {
        dnpq dnpqVar = this.c.d;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }

    @Override // defpackage.qab
    public View.OnClickListener c() {
        dnpq dnpqVar = this.c.d;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return pzi.a(dnpqVar.c, this.b);
    }

    @Override // defpackage.qab
    public Boolean d() {
        return Boolean.valueOf((this.c.a & 8) != 0);
    }

    @Override // defpackage.qab
    public CharSequence e() {
        return this.c.e;
    }

    @Override // defpackage.qab
    public Boolean f() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.qab
    public View.OnClickListener g() {
        Intent intent = new Intent("android.intent.action.DIAL", this.e);
        if (true != this.d) {
            intent = null;
        }
        return new pzi(intent, this.b);
    }

    @Override // defpackage.qab
    public Boolean h() {
        return false;
    }

    @Override // defpackage.qab
    @dzsi
    public String i() {
        return null;
    }

    @Override // defpackage.qab
    @dzsi
    public cjtd j() {
        return null;
    }

    @Override // defpackage.qab
    public View.OnClickListener k() {
        return new pzi(null, this.b);
    }

    @Override // defpackage.xhv
    public String l() {
        return this.f;
    }

    @Override // defpackage.qab
    @dzsi
    /* renamed from: m */
    public String p() {
        return this.g;
    }

    public pyx n() {
        return pyy.b(this.c);
    }

    @Override // defpackage.xhv
    public cqkl o() {
        this.a.a().p(dcdc.f(n()));
        return cqkl.a;
    }
}
