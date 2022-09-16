package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: tnj  reason: default package */
/* loaded from: classes4.dex */
public final class tnj implements tlp, tng {
    private final angg a;
    private final List b;
    private final tmd c;
    private final long d;
    private final boolean e = false;

    public tnj(angg anggVar, List list, tmd tmdVar, long j, boolean z) {
        this.a = anggVar;
        this.b = list;
        this.c = tmdVar;
        this.d = j;
    }

    @Override // defpackage.tng
    public /* synthetic */ tmh a() {
        return tnk.d(this);
    }

    @Override // defpackage.tng
    public List b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public tmd d() {
        return this.c;
    }

    public /* synthetic */ tmh e() {
        return tnk.e(this);
    }

    public angg f() {
        return this.a;
    }

    public boolean g() {
        return this.e;
    }

    public String toString() {
        ampp c = akzj.c(this);
        angf angfVar = a().d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        c.e("rootVeId", angfVar.d);
        angf angfVar2 = e().d;
        if (angfVar2 == null) {
            angfVar2 = angf.a;
        }
        c.e("targetVeId", angfVar2.d);
        return c.toString();
    }
}
