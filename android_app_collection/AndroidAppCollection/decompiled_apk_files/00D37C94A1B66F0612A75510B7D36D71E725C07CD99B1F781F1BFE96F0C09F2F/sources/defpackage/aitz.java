package defpackage;

import android.net.Uri;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackLoggingPayloadModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.stats.PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aitz  reason: default package */
/* loaded from: classes.dex */
public final class aitz {
    public final amqo a;
    public final String b;
    public final acrr c;
    public final amqo d;
    public boolean e;
    public long f;
    private final afwu g;
    private final yrj h;
    private final afst i;
    private final PriorityQueue j;
    private final PriorityQueue k;
    private final Executor l;
    private final aadd m;
    private final ajjh n;

    /* JADX INFO: Access modifiers changed from: protected */
    public aitz(afwu afwuVar, yrj yrjVar, afst afstVar, amqo amqoVar, List list, List list2, String str, Executor executor, ajjh ajjhVar, acrr acrrVar, aadd aaddVar, amqo amqoVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.g = afwuVar;
        this.h = yrjVar;
        this.i = afstVar;
        this.a = amqoVar;
        this.j = new PriorityQueue(list);
        this.k = new PriorityQueue(list2);
        str.getClass();
        this.b = str;
        this.l = executor;
        this.n = ajjhVar;
        this.c = acrrVar;
        this.m = aaddVar;
        this.d = amqoVar2;
    }

    public final synchronized PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState a() {
        return new PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState(this.j, this.k, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Map, java.lang.Object] */
    public final void b(TrackingUrlModel trackingUrlModel, long j) {
        zgp b = zgp.b(trackingUrlModel.c());
        for (aaoc aaocVar : trackingUrlModel.c) {
            ylr.b();
            aaoc aaocVar2 = aaoc.MS;
            int ordinal = aaocVar.ordinal();
            if (ordinal == 0) {
                for (Map.Entry entry : this.a.get().entrySet()) {
                    b.h((String) entry.getKey(), (String) entry.getValue());
                }
            } else if (ordinal == 2) {
                this.i.d(b);
            } else if (ordinal == 3) {
                b.h("cpn", this.b);
            } else if (ordinal == 4) {
                b.k("conn", this.h.a());
            } else if (ordinal == 5) {
                b.h("cmt", String.valueOf(j / 1000));
            }
        }
        Uri a = b.a();
        if (this.n.b(a)) {
            a = this.n.a(a);
        }
        acwk acwkVar = new acwk(trackingUrlModel, 1);
        String.valueOf(String.valueOf(a)).length();
        afwt d = afwu.d("remarketing");
        d.b(a);
        d.d = true;
        d.a(acwkVar);
        this.g.a(d, afzr.a);
    }

    public final synchronized void c(ahhx ahhxVar) {
        PlaybackLoggingPayloadModel playbackLoggingPayloadModel;
        final TrackingUrlModel trackingUrlModel;
        if (ahhxVar.j()) {
            this.f = ahhxVar.e();
            while (this.j.size() > 0 && (trackingUrlModel = (TrackingUrlModel) this.j.peek()) != null) {
                long j = this.f;
                if (trackingUrlModel.b.length() <= 0 || trackingUrlModel.b(0) * 1000 > j) {
                    break;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.l.execute(new Runnable() { // from class: aitx
                        @Override // java.lang.Runnable
                        public final void run() {
                            aitz aitzVar = aitz.this;
                            aitzVar.b(trackingUrlModel, aitzVar.f);
                        }
                    });
                } else {
                    b(trackingUrlModel, this.f);
                }
                this.j.remove();
            }
            while (!this.k.isEmpty() && (playbackLoggingPayloadModel = (PlaybackLoggingPayloadModel) this.k.peek()) != null) {
                if (playbackLoggingPayloadModel.b * 1000 > this.f) {
                    break;
                }
                atye a = atyf.a();
                String str = this.b;
                a.copyOnWrite();
                atyf.c((atyf) a.instance, str);
                aoob aoobVar = playbackLoggingPayloadModel.a;
                a.copyOnWrite();
                atyf.d((atyf) a.instance, aoobVar);
                arrf a2 = arrh.a();
                a2.copyOnWrite();
                ((arrh) a2.instance).ds((atyf) a.mo39build());
                this.c.c((arrh) a2.mo39build());
                this.k.remove();
            }
            if (!this.e) {
                auaf auafVar = this.m.a().j;
                if (auafVar == null) {
                    auafVar = auaf.a;
                }
                if (auafVar.p) {
                    this.e = true;
                    this.l.execute(new Runnable() { // from class: aitw
                        /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            aitz aitzVar = aitz.this;
                            aitzVar.a.get();
                            String str2 = null;
                            if (aitzVar.a.get().entrySet() != null) {
                                Iterator it = aitzVar.a.get().entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (entry != null && entry.getValue() != null && "ms".equalsIgnoreCase((String) entry.getKey())) {
                                            str2 = (String) entry.getValue();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            boolean z = true;
                            if (str2 != null) {
                                try {
                                    if (!((Boolean) aitzVar.d.get()).booleanValue()) {
                                        athh a3 = athi.a();
                                        String str3 = aitzVar.b;
                                        a3.copyOnWrite();
                                        athi.c((athi) a3.instance, str3);
                                        a3.copyOnWrite();
                                        athi.d((athi) a3.instance, str2);
                                        arrf a4 = arrh.a();
                                        a4.copyOnWrite();
                                        ((arrh) a4.instance).dh((athi) a3.mo39build());
                                        z = aitzVar.c.c((arrh) a4.mo39build());
                                    }
                                } catch (Exception unused) {
                                    z = false;
                                }
                            }
                            aitzVar.e = z;
                        }
                    });
                }
            }
        }
    }
}
