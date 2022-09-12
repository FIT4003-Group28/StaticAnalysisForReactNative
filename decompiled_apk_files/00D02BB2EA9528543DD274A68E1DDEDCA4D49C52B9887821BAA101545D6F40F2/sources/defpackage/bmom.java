package defpackage;
/* compiled from: PG */
/* renamed from: bmom  reason: default package */
/* loaded from: classes3.dex */
public class bmom {
    public final dxio<angp> a;
    public final dxio<ania> b;
    public final bmnj c;
    public final cqat d;
    public final aese e;
    public final bvrb f;
    private final akfa g;
    private final bvjj h;
    private final ckcw i;

    public bmom(akfa akfaVar, bvjj bvjjVar, ckcw ckcwVar, dxio<angp> dxioVar, dxio<ania> dxioVar2, bmnj bmnjVar, cqat cqatVar, aese aeseVar, bvrb bvrbVar) {
        this.g = akfaVar;
        this.h = bvjjVar;
        this.i = ckcwVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = bmnjVar;
        this.d = cqatVar;
        this.e = aeseVar;
        this.f = bvrbVar;
    }

    public static boolean b(ilo iloVar) {
        dnem dnemVar = iloVar.bX().p;
        if (dnemVar == null) {
            dnemVar = dnem.h;
        }
        if ((dnemVar.a & 2) != 0) {
            dnem dnemVar2 = iloVar.bX().p;
            if (dnemVar2 == null) {
                dnemVar2 = dnem.h;
            }
            dnel dnelVar = dnemVar2.c;
            if (dnelVar == null) {
                dnelVar = dnel.c;
            }
            return (dnelVar.a & 1) == 0;
        }
        return false;
    }

    public static final boolean e(ilo iloVar) {
        return b(iloVar) && iloVar.bX().n.size() > 0 && (iloVar.bX().n.get(0).a & 8) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.ckgz r6, @defpackage.dzsi defpackage.ilo r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L87
            dnwf r1 = r7.bX()
            int r1 = r1.a
            r1 = r1 & 64
            if (r1 == 0) goto L87
            ckcw r1 = r5.i
            java.lang.Object r6 = r1.a(r6)
            ckco r6 = (defpackage.ckco) r6
            dnwf r1 = r7.bX()
            dnem r1 = r1.p
            if (r1 != 0) goto L1f
            dnem r1 = defpackage.dnem.h
        L1f:
            int r1 = r1.a
            r2 = 2
            r1 = r1 & r2
            r3 = 1
            if (r1 == 0) goto L28
        L26:
            r1 = 1
            goto L38
        L28:
            dnwf r1 = r7.bX()
            dnem r1 = r1.p
            if (r1 != 0) goto L32
            dnem r1 = defpackage.dnem.h
        L32:
            boolean r1 = r1.e
            if (r1 == 0) goto L37
            goto L26
        L37:
            r1 = 0
        L38:
            dxio<ania> r4 = r5.b
            java.lang.Object r4 = r4.a()
            ania r4 = (defpackage.ania) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L4d
            boolean r4 = r5.c()
            if (r4 == 0) goto L4d
            r0 = 1
        L4d:
            dnwf r4 = r7.bX()
            dnem r4 = r4.p
            if (r4 != 0) goto L57
            dnem r4 = defpackage.dnem.h
        L57:
            boolean r4 = r4.f
            if (r0 == 0) goto L71
            boolean r7 = e(r7)
            if (r7 == 0) goto L64
            r2 = 9
            goto L7f
        L64:
            if (r1 == 0) goto L6b
            if (r3 == r4) goto L69
            goto L7f
        L69:
            r2 = 1
            goto L7f
        L6b:
            if (r3 == r4) goto L6f
            r2 = 4
            goto L7f
        L6f:
            r2 = 3
            goto L7f
        L71:
            if (r1 == 0) goto L79
            if (r3 == r4) goto L77
            r2 = 6
            goto L7f
        L77:
            r2 = 5
            goto L7f
        L79:
            if (r3 == r4) goto L7e
            r2 = 8
            goto L7f
        L7e:
            r2 = 7
        L7f:
            int r7 = defpackage.ckgl.a(r2)
            r6.a(r7)
            return r3
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmom.a(ckgz, ilo):boolean");
    }

    public final boolean c() {
        dwvb d = d();
        if (d != null) {
            dvnk dvnkVar = d.d;
            if (dvnkVar == null) {
                dvnkVar = dvnk.b;
            }
            return dvnkVar.a;
        }
        return false;
    }

    @dzsi
    public final dwvb d() {
        return (dwvb) this.h.N(bvjk.ga, this.g.j(), (dssr) dwvb.e.cu(7), dwvb.e);
    }
}
