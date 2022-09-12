package defpackage;
/* compiled from: PG */
/* renamed from: anmq  reason: default package */
/* loaded from: classes2.dex */
public final class anmq {
    private static final dcqe b = dcqe.c("anmq");
    public final dbsg<dvas> a;
    private final float c;

    public anmq(dbsg<dvas> dbsgVar, float f) {
        this.a = dbsgVar;
        this.c = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anmq a(dvas dvasVar, float f) {
        return new anmq(dbsg.i(dvasVar), f);
    }

    public static akqi d(@dzsi String str) {
        if (!dbsj.d(str)) {
            try {
                return akqi.b(str);
            } catch (IllegalArgumentException unused) {
                return akqi.a;
            }
        }
        return akqi.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anmq j(dvyw dvywVar) {
        dvar bZ = dvas.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvas dvasVar = (dvas) bZ.b;
        dvywVar.getClass();
        dvasVar.b = dvywVar;
        dvasVar.a |= 1;
        return new anmq(dbsg.i(bZ.bK()), 0.0f);
    }

    public final float b() {
        return this.c;
    }

    public final String c() {
        if (!this.a.a()) {
            return "";
        }
        dvyw dvywVar = this.a.b().b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        return dvywVar.g;
    }

    public final boolean e() {
        if (this.a.a()) {
            dvyw dvywVar = this.a.b().b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            return (dvywVar.a & 4) != 0;
        }
        return false;
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return (this.a.c(dvas.g).a & 4) != 0;
    }

    public final anmq h() {
        if (!this.a.a()) {
            bvoo.h("Candidate not present when making the location high confidence.", new Object[0]);
            return this;
        }
        return new anmq(dbsg.i(this.a.b()), 100.0f);
    }

    public final anmq i() {
        if (!this.a.a()) {
            bvoo.h("Candidate not present when making the location low confidence.", new Object[0]);
            return this;
        }
        return new anmq(dbsg.i(this.a.b()), 0.0f);
    }

    public final /* bridge */ /* synthetic */ void k(anmq anmqVar) {
    }

    public final /* bridge */ /* synthetic */ void l() {
    }
}
