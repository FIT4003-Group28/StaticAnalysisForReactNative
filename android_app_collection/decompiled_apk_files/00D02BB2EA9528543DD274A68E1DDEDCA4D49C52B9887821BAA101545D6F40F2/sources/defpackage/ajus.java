package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajus  reason: default package */
/* loaded from: classes2.dex */
public class ajus {
    private static final dcqe a = dcqe.c("ajus");
    private final bvjj b;

    public ajus(bvjj bvjjVar) {
        this.b = bvjjVar;
    }

    public static cxsq d(boolean z) {
        if (!z) {
            if (((gch) btsr.a(gch.class)).sC().h()) {
                return cxsq.c();
            }
            return cxsq.b();
        }
        cxsp a2 = cxsq.a();
        a2.a = R.color.qu_grey_black_1000;
        a2.g = R.color.qu_grey_black_1000;
        a2.b = R.color.qu_grey_black_1000;
        a2.c = R.color.qu_grey_black_1000;
        a2.d = R.color.qu_navigation_night_dark_blue;
        a2.e = R.color.qu_grey_400;
        a2.f = R.color.qu_grey_500;
        a2.h = R.color.qu_grey_500;
        a2.i = R.color.qu_grey_200;
        a2.j = R.color.qu_grey_500;
        a2.l = R.color.qu_grey_600;
        a2.p = R.color.qu_grey_400;
        a2.m = R.color.qu_grey_500;
        a2.n = R.color.qu_grey_200;
        a2.o = R.color.qu_grey_500;
        a2.q = R.color.qu_navigation_night_blue;
        return a2.a();
    }

    public static boolean e(czgw czgwVar, boolean z) {
        int i = 0;
        for (czha czhaVar : czgwVar.b) {
            czgz b = czgz.b(czhaVar.b);
            if (b == null) {
                b = czgz.UNKNOWN_TYPE;
            }
            if (b == czgz.SMS) {
                i++;
            }
        }
        return i > 1;
    }

