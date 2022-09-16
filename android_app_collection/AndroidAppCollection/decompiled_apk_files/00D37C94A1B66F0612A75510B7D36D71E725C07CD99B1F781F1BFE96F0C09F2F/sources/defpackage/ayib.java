package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayib  reason: default package */
/* loaded from: classes2.dex */
public final class ayib {
    private static final Logger a = Logger.getLogger(ayib.class.getName());

    private ayib() {
    }

    public static Object a(String str) {
        aoem aoemVar = new aoem(new StringReader(str));
        try {
            return b(aoemVar);
        } finally {
            try {
                aoemVar.close();
            } catch (IOException e) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
            }
        }
    }

    private static Object b(aoem aoemVar) {
        String d;
        String str;
        double parseDouble;
        aqxo.z(aoemVar.g(), "unexpected end of JSON");
        int h = aoemVar.h() - 1;
        boolean z = true;
        if (h == 0) {
            int i = aoemVar.c;
            if (i == 0) {
                i = aoemVar.a();
            }
            if (i == 3) {
                aoemVar.f(1);
                aoemVar.i[aoemVar.g - 1] = 0;
                aoemVar.c = 0;
                ArrayList arrayList = new ArrayList();
                while (aoemVar.g()) {
                    arrayList.add(b(aoemVar));
                }
                boolean z2 = aoemVar.h() == 2;
                String valueOf = String.valueOf(aoemVar.b());
                aqxo.z(z2, valueOf.length() != 0 ? "Bad token: ".concat(valueOf) : new String("Bad token: "));
                int i2 = aoemVar.c;
                if (i2 == 0) {
                    i2 = aoemVar.a();
                }
                if (i2 == 4) {
                    int i3 = aoemVar.g - 1;
                    aoemVar.g = i3;
                    int[] iArr = aoemVar.i;
                    int i4 = i3 - 1;
                    iArr[i4] = iArr[i4] + 1;
                    aoemVar.c = 0;
                    return Collections.unmodifiableList(arrayList);
                }
                String b = aoex.b(aoemVar.h());
                String c = aoemVar.c();
                StringBuilder sb = new StringBuilder(b.length() + 27 + String.valueOf(c).length());
                sb.append("Expected END_ARRAY but was ");
                sb.append(b);
                sb.append(c);
                throw new IllegalStateException(sb.toString());
            }
            String b2 = aoex.b(aoemVar.h());
            String c2 = aoemVar.c();
            StringBuilder sb2 = new StringBuilder(b2.length() + 29 + String.valueOf(c2).length());
            sb2.append("Expected BEGIN_ARRAY but was ");
            sb2.append(b2);
            sb2.append(c2);
            throw new IllegalStateException(sb2.toString());
        }
        char c3 = '\"';
        if (h == 2) {
            int i5 = aoemVar.c;
            if (i5 == 0) {
                i5 = aoemVar.a();
            }
            if (i5 == 1) {
                aoemVar.f(3);
                aoemVar.c = 0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (aoemVar.g()) {
                    int i6 = aoemVar.c;
                    if (i6 == 0) {
                        i6 = aoemVar.a();
                    }
                    if (i6 == 14) {
                        d = aoemVar.e();
                    } else if (i6 == 12) {
                        d = aoemVar.d('\'');
                    } else if (i6 == 13) {
                        d = aoemVar.d('\"');
                    } else {
                        String b3 = aoex.b(aoemVar.h());
                        String c4 = aoemVar.c();
                        StringBuilder sb3 = new StringBuilder(b3.length() + 24 + String.valueOf(c4).length());
                        sb3.append("Expected a name but was ");
                        sb3.append(b3);
                        sb3.append(c4);
                        throw new IllegalStateException(sb3.toString());
                    }
                    aoemVar.c = 0;
                    aoemVar.h[aoemVar.g - 1] = d;
                    linkedHashMap.put(d, b(aoemVar));
                }
                boolean z3 = aoemVar.h() == 4;
                String valueOf2 = String.valueOf(aoemVar.b());
                aqxo.z(z3, valueOf2.length() != 0 ? "Bad token: ".concat(valueOf2) : new String("Bad token: "));
                int i7 = aoemVar.c;
                if (i7 == 0) {
                    i7 = aoemVar.a();
                }
                if (i7 == 2) {
                    int i8 = aoemVar.g - 1;
                    aoemVar.g = i8;
                    aoemVar.h[i8] = null;
                    int[] iArr2 = aoemVar.i;
                    int i9 = i8 - 1;
                    iArr2[i9] = iArr2[i9] + 1;
                    aoemVar.c = 0;
                    return Collections.unmodifiableMap(linkedHashMap);
                }
                String b4 = aoex.b(aoemVar.h());
                String c5 = aoemVar.c();
                StringBuilder sb4 = new StringBuilder(b4.length() + 28 + String.valueOf(c5).length());
                sb4.append("Expected END_OBJECT but was ");
                sb4.append(b4);
                sb4.append(c5);
                throw new IllegalStateException(sb4.toString());
            }
            String b5 = aoex.b(aoemVar.h());
            String c6 = aoemVar.c();
            StringBuilder sb5 = new StringBuilder(b5.length() + 30 + String.valueOf(c6).length());
            sb5.append("Expected BEGIN_OBJECT but was ");
            sb5.append(b5);
            sb5.append(c6);
            throw new IllegalStateException(sb5.toString());
        } else if (h == 5) {
            int i10 = aoemVar.c;
            if (i10 == 0) {
                i10 = aoemVar.a();
            }
            if (i10 == 10) {
                str = aoemVar.e();
            } else if (i10 == 8) {
                str = aoemVar.d('\'');
            } else if (i10 == 9) {
                str = aoemVar.d('\"');
            } else if (i10 == 11) {
                str = aoemVar.f;
                aoemVar.f = null;
            } else if (i10 == 15) {
                str = Long.toString(aoemVar.d);
            } else if (i10 == 16) {
                str = new String(aoemVar.a, aoemVar.b, aoemVar.e);
                aoemVar.b += aoemVar.e;
            } else {
                String b6 = aoex.b(aoemVar.h());
                String c7 = aoemVar.c();
                StringBuilder sb6 = new StringBuilder(b6.length() + 26 + String.valueOf(c7).length());
                sb6.append("Expected a string but was ");
                sb6.append(b6);
                sb6.append(c7);
                throw new IllegalStateException(sb6.toString());
            }
            aoemVar.c = 0;
            int[] iArr3 = aoemVar.i;
            int i11 = aoemVar.g - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return str;
        } else if (h != 6) {
            if (h != 7) {
                if (h != 8) {
                    String valueOf3 = String.valueOf(aoemVar.b());
                    throw new IllegalStateException(valueOf3.length() != 0 ? "Bad token: ".concat(valueOf3) : new String("Bad token: "));
                }
                int i12 = aoemVar.c;
                if (i12 == 0) {
                    i12 = aoemVar.a();
                }
                if (i12 == 7) {
                    aoemVar.c = 0;
                    int[] iArr4 = aoemVar.i;
                    int i13 = aoemVar.g - 1;
                    iArr4[i13] = iArr4[i13] + 1;
                    return null;
                }
                String b7 = aoex.b(aoemVar.h());
                String c8 = aoemVar.c();
                StringBuilder sb7 = new StringBuilder(b7.length() + 22 + String.valueOf(c8).length());
                sb7.append("Expected null but was ");
                sb7.append(b7);
                sb7.append(c8);
                throw new IllegalStateException(sb7.toString());
            }
            int i14 = aoemVar.c;
            if (i14 == 0) {
                i14 = aoemVar.a();
            }
            if (i14 == 5) {
                aoemVar.c = 0;
                int[] iArr5 = aoemVar.i;
                int i15 = aoemVar.g - 1;
                iArr5[i15] = iArr5[i15] + 1;
            } else if (i14 == 6) {
                aoemVar.c = 0;
                int[] iArr6 = aoemVar.i;
                int i16 = aoemVar.g - 1;
                iArr6[i16] = iArr6[i16] + 1;
                z = false;
            } else {
                String b8 = aoex.b(aoemVar.h());
                String c9 = aoemVar.c();
                StringBuilder sb8 = new StringBuilder(b8.length() + 27 + String.valueOf(c9).length());
                sb8.append("Expected a boolean but was ");
                sb8.append(b8);
                sb8.append(c9);
                throw new IllegalStateException(sb8.toString());
            }
            return Boolean.valueOf(z);
        } else {
            int i17 = aoemVar.c;
            if (i17 == 0) {
                i17 = aoemVar.a();
            }
            if (i17 == 15) {
                aoemVar.c = 0;
                int[] iArr7 = aoemVar.i;
                int i18 = aoemVar.g - 1;
                iArr7[i18] = iArr7[i18] + 1;
                parseDouble = aoemVar.d;
            } else {
                if (i17 == 16) {
                    aoemVar.f = new String(aoemVar.a, aoemVar.b, aoemVar.e);
                    aoemVar.b += aoemVar.e;
                } else if (i17 == 8 || i17 == 9) {
                    if (i17 == 8) {
                        c3 = '\'';
                    }
                    aoemVar.f = aoemVar.d(c3);
                } else if (i17 == 10) {
                    aoemVar.f = aoemVar.e();
                } else if (i17 != 11) {
                    String b9 = aoex.b(aoemVar.h());
                    String c10 = aoemVar.c();
                    StringBuilder sb9 = new StringBuilder(b9.length() + 26 + String.valueOf(c10).length());
                    sb9.append("Expected a double but was ");
                    sb9.append(b9);
                    sb9.append(c10);
                    throw new IllegalStateException(sb9.toString());
                }
                aoemVar.c = 11;
                parseDouble = Double.parseDouble(aoemVar.f);
                if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                    String c11 = aoemVar.c();
                    StringBuilder sb10 = new StringBuilder(String.valueOf(c11).length() + 57);
                    sb10.append("JSON forbids NaN and infinities: ");
                    sb10.append(parseDouble);
                    sb10.append(c11);
                    throw new aoen(sb10.toString());
                }
                aoemVar.f = null;
                aoemVar.c = 0;
                int[] iArr8 = aoemVar.i;
                int i19 = aoemVar.g - 1;
                iArr8[i19] = iArr8[i19] + 1;
            }
            return Double.valueOf(parseDouble);
        }
    }
}
