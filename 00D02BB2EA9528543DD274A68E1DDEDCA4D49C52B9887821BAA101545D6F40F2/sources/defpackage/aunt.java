package defpackage;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.List;
/* compiled from: PG */
/* renamed from: aunt  reason: default package */
/* loaded from: classes2.dex */
public class aunt implements aunr {
    public int a = -1;
    private final aunq b;
    private final RadioGroup.OnCheckedChangeListener c;
    private final String d;
    @dzsi
    private final String e;
    private final List<dkpr> f;
    @dzsi
    private final String g;
    private final String h;
    private final String i;
    private final List<Integer> j;

    public aunt(aunq aunqVar, dkps dkpsVar, List<Integer> list, String str, String str2) {
        dbsk.l(list.size() == dkpsVar.i.size());
        this.b = aunqVar;
        this.j = list;
        this.i = str;
        this.h = str2;
        this.d = dkpsVar.f;
        int i = dkpsVar.a;
        String str3 = null;
        this.e = (i & 256) != 0 ? dkpsVar.g : null;
        this.f = dkpsVar.i;
        this.g = (i & 1024) != 0 ? dkpsVar.h : str3;
        this.c = new auns(this);
    }

    @Override // defpackage.aunr
    public String a() {
        return this.d;
    }

    @Override // defpackage.aunr
    @dzsi
    public String b() {
        return this.e;
    }

    @Override // defpackage.aunr
    public Integer c() {
        return Integer.valueOf(this.f.size());
    }

    @Override // defpackage.aunr
    public String d(Integer num) {
        return this.f.get(this.j.get(num.intValue()).intValue()).a;
    }

    @Override // defpackage.aunr
    @dzsi
    public String e() {
        return this.g;
    }

    @Override // defpackage.aunr
    public Boolean f(Integer num) {
        return Boolean.valueOf(num.intValue() == this.a);
    }

    @Override // defpackage.aunr
    public RadioGroup.OnCheckedChangeListener g() {
        return this.c;
    }

    @Override // defpackage.aunr
    public cjtd h() {
        cjta b = cjtd.b();
        b.g(this.h);
        b.b = this.i;
        b.d = dtxw.dJ;
        return b.a();
    }

    @Override // defpackage.aunr
    public cqkl i() {
        ((gen) this.b).aT();
        return cqkl.a;
    }

    @Override // defpackage.aunr
    public cqkl j() {
        aunq aunqVar = this.b;
        int intValue = this.j.get(this.a).intValue();
        ((gen) aunqVar).aT();
        ddox bZ = ddpa.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddpa ddpaVar = (ddpa) bZ.b;
        ddpaVar.a |= 1;
        ddpaVar.b = intValue;
        cjta b = cjtd.b();
        auma aumaVar = (auma) aunqVar;
        b.g(aumaVar.ad);
        b.b = aumaVar.g;
        b.d = dtxw.dK;
        b.t(bZ.bK());
        aumaVar.b.m(new cjte(deaf.TAP), b.a());
        if ((aumaVar.e.a & 8) != 0) {
            Toast.makeText(((fd) aunqVar).H(), aumaVar.e.d, 0).show();
        }
        try {
            aumaVar.c.a((auni) dsqw.cq(auni.e, ((fd) aunqVar).o.getByteArray("notification_instance")), 3, 0);
        } catch (dsrm unused) {
        }
        return cqkl.a;
    }

    @Override // defpackage.aunr
    public Boolean k() {
        int i = this.a;
        boolean z = false;
        if (i >= 0 && i < this.f.size()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aunr
    public void l(Bundle bundle) {
        bundle.putInt("feedback_option_checked_position", this.a);
    }

    @Override // defpackage.aunr
    public void m(@dzsi Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getInt("feedback_option_checked_position", this.a);
        }
    }
}
