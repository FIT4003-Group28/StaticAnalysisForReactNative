package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import com.google.protos.youtube.api.innertube.LogStreamEventsCommandOuterClass$LogStreamEventsCommand;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
/* compiled from: PG */
/* renamed from: acqm  reason: default package */
/* loaded from: classes.dex */
public final class acqm implements abtx {
    public final abzc a;
    public final absg b;
    public final abtw c;
    public final absi d;
    public absi e;
    public final Handler f;
    public final acpn g;
    public acpg h;
    public Handler i;
    public acnx j;
    public acoe k;
    public MediaFormat l;
    public MediaFormat m;
    public boolean n;
    public boolean o;
    public abtu p;
    private final Context q;
    private final yqw r;
    private final acow s;
    private final absi t;
    private absz u;
    private abrz v;
    private EGLContext w;
    private Thread x;
    private acqk y;

    public acqm(Context context, yqw yqwVar, abzc abzcVar, final abss abssVar, absg absgVar, abtw abtwVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f = handler;
        this.q = context;
        yqwVar.getClass();
        this.r = yqwVar;
        this.a = abzcVar;
        this.b = absgVar;
        abtwVar.getClass();
        this.c = abtwVar;
        this.d = new absi(absgVar);
        this.g = new acpn();
        v();
        if (abzcVar.g()) {
            this.u = new absz();
            this.v = new abrz(this.u);
            this.e = new absi(this.v);
            this.k = new acor(context, abssVar, abtwVar, this.u, this.v);
            this.y = new acqk(this);
        }
        this.t = new absi(new acql(this));
        this.s = new acow(context, handler, abssVar);
        if (abssVar.a() == null) {
            abssVar.c(new absp() { // from class: acpt
                @Override // defpackage.absp
                public final void a() {
                    final acqm acqmVar = acqm.this;
                    final abss abssVar2 = abssVar;
                    acqmVar.i.post(new Runnable() { // from class: acqh
                        @Override // java.lang.Runnable
                        public final void run() {
                            acqm.this.r(abssVar2.a());
                        }
                    });
                }
            });
        } else {
            r(abssVar.a());
        }
    }

    @Override // defpackage.abtx
    public final absi a() {
        return this.t;
    }

    @Override // defpackage.abtx
    public final abto b() {
        return null;
    }

