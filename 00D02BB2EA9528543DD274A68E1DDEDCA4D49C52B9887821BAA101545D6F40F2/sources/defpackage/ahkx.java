package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahkx  reason: default package */
/* loaded from: classes2.dex */
final class ahkx implements Runnable {
    public final Context b;
    public final bvrb c;
    public boolean d;
    volatile boolean e;
    public volatile LocationManager f;
    private final ahjt j = new ahjt();
    private final btrm k;
    private final boolean l;
    private static final Uri g = Uri.parse("content://com.google.settings/partner");
    private static final String[] h = {"value"};
    private static final String[] i = {"use_location_for_services"};
    public static final bvrj a = bvrj.BACKGROUND_THREADPOOL;

    public ahkx(Context context, bvrb bvrbVar, btpc btpcVar, btrm btrmVar) {
        this.b = context.getApplicationContext();
        this.c = bvrbVar;
        this.l = btpcVar.k();
        this.k = btrmVar;
    }

    private final boolean b(String str) {
        List<String> allProviders = this.f != null ? this.f.getAllProviders() : null;
        return allProviders != null && allProviders.contains(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(10:3|4|(1:(1:31))(2:8|9)|11|12|13|f6|(1:21)|22|23)|33|34|(1:85)(2:38|(1:40)(1:84))|41|(1:43)(3:74|75|(1:83)(2:79|(1:81)(1:82)))|44|45|(1:70)(2:49|(1:51)(2:53|(1:55)(2:56|(1:69)(4:60|61|(2:63|(1:65))|67))))|52|13|f6) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r2 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        r0 = defpackage.ahjs.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
        r1 = defpackage.ahjs.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x008c -> B:93:0x008e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkx.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            a();
            this.c.a(this, a, 5000L);
        }
    }
}
