package defpackage;
/* compiled from: PG */
/* renamed from: cvrm  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvrm implements cvql {
    public static cvrm e(cvrl cvrlVar, dbty<dbsg<Float>> dbtyVar) {
        return new cvrk(cvrlVar, dbtyVar);
    }

    @Override // defpackage.cvql
    public final float a(dsfz dsfzVar) {
        return c(dsfzVar).a;
    }

    @Override // defpackage.cvql
    public final dbsg<Float> b(dsfz dsfzVar) {
        int a;
        dclz<Comparable> dclzVar;
        dbsg<Float> d = d();
        if (!d.a()) {
            return dbpy.a;
        }
        for (dsfj dsfjVar : c(dsfzVar).b) {
            dses dsesVar = dsfjVar.a;
            if (dsesVar == null) {
                dsesVar = dses.e;
            }
            int a2 = dseq.a(dsesVar.a);
            int i = 1;
            if ((a2 == 0 || a2 == 1) && ((a = dseq.a(dsesVar.c)) == 0 || a == 1)) {
                dclzVar = dclz.a;
            } else {
                int a3 = dseq.a(dsesVar.c);
                if (a3 != 0 && a3 != 1) {
                    int a4 = dseq.a(dsesVar.a);
                    if (a4 == 0 || a4 == 1) {
                        Float valueOf = Float.valueOf(dsesVar.d);
                        int a5 = dseq.a(dsesVar.c);
                        if (a5 != 0) {
                            i = a5;
                        }
                        dclzVar = dclz.k(valueOf, dsei.a(i));
                    } else {
                        Float valueOf2 = Float.valueOf(dsesVar.b);
                        int a6 = dseq.a(dsesVar.a);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        dbyz a7 = dsei.a(a6);
                        Float valueOf3 = Float.valueOf(dsesVar.d);
                        int a8 = dseq.a(dsesVar.c);
                        if (a8 != 0) {
                            i = a8;
                        }
                        dclzVar = dclz.h(valueOf2, a7, valueOf3, dsei.a(i));
                    }
                } else {
                    Float valueOf4 = Float.valueOf(dsesVar.b);
                    int a9 = dseq.a(dsesVar.a);
                    if (a9 != 0) {
                        i = a9;
                    }
                    dclzVar = dclz.m(valueOf4, dsei.a(i));
                }
            }
            if (dclzVar.a(d.b())) {
                return dbsg.i(Float.valueOf(dsfjVar.b));
            }
        }
        return dbpy.a;
    }

    protected abstract dsfk c(dsfz dsfzVar);

    protected abstract dbsg<Float> d();
}
