package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: viv  reason: default package */
/* loaded from: classes7.dex */
public final class viv extends cqiw<zfp> {
    final /* synthetic */ cqiw a;
    final /* synthetic */ cqiw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viv(Object[] objArr, cqiw cqiwVar, cqiw cqiwVar2, boolean z, boolean z2) {
        super(objArr);
        this.a = cqiwVar;
        this.b = cqiwVar2;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zfp zfpVar, Context context, cqiv cqivVar) {
        zfp zfpVar2 = zfpVar;
        dqvj N = zfpVar2.N();
        cqiw cqiwVar = null;
        if (N != null) {
            zfn zfnVar = zfn.DIRECTIONS_RESULT_TRIPCARD;
            switch (N.ordinal()) {
                case 0:
                case 5:
                    zfn M = zfpVar2.M();
                    if (M != null) {
                        int ordinal = M.ordinal();
                        if (ordinal == 4 || ordinal == 5) {
                            cqiwVar = new uvd();
                            break;
                        }
                        cqiwVar = uxj.e(this.c, this.d);
                        break;
                    } else {
                        bvoo.h("displayMode is null", new Object[0]);
                        break;
                    }
                case 1:
                    if (zfpVar2.M() == null) {
                        bvoo.h("displayMode is null", new Object[0]);
                        cqiwVar = new vjk();
                        break;
                    }
                    cqiwVar = uxj.e(this.c, this.d);
                    break;
                case 2:
                    zfn M2 = zfpVar2.M();
                    if (M2 != null) {
                        int ordinal2 = M2.ordinal();
                        if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                            cqiwVar = new vjk();
                            break;
                        }
                        cqiwVar = uxj.e(this.c, this.d);
                        break;
                    } else {
                        bvoo.h("displayMode is null", new Object[0]);
                        break;
                    }
                case 3:
                    if (!(zfpVar2 instanceof zco)) {
                        cqiw cqiwVar2 = this.b;
                        zfn M3 = ((zeu) zfpVar2).M();
                        if (M3 != null) {
                            int ordinal3 = M3.ordinal();
                            if (ordinal3 != 0) {
                                if (ordinal3 == 1 || ordinal3 == 2 || ordinal3 == 3) {
                                    cqiwVar = new vhy();
                                    break;
                                } else if (ordinal3 == 4 || ordinal3 == 5) {
                                    cqiwVar = new vhw();
                                    break;
                                } else {
                                    bvoo.h("display mode not supported: %s", M3);
                                }
                            }
                            cqiwVar = cqiwVar2;
                            break;
                        } else {
                            bvoo.h("displayMode is null", new Object[0]);
                            break;
                        }
                    } else {
                        cqiwVar = new uiw();
                        break;
                    }
                case 4:
                    zcj zcjVar = (zcj) zfpVar2;
                    zfn M4 = zcjVar.M();
                    if (M4 != zfn.DIRECTIONS_RESULT_TRIPCARD) {
                        bvoo.h("display mode not supported: %s", M4);
                        break;
                    } else {
                        cqiwVar = new vas(zcjVar.a().booleanValue());
                        break;
                    }
                case 6:
                default:
                    bvoo.h("travel mode not supported: %s", N);
                    break;
                case 7:
                    cqiwVar = this.a;
                    if (((zea) zfpVar2).M() != zfn.DIRECTIONS_RESULT_TRIPCARD) {
                        cqiwVar = vhv.e(false);
                        break;
                    }
                    break;
                case 8:
                    zfn M5 = zfpVar2.M();
                    if (!(zfpVar2 instanceof zcf)) {
                        if (zfpVar2 instanceof zch) {
                            if (M5 != zfn.DIRECTIONS_RESULT_TRIPCARD) {
                                cqiwVar = new uyz();
                                break;
                            } else {
                                cqiwVar = new uzm();
                                break;
                            }
                        }
                    } else if (M5 != zfn.DIRECTIONS_RESULT_TRIPCARD) {
                        cqiwVar = new uxt();
                        break;
                    } else {
                        cqiwVar = new uyg();
                        break;
                    }
                    break;
            }
        } else {
            bvoo.h("travel mode unavailable", new Object[0]);
        }
        if (cqiwVar != null) {
            cqivVar.a(cqiwVar, zfpVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zfp> a() {
        return iue.g(cqgr.ck(C()));
    }
}
