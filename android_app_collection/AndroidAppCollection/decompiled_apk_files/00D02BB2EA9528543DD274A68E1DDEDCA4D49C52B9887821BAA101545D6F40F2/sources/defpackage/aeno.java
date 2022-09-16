package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
/* compiled from: PG */
/* renamed from: aeno  reason: default package */
/* loaded from: classes2.dex */
public class aeno implements aeng {
    public final Activity a;
    public final int b;
    public boolean c;
    public eapg d;
    public eapg e;
    public eapg f;
    public final ddho g;
    public final ddho h;
    @dzsi
    public aenn i;
    @dzsi
    public cjta j;
    @dzsi
    public final cqsn k;
    @dzsi
    public final cqsn l;
    private final int m;
    private final ddho n;
    private cjqm o = cjqm.a;
    @dzsi
    private aenf p;
    @dzsi
    private aenf q;

    public aeno(Activity activity, int i, aekz aekzVar, @dzsi cqsn cqsnVar, @dzsi cqsn cqsnVar2, int i2, eapg eapgVar, eapg eapgVar2, eapg eapgVar3) {
        this.a = activity;
        this.m = i;
        this.n = aekzVar.c();
        ddho a = aekzVar.a();
        dbsk.s(a);
        this.g = a;
        ddho b = aekzVar.b();
        dbsk.s(b);
        this.h = b;
        this.k = cqsnVar;
        this.l = cqsnVar2;
        this.b = i2;
        this.e = eapgVar;
        this.f = eapgVar2;
        this.d = eapgVar3;
    }

    @Override // defpackage.aeng
    public eapg a() {
        return this.d;
    }

    @Override // defpackage.aeng
    public String b() {
        return DateUtils.formatDateTime(this.a, a().n().getTime(), this.b);
    }

    @Override // defpackage.aeng
    public String c() {
        return this.a.getString(this.m, new Object[]{b()});
    }

    @Override // defpackage.aeng
    public cqkl d(cjqm cjqmVar) {
        this.o = cjqmVar;
        aenn aennVar = this.i;
        if (aennVar != null) {
            aennVar.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.aeng
    public Boolean e() {
        return false;
    }

    @Override // defpackage.aeng
    public cjtd f() {
        cjta cjtaVar = this.j;
        if (cjtaVar != null) {
            cjtaVar.d = this.n;
            return cjtaVar.a();
        }
        return cjtd.a(this.n);
    }

    @Override // defpackage.aeng
    @dzsi
    public aenf g() {
        if (!this.c) {
            return null;
        }
        if (this.p == null) {
            this.p = new aenm(this, 1);
        }
        return this.p;
    }

    @Override // defpackage.aeng
    @dzsi
    public aenf h() {
        if (!this.c) {
            return null;
        }
        if (this.q == null) {
            this.q = new aenm(this, 2);
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(eapg eapgVar, eapg eapgVar2) {
        this.e = eapgVar;
        this.f = eapgVar2;
    }

    public void j(@dzsi aenn aennVar) {
        this.i = aennVar;
    }

    public cjqm k() {
        return this.o;
    }

    public void l(eapg eapgVar) {
        this.d = eapgVar;
    }

    public ddho m() {
        return this.n;
    }
}