    @Override // defpackage.abtx
    public final void c(final LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand) {
        this.i.post(new Runnable() { // from class: acpw
            @Override // java.lang.Runnable
            public final void run() {
                FileInputStream fileInputStream;
                acqm acqmVar = acqm.this;
                LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand2 = logStreamEventsCommandOuterClass$LogStreamEventsCommand;
                acpk acpkVar = acqmVar.h.i;
                String str = logStreamEventsCommandOuterClass$LogStreamEventsCommand2.b;
                String str2 = logStreamEventsCommandOuterClass$LogStreamEventsCommand2.c;
                PeerConnection peerConnection = acpkVar.c;
                if (peerConnection != null) {
                    peerConnection.nativeStopRtcEventLog();
                }
                File[] listFiles = new File(acpkVar.a.getFilesDir(), "rtc_event_logs/").listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file = listFiles[i];
                        String.valueOf(String.valueOf(file)).length();
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    File[] fileArr = listFiles;
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    listFiles = fileArr;
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    int length2 = byteArray.length;
                                    String encodeToString = Base64.encodeToString(byteArray, 2);
                                    JSONObject jSONObject = new JSONObject();
                                    JSONObject jSONObject2 = new JSONObject();
                                    JSONObject jSONObject3 = new JSONObject();
                                    JSONObject jSONObject4 = new JSONObject();
                                    JSONObject jSONObject5 = new JSONObject();
                                    JSONObject jSONObject6 = new JSONObject();
                                    JSONObject jSONObject7 = new JSONObject();
                                    File[] fileArr2 = listFiles;
                                    try {
                                        jSONObject4.put("name", "YouTube");
                                        jSONObject5.put("name", "1");
                                        jSONObject3.put("app_info", jSONObject4);
                                        jSONObject3.put("platform_info", jSONObject5);
                                        jSONObject2.put("client_info", jSONObject3);
                                        jSONObject7.put("session_id", str2);
                                        jSONObject6.put("rtc_event_log", encodeToString);
                                        jSONObject6.put("client_header", jSONObject7);
                                        jSONObject.put("header", jSONObject2);
                                        jSONObject.put("compression", "NONE");
                                        jSONObject.put("event", jSONObject6);
                                    } catch (JSONException e) {
                                        zep.f("RtcEventLogger", "Could not construct RtcEventLogRequest with exception=", e);
                                    }
                                    String valueOf = String.valueOf(str);
                                    if (valueOf.length() != 0) {
                                        "Uploading RtcEventLogRequest to ".concat(valueOf);
                                    }
                                    acpkVar.b.a(new acpj(jSONObject, str, afwi.b, afuv.a));
                                    i++;
                                    listFiles = fileArr2;
                                } catch (IOException e2) {
                                    zep.f("RtcEventLogger", "Failed to rtc event log file ", e2);
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                        }
                    }
                }
                acpkVar.a();
            }
        });
    }

    @Override // defpackage.abtx
    public final void d(final RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand) {
        this.i.post(new Runnable() { // from class: acpx
            @Override // java.lang.Runnable
            public final void run() {
                acqm acqmVar = acqm.this;
                RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand2 = recordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
                acpk acpkVar = acqmVar.h.i;
                acpkVar.d = recordStreamEventsCommandOuterClass$RecordStreamEventsCommand2;
                acpkVar.a();
                acpkVar.c();
            }
        });
    }

    @Override // defpackage.abtx
    public final void e() {
        v();
    }

    @Override // defpackage.abtx
    public final void f(abtv abtvVar) {
        if (this.x.isAlive()) {
            this.i.post(new acpu(this, abtvVar));
        } else {
            this.f.post(new acpu(this, abtvVar, 2));
        }
    }

    @Override // defpackage.abtx
    public final void g(abtv abtvVar) {
        this.i.post(new acpu(this, abtvVar, 3));
    }

    @Override // defpackage.abtx
    public final void h(abut abutVar) {
        acow acowVar = this.s;
        if (acowVar != null) {
            acowVar.f = abutVar;
        }
    }

    @Override // defpackage.abtx
    public final void i(final abtu abtuVar, final abtv abtvVar) {
        this.i.post(new Runnable() { // from class: acqi
            /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x01ba  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x01cb  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 468
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acqi.run():void");
            }
        });
    }

    @Override // defpackage.abtx
    public final boolean j() {
        return this.n;
    }

    @Override // defpackage.abtx
    public final boolean k() {
        return this.h.c();
    }

    @Override // defpackage.abtx
    public final boolean l() {
        return this.o;
    }

    @Override // defpackage.abtx
    public final absz m() {
        acoe acoeVar = this.k;
        if (acoeVar != null) {
            return ((acor) acoeVar).c;
        }
        return null;
    }

    @Override // defpackage.abtx
    public final void n(final boolean z, final abxq abxqVar) {
        this.i.post(new Runnable() { // from class: acpy
            @Override // java.lang.Runnable
            public final void run() {
                boolean d;
                acqm acqmVar = acqm.this;
                boolean z2 = z;
                abxq abxqVar2 = abxqVar;
                if (acqmVar.o) {
                    acqmVar.n = z2;
                    d = true;
                } else {
                    d = acqmVar.h.d(z2);
                    boolean c = acqmVar.h.c();
                    acqmVar.n = c;
                    acoe acoeVar = acqmVar.k;
                    if (acoeVar != null) {
                        acoeVar.a(c);
                    }
                }
                abxqVar2.a(!d ? 1 : 0, acqmVar.n);
            }
        });
    }

    @Override // defpackage.abtx
    public final void o(final abxj abxjVar) {
        this.i.post(new Runnable() { // from class: acpv
            @Override // java.lang.Runnable
            public final void run() {
                acqm acqmVar = acqm.this;
                final abxj abxjVar2 = abxjVar;
                acqmVar.j.a();
                acqmVar.h.b();
                acqmVar.p = null;
                acoe acoeVar = acqmVar.k;
                if (acoeVar != null) {
                    final acor acorVar = (acor) acoeVar;
                    acorVar.b.post(new Runnable() { // from class: acok
                        @Override // java.lang.Runnable
                        public final void run() {
                            acor acorVar2 = acor.this;
                            acorVar2.u = abxjVar2;
                            acbt acbtVar = acorVar2.n;
                            if (acbtVar != null) {
                                acbtVar.l(acorVar2.t);
                            }
                            acbt acbtVar2 = acorVar2.m;
                            if (acbtVar2 != null) {
                                acbtVar2.l(acorVar2.t);
                            }
                            accg accgVar = acorVar2.k;
                            if (accgVar != null) {
                                accgVar.c(null, null);
                                acorVar2.k.b(null, null);
                                acorVar2.k.j();
                                acorVar2.k.i();
                                acorVar2.k = null;
                            }
                            acorVar2.b.postDelayed(acorVar2.r, 250L);
                        }
                    });
                    return;
                }
                acqmVar.f.post(new Runnable() { // from class: acqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        abxj.this.a(0);
                    }
                });
            }
        });
    }

    @Override // defpackage.abtx
    public final void p(abtv abtvVar) {
        this.i.post(new acpu(this, abtvVar, 1));
    }

    @Override // defpackage.abtx
    public final void q(final boolean z, final boolean z2, final Integer num, final Integer num2, MediaFormat mediaFormat, MediaFormat mediaFormat2, final String str, final String str2, accg accgVar, Bundle bundle, final abtv abtvVar) {
        this.l = mediaFormat2;
        this.m = mediaFormat;
        this.i.post(new Runnable() { // from class: acqg
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                acqm acqmVar = acqm.this;
                boolean z3 = z;
                boolean z4 = z2;
                Integer num3 = num;
                Integer num4 = num2;
                String str3 = str;
                String str4 = str2;
                abtv abtvVar2 = abtvVar;
                acqmVar.n = z3;
                boolean z5 = true;
                aqxo.p(true);
                abtvVar2.getClass();
                if (acqmVar.h == null) {
                    abtvVar2.a(8);
                    return;
                }
                acoe acoeVar = acqmVar.k;
                if (acoeVar != null) {
                    acoeVar.a(z3);
                }
                int i2 = 1920;
                if (num3 == null || num4 == null || num3.intValue() <= 0 || num4.intValue() <= 0) {
                    if (acqmVar.a.c().I) {
                        int i3 = 3840;
                        int i4 = true != z4 ? 3840 : 2160;
                        if (true != z4) {
                            i3 = 2160;
                        }
                        i = i4;
                        i2 = i3;
                    } else if (acqmVar.a.c().H) {
                        int i5 = true != z4 ? 1920 : 1080;
                        if (true != z4) {
                            i = i5;
                            i2 = 1080;
                        } else {
                            i = i5;
                        }
                    } else {
                        int i6 = true != z4 ? 1280 : 720;
                        if (true != z4) {
                            i = i6;
                            i2 = 720;
                        } else {
                            i = i6;
                            i2 = 1280;
                        }
                    }
                } else {
                    i = num3.intValue();
                    i2 = num4.intValue();
                }
                absg absgVar = acqmVar.b;
                if (i < 0 || i2 < 0) {
                    z5 = false;
                }
                aqxo.p(z5);
                absgVar.a = i;
                absgVar.b = i2;
                acpg acpgVar = acqmVar.h;
                Handler handler = acqmVar.i;
                acpn acpnVar = acqmVar.g;
                handler.getClass();
                acpgVar.j = handler;
                acpgVar.k = z3;
                str3.getClass();
                acpgVar.l = str3;
                str4.getClass();
                acpgVar.m = str4;
                acpgVar.n = i;
                acpgVar.o = i2;
                acpgVar.p = acpnVar;
                abtvVar2.a(0);
            }
        });
    }

    public final void r(abry abryVar) {
        abryVar.getClass();
        this.w = abryVar.b;
        Context context = this.q;
        yqw yqwVar = this.r;
        EGLContext eGLContext = this.w;
        List c = acty.c(this.a.d());
        aopu<String> aopuVar = this.a.c().D;
        ArrayList arrayList = new ArrayList();
        if (aopuVar != null) {
            for (String str : aopuVar) {
                arrayList.add(acnt.a(str));
            }
        }
        boolean z = this.a.c().z;
        boolean z2 = this.a.c().P;
        int i = this.a.c().x;
        float f = this.a.c().y;
        int i2 = this.a.c().w;
        boolean z3 = this.a.c().f109J;
        acpg acpgVar = new acpg(context, yqwVar, eGLContext, c, arrayList, z, z2, i, f, i2, this.y, this.s);
        this.h = acpgVar;
        acow acowVar = this.s;
        if (acowVar != null) {
            acowVar.e = acpgVar;
        }
    }

    public final void s() {
        acpn acpnVar = this.g;
        acpnVar.b = null;
        acpnVar.a = null;
        acpnVar.c = 0;
        acpnVar.d = 0L;
        acpnVar.e = 0L;
        this.j.a();
        this.h.b();
        acoe acoeVar = this.k;
        if (acoeVar != null) {
            acor acorVar = (acor) acoeVar;
            acorVar.b.post(new acoh(acorVar, 3));
        }
    }

    public final void t(int i, abtv abtvVar) {
        this.f.post(new acqc(abtvVar, i));
    }

    public final void u(final int i) {
        if (abxb.c(i)) {
            if (this.x.isAlive()) {
                this.i.post(new Runnable() { // from class: acqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        acqm.this.s();
                    }
                });
            } else {
                this.f.post(new Runnable() { // from class: acqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        acqm.this.s();
                    }
                });
            }
        }
        this.f.post(new Runnable() { // from class: acqf
            @Override // java.lang.Runnable
            public final void run() {
                acqm acqmVar = acqm.this;
                int i2 = i;
                abtu abtuVar = acqmVar.p;
                if (abtuVar != null) {
                    abtuVar.a(i2);
                }
            }
        });
    }

    final void v() {
        HandlerThread handlerThread = new HandlerThread("WebRtcPipelineThread", 0);
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
        this.x = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acpz
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acqm acqmVar = acqm.this;
                zep.f("WebRtcCapturePipelineMgr", "WebRTC pipeline thread died unexpectedly", th);
                acqmVar.u(37);
            }
        });
        Handler handler = this.i;
        final acnw acnwVar = new acnw();
        absg absgVar = this.b;
        abst abstVar = new abst() { // from class: acqa
            @Override // defpackage.abst
            public final void a() {
                acnu acnuVar = acnw.this.a;
                if (acnuVar != null) {
                    acnuVar.a.run();
                }
            }
        };
        Handler handler2 = this.i;
        absgVar.c = abstVar;
        absgVar.d = handler2;
        this.j = new acnx(acnwVar, new acqb(this), handler);
    }
}
