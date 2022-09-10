package defpackage;

import android.app.Application;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cdgj  reason: default package */
/* loaded from: classes4.dex */
public final class cdgj {
    static final Pattern a = Pattern.compile("^.*(screenshot|download).*$", 2);
    static final Pattern b = Pattern.compile("^.*(?:Snapchat|Instagram).*$", 2);
    static final String c;
    static final String d;
    public static final /* synthetic */ int e = 0;
    private Uri f = Uri.EMPTY;
    private final ckcw g;
    private final btvo h;
    private final cqat i;
    private final bbtk j;
    private final bbtt k;
    private final bttf l;
    private final dxio<akfa> m;
    private final cdgo n;
    private final aese o;
    private final axru p;
    private final Application q;
    private final cdgq r;
    private final dxio<apni> s;
    private final dxio<cdha> t;
    private final cdhc u;
    private final dxio<bzui> v;
    private final cdir w;

    static {
        String valueOf = String.valueOf(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append("/");
        c = sb.toString();
        String valueOf2 = String.valueOf(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
        sb2.append(valueOf2);
        sb2.append("/");
        d = sb2.toString();
    }

    public cdgj(aese aeseVar, cqat cqatVar, bttf bttfVar, ckcw ckcwVar, btvo btvoVar, bbtk bbtkVar, bbtt bbttVar, cdgo cdgoVar, dxio dxioVar, axru axruVar, Application application, cdgq cdgqVar, cdir cdirVar, dxio dxioVar2, dxio dxioVar3, cdhc cdhcVar, dxio dxioVar4) {
        this.o = aeseVar;
        this.i = cqatVar;
        this.l = bttfVar;
        this.g = ckcwVar;
        this.h = btvoVar;
        this.j = bbtkVar;
        this.k = bbttVar;
        this.n = cdgoVar;
        this.m = dxioVar;
        this.p = axruVar;
        this.q = application;
        this.r = cdgqVar;
        this.w = cdirVar;
        this.s = dxioVar2;
        this.t = dxioVar3;
        this.u = cdhcVar;
        this.v = dxioVar4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(@dzsi String str) {
        if (str == null) {
            return false;
        }
        if (b.matcher(str).matches()) {
            return true;
        }
        return str.contains("/DCIM/") && !a.matcher(str).matches();
    }

    public static boolean b(Uri uri) {
        return uri.toString().startsWith(c);
    }

    public static boolean c(Uri uri) {
        return uri.toString().startsWith(d);
    }

    private final dvls g() {
        return this.h.getPhotoTakenNotificationParameters();
    }

    public final void d(cdgi cdgiVar, Uri uri) {
        if (this.f.equals(uri)) {
            return;
        }
        this.f = uri;
        ArrayList<cdgp> a2 = dchl.a();
        for (cdgp cdgpVar : this.r.a()) {
            if (cdgpVar.a()) {
                a2.add(cdgpVar);
            }
        }
        if (!e(a2)) {
            return;
        }
        cdgiVar.a(this.i.b() + TimeUnit.SECONDS.toMillis(g().d));
        cdhe f = f(uri);
        cdgiVar.b();
        for (cdgp cdgpVar2 : a2) {
            cdgpVar2.b(f);
        }
    }

    public final boolean e(List<cdgp> list) {
        btlu btluVar = btlu.a;
        if (this.l.b()) {
            btluVar = this.m.a().k();
        }
        boolean z = false;
        boolean booleanValue = ((Boolean) deha.s(this.n.c(btluVar, false))).booleanValue();
        if (!booleanValue || !list.isEmpty()) {
            z = booleanValue;
        } else {
            ((ckco) this.g.a(ckdz.i)).a(ckdv.NO_ACTIVE_PHOTO_TAKEN_SUBSCRIBERS.o);
        }
        ((ckco) this.g.a(ckdz.g)).a((z ? 1 : 2) - 1);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0128 A[Catch: InterruptedException | ExecutionException -> 0x0195, all -> 0x01a7, TryCatch #1 {all -> 0x01a7, blocks: (B:17:0x00ad, B:33:0x011a, B:35:0x0128, B:36:0x012a, B:38:0x012e, B:40:0x0136, B:44:0x0140, B:46:0x0144, B:47:0x0146, B:50:0x014c, B:52:0x0152, B:53:0x0154, B:54:0x015e, B:55:0x016a, B:57:0x0170, B:58:0x017d, B:23:0x00c8, B:25:0x00cc, B:27:0x00d1, B:29:0x00ec, B:32:0x0110, B:26:0x00cf, B:66:0x0198), top: B:75:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144 A[Catch: InterruptedException | ExecutionException -> 0x0195, all -> 0x01a7, TryCatch #1 {all -> 0x01a7, blocks: (B:17:0x00ad, B:33:0x011a, B:35:0x0128, B:36:0x012a, B:38:0x012e, B:40:0x0136, B:44:0x0140, B:46:0x0144, B:47:0x0146, B:50:0x014c, B:52:0x0152, B:53:0x0154, B:54:0x015e, B:55:0x016a, B:57:0x0170, B:58:0x017d, B:23:0x00c8, B:25:0x00cc, B:27:0x00d1, B:29:0x00ec, B:32:0x0110, B:26:0x00cf, B:66:0x0198), top: B:75:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152 A[Catch: InterruptedException | ExecutionException -> 0x0195, all -> 0x01a7, TryCatch #1 {all -> 0x01a7, blocks: (B:17:0x00ad, B:33:0x011a, B:35:0x0128, B:36:0x012a, B:38:0x012e, B:40:0x0136, B:44:0x0140, B:46:0x0144, B:47:0x0146, B:50:0x014c, B:52:0x0152, B:53:0x0154, B:54:0x015e, B:55:0x016a, B:57:0x0170, B:58:0x017d, B:23:0x00c8, B:25:0x00cc, B:27:0x00d1, B:29:0x00ec, B:32:0x0110, B:26:0x00cf, B:66:0x0198), top: B:75:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170 A[Catch: InterruptedException | ExecutionException -> 0x0195, all -> 0x01a7, LOOP:0: B:55:0x016a->B:57:0x0170, LOOP_END, TryCatch #1 {all -> 0x01a7, blocks: (B:17:0x00ad, B:33:0x011a, B:35:0x0128, B:36:0x012a, B:38:0x012e, B:40:0x0136, B:44:0x0140, B:46:0x0144, B:47:0x0146, B:50:0x014c, B:52:0x0152, B:53:0x0154, B:54:0x015e, B:55:0x016a, B:57:0x0170, B:58:0x017d, B:23:0x00c8, B:25:0x00cc, B:27:0x00d1, B:29:0x00ec, B:32:0x0110, B:26:0x00cf, B:66:0x0198), top: B:75:0x00ad }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cdhe f(android.net.Uri r26) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdgj.f(android.net.Uri):cdhe");
    }
}
