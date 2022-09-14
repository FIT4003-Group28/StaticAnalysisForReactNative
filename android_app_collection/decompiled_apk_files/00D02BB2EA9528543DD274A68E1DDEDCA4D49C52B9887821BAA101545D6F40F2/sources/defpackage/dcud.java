package defpackage;
/* compiled from: PG */
/* renamed from: dcud  reason: default package */
/* loaded from: classes.dex */
public final class dcud extends dcuh {
    public static final dcuh a = new dcud();

    private dcud() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dcuh
    public final int a(dcue<?> dcueVar, int i, String str, int i2, int i3, int i4) {
        dctz dctyVar;
        int i5 = i4 + 1;
        char charAt = str.charAt(i4);
        dcrg a2 = dcrg.a(str, i3, i4, (charAt & ' ') == 0);
        dcrf dcrfVar = dcrf.k[dcrf.a(charAt)];
        if (!dcrf.b(charAt) && (dcrfVar == null || (dcrfVar.n & 128) == 0)) {
            dcrfVar = null;
        }
        if (dcrfVar != null) {
            if (!a2.d(dcrfVar.n, dcrfVar.m.f)) {
                throw dcug.a("invalid format specifier", str, i2, i5);
            }
            dctyVar = dcub.b(i, dcrfVar, a2);
        } else if (charAt == 't' || charAt == 'T') {
            if (a2.d(160, false)) {
                int i6 = i5 + 1;
                if (i6 > str.length()) {
                    throw dcug.b("truncated format specifier", str, i2);
                }
                dctx dctxVar = dctx.F.get(Character.valueOf(str.charAt(i5)));
                if (dctxVar == null) {
                    throw dcug.b("illegal date/time conversion", str, i5);
                }
                dctyVar = new dcty(a2, i, dctxVar);
                i5 = i6;
            } else {
                throw dcug.a("invalid format specification", str, i2, i5);
            }
        } else if (charAt == 'h' || charAt == 'H') {
            if (a2.d(160, false)) {
                dctyVar = new dcuc(a2, i);
            } else {
                throw dcug.a("invalid format specification", str, i2, i5);
            }
        } else {
            throw dcug.a("invalid format specification", str, i2, i5);
        }
        int i7 = dctyVar.a;
        if (i7 < 32) {
            dcueVar.d |= 1 << i7;
        }
        dcueVar.e = Math.max(dcueVar.e, i7);
        dcre dcreVar = (dcre) dcueVar;
        dcueVar.c().c(dcreVar.b, dcueVar.d(), dcreVar.c, i2);
        Object[] objArr = dcreVar.a;
        int i8 = dctyVar.a;
        if (i8 >= objArr.length) {
            dcreVar.b.append("[ERROR: MISSING LOG ARGUMENT]");
        } else {
            Object obj = objArr[i8];
            if (obj == null) {
                dcreVar.b.append("null");
            } else {
                dctyVar.a(dcueVar, obj);
            }
        }
        dcreVar.c = i5;
        return i5;
    }
}
