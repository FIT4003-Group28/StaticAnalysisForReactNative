package defpackage;

import android.media.AudioRecord;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioRecord;
/* compiled from: PG */
/* renamed from: bapt  reason: default package */
/* loaded from: classes2.dex */
public final class bapt extends Thread {
    public volatile boolean a;
    final /* synthetic */ WebRtcAudioRecord b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bapt(WebRtcAudioRecord webRtcAudioRecord) {
        super("AudioRecordJavaThread");
        this.b = webRtcAudioRecord;
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-19);
        String valueOf = String.valueOf(bapv.d());
        Logging.a("WebRtcAudioRecordExternal", valueOf.length() != 0 ? "AudioRecordThread".concat(valueOf) : new String("AudioRecordThread"));
        int i = 3;
        WebRtcAudioRecord.c(this.b.f.getRecordingState() == 3);
        WebRtcAudioRecord.d(0);
        System.nanoTime();
        while (this.a) {
            WebRtcAudioRecord webRtcAudioRecord = this.b;
            AudioRecord audioRecord = webRtcAudioRecord.f;
            ByteBuffer byteBuffer = webRtcAudioRecord.e;
            int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
            if (read == this.b.e.capacity()) {
                boolean z = this.b.g;
                if (this.a) {
                    WebRtcAudioRecord webRtcAudioRecord2 = this.b;
                    webRtcAudioRecord2.nativeDataIsRecorded(webRtcAudioRecord2.d, read);
                }
                WebRtcAudioRecord webRtcAudioRecord3 = this.b;
                if (webRtcAudioRecord3.i != null) {
                    byte[] copyOfRange = Arrays.copyOfRange(webRtcAudioRecord3.e.array(), this.b.e.arrayOffset(), this.b.e.capacity() + this.b.e.arrayOffset());
                    WebRtcAudioRecord webRtcAudioRecord4 = this.b;
                    acqk acqkVar = webRtcAudioRecord4.i;
                    int audioFormat = webRtcAudioRecord4.f.getAudioFormat();
                    int channelCount = this.b.f.getChannelCount();
                    int sampleRate = this.b.f.getSampleRate();
                    acqm acqmVar = acqkVar.b;
                    acor acorVar = (acor) acqmVar.k;
                    if (acorVar.g) {
                        acbk acbkVar = acorVar.i;
                        if (acbkVar != null) {
                            acbkVar.k(copyOfRange);
                        }
                    } else {
                        MediaFormat mediaFormat = acqmVar.l;
                        if (mediaFormat != null && acqmVar.m != null && !acqkVar.a) {
                            int i2 = 2;
                            if (audioFormat != 1 && audioFormat != 2) {
                                if (audioFormat == i) {
                                    i2 = 1;
                                } else if (audioFormat == 4) {
                                    i2 = 4;
                                } else if (audioFormat != 13) {
                                    StringBuilder sb = new StringBuilder(28);
                                    sb.append("Bad audio format ");
                                    sb.append(audioFormat);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                            mediaFormat.setInteger("max-input-size", (int) ((((sampleRate * channelCount) * i2) * 50) / 1000));
                            acqmVar.l.setInteger("channel-count", channelCount);
                            acqmVar.l.setInteger("channel-mask", channelCount == 1 ? 16 : 12);
                            acqmVar.l.setInteger("sample-rate", sampleRate);
                            acqm acqmVar2 = acqkVar.b;
                            acoe acoeVar = acqmVar2.k;
                            final MediaFormat mediaFormat2 = acqmVar2.l;
                            final MediaFormat mediaFormat3 = acqmVar2.m;
                            final acor acorVar2 = (acor) acoeVar;
                            acorVar2.b.post(new Runnable() { // from class: acoj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    acbk acbkVar2;
                                    String uri;
                                    final acor acorVar3 = acor.this;
                                    MediaFormat mediaFormat4 = mediaFormat2;
                                    MediaFormat mediaFormat5 = mediaFormat3;
                                    Handler handler = acorVar3.b;
                                    mediaFormat4.getClass();
                                    handler.getClass();
                                    if (!abxb.b(mediaFormat4)) {
                                        Log.e("AudioInputFactory", "Could not create audio input, not an audio format");
                                        acbkVar2 = null;
                                    } else {
                                        acbkVar2 = new acbk(handler, mediaFormat4);
                                    }
                                    acorVar3.i = acbkVar2;
                                    acbk acbkVar3 = acorVar3.i;
                                    if (acbkVar3 == null) {
                                        zep.c("LocalRecordingManagerImpl", "Could not create audio input.");
                                        acorVar3.g();
                                        return;
                                    }
                                    acorVar3.j = acbkVar3;
                                    acorVar3.d();
                                    acorVar3.f = new abrx(abtp.c(acorVar3.a, R.raw.copy_texture_frag));
                                    acorVar3.k = new abro(new acoo(acorVar3));
                                    if (acorVar3.n instanceof acbo) {
                                        acorVar3.d.a = new abst() { // from class: acof
                                            @Override // defpackage.abst
                                            public final void a() {
                                                acor acorVar4 = acor.this;
                                                acorVar4.b.post(new acoh(acorVar4, 2));
                                            }
                                        };
                                    }
                                    acorVar3.k.b(new acop(acorVar3), acorVar3.b);
                                    if (acorVar3.h == null) {
                                        if (!"mounted".equals(Environment.getExternalStorageState())) {
                                            zep.c("LocalRecordingMgr", "Could not write to external storage.");
                                            uri = null;
                                        } else {
                                            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
                                            File file = new File(externalStoragePublicDirectory, "YouTubeLive");
                                            if (file.exists() || file.mkdirs()) {
                                                externalStoragePublicDirectory = file;
                                            } else {
                                                zep.c("LocalRecordingMgr", "Could not create HD asset dir.  Using movies dir");
                                            }
                                            String format = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US).format(new Date());
                                            String absolutePath = externalStoragePublicDirectory.getAbsolutePath();
                                            String str = File.separator;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 6 + String.valueOf(str).length() + String.valueOf(format).length());
                                            sb2.append(absolutePath);
                                            sb2.append(str);
                                            sb2.append("VIDEO_");
                                            sb2.append(format);
                                            uri = Uri.fromFile(new File(sb2.toString())).toString();
                                        }
                                        acorVar3.h = uri;
                                        if (TextUtils.isEmpty(acorVar3.h)) {
                                            zep.c("LocalRecordingManagerImpl", "Could not create file for muxer");
                                            acorVar3.g();
                                        }
                                    }
                                    acorVar3.l = abxb.e(acorVar3.a, Uri.parse(acorVar3.h), "", acorVar3.j, false, false, 0, 0L);
                                    acbw acbwVar = acorVar3.l;
                                    if (acbwVar == null) {
                                        zep.c("LocalRecordingManagerImpl", "Could not create file muxer.");
                                    } else {
                                        acbwVar.h(new acoq(acorVar3));
                                        if (acorVar3.l.c() == 0) {
                                            acorVar3.m = achj.h(mediaFormat4, acorVar3.i, acorVar3.l);
                                            acbt acbtVar = acorVar3.m;
                                            if (acbtVar == null) {
                                                zep.c("LocalRecordingManagerImpl", "Could not create audio encoder.");
                                                acorVar3.g();
                                                return;
                                            }
                                            ((acbe) acbtVar).d = acorVar3.s;
                                            acorVar3.o = achc.d(acorVar3.a, mediaFormat5, acorVar3.l, null);
                                            accj accjVar = acorVar3.o;
                                            if (accjVar == null) {
                                                zep.c("LocalRecordingManagerImpl", "Could not create video encoder.");
                                            } else {
                                                accjVar.d = acorVar3.s;
                                                int integer = mediaFormat5.getInteger("frame-rate");
                                                acbo a = acbp.a(acorVar3.k, acorVar3.o, integer, Math.min(integer, 15), acorVar3.j, acorVar3.b);
                                                if (a == null) {
                                                    zep.c("LocalRecordingManagerImpl", "Could not create frame rate converter");
                                                    accj accjVar2 = acorVar3.o;
                                                    accjVar2.d = null;
                                                    accjVar2.c();
                                                } else {
                                                    a.e = acorVar3.s;
                                                    acorVar3.n = a;
                                                    return;
                                                }
                                            }
                                            acorVar3.g();
                                            return;
                                        }
                                    }
                                    acorVar3.g();
                                }
                            });
                            acor acorVar3 = (acor) acqkVar.b.k;
                            acorVar3.b.post(new acoh(acorVar3, 4));
                            acqkVar.a = true;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("AudioRecord.read failed: ");
                sb2.append(read);
                String sb3 = sb2.toString();
                Logging.b("WebRtcAudioRecordExternal", sb3);
                if (read == -3) {
                    this.a = false;
                    WebRtcAudioRecord webRtcAudioRecord5 = this.b;
                    String valueOf2 = String.valueOf(sb3);
                    Logging.b("WebRtcAudioRecordExternal", valueOf2.length() != 0 ? "Run-time recording error: ".concat(valueOf2) : new String("Run-time recording error: "));
                    bapv.f("WebRtcAudioRecordExternal", webRtcAudioRecord5.b, webRtcAudioRecord5.c);
                    acpe acpeVar = webRtcAudioRecord5.h;
                    if (acpeVar != null) {
                        String valueOf3 = String.valueOf(sb3);
                        zep.c("PeerConnectionClient", valueOf3.length() != 0 ? "onWebRtcAudioRecordError: ".concat(valueOf3) : new String("onWebRtcAudioRecordError: "));
                        acqj acqjVar = acpeVar.a.z;
                        if (acqjVar != null) {
                            acqjVar.a();
                        }
                    }
                }
            }
            i = 3;
        }
        try {
            AudioRecord audioRecord2 = this.b.f;
            if (audioRecord2 == null) {
                return;
            }
            audioRecord2.stop();
            WebRtcAudioRecord.d(1);
        } catch (IllegalStateException e) {
            String valueOf4 = String.valueOf(e.getMessage());
            Logging.b("WebRtcAudioRecordExternal", valueOf4.length() != 0 ? "AudioRecord.stop failed: ".concat(valueOf4) : new String("AudioRecord.stop failed: "));
        }
    }
}
