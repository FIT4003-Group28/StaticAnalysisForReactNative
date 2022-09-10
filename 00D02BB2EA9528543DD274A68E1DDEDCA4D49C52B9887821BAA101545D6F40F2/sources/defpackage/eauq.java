package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eauq  reason: default package */
/* loaded from: classes6.dex */
public final class eauq implements eaux, eauw {
    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final eauq[] e;
    private final eaus f;

    public eauq(int i, int i2, int i3, int i4, eauq[] eauqVarArr) {
        this.b = 1;
        this.c = 2;
        this.d = 10;
        this.a = i4;
        this.e = eauqVarArr;
        this.f = null;
    }

    public eauq(eauq eauqVar, eaus eausVar) {
        this.b = 1;
        this.c = 2;
        this.d = 10;
        this.a = eauqVar.a;
        this.e = eauqVar.e;
        eaus eausVar2 = eauqVar.f;
        this.f = eausVar2 != null ? new eaup(eausVar2, eausVar) : eausVar;
    }

    static final boolean f(eapu eapuVar) {
        int f = eapuVar.f();
        for (int i = 0; i < f; i++) {
            if (eapuVar.h(i) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eaux
    public final int a(eapu eapuVar) {
        long d = d(eapuVar);
        if (d == Long.MAX_VALUE) {
            return 0;
        }
        int max = Math.max(eauk.c(d), 1);
        if (this.a >= 8) {
            max = Math.max(max, d < 0 ? 5 : 4) + 1;
            if (this.a == 9 && Math.abs(d) % 1000 == 0) {
                max -= 4;
            }
            d /= 1000;
        }
        int i = (int) d;
        eaus eausVar = this.f;
        return eausVar != null ? max + eausVar.a(i) : max;
    }

    @Override // defpackage.eaux
    public final int b(eapu eapuVar, int i) {
        return d(eapuVar) != Long.MAX_VALUE ? 1 : 0;
    }

    @Override // defpackage.eaux
    public final void c(StringBuffer stringBuffer, eapu eapuVar) {
        long d = d(eapuVar);
        if (d == Long.MAX_VALUE) {
            return;
        }
        int i = (int) d;
        if (this.a >= 8) {
            i = (int) (d / 1000);
        }
        int length = stringBuffer.length();
        eauk.b(stringBuffer, i);
        if (this.a >= 8) {
            int abs = (int) (Math.abs(d) % 1000);
            if (this.a == 8 || abs > 0) {
                if (d < 0 && d > -1000) {
                    stringBuffer.insert(length, '-');
                }
                stringBuffer.append('.');
                eauk.a(stringBuffer, abs, 3);
            }
        }
        eaus eausVar = this.f;
        if (eausVar == null) {
            return;
        }
        eausVar.b(stringBuffer, i);
    }

    final long d(eapu eapuVar) {
        int i;
        long j;
        eapo e = eapuVar.e();
        if (e == null || e(e, this.a)) {
            switch (this.a) {
                case 0:
                    i = eapuVar.i(eaoz.d);
                    j = i;
                    break;
                case 1:
                    i = eapuVar.i(eaoz.e);
                    j = i;
                    break;
                case 2:
                    i = eapuVar.i(eaoz.f);
                    j = i;
                    break;
                case 3:
                    i = eapuVar.i(eaoz.g);
                    j = i;
                    break;
                case 4:
                    i = eapuVar.i(eaoz.i);
                    j = i;
                    break;
                case 5:
                    i = eapuVar.i(eaoz.j);
                    j = i;
                    break;
                case 6:
                    i = eapuVar.i(eaoz.k);
                    j = i;
                    break;
                case 7:
                    i = eapuVar.i(eaoz.l);
                    j = i;
                    break;
                default:
                    j = (eapuVar.i(eaoz.k) * 1000) + eapuVar.i(eaoz.l);
                    break;
            }
            if (j == 0) {
                if (f(eapuVar)) {
                    eauq[] eauqVarArr = this.e;
                    int i2 = this.a;
                    if (eauqVarArr[i2] == this) {
                        while (true) {
                            i2++;
                            if (i2 <= 9) {
                                if (!e(e, i2) || this.e[i2] == null) {
                                }
                            }
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
            return j;
        }
        return Long.MAX_VALUE;
    }

    static final boolean e(eapo eapoVar, int i) {
        switch (i) {
            case 0:
                return eapoVar.j(eaoz.d);
            case 1:
                return eapoVar.j(eaoz.e);
            case 2:
                return eapoVar.j(eaoz.f);
            case 3:
                return eapoVar.j(eaoz.g);
            case 4:
                return eapoVar.j(eaoz.i);
            case 5:
                return eapoVar.j(eaoz.j);
            case 6:
                return eapoVar.j(eaoz.k);
            case 7:
                return eapoVar.j(eaoz.l);
            default:
                return eapoVar.j(eaoz.k) || eapoVar.j(eaoz.l);
        }
    }
}
