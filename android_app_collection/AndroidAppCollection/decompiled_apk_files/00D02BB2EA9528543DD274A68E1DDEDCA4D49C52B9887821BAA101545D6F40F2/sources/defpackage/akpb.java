package defpackage;
/* compiled from: PG */
/* renamed from: akpb  reason: default package */
/* loaded from: classes.dex */
public final class akpb implements akpn {
    private static final dcqe a = dcqe.c("akpb");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.akpn
    public final int a(akps akpsVar, int i) {
        akps akpsVar2 = akps.NORMAL;
        switch (akpsVar.ordinal()) {
            case 0:
                if (i == 0) {
                    return 2131232028;
                }
                return i != 1 ? 2131232027 : 2131232030;
            case 1:
                return 2131232040;
            case 2:
                return 2131232032;
            case 3:
                return 2131232037;
            case 4:
                return 2131232033;
            case 5:
                return 2131232036;
            case 6:
                return 2131232029;
            case 7:
            default:
                bvoo.h("Got an unexpected PinType: %s", akpsVar);
                break;
            case 8:
                break;
        }
        return 2131232027;
    }

    @Override // defpackage.akpn
    public final int b(int i, boolean z) {
        if (i == 0) {
            return 2131233068;
        }
        if (!z) {
            return 2131233130;
        }
        switch (i) {
            case 1:
                return 2131231899;
            case 2:
                return 2131231900;
            case 3:
                return 2131231901;
            case 4:
                return 2131231902;
            case 5:
                return 2131231903;
            case 6:
                return 2131231904;
            case 7:
                return 2131231905;
            case 8:
                return 2131231906;
            case 9:
                return 2131231907;
            default:
                return 2131231898;
        }
    }

    @Override // defpackage.akpn
    public final int c() {
        return 2131233039;
    }
}
