package defpackage;

import android.content.Intent;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: arhf  reason: default package */
/* loaded from: classes2.dex */
public class arhf implements Serializable, ilg {
    @dzsi
    private final bvrt<dvcj> a;
    private final amvh b;

    public arhf(akra akraVar, @dzsi dvcj dvcjVar) {
        this.a = bvrt.a(dvcjVar);
        amvg P = amvh.P();
        P.j = dvcjVar == null ? "" : dvcjVar.a;
        P.d(akraVar);
        this.b = P.a();
    }

    @Override // defpackage.ilg
    public final cjtd a() {
        return null;
    }

    @Override // defpackage.ilg
    public final Intent b() {
        return null;
    }

    @Override // defpackage.ilg
    public final Integer c() {
        return null;
    }

    @Override // defpackage.ilg
    public final amvh d() {
        return this.b;
    }

    @Override // defpackage.ilg
    public final boolean e() {
        return false;
    }

    @dzsi
    public final dvcj f() {
        return (dvcj) bvrt.f(this.a, (dssr) dvcj.d.cu(7), dvcj.d);
    }
}
