package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: acdj  reason: default package */
/* loaded from: classes.dex */
public final class acdj implements acbw, accu {
    private final accv a;
    private final Uri b;
    private final String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private acbu k;
    private volatile long l;

    public acdj(Context context, Uri uri, String str, acbq acbqVar, boolean z, boolean z2, int i, long j) {
        accv accvVar = new accv(context, uri.getHost(), uri.getPort(), acbqVar, z, z2, i, j);
        this.h = -1;
        this.i = -1;
        this.j = 0;
        aqxo.p("rtmp".equals(uri.getScheme()));
        this.b = uri;
        this.c = str;
        this.a = accvVar;
        accvVar.b = this;
    }

    @Override // defpackage.acbw
    public final int a(MediaFormat mediaFormat) {
        if (this.e) {
            Log.e("RtmpMuxer", "Cannot add a track once started");
            return -1;
        } else if (this.f) {
            Log.e("RtmpMuxer", "Cannot add a track once stopped");
            return -1;
        } else if (this.g) {
            Log.e("RtmpMuxer", "Cannot add a track after release");
            return -1;
        } else if (abxb.d(mediaFormat)) {
            if (this.h >= 0) {
                Log.e("RtmpMuxer", "Video track already added");
                return -1;
            }
            accv accvVar = this.a;
            if (!"video/avc".equals(mediaFormat.getString("mime"))) {
                Log.e("RtmpMuxer", "Video format not supported by RTMP connection");
                return -1;
            }
            accvVar.c = 7;
            accvVar.k = mediaFormat;
            int i = this.j;
            this.j = i + 1;
            this.h = i;
            return i;
        } else if (!abxb.b(mediaFormat)) {
            String valueOf = String.valueOf(mediaFormat);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unknown media format type: ");
            sb.append(valueOf);
            Log.e("RtmpMuxer", sb.toString());
            return -1;
        } else if (this.i >= 0) {
            Log.e("RtmpMuxer", "Audio track already added");
            return -1;
        } else {
            accv accvVar2 = this.a;
            if (!"audio/mp4a-latm".equals(mediaFormat.getString("mime"))) {
                Log.e("RtmpMuxer", "Audio format not supported by RTMP connection");
                return -1;
            }
            accvVar2.d = 10;
            accvVar2.j = mediaFormat;
            int i2 = this.j;
            this.j = i2 + 1;
            this.i = i2;
            return i2;
        }
    }

