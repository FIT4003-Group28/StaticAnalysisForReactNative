package defpackage;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import io.grpc.Status;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: akiq  reason: default package */
/* loaded from: classes.dex */
public final class akiq {
    public final String A;
    public final boolean B;
    public final ampq C;
    public final boolean D;
    public final String E;
    public final String F;
    public final boolean G;
    public final int H;
    public final int I;

    /* renamed from: J  reason: collision with root package name */
    public final int f61J;
    private final Executor K;
    private final int M;
    private boolean N;
    private final int O;
    public final amnp a;
    protected final AudioRecord b;
    public final Handler c;
    public final akip d;
    public final akio e;
    public final String f;
    public final amnm g;
    public final amno h;
    public final CronetEngine i;
    public final String j;
    public String k;
    public final aaqf l;
    public final byte[] n;
    public final afvn o;
    public final String p;
    public final axxo q;
    public final int r;
    final ayat s;
    public final vzm t;
    public amns u;
    volatile aynl v;
    public ayal w;
    public final float z;
    public final akix m = new akix();
    public final aynl x = new akin(this);
    private final Runnable L = new Runnable() { // from class: akif
        @Override // java.lang.Runnable
        public final void run() {
            int i;
            byte[] bArr;
            int read;
            float f;
            int i2;
            int i3;
            byte[] bArr2;
            int i4;
            final akiq akiqVar = akiq.this;
            while (akiqVar.b.getRecordingState() == 3 && (read = akiqVar.b.read((bArr = new byte[(i = akiqVar.r)]), 0, i)) > 0) {
                akix akixVar = akiqVar.m;
                int i5 = read >> 1;
                long j = 0;
                long j2 = 0;
                while (read >= 2) {
                    int i6 = read - 2;
                    j2 += (bArr[read - 1] << 8) + (bArr[i6] & 255);
                    j += i4 * i4;
                    read = i6;
                }
                float sqrt = (float) Math.sqrt(((j * i5) - (j2 * j2)) / (i5 * i5));
                if (!akixVar.b && sqrt == 0.0f) {
                    zep.m("SpeechLevelGenerator", "Really low audio levels detected. The audio input may have issues.");
                    akixVar.b = true;
                }
                float f2 = akixVar.a;
                if (f2 < sqrt) {
                    f = (f2 * 0.999f) + (0.001f * sqrt);
                    akixVar.a = f;
                } else {
                    f = (f2 * 0.95f) + (0.05f * sqrt);
                    akixVar.a = f;
                }
                float f3 = -120.0f;
                if (f > 0.0d) {
                    double d = sqrt / f;
                    if (d > 1.0E-6d) {
                        f3 = ((float) Math.log10(d)) * 10.0f;
                    }
                }
                int min = (int) (((Math.min(Math.max(f3, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
                final int i7 = min < 30 ? 0 : (min / 10) * 10;
                akiqVar.c.post(new Runnable() { // from class: akii
                    @Override // java.lang.Runnable
                    public final void run() {
                        akiq akiqVar2 = akiq.this;
                        akiqVar2.d.a(i7);
                    }
                });
                if (akiqVar.v == null) {
                    akiqVar.c();
                    akiqVar.c.post(new akij(akiqVar, new NullPointerException(), 1));
                    return;
                } else if (akiqVar.e()) {
                    akja akjaVar = akiqVar.y;
                    if (!akjaVar.b) {
                        throw new IllegalStateException("You forgot to call init()!");
                    }
                    if (akjaVar.a) {
                        throw new IllegalStateException("Cannot process more bytes after flushing.");
                    }
                    akiy akiyVar = akjaVar.c;
                    aooa t = aoob.t();
                    if (!akiyVar.d) {
                        try {
                            i2 = akiyVar.e;
                            i3 = i2 - 1;
                            bArr2 = null;
                        } catch (IOException unused) {
                            zep.b("Unable to write bytes into buffer!");
                        }
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i3 == 0) {
                            throw new IllegalStateException("Trying to make header for unspecified codec!");
                        }
                        if (i3 == 1) {
                            bArr2 = "#!AMR-WB\n".getBytes();
                        } else if (i3 == 2) {
                            bArr2 = new byte[0];
                        } else if (i3 == 3) {
                            throw new IllegalStateException("Should never happen! Use OggOpusEncoder instead.");
                        }
                        t.write(bArr2);
                        akiyVar.d = true;
                    }
                    int i8 = 0;
                    while (i8 < i) {
                        int min2 = Math.min(4096, i - i8);
                        akiyVar.a(bArr, i8, min2, false, t);
                        i8 += min2;
                    }
                    aoob b = t.b();
                    if (b.d() > 0) {
                        aynl aynlVar = akiqVar.v;
                        aopa createBuilder = amnk.a.createBuilder();
                        createBuilder.copyOnWrite();
                        amnk amnkVar = (amnk) createBuilder.instance;
                        b.getClass();
                        amnkVar.b = 1;
                        amnkVar.c = b;
                        aynlVar.c((amnk) createBuilder.mo39build());
                    }
                } else {
                    aynl aynlVar2 = akiqVar.v;
                    aopa createBuilder2 = amnk.a.createBuilder();
                    aoob x = aoob.x(bArr);
                    createBuilder2.copyOnWrite();
                    amnk amnkVar2 = (amnk) createBuilder2.instance;
                    amnkVar2.b = 1;
                    amnkVar2.c = x;
                    aynlVar2.c((amnk) createBuilder2.mo39build());
                }
            }
        }
    };
    public final akja y = new akja();

    public akiq(akir akirVar) {
        int c;
        int i = akirVar.k;
        this.M = i;
        this.i = akirVar.a;
        this.t = akirVar.b;
        this.l = akirVar.c;
        this.d = akirVar.i;
        this.e = akirVar.j;
        this.s = new ayat();
        this.f = akirVar.n;
        this.K = akirVar.e;
        this.c = akirVar.f;
        this.n = akirVar.o;
        this.o = akirVar.d;
        this.I = akirVar.D;
        this.p = akirVar.g;
        this.q = akirVar.h;
        this.O = akirVar.C;
        int j = j();
        boolean i2 = i(i);
        this.N = i2;
        int i3 = 4;
        int i4 = (!i2 || (c = akja.c(j)) == 4 || akja.a(akja.b(c)) == null) ? 2 : i4;
        this.f61J = i4;
        this.j = akirVar.s;
        int i5 = akirVar.y;
        this.r = i5 <= 0 ? 1024 : i5;
        aopa createBuilder = amnm.a.createBuilder();
        int i6 = i4 - 1;
        AudioRecord audioRecord = null;
        if (i4 == 0) {
            throw null;
        }
        if (i6 == 2) {
            i3 = 5;
        } else if (i6 == 3) {
            i3 = 6;
        } else if (i6 != 4) {
            i3 = 3;
        }
        createBuilder.copyOnWrite();
        ((amnm) createBuilder.instance).b = i3 - 2;
        int i7 = akirVar.k;
        createBuilder.copyOnWrite();
        ((amnm) createBuilder.instance).c = i7;
        this.g = (amnm) createBuilder.mo39build();
        aopa createBuilder2 = amno.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((amno) createBuilder2.instance).b = 1;
        createBuilder2.copyOnWrite();
        ((amno) createBuilder2.instance).c = 16000;
        createBuilder2.copyOnWrite();
        ((amno) createBuilder2.instance).d = 100;
        this.h = (amno) createBuilder2.mo39build();
        int i8 = akirVar.q;
        int i9 = akirVar.p;
        try {
            audioRecord = new AudioRecord(6, i, i8, i9, Math.max(1280, AudioRecord.getMinBufferSize(i, i8, i9)));
        } catch (IllegalArgumentException unused) {
        }
        this.b = audioRecord;
        aopa createBuilder3 = amnp.a.createBuilder();
        String str = akirVar.m;
        createBuilder3.copyOnWrite();
        ((amnp) createBuilder3.instance).b = str;
        String str2 = akirVar.l;
        createBuilder3.copyOnWrite();
        ((amnp) createBuilder3.instance).c = str2;
        this.a = (amnp) createBuilder3.mo39build();
        this.z = akirVar.x;
        this.B = akirVar.u;
        this.A = akirVar.r;
        this.C = akirVar.z;
        this.D = akirVar.w;
        this.E = akirVar.t;
        this.F = akirVar.A;
        this.H = akirVar.B;
        this.G = akirVar.v;
    }

    private final void h() {
        this.N = false;
        if (!e()) {
            return;
        }
        try {
            akja akjaVar = this.y;
            if (akjaVar.b) {
                if (!akjaVar.a) {
                    akjaVar.a = true;
                    akjaVar.c.b();
                    akjaVar.b = false;
                    return;
                }
                throw new IllegalStateException("Already flushed. You must reinitialize.");
            }
            throw new IllegalStateException("You forgot to call init()!");
        } catch (IllegalStateException unused) {
        }
    }

    private final boolean i(int i) {
        int j = j();
        if (j != 1) {
            try {
                akja akjaVar = this.y;
                akjaVar.c = new akiy();
                akiy akiyVar = akjaVar.c;
                int c = akja.c(j);
                akiyVar.e = c;
                if (c == 1 || c == 4) {
                    throw new akiz("Codec not set properly.");
                }
                if (c == 2 && i != 16000) {
                    throw new akiz("AMR-WB encoder requires a sample rate of 16kHz.");
                }
                MediaCodecInfo a = akja.a(akja.b(c));
                if (a == null) {
                    throw new akiz("Encoder not found.");
                }
                akiyVar.b = MediaCodec.createByCodecName(a.getName());
                MediaFormat mediaFormat = new MediaFormat();
                int c2 = akja.c(j);
                mediaFormat.setString("mime", akja.b(c2));
                mediaFormat.setInteger("sample-rate", i);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("max-input-size", 4096);
                if (c2 != 3) {
                    mediaFormat.setInteger("bitrate", j - 1);
                }
                akiyVar.b.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                akiyVar.b.start();
                akiyVar.d = false;
                akiyVar.c = false;
                akiyVar.a = false;
                akjaVar.b = true;
                akjaVar.a = false;
                return true;
            } catch (akiz | IOException | IllegalArgumentException unused) {
            }
        }
        return false;
    }

    private final int j() {
        int i = this.f61J;
        if (i == 0) {
            i = this.O;
        }
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 2) {
                return 23851;
            }
            return i2 != 4 ? 1 : 2;
        }
        throw null;
    }

    public final void a() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.release();
        }
        ayal ayalVar = this.w;
        if (ayalVar != null) {
            ayjn ayjnVar = ((ayjo) ayalVar).c;
            int i = ayjn.a;
            ayjnVar.a();
            ayji ayjiVar = (ayji) ((aygz) ayalVar).a;
            ayjiVar.G.a(1, "shutdownNow() called");
            ayjiVar.n();
            ayje ayjeVar = ayjiVar.I;
            ayjeVar.c.o.execute(new ayiz(ayjeVar));
            ayjiVar.o.execute(new ayii(ayjiVar, 2));
        }
    }

