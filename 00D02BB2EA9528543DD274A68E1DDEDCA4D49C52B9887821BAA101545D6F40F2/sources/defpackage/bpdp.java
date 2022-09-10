package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpdp  reason: default package */
/* loaded from: classes3.dex */
public class bpdp extends ivn {
    final /* synthetic */ bpdq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpdp(bpdq bpdqVar) {
        super(bpdqVar.a.getString(R.string.REPORT_ROAD_CLOSED_TOOLBAR_TITLE), 1, null, bpdqVar.a.getString(R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtya.cG), cjtd.a(dtya.cY), false, false, true, true);
        this.a = bpdqVar;
    }

    @Override // defpackage.ivn, defpackage.jbk
    public jib NC() {
        jhz e = super.NC().e();
        e.x = true;
        e.C = 2;
        return e.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivn
    public final void a() {
        bpdq bpdqVar = this.a;
        if (!bpdqVar.b.aD) {
            return;
        }
        bnyc bnycVar = bpdqVar.e;
        boxb boxbVar = bpdqVar.d;
        boolean z = true;
        if (!boxbVar.b.a()) {
            boxe boxeVar = boxbVar.a;
            if (!boxeVar.a && boxeVar.b && boxbVar.e == 1 && dbsj.d(boxbVar.d)) {
                z = false;
            }
        }
        bnycVar.b(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        char c;
        bpdq bpdqVar = this.a;
        if (!bpdqVar.b.aD) {
            return;
        }
        bptn bptnVar = bpdqVar.f;
        bpsw bpswVar = bpdqVar.c;
        boxb boxbVar = bpdqVar.d;
        dneu bZ = dnfe.p.bZ();
        dnip bZ2 = dniu.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dniu dniuVar = (dniu) bZ2.b;
        dniuVar.h = 3;
        dniuVar.a |= 128;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ.b;
        dniu bK = bZ2.bK();
        bK.getClass();
        dnfeVar.k = bK;
        dnfeVar.a |= 1024;
        boxc boxcVar = boxc.NOT_SURE;
        boxf boxfVar = boxf.DIRECTIONALITY_HINT;
        int i = boxbVar.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfe dnfeVar2 = (dnfe) bZ.b;
            dnfeVar2.g = 2;
            dnfeVar2.a |= 64;
        } else if (i2 == 2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfe dnfeVar3 = (dnfe) bZ.b;
            dnfeVar3.g = 1;
            dnfeVar3.a |= 64;
        } else {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfe dnfeVar4 = (dnfe) bZ.b;
            dnfeVar4.g = 0;
            dnfeVar4.a |= 64;
        }
        if (boxbVar.b.a()) {
            dnev bZ3 = dney.e.bZ();
            int ordinal = boxbVar.b.a.ordinal();
            if (ordinal == 1) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dney dneyVar = (dney) bZ3.b;
                dneyVar.b = 1;
                dneyVar.a |= 1;
            } else if (ordinal == 2) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dney dneyVar2 = (dney) bZ3.b;
                dneyVar2.b = 2;
                dneyVar2.a |= 1;
            } else if (ordinal == 3) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dney dneyVar3 = (dney) bZ3.b;
                dneyVar3.b = 4;
                dneyVar3.a |= 1;
            } else if (ordinal != 4) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dney dneyVar4 = (dney) bZ3.b;
                dneyVar4.b = 0;
                dneyVar4.a |= 1;
            } else {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dney dneyVar5 = (dney) bZ3.b;
                dneyVar5.b = 3;
                dneyVar5.a |= 1;
            }
            String str = boxbVar.b.b;
            if (!dbsj.d(str)) {
                if (boxbVar.b.a == boxc.EVENT) {
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dney dneyVar6 = (dney) bZ3.b;
                    str.getClass();
                    dneyVar6.a |= 4;
                    dneyVar6.d = str;
                } else {
                    switch (str.hashCode()) {
                        case 66989022:
                            if (str.equals("FLOOD")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1206582133:
                            if (str.equals("MUDSLIDE")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1475131823:
                            if (str.equals("SNOW_ICE")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1692597657:
                            if (str.equals("FALLEN_TREE")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dney dneyVar7 = (dney) bZ3.b;
                        dneyVar7.c = 1;
                        dneyVar7.a |= 2;
                    } else if (c == 1) {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dney dneyVar8 = (dney) bZ3.b;
                        dneyVar8.c = 4;
                        dneyVar8.a |= 2;
                    } else if (c == 2) {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dney dneyVar9 = (dney) bZ3.b;
                        dneyVar9.c = 5;
                        dneyVar9.a |= 2;
                    } else if (c == 3) {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dney dneyVar10 = (dney) bZ3.b;
                        dneyVar10.c = 6;
                        dneyVar10.a |= 2;
                    } else {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dney dneyVar11 = (dney) bZ3.b;
                        dneyVar11.c = 7;
                        dneyVar11.a |= 2;
                    }
                }
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfe dnfeVar5 = (dnfe) bZ.b;
            dney bK2 = bZ3.bK();
            bK2.getClass();
            dnfeVar5.h = bK2;
            dnfeVar5.a |= 128;
        }
        boolean z = boxbVar.a.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfe dnfeVar6 = (dnfe) bZ.b;
        dnfeVar6.a |= 256;
        dnfeVar6.i = z;
        boxe boxeVar = boxbVar.a;
        if (boxeVar.a) {
            dgsf h = bpsw.h(boxeVar.d);
            dgsf h2 = bpsw.h(boxbVar.a.c);
            dgsk bZ4 = dgsl.b.bZ();
            dgrw bZ5 = dgrz.c.bZ();
            dgsg bZ6 = dgsj.f.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dgsj dgsjVar = (dgsj) bZ6.b;
            dgsjVar.b = 2;
            int i3 = dgsjVar.a | 1;
            dgsjVar.a = i3;
            h2.getClass();
            dgsjVar.d = h2;
            int i4 = i3 | 8;
            dgsjVar.a = i4;
            h.getClass();
            dgsjVar.e = h;
            dgsjVar.a = i4 | 16;
            bZ5.a(bZ6);
            bZ4.a(bZ5);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfe dnfeVar7 = (dnfe) bZ.b;
            dgsl bK3 = bZ4.bK();
            bK3.getClass();
            dnfeVar7.l = bK3;
            dnfeVar7.a |= 2048;
        }
        dniw bZ7 = dniz.f.bZ();
        dner bZ8 = dnet.h.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dnet dnetVar = (dnet) bZ8.b;
        dnetVar.a |= 1;
        dnetVar.b = 9;
        dnfe bK4 = bZ.bK();
        bK4.getClass();
        dnetVar.d = bK4;
        dnetVar.a |= 4;
        bZ7.b(bZ8);
        String str2 = boxbVar.d;
        if (!dbsj.d(str2)) {
            dner bZ9 = dnet.h.bZ();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dnet dnetVar2 = (dnet) bZ9.b;
            int i5 = dnetVar2.a | 1;
            dnetVar2.a = i5;
            dnetVar2.b = 13;
            str2.getClass();
            dnetVar2.a = i5 | 16;
            dnetVar2.f = str2;
            bZ7.b(bZ9);
        }
        List<bpsv> k = dchl.k(boxbVar.a().a, bpst.a);
        dwgy a = bpswVar.a(k.isEmpty() ? null : k.get(0).c().f(), cjqm.a, bZ7, null, new bokk(true, k.isEmpty() ? "" : k.get(0).b(), false), k, null, true);
        dnqe b = bpsw.b(boxbVar.b(), 0, a);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dwgz dwgzVar = (dwgz) a.b;
        dwgz dwgzVar2 = dwgz.h;
        b.getClass();
        dwgzVar.c = b;
        dwgzVar.a |= 2;
        doaq bZ10 = doar.c.bZ();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        doar doarVar = (doar) bZ10.b;
        dniz bK5 = bZ7.bK();
        bK5.getClass();
        doarVar.b = bK5;
        doarVar.a |= 1;
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dwgz dwgzVar3 = (dwgz) a.b;
        doar bK6 = bZ10.bK();
        bK6.getClass();
        dwgzVar3.b = bK6;
        dwgzVar3.a |= 1;
        bptnVar.a(a.bK(), true);
    }
}
