package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
@Deprecated
/* renamed from: otf  reason: default package */
/* loaded from: classes4.dex */
public final class otf implements oui, ouh {
    private final Context a;
    private final Uri b;
    private IOException c;
    private MediaExtractor d;
    private MediaFormat[] e;
    private boolean f;
    private int g;
    private int[] h;
    private boolean[] i;
    private long j;
    private long k;

    public otf(Context context, Uri uri) {
        pce.d(pcx.a >= 16);
        pce.a(context);
        this.a = context;
        pce.a(uri);
        this.b = uri;
    }

    private static final int n(android.media.MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }

    private final void o(long j, boolean z) {
        if (z || this.k != j) {
            this.j = j;
            this.k = j;
            int i = 0;
            this.d.seekTo(j, 0);
            while (true) {
                int[] iArr = this.h;
                if (i >= iArr.length) {
                    return;
                }
                if (iArr[i] != 0) {
                    this.i[i] = true;
                }
                i++;
            }
        }
    }

    @Override // defpackage.ouh
    public final int a() {
        pce.d(this.f);
        return this.h.length;
    }

    @Override // defpackage.ouh
    public final int b(int i, long j, oue oueVar, oug ougVar) {
        Map<UUID, byte[]> psshInfo;
        pce.d(this.f);
        pce.d(this.h[i] != 0);
        if (this.i[i]) {
            return -2;
        }
        if (this.h[i] != 2) {
            oueVar.a = this.e[i];
            owu owuVar = null;
            if (pcx.a >= 18 && (psshInfo = this.d.getPsshInfo()) != null && !psshInfo.isEmpty()) {
                owuVar = new owu();
                for (UUID uuid : psshInfo.keySet()) {
                    byte[] bArr = psshInfo.get(uuid);
                    int length = bArr.length;
                    int i2 = length + 32;
                    ByteBuffer allocate = ByteBuffer.allocate(i2);
                    allocate.putInt(i2);
                    allocate.putInt(oyu.X);
                    allocate.putInt(0);
                    allocate.putLong(uuid.getMostSignificantBits());
                    allocate.putLong(uuid.getLeastSignificantBits());
                    allocate.putInt(length);
                    allocate.put(bArr);
                    owuVar.b(uuid, new owv("video/mp4", allocate.array()));
                }
            }
            oueVar.b = owuVar;
            this.h[i] = 2;
            return -4;
        }
        int sampleTrackIndex = this.d.getSampleTrackIndex();
        if (sampleTrackIndex != i) {
            return sampleTrackIndex < 0 ? -1 : -2;
        }
        ByteBuffer byteBuffer = ougVar.b;
        if (byteBuffer != null) {
            int position = byteBuffer.position();
            int readSampleData = this.d.readSampleData(ougVar.b, position);
            ougVar.c = readSampleData;
            ougVar.b.position(position + readSampleData);
        } else {
            ougVar.c = 0;
        }
        ougVar.e = this.d.getSampleTime();
        ougVar.d = this.d.getSampleFlags() & 3;
        if (ougVar.d()) {
            osu osuVar = ougVar.a;
            this.d.getSampleCryptoInfo(osuVar.g);
            osuVar.f = osuVar.g.numSubSamples;
            osuVar.d = osuVar.g.numBytesOfClearData;
            osuVar.e = osuVar.g.numBytesOfEncryptedData;
            osuVar.b = osuVar.g.key;
            osuVar.a = osuVar.g.iv;
            osuVar.c = osuVar.g.mode;
        }
        this.k = -1L;
        this.d.advance();
        return -3;
    }

    @Override // defpackage.ouh
    public final long c() {
        pce.d(this.f);
        long cachedDuration = this.d.getCachedDuration();
        if (cachedDuration == -1) {
            return -1L;
        }
        long sampleTime = this.d.getSampleTime();
        if (sampleTime != -1) {
            return sampleTime + cachedDuration;
        }
        return -3L;
    }

