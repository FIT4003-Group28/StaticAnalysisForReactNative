package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ovu  reason: default package */
/* loaded from: classes4.dex */
public final class ovu {
    public final MediaFormat a;
    public final int b;
    public final int c;
    public final int d;
    public final ovm e;
    public final ovm[] f;

    public ovu(MediaFormat mediaFormat, int i, ovm ovmVar) {
        this.a = mediaFormat;
        this.d = i;
        this.e = ovmVar;
        this.f = null;
        this.b = -1;
        this.c = -1;
    }

    public ovu(MediaFormat mediaFormat, int i, ovm[] ovmVarArr, int i2, int i3) {
        this.a = mediaFormat;
        this.d = i;
        this.f = ovmVarArr;
        this.b = i2;
        this.c = i3;
        this.e = null;
    }

    public final boolean a() {
        return this.f != null;
    }
}