    private static final String f(czha czhaVar) {
        czgu czguVar = czhaVar.d;
        if (czguVar == null) {
            czguVar = czgu.l;
        }
        if ((czguVar.a & 1) != 0) {
            czgu czguVar2 = czhaVar.d;
            if (czguVar2 == null) {
                czguVar2 = czgu.l;
            }
            return czguVar2.b;
        }
        czgz b = czgz.b(czhaVar.b);
        if (b == null) {
            b = czgz.UNKNOWN_TYPE;
        }
        if (b != czgz.IN_APP_GAIA) {
            return czhaVar.c;
        }
        czgu czguVar3 = czhaVar.d;
        if (czguVar3 == null) {
            czguVar3 = czgu.l;
        }
        return czguVar3.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if ((r4.a & 4) == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.czha r4, defpackage.btlu r5) {
        /*
            r3 = this;
            int r0 = r4.b
            czgz r0 = defpackage.czgz.b(r0)
            if (r0 != 0) goto La
            czgz r0 = defpackage.czgz.UNKNOWN_TYPE
        La:
            czgz r1 = defpackage.czgz.SMS
            r2 = 0
            if (r0 == r1) goto L29
            int r0 = r4.b
            czgz r0 = defpackage.czgz.b(r0)
            if (r0 != 0) goto L19
            czgz r0 = defpackage.czgz.UNKNOWN_TYPE
        L19:
            czgz r1 = defpackage.czgz.EMAIL
            if (r0 != r1) goto L35
            czgu r4 = r4.d
            if (r4 != 0) goto L23
            czgu r4 = defpackage.czgu.l
        L23:
            int r4 = r4.a
            r4 = r4 & 4
            if (r4 != 0) goto L35
        L29:
            bvjj r4 = r3.b
            bvjk r0 = defpackage.bvjk.gz
            boolean r4 = r4.o(r0, r5, r2)
            if (r4 != 0) goto L35
            r4 = 1
            return r4
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajus.a(czha, btlu):boolean");
    }

    public final dcdc<dqzx> b(czgw czgwVar, boolean z) {
        dcen dcenVar = new dcen();
        for (czha czhaVar : czgwVar.b) {
            dqzw bZ = dqzx.c.bZ();
            czgz czgzVar = czgz.UNKNOWN_TYPE;
            czgz b = czgz.b(czhaVar.b);
            if (b == null) {
                b = czgz.UNKNOWN_TYPE;
            }
            int ordinal = b.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                czgz b2 = czgz.b(czhaVar.b);
                if (b2 == null) {
                    b2 = czgz.UNKNOWN_TYPE;
                }
                if (b2 != czgz.IN_APP_GAIA) {
                    czgu czguVar = czhaVar.d;
                    if (czguVar == null) {
                        czguVar = czgu.l;
                    }
                    if ((czguVar.a & 4) == 0) {
                        dqxy bZ2 = dqyb.j.bZ();
                        dqxz bZ3 = dqya.e.bZ();
                        String f = f(czhaVar);
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dqya dqyaVar = (dqya) bZ3.b;
                        f.getClass();
                        int i = 1 | dqyaVar.a;
                        dqyaVar.a = i;
                        dqyaVar.b = f;
                        String str = czhaVar.c;
                        str.getClass();
                        dqyaVar.a = i | 2;
                        dqyaVar.c = str;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dqyb dqybVar = (dqyb) bZ2.b;
                        dqya bK = bZ3.bK();
                        bK.getClass();
                        dqybVar.c = bK;
                        dqybVar.b = 6;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dqzx dqzxVar = (dqzx) bZ.b;
                        dqyb bK2 = bZ2.bK();
                        bK2.getClass();
                        dqzxVar.b = bK2;
                        dqzxVar.a = 2;
                        dcenVar.b(bZ.bK());
                    }
                }
                dqyi bZ4 = dqyj.f.bZ();
                String f2 = f(czhaVar);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dqyj dqyjVar = (dqyj) bZ4.b;
                f2.getClass();
                dqyjVar.a |= 8;
                dqyjVar.d = f2;
                czgu czguVar2 = czhaVar.d;
                if (czguVar2 == null) {
                    czguVar2 = czgu.l;
                }
                String str2 = czguVar2.d;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dqyj dqyjVar2 = (dqyj) bZ4.b;
                str2.getClass();
                dqyjVar2.a |= 1;
                dqyjVar2.b = str2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqzx dqzxVar2 = (dqzx) bZ.b;
                dqyj bK3 = bZ4.bK();
                bK3.getClass();
                dqzxVar2.b = bK3;
                dqzxVar2.a = 1;
                dcenVar.b(bZ.bK());
            } else if (ordinal != 4) {
                Object[] objArr = new Object[1];
                czgz b3 = czgz.b(czhaVar.b);
                if (b3 == null) {
                    b3 = czgz.UNKNOWN_TYPE;
                }
                objArr[0] = b3;
                bvoo.h("Unexpected target type: %s", objArr);
            } else if (z) {
                dqxy bZ5 = dqyb.j.bZ();
                dqxz bZ6 = dqya.e.bZ();
                String f3 = f(czhaVar);
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dqya dqyaVar2 = (dqya) bZ6.b;
                f3.getClass();
                int i2 = 1 | dqyaVar2.a;
                dqyaVar2.a = i2;
                dqyaVar2.b = f3;
                String str3 = czhaVar.c;
                str3.getClass();
                dqyaVar2.a = 4 | i2;
                dqyaVar2.d = str3;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dqyb dqybVar2 = (dqyb) bZ5.b;
                dqya bK4 = bZ6.bK();
                bK4.getClass();
                dqybVar2.c = bK4;
                dqybVar2.b = 6;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqzx dqzxVar3 = (dqzx) bZ.b;
                dqyb bK5 = bZ5.bK();
                bK5.getClass();
                dqzxVar3.b = bK5;
                dqzxVar3.a = 2;
                dcenVar.b(bZ.bK());
            }
        }
        return dcenVar.f().v();
    }

    public final cxsz c() {
        cxsy a2 = cxsz.a();
        a2.b();
        a2.b = R.dimen.location_sharing_ui_face_row_item_size;
        a2.c = R.dimen.location_sharing_ui_face_row_text_size;
        a2.e = d(false);
        a2.c();
        return a2.a();
    }
}
