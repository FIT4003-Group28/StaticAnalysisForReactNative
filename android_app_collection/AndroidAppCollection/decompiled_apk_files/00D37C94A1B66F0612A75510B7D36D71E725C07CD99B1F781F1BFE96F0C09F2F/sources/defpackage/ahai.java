package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteFullException;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ahai  reason: default package */
/* loaded from: classes.dex */
public final class ahai {
    public final Context a;
    public final aiix b;
    public final aahf c;
    public final azqb d;
    private final snc e;
    private final ahdl f;
    private final aadd g;
    private final abeb h;
    private final abec i;
    private final agkr j;
    private final azqb k;
    private final aacz l;
    private final ahde m;

    public ahai(Context context, snc sncVar, ahdl ahdlVar, aacz aaczVar, aadd aaddVar, abeb abebVar, abec abecVar, agkr agkrVar, ahde ahdeVar, azqb azqbVar, aiix aiixVar, aahf aahfVar, azqb azqbVar2) {
        this.a = context;
        this.e = sncVar;
        this.f = ahdlVar;
        this.l = aaczVar;
        this.g = aaddVar;
        this.h = abebVar;
        this.i = abecVar;
        this.j = agkrVar;
        this.m = ahdeVar;
        this.k = azqbVar;
        this.b = aiixVar;
        this.c = aahfVar;
        this.d = azqbVar2;
    }

    public static String b(String str) {
        return aakj.f(120, str);
    }

    public static final void d(String str, String str2, String str3, aegk aegkVar, agql agqlVar, long j, agmc agmcVar, String str4, afjk afjkVar, afjk afjkVar2, agvw agvwVar) {
        long b;
        if (agqlVar.i()) {
            afjkVar2.c(j);
            return;
        }
        long b2 = agqlVar.b() - agqlVar.d;
        if (str4 != null) {
            aghe b3 = ((agrf) agvwVar.c.get()).a().b();
            if (b3 == null) {
                b = 0;
            } else {
                File e = b3.e(str4);
                b = e == null ? agvwVar.b() : agvwVar.c(e);
            }
        } else {
            b = agvwVar.b();
        }
        if (b <= b2) {
            throw new agxh(b2);
        }
        String.format(Locale.US, "[Offline] pudl task[%s] start stream<%d> uri<%s> download", str2, Integer.valueOf(agqlVar.a()), agqlVar.b.d);
        if (str4 != null) {
            agmcVar.g(str, agqlVar.a(), str4);
        }
        try {
            aegkVar.b(agqlVar.b, 0L, j, str3, afjkVar, afjkVar2);
        } catch (atg e2) {
            if (e2.d == 403) {
                throw new ahae();
            }
            throw e2;
        }
    }

    public static final void e(String str, String str2, PlayerResponseModel playerResponseModel, aglj agljVar, long j, aanz aanzVar) {
        if (agljVar.p(str2) == null) {
            throw agxq.a("Video not found in database", null, agqe.FAILED_UNKNOWN, atsg.OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE);
        }
        try {
            if (agljVar.G(str2, playerResponseModel, j, true, aanzVar)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53);
            sb.append("[Offline] pudl task[");
            sb.append(str);
            sb.append("] failed to save player response.");
            zep.b(sb.toString());
            throw agxq.b("Fail to save playerResponse", null, agqe.FAILED_UNKNOWN, atsg.OFFLINE_DATABASE_ERROR);
        } catch (SQLiteFullException e) {
            throw agxq.b("Error trying to write to local disk.", e, agqe.DISK_IO_ERROR, atsg.OFFLINE_DATABASE_ERROR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.aglj r7, defpackage.agpk r8, defpackage.agqz r9) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahai.f(aglj, agpk, agqz):void");
    }

    public static final void i(String str, PlayerResponseModel playerResponseModel) {
        if (!ahdl.i(playerResponseModel)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
            sb.append("[Offline] pudl task[");
            sb.append(str);
            sb.append("] received actionable playability error.");
            zep.l(sb.toString());
            throw agxq.a("Playability error", null, agqe.CANNOT_OFFLINE, atsg.NOT_PLAYABLE);
        } else if (ahdl.h(playerResponseModel)) {
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51);
            sb2.append("[Offline] pudl task[");
            sb2.append(str);
            sb2.append("] received offline state error.");
            zep.b(sb2.toString());
            throw agxq.a("Offline state error", null, agqe.CANNOT_OFFLINE, atsg.NOT_OFFLINABLE);
        }
    }

    private final FormatStreamModel j(FormatStreamModel formatStreamModel, VideoStreamingData videoStreamingData) {
        FormatStreamModel h = videoStreamingData.h(formatStreamModel.e(), formatStreamModel.w());
        if (h != null) {
            return this.f.a(h);
        }
        return null;
    }

    private final agql k(agql agqlVar, FormatStreamModel formatStreamModel, agmc agmcVar, String str) {
        if (agqlVar != null) {
            FormatStreamModel formatStreamModel2 = agqlVar.b;
            if (formatStreamModel == null || formatStreamModel.j() != formatStreamModel2.j() || formatStreamModel.k() != formatStreamModel2.k() || formatStreamModel.e() != formatStreamModel2.e() || !TextUtils.equals(formatStreamModel.w(), formatStreamModel2.w())) {
                agmcVar.c(str, agqlVar.a());
                agqlVar = null;
            }
        }
        if (formatStreamModel != null) {
            if (agqlVar == null) {
                boolean contains = aank.b().contains(Integer.valueOf(formatStreamModel.e()));
                long c = this.e.c();
                agqk e = agql.e();
                e.d(formatStreamModel);
                e.b(contains);
                e.c(0L);
                e.g(0);
                e.h(c);
                agql a = e.a();
                agmcVar.d(a);
                return a;
            }
            agqk d = agqlVar.d();
            d.d(formatStreamModel);
            return d.a();
        }
        return agqlVar;
    }

