package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cluz  reason: default package */
/* loaded from: classes5.dex */
public final class cluz {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final cluy k;
    private final Metadata l;

    public cluz(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, cluy cluyVar, Metadata metadata) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = g(i5);
        this.g = i6;
        this.h = i7;
        this.i = h(i7);
        this.j = j;
        this.k = cluyVar;
        this.l = metadata;
    }

    public cluz(byte[] bArr, int i) {
        cmnj cmnjVar = new cmnj(bArr);
        cmnjVar.f(i * 8);
        this.a = cmnjVar.j(16);
        this.b = cmnjVar.j(16);
        this.c = cmnjVar.j(24);
        this.d = cmnjVar.j(24);
        int j = cmnjVar.j(20);
        this.e = j;
        this.f = g(j);
        this.g = cmnjVar.j(3) + 1;
        int j2 = cmnjVar.j(5) + 1;
        this.h = j2;
        this.i = h(j2);
        this.j = cmny.I(cmnjVar.j(4), cmnjVar.j(32));
        this.k = null;
        this.l = null;
    }

    public static Metadata f(List<String> list, List<PictureFrame> list2) {
        if (!list.isEmpty() || !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                String[] v = cmny.v(str, "=");
                if (v.length == 2) {
                    arrayList.add(new VorbisComment(v[0], v[1]));
                } else if (String.valueOf(str).length() == 0) {
                    new String("Failed to parse Vorbis comment: ");
                }
            }
            arrayList.addAll(list2);
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
            return null;
        }
        return null;
    }

    private static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int h(int i) {
        if (i != 8) {
            if (i == 12) {
                return 2;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 20) {
                return 5;
            }
            return i != 24 ? -1 : 6;
        }
        return 1;
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return cmny.C((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public final Format c(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        Metadata d = d(metadata);
        clnf clnfVar = new clnf();
        clnfVar.k = "audio/flac";
        clnfVar.l = i;
        clnfVar.x = this.g;
        clnfVar.y = this.e;
        clnfVar.m = Collections.singletonList(bArr);
        clnfVar.i = d;
        return clnfVar.a();
    }

    public final Metadata d(Metadata metadata) {
        Metadata metadata2 = this.l;
        return metadata2 == null ? metadata : metadata == null ? metadata2 : metadata2.c(metadata.a);
    }

    public final cluz e(cluy cluyVar) {
        return new cluz(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, cluyVar, this.l);
    }
}
