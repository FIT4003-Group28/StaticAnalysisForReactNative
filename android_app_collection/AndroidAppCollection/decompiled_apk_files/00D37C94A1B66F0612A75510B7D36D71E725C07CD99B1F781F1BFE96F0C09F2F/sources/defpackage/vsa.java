package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.video.media.VideoMetaData;
/* compiled from: PG */
/* renamed from: vsa  reason: default package */
/* loaded from: classes4.dex */
public final class vsa {
    private static final amvn a = amvn.t("vide", "soun", "hint");
    private static final amvn b;
    private static final amvn c;

    static {
        amvn u = amvn.u("mp41", "mp42", "3gp4", "qt  ");
        b = u;
        amvl i = amvn.i();
        i.j(u);
        i.c("isom");
        i.c("iso2");
        c = i.g();
    }

    public static VideoMetaData a(Context context, Uri uri) {
        vry a2 = vrz.a();
        a2.c(true);
        return b(context, uri, a2.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0393, code lost:
        r5 = new long[r9];
        r4 = new int[r3.length];
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04c8, code lost:
        if (r4.length <= 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04cd, code lost:
        if (r4[0] != 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04d7, code lost:
        throw new defpackage.vsg("First sync sample is not first frame");
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04df, code lost:
        throw new defpackage.vsg("VideoTrack has no sync samples");
     */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0572 A[Catch: all -> 0x0587, TryCatch #2 {all -> 0x0587, blocks: (B:314:0x053d, B:315:0x0540, B:293:0x04e2, B:334:0x056e, B:336:0x0572, B:342:0x0586, B:338:0x057a, B:340:0x057e, B:341:0x0585, B:316:0x0541, B:317:0x054a, B:318:0x054b, B:319:0x0554, B:320:0x0555, B:321:0x055e), top: B:348:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.libraries.video.media.VideoMetaData b(android.content.Context r35, android.net.Uri r36, defpackage.vrz r37) {
        /*
            Method dump skipped, instructions count: 1423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsa.b(android.content.Context, android.net.Uri, vrz):com.google.android.libraries.video.media.VideoMetaData");
    }

    private static boolean c(cxd cxdVar) {
        return g(cxdVar) && cxdVar.m().l() != null;
    }

    private static boolean d(cxd cxdVar) {
        return e(cxdVar) && cxdVar.l().l() != null;
    }

    private static boolean e(cxd cxdVar) {
        return cxdVar.l() != null;
    }

    private static boolean f(cxd cxdVar) {
        return e(cxdVar) && cxdVar.l().n() != null;
    }

    private static boolean g(cxd cxdVar) {
        return cxdVar.m() != null;
    }
}
