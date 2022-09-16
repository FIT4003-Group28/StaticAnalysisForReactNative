package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.Set;
/* compiled from: PG */
/* renamed from: abec  reason: default package */
/* loaded from: classes.dex */
public final class abec {
    private final String a;
    private final aaqf b;
    private final afvn c;
    private final aadd d;
    private final boolean e;
    private final Set f;
    private final axwp g;

    public abec(ampq ampqVar, aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, aacz aaczVar, aadd aaddVar, Set set, axwp axwpVar) {
        this.a = ampqVar.h() ? (String) ampqVar.c() : "next";
        aaqjVar.getClass();
        aaqfVar.getClass();
        this.b = aaqfVar;
        afvnVar.getClass();
        this.c = afvnVar;
        this.e = aadf.b(aaczVar);
        aaddVar.getClass();
        this.d = aaddVar;
        set.getClass();
        this.f = set;
        this.g = axwpVar;
    }

    public final abed a(String str, String str2, int i, String str3, byte[] bArr, yre yreVar) {
        abed b = b();
        str2.getClass();
        b.a = str2;
        b.b = i;
        b.v(str);
        b.u(str3);
        b.k(bArr);
        b.p = yreVar;
        return b;
    }

    public final abed b() {
        Boolean bool;
        Optional of;
        String str = this.a;
        aaqf aaqfVar = this.b;
        afvm c = this.c.c();
        boolean z = this.e;
        aqxe aqxeVar = this.g.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z2 = false;
        if (aqxeVar.a(45353255L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353255L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353255L);
            if (aqxfVar.b == 1) {
                z2 = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            of = Optional.empty();
        } else {
            athe atheVar = this.d.a().f;
            if (atheVar == null) {
                atheVar = athe.a;
            }
            awet awetVar = atheVar.l;
            if (awetVar == null) {
                awetVar = awet.a;
            }
            aopa createBuilder = awvn.a.createBuilder();
            boolean z3 = awetVar.b;
            createBuilder.copyOnWrite();
            awvn awvnVar = (awvn) createBuilder.instance;
            awvnVar.b = 1 | awvnVar.b;
            awvnVar.c = z3;
            aorw g = apfb.g(Instant.now().plusMillis(awetVar.c));
            createBuilder.copyOnWrite();
            awvn awvnVar2 = (awvn) createBuilder.instance;
            g.getClass();
            awvnVar2.d = g;
            awvnVar2.b |= 2;
            of = Optional.of((awvn) createBuilder.mo39build());
        }
        Optional optional = of;
        c.getClass();
        abed abedVar = new abed(str, aaqfVar, c, z, optional);
        for (abea abeaVar : this.f) {
            if (abeaVar != null) {
                abeaVar.nq(abedVar);
            }
        }
        return abedVar;
    }
}
