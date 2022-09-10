package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: auqy  reason: default package */
/* loaded from: classes2.dex */
public final class auqy implements auon {
    public static final dcdn<Integer, dcep<String>> a;
    private static final long d = TimeUnit.MINUTES.toMillis(1);
    private static final long e = TimeUnit.DAYS.toMillis(28);
    private static final dcep<String> f;
    private static final dcep<String> g;
    public final dxio<ausy> b;
    final auqx c;
    private final dxio<akfa> h;
    private final Context i;
    private final cqat j;
    private final bvjj k;
    private final auhq l;
    private final dxio<auhg> m;
    private final dxio<auom> n;
    private final auqo o;
    private final dxio<auso> p;
    private final Executor q;
    private final auql r;

    static {
        dcep<String> F = dcep.F("id", "account_id", "read_state", "timestamp_ms", "proto");
        f = F;
        dcen N = dcep.N();
        N.i(F);
        N.b("system_tray_id");
        dcep<String> f2 = N.f();
        g = f2;
        a = dcdn.l(1, F, 2, f2);
    }

    public auqy(dxio dxioVar, Context context, cqat cqatVar, bvjj bvjjVar, auhq auhqVar, auql auqlVar, afec afecVar, dxio dxioVar2, dxio dxioVar3, auqo auqoVar, dxio dxioVar4, Executor executor, dxio dxioVar5) {
        this.h = dxioVar;
        this.i = context;
        this.j = cqatVar;
        this.k = bvjjVar;
        this.l = auhqVar;
        this.r = auqlVar;
        this.m = dxioVar2;
        this.n = dxioVar3;
        this.o = auqoVar;
        this.p = dxioVar4;
        this.q = executor;
        this.c = new auqx(context, afecVar);
        this.b = dxioVar5;
    }