    @Override // defpackage.ouh
    public final long d(int i) {
        boolean[] zArr = this.i;
        if (zArr[i]) {
            zArr[i] = false;
            return this.j;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ouh
    public final MediaFormat e(int i) {
        pce.d(this.f);
        return this.e[i];
    }

    @Override // defpackage.oui
    public final ouh f() {
        this.g++;
        return this;
    }

    @Override // defpackage.ouh
    public final void g(int i) {
        pce.d(this.f);
        pce.d(this.h[i] != 0);
        this.d.unselectTrack(i);
        this.i[i] = false;
        this.h[i] = 0;
    }

    @Override // defpackage.ouh
    public final void h(int i, long j) {
        pce.d(this.f);
        boolean z = false;
        pce.d(this.h[i] == 0);
        this.h[i] = 1;
        this.d.selectTrack(i);
        if (j != 0) {
            z = true;
        }
        o(j, z);
    }

    @Override // defpackage.ouh
    public final void i() {
        IOException iOException = this.c;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override // defpackage.ouh
    public final void j() {
        MediaExtractor mediaExtractor;
        pce.d(this.g > 0);
        int i = this.g - 1;
        this.g = i;
        if (i != 0 || (mediaExtractor = this.d) == null) {
            return;
        }
        mediaExtractor.release();
        this.d = null;
    }

    @Override // defpackage.ouh
    public final void k(long j) {
        pce.d(this.f);
        o(j, false);
    }

    @Override // defpackage.ouh
    public final boolean l(int i, long j) {
        return true;
    }

    @Override // defpackage.ouh
    public final boolean m() {
        if (!this.f) {
            if (this.c != null) {
                return false;
            }
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.d = mediaExtractor;
            try {
                String str = null;
                mediaExtractor.setDataSource(this.a, this.b, (Map<String, String>) null);
                int[] iArr = new int[this.d.getTrackCount()];
                this.h = iArr;
                int length = iArr.length;
                this.i = new boolean[length];
                this.e = new MediaFormat[length];
                int i = 0;
                while (i < this.h.length) {
                    MediaFormat[] mediaFormatArr = this.e;
                    android.media.MediaFormat trackFormat = this.d.getTrackFormat(i);
                    String string = trackFormat.getString("mime");
                    String string2 = trackFormat.containsKey("language") ? trackFormat.getString("language") : str;
                    int n = n(trackFormat, "max-input-size");
                    int n2 = n(trackFormat, "width");
                    int n3 = n(trackFormat, "height");
                    int n4 = n(trackFormat, "rotation-degrees");
                    int n5 = n(trackFormat, "channel-count");
                    int n6 = n(trackFormat, "sample-rate");
                    int n7 = n(trackFormat, "encoder-delay");
                    int n8 = n(trackFormat, "encoder-padding");
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder(15);
                        sb.append("csd-");
                        sb.append(i2);
                        if (!trackFormat.containsKey(sb.toString())) {
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder(15);
                        sb2.append("csd-");
                        sb2.append(i2);
                        ByteBuffer byteBuffer = trackFormat.getByteBuffer(sb2.toString());
                        byte[] bArr = new byte[byteBuffer.limit()];
                        byteBuffer.get(bArr);
                        arrayList.add(bArr);
                        byteBuffer.flip();
                        i2++;
                    }
                    MediaFormat mediaFormat = new MediaFormat(null, string, -1, n, trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : -1L, n2, n3, n4, -1.0f, n5, n6, string2, Long.MAX_VALUE, arrayList, false, -1, -1, true != "audio/raw".equals(string) ? -1 : 2, n7, n8, null, -1, null);
                    mediaFormat.x = trackFormat;
                    mediaFormatArr[i] = mediaFormat;
                    i++;
                    str = null;
                }
                this.f = true;
            } catch (IOException e) {
                this.c = e;
                return false;
            }
        }
        return true;
    }
}
