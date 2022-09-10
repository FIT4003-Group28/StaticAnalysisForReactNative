package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: alnj  reason: default package */
/* loaded from: classes2.dex */
final class alnj implements dbsl<dmpn> {
    final /* synthetic */ akra a;

    public alnj(akra akraVar) {
        this.a = akraVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi dmpn dmpnVar) {
        dmpn dmpnVar2 = dmpnVar;
        if (dmpnVar2 != null && !akqi.e(akxf.b(dmpnVar2)) && !akxf.n(dmpnVar2)) {
            akra akraVar = alns.b;
            akraVar.a = 0;
            akraVar.b = 0;
            akraVar.c = 0;
            try {
                if ((dmpnVar2.a & 4) != 0) {
                    akqn akqnVar = alns.a;
                    dmlq dmlqVar = dmpnVar2.d;
                    if (dmlqVar == null) {
                        dmlqVar = dmlq.e;
                    }
                    dmls dmlsVar = dmlqVar.b;
                    if (dmlsVar == null) {
                        dmlsVar = dmls.c;
                    }
                    akqnVar.i(dmlsVar.b, akraVar);
                }
            } catch (IOException unused) {
            }
            return alns.b.equals(this.a);
        }
        return false;
    }
}
