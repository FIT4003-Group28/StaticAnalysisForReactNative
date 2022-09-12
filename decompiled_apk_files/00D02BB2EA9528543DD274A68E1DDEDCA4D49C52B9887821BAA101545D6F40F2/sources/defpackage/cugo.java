package defpackage;
/* compiled from: PG */
/* renamed from: cugo  reason: default package */
/* loaded from: classes5.dex */
public enum cugo {
    INVALID(0),
    INCOMING_RECEIVED(1),
    INCOMING_READ(2),
    INCOMING_READ_RECEIPT_SENT(3),
    OUTGOING_PENDING_SEND(4),
    OUTGOING_SENDING(5),
    OUTGOING_FAILED_SEND(6),
    OUTGOING_SENT(7),
    OUTGOING_DELIVERED(8),
    OUTGOING_READ(9),
    OUTGOING_FAILED_TO_DELIVER(10),
    LOCAL(11);
    
    public static final dcdc<cugo> n;
    public static final Integer[] o;
    public final int m;

    static {
        cugo cugoVar = OUTGOING_PENDING_SEND;
        cugo cugoVar2 = OUTGOING_SENDING;
        cugo cugoVar3 = OUTGOING_FAILED_SEND;
        cugo cugoVar4 = OUTGOING_SENT;
        cugo cugoVar5 = LOCAL;
        n = dcdc.i(cugoVar, cugoVar2, cugoVar3, cugoVar4);
        o = new Integer[]{Integer.valueOf(cugoVar.m), Integer.valueOf(cugoVar2.m), Integer.valueOf(cugoVar3.m), Integer.valueOf(cugoVar5.m)};
    }

    cugo(int i) {
        this.m = i;
    }

    public static cugo a(final int i) {
        return (cugo) dcbg.c(values()).r(new dbsl(i) { // from class: cugn
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                cugo cugoVar = cugo.INVALID;
                return ((cugo) obj).m == i2;
            }
        }).c(INVALID);
    }
}
