package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: PG */
/* renamed from: alyt  reason: default package */
/* loaded from: classes.dex */
public final class alyt implements alyg {
    private static final akus r;
    @dzsi
    public final alyj a;
    public final String[] b;
    public final String[] c;
    public final int d;
    @dzsi
    public final List<alvz> e;
    @dzsi
    public final dmte f;
    @dzsi
    public final dcdc<dmrt> g;
    public final alvw[] h;
    public final dmnr[] i;
    public final akry j;
    public final alyh k;
    public akrx l;
    public final byte[] m;
    public final boolean n;
    public final int o;
    public final byte[] p;
    private amze q;

    static {
        akuq bZ = akus.o.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akus akusVar = (akus) bZ.b;
        akusVar.a |= 16384;
        akusVar.f = true;
        r = bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public alyt(@dzsi alyj alyjVar, amze amzeVar, akry akryVar, alyh alyhVar, String[] strArr, String[] strArr2, int i, @dzsi List<alvz> list, @dzsi dmte dmteVar, @dzsi dcdc<dmrt> dcdcVar, alvw[] alvwVarArr, dmnr[] dmnrVarArr, byte[] bArr, byte[] bArr2, boolean z, int i2, akrx akrxVar) {
        this.a = alyjVar;
        this.q = amzeVar;
        this.j = akryVar;
        this.k = alyhVar;
        this.b = strArr;
        this.c = strArr2;
        this.d = i;
        this.e = list;
        this.f = dmteVar;
        this.g = dcdcVar;
        this.h = (alvw[]) dbsk.s(alvwVarArr);
        this.p = bArr;
        this.m = bArr2;
        this.o = i2;
        this.n = z;
        this.l = akrxVar;
        this.i = dmnrVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x04c0 A[Catch: dsrm | IndexOutOfBoundsException | DataFormatException -> 0x049d, TryCatch #0 {dsrm | IndexOutOfBoundsException | DataFormatException -> 0x049d, blocks: (B:194:0x04b1, B:196:0x04c0, B:198:0x04cc, B:199:0x04ce, B:201:0x04de, B:202:0x04e4, B:204:0x0508, B:205:0x050e, B:207:0x0525, B:208:0x052b, B:209:0x0541, B:211:0x0547, B:189:0x048d, B:193:0x04a1, B:34:0x00b9), top: B:233:0x00b9, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0597 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.alyo h(defpackage.amze r33, defpackage.akry r34, defpackage.alyh r35, byte[] r36, boolean r37, defpackage.ckcw r38, defpackage.akrx r39) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alyt.h(amze, akry, alyh, byte[], boolean, ckcw, akrx):alyo");
    }

    static void k(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 95);
        }
    }

    public static dmnk l(byte[] bArr) {
        k(bArr);
        anad a = anag.a();
        try {
            try {
                return p(bArr, true, a);
            } finally {
                anag.b(a);
                k(bArr);
            }
        } catch (dsrm | IndexOutOfBoundsException | DataFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
            sb.append("parseHeader: Error in decompressing or parsing proto - ");
            sb.append(valueOf);
            throw new IOException(sb.toString(), e);
        }
    }

    public static boolean m(alyg alygVar) {
        return alygVar instanceof alvx;
    }

    public static dsqa n() {
        dsqa a = dsqa.a();
        dmnl.a(a);
        a.e(dmqa.a);
        a.e(dmqa.b);
        a.e(dmqa.c);
        a.e(dmqa.d);
        a.e(dmqa.e);
        a.e(dmqa.f);
        a.e(dmqa.g);
        return a;
    }

    private static int o(amze amzeVar, dmnk dmnkVar) {
        int i = amzeVar.j;
        return i != 0 ? i : dmnkVar.d;
    }

    private static dmnk p(byte[] bArr, boolean z, anad anadVar) {
        if (z) {
            int length = bArr.length;
            Inflater inflater = new Inflater(true);
            try {
                inflater.setInput(bArr, 0, length);
                anadVar.e(length * 4);
                int inflate = inflater.inflate(anadVar.a(), 0, anadVar.b());
                boolean z2 = false;
                while (!inflater.finished()) {
                    int b = anadVar.b();
                    anadVar.e(b + b);
                    int inflate2 = inflater.inflate(anadVar.a(), inflate, anadVar.b() - inflate);
                    if (inflate2 == 0) {
                        if (!inflater.needsInput() || z2) {
                            break;
                        }
                        inflater.setInput(anak.a);
                        z2 = true;
                        inflate2 = 0;
                    }
                    inflate += inflate2;
                }
                anadVar.e(inflate);
                inflater.end();
                return (dmnk) ((dssr) dmnk.o.cu(7)).k(anadVar.a(), 0, anadVar.b(), n());
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        }
        return (dmnk) ((dssr) dmnk.o.cu(7)).k(bArr, 0, bArr.length, n());
    }

    @Override // defpackage.alyg
    public final alyh a() {
        return this.k;
    }

    @Override // defpackage.alyg
    public final akry b() {
        return this.j;
    }

    @Override // defpackage.alyg
    public final synchronized amze c() {
        return this.q;
    }

    @Override // defpackage.alyg
    public final synchronized void d(amze amzeVar) {
        this.q = amzeVar;
    }

    @Override // defpackage.alyg
    public final synchronized void e(akrx akrxVar) {
        this.l = akrxVar;
    }

    @Override // defpackage.alyg
    public final int f() {
        return this.o;
    }

    @Override // defpackage.alyg
    public final synchronized akrx g() {
        return this.l;
    }

    public final alyr i() {
        List<alvz> list = this.e;
        dbsk.s(list);
        return new alys(list);
    }

    public final dcdc<dmrt> j() {
        dcdc<dmrt> dcdcVar = this.g;
        dbsk.s(dcdcVar);
        return dcdcVar;
    }
}
