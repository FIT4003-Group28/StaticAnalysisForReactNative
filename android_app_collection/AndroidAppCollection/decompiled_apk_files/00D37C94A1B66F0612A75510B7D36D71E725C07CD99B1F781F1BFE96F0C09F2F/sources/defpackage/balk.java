package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: balk  reason: default package */
/* loaded from: classes2.dex */
public final class balk implements balr, balq {
    public final int a;
    private final int b;
    private final int c;
    private final balk[] d;
    private final balm e;

    public balk(int i, int i2, int i3, balk[] balkVarArr) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = balkVarArr;
        this.e = null;
    }

    public balk(balk balkVar, balm balmVar) {
        this.b = balkVar.b;
        this.c = balkVar.c;
        this.a = balkVar.a;
        this.d = balkVar.d;
        balm balmVar2 = balkVar.e;
        this.e = balmVar2 != null ? new balj(balmVar2, balmVar) : balmVar;
    }

    static final boolean f(baih baihVar) {
        int c = baihVar.c();
        for (int i = 0; i < c; i++) {
            if (baihVar.b(i) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.balr
    public final int a(baih baihVar) {
        long d = d(baihVar);
        if (d == Long.MAX_VALUE) {
            return 0;
        }
        int max = Math.max(balf.a(d), this.b);
        if (this.a >= 8) {
            max = Math.max(max, d < 0 ? 5 : 4) + 1;
            if (this.a == 9 && Math.abs(d) % 1000 == 0) {
                max -= 4;
            }
            d /= 1000;
        }
        int i = (int) d;
        balm balmVar = this.e;
        return balmVar != null ? max + balmVar.a(i) : max;
    }

    @Override // defpackage.balr
    public final int b(baih baihVar, int i) {
        return (this.c == 4 || d(baihVar) != Long.MAX_VALUE) ? 1 : 0;
    }

    @Override // defpackage.balr
    public final void c(StringBuffer stringBuffer, baih baihVar) {
        long d = d(baihVar);
        if (d == Long.MAX_VALUE) {
            return;
        }
        int i = (int) d;
        if (this.a >= 8) {
            i = (int) (d / 1000);
        }
        int length = stringBuffer.length();
        if (this.b <= 1) {
            balf.e(stringBuffer, i);
        } else {
            balf.d(stringBuffer, i, 2);
        }
        if (this.a >= 8) {
            int abs = (int) (Math.abs(d) % 1000);
            if (this.a == 8 || abs > 0) {
                if (d < 0 && d > -1000) {
                    stringBuffer.insert(length, '-');
                }
                stringBuffer.append('.');
                balf.d(stringBuffer, abs, 3);
            }
        }
        balm balmVar = this.e;
        if (balmVar == null) {
            return;
        }
        balmVar.b(stringBuffer, i);
    }

    final long d(baih baihVar) {
        int a;
        long j;
        baie e = this.c == 4 ? null : baihVar.e();
        if (e == null || e(e, this.a)) {
            switch (this.a) {
                case 0:
                    a = baihVar.a(bahx.d);
                    j = a;
                    break;
                case 1:
                    a = baihVar.a(bahx.e);
                    j = a;
                    break;
                case 2:
                    a = baihVar.a(bahx.f);
                    j = a;
                    break;
                case 3:
                    a = baihVar.a(bahx.g);
                    j = a;
                    break;
                case 4:
                    a = baihVar.a(bahx.i);
                    j = a;
                    break;
                case 5:
                    a = baihVar.a(bahx.j);
                    j = a;
                    break;
                case 6:
                    a = baihVar.a(bahx.k);
                    j = a;
                    break;
                case 7:
                    a = baihVar.a(bahx.l);
                    j = a;
                    break;
                default:
                    j = (baihVar.a(bahx.k) * 1000) + baihVar.a(bahx.l);
                    break;
            }
            if (j == 0) {
                int i = this.c;
                if (i == 1) {
                    if (f(baihVar)) {
                        balk[] balkVarArr = this.d;
                        int i2 = this.a;
                        if (balkVarArr[i2] == this) {
                            int min = Math.min(i2, 8);
                            while (true) {
                                min--;
                                if (min >= 0 && min <= 9) {
                                    if (!e(e, min) || this.d[min] == null) {
                                    }
                                }
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                } else if (i == 2) {
                    if (f(baihVar)) {
                        balk[] balkVarArr2 = this.d;
                        int i3 = this.a;
                        if (balkVarArr2[i3] == this) {
                            for (int i4 = i3 + 1; i4 <= 9; i4++) {
                                if (e(e, i4) && this.d[i4] != null) {
                                    return Long.MAX_VALUE;
                                }
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }
        return Long.MAX_VALUE;
    }

    static final boolean e(baie baieVar, int i) {
        switch (i) {
            case 0:
                return baieVar.e(bahx.d);
            case 1:
                return baieVar.e(bahx.e);
            case 2:
                return baieVar.e(bahx.f);
            case 3:
                return baieVar.e(bahx.g);
            case 4:
                return baieVar.e(bahx.i);
            case 5:
                return baieVar.e(bahx.j);
            case 6:
                return baieVar.e(bahx.k);
            case 7:
                return baieVar.e(bahx.l);
            default:
                return baieVar.e(bahx.k) || baieVar.e(bahx.l);
        }
    }
}
