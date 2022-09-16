package defpackage;

import android.media.MediaDrm;
import android.media.ResourceBusyException;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$DrmProvisionException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afgz  reason: default package */
/* loaded from: classes.dex */
public final class afgz {
    private final yrj a;
    private final snc b;
    private final afjz c;

    public afgz(afjz afjzVar, yrj yrjVar, snc sncVar) {
        this.c = afjzVar;
        this.a = yrjVar;
        this.b = sncVar;
    }

    public static afkn a(Exception exc, long j, afkl afklVar, String str, String str2, boolean z) {
        String str3;
        Exception exc2;
        Exception exc3 = (!(exc instanceof pod) || (exc2 = (Exception) exc.getCause()) == null) ? exc : exc2;
        if (exc3 instanceof aesf) {
            aesf aesfVar = (aesf) exc3;
            aesg aesgVar = aesfVar.a;
            Throwable cause = aesfVar.getCause();
            boolean z2 = aesfVar.c;
            afkn afknVar = new afkn(afkl.DRM, "", j, aesfVar);
            if (aesgVar != null) {
                afkk afkkVar = new afkk("auth", j);
                afkkVar.a = afkl.DRM;
                afkkVar.c = aesfVar;
                afkkVar.d = aesgVar;
                return afkkVar.a();
            } else if (cause instanceof cff) {
                return afmg.aX(j, cause, z2, afknVar);
            } else {
                if (!(cause instanceof aart)) {
                    return afknVar;
                }
                Throwable cause2 = cause.getCause();
                return !(cause2 instanceof cff) ? afknVar : afmg.aX(j, cause2, z2, afknVar);
            }
        } else if (exc3 instanceof WidevineHelper$DrmProvisionException) {
            Throwable cause3 = exc3.getCause();
            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                String valueOf = String.valueOf(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                return new afkn(afkl.DRM, "provision", j, valueOf.length() != 0 ? "info.".concat(valueOf) : new String("info."));
            }
            return new afkn(afkl.DRM, "provision", j, cause3);
        } else if (exc3 instanceof MediaDrm.MediaDrmStateException) {
            String diagnosticInfo = ((MediaDrm.MediaDrmStateException) exc3).getDiagnosticInfo();
            String str4 = true != z ? "d." : "init;d.";
            afkl afklVar2 = afkl.DRM;
            String valueOf2 = String.valueOf(diagnosticInfo);
            return new afkn(afklVar2, "unavailable", j, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), exc3, null);
        } else if (exc3 instanceof ResourceBusyException) {
            return new afkn(afkl.DRM, "unavailable", j, true != z ? null : "init", exc3, null);
        } else if (!str.equals("unimplemented") || str2 == null) {
            afkk afkkVar2 = new afkk(str, j);
            afkkVar2.c = exc3;
            afkkVar2.b = str2;
            afkkVar2.a = afklVar;
            return afkkVar2.a();
        } else {
            if (exc3.getCause() != null) {
                String valueOf3 = String.valueOf(afjt.a(exc3.getCause()));
                str3 = valueOf3.length() != 0 ? ";exception.".concat(valueOf3) : new String(";exception.");
            } else {
                str3 = "";
            }
            afkl afklVar3 = afkl.DRM;
            String valueOf4 = String.valueOf(str3);
            return new afkn(afklVar3, "unimplemented", j, valueOf4.length() != 0 ? str2.concat(valueOf4) : new String(str2));
        }
    }

    public static afkn d(afkl afklVar, aegw aegwVar, VideoStreamingData videoStreamingData, long j) {
        String f = afjt.f(aegwVar, true, 6);
        if (videoStreamingData != null) {
            if (videoStreamingData.o.isEmpty() && videoStreamingData.p.isEmpty()) {
                f = String.valueOf(f).concat(";c.invalidStreamingData");
            } else {
                String str = videoStreamingData.k != null ? "1" : "0";
                String m = agpr.m(videoStreamingData.D());
                String p = VideoStreamingData.p(videoStreamingData.o);
                String p2 = VideoStreamingData.p(videoStreamingData.p);
                int length = String.valueOf(f).length();
                int length2 = str.length();
                StringBuilder sb = new StringBuilder(length + 21 + length2 + m.length() + String.valueOf(p).length() + String.valueOf(p2).length());
                sb.append(f);
                sb.append(";mani.");
                sb.append(str);
                sb.append(";o.");
                sb.append(m);
                sb.append(";prog.");
                sb.append(p);
                sb.append(";adap.");
                sb.append(p2);
                f = sb.toString();
            }
        }
        afkk afkkVar = new afkk("fmt.noneavailable", j);
        afkkVar.b = f;
        afkkVar.a = afklVar;
        return afkkVar.a();
    }

    private final boolean f(VideoStreamingData videoStreamingData) {
        if (videoStreamingData == null) {
            return false;
        }
        long d = this.b.d();
        return !videoStreamingData.A(d) && d - videoStreamingData.f < TimeUnit.SECONDS.toMillis((long) this.c.g());
    }

    public final afkn b(IOException iOException) {
        return c(afkl.DEFAULT, iOException, null, null, null, 0L, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
        if ((r17 instanceof defpackage.pjq) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afkn c(defpackage.afkl r16, java.io.IOException r17, defpackage.ppr r18, defpackage.ppw r19, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r20, long r21, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgz.c(afkl, java.io.IOException, ppr, ppw, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, long, boolean, boolean):afkn");
    }

    public final boolean e(atg atgVar, VideoStreamingData videoStreamingData) {
        int i = atgVar.d;
        return (i == 400 || i == 410 || i == 416 || i == 403 || i == 404) && videoStreamingData != null && !f(videoStreamingData);
    }
}
