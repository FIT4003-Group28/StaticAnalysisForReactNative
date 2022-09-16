package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aivo  reason: default package */
/* loaded from: classes.dex */
public final class aivo {
    public final aivk a;
    public final Map b = new HashMap();
    private final aisp c;
    private final aynx d;
    private final aynx e;
    private final aynx f;
    private final aynx g;

    public aivo(aivk aivkVar, aisp aispVar, aynx aynxVar, aynx aynxVar2, aynx aynxVar3, aynx aynxVar4) {
        this.a = aivkVar;
        this.c = aispVar;
        this.d = aynxVar;
        this.e = aynxVar2;
        this.f = aynxVar3;
        this.g = aynxVar4;
    }

    public final void a() {
        new aypf().g(this.d.Z(new aivn(this, 5)), this.e.Z(new aivn(this, 6)), aiwv.j(this.f, aihl.s).u(zwb.q).Z(new aivn(this)), aiwv.j(this.g, aihl.r).Z(new aivn(this, 1)), this.c.i.Z(new aivn(this, 4)), this.c.d.Z(new aivn(this, 3)), this.c.a.Z(new aivn(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahgl ahglVar) {
        aivl aivlVar = ahglVar.a() != null ? (aivl) this.b.get(ahglVar.a()) : null;
        if (aivlVar != null) {
            aivlVar.k = false;
            aivlVar.i(3);
        }
    }
}
