package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cub  reason: default package */
/* loaded from: classes5.dex */
public final class cub {
    static final akuw a;
    public final List<aktg> b = Collections.synchronizedList(new ArrayList());
    private final dxio<akvz> c;

    static {
        akuv bZ = akuw.b.bZ();
        akut bZ2 = akuu.d.bZ();
        dmpm dmpmVar = dmpm.CENTER_LEFT_TO_CENTER_RIGHT;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akuu akuuVar = (akuu) bZ2.b;
        akuuVar.b = dmpmVar.q;
        akuuVar.a |= 1;
        akuu akuuVar2 = (akuu) bZ2.b;
        akuuVar2.c = 2;
        akuuVar2.a |= 2;
        bZ.a(bZ2);
        akut bZ3 = akuu.d.bZ();
        dmpm dmpmVar2 = dmpm.CENTER_RIGHT_TO_CENTER_LEFT;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        akuu akuuVar3 = (akuu) bZ3.b;
        akuuVar3.b = dmpmVar2.q;
        akuuVar3.a |= 1;
        akuu akuuVar4 = (akuu) bZ3.b;
        akuuVar4.c = 3;
        akuuVar4.a |= 2;
        bZ.a(bZ3);
        akut bZ4 = akuu.d.bZ();
        dmpm dmpmVar3 = dmpm.BOTTOM_CENTER_TO_TOP_CENTER;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        akuu akuuVar5 = (akuu) bZ4.b;
        akuuVar5.b = dmpmVar3.q;
        akuuVar5.a |= 1;
        akuu akuuVar6 = (akuu) bZ4.b;
        akuuVar6.c = 1;
        akuuVar6.a |= 2;
        bZ.a(bZ4);
        akut bZ5 = akuu.d.bZ();
        dmpm dmpmVar4 = dmpm.TOP_CENTER_TO_BOTTOM_CENTER;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        akuu akuuVar7 = (akuu) bZ5.b;
        akuuVar7.b = dmpmVar4.q;
        akuuVar7.a |= 1;
        akuu akuuVar8 = (akuu) bZ5.b;
        akuuVar8.c = 1;
        akuuVar8.a = 2 | akuuVar8.a;
        bZ.a(bZ5);
        a = bZ.bK();
    }

    public cub(dxio<akvz> dxioVar) {
        this.c = dxioVar;
    }

    private static String e(int i, int i2) {
        return String.format("?w=%d&h=%d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final akvz a() {
        return this.c.a();
    }

    public final dmoh b(int i, cvj cvjVar) {
        String str;
        int i2;
        dmog dmogVar = (dmog) dmoh.h.bZ();
        if (dmogVar.c) {
            dmogVar.bF();
            dmogVar.c = false;
        }
        dmoh dmohVar = (dmoh) dmogVar.b;
        dmohVar.a |= 4;
        dmohVar.c = 4;
        int i3 = cvjVar.b;
        if (i3 == 8) {
            if (i != 1) {
                str = ((cuv) cvjVar.c).c;
            } else {
                str = ((cuv) cvjVar.c).b;
            }
        } else if (i3 == 7) {
            if (i != 1) {
                i2 = ((cva) cvjVar.c).e;
            } else {
                i2 = ((cva) cvjVar.c).d;
            }
            String valueOf = String.valueOf(((cva) cvjVar.c).f);
            int i4 = i2 * 4;
            String valueOf2 = String.valueOf(e(i4, i4));
            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            str = "";
        }
        if (dmogVar.c) {
            dmogVar.bF();
            dmogVar.c = false;
        }
        dmoh dmohVar2 = (dmoh) dmogVar.b;
        str.getClass();
        dmohVar2.a |= 1;
        dmohVar2.b = str;
        return (dmoh) dmogVar.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dmoh c(String str, int i, cvj cvjVar) {
        int i2;
        dmog dmogVar = (dmog) dmoh.h.bZ();
        if (dmogVar.c) {
            dmogVar.bF();
            dmogVar.c = false;
        }
        dmoh dmohVar = (dmoh) dmogVar.b;
        int i3 = dmohVar.a | 4;
        dmohVar.a = i3;
        dmohVar.c = 4;
        str.getClass();
        dmohVar.a = i3 | 1;
        dmohVar.b = str;
        if (cvjVar.b == 8) {
            cuv cuvVar = (cuv) cvjVar.c;
            int i4 = i == 2 ? cuvVar.g : cuvVar.e;
            if (i == 2) {
                i2 = cuvVar.f;
            } else {
                i2 = cuvVar.d;
            }
            dsqv<dmoh, akvs> dsqvVar = akvt.a;
            akvr bZ = akvs.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            akvs akvsVar = (akvs) bZ.b;
            int i5 = akvsVar.a | 1;
            akvsVar.a = i5;
            akvsVar.b = i2;
            akvsVar.a = i5 | 2;
            akvsVar.c = i4;
            dmogVar.k(dsqvVar, bZ.bK());
        }
        return (dmoh) dmogVar.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(djie djieVar, int i, cvj cvjVar) {
        cva cvaVar;
        int i2;
        if (cvjVar.b == 7) {
            cvaVar = (cva) cvjVar.c;
        } else {
            cvaVar = cva.h;
        }
        if (!cvaVar.g) {
            int i3 = cvjVar.b;
            if (i3 == 8) {
                if (i != 1) {
                    i2 = ((cuv) cvjVar.c).i;
                } else {
                    i2 = ((cuv) cvjVar.c).h;
                }
            } else if (i != 1) {
                i2 = (i3 == 7 ? (cva) cvjVar.c : cva.h).c;
            } else {
                i2 = (i3 == 7 ? (cva) cvjVar.c : cva.h).b;
            }
            djja djjaVar = djieVar.d;
            if (djjaVar == null) {
                djjaVar = djja.e;
            }
            String valueOf = String.valueOf(djjaVar.b);
            int i4 = i2 * 4;
            String valueOf2 = String.valueOf(e(i4, i4));
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        djja djjaVar2 = djieVar.d;
        if (djjaVar2 == null) {
            djjaVar2 = djja.e;
        }
        if (djjaVar2.c.size() < 2) {
            return "";
        }
        djja djjaVar3 = djieVar.d;
        if (djjaVar3 == null) {
            djjaVar3 = djja.e;
        }
        dsrj<djix> dsrjVar = djjaVar3.c;
        if (i == 1) {
            return dsrjVar.get(0).a;
        }
        return dsrjVar.get(1).a;
    }
}