    public final void b() {
        String g = this.o.g();
        if (g != null) {
            this.s.f(ayaq.c("X-Goog-Visitor-Id", ayat.a), g);
        }
    }

    public final void c() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        if (this.q.d().booleanValue()) {
            synchronized (this) {
                h();
                if (this.v != null) {
                    ((aynb) this.v).d(Status.c.asException());
                    this.v = null;
                }
            }
            return;
        }
        h();
        this.K.execute(new akig(this, 1));
    }

    public final void d() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        if (this.q.d().booleanValue()) {
            synchronized (this) {
                h();
                if (this.v != null) {
                    this.v.a();
                    this.v = null;
                }
            }
            return;
        }
        h();
        this.K.execute(new akig(this, 2));
    }

    public final boolean e() {
        return this.f61J != 2;
    }

    public final boolean f() {
        AudioRecord audioRecord = this.b;
        if (audioRecord == null || audioRecord.getState() != 1) {
            zep.b("AudioRecord is null or not initialized");
            return false;
        }
        if (!this.N) {
            this.N = i(this.M);
        }
        this.b.startRecording();
        this.c.post(new akig(this));
        this.K.execute(new Runnable() { // from class: akih
            @Override // java.lang.Runnable
            public final void run() {
                akiq akiqVar = akiq.this;
                int i = 1;
                if (akiqVar.u == null) {
                    afvm c = akiqVar.o.c();
                    if (c.z() || !(c instanceof AccountIdentity)) {
                        akiqVar.k = "";
                    } else {
                        afvv d = akiqVar.t.d((AccountIdentity) c);
                        if (!d.g()) {
                            akiqVar.k = "";
                        } else {
                            akiqVar.k = d.e();
                        }
                    }
                    afvm c2 = akiqVar.o.c();
                    if (c2 != null && c2.w()) {
                        akiqVar.s.f(ayaq.c("X-Goog-PageId", ayat.a), c2.e());
                    }
                    if (amps.e(akiqVar.k)) {
                        akiqVar.s.f(ayaq.c("x-goog-api-key", ayat.a), akiqVar.j);
                        akiqVar.b();
                    } else if (akiqVar.B) {
                        akiqVar.b();
                    }
                    aydq a = aydq.a(akiqVar.F, 443, akiqVar.i);
                    a.b.c.addAll(Arrays.asList(new akiu(akiqVar.s, akiqVar.k)));
                    a.b.g = akiqVar.p;
                    akiqVar.w = a.c();
                    akiqVar.u = (amns) amns.b(new amnr(), akiqVar.w);
                }
                amns amnsVar = akiqVar.u;
                aynl aynlVar = akiqVar.x;
                axye axyeVar = amnsVar.a;
                ayax ayaxVar = amnt.a;
                if (ayaxVar == null) {
                    synchronized (amnt.class) {
                        ayaxVar = amnt.a;
                        if (ayaxVar == null) {
                            ayau a2 = ayax.a();
                            a2.c = ayaw.BIDI_STREAMING;
                            a2.d = ayax.c("google.assistant.embedded.v1.EmbeddedAssistant", "YTAssist");
                            a2.b();
                            a2.a = aymw.b(amnk.a);
                            a2.b = aymw.b(amnl.a);
                            ayaxVar = a2.a();
                            amnt.a = ayaxVar;
                        }
                    }
                }
                akiqVar.v = aynh.b(axyeVar.a(ayaxVar, amnsVar.b), aynlVar);
                aopa createBuilder = amng.a.createBuilder();
                amnm amnmVar = akiqVar.g;
                createBuilder.copyOnWrite();
                amng amngVar = (amng) createBuilder.instance;
                amnmVar.getClass();
                amngVar.c = amnmVar;
                amngVar.b = 1;
                amno amnoVar = akiqVar.h;
                createBuilder.copyOnWrite();
                amnoVar.getClass();
                ((amng) createBuilder.instance).d = amnoVar;
                amnp amnpVar = akiqVar.a;
                createBuilder.copyOnWrite();
                amnpVar.getClass();
                ((amng) createBuilder.instance).f = amnpVar;
                aopa createBuilder2 = arky.a.createBuilder();
                int i2 = akiqVar.I;
                createBuilder2.copyOnWrite();
                arky arkyVar = (arky) createBuilder2.instance;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                arkyVar.f = i3;
                arkyVar.b |= 4096;
                float f = akiqVar.z;
                createBuilder2.copyOnWrite();
                arky arkyVar2 = (arky) createBuilder2.instance;
                arkyVar2.b |= 8192;
                arkyVar2.g = f;
                createBuilder2.copyOnWrite();
                arky arkyVar3 = (arky) createBuilder2.instance;
                arkyVar3.b |= 32;
                arkyVar3.d = false;
                aopa createBuilder3 = arkx.a.createBuilder();
                boolean z = akiqVar.D;
                createBuilder3.copyOnWrite();
                arkx arkxVar = (arkx) createBuilder3.instance;
                arkxVar.b |= 4;
                arkxVar.e = !z;
                String str = akiqVar.E;
                createBuilder3.copyOnWrite();
                arkx arkxVar2 = (arkx) createBuilder3.instance;
                str.getClass();
                arkxVar2.b |= 1;
                arkxVar2.c = str;
                if (akiqVar.D) {
                    String str2 = akiqVar.f;
                    createBuilder3.copyOnWrite();
                    arkx arkxVar3 = (arkx) createBuilder3.instance;
                    str2.getClass();
                    arkxVar3.b |= 2;
                    arkxVar3.d = str2;
                }
                arkx arkxVar4 = (arkx) createBuilder3.mo39build();
                createBuilder2.copyOnWrite();
                arky arkyVar4 = (arky) createBuilder2.instance;
                arkxVar4.getClass();
                arkyVar4.h = arkxVar4;
                arkyVar4.b |= 131072;
                aopa createBuilder4 = awgz.a.createBuilder();
                if (akiqVar.C.h()) {
                    createBuilder4.copyOnWrite();
                    awgz awgzVar = (awgz) createBuilder4.instance;
                    awgzVar.b |= 2048;
                    awgzVar.c = (String) akiqVar.C.c();
                }
                aopa createBuilder5 = awhb.a.createBuilder();
                createBuilder5.copyOnWrite();
                awhb awhbVar = (awhb) createBuilder5.instance;
                awgz awgzVar2 = (awgz) createBuilder4.mo39build();
                awgzVar2.getClass();
                awhbVar.d = awgzVar2;
                awhbVar.b |= 4;
                aopa createBuilder6 = awha.a.createBuilder();
                if (!TextUtils.isEmpty(akiqVar.A)) {
                    String str3 = akiqVar.A;
                    createBuilder6.copyOnWrite();
                    awha awhaVar = (awha) createBuilder6.instance;
                    str3.getClass();
                    awhaVar.b |= 128;
                    awhaVar.d = str3;
                }
                try {
                    ascj ascjVar = (ascj) aopi.parseFrom(ascj.a, akiqVar.n);
                    if (ascjVar != null) {
                        createBuilder6.copyOnWrite();
                        awha awhaVar2 = (awha) createBuilder6.instance;
                        awhaVar2.c = ascjVar;
                        awhaVar2.b |= 1;
                    }
                } catch (aopx unused) {
                }
                awha awhaVar3 = (awha) createBuilder6.mo39build();
                createBuilder5.copyOnWrite();
                awhb awhbVar2 = (awhb) createBuilder5.instance;
                awhaVar3.getClass();
                awhbVar2.c = awhaVar3;
                awhbVar2.b |= 1;
                createBuilder2.copyOnWrite();
                arky arkyVar5 = (arky) createBuilder2.instance;
                awhb awhbVar3 = (awhb) createBuilder5.mo39build();
                awhbVar3.getClass();
                arkyVar5.e = awhbVar3;
                arkyVar5.b |= 2048;
                aopa a3 = akiqVar.l.a();
                createBuilder2.copyOnWrite();
                arky arkyVar6 = (arky) createBuilder2.instance;
                aroy aroyVar = (aroy) a3.mo39build();
                aroyVar.getClass();
                arkyVar6.c = aroyVar;
                arkyVar6.b |= 1;
                aopa createBuilder7 = awxj.a.createBuilder();
                aoob byteString = ((arky) createBuilder2.mo39build()).toByteString();
                createBuilder7.copyOnWrite();
                awxj awxjVar = (awxj) createBuilder7.instance;
                awxjVar.b = 1;
                awxjVar.c = byteString;
                if (akiqVar.G) {
                    aopa createBuilder8 = awxl.a.createBuilder();
                    aopa createBuilder9 = amnz.a.createBuilder();
                    createBuilder9.copyOnWrite();
                    amnz amnzVar = (amnz) createBuilder9.instance;
                    aopq aopqVar = amnzVar.b;
                    if (!aopqVar.c()) {
                        amnzVar.b = aopi.mutableCopy(aopqVar);
                    }
                    amnzVar.b.g(0);
                    createBuilder8.copyOnWrite();
                    awxl awxlVar = (awxl) createBuilder8.instance;
                    amnz amnzVar2 = (amnz) createBuilder9.mo39build();
                    amnzVar2.getClass();
                    awxlVar.c = amnzVar2;
                    awxlVar.b |= 1;
                    aopa createBuilder10 = amoa.a.createBuilder();
                    createBuilder10.copyOnWrite();
                    amoa amoaVar = (amoa) createBuilder10.instance;
                    amoaVar.c = 5;
                    amoaVar.b |= 1;
                    int i4 = akiqVar.f61J;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 2) {
                        i = 7;
                    } else if (i5 == 3) {
                        i = 10;
                    } else if (i5 == 4) {
                        i = 8;
                    }
                    createBuilder10.copyOnWrite();
                    amoa amoaVar2 = (amoa) createBuilder10.instance;
                    amoaVar2.d = i - 1;
                    amoaVar2.b |= 2;
                    createBuilder8.copyOnWrite();
                    awxl awxlVar2 = (awxl) createBuilder8.instance;
                    amoa amoaVar3 = (amoa) createBuilder10.mo39build();
                    amoaVar3.getClass();
                    awxlVar2.d = amoaVar3;
                    awxlVar2.b |= 2;
                    aoob byteString2 = ((awxl) createBuilder8.mo39build()).toByteString();
                    createBuilder7.copyOnWrite();
                    awxj awxjVar2 = (awxj) createBuilder7.instance;
                    awxjVar2.d = 4;
                    awxjVar2.e = byteString2;
                }
                awxj awxjVar3 = (awxj) createBuilder7.mo39build();
                aopa createBuilder11 = amnq.a.createBuilder();
                String str4 = akiqVar.f;
                createBuilder11.copyOnWrite();
                str4.getClass();
                ((amnq) createBuilder11.instance).c = str4;
                boolean z2 = akiqVar.D;
                createBuilder11.copyOnWrite();
                ((amnq) createBuilder11.instance).d = z2;
                if (akiqVar.H > 0) {
                    aopa createBuilder12 = amni.a.createBuilder();
                    aopa createBuilder13 = amnh.a.createBuilder();
                    int i6 = akiqVar.H;
                    createBuilder13.copyOnWrite();
                    ((amnh) createBuilder13.instance).b = i6;
                    amnh amnhVar = (amnh) createBuilder13.mo39build();
                    createBuilder12.copyOnWrite();
                    amnhVar.getClass();
                    ((amni) createBuilder12.instance).b = amnhVar;
                    amni amniVar = (amni) createBuilder12.mo39build();
                    createBuilder11.copyOnWrite();
                    amniVar.getClass();
                    ((amnq) createBuilder11.instance).b = amniVar;
                }
                aopa createBuilder14 = amnu.a.createBuilder();
                aoob byteString3 = awxjVar3.toByteString();
                createBuilder14.copyOnWrite();
                ((amnu) createBuilder14.instance).b = byteString3;
                amnu amnuVar = (amnu) createBuilder14.mo39build();
                createBuilder.copyOnWrite();
                amnuVar.getClass();
                ((amng) createBuilder.instance).g = amnuVar;
                amnq amnqVar = (amnq) createBuilder11.mo39build();
                createBuilder.copyOnWrite();
                amnqVar.getClass();
                ((amng) createBuilder.instance).e = amnqVar;
                if (akiqVar.q.d().booleanValue()) {
                    synchronized (akiqVar) {
                        akiqVar.g(createBuilder);
                    }
                    return;
                }
                akiqVar.g(createBuilder);
            }
        });
        return true;
    }

    public final void g(aopa aopaVar) {
        if (this.v != null) {
            aynl aynlVar = this.v;
            aopa createBuilder = amnk.a.createBuilder();
            createBuilder.copyOnWrite();
            amnk amnkVar = (amnk) createBuilder.instance;
            amng amngVar = (amng) aopaVar.mo39build();
            amngVar.getClass();
            amnkVar.c = amngVar;
            amnkVar.b = 2;
            aynlVar.c((amnk) createBuilder.mo39build());
            this.L.run();
            return;
        }
        d();
        this.c.post(new akij(this, new NullPointerException()));
    }
}
