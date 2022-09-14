package defpackage;

import android.content.Context;
import android.content.res.Resources;
import defpackage.crqy;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atsu  reason: default package */
/* loaded from: classes2.dex */
public abstract class atsu<T extends crqy> extends atss<T> {
    public boolean a;
    public final boolean b;
    private final atst c;

    /* JADX INFO: Access modifiers changed from: protected */
    public atsu(T t, Context context, btrm btrmVar, btvo btvoVar, cref crefVar, Resources resources, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, long j, boolean z2) {
        super(t, context, btrmVar, btvoVar, crefVar, resources, cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, j);
        this.c = new atst(this);
        this.b = z2;
    }

    @Override // defpackage.atss, defpackage.atxz
    public synchronized void Oa() {
        if (((crqy) this.e).g != 1) {
            d(false);
        } else {
            this.a = true;
            btrm btrmVar = this.g;
            atst atstVar = this.c;
            dceq a = dcet.a();
            a.b(crht.class, new atsv(crht.class, atstVar, bvrj.UI_THREAD));
            btrmVar.g(atstVar, a.a());
        }
        super.Oa();
    }

    @Override // defpackage.atss, defpackage.atxz
    public synchronized void Ob() {
        if (this.a) {
            this.a = false;
            atsv.b(this.g, this.c);
        }
        super.Ob();
    }

    @Override // defpackage.atss, defpackage.atxz
    public Boolean c() {
        boolean z = true;
        if (((crqy) this.e).g != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        int i = ((crqy) this.e).g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            f();
        } else if (i2 == 2) {
            e();
        }
        if (z && !r()) {
            q();
        }
        cqkx.p(this);
    }

    protected abstract void e();

    protected void f() {
        crqx n = ((crqy) this.e).n();
        if (n == null) {
            return;
        }
        this.v = cjtd.a(n.b);
        atsm S = S(true);
        S.h = cjtd.a(n.c);
        L(S.a());
        this.p = this.j.getString(n.a);
        H(iva.g(2131232649, 2131232651));
        an();
    }
}
