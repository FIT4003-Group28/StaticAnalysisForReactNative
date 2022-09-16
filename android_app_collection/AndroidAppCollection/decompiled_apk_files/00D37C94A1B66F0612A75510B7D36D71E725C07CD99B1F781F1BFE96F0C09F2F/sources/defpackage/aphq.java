package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aphq */
/* loaded from: classes.dex */
public final class aphq {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "USER_INTERFACE_THEME_DARK" : "USER_INTERFACE_THEME_LIGHT" : "USER_INTERFACE_THEME_UNKNOWN";
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static aoqu g(Parcel parcel, aoqu aoquVar, aoos aoosVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        if (Build.VERSION.SDK_INT >= 23) {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR);
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcel.readParcelable(ProtoParsers$InternalDontUse.class.getClassLoader());
        }
        return h(protoParsers$InternalDontUse, aoquVar, aoosVar);
    }

    public static aoqu h(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, aoqu aoquVar, aoos aoosVar) {
        return protoParsers$InternalDontUse.b(aoquVar.mo50getDefaultInstanceForType(), aoosVar);
    }

    public static aoqu i(Bundle bundle, String str, aoqu aoquVar, aoos aoosVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return h(protoParsers$InternalDontUse, aoquVar, aoosVar);
    }

    public static aoqu j(Bundle bundle, String str, aoqu aoquVar, aoos aoosVar) {
        try {
            return i(bundle, str, aoquVar, aoosVar);
        } catch (aopx e) {
            throw new RuntimeException(e);
        }
    }

    public static ProtoParsers$ParcelableProto k(aoqu aoquVar) {
        return new ProtoParsers$InternalDontUse(null, aoquVar);
    }

    public static void l(Parcel parcel, aoqu aoquVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, aoquVar), 0);
        } else {
            parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, aoquVar), 0);
        }
    }

    public static void m(Bundle bundle, String str, aoqu aoquVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, aoquVar));
        bundle.putParcelable(str, bundle2);
    }

    public static final String n(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!apfu.k(b)) {
                break;
            }
            i++;
            apfu.h(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (apfu.k(b2)) {
                int i7 = i5 + 1;
                apfu.h(b2, cArr, i5);
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!apfu.k(b3)) {
                            break;
                        }
                        i++;
                        i7 = i5 + 1;
                        apfu.h(b3, cArr, i5);
                    }
                }
            } else if (apfu.m(b2)) {
                if (i6 < i3) {
                    apfu.j(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw aopx.d();
                }
            } else if (apfu.l(b2)) {
                if (i6 < i3 - 1) {
                    int i8 = i6 + 1;
                    apfu.i(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    throw aopx.d();
                }
            } else if (i6 < i3 - 2) {
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                apfu.g(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i5 += 2;
                i = i10 + 1;
            } else {
                throw aopx.d();
            }
        }
        return new String(cArr, 0, i5);
    }

    public static String o(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!apfu.k(b)) {
                break;
            }
            i++;
            apfu.h(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (apfu.k(b2)) {
                int i6 = i4 + 1;
                apfu.h(b2, cArr, i4);
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i < i3) {
                        byte b3 = bArr[i];
                        if (!apfu.k(b3)) {
                            break;
                        }
                        i++;
                        i6 = i4 + 1;
                        apfu.h(b3, cArr, i4);
                    }
                }
            } else if (apfu.m(b2)) {
                if (i5 < i3) {
                    apfu.j(b2, bArr[i5], cArr, i4);
                    i = i5 + 1;
                    i4++;
                } else {
                    throw aopx.d();
                }
            } else if (apfu.l(b2)) {
                if (i5 < i3 - 1) {
                    int i7 = i5 + 1;
                    apfu.i(b2, bArr[i5], bArr[i7], cArr, i4);
                    i = i7 + 1;
                    i4++;
                } else {
                    throw aopx.d();
                }
            } else if (i5 < i3 - 2) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                apfu.g(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                i4 += 2;
                i = i9 + 1;
            } else {
                throw aopx.d();
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x001c, code lost:
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0047, code lost:
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0083, code lost:
        if (r12[r13] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int p(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aphq.p(int, byte[], int, int):int");
    }

    public static final boolean q(byte[] bArr, int i, int i2) {
        return p(0, bArr, i, i2) == 0;
    }
}
