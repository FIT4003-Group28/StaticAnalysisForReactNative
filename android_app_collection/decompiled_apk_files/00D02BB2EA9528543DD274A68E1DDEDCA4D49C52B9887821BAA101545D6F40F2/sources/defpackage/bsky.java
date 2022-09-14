package defpackage;
/* compiled from: PG */
/* renamed from: bsky  reason: default package */
/* loaded from: classes4.dex */
class bsky implements dbrn<djjv, duha> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ duha a(djjv djjvVar) {
        djjv djjvVar2 = djjvVar;
        dugz bZ = duha.d.bZ();
        if ((djjvVar2.a & 1) != 0) {
            int i = djjvVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((duha) bZ.b).a = i;
        }
        if ((djjvVar2.a & 2) != 0) {
            int i2 = djjvVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((duha) bZ.b).b = i2;
        }
        if ((djjvVar2.a & 4) != 0) {
            int i3 = djjvVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((duha) bZ.b).c = i3;
        }
        return bZ.bK();
    }
}
