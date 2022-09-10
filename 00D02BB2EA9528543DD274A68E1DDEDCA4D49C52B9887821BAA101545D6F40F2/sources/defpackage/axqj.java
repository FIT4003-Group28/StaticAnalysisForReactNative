package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axqj  reason: default package */
/* loaded from: classes3.dex */
public class axqj implements axoq {
    public final dzsj<gga> a;
    public final axot b;
    @dzsi
    public jht c;
    private final Executor d;
    private final dqkn e;
    private final axog f;
    private final axhs g;
    private boolean h;

    public axqj(axoi axoiVar, dzsj<gga> dzsjVar, Executor executor, dqae dqaeVar, axot axotVar, axhs axhsVar) {
        this.a = dzsjVar;
        this.d = executor;
        dqau dqauVar = dqaeVar.b;
        dqkn dqknVar = (dqauVar == null ? dqau.e : dqauVar).b;
        this.e = dqknVar == null ? dqkn.e : dqknVar;
        this.g = axhsVar;
        dqau dqauVar2 = dqaeVar.b;
        this.f = axoiVar.a(dqauVar2 == null ? dqau.e : dqauVar2);
        this.b = axotVar;
        this.h = false;
        this.c = jhv.h().b();
    }

    @Override // defpackage.axoq
    public axog a() {
        return this.f;
    }

    @Override // defpackage.axoq
    public cjtd b() {
        return this.b.i();
    }

    @Override // defpackage.axoq
    public Boolean c() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.axoq
    public cqkl d() {
        this.h = true;
        cqkx.p(this);
        deha.q(this.g.f(this.e.d), new axqg(this), this.d);
        return cqkl.a;
    }

    @Override // defpackage.axoq
    public cqkl e() {
        this.h = true;
        cqkx.p(this);
        deha.q(this.g.g(this.e.d), new axqh(this), this.d);
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof axqj)) {
            return false;
        }
        axqj axqjVar = (axqj) obj;
        return dbsd.a(this.b, axqjVar.b) && dbsd.a(this.e.d, axqjVar.e.d);
    }

    @Override // defpackage.axoq
    public cjtd f() {
        return cjtd.a(dtxy.M);
    }

    @Override // defpackage.axoq
    public cjtd g() {
        return cjtd.a(dtxy.O);
    }

    @Override // defpackage.axoq
    @dzsi
    public jht h() {
        return this.c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.e.d});
    }

    @Override // defpackage.axoq
    public String i() {
        return this.a.a().getString(R.string.REJECT_BUTTON_CONTENT_DESCRIPTION_WITH_DISPLAY_NAME, new Object[]{this.e.b});
    }

    @Override // defpackage.axoq
    public String j() {
        return this.a.a().getString(R.string.APPROVE_BUTTON_CONTENT_DESCRIPTION_WITH_DISPLAY_NAME, new Object[]{this.e.b});
    }

    @Override // defpackage.axos
    public dqkn k() {
        return this.e;
    }

    @Override // defpackage.axos
    public void l(cqiv cqivVar) {
        cqivVar.a(new axma(), this);
    }

    public final void m(String str) {
        Toast.makeText(this.a.a(), str, 0).show();
    }
}
