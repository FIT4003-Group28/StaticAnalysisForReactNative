package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ksl  reason: default package */
/* loaded from: classes3.dex */
public final class ksl implements ksm {
    private final atqb a;

    public ksl(atqb atqbVar) {
        this.a = atqbVar;
    }

    @Override // defpackage.ksm
    public final apzg a() {
        apzg apzgVar = this.a.f;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.ksm
    public final arag b() {
        arag aragVar = this.a.c;
        return aragVar == null ? arag.a : aragVar;
    }

    @Override // defpackage.ksm
    public final arag c() {
        arag aragVar = this.a.b;
        return aragVar == null ? arag.a : aragVar;
    }

    @Override // defpackage.ksm
    public final avhn d() {
        avhn avhnVar = this.a.i;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    @Override // defpackage.ksm
    public final List e() {
        return this.a.d;
    }

    @Override // defpackage.ksm
    public final List f() {
        return this.a.e;
    }

    @Override // defpackage.ksm
    public final byte[] g() {
        return null;
    }

    @Override // defpackage.ksm
    public final int h() {
        int o = akzj.o(this.a.h);
        if (o == 0) {
            return 1;
        }
        return o;
    }
}
