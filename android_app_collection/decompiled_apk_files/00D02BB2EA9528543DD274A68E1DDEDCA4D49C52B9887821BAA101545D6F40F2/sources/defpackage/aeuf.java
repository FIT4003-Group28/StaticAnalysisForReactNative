package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aeuf  reason: default package */
/* loaded from: classes2.dex */
public class aeuf implements Serializable, aeue {
    private final ilo a;
    private final bvrt<dtaq> b;

    private aeuf(ilo iloVar, dtaq dtaqVar) {
        this.a = iloVar;
        this.b = bvrt.b(dtaqVar);
    }

    @dzsi
    public static aeuf i(@dzsi ilo iloVar, dtaq dtaqVar) {
        if (iloVar == null) {
            return null;
        }
        return new aeuf(iloVar, dtaqVar);
    }

    @Override // defpackage.aeue
    public final String a() {
        return this.a.q();
    }

    @Override // defpackage.aeue
    public final String b() {
        ilo iloVar = this.a;
        dndr dndrVar = iloVar.p;
        if (dndrVar == null) {
            return "";
        }
        int ordinal = dndrVar.ordinal();
        if (ordinal == 1) {
            return dbsj.e(iloVar.G());
        }
        if (ordinal != 2) {
            return "";
        }
        if (dbsj.d(iloVar.ar())) {
            return dbsj.e(iloVar.G());
        }
        return iloVar.ar();
    }

    @Override // defpackage.aeue
    public final akqi c() {
        return this.a.ai();
    }

    @Override // defpackage.aeue
    public final String d() {
        return this.a.v();
    }

    @Override // defpackage.aeue
    public final cjtd e() {
        return this.a.bZ();
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof aeuf) {
            return this.a.equals(((aeuf) obj).a);
        }
        return false;
    }

    @Override // defpackage.aeue
    public final bwrs<ilo> f() {
        return bwrs.a(this.a);
    }

    @Override // defpackage.aeue
    @dzsi
    public final ahmv g() {
        akqi c = c();
        if (c == null || akqi.a.equals(c)) {
            return null;
        }
        return new ahmv(this.b.e((dssr) dtaq.m.cu(7), dtaq.m));
    }

    @Override // defpackage.aeue
    public final float h() {
        return this.b.e((dssr) dtaq.m.cu(7), dtaq.m).h / 100.0f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
