package com.facebook.imagepipeline.nativecode;
@c.d.d.d.d
/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements c.d.j.q.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f5283a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5284b;

    @c.d.d.d.d
    public NativeJpegTranscoderFactory(int i, boolean z) {
        this.f5283a = i;
        this.f5284b = z;
    }

    @Override // c.d.j.q.d
    @c.d.d.d.d
    public c.d.j.q.c createImageTranscoder(c.d.i.c cVar, boolean z) {
        if (cVar != c.d.i.b.f3144a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f5283a, this.f5284b);
    }
}
