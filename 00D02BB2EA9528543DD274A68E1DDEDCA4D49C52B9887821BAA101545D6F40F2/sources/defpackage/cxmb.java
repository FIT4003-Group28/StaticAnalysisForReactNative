package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cxmb  reason: default package */
/* loaded from: classes5.dex */
public final class cxmb<T> implements dbty<T> {
    public static final /* synthetic */ int a = 0;
    private static volatile cxkg h = new cxkg(cxma.a);
    private final String b;
    private final String c;
    private final T d;
    private cxkv<T> e;
    private final Object f = new Object();
    private volatile T g;

    public cxmb(String str, String str2, T t, cxkv<T> cxkvVar) {
        dbsk.s(t);
        this.b = str;
        this.c = str2;
        this.d = t;
        this.e = cxkvVar;
    }

    @Override // defpackage.dbty
    public final T a() {
        return d(cxji.b());
    }

    public final T b(Context context) {
        Context applicationContext = context.getApplicationContext();
        dbsk.s(applicationContext);
        return d(new cxji(applicationContext));
    }

    public final T c(cxji cxjiVar) {
        dbsk.s(cxjiVar);
        return d(cxjiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #4 {, blocks: (B:8:0x000a, B:10:0x000e, B:11:0x0010, B:13:0x0012, B:15:0x0022, B:16:0x0056, B:19:0x005e, B:28:0x0070, B:30:0x007a, B:31:0x008d, B:44:0x00c6, B:47:0x00ce, B:57:0x00e1, B:59:0x00e7, B:62:0x00f9, B:64:0x0102, B:67:0x010b, B:68:0x0111, B:70:0x0115, B:71:0x0117, B:72:0x0119, B:34:0x0097, B:37:0x00a9, B:39:0x00b3, B:42:0x00bc, B:43:0x00c2, B:20:0x005f, B:22:0x0063, B:23:0x006b, B:48:0x00cf, B:50:0x00d3, B:51:0x00d9, B:52:0x00db), top: B:84:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115 A[Catch: all -> 0x011d, TryCatch #4 {, blocks: (B:8:0x000a, B:10:0x000e, B:11:0x0010, B:13:0x0012, B:15:0x0022, B:16:0x0056, B:19:0x005e, B:28:0x0070, B:30:0x007a, B:31:0x008d, B:44:0x00c6, B:47:0x00ce, B:57:0x00e1, B:59:0x00e7, B:62:0x00f9, B:64:0x0102, B:67:0x010b, B:68:0x0111, B:70:0x0115, B:71:0x0117, B:72:0x0119, B:34:0x0097, B:37:0x00a9, B:39:0x00b3, B:42:0x00bc, B:43:0x00c2, B:20:0x005f, B:22:0x0063, B:23:0x006b, B:48:0x00cf, B:50:0x00d3, B:51:0x00d9, B:52:0x00db), top: B:84:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final T d(final defpackage.cxji r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxmb.d(cxji):java.lang.Object");
    }
}
