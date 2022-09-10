package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clwj  reason: default package */
/* loaded from: classes5.dex */
public final class clwj {
    public byte[] N;
    public clwk T;
    public boolean U;
    public clvk X;
    public int Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public clvj j;
    public byte[] k;
    public DrmInitData l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public int r = -1;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public byte[] v = null;
    public int w = -1;
    public boolean x = false;
    public int y = -1;
    public int z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    public String W = "eng";

    public static Pair<String, List<byte[]>> a(cmnk cmnkVar) {
        try {
            cmnkVar.h(16);
            long q = cmnkVar.q();
            if (q == 1482049860) {
                return new Pair<>("video/divx", null);
            }
            if (q == 859189832) {
                return new Pair<>("video/3gpp", null);
            }
            if (q != 826496599) {
                return new Pair<>("video/x-unknown", null);
            }
            int i = cmnkVar.b + 20;
            byte[] bArr = cmnkVar.a;
            while (true) {
                int length = bArr.length;
                if (i < length - 4) {
                    if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                    }
                    i++;
                } else {
                    throw new clob("Failed to find FourCC VC1 initialization data");
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new clob("Error parsing FourCC private data");
        }
    }

    public static List<byte[]> b(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if (i != -1) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if (i2 != -1) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] != 1) {
                    throw new clob("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw new clob("Error parsing vorbis codec private");
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw new clob("Error parsing vorbis codec private");
                }
                int length = bArr.length - i11;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr, i11, bArr3, 0, length);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            }
            throw new clob("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new clob("Error parsing vorbis codec private");
        }
    }

    public static boolean c(cmnk cmnkVar) {
        try {
            int n = cmnkVar.n();
            if (n == 1) {
                return true;
            }
            if (n == 65534) {
                cmnkVar.f(24);
                if (cmnkVar.t() == clwl.b.getMostSignificantBits()) {
                    if (cmnkVar.t() == clwl.b.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new clob("Error parsing MS/ACM codec private");
        }
    }
}
