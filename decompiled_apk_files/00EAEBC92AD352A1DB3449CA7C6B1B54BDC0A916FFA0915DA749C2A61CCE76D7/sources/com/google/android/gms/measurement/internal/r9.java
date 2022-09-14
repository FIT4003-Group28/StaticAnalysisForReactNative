package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.e.a.b.d.g.cb;
import c.e.a.b.d.g.hb;
import c.e.a.b.d.g.i1;
import c.e.a.b.d.g.k1;
import c.e.a.b.d.g.l1;
import c.e.a.b.d.g.m1;
import c.e.a.b.d.g.q1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class r9 implements a6 {
    private static volatile r9 x;

    /* renamed from: a  reason: collision with root package name */
    private y4 f7657a;

    /* renamed from: b  reason: collision with root package name */
    private h4 f7658b;

    /* renamed from: c  reason: collision with root package name */
    private e f7659c;

    /* renamed from: d  reason: collision with root package name */
    private k4 f7660d;

    /* renamed from: e  reason: collision with root package name */
    private n9 f7661e;

    /* renamed from: f  reason: collision with root package name */
    private ga f7662f;

    /* renamed from: g  reason: collision with root package name */
    private final v9 f7663g;

    /* renamed from: h  reason: collision with root package name */
    private o7 f7664h;
    private final d5 i;
    private boolean j;
    private boolean k;
    private long l;
    private List<Runnable> m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private FileLock s;
    private FileChannel t;
    private List<Long> u;
    private List<Long> v;
    private long w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g {

        /* renamed from: a  reason: collision with root package name */
        c.e.a.b.d.g.m1 f7665a;

        /* renamed from: b  reason: collision with root package name */
        List<Long> f7666b;

        /* renamed from: c  reason: collision with root package name */
        List<c.e.a.b.d.g.i1> f7667c;

        /* renamed from: d  reason: collision with root package name */
        private long f7668d;

        private a(r9 r9Var) {
        }

        /* synthetic */ a(r9 r9Var, q9 q9Var) {
            this(r9Var);
        }

        private static long a(c.e.a.b.d.g.i1 i1Var) {
            return ((i1Var.r() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.g
        public final void a(c.e.a.b.d.g.m1 m1Var) {
            com.google.android.gms.common.internal.s.a(m1Var);
            this.f7665a = m1Var;
        }

        @Override // com.google.android.gms.measurement.internal.g
        public final boolean a(long j, c.e.a.b.d.g.i1 i1Var) {
            com.google.android.gms.common.internal.s.a(i1Var);
            if (this.f7667c == null) {
                this.f7667c = new ArrayList();
            }
            if (this.f7666b == null) {
                this.f7666b = new ArrayList();
            }
            if (this.f7667c.size() <= 0 || a(this.f7667c.get(0)) == a(i1Var)) {
                long b2 = this.f7668d + i1Var.b();
                if (b2 >= Math.max(0, r.i.a(null).intValue())) {
                    return false;
                }
                this.f7668d = b2;
                this.f7667c.add(i1Var);
                this.f7666b.add(Long.valueOf(j));
                return this.f7667c.size() < Math.max(1, r.j.a(null).intValue());
            }
            return false;
        }
    }

    private r9(w9 w9Var) {
        this(w9Var, null);
    }

    private r9(w9 w9Var, d5 d5Var) {
        this.j = false;
        com.google.android.gms.common.internal.s.a(w9Var);
        this.i = d5.a(w9Var.f7770a, null, null);
        this.w = -1L;
        v9 v9Var = new v9(this);
        v9Var.r();
        this.f7663g = v9Var;
        h4 h4Var = new h4(this);
        h4Var.r();
        this.f7658b = h4Var;
        y4 y4Var = new y4(this);
        y4Var.r();
        this.f7657a = y4Var;
        this.i.a().a(new q9(this, w9Var));
    }

    private final boolean A() {
        y();
        o();
        return i().E() || !TextUtils.isEmpty(i().v());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.B():void");
    }

    private final int a(FileChannel fileChannel) {
        y();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.c().s().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.i.c().v().a("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e2) {
            this.i.c().s().a("Failed to read from channel", e2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.f4 a(com.google.android.gms.measurement.internal.fa r9, com.google.android.gms.measurement.internal.f4 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.a(com.google.android.gms.measurement.internal.fa, com.google.android.gms.measurement.internal.f4, java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    private final fa a(String str) {
        f4 b2 = i().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.u())) {
            this.i.c().A().a("No app data available; dropping", str);
            return null;
        }
        Boolean b3 = b(b2);
        if (b3 == null || b3.booleanValue()) {
            return new fa(str, b2.n(), b2.u(), b2.v(), b2.w(), b2.x(), b2.y(), (String) null, b2.A(), false, b2.r(), b2.f(), 0L, 0, b2.g(), b2.h(), false, b2.o(), b2.i(), b2.z(), b2.j(), (!cb.a() || !this.i.n().e(str, r.o0)) ? null : b2.p());
        }
        this.i.c().s().a("App version does not match; dropping. appId", z3.a(str));
        return null;
    }

    public static r9 a(Context context) {
        com.google.android.gms.common.internal.s.a(context);
        com.google.android.gms.common.internal.s.a(context.getApplicationContext());
        if (x == null) {
            synchronized (r9.class) {
                if (x == null) {
                    x = new r9(new w9(context));
                }
            }
        }
        return x;
    }

    private static void a(i1.a aVar, int i, String str) {
        List<c.e.a.b.d.g.k1> j = aVar.j();
        for (int i2 = 0; i2 < j.size(); i2++) {
            if ("_err".equals(j.get(i2).o())) {
                return;
            }
        }
        k1.a A = c.e.a.b.d.g.k1.A();
        A.a("_err");
        A.a(Long.valueOf(i).longValue());
        k1.a A2 = c.e.a.b.d.g.k1.A();
        A2.a("_ev");
        A2.b(str);
        aVar.a((c.e.a.b.d.g.k1) A.i());
        aVar.a((c.e.a.b.d.g.k1) A2.i());
    }

    private static void a(i1.a aVar, String str) {
        List<c.e.a.b.d.g.k1> j = aVar.j();
        for (int i = 0; i < j.size(); i++) {
            if (str.equals(j.get(i).o())) {
                aVar.b(i);
                return;
            }
        }
    }

    private static void a(m1.a aVar) {
        aVar.b(Long.MAX_VALUE);
        aVar.c(Long.MIN_VALUE);
        for (int i = 0; i < aVar.k(); i++) {
            c.e.a.b.d.g.i1 b2 = aVar.b(i);
            if (b2.r() < aVar.o()) {
                aVar.b(b2.r());
            }
            if (b2.r() > aVar.p()) {
                aVar.c(b2.r());
            }
        }
    }

    private final void a(m1.a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        aa c2 = i().c(aVar.s(), str);
        aa aaVar = (c2 == null || c2.f7177e == null) ? new aa(aVar.s(), "auto", str, this.i.b().a(), Long.valueOf(j)) : new aa(aVar.s(), "auto", str, this.i.b().a(), Long.valueOf(((Long) c2.f7177e).longValue() + j));
        q1.a x2 = c.e.a.b.d.g.q1.x();
        x2.a(str);
        x2.a(this.i.b().a());
        x2.b(((Long) aaVar.f7177e).longValue());
        c.e.a.b.d.g.q1 q1Var = (c.e.a.b.d.g.q1) x2.i();
        boolean z2 = false;
        int a2 = v9.a(aVar, str);
        if (a2 >= 0) {
            aVar.a(a2, q1Var);
            z2 = true;
        }
        if (!z2) {
            aVar.a(q1Var);
        }
        if (j > 0) {
            i().a(aaVar);
            this.i.c().B().a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", aaVar.f7177e);
        }
    }

    private final void a(f4 f4Var) {
        a.e.a aVar;
        y();
        if (!cb.a() || !this.i.n().e(f4Var.l(), r.o0)) {
            if (TextUtils.isEmpty(f4Var.n()) && TextUtils.isEmpty(f4Var.o())) {
                a(f4Var.l(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(f4Var.n()) && TextUtils.isEmpty(f4Var.p()) && TextUtils.isEmpty(f4Var.o())) {
            a(f4Var.l(), 204, null, null, null);
            return;
        }
        String a2 = this.i.n().a(f4Var);
        try {
            URL url = new URL(a2);
            this.i.c().B().a("Fetching remote configuration", f4Var.l());
            c.e.a.b.d.g.b1 a3 = g().a(f4Var.l());
            String b2 = g().b(f4Var.l());
            if (a3 == null || TextUtils.isEmpty(b2)) {
                aVar = null;
            } else {
                a.e.a aVar2 = new a.e.a();
                aVar2.put("If-Modified-Since", b2);
                aVar = aVar2;
            }
            this.p = true;
            h4 h2 = h();
            String l = f4Var.l();
            s9 s9Var = new s9(this);
            h2.g();
            h2.q();
            com.google.android.gms.common.internal.s.a(url);
            com.google.android.gms.common.internal.s.a(s9Var);
            h2.a().b(new l4(h2, l, url, null, aVar, s9Var));
        } catch (MalformedURLException unused) {
            this.i.c().s().a("Failed to parse config URL. Not fetching. appId", z3.a(f4Var.l()), a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(w9 w9Var) {
        this.i.a().g();
        e eVar = new e(this);
        eVar.r();
        this.f7659c = eVar;
        this.i.n().a(this.f7657a);
        ga gaVar = new ga(this);
        gaVar.r();
        this.f7662f = gaVar;
        o7 o7Var = new o7(this);
        o7Var.r();
        this.f7664h = o7Var;
        n9 n9Var = new n9(this);
        n9Var.r();
        this.f7661e = n9Var;
        this.f7660d = new k4(this);
        if (this.n != this.o) {
            this.i.c().s().a("Not all upload components initialized", Integer.valueOf(this.n), Integer.valueOf(this.o));
        }
        this.j = true;
    }

    private final boolean a(int i, FileChannel fileChannel) {
        y();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.i.c().s().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.i.n().a(r.z0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.i.c().s().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.i.c().s().a("Failed to write to channel", e2);
            return false;
        }
    }

    private final boolean a(i1.a aVar, i1.a aVar2) {
        com.google.android.gms.common.internal.s.a("_e".equals(aVar.m()));
        l();
        c.e.a.b.d.g.k1 b2 = v9.b((c.e.a.b.d.g.i1) aVar.i(), "_sc");
        String str = null;
        String q = b2 == null ? null : b2.q();
        l();
        c.e.a.b.d.g.k1 b3 = v9.b((c.e.a.b.d.g.i1) aVar2.i(), "_pc");
        if (b3 != null) {
            str = b3.q();
        }
        if (str == null || !str.equals(q)) {
            return false;
        }
        b(aVar, aVar2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0254, code lost:
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
        if (r8 != null) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bd, code lost:
        if (r6 != null) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0210, code lost:
        if (r6 != null) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0228, code lost:
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026a A[Catch: all -> 0x0efd, TryCatch #14 {all -> 0x0efd, blocks: (B:3:0x000b, B:25:0x0083, B:103:0x0258, B:105:0x025c, B:111:0x026a, B:112:0x0292, B:115:0x02a2, B:118:0x02c8, B:120:0x0301, B:126:0x0317, B:128:0x0321, B:303:0x085d, B:130:0x0348, B:133:0x0360, B:162:0x03bd, B:165:0x03c7, B:167:0x03d5, B:171:0x041e, B:168:0x03f3, B:170:0x0403, B:175:0x042b, B:177:0x0459, B:178:0x0485, B:180:0x04b9, B:182:0x04bf, B:185:0x04cb, B:187:0x0500, B:188:0x051d, B:190:0x0523, B:192:0x0531, B:196:0x0544, B:193:0x0539, B:199:0x054b, B:201:0x0551, B:202:0x056d, B:204:0x0588, B:205:0x0594, B:207:0x059a, B:213:0x05c1, B:210:0x05ae, B:216:0x05c7, B:218:0x05d3, B:220:0x05df, B:236:0x0630, B:239:0x064f, B:241:0x0663, B:243:0x066f, B:246:0x0684, B:248:0x0697, B:250:0x06a5, B:292:0x07e9, B:294:0x07f3, B:296:0x07f9, B:297:0x080f, B:298:0x0813, B:300:0x0827, B:301:0x083e, B:302:0x0846, B:254:0x06ba, B:256:0x06c6, B:259:0x06d9, B:261:0x06ec, B:263:0x06fa, B:265:0x0708, B:267:0x071e, B:269:0x072a, B:272:0x073d, B:274:0x0751, B:276:0x079c, B:278:0x07a3, B:280:0x07a9, B:282:0x07b4, B:284:0x07bb, B:286:0x07c1, B:288:0x07cc, B:289:0x07dd, B:224:0x0602, B:228:0x0616, B:230:0x061c, B:233:0x0627, B:140:0x0380, B:143:0x038a, B:146:0x0394, B:308:0x0877, B:310:0x0885, B:312:0x0890, B:323:0x08c2, B:313:0x0898, B:315:0x08a1, B:317:0x08a7, B:320:0x08b3, B:322:0x08bd, B:325:0x08c7, B:326:0x08d3, B:328:0x08d9, B:333:0x08f0, B:334:0x08fd, B:339:0x090a, B:343:0x0933, B:345:0x0952, B:347:0x0960, B:349:0x0966, B:351:0x0970, B:352:0x099f, B:354:0x09a5, B:356:0x09b5, B:360:0x09c0, B:357:0x09ba, B:361:0x09c3, B:363:0x09d5, B:364:0x09d8, B:371:0x0a45, B:373:0x0a61, B:374:0x0a72, B:376:0x0a76, B:378:0x0a82, B:379:0x0a8d, B:381:0x0a91, B:383:0x0a99, B:384:0x0aa8, B:385:0x0ab3, B:391:0x0af0, B:392:0x0af8, B:394:0x0afe, B:396:0x0b10, B:398:0x0b14, B:412:0x0b4a, B:415:0x0b60, B:419:0x0b90, B:421:0x0ba6, B:431:0x0c08, B:433:0x0c19, B:435:0x0c1d, B:437:0x0c21, B:439:0x0c25, B:443:0x0c39, B:445:0x0c5c, B:446:0x0c65, B:451:0x0c7f, B:400:0x0b22, B:402:0x0b26, B:404:0x0b30, B:406:0x0b34, B:476:0x0d43, B:478:0x0d55, B:479:0x0d58, B:481:0x0d68, B:501:0x0ddd, B:503:0x0de3, B:505:0x0df8, B:508:0x0dff, B:513:0x0e32, B:509:0x0e07, B:511:0x0e13, B:512:0x0e19, B:514:0x0e43, B:515:0x0e5a, B:518:0x0e62, B:519:0x0e67, B:520:0x0e77, B:522:0x0e91, B:523:0x0eaa, B:524:0x0eb2, B:529:0x0ed4, B:528:0x0ec3, B:482:0x0d82, B:484:0x0d88, B:486:0x0d92, B:488:0x0d99, B:494:0x0da9, B:496:0x0db0, B:498:0x0dcf, B:500:0x0dd6, B:499:0x0dd3, B:495:0x0dad, B:487:0x0d96, B:340:0x090f, B:342:0x0917, B:532:0x0ee4, B:51:0x012a, B:67:0x01bf, B:538:0x0ef9, B:539:0x0efc), top: B:559:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0588 A[Catch: all -> 0x0efd, TryCatch #14 {all -> 0x0efd, blocks: (B:3:0x000b, B:25:0x0083, B:103:0x0258, B:105:0x025c, B:111:0x026a, B:112:0x0292, B:115:0x02a2, B:118:0x02c8, B:120:0x0301, B:126:0x0317, B:128:0x0321, B:303:0x085d, B:130:0x0348, B:133:0x0360, B:162:0x03bd, B:165:0x03c7, B:167:0x03d5, B:171:0x041e, B:168:0x03f3, B:170:0x0403, B:175:0x042b, B:177:0x0459, B:178:0x0485, B:180:0x04b9, B:182:0x04bf, B:185:0x04cb, B:187:0x0500, B:188:0x051d, B:190:0x0523, B:192:0x0531, B:196:0x0544, B:193:0x0539, B:199:0x054b, B:201:0x0551, B:202:0x056d, B:204:0x0588, B:205:0x0594, B:207:0x059a, B:213:0x05c1, B:210:0x05ae, B:216:0x05c7, B:218:0x05d3, B:220:0x05df, B:236:0x0630, B:239:0x064f, B:241:0x0663, B:243:0x066f, B:246:0x0684, B:248:0x0697, B:250:0x06a5, B:292:0x07e9, B:294:0x07f3, B:296:0x07f9, B:297:0x080f, B:298:0x0813, B:300:0x0827, B:301:0x083e, B:302:0x0846, B:254:0x06ba, B:256:0x06c6, B:259:0x06d9, B:261:0x06ec, B:263:0x06fa, B:265:0x0708, B:267:0x071e, B:269:0x072a, B:272:0x073d, B:274:0x0751, B:276:0x079c, B:278:0x07a3, B:280:0x07a9, B:282:0x07b4, B:284:0x07bb, B:286:0x07c1, B:288:0x07cc, B:289:0x07dd, B:224:0x0602, B:228:0x0616, B:230:0x061c, B:233:0x0627, B:140:0x0380, B:143:0x038a, B:146:0x0394, B:308:0x0877, B:310:0x0885, B:312:0x0890, B:323:0x08c2, B:313:0x0898, B:315:0x08a1, B:317:0x08a7, B:320:0x08b3, B:322:0x08bd, B:325:0x08c7, B:326:0x08d3, B:328:0x08d9, B:333:0x08f0, B:334:0x08fd, B:339:0x090a, B:343:0x0933, B:345:0x0952, B:347:0x0960, B:349:0x0966, B:351:0x0970, B:352:0x099f, B:354:0x09a5, B:356:0x09b5, B:360:0x09c0, B:357:0x09ba, B:361:0x09c3, B:363:0x09d5, B:364:0x09d8, B:371:0x0a45, B:373:0x0a61, B:374:0x0a72, B:376:0x0a76, B:378:0x0a82, B:379:0x0a8d, B:381:0x0a91, B:383:0x0a99, B:384:0x0aa8, B:385:0x0ab3, B:391:0x0af0, B:392:0x0af8, B:394:0x0afe, B:396:0x0b10, B:398:0x0b14, B:412:0x0b4a, B:415:0x0b60, B:419:0x0b90, B:421:0x0ba6, B:431:0x0c08, B:433:0x0c19, B:435:0x0c1d, B:437:0x0c21, B:439:0x0c25, B:443:0x0c39, B:445:0x0c5c, B:446:0x0c65, B:451:0x0c7f, B:400:0x0b22, B:402:0x0b26, B:404:0x0b30, B:406:0x0b34, B:476:0x0d43, B:478:0x0d55, B:479:0x0d58, B:481:0x0d68, B:501:0x0ddd, B:503:0x0de3, B:505:0x0df8, B:508:0x0dff, B:513:0x0e32, B:509:0x0e07, B:511:0x0e13, B:512:0x0e19, B:514:0x0e43, B:515:0x0e5a, B:518:0x0e62, B:519:0x0e67, B:520:0x0e77, B:522:0x0e91, B:523:0x0eaa, B:524:0x0eb2, B:529:0x0ed4, B:528:0x0ec3, B:482:0x0d82, B:484:0x0d88, B:486:0x0d92, B:488:0x0d99, B:494:0x0da9, B:496:0x0db0, B:498:0x0dcf, B:500:0x0dd6, B:499:0x0dd3, B:495:0x0dad, B:487:0x0d96, B:340:0x090f, B:342:0x0917, B:532:0x0ee4, B:51:0x012a, B:67:0x01bf, B:538:0x0ef9, B:539:0x0efc), top: B:559:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0663 A[Catch: all -> 0x0efd, TryCatch #14 {all -> 0x0efd, blocks: (B:3:0x000b, B:25:0x0083, B:103:0x0258, B:105:0x025c, B:111:0x026a, B:112:0x0292, B:115:0x02a2, B:118:0x02c8, B:120:0x0301, B:126:0x0317, B:128:0x0321, B:303:0x085d, B:130:0x0348, B:133:0x0360, B:162:0x03bd, B:165:0x03c7, B:167:0x03d5, B:171:0x041e, B:168:0x03f3, B:170:0x0403, B:175:0x042b, B:177:0x0459, B:178:0x0485, B:180:0x04b9, B:182:0x04bf, B:185:0x04cb, B:187:0x0500, B:188:0x051d, B:190:0x0523, B:192:0x0531, B:196:0x0544, B:193:0x0539, B:199:0x054b, B:201:0x0551, B:202:0x056d, B:204:0x0588, B:205:0x0594, B:207:0x059a, B:213:0x05c1, B:210:0x05ae, B:216:0x05c7, B:218:0x05d3, B:220:0x05df, B:236:0x0630, B:239:0x064f, B:241:0x0663, B:243:0x066f, B:246:0x0684, B:248:0x0697, B:250:0x06a5, B:292:0x07e9, B:294:0x07f3, B:296:0x07f9, B:297:0x080f, B:298:0x0813, B:300:0x0827, B:301:0x083e, B:302:0x0846, B:254:0x06ba, B:256:0x06c6, B:259:0x06d9, B:261:0x06ec, B:263:0x06fa, B:265:0x0708, B:267:0x071e, B:269:0x072a, B:272:0x073d, B:274:0x0751, B:276:0x079c, B:278:0x07a3, B:280:0x07a9, B:282:0x07b4, B:284:0x07bb, B:286:0x07c1, B:288:0x07cc, B:289:0x07dd, B:224:0x0602, B:228:0x0616, B:230:0x061c, B:233:0x0627, B:140:0x0380, B:143:0x038a, B:146:0x0394, B:308:0x0877, B:310:0x0885, B:312:0x0890, B:323:0x08c2, B:313:0x0898, B:315:0x08a1, B:317:0x08a7, B:320:0x08b3, B:322:0x08bd, B:325:0x08c7, B:326:0x08d3, B:328:0x08d9, B:333:0x08f0, B:334:0x08fd, B:339:0x090a, B:343:0x0933, B:345:0x0952, B:347:0x0960, B:349:0x0966, B:351:0x0970, B:352:0x099f, B:354:0x09a5, B:356:0x09b5, B:360:0x09c0, B:357:0x09ba, B:361:0x09c3, B:363:0x09d5, B:364:0x09d8, B:371:0x0a45, B:373:0x0a61, B:374:0x0a72, B:376:0x0a76, B:378:0x0a82, B:379:0x0a8d, B:381:0x0a91, B:383:0x0a99, B:384:0x0aa8, B:385:0x0ab3, B:391:0x0af0, B:392:0x0af8, B:394:0x0afe, B:396:0x0b10, B:398:0x0b14, B:412:0x0b4a, B:415:0x0b60, B:419:0x0b90, B:421:0x0ba6, B:431:0x0c08, B:433:0x0c19, B:435:0x0c1d, B:437:0x0c21, B:439:0x0c25, B:443:0x0c39, B:445:0x0c5c, B:446:0x0c65, B:451:0x0c7f, B:400:0x0b22, B:402:0x0b26, B:404:0x0b30, B:406:0x0b34, B:476:0x0d43, B:478:0x0d55, B:479:0x0d58, B:481:0x0d68, B:501:0x0ddd, B:503:0x0de3, B:505:0x0df8, B:508:0x0dff, B:513:0x0e32, B:509:0x0e07, B:511:0x0e13, B:512:0x0e19, B:514:0x0e43, B:515:0x0e5a, B:518:0x0e62, B:519:0x0e67, B:520:0x0e77, B:522:0x0e91, B:523:0x0eaa, B:524:0x0eb2, B:529:0x0ed4, B:528:0x0ec3, B:482:0x0d82, B:484:0x0d88, B:486:0x0d92, B:488:0x0d99, B:494:0x0da9, B:496:0x0db0, B:498:0x0dcf, B:500:0x0dd6, B:499:0x0dd3, B:495:0x0dad, B:487:0x0d96, B:340:0x090f, B:342:0x0917, B:532:0x0ee4, B:51:0x012a, B:67:0x01bf, B:538:0x0ef9, B:539:0x0efc), top: B:559:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07e9 A[Catch: all -> 0x0efd, TryCatch #14 {all -> 0x0efd, blocks: (B:3:0x000b, B:25:0x0083, B:103:0x0258, B:105:0x025c, B:111:0x026a, B:112:0x0292, B:115:0x02a2, B:118:0x02c8, B:120:0x0301, B:126:0x0317, B:128:0x0321, B:303:0x085d, B:130:0x0348, B:133:0x0360, B:162:0x03bd, B:165:0x03c7, B:167:0x03d5, B:171:0x041e, B:168:0x03f3, B:170:0x0403, B:175:0x042b, B:177:0x0459, B:178:0x0485, B:180:0x04b9, B:182:0x04bf, B:185:0x04cb, B:187:0x0500, B:188:0x051d, B:190:0x0523, B:192:0x0531, B:196:0x0544, B:193:0x0539, B:199:0x054b, B:201:0x0551, B:202:0x056d, B:204:0x0588, B:205:0x0594, B:207:0x059a, B:213:0x05c1, B:210:0x05ae, B:216:0x05c7, B:218:0x05d3, B:220:0x05df, B:236:0x0630, B:239:0x064f, B:241:0x0663, B:243:0x066f, B:246:0x0684, B:248:0x0697, B:250:0x06a5, B:292:0x07e9, B:294:0x07f3, B:296:0x07f9, B:297:0x080f, B:298:0x0813, B:300:0x0827, B:301:0x083e, B:302:0x0846, B:254:0x06ba, B:256:0x06c6, B:259:0x06d9, B:261:0x06ec, B:263:0x06fa, B:265:0x0708, B:267:0x071e, B:269:0x072a, B:272:0x073d, B:274:0x0751, B:276:0x079c, B:278:0x07a3, B:280:0x07a9, B:282:0x07b4, B:284:0x07bb, B:286:0x07c1, B:288:0x07cc, B:289:0x07dd, B:224:0x0602, B:228:0x0616, B:230:0x061c, B:233:0x0627, B:140:0x0380, B:143:0x038a, B:146:0x0394, B:308:0x0877, B:310:0x0885, B:312:0x0890, B:323:0x08c2, B:313:0x0898, B:315:0x08a1, B:317:0x08a7, B:320:0x08b3, B:322:0x08bd, B:325:0x08c7, B:326:0x08d3, B:328:0x08d9, B:333:0x08f0, B:334:0x08fd, B:339:0x090a, B:343:0x0933, B:345:0x0952, B:347:0x0960, B:349:0x0966, B:351:0x0970, B:352:0x099f, B:354:0x09a5, B:356:0x09b5, B:360:0x09c0, B:357:0x09ba, B:361:0x09c3, B:363:0x09d5, B:364:0x09d8, B:371:0x0a45, B:373:0x0a61, B:374:0x0a72, B:376:0x0a76, B:378:0x0a82, B:379:0x0a8d, B:381:0x0a91, B:383:0x0a99, B:384:0x0aa8, B:385:0x0ab3, B:391:0x0af0, B:392:0x0af8, B:394:0x0afe, B:396:0x0b10, B:398:0x0b14, B:412:0x0b4a, B:415:0x0b60, B:419:0x0b90, B:421:0x0ba6, B:431:0x0c08, B:433:0x0c19, B:435:0x0c1d, B:437:0x0c21, B:439:0x0c25, B:443:0x0c39, B:445:0x0c5c, B:446:0x0c65, B:451:0x0c7f, B:400:0x0b22, B:402:0x0b26, B:404:0x0b30, B:406:0x0b34, B:476:0x0d43, B:478:0x0d55, B:479:0x0d58, B:481:0x0d68, B:501:0x0ddd, B:503:0x0de3, B:505:0x0df8, B:508:0x0dff, B:513:0x0e32, B:509:0x0e07, B:511:0x0e13, B:512:0x0e19, B:514:0x0e43, B:515:0x0e5a, B:518:0x0e62, B:519:0x0e67, B:520:0x0e77, B:522:0x0e91, B:523:0x0eaa, B:524:0x0eb2, B:529:0x0ed4, B:528:0x0ec3, B:482:0x0d82, B:484:0x0d88, B:486:0x0d92, B:488:0x0d99, B:494:0x0da9, B:496:0x0db0, B:498:0x0dcf, B:500:0x0dd6, B:499:0x0dd3, B:495:0x0dad, B:487:0x0d96, B:340:0x090f, B:342:0x0917, B:532:0x0ee4, B:51:0x012a, B:67:0x01bf, B:538:0x0ef9, B:539:0x0efc), top: B:559:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07f9 A[Catch: all -> 0x0efd, TryCatch #14 {all -> 0x0efd, blocks: (B:3:0x000b, B:25:0x0083, B:103:0x0258, B:105:0x025c, B:111:0x026a, B:112:0x0292, B:115:0x02a2, B:118:0x02c8, B:120:0x0301, B:126:0x0317, B:128:0x0321, B:303:0x085d, B:130:0x0348, B:133:0x0360, B:162:0x03bd, B:165:0x03c7, B:167:0x03d5, B:171:0x041e, B:168:0x03f3, B:170:0x0403, B:175:0x042b, B:177:0x0459, B:178:0x0485, B:180:0x04b9, B:182:0x04bf, B:185:0x04cb, B:187:0x0500, B:188:0x051d, B:190:0x0523, B:192:0x0531, B:196:0x0544, B:193:0x0539, B:199:0x054b, B:201:0x0551, B:202:0x056d, B:204:0x0588, B:205:0x0594, B:207:0x059a, B:213:0x05c1, B:210:0x05ae, B:216:0x05c7, B:218:0x05d3, B:220:0x05df, B:236:0x0630, B:239:0x064f, B:241:0x0663, B:243:0x066f, B:246:0x0684, B:248:0x0697, B:250:0x06a5, B:292:0x07e9, B:294:0x07f3, B:296:0x07f9, B:297:0x080f, B:298:0x0813, B:300:0x0827, B:301:0x083e, B:302:0x0846, B:254:0x06ba, B:256:0x06c6, B:259:0x06d9, B:261:0x06ec, B:263:0x06fa, B:265:0x0708, B:267:0x071e, B:269:0x072a, B:272:0x073d, B:274:0x0751, B:276:0x079c, B:278:0x07a3, B:280:0x07a9, B:282:0x07b4, B:284:0x07bb, B:286:0x07c1, B:288:0x07cc, B:289:0x07dd, B:224:0x0602, B:228:0x0616, B:230:0x061c, B:233:0x0627, B:140:0x0380, B:143:0x038a, B:146:0x0394, B:308:0x0877, B:310:0x0885, B:312:0x0890, B:323:0x08c2, B:313:0x0898, B:315:0x08a1, B:317:0x08a7, B:320:0x08b3, B:322:0x08bd, B:325:0x08c7, B:326:0x08d3, B:328:0x08d9, B:333:0x08f0, B:334:0x08fd, B:339:0x090a, B:343:0x0933, B:345:0x0952, B:347:0x0960, B:349:0x0966, B:351:0x0970, B:352:0x099f, B:354:0x09a5, B:356:0x09b5, B:360:0x09c0, B:357:0x09ba, B:361:0x09c3, B:363:0x09d5, B:364:0x09d8, B:371:0x0a45, B:373:0x0a61, B:374:0x0a72, B:376:0x0a76, B:378:0x0a82, B:379:0x0a8d, B:381:0x0a91, B:383:0x0a99, B:384:0x0aa8, B:385:0x0ab3, B:391:0x0af0, B:392:0x0af8, B:394:0x0afe, B:396:0x0b10, B:398:0x0b14, B:412:0x0b4a, B:415:0x0b60, B:419:0x0b90, B:421:0x0ba6, B:431:0x0c08, B:433:0x0c19, B:435:0x0c1d, B:437:0x0c21, B:439:0x0c25, B:443:0x0c39, B:445:0x0c5c, B:446:0x0c65, B:451:0x0c7f, B:400:0x0b22, B:402:0x0b26, B:404:0x0b30, B:406:0x0b34, B:476:0x0d43, B:478:0x0d55, B:479:0x0d58, B:481:0x0d68, B:501:0x0ddd, B:503:0x0de3, B:505:0x0df8, B:508:0x0dff, B:513:0x0e32, B:509:0x0e07, B:511:0x0e13, B:512:0x0e19, B:514:0x0e43, B:515:0x0e5a, B:518:0x0e62, B:519:0x0e67, B:520:0x0e77, B:522:0x0e91, B:523:0x0eaa, B:524:0x0eb2, B:529:0x0ed4, B:528:0x0ec3, B:482:0x0d82, B:484:0x0d88, B:486:0x0d92, B:488:0x0d99, B:494:0x0da9, B:496:0x0db0, B:498:0x0dcf, B:500:0x0dd6, B:499:0x0dd3, B:495:0x0dad, B:487:0x0d96, B:340:0x090f, B:342:0x0917, B:532:0x0ee4, B:51:0x012a, B:67:0x01bf, B:538:0x0ef9, B:539:0x0efc), top: B:559:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0813 A[Catch: all -> 0x0efd, TryCatch #14 {all -> 0x0efd, blocks: (B:3:0x000b, B:25:0x0083, B:103:0x0258, B:105:0x025c, B:111:0x026a, B:112:0x0292, B:115:0x02a2, B:118:0x02c8, B:120:0x0301, B:126:0x0317, B:128:0x0321, B:303:0x085d, B:130:0x0348, B:133:0x0360, B:162:0x03bd, B:165:0x03c7, B:167:0x03d5, B:171:0x041e, B:168:0x03f3, B:170:0x0403, B:175:0x042b, B:177:0x0459, B:178:0x0485, B:180:0x04b9, B:182:0x04bf, B:185:0x04cb, B:187:0x0500, B:188:0x051d, B:190:0x0523, B:192:0x0531, B:196:0x0544, B:193:0x0539, B:199:0x054b, B:201:0x0551, B:202:0x056d, B:204:0x0588, B:205:0x0594, B:207:0x059a, B:213:0x05c1, B:210:0x05ae, B:216:0x05c7, B:218:0x05d3, B:220:0x05df, B:236:0x0630, B:239:0x064f, B:241:0x0663, B:243:0x066f, B:246:0x0684, B:248:0x0697, B:250:0x06a5, B:292:0x07e9, B:294:0x07f3, B:296:0x07f9, B:297:0x080f, B:298:0x0813, B:300:0x0827, B:301:0x083e, B:302:0x0846, B:254:0x06ba, B:256:0x06c6, B:259:0x06d9, B:261:0x06ec, B:263:0x06fa, B:265:0x0708, B:267:0x071e, B:269:0x072a, B:272:0x073d, B:274:0x0751, B:276:0x079c, B:278:0x07a3, B:280:0x07a9, B:282:0x07b4, B:284:0x07bb, B:286:0x07c1, B:288:0x07cc, B:289:0x07dd, B:224:0x0602, B:228:0x0616, B:230:0x061c, B:233:0x0627, B:140:0x0380, B:143:0x038a, B:146:0x0394, B:308:0x0877, B:310:0x0885, B:312:0x0890, B:323:0x08c2, B:313:0x0898, B:315:0x08a1, B:317:0x08a7, B:320:0x08b3, B:322:0x08bd, B:325:0x08c7, B:326:0x08d3, B:328:0x08d9, B:333:0x08f0, B:334:0x08fd, B:339:0x090a, B:343:0x0933, B:345:0x0952, B:347:0x0960, B:349:0x0966, B:351:0x0970, B:352:0x099f, B:354:0x09a5, B:356:0x09b5, B:360:0x09c0, B:357:0x09ba, B:361:0x09c3, B:363:0x09d5, B:364:0x09d8, B:371:0x0a45, B:373:0x0a61, B:374:0x0a72, B:376:0x0a76, B:378:0x0a82, B:379:0x0a8d, B:381:0x0a91, B:383:0x0a99, B:384:0x0aa8, B:385:0x0ab3, B:391:0x0af0, B:392:0x0af8, B:394:0x0afe, B:396:0x0b10, B:398:0x0b14, B:412:0x0b4a, B:415:0x0b60, B:419:0x0b90, B:421:0x0ba6, B:431:0x0c08, B:433:0x0c19, B:435:0x0c1d, B:437:0x0c21, B:439:0x0c25, B:443:0x0c39, B:445:0x0c5c, B:446:0x0c65, B:451:0x0c7f, B:400:0x0b22, B:402:0x0b26, B:404:0x0b30, B:406:0x0b34, B:476:0x0d43, B:478:0x0d55, B:479:0x0d58, B:481:0x0d68, B:501:0x0ddd, B:503:0x0de3, B:505:0x0df8, B:508:0x0dff, B:513:0x0e32, B:509:0x0e07, B:511:0x0e13, B:512:0x0e19, B:514:0x0e43, B:515:0x0e5a, B:518:0x0e62, B:519:0x0e67, B:520:0x0e77, B:522:0x0e91, B:523:0x0eaa, B:524:0x0eb2, B:529:0x0ed4, B:528:0x0ec3, B:482:0x0d82, B:484:0x0d88, B:486:0x0d92, B:488:0x0d99, B:494:0x0da9, B:496:0x0db0, B:498:0x0dcf, B:500:0x0dd6, B:499:0x0dd3, B:495:0x0dad, B:487:0x0d96, B:340:0x090f, B:342:0x0917, B:532:0x0ee4, B:51:0x012a, B:67:0x01bf, B:538:0x0ef9, B:539:0x0efc), top: B:559:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117 A[Catch: all -> 0x022c, SQLiteException -> 0x0230, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0230, all -> 0x022c, blocks: (B:47:0x00ea, B:49:0x0117, B:53:0x012f, B:54:0x0133, B:55:0x0144, B:57:0x014a, B:58:0x015b, B:60:0x0167, B:62:0x018b, B:61:0x017d, B:86:0x0217), top: B:560:0x00ea, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0ee4 A[Catch: all -> 0x0efd, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0efd, blocks: (B:3:0x000b, B:25:0x0083, B:103:0x0258, B:105:0x025c, B:111:0x026a, B:112:0x0292, B:115:0x02a2, B:118:0x02c8, B:120:0x0301, B:126:0x0317, B:128:0x0321, B:303:0x085d, B:130:0x0348, B:133:0x0360, B:162:0x03bd, B:165:0x03c7, B:167:0x03d5, B:171:0x041e, B:168:0x03f3, B:170:0x0403, B:175:0x042b, B:177:0x0459, B:178:0x0485, B:180:0x04b9, B:182:0x04bf, B:185:0x04cb, B:187:0x0500, B:188:0x051d, B:190:0x0523, B:192:0x0531, B:196:0x0544, B:193:0x0539, B:199:0x054b, B:201:0x0551, B:202:0x056d, B:204:0x0588, B:205:0x0594, B:207:0x059a, B:213:0x05c1, B:210:0x05ae, B:216:0x05c7, B:218:0x05d3, B:220:0x05df, B:236:0x0630, B:239:0x064f, B:241:0x0663, B:243:0x066f, B:246:0x0684, B:248:0x0697, B:250:0x06a5, B:292:0x07e9, B:294:0x07f3, B:296:0x07f9, B:297:0x080f, B:298:0x0813, B:300:0x0827, B:301:0x083e, B:302:0x0846, B:254:0x06ba, B:256:0x06c6, B:259:0x06d9, B:261:0x06ec, B:263:0x06fa, B:265:0x0708, B:267:0x071e, B:269:0x072a, B:272:0x073d, B:274:0x0751, B:276:0x079c, B:278:0x07a3, B:280:0x07a9, B:282:0x07b4, B:284:0x07bb, B:286:0x07c1, B:288:0x07cc, B:289:0x07dd, B:224:0x0602, B:228:0x0616, B:230:0x061c, B:233:0x0627, B:140:0x0380, B:143:0x038a, B:146:0x0394, B:308:0x0877, B:310:0x0885, B:312:0x0890, B:323:0x08c2, B:313:0x0898, B:315:0x08a1, B:317:0x08a7, B:320:0x08b3, B:322:0x08bd, B:325:0x08c7, B:326:0x08d3, B:328:0x08d9, B:333:0x08f0, B:334:0x08fd, B:339:0x090a, B:343:0x0933, B:345:0x0952, B:347:0x0960, B:349:0x0966, B:351:0x0970, B:352:0x099f, B:354:0x09a5, B:356:0x09b5, B:360:0x09c0, B:357:0x09ba, B:361:0x09c3, B:363:0x09d5, B:364:0x09d8, B:371:0x0a45, B:373:0x0a61, B:374:0x0a72, B:376:0x0a76, B:378:0x0a82, B:379:0x0a8d, B:381:0x0a91, B:383:0x0a99, B:384:0x0aa8, B:385:0x0ab3, B:391:0x0af0, B:392:0x0af8, B:394:0x0afe, B:396:0x0b10, B:398:0x0b14, B:412:0x0b4a, B:415:0x0b60, B:419:0x0b90, B:421:0x0ba6, B:431:0x0c08, B:433:0x0c19, B:435:0x0c1d, B:437:0x0c21, B:439:0x0c25, B:443:0x0c39, B:445:0x0c5c, B:446:0x0c65, B:451:0x0c7f, B:400:0x0b22, B:402:0x0b26, B:404:0x0b30, B:406:0x0b34, B:476:0x0d43, B:478:0x0d55, B:479:0x0d58, B:481:0x0d68, B:501:0x0ddd, B:503:0x0de3, B:505:0x0df8, B:508:0x0dff, B:513:0x0e32, B:509:0x0e07, B:511:0x0e13, B:512:0x0e19, B:514:0x0e43, B:515:0x0e5a, B:518:0x0e62, B:519:0x0e67, B:520:0x0e77, B:522:0x0e91, B:523:0x0eaa, B:524:0x0eb2, B:529:0x0ed4, B:528:0x0ec3, B:482:0x0d82, B:484:0x0d88, B:486:0x0d92, B:488:0x0d99, B:494:0x0da9, B:496:0x0db0, B:498:0x0dcf, B:500:0x0dd6, B:499:0x0dd3, B:495:0x0dad, B:487:0x0d96, B:340:0x090f, B:342:0x0917, B:532:0x0ee4, B:51:0x012a, B:67:0x01bf, B:538:0x0ef9, B:539:0x0efc), top: B:559:0x000b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f A[Catch: all -> 0x022c, SQLiteException -> 0x0230, TRY_ENTER, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0230, all -> 0x022c, blocks: (B:47:0x00ea, B:49:0x0117, B:53:0x012f, B:54:0x0133, B:55:0x0144, B:57:0x014a, B:58:0x015b, B:60:0x0167, B:62:0x018b, B:61:0x017d, B:86:0x0217), top: B:560:0x00ea, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(java.lang.String r44, long r45) {
        /*
            Method dump skipped, instructions count: 3847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.a(java.lang.String, long):boolean");
    }

    private final Boolean b(f4 f4Var) {
        try {
            if (f4Var.v() != -2147483648L) {
                if (f4Var.v() == com.google.android.gms.common.n.c.a(this.i.d()).b(f4Var.l(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = com.google.android.gms.common.n.c.a(this.i.d()).b(f4Var.l(), 0).versionName;
                if (f4Var.u() != null && f4Var.u().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void b(i1.a aVar, i1.a aVar2) {
        com.google.android.gms.common.internal.s.a("_e".equals(aVar.m()));
        l();
        c.e.a.b.d.g.k1 b2 = v9.b((c.e.a.b.d.g.i1) aVar.i(), "_et");
        if (!b2.r() || b2.s() <= 0) {
            return;
        }
        long s = b2.s();
        l();
        c.e.a.b.d.g.k1 b3 = v9.b((c.e.a.b.d.g.i1) aVar2.i(), "_et");
        if (b3 != null && b3.s() > 0) {
            s += b3.s();
        }
        l().a(aVar2, "_et", Long.valueOf(s));
        l().a(aVar, "_fr", (Object) 1L);
    }

    private static void b(o9 o9Var) {
        if (o9Var != null) {
            if (o9Var.p()) {
                return;
            }
            String valueOf = String.valueOf(o9Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Upload Component not created");
    }

    private final void b(p pVar, fa faVar) {
        if (hb.a() && this.i.n().a(r.O0)) {
            d4 a2 = d4.a(pVar);
            this.i.u().a(a2.f7237d, i().i(faVar.f7303b));
            this.i.u().a(a2, this.i.n().a(faVar.f7303b));
            pVar = a2.a();
        }
        a(pVar, faVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:83|(1:85)(1:281)|86|(5:91|92|(1:94)|95|(0))|273|274|275|276|92|(0)|95|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ac, code lost:
        r7.c().s().a("Error pruning currencies. appId", com.google.android.gms.measurement.internal.z3.a(r15), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e0 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0318 A[Catch: all -> 0x093a, TRY_LEAVE, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x033e A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0391 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x067b A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06fd A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0717 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x077c A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0789 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07a3 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0822 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0833 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x084b A[Catch: all -> 0x093a, TRY_LEAVE, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0892 A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x08eb A[Catch: all -> 0x093a, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185 A[Catch: all -> 0x093a, TRY_LEAVE, TryCatch #1 {all -> 0x093a, blocks: (B:38:0x0135, B:40:0x013e, B:44:0x014f, B:48:0x015d, B:50:0x0167, B:55:0x0173, B:62:0x0185, B:65:0x0191, B:67:0x01a8, B:72:0x01c1, B:74:0x01cb, B:76:0x01d9, B:81:0x020b, B:83:0x0211, B:85:0x021f, B:87:0x022b, B:89:0x0235, B:91:0x0240, B:94:0x0247, B:102:0x02d6, B:104:0x02e0, B:108:0x0318, B:112:0x032a, B:114:0x033e, B:116:0x034e, B:118:0x035f, B:120:0x0391, B:122:0x0396, B:123:0x03af, B:127:0x03c0, B:129:0x03d4, B:131:0x03d9, B:132:0x03f2, B:136:0x0415, B:140:0x043a, B:141:0x0453, B:144:0x0462, B:147:0x0485, B:148:0x04a1, B:150:0x04ab, B:152:0x04b7, B:154:0x04bd, B:155:0x04c8, B:157:0x04d4, B:158:0x04eb, B:160:0x0512, B:163:0x052b, B:166:0x056f, B:168:0x0597, B:170:0x05cf, B:171:0x05d4, B:173:0x05dc, B:174:0x05e1, B:176:0x05e9, B:177:0x05ee, B:179:0x05f7, B:180:0x05fd, B:182:0x060a, B:183:0x060f, B:185:0x0615, B:187:0x0625, B:189:0x062f, B:191:0x0637, B:192:0x063c, B:194:0x0646, B:196:0x0650, B:198:0x0658, B:199:0x065a, B:205:0x0673, B:207:0x067b, B:208:0x0680, B:210:0x0695, B:212:0x069f, B:213:0x06a2, B:215:0x06b0, B:217:0x06ba, B:219:0x06be, B:221:0x06c9, B:233:0x0737, B:235:0x077c, B:236:0x0781, B:238:0x0789, B:240:0x0792, B:241:0x0797, B:243:0x07a3, B:245:0x0807, B:246:0x080c, B:247:0x0818, B:249:0x0822, B:250:0x0829, B:252:0x0833, B:253:0x083a, B:254:0x0845, B:256:0x084b, B:258:0x087a, B:259:0x088a, B:261:0x0892, B:262:0x0898, B:264:0x089e, B:273:0x08e5, B:275:0x08eb, B:278:0x0907, B:267:0x08ab, B:269:0x08d0, B:277:0x08ef, B:222:0x06d5, B:224:0x06e7, B:226:0x06eb, B:228:0x06fd, B:232:0x0734, B:229:0x0717, B:231:0x071d, B:200:0x065e, B:202:0x0668, B:204:0x0670, B:167:0x0589, B:95:0x0271, B:96:0x028f, B:101:0x02bd, B:100:0x02ac, B:88:0x0230, B:79:0x01e3, B:80:0x0201), top: B:286:0x0135, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(com.google.android.gms.measurement.internal.p r27, com.google.android.gms.measurement.internal.fa r28) {
        /*
            Method dump skipped, instructions count: 2372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.c(com.google.android.gms.measurement.internal.p, com.google.android.gms.measurement.internal.fa):void");
    }

    private final boolean e(fa faVar) {
        return (!cb.a() || !this.i.n().e(faVar.f7303b, r.o0)) ? !TextUtils.isEmpty(faVar.f7304c) || !TextUtils.isEmpty(faVar.s) : !TextUtils.isEmpty(faVar.f7304c) || !TextUtils.isEmpty(faVar.w) || !TextUtils.isEmpty(faVar.s);
    }

    private final void t() {
        y();
        if (this.p || this.q || this.r) {
            this.i.c().B().a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r));
            return;
        }
        this.i.c().B().a("Stopping uploading service(s)");
        List<Runnable> list = this.m;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        this.m.clear();
    }

    private final boolean u() {
        b4 v;
        String str;
        FileLock fileLock;
        y();
        if (this.i.n().a(r.m0) && (fileLock = this.s) != null && fileLock.isValid()) {
            this.i.c().B().a("Storage concurrent access okay");
            return true;
        }
        try {
            this.t = new RandomAccessFile(new File(this.i.d().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.s = this.t.tryLock();
            if (this.s != null) {
                this.i.c().B().a("Storage concurrent access okay");
                return true;
            }
            this.i.c().s().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            e = e2;
            v = this.i.c().s();
            str = "Failed to acquire storage lock";
            v.a(str, e);
            return false;
        } catch (IOException e3) {
            e = e3;
            v = this.i.c().s();
            str = "Failed to access storage lock file";
            v.a(str, e);
            return false;
        } catch (OverlappingFileLockException e4) {
            e = e4;
            v = this.i.c().v();
            str = "Storage lock already acquired";
            v.a(str, e);
            return false;
        }
    }

    private final k4 v() {
        k4 k4Var = this.f7660d;
        if (k4Var != null) {
            return k4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final n9 x() {
        b(this.f7661e);
        return this.f7661e;
    }

    private final void y() {
        this.i.a().g();
    }

    private final long z() {
        long a2 = this.i.b().a();
        m4 o = this.i.o();
        o.n();
        o.g();
        long a3 = o.i.a();
        if (a3 == 0) {
            a3 = 1 + o.j().t().nextInt(86400000);
            o.i.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final a5 a() {
        return this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0158, code lost:
        r8.i.o().f7488g.a(r8.i.b().a());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.a(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(fa faVar) {
        if (this.u != null) {
            this.v = new ArrayList();
            this.v.addAll(this.u);
        }
        e i = i();
        String str = faVar.f7303b;
        com.google.android.gms.common.internal.s.b(str);
        i.g();
        i.q();
        try {
            SQLiteDatabase u = i.u();
            String[] strArr = {str};
            int delete = u.delete("apps", "app_id=?", strArr) + 0 + u.delete("events", "app_id=?", strArr) + u.delete("user_attributes", "app_id=?", strArr) + u.delete("conditional_properties", "app_id=?", strArr) + u.delete("raw_events", "app_id=?", strArr) + u.delete("raw_events_metadata", "app_id=?", strArr) + u.delete("queue", "app_id=?", strArr) + u.delete("audience_filter_values", "app_id=?", strArr) + u.delete("main_event_params", "app_id=?", strArr) + u.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                i.c().B().a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            i.c().s().a("Error resetting analytics data. appId, error", z3.a(str), e2);
        }
        if (faVar.i) {
            b(faVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(o9 o9Var) {
        this.n++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(oa oaVar) {
        fa a2 = a(oaVar.f7562b);
        if (a2 != null) {
            a(oaVar, a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(oa oaVar, fa faVar) {
        b4 s;
        String str;
        Object a2;
        String c2;
        Object f2;
        b4 s2;
        String str2;
        Object a3;
        String c3;
        Object obj;
        com.google.android.gms.common.internal.s.a(oaVar);
        com.google.android.gms.common.internal.s.b(oaVar.f7562b);
        com.google.android.gms.common.internal.s.a(oaVar.f7563c);
        com.google.android.gms.common.internal.s.a(oaVar.f7564d);
        com.google.android.gms.common.internal.s.b(oaVar.f7564d.f7816c);
        y();
        o();
        if (!e(faVar)) {
            return;
        }
        if (!faVar.i) {
            c(faVar);
            return;
        }
        oa oaVar2 = new oa(oaVar);
        boolean z = false;
        oaVar2.f7566f = false;
        i().y();
        try {
            oa d2 = i().d(oaVar2.f7562b, oaVar2.f7564d.f7816c);
            if (d2 != null && !d2.f7563c.equals(oaVar2.f7563c)) {
                this.i.c().v().a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.i.v().c(oaVar2.f7564d.f7816c), oaVar2.f7563c, d2.f7563c);
            }
            if (d2 != null && d2.f7566f) {
                oaVar2.f7563c = d2.f7563c;
                oaVar2.f7565e = d2.f7565e;
                oaVar2.i = d2.i;
                oaVar2.f7567g = d2.f7567g;
                oaVar2.j = d2.j;
                oaVar2.f7566f = d2.f7566f;
                oaVar2.f7564d = new y9(oaVar2.f7564d.f7816c, d2.f7564d.f7817d, oaVar2.f7564d.f(), d2.f7564d.f7820g);
            } else if (TextUtils.isEmpty(oaVar2.f7567g)) {
                oaVar2.f7564d = new y9(oaVar2.f7564d.f7816c, oaVar2.f7565e, oaVar2.f7564d.f(), oaVar2.f7564d.f7820g);
                oaVar2.f7566f = true;
                z = true;
            }
            if (oaVar2.f7566f) {
                y9 y9Var = oaVar2.f7564d;
                aa aaVar = new aa(oaVar2.f7562b, oaVar2.f7563c, y9Var.f7816c, y9Var.f7817d, y9Var.f());
                if (i().a(aaVar)) {
                    s2 = this.i.c().A();
                    str2 = "User property updated immediately";
                    a3 = oaVar2.f7562b;
                    c3 = this.i.v().c(aaVar.f7175c);
                    obj = aaVar.f7177e;
                } else {
                    s2 = this.i.c().s();
                    str2 = "(2)Too many active user properties, ignoring";
                    a3 = z3.a(oaVar2.f7562b);
                    c3 = this.i.v().c(aaVar.f7175c);
                    obj = aaVar.f7177e;
                }
                s2.a(str2, a3, c3, obj);
                if (z && oaVar2.j != null) {
                    c(new p(oaVar2.j, oaVar2.f7565e), faVar);
                }
            }
            if (i().a(oaVar2)) {
                s = this.i.c().A();
                str = "Conditional property added";
                a2 = oaVar2.f7562b;
                c2 = this.i.v().c(oaVar2.f7564d.f7816c);
                f2 = oaVar2.f7564d.f();
            } else {
                s = this.i.c().s();
                str = "Too many conditional properties, ignoring";
                a2 = z3.a(oaVar2.f7562b);
                c2 = this.i.v().c(oaVar2.f7564d.f7816c);
                f2 = oaVar2.f7564d.f();
            }
            s.a(str, a2, c2, f2);
            i().t();
        } finally {
            i().z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p pVar, fa faVar) {
        List<oa> a2;
        List<oa> a3;
        List<oa> a4;
        b4 s;
        String str;
        Object a5;
        String c2;
        Object obj;
        List<String> list;
        p pVar2 = pVar;
        com.google.android.gms.common.internal.s.a(faVar);
        com.google.android.gms.common.internal.s.b(faVar.f7303b);
        y();
        o();
        String str2 = faVar.f7303b;
        long j = pVar2.f7572e;
        l();
        if (!v9.a(pVar, faVar)) {
            return;
        }
        if (!faVar.i) {
            c(faVar);
            return;
        }
        if (this.i.n().e(str2, r.c0) && (list = faVar.v) != null) {
            if (!list.contains(pVar2.f7569b)) {
                this.i.c().A().a("Dropping non-safelisted event. appId, event name, origin", str2, pVar2.f7569b, pVar2.f7571d);
                return;
            }
            Bundle j2 = pVar2.f7570c.j();
            j2.putLong("ga_safelisted", 1L);
            pVar2 = new p(pVar2.f7569b, new o(j2), pVar2.f7571d, pVar2.f7572e);
        }
        i().y();
        try {
            e i = i();
            com.google.android.gms.common.internal.s.b(str2);
            i.g();
            i.q();
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i2 < 0) {
                i.c().v().a("Invalid time querying timed out conditional properties", z3.a(str2), Long.valueOf(j));
                a2 = Collections.emptyList();
            } else {
                a2 = i.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            for (oa oaVar : a2) {
                if (oaVar != null) {
                    this.i.c().B().a("User property timed out", oaVar.f7562b, this.i.v().c(oaVar.f7564d.f7816c), oaVar.f7564d.f());
                    if (oaVar.f7568h != null) {
                        c(new p(oaVar.f7568h, j), faVar);
                    }
                    i().e(str2, oaVar.f7564d.f7816c);
                }
            }
            e i3 = i();
            com.google.android.gms.common.internal.s.b(str2);
            i3.g();
            i3.q();
            if (i2 < 0) {
                i3.c().v().a("Invalid time querying expired conditional properties", z3.a(str2), Long.valueOf(j));
                a3 = Collections.emptyList();
            } else {
                a3 = i3.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(a3.size());
            for (oa oaVar2 : a3) {
                if (oaVar2 != null) {
                    this.i.c().B().a("User property expired", oaVar2.f7562b, this.i.v().c(oaVar2.f7564d.f7816c), oaVar2.f7564d.f());
                    i().b(str2, oaVar2.f7564d.f7816c);
                    if (oaVar2.l != null) {
                        arrayList.add(oaVar2.l);
                    }
                    i().e(str2, oaVar2.f7564d.f7816c);
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                c(new p((p) obj2, j), faVar);
            }
            e i5 = i();
            String str3 = pVar2.f7569b;
            com.google.android.gms.common.internal.s.b(str2);
            com.google.android.gms.common.internal.s.b(str3);
            i5.g();
            i5.q();
            if (i2 < 0) {
                i5.c().v().a("Invalid time querying triggered conditional properties", z3.a(str2), i5.i().a(str3), Long.valueOf(j));
                a4 = Collections.emptyList();
            } else {
                a4 = i5.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(a4.size());
            for (oa oaVar3 : a4) {
                if (oaVar3 != null) {
                    y9 y9Var = oaVar3.f7564d;
                    aa aaVar = new aa(oaVar3.f7562b, oaVar3.f7563c, y9Var.f7816c, j, y9Var.f());
                    if (i().a(aaVar)) {
                        s = this.i.c().B();
                        str = "User property triggered";
                        a5 = oaVar3.f7562b;
                        c2 = this.i.v().c(aaVar.f7175c);
                        obj = aaVar.f7177e;
                    } else {
                        s = this.i.c().s();
                        str = "Too many active user properties, ignoring";
                        a5 = z3.a(oaVar3.f7562b);
                        c2 = this.i.v().c(aaVar.f7175c);
                        obj = aaVar.f7177e;
                    }
                    s.a(str, a5, c2, obj);
                    if (oaVar3.j != null) {
                        arrayList2.add(oaVar3.j);
                    }
                    oaVar3.f7564d = new y9(aaVar);
                    oaVar3.f7566f = true;
                    i().a(oaVar3);
                }
            }
            c(pVar2, faVar);
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj3 = arrayList2.get(i6);
                i6++;
                c(new p((p) obj3, j), faVar);
            }
            i().t();
        } finally {
            i().z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p pVar, String str) {
        f4 b2 = i().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.u())) {
            this.i.c().A().a("No app data available; dropping event", str);
            return;
        }
        Boolean b3 = b(b2);
        if (b3 == null) {
            if (!"_ui".equals(pVar.f7569b)) {
                this.i.c().v().a("Could not find package. appId", z3.a(str));
            }
        } else if (!b3.booleanValue()) {
            this.i.c().s().a("App version does not match; dropping event. appId", z3.a(str));
            return;
        }
        b(pVar, new fa(str, b2.n(), b2.u(), b2.v(), b2.w(), b2.x(), b2.y(), (String) null, b2.A(), false, b2.r(), b2.f(), 0L, 0, b2.g(), b2.h(), false, b2.o(), b2.i(), b2.z(), b2.j(), (!cb.a() || !this.i.n().e(b2.l(), r.o0)) ? null : b2.p()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(y9 y9Var, fa faVar) {
        y();
        o();
        if (!e(faVar)) {
            return;
        }
        if (!faVar.i) {
            c(faVar);
            return;
        }
        int b2 = this.i.u().b(y9Var.f7816c);
        d5 d5Var = this.i;
        if (b2 != 0) {
            d5Var.u();
            String a2 = z9.a(y9Var.f7816c, 24, true);
            String str = y9Var.f7816c;
            this.i.u().a(faVar.f7303b, b2, "_ev", a2, str != null ? str.length() : 0);
            return;
        }
        int b3 = d5Var.u().b(y9Var.f7816c, y9Var.f());
        if (b3 != 0) {
            this.i.u();
            String a3 = z9.a(y9Var.f7816c, 24, true);
            Object f2 = y9Var.f();
            this.i.u().a(faVar.f7303b, b3, "_ev", a3, (f2 == null || (!(f2 instanceof String) && !(f2 instanceof CharSequence))) ? 0 : String.valueOf(f2).length());
            return;
        }
        Object c2 = this.i.u().c(y9Var.f7816c, y9Var.f());
        if (c2 == null) {
            return;
        }
        if ("_sid".equals(y9Var.f7816c)) {
            long j = y9Var.f7817d;
            String str2 = y9Var.f7820g;
            long j2 = 0;
            aa c3 = i().c(faVar.f7303b, "_sno");
            if (c3 != null) {
                Object obj = c3.f7177e;
                if (obj instanceof Long) {
                    j2 = ((Long) obj).longValue();
                    a(new y9("_sno", j, Long.valueOf(j2 + 1), str2), faVar);
                }
            }
            if (c3 != null) {
                this.i.c().v().a("Retrieved last session number from database does not contain a valid (long) value", c3.f7177e);
            }
            l a4 = i().a(faVar.f7303b, "_s");
            if (a4 != null) {
                j2 = a4.f7439c;
                this.i.c().B().a("Backfill the session number. Last used session number", Long.valueOf(j2));
            }
            a(new y9("_sno", j, Long.valueOf(j2 + 1), str2), faVar);
        }
        aa aaVar = new aa(faVar.f7303b, y9Var.f7820g, y9Var.f7816c, y9Var.f7817d, c2);
        this.i.c().B().a("Setting user property", this.i.v().c(aaVar.f7175c), c2);
        i().y();
        try {
            c(faVar);
            boolean a5 = i().a(aaVar);
            i().t();
            if (!a5) {
                this.i.c().s().a("Too many unique user properties are set. Ignoring user property", this.i.v().c(aaVar.f7175c), aaVar.f7177e);
                this.i.u().a(faVar.f7303b, 9, (String) null, (String) null, 0);
            }
        } finally {
            i().z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        y();
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
        r6.i.o().f7488g.a(r6.i.b().a());
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132 A[Catch: all -> 0x0179, TryCatch #2 {all -> 0x0182, blocks: (B:4:0x000c, B:5:0x000e, B:63:0x0174, B:44:0x00fa, B:43:0x00f6, B:51:0x0117, B:6:0x0029, B:15:0x0045, B:62:0x016d, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x011c, B:55:0x0132, B:57:0x015a, B:59:0x0164, B:61:0x016a, B:56:0x0142, B:47:0x0103, B:49:0x010d), top: B:70:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142 A[Catch: all -> 0x0179, TryCatch #2 {all -> 0x0182, blocks: (B:4:0x000c, B:5:0x000e, B:63:0x0174, B:44:0x00fa, B:43:0x00f6, B:51:0x0117, B:6:0x0029, B:15:0x0045, B:62:0x016d, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x011c, B:55:0x0132, B:57:0x015a, B:59:0x0164, B:61:0x016a, B:56:0x0142, B:47:0x0103, B:49:0x010d), top: B:70:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        B();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final com.google.android.gms.common.util.e b() {
        return this.i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0458 A[Catch: all -> 0x04b6, TryCatch #3 {all -> 0x04b6, blocks: (B:24:0x009e, B:26:0x00ac, B:44:0x010d, B:46:0x0119, B:48:0x0130, B:49:0x0158, B:51:0x015f, B:53:0x01a2, B:63:0x01ce, B:65:0x01d9, B:70:0x01e8, B:72:0x01f0, B:74:0x01f6, B:78:0x0205, B:80:0x0208, B:83:0x022d, B:85:0x0232, B:86:0x023a, B:92:0x024e, B:95:0x0262, B:97:0x0289, B:98:0x0297, B:100:0x02ce, B:101:0x02d1, B:103:0x02d5, B:104:0x02d8, B:106:0x02f9, B:147:0x03d9, B:148:0x03de, B:149:0x03ee, B:159:0x0448, B:161:0x0458, B:163:0x0472, B:164:0x0479, B:165:0x0489, B:169:0x04a7, B:109:0x0315, B:114:0x0340, B:116:0x0348, B:118:0x0352, B:123:0x0368, B:127:0x0372, B:131:0x037d, B:134:0x0390, B:137:0x03a3, B:139:0x03bb, B:141:0x03c1, B:142:0x03c6, B:144:0x03cc, B:112:0x0328, B:152:0x03f6, B:154:0x042d, B:155:0x0430, B:157:0x0434, B:158:0x0437, B:166:0x048d, B:168:0x0491, B:89:0x0242, B:59:0x01b8, B:30:0x00bb, B:32:0x00bf, B:36:0x00d0, B:38:0x00ea, B:40:0x00f4, B:43:0x00fe), top: B:181:0x009e, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x048d A[Catch: all -> 0x04b6, TryCatch #3 {all -> 0x04b6, blocks: (B:24:0x009e, B:26:0x00ac, B:44:0x010d, B:46:0x0119, B:48:0x0130, B:49:0x0158, B:51:0x015f, B:53:0x01a2, B:63:0x01ce, B:65:0x01d9, B:70:0x01e8, B:72:0x01f0, B:74:0x01f6, B:78:0x0205, B:80:0x0208, B:83:0x022d, B:85:0x0232, B:86:0x023a, B:92:0x024e, B:95:0x0262, B:97:0x0289, B:98:0x0297, B:100:0x02ce, B:101:0x02d1, B:103:0x02d5, B:104:0x02d8, B:106:0x02f9, B:147:0x03d9, B:148:0x03de, B:149:0x03ee, B:159:0x0448, B:161:0x0458, B:163:0x0472, B:164:0x0479, B:165:0x0489, B:169:0x04a7, B:109:0x0315, B:114:0x0340, B:116:0x0348, B:118:0x0352, B:123:0x0368, B:127:0x0372, B:131:0x037d, B:134:0x0390, B:137:0x03a3, B:139:0x03bb, B:141:0x03c1, B:142:0x03c6, B:144:0x03cc, B:112:0x0328, B:152:0x03f6, B:154:0x042d, B:155:0x0430, B:157:0x0434, B:158:0x0437, B:166:0x048d, B:168:0x0491, B:89:0x0242, B:59:0x01b8, B:30:0x00bb, B:32:0x00bf, B:36:0x00d0, B:38:0x00ea, B:40:0x00f4, B:43:0x00fe), top: B:181:0x009e, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119 A[Catch: all -> 0x04b6, TryCatch #3 {all -> 0x04b6, blocks: (B:24:0x009e, B:26:0x00ac, B:44:0x010d, B:46:0x0119, B:48:0x0130, B:49:0x0158, B:51:0x015f, B:53:0x01a2, B:63:0x01ce, B:65:0x01d9, B:70:0x01e8, B:72:0x01f0, B:74:0x01f6, B:78:0x0205, B:80:0x0208, B:83:0x022d, B:85:0x0232, B:86:0x023a, B:92:0x024e, B:95:0x0262, B:97:0x0289, B:98:0x0297, B:100:0x02ce, B:101:0x02d1, B:103:0x02d5, B:104:0x02d8, B:106:0x02f9, B:147:0x03d9, B:148:0x03de, B:149:0x03ee, B:159:0x0448, B:161:0x0458, B:163:0x0472, B:164:0x0479, B:165:0x0489, B:169:0x04a7, B:109:0x0315, B:114:0x0340, B:116:0x0348, B:118:0x0352, B:123:0x0368, B:127:0x0372, B:131:0x037d, B:134:0x0390, B:137:0x03a3, B:139:0x03bb, B:141:0x03c1, B:142:0x03c6, B:144:0x03cc, B:112:0x0328, B:152:0x03f6, B:154:0x042d, B:155:0x0430, B:157:0x0434, B:158:0x0437, B:166:0x048d, B:168:0x0491, B:89:0x0242, B:59:0x01b8, B:30:0x00bb, B:32:0x00bf, B:36:0x00d0, B:38:0x00ea, B:40:0x00f4, B:43:0x00fe), top: B:181:0x009e, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce A[Catch: all -> 0x04b6, TryCatch #3 {all -> 0x04b6, blocks: (B:24:0x009e, B:26:0x00ac, B:44:0x010d, B:46:0x0119, B:48:0x0130, B:49:0x0158, B:51:0x015f, B:53:0x01a2, B:63:0x01ce, B:65:0x01d9, B:70:0x01e8, B:72:0x01f0, B:74:0x01f6, B:78:0x0205, B:80:0x0208, B:83:0x022d, B:85:0x0232, B:86:0x023a, B:92:0x024e, B:95:0x0262, B:97:0x0289, B:98:0x0297, B:100:0x02ce, B:101:0x02d1, B:103:0x02d5, B:104:0x02d8, B:106:0x02f9, B:147:0x03d9, B:148:0x03de, B:149:0x03ee, B:159:0x0448, B:161:0x0458, B:163:0x0472, B:164:0x0479, B:165:0x0489, B:169:0x04a7, B:109:0x0315, B:114:0x0340, B:116:0x0348, B:118:0x0352, B:123:0x0368, B:127:0x0372, B:131:0x037d, B:134:0x0390, B:137:0x03a3, B:139:0x03bb, B:141:0x03c1, B:142:0x03c6, B:144:0x03cc, B:112:0x0328, B:152:0x03f6, B:154:0x042d, B:155:0x0430, B:157:0x0434, B:158:0x0437, B:166:0x048d, B:168:0x0491, B:89:0x0242, B:59:0x01b8, B:30:0x00bb, B:32:0x00bf, B:36:0x00d0, B:38:0x00ea, B:40:0x00f4, B:43:0x00fe), top: B:181:0x009e, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0208 A[Catch: all -> 0x04b6, TryCatch #3 {all -> 0x04b6, blocks: (B:24:0x009e, B:26:0x00ac, B:44:0x010d, B:46:0x0119, B:48:0x0130, B:49:0x0158, B:51:0x015f, B:53:0x01a2, B:63:0x01ce, B:65:0x01d9, B:70:0x01e8, B:72:0x01f0, B:74:0x01f6, B:78:0x0205, B:80:0x0208, B:83:0x022d, B:85:0x0232, B:86:0x023a, B:92:0x024e, B:95:0x0262, B:97:0x0289, B:98:0x0297, B:100:0x02ce, B:101:0x02d1, B:103:0x02d5, B:104:0x02d8, B:106:0x02f9, B:147:0x03d9, B:148:0x03de, B:149:0x03ee, B:159:0x0448, B:161:0x0458, B:163:0x0472, B:164:0x0479, B:165:0x0489, B:169:0x04a7, B:109:0x0315, B:114:0x0340, B:116:0x0348, B:118:0x0352, B:123:0x0368, B:127:0x0372, B:131:0x037d, B:134:0x0390, B:137:0x03a3, B:139:0x03bb, B:141:0x03c1, B:142:0x03c6, B:144:0x03cc, B:112:0x0328, B:152:0x03f6, B:154:0x042d, B:155:0x0430, B:157:0x0434, B:158:0x0437, B:166:0x048d, B:168:0x0491, B:89:0x0242, B:59:0x01b8, B:30:0x00bb, B:32:0x00bf, B:36:0x00d0, B:38:0x00ea, B:40:0x00f4, B:43:0x00fe), top: B:181:0x009e, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232 A[Catch: all -> 0x04b6, TryCatch #3 {all -> 0x04b6, blocks: (B:24:0x009e, B:26:0x00ac, B:44:0x010d, B:46:0x0119, B:48:0x0130, B:49:0x0158, B:51:0x015f, B:53:0x01a2, B:63:0x01ce, B:65:0x01d9, B:70:0x01e8, B:72:0x01f0, B:74:0x01f6, B:78:0x0205, B:80:0x0208, B:83:0x022d, B:85:0x0232, B:86:0x023a, B:92:0x024e, B:95:0x0262, B:97:0x0289, B:98:0x0297, B:100:0x02ce, B:101:0x02d1, B:103:0x02d5, B:104:0x02d8, B:106:0x02f9, B:147:0x03d9, B:148:0x03de, B:149:0x03ee, B:159:0x0448, B:161:0x0458, B:163:0x0472, B:164:0x0479, B:165:0x0489, B:169:0x04a7, B:109:0x0315, B:114:0x0340, B:116:0x0348, B:118:0x0352, B:123:0x0368, B:127:0x0372, B:131:0x037d, B:134:0x0390, B:137:0x03a3, B:139:0x03bb, B:141:0x03c1, B:142:0x03c6, B:144:0x03cc, B:112:0x0328, B:152:0x03f6, B:154:0x042d, B:155:0x0430, B:157:0x0434, B:158:0x0437, B:166:0x048d, B:168:0x0491, B:89:0x0242, B:59:0x01b8, B:30:0x00bb, B:32:0x00bf, B:36:0x00d0, B:38:0x00ea, B:40:0x00f4, B:43:0x00fe), top: B:181:0x009e, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024e A[Catch: all -> 0x04b6, TRY_LEAVE, TryCatch #3 {all -> 0x04b6, blocks: (B:24:0x009e, B:26:0x00ac, B:44:0x010d, B:46:0x0119, B:48:0x0130, B:49:0x0158, B:51:0x015f, B:53:0x01a2, B:63:0x01ce, B:65:0x01d9, B:70:0x01e8, B:72:0x01f0, B:74:0x01f6, B:78:0x0205, B:80:0x0208, B:83:0x022d, B:85:0x0232, B:86:0x023a, B:92:0x024e, B:95:0x0262, B:97:0x0289, B:98:0x0297, B:100:0x02ce, B:101:0x02d1, B:103:0x02d5, B:104:0x02d8, B:106:0x02f9, B:147:0x03d9, B:148:0x03de, B:149:0x03ee, B:159:0x0448, B:161:0x0458, B:163:0x0472, B:164:0x0479, B:165:0x0489, B:169:0x04a7, B:109:0x0315, B:114:0x0340, B:116:0x0348, B:118:0x0352, B:123:0x0368, B:127:0x0372, B:131:0x037d, B:134:0x0390, B:137:0x03a3, B:139:0x03bb, B:141:0x03c1, B:142:0x03c6, B:144:0x03cc, B:112:0x0328, B:152:0x03f6, B:154:0x042d, B:155:0x0430, B:157:0x0434, B:158:0x0437, B:166:0x048d, B:168:0x0491, B:89:0x0242, B:59:0x01b8, B:30:0x00bb, B:32:0x00bf, B:36:0x00d0, B:38:0x00ea, B:40:0x00f4, B:43:0x00fe), top: B:181:0x009e, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.measurement.internal.fa r22) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.b(com.google.android.gms.measurement.internal.fa):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(oa oaVar) {
        fa a2 = a(oaVar.f7562b);
        if (a2 != null) {
            b(oaVar, a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(oa oaVar, fa faVar) {
        com.google.android.gms.common.internal.s.a(oaVar);
        com.google.android.gms.common.internal.s.b(oaVar.f7562b);
        com.google.android.gms.common.internal.s.a(oaVar.f7564d);
        com.google.android.gms.common.internal.s.b(oaVar.f7564d.f7816c);
        y();
        o();
        if (!e(faVar)) {
            return;
        }
        if (!faVar.i) {
            c(faVar);
            return;
        }
        i().y();
        try {
            c(faVar);
            oa d2 = i().d(oaVar.f7562b, oaVar.f7564d.f7816c);
            if (d2 != null) {
                this.i.c().A().a("Removing conditional user property", oaVar.f7562b, this.i.v().c(oaVar.f7564d.f7816c));
                i().e(oaVar.f7562b, oaVar.f7564d.f7816c);
                if (d2.f7566f) {
                    i().b(oaVar.f7562b, oaVar.f7564d.f7816c);
                }
                if (oaVar.l != null) {
                    Bundle bundle = null;
                    if (oaVar.l.f7570c != null) {
                        bundle = oaVar.l.f7570c.j();
                    }
                    c(this.i.u().a(oaVar.f7562b, oaVar.l.f7569b, bundle, d2.f7563c, oaVar.l.f7572e, true, false), faVar);
                }
            } else {
                this.i.c().v().a("Conditional user property doesn't exist", z3.a(oaVar.f7562b), this.i.v().c(oaVar.f7564d.f7816c));
            }
            i().t();
        } finally {
            i().z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(y9 y9Var, fa faVar) {
        y();
        o();
        if (!e(faVar)) {
            return;
        }
        if (!faVar.i) {
            c(faVar);
        } else if ("_npa".equals(y9Var.f7816c) && faVar.t != null) {
            this.i.c().A().a("Falling back to manifest metadata value for ad personalization");
            a(new y9("_npa", this.i.b().a(), Long.valueOf(faVar.t.booleanValue() ? 1L : 0L), "auto"), faVar);
        } else {
            this.i.c().A().a("Removing user property", this.i.v().c(y9Var.f7816c));
            i().y();
            try {
                c(faVar);
                i().b(faVar.f7303b, y9Var.f7816c);
                i().t();
                this.i.c().A().a("User property removed", this.i.v().c(y9Var.f7816c));
            } finally {
                i().z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final f4 c(fa faVar) {
        y();
        o();
        com.google.android.gms.common.internal.s.a(faVar);
        com.google.android.gms.common.internal.s.b(faVar.f7303b);
        f4 b2 = i().b(faVar.f7303b);
        String b3 = this.i.o().b(faVar.f7303b);
        if (!c.e.a.b.d.g.oa.a() || !this.i.n().a(r.u0)) {
            return a(faVar, b2, b3);
        }
        if (b2 == null) {
            b2 = new f4(this.i, faVar.f7303b);
            b2.a(this.i.u().v());
            b2.e(b3);
        } else if (!b3.equals(b2.q())) {
            b2.e(b3);
            b2.a(this.i.u().v());
        }
        b2.b(faVar.f7304c);
        b2.c(faVar.s);
        if (cb.a() && this.i.n().e(b2.l(), r.o0)) {
            b2.d(faVar.w);
        }
        if (!TextUtils.isEmpty(faVar.l)) {
            b2.f(faVar.l);
        }
        long j = faVar.f7307f;
        if (j != 0) {
            b2.d(j);
        }
        if (!TextUtils.isEmpty(faVar.f7305d)) {
            b2.g(faVar.f7305d);
        }
        b2.c(faVar.k);
        String str = faVar.f7306e;
        if (str != null) {
            b2.h(str);
        }
        b2.e(faVar.f7308g);
        b2.a(faVar.i);
        if (!TextUtils.isEmpty(faVar.f7309h)) {
            b2.i(faVar.f7309h);
        }
        if (!this.i.n().a(r.M0)) {
            b2.p(faVar.m);
        }
        b2.b(faVar.p);
        b2.c(faVar.q);
        b2.a(faVar.t);
        b2.f(faVar.u);
        if (b2.a()) {
            i().a(b2);
        }
        return b2;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final z3 c() {
        return this.i.c();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final Context d() {
        return this.i.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(fa faVar) {
        try {
            return (String) this.i.a().a(new u9(this, faVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.i.c().s().a("Failed to get app instance id. appId", z3.a(faVar.f7303b), e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        this.i.a().g();
        i().B();
        if (this.i.o().f7486e.a() == 0) {
            this.i.o().f7486e.a(this.i.b().a());
        }
        B();
    }

    public final qa f() {
        return this.i.n();
    }

    public final y4 g() {
        b(this.f7657a);
        return this.f7657a;
    }

    public final h4 h() {
        b(this.f7658b);
        return this.f7658b;
    }

    public final e i() {
        b(this.f7659c);
        return this.f7659c;
    }

    public final ga j() {
        b(this.f7662f);
        return this.f7662f;
    }

    public final o7 k() {
        b(this.f7664h);
        return this.f7664h;
    }

    public final v9 l() {
        b(this.f7663g);
        return this.f7663g;
    }

    public final x3 m() {
        return this.i.v();
    }

    public final z9 n() {
        return this.i.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        if (this.j) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        f4 b2;
        String str;
        b4 B;
        String str2;
        y();
        o();
        this.r = true;
        try {
            this.i.w();
            Boolean G = this.i.E().G();
            if (G == null) {
                B = this.i.c().v();
                str2 = "Upload data called on the client side before use of service was decided";
            } else if (!G.booleanValue()) {
                if (this.l <= 0) {
                    y();
                    if (this.u != null) {
                        B = this.i.c().B();
                        str2 = "Uploading requested multiple times";
                    } else if (h().t()) {
                        long a2 = this.i.b().a();
                        int b3 = this.i.n().b(null, r.Q);
                        long x2 = a2 - qa.x();
                        for (int i = 0; i < b3 && a((String) null, x2); i++) {
                        }
                        long a3 = this.i.o().f7486e.a();
                        if (a3 != 0) {
                            this.i.c().A().a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a2 - a3)));
                        }
                        String v = i().v();
                        if (!TextUtils.isEmpty(v)) {
                            if (this.w == -1) {
                                this.w = i().x();
                            }
                            List<Pair<c.e.a.b.d.g.m1, Long>> a4 = i().a(v, this.i.n().b(v, r.f7636g), Math.max(0, this.i.n().b(v, r.f7637h)));
                            if (!a4.isEmpty()) {
                                Iterator<Pair<c.e.a.b.d.g.m1, Long>> it = a4.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        str = null;
                                        break;
                                    }
                                    c.e.a.b.d.g.m1 m1Var = (c.e.a.b.d.g.m1) it.next().first;
                                    if (!TextUtils.isEmpty(m1Var.r())) {
                                        str = m1Var.r();
                                        break;
                                    }
                                }
                                if (str != null) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= a4.size()) {
                                            break;
                                        }
                                        c.e.a.b.d.g.m1 m1Var2 = (c.e.a.b.d.g.m1) a4.get(i2).first;
                                        if (!TextUtils.isEmpty(m1Var2.r()) && !m1Var2.r().equals(str)) {
                                            a4 = a4.subList(0, i2);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                l1.a o = c.e.a.b.d.g.l1.o();
                                int size = a4.size();
                                ArrayList arrayList = new ArrayList(a4.size());
                                boolean g2 = this.i.n().g(v);
                                for (int i3 = 0; i3 < size; i3++) {
                                    m1.a j = ((c.e.a.b.d.g.m1) a4.get(i3).first).j();
                                    arrayList.add((Long) a4.get(i3).second);
                                    j.g(this.i.n().n());
                                    j.a(a2);
                                    this.i.w();
                                    j.b(false);
                                    if (!g2) {
                                        j.x();
                                    }
                                    if (this.i.n().e(v, r.Z)) {
                                        j.l(l().a(((c.e.a.b.d.g.m1) ((c.e.a.b.d.g.b5) j.i())).f()));
                                    }
                                    o.a(j);
                                }
                                String a5 = this.i.c().a(2) ? l().a((c.e.a.b.d.g.l1) ((c.e.a.b.d.g.b5) o.i())) : null;
                                l();
                                byte[] f2 = ((c.e.a.b.d.g.l1) ((c.e.a.b.d.g.b5) o.i())).f();
                                String a6 = r.q.a(null);
                                try {
                                    URL url = new URL(a6);
                                    com.google.android.gms.common.internal.s.a(!arrayList.isEmpty());
                                    if (this.u != null) {
                                        this.i.c().s().a("Set uploading progress before finishing the previous upload");
                                    } else {
                                        this.u = new ArrayList(arrayList);
                                    }
                                    this.i.o().f7487f.a(a2);
                                    String str3 = "?";
                                    if (size > 0) {
                                        str3 = o.a(0).p0();
                                    }
                                    this.i.c().B().a("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(f2.length), a5);
                                    this.q = true;
                                    h4 h2 = h();
                                    t9 t9Var = new t9(this, v);
                                    h2.g();
                                    h2.q();
                                    com.google.android.gms.common.internal.s.a(url);
                                    com.google.android.gms.common.internal.s.a(f2);
                                    com.google.android.gms.common.internal.s.a(t9Var);
                                    h2.a().b(new l4(h2, v, url, f2, null, t9Var));
                                } catch (MalformedURLException unused) {
                                    this.i.c().s().a("Failed to parse upload URL. Not uploading. appId", z3.a(v), a6);
                                }
                            }
                        } else {
                            this.w = -1L;
                            String a7 = i().a(a2 - qa.x());
                            if (!TextUtils.isEmpty(a7) && (b2 = i().b(a7)) != null) {
                                a(b2);
                            }
                        }
                    } else {
                        this.i.c().B().a("Network not connected, ignoring upload request");
                    }
                }
                B();
            } else {
                B = this.i.c().s();
                str2 = "Upload called in the client side when service should be used";
            }
            B.a(str2);
        } finally {
            this.r = false;
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        b4 s;
        Integer valueOf;
        Integer valueOf2;
        String str;
        y();
        o();
        if (!this.k) {
            this.k = true;
            if (!u()) {
                return;
            }
            int a2 = a(this.t);
            int F = this.i.G().F();
            y();
            if (a2 > F) {
                s = this.i.c().s();
                valueOf = Integer.valueOf(a2);
                valueOf2 = Integer.valueOf(F);
                str = "Panic: can't downgrade version. Previous, current version";
            } else if (a2 >= F) {
                return;
            } else {
                if (a(F, this.t)) {
                    s = this.i.c().B();
                    valueOf = Integer.valueOf(a2);
                    valueOf2 = Integer.valueOf(F);
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    s = this.i.c().s();
                    valueOf = Integer.valueOf(a2);
                    valueOf2 = Integer.valueOf(F);
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            s.a(str, valueOf, valueOf2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        this.o++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d5 s() {
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final pa w() {
        return this.i.w();
    }
}
