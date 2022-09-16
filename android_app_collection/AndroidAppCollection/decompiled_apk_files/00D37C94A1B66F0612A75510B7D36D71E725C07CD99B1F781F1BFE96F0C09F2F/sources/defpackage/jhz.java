package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.youtube.R;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jhz  reason: default package */
/* loaded from: classes3.dex */
public final class jhz {
    static final long a = TimeUnit.DAYS.toMillis(30);
    static final long b = TimeUnit.HOURS.toMillis(12);
    public final Context c;
    public final snc d;
    private final yrj e;
    private final fcd f;
    private final agvw g;
    private final azqb h;
    private final azqb i;
    private final aghg j;
    private final aadd k;
    private final ahdf l;
    private final fbx m;

    public jhz(Context context, snc sncVar, yrj yrjVar, fcd fcdVar, agvw agvwVar, azqb azqbVar, azqb azqbVar2, aghg aghgVar, aadd aaddVar, ahdf ahdfVar, fbx fbxVar) {
        this.c = context;
        this.d = sncVar;
        this.e = yrjVar;
        this.f = fcdVar;
        this.g = agvwVar;
        this.h = azqbVar;
        this.i = azqbVar2;
        this.j = aghgVar;
        this.k = aaddVar;
        this.l = ahdfVar;
        this.m = fbxVar;
    }

