package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: akrc  reason: default package */
/* loaded from: classes.dex */
public final class akrc extends akrq {
    private final akra[] a;
    @dzsi
    private volatile akrp b;

    public akrc(akra[] akraVarArr) {
        this.a = akraVarArr;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akrc)) {
            return false;
        }
        return Arrays.equals(this.a, ((akrc) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final akrp i() {
        if (this.b == null) {
            this.b = akrp.f(this.a);
        }
        return this.b;
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final boolean j(akra akraVar) {
        if (!i().j(akraVar)) {
            return false;
        }
        akra[] akraVarArr = this.a;
        int length = akraVarArr.length;
        akra akraVar2 = akraVarArr[length - 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            akra akraVar3 = this.a[i];
            if (akrb.d(akraVar2, akraVar3, akraVar)) {
                i2++;
            }
            i++;
            akraVar2 = akraVar3;
        }
        return (i2 & 1) == 1;
    }

    @Override // defpackage.akrq
    public final int w() {
        return this.a.length;
    }

    @Override // defpackage.akrq
    public final akra x(int i) {
        return this.a[i];
    }
}
