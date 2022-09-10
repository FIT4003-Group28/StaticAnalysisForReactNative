package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: akqk  reason: default package */
/* loaded from: classes.dex */
public final class akqk extends akrq {
    public akra[] a;
    public final akrp b;

    /* JADX INFO: Access modifiers changed from: protected */
    public akqk(akra[] akraVarArr) {
        this.a = akraVarArr;
        this.b = akrp.f(akraVarArr);
    }

    public static akqk a(akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4) {
        return new akqk(new akra[]{akraVar, akraVar2, akraVar4, akraVar3});
    }

    public final akra e() {
        return this.a[0];
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akqk)) {
            return false;
        }
        return Arrays.equals(this.a, ((akqk) obj).a);
    }

    public final akra f() {
        return this.a[1];
    }

    public final akra g() {
        return this.a[2];
    }

    public final akra h() {
        return this.a[3];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.akrq, defpackage.akqd
    public final akrp i() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    @Override // defpackage.akrq, defpackage.akqd
    public final boolean j(akra akraVar) {
        for (akra akraVar2 : this.a) {
            if (akraVar2.equals(akraVar)) {
                return true;
            }
        }
        akra[] akraVarArr = this.a;
        ?? d = akrb.d(akraVarArr[0], akraVarArr[1], akraVar);
        akra[] akraVarArr2 = this.a;
        int i = d;
        if (akrb.d(akraVarArr2[1], akraVarArr2[2], akraVar)) {
            i = d + 1;
        }
        akra[] akraVarArr3 = this.a;
        int i2 = i;
        if (akrb.d(akraVarArr3[2], akraVarArr3[3], akraVar)) {
            i2 = i + 1;
        }
        akra[] akraVarArr4 = this.a;
        int i3 = i2;
        if (akrb.d(akraVarArr4[3], akraVarArr4[0], akraVar)) {
            i3 = i2 + 1;
        }
        return i3 == 1;
    }

    @Override // defpackage.akrq
    public final boolean l(akrq akrqVar) {
        if (this.b.k(akrqVar)) {
            for (int i = 0; i < 4; i++) {
                if (!j(akrqVar.x(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a[0]);
        String valueOf2 = String.valueOf(this.a[1]);
        String valueOf3 = String.valueOf(this.a[2]);
        String valueOf4 = String.valueOf(this.a[3]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 5 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append(",");
        sb.append(valueOf3);
        sb.append(",");
        sb.append(valueOf4);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.akrq
    public final int w() {
        return 4;
    }

    @Override // defpackage.akrq
    public final akra x(int i) {
        return this.a[i];
    }

    @Override // defpackage.akrq
    public final akra y() {
        return this.a[3];
    }
}