    public final agxq a(IOException iOException) {
        if (iOException instanceof aegp) {
            return agxq.b("Error network timed out", iOException, agqe.NETWORK_READ_ERROR, atsg.OFFLINE_NETWORK_ERROR);
        }
        if ((iOException instanceof ate) || (iOException instanceof SocketTimeoutException)) {
            return agxq.b("Error reading from network", iOException, agqe.NETWORK_READ_ERROR, atsg.OFFLINE_NETWORK_ERROR);
        }
        if ((iOException instanceof axn) || (iOException instanceof pds)) {
            aadd aaddVar = this.g;
            if (aaddVar != null && aaddVar.a() != null && (aaddVar.a().b & 512) != 0) {
                atqv atqvVar = aaddVar.a().g;
                if (atqvVar == null) {
                    atqvVar = atqv.a;
                }
                if (atqvVar.x) {
                    return agxq.a("Error trying to read from or write to local disk.", iOException, agqe.DISK_IO_ERROR, atsg.OFFLINE_DISK_ERROR);
                }
            }
            return agxq.b("Error trying to read from or write to local disk.", iOException, agqe.DISK_IO_ERROR, atsg.OFFLINE_DISK_ERROR);
        } else if (iOException instanceof pdf) {
            aadd aaddVar2 = this.g;
            if (aaddVar2 != null && aaddVar2.a() != null && (aaddVar2.a().b & 512) != 0) {
                atqv atqvVar2 = aaddVar2.a().g;
                if (atqvVar2 == null) {
                    atqvVar2 = atqv.a;
                }
                if (atqvVar2.y) {
                    return agxq.a("Error trying to read from or write to local disk.", iOException, agqe.DISK_IO_ERROR, atsg.OFFLINE_DISK_ERROR);
                }
            }
            return agxq.b("Error trying to read from or write to local disk.", iOException, agqe.DISK_IO_ERROR, atsg.OFFLINE_DISK_ERROR);
        } else if (iOException instanceof agxh) {
            return agxq.b("Out of storage error.", iOException, agqe.NO_STORAGE_ERROR, atsg.NO_OFFLINE_STORAGE);
        } else {
            if (iOException instanceof agxk) {
                return ((agxk) iOException).a();
            }
            if (iOException instanceof pdc) {
                aadd aaddVar3 = this.g;
                if (aaddVar3 != null && aaddVar3.a() != null && (aaddVar3.a().b & 512) != 0) {
                    atqv atqvVar3 = aaddVar3.a().g;
                    if (atqvVar3 == null) {
                        atqvVar3 = atqv.a;
                    }
                    if (atqvVar3.z) {
                        return agxq.a("Error trying to read from or write to local disk.", iOException, agqe.DISK_IO_ERROR, atsg.OFFLINE_DISK_ERROR);
                    }
                }
                return agxq.b("Error trying to read from or write to local disk.", iOException, agqe.DISK_IO_ERROR, atsg.OFFLINE_DISK_ERROR);
            }
            zep.d("[Offline] unknown pudl error", iOException);
            return agxq.b("Error trying to download video for offline.", iOException, agqe.DISK_IO_ERROR, atsg.OFFLINE_DISK_ERROR);
        }
    }

    public final void c(String str, String str2, aglj agljVar, agxo agxoVar) {
        atqk n = ahdf.n(this.l);
        if (n != null && n.b) {
            try {
                abed b = this.i.b();
                b.v(str2);
                b.i();
                WatchNextResponseModel d = this.h.d(b);
                if (agljVar.p(str2) == null) {
                    throw agxq.a("Video not found in database", null, agqe.FAILED_UNKNOWN, atsg.OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE);
                }
                try {
                    if (agljVar.I(str2, d)) {
                        agxz a = agya.a(15);
                        a.f(str);
                        ((agyb) agxoVar).p(a.a());
                        return;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
                    sb.append("[Offline] pudl task[");
                    sb.append(str);
                    sb.append("] failed to save watchNextResponse.");
                    zep.b(sb.toString());
                    throw agxq.b("Fail to save watchNextResponse", null, agqe.FAILED_UNKNOWN, atsg.OFFLINE_DATABASE_ERROR);
                } catch (SQLiteFullException e) {
                    throw agxq.b("Error trying to write to local disk.", e, agqe.DISK_IO_ERROR, atsg.OFFLINE_DATABASE_ERROR);
                }
            } catch (aart e2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 60);
                sb2.append("[Offline] pudl task[");
                sb2.append(str);
                sb2.append("] failed to retrieve watch next response");
                zep.d(sb2.toString(), e2);
                throw agxq.b("Cannot retrieve watch next response from the server.", e2, agqe.NETWORK_READ_ERROR, atsg.OFFLINE_NETWORK_ERROR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r2 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r3 == null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.agqm g(int r17, int r18, java.lang.String r19, java.lang.String r20, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r21, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r22, defpackage.agmc r23) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahai.g(int, int, java.lang.String, java.lang.String, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, agmc):agqm");
    }

    public final PlayerResponseModel h(String str, byte[] bArr, agqz agqzVar, int i) {
        try {
            return this.f.l(str, i, bArr);
        } catch (aart e) {
            String str2 = agqzVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
            sb.append("[Offline] pudl task[");
            sb.append(str2);
            sb.append("] failed to retrieve player response");
            zep.d(sb.toString(), e);
            throw agxq.b("Cannot retrieve player response from the server.", e, agqe.NETWORK_READ_ERROR, atsg.OFFLINE_NETWORK_ERROR);
        }
    }
}
