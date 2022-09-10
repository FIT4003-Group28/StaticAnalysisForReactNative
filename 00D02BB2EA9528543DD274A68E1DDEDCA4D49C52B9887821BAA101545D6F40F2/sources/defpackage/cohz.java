package defpackage;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.learning.internal.secagg.PRFInputVectorSpecification;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.NoSuchPaddingException;
/* compiled from: PG */
/* renamed from: cohz  reason: default package */
/* loaded from: classes5.dex */
public final class cohz extends cohv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [javax.crypto.NoSuchPaddingException, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v3 */
    private static final coba e(coba cobaVar, coba cobaVar2, coba cobaVar3, PRFInputVectorSpecification[] pRFInputVectorSpecificationArr, final cohx cohxVar, int i) {
        ?? r8;
        byte[] bArr = (byte[]) cobb.c(cobaVar);
        List<byte[]> a = coib.a(cobaVar2);
        List<byte[]> a2 = coib.a(cobaVar3);
        int length = pRFInputVectorSpecificationArr.length;
        ArrayList<cvgp> arrayList = new ArrayList(length);
        char c = 0;
        int i2 = 0;
        while (true) {
            r8 = 1;
            boolean z = true;
            if (i2 >= length) {
                break;
            }
            PRFInputVectorSpecification pRFInputVectorSpecification = pRFInputVectorSpecificationArr[i2];
            String str = pRFInputVectorSpecification.c;
            int i3 = pRFInputVectorSpecification.a;
            int i4 = pRFInputVectorSpecification.b;
            dbsk.b(str != null, "Name must be non-null.");
            dbsk.e(i3 >= 0, "Length must be >=0, given value was %s", i3);
            if (i4 <= 0 || i4 > 62) {
                z = false;
            }
            dbsk.h(z, "The specified bitWidth is not valid: must be > 0 and <= %s, supplied value : %s.", 62, i4);
            arrayList.add(new cvgo(str, i3, i4));
            i2++;
        }
        dbty dbtyVar = new dbty(cohxVar) { // from class: cohy
            private final cohx a;

            {
                this.a = cohxVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                try {
                    return Boolean.valueOf(this.a.e());
                } catch (RemoteException unused) {
                    return true;
                }
            }
        };
        try {
            dbsk.b(bArr != null, "'input' argument must be non-null array.");
            dbsk.b(true, "'inputVectorSpecifications' argument must be non-null.");
            dbsk.b(a != null, "'prfKeysToAdd' argument must be non-null.");
            dbsk.b(a2 != null, "'prfKeysToSubtract' argument must be non-null.");
            char c2 = 2;
            int i5 = i;
            if (i5 != 1) {
                i5 = 2;
            }
            dbsk.a(true);
            boolean z2 = i5 == 2;
            HashMap hashMap = new HashMap();
            for (cvgp cvgpVar : arrayList) {
                if (!((Boolean) dbtyVar.a()).booleanValue()) {
                    int b = cvgpVar.b();
                    int c3 = cvgpVar.c();
                    String a3 = cvgpVar.a();
                    long j = 1 << c3;
                    byte[][] bArr2 = new byte[4];
                    bArr2[c] = bArr;
                    byte[] i6 = decl.i(c3);
                    ?? r82 = r8 == true ? 1 : 0;
                    ?? r83 = r8 == true ? 1 : 0;
                    bArr2[r82] = i6;
                    bArr2[c2] = decl.i(b);
                    bArr2[3] = a3.getBytes("UTF-8");
                    byte[] b2 = deca.b(bArr2);
                    long[] jArr = new long[b];
                    for (byte[] bArr3 : a) {
                        if (!((Boolean) dbtyVar.a()).booleanValue()) {
                            cvgs a4 = cvgt.a(c3, bArr3, b2, z2);
                            for (int i7 = 0; i7 < b; i7++) {
                                jArr[i7] = (jArr[i7] + a4.a()) % j;
                            }
                        } else {
                            throw new cvgu(null);
                        }
                    }
                    for (byte[] bArr4 : a2) {
                        if (!((Boolean) dbtyVar.a()).booleanValue()) {
                            cvgs a5 = cvgt.a(c3, bArr4, b2, z2);
                            dbty dbtyVar2 = dbtyVar;
                            for (int i8 = 0; i8 < b; i8++) {
                                long a6 = jArr[i8] - a5.a();
                                if (a6 < 0) {
                                    a6 += j;
                                }
                                jArr[i8] = a6;
                            }
                            dbtyVar = dbtyVar2;
                        } else {
                            throw new cvgu(null);
                        }
                    }
                    hashMap.put(a3, dbsi.a(jArr, Integer.valueOf(c3)));
                    dbtyVar = dbtyVar;
                    c2 = 2;
                    c = 0;
                    r8 = 1;
                } else {
                    throw new cvgu(null);
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((String) entry.getKey(), Pair.create((long[]) ((dbsi) entry.getValue()).a, (Integer) ((dbsi) entry.getValue()).b));
            }
            return cobb.b(hashMap2);
        } catch (cvgu | UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // defpackage.cohw
    public final boolean b() {
        return true;
    }

    @Override // defpackage.cohw
    public final coba c(coba cobaVar, coba cobaVar2, coba cobaVar3, PRFInputVectorSpecification[] pRFInputVectorSpecificationArr, cohx cohxVar) {
        return e(cobaVar, cobaVar2, cobaVar3, pRFInputVectorSpecificationArr, cohxVar, 1);
    }

    @Override // defpackage.cohw
    public final coba d(coba cobaVar, coba cobaVar2, coba cobaVar3, PRFInputVectorSpecification[] pRFInputVectorSpecificationArr, cohx cohxVar) {
        return e(cobaVar, cobaVar2, cobaVar3, pRFInputVectorSpecificationArr, cohxVar, 2);
    }
}
