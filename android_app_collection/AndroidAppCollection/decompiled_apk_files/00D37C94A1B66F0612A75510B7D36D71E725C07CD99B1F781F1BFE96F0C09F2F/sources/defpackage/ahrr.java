package defpackage;
/* compiled from: PG */
/* renamed from: ahrr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahrr implements azqb {
    public final /* synthetic */ ahrs a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahrr(ahrs ahrsVar, int i) {
        this.a = ahrsVar;
        this.b = i;
    }

    public /* synthetic */ ahrr(ahrs ahrsVar, int i, int i2) {
        this.c = i2;
        this.a = ahrsVar;
        this.b = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.c;
        if (i == 0) {
            ahrs ahrsVar = this.a;
            return this.b == 2 ? ahrsVar.j : ahrsVar.i;
        } else if (i != 1) {
            ahrs ahrsVar2 = this.a;
            return this.b == 2 ? ahrsVar2.e : ahrsVar2.d;
        } else {
            ahrs ahrsVar3 = this.a;
            return this.b == 2 ? ahrsVar3.h : ahrsVar3.g;
        }
    }
}
