package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: clnf  reason: default package */
/* loaded from: classes5.dex */
public final class clnf {
    public int A;
    public int B;
    public int C;
    public Class D;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public Metadata i;
    public String j;
    public String k;
    public int l;
    public List<byte[]> m;
    public DrmInitData n;
    public long o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public byte[] u;
    public int v;
    public ColorInfo w;
    public int x;
    public int y;
    public int z;

    public clnf() {
        this.f = -1;
        this.g = -1;
        this.l = -1;
        this.o = Long.MAX_VALUE;
        this.p = -1;
        this.q = -1;
        this.r = -1.0f;
        this.t = 1.0f;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.C = -1;
    }

    public clnf(Format format) {
        this.a = format.a;
        this.b = format.b;
        this.c = format.c;
        this.d = format.d;
        this.e = format.e;
        this.f = format.f;
        this.g = format.g;
        this.h = format.i;
        this.i = format.j;
        this.j = format.k;
        this.k = format.l;
        this.l = format.m;
        this.m = format.n;
        this.n = format.o;
        this.o = format.p;
        this.p = format.q;
        this.q = format.r;
        this.r = format.s;
        this.s = format.t;
        this.t = format.u;
        this.u = format.v;
        this.v = format.w;
        this.w = format.x;
        this.x = format.y;
        this.y = format.z;
        this.z = format.A;
        this.A = format.B;
        this.B = format.C;
        this.C = format.D;
        this.D = format.E;
    }

    public final Format a() {
        return new Format(this);
    }

    public final void b(int i) {
        this.a = Integer.toString(i);
    }
}
