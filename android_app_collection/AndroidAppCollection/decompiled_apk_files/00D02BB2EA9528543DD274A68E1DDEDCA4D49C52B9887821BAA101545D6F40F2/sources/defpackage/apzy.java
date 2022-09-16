package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: apzy  reason: default package */
/* loaded from: classes2.dex */
public class apzy {
    public final dxio<btvo> a;
    public final apyx b;
    private final dxio<btwr> c;

    public apzy(dxio<btvo> dxioVar, dxio<btwr> dxioVar2, apyx apyxVar) {
        this.a = dxioVar;
        this.c = dxioVar2;
        this.b = apyxVar;
    }

    public final boolean a() {
        return this.b.a();
    }

    public final boolean b() {
        return this.a.a().getBusinessMessagingParameters().l || this.a.a().getBusinessMessagingParameters().m;
    }

    public final boolean c() {
        return this.a.a().getBusinessMessagingParameters().m;
    }

    public final boolean d() {
        return a() && this.a.a().getBusinessMessagingParameters().q;
    }

    public final boolean e() {
        return this.a.a().getBusinessMessagingParameters().H;
    }

    public final boolean f() {
        return Build.VERSION.SDK_INT >= 24 && this.a.a().getBusinessMessagingParameters().A;
    }

    public final boolean g() {
        return this.a.a().getBusinessMessagingParameters().C;
    }

    public final boolean h() {
        return this.b.b() && this.a.a().getBusinessMessagingParameters().T;
    }

    public final boolean i(btlu btluVar) {
        return this.b.c(btluVar) && this.c.a().b(btluVar).getBusinessMessagingParameters().I;
    }

    public final boolean j() {
        return i(null);
    }

    public final boolean k() {
        dkht businessMessagingParameters = this.a.a().getBusinessMessagingParameters();
        return j() && businessMessagingParameters.X && (businessMessagingParameters.a & 16) != 0;
    }

    public final boolean l() {
        return this.c.a().a().getBusinessMessagingParameters().ab;
    }

    public final int m() {
        int a = dkho.a(this.a.a().getBusinessMessagingParameters().n);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
