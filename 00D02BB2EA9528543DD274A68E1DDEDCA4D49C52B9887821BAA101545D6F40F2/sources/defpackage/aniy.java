package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aniy  reason: default package */
/* loaded from: classes2.dex */
public class aniy implements aniu {
    private final bbb a;
    private final anis b;
    private final aniv c;
    private final anil<eapy, anjl> d;
    private final aniw e;

    public aniy(anis anisVar, anit anitVar, cjyb cjybVar, aniv anivVar, anix anixVar, cjqy cjqyVar) {
        anil<eapy, anjl> anilVar = new anil<>(anixVar, anivVar, new anii(cjybVar));
        this.b = anisVar;
        this.c = anivVar;
        this.d = anilVar;
        aniw aniwVar = new aniw(this, anitVar);
        this.e = aniwVar;
        anivVar.a = this;
        anilVar.c.add(aniwVar);
        this.a = apkb.d(new apjx(cjybVar), new anin(anilVar, cjqyVar));
    }

    @Override // defpackage.aniu
    public List<anji> a() {
        anil<eapy, anjl> anilVar = this.d;
        dccx F = dcdc.F();
        Iterator<anik<eapy, anjl>> it = anilVar.b.iterator();
        while (it.hasNext()) {
            F.g(it.next().b());
        }
        return dcdc.r(F.f());
    }

    @Override // defpackage.aniu
    public Integer b() {
        return Integer.valueOf(this.d.b());
    }

    @Override // defpackage.aniu
    public bbb c() {
        return this.a;
    }

    @Override // defpackage.aniu
    public cqkl d(eapg eapgVar) {
        this.b.a(eapgVar);
        return cqkl.a;
    }

    public void e(eapy eapyVar) {
        anil<eapy, anjl> anilVar = this.d;
        while (!anilVar.a()) {
            anilVar.e();
        }
        anik<eapy, anjl> c = anik.c(eapyVar, anilVar.a.a(eapyVar));
        anilVar.b.addLast(c);
        anilVar.d = 0;
        anilVar.f(c);
        anilVar.g(c);
        anilVar.d();
    }
}
