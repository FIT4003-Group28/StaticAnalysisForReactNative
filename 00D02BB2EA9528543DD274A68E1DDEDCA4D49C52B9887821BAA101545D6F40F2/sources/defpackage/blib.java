package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: blib  reason: default package */
/* loaded from: classes3.dex */
public final class blib extends blho implements btzi<dwhl, dwhn> {
    private final btvo a;
    private final ilo b;
    private final butl c;
    private final dehq d;
    @dzsi
    private final docg g;
    private boolean h;
    private int i;

    public blib(btvo btvoVar, butl butlVar, dehq dehqVar, ilo iloVar, blhw blhwVar) {
        super(blhwVar);
        boolean z = false;
        this.i = 0;
        this.a = btvoVar;
        this.c = butlVar;
        this.d = dehqVar;
        this.b = iloVar;
        djck e = blhwVar.f().e(blhz.a);
        this.g = e.g.size() > 0 ? e.g.get(0) : null;
        this.h = (!blhwVar.l() || !iloVar.by().isEmpty()) ? true : z;
    }

    private final void c(List<docg> list) {
        docg docgVar;
        int i = this.i;
        this.i = list.size() + i;
        ArrayList arrayList = new ArrayList();
        if (i == 0 && (docgVar = this.g) != null) {
            arrayList.add(cdrr.r(docgVar, cdja.PUBLISHED));
        }
        for (docg docgVar2 : list) {
            docg docgVar3 = this.g;
            if (docgVar3 == null || !docgVar2.l.equals(docgVar3.l)) {
                if ((docgVar2.a & 16) != 0) {
                    arrayList.add(cdrr.r(docgVar2, cdja.PUBLISHED));
                }
            }
        }
        f(blhy.c(arrayList));
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwhl> btzrVar, btzy btzyVar) {
        this.h = false;
        f(blhy.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwhl> btzrVar, dwhn dwhnVar) {
        djux djuxVar = dwhnVar.a;
        if (djuxVar == null) {
            djuxVar = djux.c;
        }
        this.h = djuxVar.b;
        c(djuxVar.a);
    }

    @Override // defpackage.blho
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.blho
    protected final void b() {
        if (!this.e.l() || this.i != 0) {
            butl butlVar = this.c;
            blhw blhwVar = this.e;
            int i = this.i;
            djus bZ = djuv.i.bZ();
            String o = blhwVar.a().o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djuv djuvVar = (djuv) bZ.b;
            o.getClass();
            int i2 = djuvVar.a | 1;
            djuvVar.a = i2;
            djuvVar.b = o;
            djuvVar.a = i2 | 2;
            djuvVar.c = i;
            djuv.b(djuvVar);
            djuu e = blhwVar.d().e();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djuv djuvVar2 = (djuv) bZ.b;
            djuvVar2.d = e.f;
            djuvVar2.a |= 8;
            docr bZ2 = docs.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            docs.b((docs) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            docs.d((docs) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            docs.e((docs) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            docs.c((docs) bZ2.b);
            if (!blhwVar.g().isEmpty()) {
                String b = blhwVar.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djuv djuvVar3 = (djuv) bZ.b;
                b.getClass();
                djuvVar3.a |= 128;
                djuvVar3.g = b;
                boolean K = this.a.getUgcParameters().K();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                docs docsVar = (docs) bZ2.b;
                docsVar.a |= 128;
                docsVar.c = K;
            }
            if (blhwVar.f().a()) {
                djuq bZ3 = djur.c.bZ();
                drdk drdkVar = blhwVar.f().b().b;
                if (drdkVar == null) {
                    drdkVar = drdk.c;
                }
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djur djurVar = (djur) bZ3.b;
                drdkVar.getClass();
                djurVar.b = drdkVar;
                djurVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djuv djuvVar4 = (djuv) bZ.b;
                djur bK = bZ3.bK();
                bK.getClass();
                djuvVar4.h = bK;
                djuvVar4.a |= 256;
                drfb bZ4 = drfc.c.bZ();
                drey dreyVar = drey.PLACE_TOPIC_MENTION;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                drfc drfcVar = (drfc) bZ4.b;
                drfcVar.b = dreyVar.e;
                drfcVar.a |= 1;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                docs docsVar2 = (docs) bZ2.b;
                drfc bK2 = bZ4.bK();
                bK2.getClass();
                dsrj<drfc> dsrjVar = docsVar2.b;
                if (!dsrjVar.a()) {
                    docsVar2.b = dsqw.cl(dsrjVar);
                }
                docsVar2.b.add(bK2);
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djuv djuvVar5 = (djuv) bZ.b;
            docs bK3 = bZ2.bK();
            bK3.getClass();
            djuvVar5.f = bK3;
            djuvVar5.a |= 32;
            dwhk bZ5 = dwhl.c.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dwhl dwhlVar = (dwhl) bZ5.b;
            djuv bK4 = bZ.bK();
            bK4.getClass();
            dwhlVar.b = bK4;
            dwhlVar.a |= 1;
            butlVar.b(bZ5.bK(), this, this.d);
            return;
        }
        ilo iloVar = this.b;
        if (iloVar.w == null) {
            iloVar.by();
            if (iloVar.w == null) {
                iloVar.w = Boolean.FALSE;
            }
        }
        this.h = iloVar.w.booleanValue();
        c(dcbg.b(this.b.by()).s(blia.a).z());
    }
}
