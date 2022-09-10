package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: moj  reason: default package */
/* loaded from: classes7.dex */
public class moj extends moo {
    final /* synthetic */ mor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moj(mor morVar) {
        super(morVar);
        this.b = morVar;
    }

    @Override // defpackage.moo
    @dzsi
    public final cqtd a() {
        return this.b.i;
    }

    @Override // defpackage.moo
    public final int b() {
        if (this.b.q) {
            return R.string.CAR_RESTART_NAVIGATION;
        }
        return 0;
    }

    @Override // defpackage.moo
    @dzsi
    public final ddho c() {
        mor morVar = this.b;
        return morVar.q ? dtxm.dc : morVar.m.size() > 1 ? dtxm.cO : dtxm.da;
    }

    @Override // defpackage.moo
    public final boolean d() {
        return this.b.q;
    }

    @Override // defpackage.moo
    public boolean e() {
        return true;
    }

    @Override // defpackage.moo
    public moo g() {
        return new moi(this.b);
    }

    @Override // defpackage.moo
    public void h() {
        this.b.s();
    }

    @Override // defpackage.moo
    public final CharSequence m() {
        if (this.b.e.a() == 0) {
            return "";
        }
        mor morVar = this.b;
        mog mogVar = morVar.h;
        nce nceVar = morVar.e;
        return mogVar.a(nceVar.b(nceVar.m()));
    }

    @Override // defpackage.moo
    public final boolean n() {
        if (this.b.e.a() == 0) {
            return false;
        }
        nce nceVar = this.b.e;
        return TimeUnit.SECONDS.toHours((long) nceVar.b(nceVar.m())) > 0;
    }

    @Override // defpackage.moo
    public final knz o() {
        if (this.b.e.a() == 0) {
            return kob.a;
        }
        nce nceVar = this.b.e;
        return kob.a(nceVar.t(nceVar.m()));
    }

    @Override // defpackage.moo
    public final iuv p() {
        if (this.b.e.a() == 0) {
            return super.p();
        }
        if (this.b.e.i(0)) {
            return nql.bq;
        }
        nce nceVar = this.b.e;
        return nql.c(nceVar.l(nceVar.m()), this.b.a);
    }

    @Override // defpackage.moo
    public final CharSequence q() {
        if (this.b.e.a() == 0) {
            return "";
        }
        mor morVar = this.b;
        mog mogVar = morVar.h;
        nce nceVar = morVar.e;
        int d = nceVar.d(nceVar.m());
        nce nceVar2 = this.b.e;
        return mogVar.b(d, nceVar2.e(nceVar2.m()));
    }

    @Override // defpackage.moo
    public final CharSequence r() {
        if (this.b.e.a() == 0) {
            return "";
        }
        nce nceVar = this.b.e;
        return nceVar.u(nceVar.m());
    }
}
