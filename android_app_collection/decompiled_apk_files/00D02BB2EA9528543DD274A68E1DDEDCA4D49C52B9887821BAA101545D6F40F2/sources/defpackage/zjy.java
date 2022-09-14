package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zjy  reason: default package */
/* loaded from: classes7.dex */
public class zjy implements zbr {
    private final vmx a;
    private final cqsn b;
    private final cjtd c;

    public zjy(vmx vmxVar, dqvj dqvjVar) {
        zjx zjxVar;
        this.a = vmxVar;
        dovb dovbVar = dovb.SUCCESS;
        int ordinal = dqvjVar.ordinal();
        if (ordinal == 1) {
            zjxVar = zjx.BIKING_NOT_SUPPORTED;
        } else if (ordinal == 2) {
            zjxVar = zjx.WALKING_NOT_SUPPORTED;
        } else if (ordinal == 3) {
            zjxVar = zjx.TRANSIT_NOT_SUPPORTED;
        } else if (ordinal == 5) {
            zjxVar = zjx.TWO_WHEELER_NOT_SUPPORTED;
        } else if (ordinal == 7) {
            zjxVar = zjx.TAXI_NOT_SUPPORTED;
        } else {
            zjxVar = zjx.TRAVEL_MODE_NOT_SUPPORTED;
        }
        this.b = cqrt.l(zjxVar.g);
        this.c = cjtd.a(zjxVar.h);
    }

    @Override // defpackage.zbr
    public cqsn a() {
        return this.b;
    }

    @Override // defpackage.zbr
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.zbr
    public cqkl c(cjqm cjqmVar) {
        this.a.a(yys.a(cjqmVar));
        return cqkl.a;
    }
}