    public static aqqz e(aqqv aqqvVar) {
        String g = aakj.g(aqqvVar.d());
        if (amps.e(g)) {
            return null;
        }
        for (aqqz aqqzVar : aqqvVar.getLicenses()) {
            if ((aqqzVar.b & 128) != 0 && aqqzVar.i.equals(g)) {
                return aqqzVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static avyq f(jiq jiqVar) {
        jiq jiqVar2 = jiq.PLAYABLE;
        switch (jiqVar.ordinal()) {
            case 0:
                return avyq.DOWNLOAD_STATE_COMPLETE;
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return avyq.DOWNLOAD_STATE_FAILED;
            case 2:
                return avyq.DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS;
            case 3:
                return avyq.DOWNLOAD_STATE_PENDING_DOWNLOAD;
            case 4:
                return avyq.DOWNLOAD_STATE_PAUSED;
            default:
                zep.b("Unrecognized video display state, defaulting to unknown.");
                return avyq.DOWNLOAD_STATE_UNKNOWN;
        }
    }

    public static final float o(atyp atypVar) {
        amuk r = r(atypVar);
        int i = ((amxx) r).c;
        long j = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            auzy auzyVar = (auzy) r.get(i2);
            j += auzyVar.d;
            j2 += auzyVar.c;
        }
        if (j > 0) {
            return ((float) j2) / ((float) j);
        }
        return 0.0f;
    }

    public static final boolean p(atss atssVar) {
        int as;
        return (atssVar == null || (as = akel.as(atssVar.getOfflineFutureUnplayableInfo().d)) == 0 || as != 2) ? false : true;
    }

    private final jiq q(atyp atypVar, atss atssVar) {
        avkm avkmVar = null;
        aqqv b2 = atypVar != null ? atypVar.b() : null;
        avkp g = atypVar != null ? atypVar.g() : null;
        avkl transferState = g != null ? g.getTransferState() : null;
        if (g != null) {
            avkmVar = g.getFailureReason();
        }
        asaa asaaVar = s(atypVar).f;
        if (asaaVar == null) {
            asaaVar = asaa.a;
        }
        asaa asaaVar2 = asaaVar;
        List streamProgress = g != null ? g.getStreamProgress() : amuk.q();
        if (u(transferState, atssVar, asaaVar2, streamProgress, b2)) {
            if (!v(asaaVar2) || !aijr.j(asaaVar2)) {
                if (v(asaaVar2)) {
                    return jiq.ERROR_NOT_PLAYABLE;
                }
                if (w(atssVar, b2)) {
                    if (k(atssVar, b2)) {
                        return jiq.ERROR_EXPIRED;
                    }
                    return jiq.ERROR_POLICY;
                } else if (!x(streamProgress)) {
                    if (!avkl.TRANSFER_STATE_FAILED.equals(transferState) || !avkm.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE.equals(avkmVar)) {
                        if (y(transferState)) {
                            return jiq.ERROR_GENERIC;
                        }
                    } else {
                        return jiq.ERROR_DISK;
                    }
                } else {
                    return jiq.ERROR_STREAMS_MISSING;
                }
            } else {
                return jiq.ERROR_PENDING_PLAYABILITY_ACTION;
            }
        } else if (!avkl.TRANSFER_STATE_COMPLETE.equals(transferState) && (g == null || o(atypVar) != 1.0f)) {
            if (avkl.TRANSFER_STATE_PAUSED_BY_USER.equals(transferState)) {
                return jiq.TRANSFER_PAUSED;
            }
            if (avkl.TRANSFER_STATE_TRANSFERRING.equals(transferState)) {
                if (!avkl.TRANSFER_STATE_TRANSFERRING.equals(transferState) || !avkm.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE.equals(avkmVar)) {
                    return jiq.TRANSFER_IN_PROGRESS;
                }
                return jiq.ERROR_DISK_SD_CARD;
            }
        } else {
            return jiq.PLAYABLE;
        }
        return jiq.TRANSFER_WAITING_IN_QUEUE;
    }

    private static amuk r(atyp atypVar) {
        amuk amukVar;
        amuf f = amuk.f();
        if (atypVar != null) {
            avkp g = atypVar.g();
            if (g != null) {
                f.j(g.getStreamProgress());
            }
            try {
                amuf amufVar = new amuf();
                for (String str : atypVar.c.j) {
                    aajj b2 = atypVar.b.b(str);
                    if (b2 != null) {
                        if (b2 instanceof aozm) {
                            amufVar.h((aozm) b2);
                        } else {
                            String valueOf = String.valueOf(b2);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                            sb.append("Entity ");
                            sb.append(valueOf);
                            sb.append(" is not a AdPlaybackDataEntityModel");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                amukVar = amufVar.g();
            } catch (IllegalArgumentException unused) {
                amukVar = null;
            }
            if (amukVar != null) {
                int i = ((amxx) amukVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    aozm aozmVar = (aozm) amukVar.get(i2);
                    aajj b3 = aozmVar.b.b(aozmVar.c.e);
                    boolean z = true;
                    if (b3 != null && !(b3 instanceof avkp)) {
                        z = false;
                    }
                    aqxo.z(z, "entityFromStore is not instance of TransferEntityModel, key=transfer");
                    avkp avkpVar = (avkp) b3;
                    if (avkpVar != null) {
                        f.j(avkpVar.getStreamProgress());
                    }
                }
            }
        }
        return f.g();
    }

    private static asaj s(atyp atypVar) {
        asaj asajVar;
        return (atypVar == null || (asajVar = (asaj) aaqp.c(atypVar.getPlayerResponseBytes().I(), asaj.a)) == null) ? asaj.a : asajVar;
    }

    private static atse t(atss atssVar) {
        try {
            return (atse) aopi.parseFrom(atse.a, atssVar.getOfflineStateBytes(), aoos.b());
        } catch (aopx e) {
            zep.d("Failed to get Offline State.", e);
            return atse.a;
        }
    }

    private final boolean u(avkl avklVar, atss atssVar, asaa asaaVar, List list, aqqv aqqvVar) {
        return y(avklVar) || w(atssVar, aqqvVar) || v(asaaVar) || x(list);
    }

    private static boolean v(asaa asaaVar) {
        return !aijr.i(asaaVar);
    }

    private final boolean w(atss atssVar, aqqv aqqvVar) {
        return atssVar != null && (!atssVar.getAction().equals(atsp.OFFLINE_VIDEO_POLICY_ACTION_OK) || k(atssVar, aqqvVar));
    }

    private static boolean x(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int g = aqvb.g(((auzy) it.next()).f);
            if (g != 0 && g == 4) {
                return true;
            }
        }
        return false;
    }

    private static boolean y(avkl avklVar) {
        return avkl.TRANSFER_STATE_FAILED.equals(avklVar) || avkl.TRANSFER_STATE_UNKNOWN.equals(avklVar);
    }

    public final long a(atss atssVar) {
        if (atssVar.getOfflineFutureUnplayableInfo() == null || atssVar.getOfflineFutureUnplayableInfo().c < 0) {
            return 0L;
        }
        return Math.max((atssVar.getLastUpdatedTimestampSeconds().longValue() + atssVar.getOfflineFutureUnplayableInfo().c) - TimeUnit.MILLISECONDS.toSeconds(this.d.c()), 0L);
    }

    public final jiq b(asze aszeVar) {
        asza b2 = aszeVar.b();
        atss atssVar = null;
        atyp b3 = b2 != null ? b2.b() : null;
        if (b3 != null) {
            atssVar = b3.f();
        }
        return q(b3, atssVar);
    }

    public final jiq c(awjr awjrVar) {
        return q(awjrVar.f(), awjrVar.b());
    }

    public final ampq d(awjr awjrVar) {
        if (this.m.b()) {
            atss b2 = awjrVar.b();
            if (b2 == null || (b2.b.c & 64) == 0) {
                atyp f = awjrVar.f();
                if (b2 != null && o(f) == 1.0f && (b2.b.c & 16) != 0 && p(b2) && a(b2) == 0) {
                    if ((b2.getOfflineFutureUnplayableInfo().b & 4) == 0) {
                        return amon.a;
                    }
                    atqt atqtVar = b2.getOfflineFutureUnplayableInfo().e;
                    if (atqtVar == null) {
                        atqtVar = atqt.a;
                    }
                    return ampq.j(atqtVar);
                }
            } else {
                return ampq.j(b2.getOnTapCommandOverrideData());
            }
        }
        return amon.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(defpackage.jiq r17, defpackage.atyp r18, defpackage.atss r19) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhz.g(jiq, atyp, atss):java.lang.String");
    }

    public final String h(long j) {
        if (j == 0) {
            return "";
        }
        long c = this.d.c();
        long j2 = c - j;
        if (j2 < 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(c);
        long j3 = ((calendar2.get(1) - calendar.get(1)) * 12) + (calendar2.get(2) - calendar.get(2));
        if (calendar2.get(5) < calendar.get(5)) {
            j3--;
        }
        if (j3 >= 12) {
            return nd.jC(this.c, R.string.years_ago, "count", Long.valueOf(j3 / 12));
        }
        if (j3 > 0) {
            return nd.jC(this.c, R.string.months_ago, "count", Long.valueOf(j3));
        }
        long days = TimeUnit.MILLISECONDS.toDays(j2);
        long j4 = days / 7;
        if (j4 > 0) {
            return nd.jC(this.c, R.string.weeks_ago, "count", Long.valueOf(j4));
        }
        if (days > 0) {
            return nd.jC(this.c, R.string.days_ago, "count", Long.valueOf(days));
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j2);
        if (hours > 0) {
            return nd.jC(this.c, R.string.hours_ago, "count", Long.valueOf(hours));
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
        if (minutes > 0) {
            return nd.jC(this.c, R.string.minutes_ago, "count", Long.valueOf(minutes));
        }
        return nd.jC(this.c, R.string.seconds_ago, "count", Long.valueOf(Math.max(1L, TimeUnit.MILLISECONDS.toSeconds(j2))));
    }

    public final String i(long j, boolean z) {
        int t = ezv.t(j);
        if (t <= 60) {
            if (z) {
                return this.c.getResources().getQuantityString(R.plurals.download_video_unplayable_future_minutes_plural, t, Integer.valueOf(t));
            }
            return this.c.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_minutes_plural, t, Integer.valueOf(t));
        }
        int s = ezv.s(j);
        if (s <= 24) {
            if (z) {
                return this.c.getResources().getQuantityString(R.plurals.download_video_unplayable_future_hours_plural, s, Integer.valueOf(s));
            }
            return this.c.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_hours_plural, s, Integer.valueOf(s));
        }
        int r = ezv.r(j);
        if (z) {
            return this.c.getResources().getQuantityString(R.plurals.download_video_unplayable_future_days_plural, r, Integer.valueOf(r));
        }
        return this.c.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_days_plural, r, Integer.valueOf(r));
    }

    public final boolean j(atyp atypVar, String str, int i, long j) {
        avkp g = atypVar != null ? atypVar.g() : null;
        Iterator it = (g != null ? g.getStreamProgress() : amuk.q()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            auzy auzyVar = (auzy) it.next();
            int aL = awwc.aL(auzyVar.e);
            if (aL != 0 && aL == 3) {
                aqzx aqzxVar = (aqzx) aaqp.c(auzyVar.g.I(), aqzx.b);
                if (aqzxVar == null) {
                    return false;
                }
                if (TimeUnit.MICROSECONDS.toSeconds(((adzz) this.i.get()).a(new FormatStreamModel(aqzxVar, str, TimeUnit.SECONDS.toMillis(i)), 0L)) >= j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k(atss atssVar, aqqv aqqvVar) {
        aqqz e;
        boolean isAfter;
        if (aqqvVar != null && (e = e(aqqvVar)) != null && !e.f) {
            Instant ofEpochMilli = Instant.ofEpochMilli(this.d.c());
            if (aqqvVar.getPlaybackStartSeconds().longValue() > 0) {
                isAfter = ofEpochMilli.isAfter(Instant.ofEpochSecond(aqqvVar.getPlaybackStartSeconds().longValue()).plus(Duration.ofSeconds(e.e)));
            } else {
                isAfter = ofEpochMilli.isAfter(Instant.ofEpochSecond(aqqvVar.getLicenseExpirySeconds().longValue()));
            }
            if (isAfter) {
                return true;
            }
        }
        if (atssVar != null) {
            long c = this.d.c();
            return c > atssVar.getExpirationTimestamp().longValue() || c < (atssVar.getExpirationTimestamp().longValue() - TimeUnit.MILLISECONDS.convert((long) t(atssVar).g, TimeUnit.SECONDS)) - b || (this.m.d() && p(atssVar) && (a(atssVar) > 0L ? 1 : (a(atssVar) == 0L ? 0 : -1)) == 0);
        }
        return false;
    }

    public final boolean l(atss atssVar, aqqv aqqvVar) {
        return atssVar != null && k(atssVar, aqqvVar) && atssVar.getExpirationTimestamp().longValue() + a <= this.d.c();
    }

    public final boolean m(awjr awjrVar) {
        return n(awjrVar.f(), awjrVar.b());
    }

    public final boolean n(atyp atypVar, atss atssVar) {
        auzy auzyVar = null;
        avkp g = atypVar != null ? atypVar.g() : null;
        avkl transferState = g != null ? g.getTransferState() : null;
        asaa asaaVar = s(atypVar).f;
        if (asaaVar == null) {
            asaaVar = asaa.a;
        }
        asaa asaaVar2 = asaaVar;
        List<auzy> streamProgress = g != null ? g.getStreamProgress() : amuk.q();
        if (u(transferState, atssVar, asaaVar2, streamProgress, atypVar != null ? atypVar.b() : null)) {
            return false;
        }
        auzy auzyVar2 = null;
        for (auzy auzyVar3 : streamProgress) {
            int aL = awwc.aL(auzyVar3.e);
            if (aL != 0 && aL == 2) {
                auzyVar = auzyVar3;
            } else {
                int aL2 = awwc.aL(auzyVar3.e);
                if (aL2 != 0 && aL2 == 3) {
                    auzyVar2 = auzyVar3;
                }
            }
        }
        if (auzyVar != null && auzyVar2 != null && auzyVar.c == auzyVar.d) {
            long j = auzyVar2.c;
            if (j > 0 && j < auzyVar2.d) {
                return true;
            }
        }
        return false;
    }
}
