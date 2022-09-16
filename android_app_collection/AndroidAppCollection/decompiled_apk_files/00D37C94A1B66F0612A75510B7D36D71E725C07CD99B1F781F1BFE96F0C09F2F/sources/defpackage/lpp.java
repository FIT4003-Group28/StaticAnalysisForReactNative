package defpackage;
/* compiled from: PG */
/* renamed from: lpp  reason: default package */
/* loaded from: classes3.dex */
final class lpp implements akad {
    private static final ampt a = jny.o;

    @Override // defpackage.akad
    public final /* bridge */ /* synthetic */ void b(Object obj, akac akacVar) {
        avwn avwnVar = (avwn) obj;
        if ((avwnVar.b & 16777216) != 0) {
            aqya aqyaVar = avwnVar.C;
            if (aqyaVar == null) {
                aqyaVar = aqya.a;
            }
            if ((aqyaVar.b & 128) == 0) {
                return;
            }
            aqyb aqybVar = aqyaVar.h;
            if (aqybVar == null) {
                aqybVar = aqyb.a;
            }
            if ((aqybVar.b & 8) != 0) {
                akacVar.a(new itu(aqyaVar));
                return;
            }
            aqyb aqybVar2 = aqyaVar.h;
            if (aqybVar2 == null) {
                aqybVar2 = aqyb.a;
            }
            if ((aqybVar2.b & 64) != 0) {
                akacVar.a(new itx(aqyaVar));
                return;
            }
            aqyb aqybVar3 = aqyaVar.h;
            if (aqybVar3 == null) {
                aqybVar3 = aqyb.a;
            }
            if ((aqybVar3.b & 16) != 0) {
                akacVar.a(new itw(aqyaVar));
                return;
            }
            aqyb aqybVar4 = aqyaVar.h;
            if (aqybVar4 == null) {
                aqybVar4 = aqyb.a;
            }
            if ((aqybVar4.b & 65536) == 0) {
                return;
            }
            akacVar.a(new itt(aqyaVar));
        }
    }

    @Override // defpackage.akad
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.akad
    public final ampt e() {
        return a;
    }
}
