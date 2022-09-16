package defpackage;

import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aigw  reason: default package */
/* loaded from: classes.dex */
public final class aigw implements aeun {
    public volatile ajfq a;
    public final Map c = new HashMap();
    public volatile aihc d;

    public aigw(aynx aynxVar) {
        aypf aypfVar = new aypf();
        aypfVar.d(aynxVar.h(aiwv.l(1)).Z(new aigu(this)));
        aypfVar.d(aiwv.j(aynxVar, ahja.s).Z(new aigu(this, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7 A[Catch: all -> 0x0103, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0012, B:12:0x001a, B:17:0x0028, B:19:0x002e, B:24:0x0039, B:26:0x003d, B:29:0x0043, B:30:0x004d, B:32:0x0053, B:34:0x005f, B:36:0x0076, B:38:0x007c, B:40:0x0084, B:54:0x00b1, B:56:0x00b7, B:57:0x00bc, B:65:0x00ea, B:67:0x00f0, B:68:0x00f7, B:60:0x00c9, B:61:0x00d2, B:63:0x00d8, B:64:0x00e4, B:41:0x0087, B:43:0x008d, B:45:0x0095, B:46:0x0098, B:48:0x009e, B:50:0x00a4, B:52:0x00ac), top: B:82:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9 A[Catch: all -> 0x0103, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0012, B:12:0x001a, B:17:0x0028, B:19:0x002e, B:24:0x0039, B:26:0x003d, B:29:0x0043, B:30:0x004d, B:32:0x0053, B:34:0x005f, B:36:0x0076, B:38:0x007c, B:40:0x0084, B:54:0x00b1, B:56:0x00b7, B:57:0x00bc, B:65:0x00ea, B:67:0x00f0, B:68:0x00f7, B:60:0x00c9, B:61:0x00d2, B:63:0x00d8, B:64:0x00e4, B:41:0x0087, B:43:0x008d, B:45:0x0095, B:46:0x0098, B:48:0x009e, B:50:0x00a4, B:52:0x00ac), top: B:82:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0 A[Catch: all -> 0x0103, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0012, B:12:0x001a, B:17:0x0028, B:19:0x002e, B:24:0x0039, B:26:0x003d, B:29:0x0043, B:30:0x004d, B:32:0x0053, B:34:0x005f, B:36:0x0076, B:38:0x007c, B:40:0x0084, B:54:0x00b1, B:56:0x00b7, B:57:0x00bc, B:65:0x00ea, B:67:0x00f0, B:68:0x00f7, B:60:0x00c9, B:61:0x00d2, B:63:0x00d8, B:64:0x00e4, B:41:0x0087, B:43:0x008d, B:45:0x0095, B:46:0x0098, B:48:0x009e, B:50:0x00a4, B:52:0x00ac), top: B:82:0x0001 }] */
    @Override // defpackage.aeun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.net.Uri a(com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r5, long r6, long r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aigw.a(com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel, long, long):android.net.Uri");
    }

    public final synchronized void b(ahgb ahgbVar) {
        if (ahgbVar == null) {
            return;
        }
        ahga e = ahgbVar.e();
        String d = e != null ? e.a.d("Serialized-State") : null;
        if (d == null || ahgbVar.b() <= 0) {
            return;
        }
        aigv aigvVar = (aigv) Map.EL.computeIfAbsent(this.c, Long.valueOf(ahgbVar.b()), adgi.p);
        if (ahgbVar.h()) {
            aigvVar.a = d;
        } else if (!ahgbVar.g()) {
            aigvVar.c = d;
        } else {
            aigvVar.b = d;
        }
    }
}
