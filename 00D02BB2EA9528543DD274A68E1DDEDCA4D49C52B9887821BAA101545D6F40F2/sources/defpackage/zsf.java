package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: zsf  reason: default package */
/* loaded from: classes7.dex */
public class zsf implements Serializable, zef {
    private final zvb a;
    private final cjtd b;
    @dzsi
    private final jhk c;
    @dzsi
    private final jhk d;
    @dzsi
    private final jhk e;
    @dzsi
    private final Integer f;
    @dzsi
    private final String g;
    @dzsi
    private final String h;
    @dzsi
    private final zvb i;
    @dzsi
    private final akqi j;
    @dzsi
    private final transient View.OnClickListener k;

    public zsf(vtn vtnVar, List<dpce> list) {
        this(vtnVar, list, null);
    }

    @Override // defpackage.zef
    public zvb e() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsf)) {
            return false;
        }
        zsf zsfVar = (zsf) obj;
        return dbsd.a(this.c, zsfVar.c) && dbsd.a(this.a, zsfVar.a);
    }

    @Override // defpackage.zef
    @dzsi
    public String f() {
        return this.g;
    }

    @Override // defpackage.zef
    @dzsi
    public jhk g() {
        jhk jhkVar = this.c;
        return jhkVar != null ? jhkVar : this.d;
    }

    @Override // defpackage.zef
    @dzsi
    public jhk h() {
        return this.c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a});
    }

    @Override // defpackage.zef
    @dzsi
    public akqi i() {
        return this.j;
    }

    @Override // defpackage.zef
    @dzsi
    public jhk j() {
        if (this.i == null) {
            return this.c;
        }
        return null;
    }

    @Override // defpackage.zef
    @dzsi
    public String k() {
        return this.h;
    }

    @Override // defpackage.zef
    @dzsi
    public zvb l() {
        return this.i;
    }

    @Override // defpackage.zef
    @dzsi
    public View.OnClickListener m() {
        return this.k;
    }

    @Override // defpackage.zef
    public cjtd n() {
        return this.b;
    }

    @Override // defpackage.zef
    @dzsi
    public jhk o() {
        return this.d;
    }

    @Override // defpackage.zef
    @dzsi
    public jhk p() {
        return this.e;
    }

    @Override // defpackage.zef
    @dzsi
    public Integer q() {
        return this.f;
    }

    public zsf(vtn vtnVar, List<dpce> list, @dzsi jhk jhkVar) {
        this(vtnVar, list, jhkVar, null, null, null, null, cjtd.b);
    }

    public zsf(vtn vtnVar, List<dpce> list, @dzsi jhk jhkVar, @dzsi jhk jhkVar2, @dzsi Integer num, @dzsi akqi akqiVar, @dzsi View.OnClickListener onClickListener, cjtd cjtdVar) {
        jhk jhkVar3;
        dooj doojVar = dooj.UNKNOWN;
        this.k = onClickListener;
        this.b = cjtdVar;
        dcdc r = dcdc.r(list);
        this.a = new zvb(r, vtj.TRANSIT_AUTO);
        this.g = alcf.r(r);
        this.h = alcf.q(r);
        String b = alcf.b(r);
        String d = alcf.d(r);
        zvb zvbVar = null;
        if (b == null || vtnVar.a(b, vtj.TRANSIT_AUTO) == null) {
            jhkVar3 = null;
        } else {
            jhkVar3 = new jhk(b, vtj.TRANSIT_AUTO, dbsj.d(d) ? dbpy.a : dbsg.i(d), dbpy.a, dbpy.a);
        }
        this.c = jhkVar3;
        if (jhkVar != null) {
            this.d = jhkVar;
        } else {
            String f = alcf.f(list);
            this.d = f == null ? null : new jhk(f);
        }
        this.e = jhkVar2;
        this.f = num;
        this.j = akqiVar;
        dpce m = alcf.m(r);
        this.i = m != null ? new zvb(m) : zvbVar;
    }
}
