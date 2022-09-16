package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ksk  reason: default package */
/* loaded from: classes3.dex */
public final class ksk implements ksm {
    private final apof a;

    public ksk(apof apofVar) {
        this.a = apofVar;
    }

    @Override // defpackage.ksm
    public final apzg a() {
        apof apofVar = this.a;
        if ((apofVar.b & 4) != 0) {
            apzg apzgVar = apofVar.g;
            return apzgVar == null ? apzg.a : apzgVar;
        }
        return null;
    }

    @Override // defpackage.ksm
    public final arag b() {
        arag aragVar = this.a.d;
        return aragVar == null ? arag.a : aragVar;
    }

    @Override // defpackage.ksm
    public final arag c() {
        arag aragVar = this.a.c;
        return aragVar == null ? arag.a : aragVar;
    }

    @Override // defpackage.ksm
    public final avhn d() {
        apof apofVar = this.a;
        if ((apofVar.b & 64) != 0) {
            avhn avhnVar = apofVar.k;
            return avhnVar == null ? avhn.a : avhnVar;
        }
        return null;
    }

    @Override // defpackage.ksm
    public final List e() {
        return this.a.e;
    }

    @Override // defpackage.ksm
    public final List f() {
        return this.a.f;
    }

    @Override // defpackage.ksm
    public final byte[] g() {
        return this.a.l.I();
    }

    @Override // defpackage.ksm
    public final int h() {
        apof apofVar = this.a;
        if ((apofVar.b & 32) != 0) {
            int o = akzj.o(apofVar.j);
            if (o != 0) {
                return o;
            }
            return 1;
        }
        return 0;
    }
}