    public static void m(SQLiteDatabase sQLiteDatabase, List<String> list) {
        auqf auqfVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("read_state", (Integer) 2);
        for (String str : list) {
            Cursor query = sQLiteDatabase.query("inboxNotifications", new String[]{"proto"}, "id = ? ", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst() && (auqfVar = (auqf) bvrs.b(query.getBlob(0), (dssr) auqf.l.cu(7))) != null) {
                    auqe ca = auqf.l.ca(auqfVar);
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    auqf auqfVar2 = (auqf) ca.b;
                    auqfVar2.g = 2;
                    auqfVar2.a |= 32;
                    contentValues.put("proto", ca.bK().bS());
                }
                query.close();
                sQLiteDatabase.update("inboxNotifications", contentValues, "id = ? ", new String[]{str});
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    public static List<String> n(List<auqf> list) {
        ArrayList arrayList = new ArrayList();
        for (auqf auqfVar : list) {
            int a2 = auqh.a(auqfVar.g);
            if (a2 != 0 && a2 == 2) {
                arrayList.add(auqfVar.b);
            }
        }
        return arrayList;
    }

    public static synchronized List<auqf> o(SQLiteDatabase sQLiteDatabase, String str) {
        ArrayList arrayList;
        synchronized (auqy.class) {
            Cursor query = sQLiteDatabase.query("inboxNotifications", new String[]{"proto"}, "system_tray_id = ? ", new String[]{str}, null, null, null, null);
            arrayList = new ArrayList();
            while (query.moveToNext()) {
                v(query, arrayList);
            }
            query.close();
        }
        return arrayList;
    }

    public static String q(long j, String str) {
        return String.format("%s|%s", Long.valueOf(j), str);
    }

    private final synchronized void s(String str, boolean z) {
        bvrj.UI_THREAD.d();
        HashSet hashSet = new HashSet(y());
        hashSet.add(str);
        z(hashSet);
        SQLiteDatabase l = l();
        if (l == null) {
            return;
        }
        l.beginTransaction();
        l.delete("inboxNotifications", "id = ? ", new String[]{str});
        l.setTransactionSuccessful();
        l.endTransaction();
        if (!z) {
            return;
        }
        g();
    }

    @dzsi
    private final SQLiteDatabase t() {
        return u(new Callable(this) { // from class: auqv
            private final auqy a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c.a();
            }
        });
    }

    @dzsi
    private static SQLiteDatabase u(Callable<SQLiteDatabase> callable) {
        try {
            return callable.call();
        } catch (Exception e2) {
            bvoo.i(new RuntimeException(e2));
            return null;
        }
    }

    private static void v(Cursor cursor, List<auqf> list) {
        auqf auqfVar = (auqf) bvrs.b(cursor.getBlob(0), (dssr) auqf.l.cu(7));
        if (auqfVar != null) {
            list.add(auqfVar);
        } else {
            new ArrayList().add("message=gmm.InboxNotification");
        }
    }

    private static synchronized boolean w(SQLiteDatabase sQLiteDatabase, String str) {
        synchronized (auqy.class) {
            Cursor query = sQLiteDatabase.query("inboxNotifications", new String[]{"id"}, "id = ? ", new String[]{str}, null, null, null, null);
            if (!query.moveToFirst()) {
                query.close();
                return false;
            }
            query.close();
            query.close();
            return true;
        }
    }

    @dzsi
    private final String x() {
        btlu j = this.h.a().j();
        if (j.l()) {
            return j.j();
        }
        return null;
    }

    private final Set<String> y() {
        return dcep.K(this.k.E(bvjk.K, this.h.a().j(), new HashSet()));
    }

    private final void z(Set<String> set) {
        this.k.ag(bvjk.K, this.h.a().j(), set);
    }

    @Override // defpackage.auon
    public final synchronized List<auqf> a() {
        SQLiteDatabase t;
        Cursor cursor;
        dcdc z;
        final Set<String> y;
        bvrj.UI_THREAD.d();
        ArrayList arrayList = new ArrayList();
        String x = x();
        if (x != null && (t = t()) != null) {
            try {
                t.beginTransaction();
                cursor = t.query("inboxNotifications", new String[]{"proto"}, "account_id = ? ", new String[]{x}, null, null, "timestamp_ms desc");
                while (cursor.moveToNext()) {
                    try {
                        v(cursor, arrayList);
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        t.endTransaction();
                        throw th;
                    }
                }
                t.setTransactionSuccessful();
                if (cursor != null) {
                    cursor.close();
                }
                t.endTransaction();
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        }
        z = dcbg.b(arrayList).o(new dbsl(this) { // from class: auqs
            private final auqy a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Integer num;
                auqy auqyVar = this.a;
                auqf auqfVar = (auqf) obj;
                auqj auqjVar = auqfVar.j;
                if (auqjVar == null) {
                    auqjVar = auqj.d;
                }
                if ((auqjVar.a & 1) != 0) {
                    auqj auqjVar2 = auqfVar.j;
                    if (auqjVar2 == null) {
                        auqjVar2 = auqj.d;
                    }
                    num = Integer.valueOf((int) auqjVar2.b);
                } else {
                    num = null;
                }
                if (num == null || !auqyVar.b.a().a(num.intValue())) {
                    return false;
                }
                return (auqfVar.a & 256) == 0 || auqfVar.i;
            }
        }).z();
        y = y();
        return dcbg.b(z).o(new dbsl(y) { // from class: auqw
            private final Set a;

            {
                this.a = y;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Set set = this.a;
                auqf auqfVar = (auqf) obj;
                dcdn<Integer, dcep<String>> dcdnVar = auqy.a;
                int a2 = auqh.a(auqfVar.g);
                return (a2 == 0 || a2 != 4) && !set.contains(auqfVar.b);
            }
        }).z();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[Catch: all -> 0x0094, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0011, B:8:0x001c, B:10:0x0038, B:13:0x003f, B:15:0x0056, B:20:0x0069, B:24:0x0080, B:19:0x0066, B:14:0x0054), top: B:32:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    @Override // defpackage.auon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(defpackage.augj r20) {
        /*
            r19 = this;
            r14 = r19
            r0 = r20
            monitor-enter(r19)
            java.lang.CharSequence r1 = r0.j     // Catch: java.lang.Throwable -> L94
            dbpy<java.lang.Object> r2 = defpackage.dbpy.a     // Catch: java.lang.Throwable -> L94
            android.app.Notification r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L94
            android.os.Bundle r3 = r2.extras     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L1a
            android.os.Bundle r3 = r2.extras     // Catch: java.lang.Throwable -> L94
            java.lang.String r4 = "android.text"
            java.lang.CharSequence r3 = r3.getCharSequence(r4)     // Catch: java.lang.Throwable -> L94
            goto L1c
        L1a:
            java.lang.String r3 = ""
        L1c:
            java.lang.CharSequence r3 = defpackage.bvpb.b(r3)     // Catch: java.lang.Throwable -> L94
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L94
            aujb r3 = r0.b     // Catch: java.lang.Throwable -> L94
            btlu r4 = r0.h     // Catch: java.lang.Throwable -> L94
            int r5 = r0.a     // Catch: java.lang.Throwable -> L94
            akqi r6 = r0.d     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = r0.e     // Catch: java.lang.Throwable -> L94
            int r8 = r0.W     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = r0.f     // Catch: java.lang.Throwable -> L94
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L94
            r12 = 23
            if (r10 < r12) goto L54
            android.graphics.drawable.Icon r10 = r2.getLargeIcon()     // Catch: java.lang.Throwable -> L94
            if (r10 != 0) goto L3f
            goto L54
        L3f:
            android.graphics.drawable.Icon r2 = r2.getLargeIcon()     // Catch: java.lang.Throwable -> L94
            android.content.Context r10 = r14.i     // Catch: java.lang.Throwable -> L94
            android.graphics.drawable.Drawable r2 = r2.loadDrawable(r10)     // Catch: java.lang.Throwable -> L94
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2     // Catch: java.lang.Throwable -> L94
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch: java.lang.Throwable -> L94
            dspd r2 = r14.c(r2)     // Catch: java.lang.Throwable -> L94
            goto L56
        L54:
            dspd r2 = defpackage.dspd.b     // Catch: java.lang.Throwable -> L94
        L56:
            r10 = r2
            java.lang.CharSequence r1 = defpackage.bvpb.b(r1)     // Catch: java.lang.Throwable -> L94
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L94
            auhx r1 = r0.n     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L66
            r1 = 0
        L64:
            r13 = r1
            goto L69
        L66:
            android.content.Intent r1 = r1.a     // Catch: java.lang.Throwable -> L94
            goto L64
        L69:
            cjtd r15 = r0.c     // Catch: java.lang.Throwable -> L94
            dbpy<java.lang.Object> r1 = defpackage.dbpy.a     // Catch: java.lang.Throwable -> L94
            android.app.Notification r1 = r0.a(r1)     // Catch: java.lang.Throwable -> L94
            long r1 = r1.when     // Catch: java.lang.Throwable -> L94
            boolean r0 = r0.q     // Catch: java.lang.Throwable -> L94
            r17 = r1
            r1 = 1
            if (r1 == r0) goto L7e
            r0 = 2
            r16 = 2
            goto L80
        L7e:
            r16 = 1
        L80:
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r12 = r13
            r13 = r15
            r14 = r17
            r1.i(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r19)
            return
        L94:
            r0 = move-exception
            monitor-exit(r19)
            goto L98
        L97:
            throw r0
        L98:
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auqy.b(augj):void");
    }

    @Override // defpackage.auon
    public final dspd c(@dzsi Bitmap bitmap) {
        if (bitmap == null) {
            return dspd.b;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return dspd.x(byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.auon
    public final void d(String str) {
        s(str, true);
    }

    @Override // defpackage.auon
    public final synchronized void e(List<auqf> list) {
        bvrj.UI_THREAD.d();
        r(false);
        SQLiteDatabase l = l();
        if (l == null) {
            return;
        }
        List<String> n = n(list);
        if (n.isEmpty()) {
            return;
        }
        l.beginTransaction();
        m(l, n);
        l.setTransactionSuccessful();
        l.endTransaction();
    }

    @Override // defpackage.auon
    public final synchronized void f(final int i, @dzsi final String str) {
        this.q.execute(new Runnable(this, i, str) { // from class: auqt
            private final auqy a;
            private final int b;
            private final String c;

            {
                this.a = this;
                this.b = i;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                auqy auqyVar = this.a;
                int i2 = this.b;
                String str2 = this.c;
                SQLiteDatabase l = auqyVar.l();
                if (l == null) {
                    return;
                }
                List<String> n = auqy.n(auqy.o(l, auqy.q(i2, dbsj.e(str2))));
                try {
                    l.beginTransaction();
                    auqy.m(l, n);
                    l.setTransactionSuccessful();
                } finally {
                    l.endTransaction();
                    auqyVar.r(auqyVar.k());
                    auqyVar.g();
                }
            }
        });
    }

    @Override // defpackage.auon
    public final synchronized void g() {
        this.c.close();
    }

    @Override // defpackage.auon
    public final String h(@dzsi int i, @dzsi String str) {
        return auqm.a(4, str);
    }

    @Override // defpackage.auon
    public final synchronized void i(@dzsi aujb aujbVar, @dzsi btlu btluVar, int i, @dzsi akqi akqiVar, @dzsi String str, @dzsi int i2, @dzsi String str2, dspd dspdVar, String str3, String str4, @dzsi Intent intent, cjtd cjtdVar, long j, int i3) {
        dehn a2;
        String str5;
        bvrj.UI_THREAD.d();
        if (!this.n.a().a) {
            return;
        }
        btlu j2 = this.h.a().j();
        btlu btluVar2 = btluVar == null ? j2 : btluVar;
        if (this.m.a().a(aujbVar, btluVar2, str3, i, akqiVar, str, i3) != auhh.SHOWN) {
            return;
        }
        if (aujbVar != null && btluVar2.l()) {
            ((ckco) this.l.a.a(ckfm.m)).a(aujbVar.a);
            try {
                final auqo auqoVar = this.o;
                try {
                    bbo bboVar = new bbo();
                    bboVar.e("worker_name_key", "InboxNotificationStorageExpirationWorker");
                    bbp a3 = bboVar.a();
                    bbk bbkVar = new bbk();
                    bbkVar.c = 1;
                    bbkVar.a = false;
                    final bci f2 = new bch(GmmWorkerWrapper.class, 1L, TimeUnit.DAYS).d("INBOX.DELETE_EXPIRED_NOTIFICATIONS").c(a3).b(bbkVar.a()).f();
                    a2 = deew.h(auqoVar.a.f("INBOX.DELETE_EXPIRED_NOTIFICATIONS", 2, f2).a(), new dbrn(auqoVar, f2) { // from class: auqn
                        private final auqo a;
                        private final bci b;

                        {
                            this.a = auqoVar;
                            this.b = f2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            auqo auqoVar2 = this.a;
                            try {
                                return this.b.a;
                            } catch (RuntimeException e2) {
                                auqoVar2.b.c(10, e2);
                                return bbx.c();
                            }
                        }
                    }, dege.a);
                } catch (RuntimeException e2) {
                    auqoVar.b.c(10, e2);
                    a2 = deha.a(bbx.c());
                }
                a2.get();
                auqe bZ = auqf.l.bZ();
                String a4 = auqm.a(i2, str2);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                auqf auqfVar = (auqf) bZ.b;
                a4.getClass();
                int i4 = auqfVar.a | 1;
                auqfVar.a = i4;
                auqfVar.b = a4;
                auqfVar.a = i4 | 2;
                auqfVar.c = j;
                String charSequence = bvpb.b(str3).toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                auqf auqfVar2 = (auqf) bZ.b;
                charSequence.getClass();
                auqfVar2.a |= 4;
                auqfVar2.d = charSequence;
                String charSequence2 = bvpb.b(str4).toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                auqf auqfVar3 = (auqf) bZ.b;
                charSequence2.getClass();
                int i5 = auqfVar3.a | 8;
                auqfVar3.a = i5;
                auqfVar3.e = charSequence2;
                dspdVar.getClass();
                auqfVar3.a = i5 | 16;
                auqfVar3.f = dspdVar;
                auqf auqfVar4 = (auqf) bZ.b;
                auqfVar4.g = 1;
                auqfVar4.a |= 32;
                if (intent != null) {
                    if (afja.e.a(intent)) {
                        Intent h = afja.h(intent);
                        if (h != null) {
                            dplx b = bvrq.b(h);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            auqf auqfVar5 = (auqf) bZ.b;
                            b.getClass();
                            auqfVar5.h = b;
                            auqfVar5.a |= 128;
                        }
                    } else {
                        dplx b2 = bvrq.b(intent);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        auqf auqfVar6 = (auqf) bZ.b;
                        b2.getClass();
                        auqfVar6.h = b2;
                        auqfVar6.a |= 128;
                    }
                }
                auqi bZ2 = auqj.d.bZ();
                long j3 = i;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                auqj auqjVar = (auqj) bZ2.b;
                int i6 = auqjVar.a | 1;
                auqjVar.a = i6;
                auqjVar.b = j3;
                if (str != null) {
                    str.getClass();
                    auqjVar.a = 2 | i6;
                    auqjVar.c = str;
                }
                auqj bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                auqf auqfVar7 = (auqf) bZ.b;
                bK.getClass();
                auqfVar7.j = bK;
                int i7 = auqfVar7.a | 1024;
                auqfVar7.a = i7;
                if (cjtdVar != null && (str5 = cjtdVar.d) != null) {
                    str5.getClass();
                    auqfVar7.a = i7 | 2048;
                    auqfVar7.k = str5;
                }
                auqf bK2 = bZ.bK();
                Intent h2 = (intent == null || !afja.e.a(intent)) ? intent : afja.h(intent);
                if (h2 == null || (bK2.a & 128) == 0) {
                    return;
                }
                Bundle extras = h2.getExtras();
                int size = extras == null ? 0 : extras.size();
                dplx dplxVar = bK2.h;
                if (dplxVar == null) {
                    dplxVar = dplx.g;
                }
                if (size == dplxVar.f.size() || extras == null) {
                    ContentValues contentValues = new ContentValues();
                    auqj auqjVar2 = bK2.j;
                    if (auqjVar2 == null) {
                        auqjVar2 = auqj.d;
                    }
                    long j4 = auqjVar2.b;
                    auqj auqjVar3 = bK2.j;
                    if (auqjVar3 == null) {
                        auqjVar3 = auqj.d;
                    }
                    String q = q(j4, auqjVar3.c);
                    contentValues.put("id", bK2.b);
                    contentValues.put("system_tray_id", q);
                    contentValues.put("account_id", btluVar2.j());
                    int a5 = auqh.a(bK2.g);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    contentValues.put("read_state", Integer.valueOf(a5 - 1));
                    contentValues.put("timestamp_ms", Long.valueOf(bK2.c));
                    contentValues.put("proto", bK2.bS());
                    SQLiteDatabase l = l();
                    if (l == null) {
                        return;
                    }
                    l.beginTransaction();
                    if (w(l, bK2.b)) {
                        l.update("inboxNotifications", contentValues, "id = ?", new String[]{bK2.b});
                        ((ckco) this.l.a.a(ckfm.k)).a(aujbVar.a);
                    } else {
                        l.insert("inboxNotifications", null, contentValues);
                        r(true);
                        ((ckco) this.l.a.a(ckfm.j)).a(aujbVar.a);
                        this.p.a().d((bK2.a & 2048) != 0 ? bK2.k : "");
                        if (!btluVar2.equals(j2)) {
                            ((ckco) this.l.a.a(ckfm.l)).a(aujbVar.a);
                        }
                    }
                    String str6 = bK2.b;
                    Set<String> y = y();
                    if (y.contains(str6)) {
                        HashSet hashSet = new HashSet(y);
                        hashSet.remove(str6);
                        z(hashSet);
                    }
                    for (auqf auqfVar8 : o(l, q)) {
                        if (!auqfVar8.b.equals(bK2.b) && Math.abs(auqfVar8.c - bK2.c) < d) {
                            s(auqfVar8.b, false);
                        }
                    }
                    l.setTransactionSuccessful();
                    l.endTransaction();
                    g();
                    return;
                }
                auhq auhqVar = this.l;
                ArrayList a6 = dchl.a();
                for (String str7 : extras.keySet()) {
                    Object obj = extras.get(str7);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof byte[]) && !(obj instanceof Integer) && !(obj instanceof Boolean)) {
                        a6.add(obj.getClass().toString());
                    }
                }
                a6.toString();
                ((ckco) auhqVar.a.a(ckfm.i)).a(aujbVar.a);
            } catch (InterruptedException | ExecutionException unused) {
                ((ckcn) this.l.a.a(ckfm.b)).a();
            }
        }
    }

    public final synchronized boolean j() {
        bvrj.UI_THREAD.d();
        long b = this.j.b() - e;
        SQLiteDatabase l = l();
        if (l == null) {
            return false;
        }
        l.delete("inboxNotifications", "timestamp_ms <= ?", new String[]{Long.toString(b)});
        if (p(l)) {
            auqo auqoVar = this.o;
            try {
                auqoVar.a.c("INBOX.DELETE_EXPIRED_NOTIFICATIONS");
            } catch (RuntimeException e2) {
                auqoVar.b.a(10, e2);
            }
        }
        g();
        return true;
    }

    public final synchronized boolean k() {
        bvrj.UI_THREAD.d();
        String x = x();
        if (x == null) {
            return false;
        }
        SQLiteDatabase t = t();
        if (t == null) {
            return false;
        }
        Cursor query = t.query("inboxNotifications", new String[]{"read_state"}, "account_id = ? AND read_state = ?", new String[]{x, Integer.toString(1)}, null, null, null, "1");
        if (query.moveToFirst()) {
            query.close();
            query.close();
            g();
            return true;
        }
        query.close();
        g();
        return false;
    }

    @dzsi
    public final SQLiteDatabase l() {
        return u(new Callable(this) { // from class: auqu
            private final auqy a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c.b();
            }
        });
    }

    final synchronized boolean p(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("inboxNotifications", new String[]{"id"}, null, null, null, null, null, "1");
        if (!query.moveToFirst()) {
            query.close();
            return true;
        }
        query.close();
        query.close();
        return false;
    }

    public final void r(boolean z) {
        this.k.T(bvjk.kt, this.h.a().j(), z);
        this.r.d(z);
    }
}
