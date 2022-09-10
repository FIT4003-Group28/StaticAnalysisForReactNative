package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cojz  reason: default package */
/* loaded from: classes5.dex */
public final class cojz extends coke {
    final /* synthetic */ cnsd a;
    final /* synthetic */ cokf b;

    public cojz(cokf cokfVar, cnsd cnsdVar) {
        this.b = cokfVar;
        this.a = cnsdVar;
    }

    @Override // defpackage.cnsr
    public final /* bridge */ /* synthetic */ void a(conr conrVar, cpct<Boolean> cpctVar) {
        conr conrVar2 = conrVar;
        if (this.c) {
            cpct<Boolean> cpctVar2 = cpctVar;
            try {
                conrVar2.Y(this.a.b, new coka(cpctVar2));
            } catch (RuntimeException e) {
                cpctVar2.d(e);
            }
        }
    }
}
