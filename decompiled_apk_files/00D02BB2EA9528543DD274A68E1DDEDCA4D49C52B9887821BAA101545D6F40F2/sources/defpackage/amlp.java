package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: amlp  reason: default package */
/* loaded from: classes2.dex */
public final class amlp {
    public final akrk a;
    public final alxc[] b;

    public amlp(akrk akrkVar) {
        this.a = akrkVar;
        this.b = null;
    }

    public amlp(akrk akrkVar, long[] jArr) {
        this.a = akrkVar;
        this.b = new alxc[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            this.b[i] = new alxc(jArr[i]);
        }
    }

    public amlp(akrk akrkVar, alxc[] alxcVarArr) {
        this.a = akrkVar;
        this.b = alxcVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<amlp> a(boolean z) {
        akrk akrkVar = this.a;
        int i = 0;
        int i2 = true != z ? -1 : 0;
        int l = akrkVar.l();
        akrj akrjVar = new akrj(l);
        akrjVar.b = akrkVar.c;
        akra akraVar = new akra();
        boolean z2 = false;
        for (int i3 = 0; i3 < l; i3++) {
            akrkVar.n(i3, akraVar);
            if (z) {
                int i4 = akraVar.a;
                if (i4 < i2) {
                    akraVar.a = i4 + 1073741824;
                    z2 = true;
                    akrjVar.a(akraVar);
                } else {
                    akrjVar.a(akraVar);
                }
            } else {
                int i5 = akraVar.a;
                if (i5 > i2) {
                    akraVar.a = i5 - 1073741824;
                    z2 = true;
                    akrjVar.a(akraVar);
                } else {
                    akrjVar.a(akraVar);
                }
            }
        }
        if (z2) {
            akrkVar = akrjVar.c();
        }
        if (true != z) {
            i = -1073741824;
        }
        return b(akrkVar.x(i));
    }

    public final List<amlp> b(List<akrk> list) {
        ArrayList f = dchl.f(list.size());
        int i = 0;
        for (akrk akrkVar : list) {
            int l = akrkVar.l() + i;
            alxc[] alxcVarArr = this.b;
            f.add(new amlp(akrkVar, alxcVarArr == null ? null : (alxc[]) Arrays.copyOfRange(alxcVarArr, i, l)));
            i = l - 2;
        }
        return f;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amlp) {
            amlp amlpVar = (amlp) obj;
            if (this.a.equals(amlpVar.a) && Arrays.equals(this.b, amlpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }
}
