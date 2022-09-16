package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cqc  reason: default package */
/* loaded from: classes3.dex */
public final class cqc implements cie {
    private final cpl a;
    private final clb b;

    public cqc(cpl cplVar, clb clbVar) {
        this.a = cplVar;
        this.b = clbVar;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        cpz cpzVar;
        boolean z;
        cuv cuvVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof cpz) {
            cpzVar = (cpz) inputStream;
            z = false;
        } else {
            cpzVar = new cpz(inputStream, this.b);
            z = true;
        }
        synchronized (cuv.a) {
            cuvVar = (cuv) cuv.a.poll();
        }
        if (cuvVar == null) {
            cuvVar = new cuv();
        }
        cuvVar.b = cpzVar;
        cva cvaVar = new cva(cuvVar);
        cqb cqbVar = new cqb(cpzVar, cuvVar);
        try {
            cpl cplVar = this.a;
            cku a = cplVar.a(new cps(cvaVar, cplVar.g, cplVar.f), i, i2, cicVar, cqbVar);
            cuvVar.a();
            if (z) {
                cpzVar.b();
            }
            return a;
        } catch (Throwable th) {
            cuvVar.a();
            if (z) {
                cpzVar.b();
            }
            throw th;
        }
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
