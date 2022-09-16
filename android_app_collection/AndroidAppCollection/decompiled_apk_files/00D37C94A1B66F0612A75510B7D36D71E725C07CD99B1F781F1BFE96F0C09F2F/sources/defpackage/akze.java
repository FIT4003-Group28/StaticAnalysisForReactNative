package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: akze  reason: default package */
/* loaded from: classes.dex */
public final class akze {
    private final aadd a;

    public akze(aadd aaddVar) {
        this.a = aaddVar;
    }

    public final void a(String str) {
        b(str, null);
    }

    public final void b(String str, Throwable th) {
        c(str, th, null);
    }

    public final void c(String str, Throwable th, alcu alcuVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        avvf avvfVar = this.a.a().h;
        if (avvfVar == null) {
            avvfVar = avvf.a;
        }
        String str2 = avvfVar.p;
        if (true == TextUtils.isEmpty(str2)) {
            str2 = "youtubeUploadService::";
        }
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        if (alcuVar != null) {
            sb.append(" UploadType: ");
            sb.append(alcuVar.g);
        }
        if (th != null) {
            zep.o("UploadEcatcherReporter", sb.toString(), th);
        } else {
            zep.m("UploadEcatcherReporter", sb.toString());
        }
        if (alcuVar == alcu.REELS_UPLOAD) {
            avvf avvfVar2 = this.a.a().h;
            if (avvfVar2 == null) {
                avvfVar2 = avvf.a;
            }
            i = avvfVar2.n;
        } else if (th instanceof akzh) {
            akzh akzhVar = (akzh) th;
            if (akzhVar.a == avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNHANDLED_EXCEPTION || akzhVar.a == avun.UPLOAD_PROCESSOR_FAILURE_REASON_SOURCE_FAILED) {
                avvf avvfVar3 = this.a.a().h;
                if (avvfVar3 == null) {
                    avvfVar3 = avvf.a;
                }
                i = avvfVar3.o;
            } else {
                avvf avvfVar4 = this.a.a().h;
                if (avvfVar4 == null) {
                    avvfVar4 = avvf.a;
                }
                i = avvfVar4.m;
            }
        } else {
            avvf avvfVar5 = this.a.a().h;
            if (avvfVar5 == null) {
                avvfVar5 = avvf.a;
            }
            i = avvfVar5.m;
        }
        if (i == 0) {
            return;
        }
        double random = Math.random();
        double d = i;
        Double.isNaN(d);
        if (Math.floor(random * d) != 0.0d) {
            return;
        }
        if (th != null) {
            afus.c(1, 9, sb.toString(), th);
        } else {
            afus.b(1, 9, sb.toString());
        }
    }
}
