package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: algi  reason: default package */
/* loaded from: classes2.dex */
public final class algi implements algf {
    private final dbty<algm> a;
    private final vpd b;
    private final vwv c;
    private final bvsl d;
    private final algk e;

    public algi(final dxio<akvz> dxioVar, vpd vpdVar, final Resources resources, vwv vwvVar, bvsl bvslVar) {
        this.a = dbud.a(new dbty(dxioVar, resources) { // from class: algh
            private final dxio a;
            private final Resources b;

            {
                this.a = dxioVar;
                this.b = resources;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar2 = this.a;
                return new algm((akvz) dxioVar2.a(), this.b);
            }
        });
        this.b = vpdVar;
        this.c = vwvVar;
        this.d = bvslVar;
        this.e = new algk(vwvVar);
    }

    private static void c(dmpe dmpeVar, List<akuh> list, dmpd dmpdVar) {
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                dmpeVar.c(dmpdVar);
            }
            dmpc dmpcVar = (dmpc) dmpd.h.bZ();
            int a = list.get(i).a();
            if (dmpcVar.c) {
                dmpcVar.bF();
                dmpcVar.c = false;
            }
            dmpd dmpdVar2 = (dmpd) dmpcVar.b;
            dmpdVar2.a |= 2;
            dmpdVar2.c = a;
            dmpeVar.b(dmpcVar);
        }
    }

    @Override // defpackage.algf
    public final void a() {
        algm a = this.a.a();
        a.b.j(a.c);
        a.b.j(a.d);
        a.b.j(a.e);
        a.b.j(a.f);
        a.b.j(a.g);
        a.b.j(a.h);
        a.b.j(a.i);
        a.b.j(a.l);
        a.b.j(a.m);
        a.b.j(a.n);
        synchronized (a) {
            for (akuh akuhVar : a.o.values()) {
                a.b.j(akuhVar);
            }
            a.o.clear();
        }
        a.b.j(a.k);
        a.b.j(a.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04c9  */
    @Override // defpackage.algf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dmpn b(android.content.Context r25, defpackage.alfa r26, defpackage.alez r27, defpackage.alfb r28, boolean r29, boolean r30, java.lang.String r31, int r32, int r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.algi.b(android.content.Context, alfa, alez, alfb, boolean, boolean, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean, boolean):dmpn");
    }

    public algi(final dxio<akvz> dxioVar, vpd vpdVar, final Resources resources, vwv vwvVar, bvsl bvslVar, algk algkVar) {
        this.a = dbud.a(new dbty(dxioVar, resources) { // from class: algg
            private final dxio a;
            private final Resources b;

            {
                this.a = dxioVar;
                this.b = resources;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar2 = this.a;
                return new algm((akvz) dxioVar2.a(), this.b);
            }
        });
        this.b = vpdVar;
        this.c = vwvVar;
        this.d = bvslVar;
        this.e = algkVar;
    }
}
