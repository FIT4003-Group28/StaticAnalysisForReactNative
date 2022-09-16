package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vdg  reason: default package */
/* loaded from: classes4.dex */
public final class vdg implements amqo {
    public static final /* synthetic */ int a = 0;
    private static volatile vcb b = new vcb(vdf.a);
    private final String c;
    private final String d;
    private final Object e;
    private final vcj f;
    private final Object g = new Object();
    private final Map h = new HashMap();

    public vdg(String str, String str2, Object obj, vcj vcjVar) {
        obj.getClass();
        this.c = str;
        this.d = str2;
        this.e = obj;
        this.f = vcjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144 A[Catch: all -> 0x0186, TRY_LEAVE, TryCatch #4 {, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0019, B:13:0x0020, B:15:0x002d, B:17:0x0063, B:19:0x006a, B:20:0x006f, B:22:0x009b, B:24:0x00a9, B:26:0x00bc, B:27:0x00be, B:36:0x00d9, B:38:0x00e8, B:52:0x0123, B:55:0x012b, B:65:0x013e, B:67:0x0144, B:70:0x0155, B:75:0x0161, B:77:0x016b, B:79:0x0176, B:78:0x0170, B:82:0x017d, B:83:0x017f, B:84:0x0184, B:42:0x00fd, B:47:0x010a, B:49:0x0114, B:51:0x011f, B:50:0x0119, B:28:0x00bf, B:30:0x00c3, B:31:0x00d4, B:56:0x012c, B:58:0x0130, B:59:0x0136, B:60:0x0138), top: B:95:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d A[Catch: all -> 0x0186, TryCatch #4 {, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x0019, B:13:0x0020, B:15:0x002d, B:17:0x0063, B:19:0x006a, B:20:0x006f, B:22:0x009b, B:24:0x00a9, B:26:0x00bc, B:27:0x00be, B:36:0x00d9, B:38:0x00e8, B:52:0x0123, B:55:0x012b, B:65:0x013e, B:67:0x0144, B:70:0x0155, B:75:0x0161, B:77:0x016b, B:79:0x0176, B:78:0x0170, B:82:0x017d, B:83:0x017f, B:84:0x0184, B:42:0x00fd, B:47:0x010a, B:49:0x0114, B:51:0x011f, B:50:0x0119, B:28:0x00bf, B:30:0x00c3, B:31:0x00d4, B:56:0x012c, B:58:0x0130, B:59:0x0136, B:60:0x0138), top: B:95:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(final defpackage.vbk r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdg.b(vbk):java.lang.Object");
    }

    public final Object a(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return b(vbk.a(applicationContext));
    }

    @Override // defpackage.amqo
    public final Object get() {
        vbk.c = true;
        Context context = vbk.b;
        if (context != null) {
            return b(vbk.a(context));
        }
        if (vbk.d == null) {
            vbk.d = new Exception();
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
