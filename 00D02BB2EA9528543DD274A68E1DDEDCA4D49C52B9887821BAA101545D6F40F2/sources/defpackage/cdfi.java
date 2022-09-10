package defpackage;
/* compiled from: PG */
/* renamed from: cdfi  reason: default package */
/* loaded from: classes4.dex */
public final class cdfi {
    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static eaol a(dwfl dwflVar) {
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        if ((diisVar.a & 2) != 0) {
            dizh dizhVar2 = dwflVar.p;
            if (dizhVar2 == null) {
                dizhVar2 = dizh.j;
            }
            diis diisVar2 = dizhVar2.g;
            if (diisVar2 == null) {
                diisVar2 = diis.h;
            }
            dhpf dhpfVar = diisVar2.e;
            if (dhpfVar == null) {
                dhpfVar = dhpf.i;
            }
            try {
                return new eaol(dhpfVar.b, dhpfVar.c, dhpfVar.d, dhpfVar.e, dhpfVar.f);
            } catch (eapc unused) {
            }
        }
        return null;
    }
}
