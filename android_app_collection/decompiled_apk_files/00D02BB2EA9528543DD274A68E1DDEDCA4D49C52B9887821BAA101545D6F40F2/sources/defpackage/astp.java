package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: astp  reason: default package */
/* loaded from: classes2.dex */
public class astp extends astr {
    public int a;
    private final dxio<brlh> c;
    private final Executor d;
    private final asto e;
    private final crzp<daqq> f;

    public astp(Context context, cqhn cqhnVar, btrm btrmVar, dxio<brlh> dxioVar, Executor executor) {
        super(context, cqhnVar, btrmVar, null, true);
        this.e = new asto();
        this.a = 1;
        this.f = new astn(this);
        this.c = dxioVar;
        this.d = executor;
    }

    @Override // defpackage.astr
    public void a() {
        super.a();
        this.c.a().k().d(this.f, this.d);
        brlh a = this.c.a();
        asto astoVar = this.e;
        if (a.t == null) {
            a.t = astoVar;
        }
    }

    @Override // defpackage.astr
    public void b() {
        brlh a = this.c.a();
        if (a.t != null) {
            a.t = null;
        }
        this.c.a().k().c(this.f);
        super.b();
    }

    @Override // defpackage.astr, defpackage.asun
    public Boolean c() {
        boolean z = false;
        if (super.c().booleanValue() && this.a == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.astr, defpackage.asun
    public cqkl d() {
        this.c.a().j();
        return cqkl.a;
    }

    @Override // defpackage.astr, defpackage.asun
    public Integer e() {
        int i = this.b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
            return Integer.valueOf((i2 == 3 || i2 == 4 || i2 == 6) ? 11 : 10);
        }
        throw null;
    }

    @Override // defpackage.astr, defpackage.asun
    /* renamed from: f */
    public asto h() {
        return this.e;
    }

    @Override // defpackage.astr, defpackage.asun
    public csao g() {
        return this.e;
    }
}