    @Override // defpackage.acbw
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.acbw
    public final int c() {
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot prepare once released");
            return 1;
        } else if (this.f) {
            Log.e("RtmpMuxer", "Cannot prepare once stopped");
            return 1;
        } else if (this.e) {
            Log.e("RtmpMuxer", "Cannot prepare once started");
            return 1;
        } else if (this.d) {
            return 0;
        } else {
            try {
                this.l = 0L;
                this.a.d();
                this.d = true;
                return 0;
            } catch (IOException e) {
                Log.e("RtmpMuxer", "Connecting to remote host failed due to IO error", e);
                return 12;
            } catch (InterruptedException e2) {
                Log.e("RtmpMuxer", "Connection was interrupted", e2);
                return 12;
            } catch (ProtocolException e3) {
                Log.e("RtmpMuxer", "RTMP protocol error during initial handshake", e3);
                return 12;
            } catch (TimeoutException e4) {
                Log.e("RtmpMuxer", "Connecting to remote host timed out", e4);
                return 11;
            } catch (Exception e5) {
                Log.e("RtmpMuxer", "Preparing the RTMP connection failed", e5);
                return 12;
            }
        }
    }

    @Override // defpackage.acbw
    public final long d() {
        return this.l;
    }

    @Override // defpackage.acbw
    public final Pair e() {
        return this.a.c();
    }

    @Override // defpackage.acbw
    public final void f() {
    }

    @Override // defpackage.acbw
    public final void g(Context context, acbv acbvVar) {
        if (acbvVar != null) {
            acbvVar.a(this.b);
        }
    }

    @Override // defpackage.acbw
    public final void h(acbu acbuVar) {
        this.k = acbuVar;
    }

    @Override // defpackage.acbw
    public final void i(int i) {
        this.a.g(i);
    }

    @Override // defpackage.acbw
    public final boolean j() {
        return !this.g && !this.f && this.i >= 0 && this.h >= 0;
    }

    @Override // defpackage.acbw
    public final boolean k() {
        return this.e && !this.f && !this.g;
    }

    @Override // defpackage.acbw
    public final boolean l() {
        accv accvVar;
        Uri uri;
        String str;
        boolean z;
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot start once released");
            return false;
        } else if (this.f) {
            Log.e("RtmpMuxer", "Cannot restart once stopped");
            return false;
        } else if (!this.d) {
            Log.e("RtmpMuxer", "Muxer not prepared");
            return false;
        } else if (this.e) {
            return true;
        } else {
            if (!j()) {
                Log.e("RtmpMuxer", "Cannot start without all tracks");
                return false;
            }
            try {
                accvVar = this.a;
                uri = this.b;
                str = this.c;
            } catch (Exception e) {
                Log.e("RtmpMuxer", "Starting the RTMP connection failed", e);
            }
            if (!accvVar.h) {
                throw new IllegalStateException("RTMP channel is not connected");
            }
            if (accvVar.i) {
                Log.e("RtmpConnection", "Stream is already published");
            } else if (accvVar.j == null) {
                throw new IllegalStateException("RTMP audio format is missing");
            } else {
                if (accvVar.k == null) {
                    throw new IllegalStateException("RTMP video format is missing");
                }
                acdn acdnVar = accvVar.f;
                if (!acdi.d(8192)) {
                    throw new ProtocolException("Invalid chunk size to set: 8192");
                }
                aqxo.p(true);
                acdnVar.a.clear();
                acdn.i(acdnVar.a, 2, 0, 4, 1, 0);
                acdnVar.a.putInt(8192);
                acdnVar.a.flip();
                acdnVar.g(acdnVar.a);
                acdnVar.f = 8192;
                ByteBuffer.allocate(8192);
                acdnVar.f(4);
                accvVar.f.d(10485760, 0);
                if (!accvVar.g) {
                    Future e2 = accvVar.e.e(1);
                    acdn acdnVar2 = accvVar.f;
                    if (uri == null) {
                        throw new ProtocolException("Target URI cannot be null");
                    }
                    String path = uri.getPath();
                    if (TextUtils.isEmpty(path)) {
                        throw new ProtocolException("Target path cannot be empty");
                    }
                    while (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    if (TextUtils.isEmpty(path)) {
                        throw new ProtocolException("Target path cannot be empty");
                    }
                    if (TextUtils.isEmpty(str)) {
                        throw new ProtocolException("Stream key cannot be empty");
                    }
                    acdnVar2.b.b();
                    acdnVar2.b.g("connect");
                    acdnVar2.b.d(1.0d);
                    acdnVar2.b.a.writeByte(3);
                    acdnVar2.b.f("app");
                    acdnVar2.b.g(path);
                    acdnVar2.b.f("flashVer");
                    acdnVar2.b.g(acdnVar2.i);
                    acdnVar2.b.f("flashver");
                    acdnVar2.b.g(acdnVar2.i);
                    acdnVar2.b.f("tcUrl");
                    acdnVar2.b.g(uri.toString());
                    acdnVar2.b.f("type");
                    acdnVar2.b.g("nonprivate");
                    acdnVar2.b.e();
                    ByteBuffer a = acdnVar2.b.a();
                    int limit = a.limit();
                    acdnVar2.a.clear();
                    acdn.i(acdnVar2.a, 3, 0, limit, 20, 1);
                    acdnVar2.a.flip();
                    acdnVar2.g(acdnVar2.a);
                    acdnVar2.g(a);
                    acdnVar2.f(limit);
                    acdg acdgVar = (acdg) e2.get(5000L, TimeUnit.MILLISECONDS);
                    if (acdgVar.a != 0 || !"NetConnection.Connect.Success".equals(acdgVar.b)) {
                        String valueOf = String.valueOf(acdgVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                        sb.append("RTMP NetConnection failed: result=");
                        sb.append(valueOf);
                        throw new ProtocolException(sb.toString());
                    }
                    accvVar.e.f(1);
                    acdn acdnVar3 = accvVar.f;
                    int a2 = accvVar.a();
                    if (TextUtils.isEmpty(str)) {
                        throw new ProtocolException("Stream key cannot be empty");
                    }
                    acdnVar3.b.b();
                    acdnVar3.b.g("releaseStream");
                    acdnVar3.b.d(a2);
                    acdnVar3.b.c();
                    acdnVar3.b.g(str);
                    ByteBuffer a3 = acdnVar3.b.a();
                    int limit2 = a3.limit();
                    acdnVar3.a.clear();
                    acdn.i(acdnVar3.a, 3, 0, limit2, 20, 1);
                    acdnVar3.a.flip();
                    acdnVar3.g(acdnVar3.a);
                    acdnVar3.g(a3);
                    acdnVar3.f(limit2);
                    int a4 = accvVar.a();
                    Future e3 = accvVar.e.e(a4);
                    acdn acdnVar4 = accvVar.f;
                    acdnVar4.b.b();
                    acdnVar4.b.g("createStream");
                    acdnVar4.b.d(a4);
                    acdnVar4.b.c();
                    ByteBuffer a5 = acdnVar4.b.a();
                    int limit3 = a5.limit();
                    acdnVar4.a.clear();
                    acdn.i(acdnVar4.a, 3, 0, limit3, 20, 1);
                    acdnVar4.a.flip();
                    acdnVar4.g(acdnVar4.a);
                    acdnVar4.g(a5);
                    acdnVar4.f(limit3);
                    acdg acdgVar2 = (acdg) e3.get(5000L, TimeUnit.MILLISECONDS);
                    if (acdgVar2.a != 0) {
                        String valueOf2 = String.valueOf(acdgVar2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 47);
                        sb2.append("RTMP NetConnection.createStream failed: result=");
                        sb2.append(valueOf2);
                        throw new ProtocolException(sb2.toString());
                    }
                    accvVar.e.f(a4);
                    Future e4 = accvVar.e.e(2);
                    acdn acdnVar5 = accvVar.f;
                    if (TextUtils.isEmpty(str)) {
                        throw new ProtocolException("Stream key cannot be empty");
                    }
                    acdnVar5.b.b();
                    acdnVar5.b.g("publish");
                    acdnVar5.b.d(2.0d);
                    acdnVar5.b.c();
                    acdnVar5.b.g(str);
                    acdnVar5.b.g("live");
                    ByteBuffer a6 = acdnVar5.b.a();
                    int limit4 = a6.limit();
                    acdnVar5.a.clear();
                    acdn.i(acdnVar5.a, 3, 0, limit4, 20, 1);
                    acdnVar5.a.flip();
                    acdnVar5.g(acdnVar5.a);
                    acdnVar5.g(a6);
                    acdnVar5.f(limit4);
                    acdg acdgVar3 = (acdg) e4.get(5000L, TimeUnit.MILLISECONDS);
                    if (acdgVar3.a != 0 || !"NetStream.Publish.Start".equals(acdgVar3.b)) {
                        String valueOf3 = String.valueOf(acdgVar3);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                        sb3.append("RTMP publish request failed: result=");
                        sb3.append(valueOf3);
                        throw new ProtocolException(sb3.toString());
                    }
                    accvVar.e.f(2);
                    acdn acdnVar6 = accvVar.f;
                    int i = accvVar.d;
                    MediaFormat mediaFormat = accvVar.j;
                    int i2 = accvVar.c;
                    MediaFormat mediaFormat2 = accvVar.k;
                    if (!abxb.b(mediaFormat) || !mediaFormat.containsKey("bitrate") || !mediaFormat.containsKey("sample-rate")) {
                        String valueOf4 = String.valueOf(mediaFormat);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 22);
                        sb4.append("Invalid audio format: ");
                        sb4.append(valueOf4);
                        throw new ProtocolException(sb4.toString());
                    } else if (!abxb.d(mediaFormat2) || !mediaFormat2.containsKey("width") || !mediaFormat2.containsKey("height") || !mediaFormat2.containsKey("bitrate") || !mediaFormat2.containsKey("frame-rate")) {
                        String valueOf5 = String.valueOf(mediaFormat2);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 22);
                        sb5.append("Invalid video format: ");
                        sb5.append(valueOf5);
                        throw new ProtocolException(sb5.toString());
                    } else {
                        acdnVar6.b.b();
                        acdnVar6.b.g("@setDataFrame");
                        acdnVar6.b.g("onMetaData");
                        accr accrVar = acdnVar6.b;
                        accrVar.a.writeByte(8);
                        accrVar.a.writeInt(13);
                        acdnVar6.b.f("duration");
                        acdnVar6.b.d(0.0d);
                        acdnVar6.b.f("width");
                        acdnVar6.b.d(mediaFormat2.getInteger("width"));
                        acdnVar6.b.f("height");
                        acdnVar6.b.d(mediaFormat2.getInteger("height"));
                        acdnVar6.b.f("videodatarate");
                        acdnVar6.b.d(mediaFormat2.getInteger("bitrate"));
                        acdnVar6.b.f("framerate");
                        acdnVar6.b.d(mediaFormat2.getInteger("frame-rate"));
                        acdnVar6.b.f("videocodecid");
                        acdnVar6.b.d(i2);
                        acdnVar6.b.f("audiodatarate");
                        acdnVar6.b.d(mediaFormat.getInteger("bitrate"));
                        acdnVar6.b.f("audiosamplerate");
                        acdnVar6.b.d(mediaFormat.getInteger("sample-rate"));
                        acdnVar6.b.f("audiosamplesize");
                        accr accrVar2 = acdnVar6.b;
                        if (i != 10) {
                            StringBuilder sb6 = new StringBuilder(36);
                            sb6.append("Unsupported audio codec: ");
                            sb6.append(i);
                            throw new ProtocolException(sb6.toString());
                        }
                        accrVar2.d(16.0d);
                        acdnVar6.b.f("stereo");
                        accr accrVar3 = acdnVar6.b;
                        accrVar3.a.writeByte(1);
                        accrVar3.a.writeByte(1);
                        acdnVar6.b.f("audiocodecid");
                        acdnVar6.b.d(10.0d);
                        acdnVar6.b.f("encoder");
                        acdnVar6.b.g(acdnVar6.i);
                        acdnVar6.b.f("filesize");
                        acdnVar6.b.d(0.0d);
                        acdnVar6.b.e();
                        ByteBuffer a7 = acdnVar6.b.a();
                        int limit5 = a7.limit();
                        acdnVar6.a.clear();
                        acdn.i(acdnVar6.a, 3, 0, limit5, 18, 1);
                        acdnVar6.a.flip();
                        acdnVar6.g(acdnVar6.a);
                        acdnVar6.g(a7);
                        acdnVar6.f(limit5);
                        z = true;
                        accvVar.i = true;
                        this.e = z;
                        return this.e;
                    }
                }
                int millis = (int) (TimeUnit.SECONDS.toMillis(16384L) / 1000);
                try {
                    Socket socket = accvVar.a.socket();
                    socket.setSendBufferSize(16384);
                    socket.setSoTimeout(millis);
                } catch (Exception e5) {
                    Log.e("RtmpConnection", "Could not set socket options", e5);
                }
                accvVar.i = true;
            }
            z = true;
            this.e = z;
            return this.e;
        }
    }

    @Override // defpackage.acbw
    public final boolean m() {
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot stop once released");
            return false;
        } else if (!this.e) {
            Log.e("RtmpMuxer", "Muxer not started");
            return false;
        } else if (this.f) {
            return true;
        } else {
            try {
                this.a.e();
                this.f = true;
            } catch (Exception e) {
                Log.e("RtmpMuxer", "Stopping the RTMP connection failed", e);
            }
            return this.f;
        }
    }

    @Override // defpackage.acbw
    public final boolean n(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        long j;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        byte[] f;
        int i6;
        int i7;
        if (this.g) {
            Log.e("RtmpMuxer", "Cannot write data once released");
            return false;
        } else if (this.f) {
            Log.e("RtmpMuxer", "Cannot write data once stopped");
            return false;
        } else if (!this.e) {
            Log.e("RtmpMuxer", "Muxer not started");
            return false;
        } else {
            try {
                accv accvVar = this.a;
                boolean z3 = i == this.i;
                if (!accvVar.i) {
                    throw new IllegalStateException("RTMP stream must be published before sending data");
                }
                acdn acdnVar = accvVar.f;
                int i8 = accvVar.d;
                MediaFormat mediaFormat = accvVar.j;
                int i9 = accvVar.c;
                MediaFormat mediaFormat2 = accvVar.k;
                if ((bufferInfo.flags & 2) == 0) {
                    if (!acdnVar.j) {
                        i2 = i8;
                        i3 = i9;
                        j = 0;
                        i4 = -1;
                    } else if (!z3 && (bufferInfo.flags & 1) != 0 && (bufferInfo.flags & 4) == 0) {
                        if (acdnVar.k) {
                            i2 = i8;
                            i3 = i9;
                            i4 = -1;
                        } else if (!mediaFormat2.containsKey("csd-0") || !mediaFormat2.containsKey("csd-1")) {
                            throw new ProtocolException("Video format missing codec config data");
                        } else {
                            ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer("csd-0");
                            ByteBuffer byteBuffer3 = mediaFormat2.getByteBuffer("csd-1");
                            byte[] f2 = acdi.f(i9, true, true);
                            acdnVar.e(byteBuffer2);
                            acdnVar.e(byteBuffer3);
                            int remaining = byteBuffer2.remaining();
                            int remaining2 = byteBuffer3.remaining();
                            int i10 = remaining + 11 + remaining2;
                            ByteBuffer allocate = ByteBuffer.allocate(i10);
                            allocate.order(ByteOrder.BIG_ENDIAN);
                            allocate.limit(i10);
                            allocate.put((byte) 1);
                            allocate.put((byte) 100);
                            allocate.put((byte) 0);
                            allocate.put((byte) 13);
                            allocate.put((byte) -1);
                            allocate.put((byte) -31);
                            allocate.put((byte) ((remaining >> 8) & PrivateKeyType.INVALID));
                            allocate.put((byte) (remaining & PrivateKeyType.INVALID));
                            allocate.put(byteBuffer2);
                            allocate.put((byte) 1);
                            allocate.put((byte) ((remaining2 >> 8) & PrivateKeyType.INVALID));
                            allocate.put((byte) (remaining2 & PrivateKeyType.INVALID));
                            allocate.put(byteBuffer3);
                            allocate.position(0);
                            i4 = -1;
                            i2 = i8;
                            i3 = i9;
                            acdnVar.c(allocate, f2, 6, 9, 0);
                            if (!mediaFormat.containsKey("csd-0")) {
                                throw new ProtocolException("Audio format missing codec config data");
                            }
                            ByteBuffer byteBuffer4 = mediaFormat.getByteBuffer("csd-0");
                            new MediaCodec.BufferInfo().size = byteBuffer4.limit();
                            byteBuffer4.position(0);
                            acdnVar.c(byteBuffer4, acdi.e(i2, true), 4, 8, 0);
                        }
                        long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                        acdo acdoVar = acdnVar.d;
                        j = 0;
                        aqxo.p(millis > 0);
                        ((accx) acdoVar).f = millis;
                        long j2 = ((accx) acdoVar).d.getLong(accx.c, accx.a);
                        if (j2 >= 0 && j2 < accx.a) {
                            long j3 = accx.a;
                            ((accx) acdoVar).g = j2 + j3 + j3;
                            ((accx) acdoVar).i = true;
                            ((accx) acdoVar).j = true;
                            acdnVar.j = false;
                            z3 = false;
                        }
                        ((accx) acdoVar).g = 0L;
                        ((accx) acdoVar).i = true;
                        ((accx) acdoVar).j = true;
                        acdnVar.j = false;
                        z3 = false;
                    }
                    if (z3) {
                        f = acdi.e(i2, false);
                        z = true;
                        i6 = 8;
                        i7 = 4;
                    } else {
                        z = true;
                        if (1 != (bufferInfo.flags & 1)) {
                            i5 = i3;
                            z2 = false;
                        } else {
                            i5 = i3;
                            z2 = true;
                        }
                        f = acdi.f(i5, false, z2);
                        i6 = 9;
                        i7 = 6;
                    }
                    int i11 = z == acdnVar.k ? 42 : i6;
                    boolean z4 = z3;
                    long millis2 = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                    acdo acdoVar2 = acdnVar.d;
                    aqxo.p(millis2 > j);
                    aqxo.y(((accx) acdoVar2).f > j);
                    long j4 = millis2 - ((accx) acdoVar2).f;
                    if (j4 >= j) {
                        long j5 = ((accx) acdoVar2).g + j4;
                        if (j5 > 2147483647L) {
                            StringBuilder sb = new StringBuilder(40);
                            sb.append("Timestamp overflow: ");
                            sb.append(j5);
                            zep.l(sb.toString());
                        }
                        if (((accx) acdoVar2).i && (((accx) acdoVar2).j || j5 - ((accx) acdoVar2).h >= accx.b)) {
                            ((accx) acdoVar2).e.post(new accw((accx) acdoVar2, j5));
                            ((accx) acdoVar2).h = j5;
                            ((accx) acdoVar2).i = j5 < accx.a;
                            ((accx) acdoVar2).j = false;
                        }
                        i4 = (int) j5;
                    }
                    if (i4 < 0) {
                        String str = "AUDIO";
                        if (true != z4) {
                            str = "VIDEO";
                        }
                        long j6 = ((accx) acdnVar.d).f;
                        StringBuilder sb2 = new StringBuilder(str.length() + 111);
                        sb2.append("Skipping media data with early timestamp: type=");
                        sb2.append(str);
                        sb2.append(", timestamp=");
                        sb2.append(millis2);
                        sb2.append(", startTime=");
                        sb2.append(j6);
                        Log.e("RtmpOutputStream", sb2.toString());
                    } else {
                        acdnVar.e(byteBuffer);
                        acdnVar.c(byteBuffer, f, i7, i11, i4);
                    }
                }
                if (accvVar.g) {
                    accvVar.f.a();
                }
                this.l += bufferInfo.size - bufferInfo.offset;
                return true;
            } catch (Exception e) {
                Log.e("RtmpMuxer", "Sending sample data failed", e);
                return false;
            }
        }
    }

    @Override // defpackage.acbw
    public final void o() {
        if (this.g) {
            return;
        }
        try {
            this.a.f();
            this.g = true;
        } catch (Exception e) {
            Log.e("RtmpMuxer", "Releasing the RTMP connection failed", e);
        }
    }

    @Override // defpackage.accu
    public final void p() {
        acbu acbuVar = this.k;
        if (acbuVar != null) {
            acbuVar.a();
        }
    }
}
