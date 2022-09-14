package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkException;
import org.chromium.net.RequestFinishedInfo;
/* compiled from: PG */
/* renamed from: csdt  reason: default package */
/* loaded from: classes.dex */
public final class csdt extends RequestFinishedInfo.Listener {
    private final CronetEngine d;
    private final csds e;
    private final btyc f;
    private static final dcep<Integer> b = dcep.K(Arrays.asList(31, 32, 36));
    private static final dcep<Integer> c = dcep.K(Arrays.asList(22, 23, 24, 25, 26, 27));
    static final long a = TimeUnit.HOURS.toMicros(1);

    public csdt(csds csdsVar, Executor executor, btyc btycVar, CronetEngine cronetEngine) {
        super(executor);
        this.e = csdsVar;
        this.f = btycVar;
        this.d = cronetEngine;
    }

    static boolean a(int i) {
        return !b.contains(Integer.valueOf(i));
    }

    private static boolean b(int i) {
        boolean z;
        dcep<Integer> dcepVar = c;
        Integer valueOf = Integer.valueOf(i);
        if (dcepVar.contains(valueOf)) {
            csdw csdwVar = csdv.a;
            synchronized (csdwVar.a) {
                z = !csdwVar.b.containsKey(valueOf);
            }
            return z;
        }
        return false;
    }

    private static void c(csdo csdoVar, String str, Long l) {
        if (l != null) {
            csdoVar.f(str, Long.toString(l.longValue()));
        }
    }

    private static Long d(RequestFinishedInfo.Metrics metrics) {
        if (metrics.getTotalTimeMs() == null || metrics.getTtfbMs() == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.MILLISECONDS.toMicros(metrics.getTotalTimeMs().longValue() - metrics.getTtfbMs().longValue()));
    }

    private static Long e(RequestFinishedInfo.Metrics metrics) {
        if (metrics.getTtfbMs() == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.MILLISECONDS.toMicros(metrics.getTtfbMs().longValue()));
    }

    private static Long f(RequestFinishedInfo.Metrics metrics) {
        return g(metrics.getSendingStart(), metrics.getSendingEnd());
    }

    private static Long g(Date date, Date date2) {
        if (date == null || date2 == null || date2.getTime() < date.getTime()) {
            return null;
        }
        return Long.valueOf(TimeUnit.MILLISECONDS.toMicros(date2.getTime() - date.getTime()));
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        int i;
        Collection<Object> annotations;
        csdo i2 = csdp.i();
        boolean z = false;
        if (requestFinishedInfo != null && (annotations = requestFinishedInfo.getAnnotations()) != null) {
            Iterator<Object> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof buhg) {
                    Integer num = btui.a.get(((buhg) next).a().getName());
                    if (num != null) {
                        i = num.intValue();
                    }
                }
            }
        }
        i = 0;
        if (i != 0) {
            i2.c(i);
        }
        if (a(i)) {
            if (this.f.a() > 0 && !b(i)) {
                csdw csdwVar = csdv.a;
                long a2 = this.f.a();
                synchronized (csdwVar.a) {
                    Long l = csdwVar.b.get(Integer.valueOf(i));
                    if (l != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long longValue = l.longValue() + a2;
                        if (elapsedRealtime < longValue) {
                            return;
                        }
                    }
                }
            } else if (ThreadLocalRandom.current().nextDouble() >= this.f.b(i)) {
                if (this.f.a() <= 0 || !b(i)) {
                    return;
                }
                csdv.a.a(i);
                return;
            }
        }
        int cronetInternalErrorCode = (requestFinishedInfo == null || requestFinishedInfo.getException() == null || !(requestFinishedInfo.getException() instanceof NetworkException)) ? 0 : ((NetworkException) requestFinishedInfo.getException()).getCronetInternalErrorCode();
        if (cronetInternalErrorCode != 0) {
            if (this.f.a() > 0 && a(i)) {
                csdv.a.a(i);
            }
            i2.d(true);
            i2.c(i + 10000);
            i2.f("network_error_code", Integer.toString(cronetInternalErrorCode));
            this.e.a(i2.e());
        } else if (requestFinishedInfo == null || requestFinishedInfo.getResponseInfo() == null || requestFinishedInfo.getMetrics() == null || requestFinishedInfo.getResponseInfo().wasCached()) {
        } else {
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            boolean z2 = (metrics.getTtfbMs() == null && (metrics.getSendingEnd() == null || metrics.getResponseStart() == null)) ? false : true;
            Long d = d(metrics);
            boolean z3 = metrics.getReceivedByteCount() != null && d != null && metrics.getReceivedByteCount().longValue() <= 10737418240L && d.longValue() <= a;
            Long f = f(metrics);
            Long e = e(metrics);
            if (metrics.getSentByteCount() != null && metrics.getSentByteCount().longValue() <= 10737418240L && ((e != null && e.longValue() <= a) || (f != null && f.longValue() <= a))) {
                z = true;
            }
            if (!z2 && !z3 && !z) {
                return;
            }
            if (this.f.a() > 0 && a(i)) {
                csdv.a.a(i);
            }
            if (z3 && z) {
                c(i2, "tx_bytes", metrics.getSentByteCount());
                c(i2, "tx_micros", e(metrics));
                c(i2, "rx_bytes", metrics.getReceivedByteCount());
                c(i2, "rx_micros", d(metrics));
                c(i2, "upload_micros", f(metrics));
            } else if (z3) {
                Long receivedByteCount = metrics.getReceivedByteCount();
                Long d2 = d(metrics);
                if (receivedByteCount != null) {
                    ((csdm) i2).c = receivedByteCount;
                }
                if (d2 != null) {
                    ((csdm) i2).b = d2;
                }
            } else if (z) {
                Long sentByteCount = metrics.getSentByteCount();
                Long e2 = e(metrics);
                if (sentByteCount != null) {
                    ((csdm) i2).e = sentByteCount;
                }
                if (e2 != null) {
                    ((csdm) i2).d = e2;
                }
                c(i2, "upload_micros", f(metrics));
            }
            if (z2) {
                Long e3 = e(metrics);
                if (e3 != null) {
                    ((csdm) i2).a = Long.valueOf(e3.longValue());
                }
                c(i2, "rtt_micros", g(metrics.getSendingEnd(), metrics.getResponseStart()));
            }
            CronetEngine cronetEngine = this.d;
            if (cronetEngine != null) {
                try {
                    int downstreamThroughputKbps = ((ExperimentalCronetEngine) cronetEngine).getDownstreamThroughputKbps();
                    if (downstreamThroughputKbps != -1) {
                        i2.f("estimated_download_tput_kbps", Integer.toString(downstreamThroughputKbps));
                    }
                    int transportRttMs = ((ExperimentalCronetEngine) this.d).getTransportRttMs();
                    if (transportRttMs != -1) {
                        i2.f("estimated_rtt_millis", Integer.toString(transportRttMs));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            this.e.a(i2.e());
        }
    }
}
