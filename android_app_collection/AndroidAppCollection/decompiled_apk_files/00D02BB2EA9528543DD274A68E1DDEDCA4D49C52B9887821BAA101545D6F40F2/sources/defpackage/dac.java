package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dac  reason: default package */
/* loaded from: classes5.dex */
public final class dac extends dad {
    private final dsze a;
    private final dfla b;
    private final double c;

    public dac(dsze dszeVar, dfla dflaVar, double d) {
        if (dszeVar != null) {
            this.a = dszeVar;
            if (dflaVar != null) {
                this.b = dflaVar;
                this.c = d;
                return;
            }
            throw new NullPointerException("Null poseConfidence");
        }
        throw new NullPointerException("Null poseProto");
    }

    @Override // defpackage.dad
    public final dsze a() {
        return this.a;
    }

    @Override // defpackage.dad
    public final dfla b() {
        return this.b;
    }

    @Override // defpackage.dad
    public final double c() {
        return this.c;
    }

    @Override // defpackage.dad
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dad) {
            dad dadVar = (dad) obj;
            if (this.a.equals(dadVar.a()) && this.b.equals(dadVar.b()) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(dadVar.c()) && dadVar.d() == 1) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dsze dszeVar = this.a;
        int i = dszeVar.bC;
        if (i == 0) {
            i = dsst.a.b(dszeVar).c(dszeVar);
            dszeVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        dfla dflaVar = this.b;
        int i3 = dflaVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dflaVar).c(dflaVar);
            dflaVar.bC = i3;
        }
        return ((((i2 ^ i3) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ 1;
    }
}
