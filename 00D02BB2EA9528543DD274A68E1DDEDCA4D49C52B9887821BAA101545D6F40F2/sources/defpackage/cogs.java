package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cogs  reason: default package */
/* loaded from: classes5.dex */
public final class cogs implements cogc {
    public final AtomicReference<dgyq> b;
    private final String d;
    private final cohd e;
    private final ExecutorService f;
    private final dgyt g;
    public final Deque<dbsi<dgyq, byte[]>> a = new ArrayDeque();
    public final AtomicInteger c = new AtomicInteger();

    public cogs(cohd cohdVar, String str, dgyt dgytVar, dgyq dgyqVar, ExecutorService executorService) {
        this.f = executorService;
        this.e = cohdVar;
        this.d = str;
        this.g = dgytVar;
        this.b = new AtomicReference<>(dgyqVar);
    }

    @Override // defpackage.cogc
    public final void a(cohh cohhVar) {
        dehn h;
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                h = deha.a(null);
            } else {
                final cohd cohdVar = this.e;
                final String str = this.d;
                final dgyt dgytVar = this.g;
                final dgyq dgyqVar = this.b.get();
                int i = this.g.g;
                final int min = i > 0 ? Math.min(100, i - this.c.get()) : 100;
                h = deew.h(deha.f(new deff(cohdVar, str, dgytVar, dgyqVar, min) { // from class: coha
                    private final cohd a;
                    private final String b;
                    private final dgyt c;
                    private final dgyq d;
                    private final int e;

                    {
                        this.a = cohdVar;
                        this.b = str;
                        this.c = dgytVar;
                        this.d = dgyqVar;
                        this.e = min;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[Catch: all -> 0x025d, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0 A[Catch: all -> 0x025d, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[Catch: all -> 0x025d, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[Catch: all -> 0x025d, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[Catch: all -> 0x025d, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x0183 A[Catch: all -> 0x025d, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x019c A[Catch: all -> 0x025d, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4 A[Catch: all -> 0x024f, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x0246 A[Catch: all -> 0x025d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x025d, blocks: (B:3:0x0012, B:5:0x001e, B:6:0x0023, B:14:0x004e, B:22:0x006a, B:25:0x0076, B:32:0x0094, B:33:0x0099, B:35:0x00a4, B:36:0x00cc, B:38:0x00d0, B:39:0x00d2, B:41:0x00da, B:42:0x00dc, B:56:0x011c, B:62:0x0157, B:64:0x0183, B:65:0x0188, B:67:0x019c, B:68:0x01a1, B:88:0x0246, B:52:0x0106, B:54:0x0112, B:55:0x0114, B:45:0x00e4, B:47:0x00f0, B:48:0x00f2, B:31:0x008e, B:24:0x006e, B:18:0x005b, B:20:0x005f, B:69:0x01a9, B:70:0x01ae, B:72:0x01b4, B:81:0x01eb, B:83:0x01f9, B:84:0x01fe, B:85:0x020b, B:77:0x01c9, B:79:0x01d5, B:80:0x01da, B:86:0x0225), top: B:113:0x0012 }] */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x024b  */
                    @Override // defpackage.deff
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final defpackage.dehn a() {
                        /*
                            Method dump skipped, instructions count: 621
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.coha.a():dehn");
                    }
                }, cohdVar.d), new dbrn(this) { // from class: cogq
                    private final cogs a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        cogs cogsVar = this.a;
                        List list = (List) obj;
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        cogsVar.b.set((dgyq) ((dbsi) list.get(list.size() - 1)).a);
                        cogsVar.c.addAndGet(list.size());
                        synchronized (cogsVar.a) {
                            cogsVar.a.addAll(list);
                        }
                        return null;
                    }
                }, this.f);
            }
        }
        deha.q(h, new cogr(this, cohhVar), this.f);
    }

    @Override // defpackage.cogc
    public final void b() {
    }

    @Override // defpackage.cogc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
