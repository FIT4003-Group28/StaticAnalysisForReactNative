package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: avx  reason: default package */
/* loaded from: classes2.dex */
public interface avx {
    int a();

    int b(MediaCodec.BufferInfo bufferInfo);

    MediaFormat c();

    ByteBuffer e(int i);

    ByteBuffer f(int i);

    void g();

    void h();

    void i(int i, long j);

    void j(Surface surface);

    void k(Bundle bundle);

    void l(int i);

    boolean m();

    void n(pxp pxpVar, Handler handler);

    void o(int i, int i2, long j, int i3);

    void p(int i, pmq pmqVar, long j);

    void q(int i);
}
