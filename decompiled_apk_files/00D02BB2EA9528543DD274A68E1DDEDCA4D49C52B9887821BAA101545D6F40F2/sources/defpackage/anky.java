package defpackage;
/* compiled from: PG */
/* renamed from: anky  reason: default package */
/* loaded from: classes2.dex */
final class anky implements btzi<duzc, duzk> {
    private final ania a;

    public anky(ania aniaVar) {
        this.a = aniaVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duzc> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duzc> btzrVar, duzk duzkVar) {
        duzk duzkVar2 = duzkVar;
        dvbd dvbdVar = duzkVar2.e;
        if (dvbdVar == null) {
            dvbdVar = dvbd.d;
        }
        if ((dvbdVar.a & 2) != 0) {
            ania aniaVar = this.a;
            dvbd dvbdVar2 = duzkVar2.e;
            if (dvbdVar2 == null) {
                dvbdVar2 = dvbd.d;
            }
            aniaVar.c(dvbdVar2.b, 2);
        }
    }
}
