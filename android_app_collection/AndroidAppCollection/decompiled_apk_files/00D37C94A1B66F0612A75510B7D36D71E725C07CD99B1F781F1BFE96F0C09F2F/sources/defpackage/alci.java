package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.youtube.upload.service.UploadService;
import com.google.android.libraries.youtube.upload.service.UploadsBootReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alci  reason: default package */
/* loaded from: classes.dex */
public final class alci implements alal, albt, alfa, algp {
    public final Context c;
    public final Executor d;
    public final Executor e;
    public final akzp f;
    public final akze g;
    public final algq h;
    public final alck i;
    public final alfb j;
    public final boolean k;
    public int l;
    final zer n;
    String p;
    final HashMap q;
    final Set r;
    final Set s;
    private final snc t;
    private final alak u;
    private final albs v;
    private final albo w;
    private final ylm x;
    boolean a = false;
    boolean b = false;
    int m = 0;
    public final Object o = new Object();

    public alci(Context context, snc sncVar, aadd aaddVar, Executor executor, Executor executor2, akzp akzpVar, akze akzeVar, algq algqVar, alak alakVar, alck alckVar, albs albsVar, albo alboVar, alfb alfbVar) {
        boolean z = false;
        this.c = context;
        this.t = sncVar;
        this.d = executor;
        this.e = executor2;
        this.f = akzpVar;
        this.g = akzeVar;
        this.h = algqVar;
        this.u = alakVar;
        this.i = alckVar;
        this.v = albsVar;
        this.w = alboVar;
        this.j = alfbVar;
        if (aaddVar.a() != null) {
            avvf avvfVar = aaddVar.a().h;
            if ((avvfVar == null ? avvf.a : avvfVar).B) {
                z = true;
            }
        }
        this.k = z;
        this.q = new HashMap();
        this.r = new HashSet();
        this.s = new HashSet();
        this.x = new alcg(UploadService.class);
        this.n = new alcf(alckVar);
    }

    private final void I(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Job finished ".concat(valueOf);
        }
        synchronized (this.o) {
            alch alchVar = (alch) this.q.get(str);
            if (alchVar != null) {
                alchVar.c = true;
                this.r.add(str);
            }
        }
    }

    public final void A(final String str) {
        this.d.execute(new Runnable() { // from class: albz
            @Override // java.lang.Runnable
            public final void run() {
                alci alciVar = alci.this;
                String str2 = str;
                synchronized (alciVar.o) {
                    alciVar.z(str2);
                }
                alciVar.G();
            }
        });
    }

    @Deprecated
    public final void B(alcm alcmVar) {
        D(null);
        (this.k ? this.e : this.d).execute(new albx(this, alcmVar, 1));
    }

    public final void C() {
        if (!this.b) {
            this.u.p(this);
            this.v.b(this);
            this.w.b(this);
            this.h.a(this);
            this.j.a.addIfAbsent(this);
            this.b = true;
            H();
        }
    }

    public final void D(Uri uri) {
        Intent intent = new Intent(this.c, UploadService.class);
        if (uri != null) {
            try {
                this.c.getContentResolver().takePersistableUriPermission(uri, 1);
            } catch (SecurityException unused) {
            }
            intent.setData(uri);
            intent.setFlags(1);
        }
        zgt.I(this.c, intent);
    }

    public final void E(Uri uri) {
        ylr.c();
        D(uri);
        (this.k ? this.e : this.d).execute(new alcd(this));
    }

    public final void F() {
        alcn alcnVar = (alcn) this.x.b();
        if (alcnVar != null) {
            UploadService uploadService = alcnVar.a;
            uploadService.a = false;
            if (Build.VERSION.SDK_INT < 24 || uploadService.getApplicationInfo().targetSdkVersion < 24) {
                uploadService.stopForeground(false);
            } else {
                uploadService.stopForeground(2);
            }
            uploadService.stopSelf();
            this.x.d(this.c);
            if (this.a) {
                Context context = this.c;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, UploadsBootReceiver.class), 2, 1);
                this.a = false;
            }
        }
        NotificationManager notificationManager = (NotificationManager) this.c.getSystemService("notification");
        if (this.s.isEmpty()) {
            notificationManager.cancel(5);
        } else {
            H();
            fi fiVar = (fi) this.n.get();
            this.i.a(fiVar, this.m);
            notificationManager.notify(5, fiVar.b());
        }
        if (this.b) {
            this.u.q(this);
            this.v.d(this);
            this.w.d(this);
            this.h.b.remove(this);
            this.j.a.remove(this);
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G() {
        this.d.execute(new Runnable() { // from class: alce
            /* JADX WARN: Removed duplicated region for block: B:102:0x0244  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x0272 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:9:0x0010, B:13:0x002e, B:15:0x003d, B:16:0x0041, B:18:0x0057, B:109:0x0258, B:110:0x026a, B:112:0x0272, B:113:0x0278, B:115:0x027e, B:116:0x028b, B:118:0x028f, B:119:0x0292, B:20:0x0061, B:22:0x0090, B:24:0x009a, B:26:0x00a6, B:28:0x00ac, B:37:0x0113, B:39:0x011b, B:41:0x0125, B:43:0x012a, B:44:0x0134, B:46:0x013c, B:48:0x0168, B:50:0x0177, B:54:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:67:0x01b7, B:69:0x01be, B:85:0x01f2, B:87:0x01f6, B:89:0x0211, B:94:0x022d, B:96:0x0232, B:104:0x0248, B:106:0x024c, B:107:0x0255, B:101:0x023b, B:90:0x0219, B:92:0x0223, B:74:0x01cd, B:76:0x01d2, B:79:0x01dc, B:81:0x01e1, B:82:0x01e7, B:84:0x01ec, B:31:0x00f2, B:33:0x00f8, B:34:0x0103, B:36:0x0109, B:12:0x0025), top: B:126:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x028f A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:9:0x0010, B:13:0x002e, B:15:0x003d, B:16:0x0041, B:18:0x0057, B:109:0x0258, B:110:0x026a, B:112:0x0272, B:113:0x0278, B:115:0x027e, B:116:0x028b, B:118:0x028f, B:119:0x0292, B:20:0x0061, B:22:0x0090, B:24:0x009a, B:26:0x00a6, B:28:0x00ac, B:37:0x0113, B:39:0x011b, B:41:0x0125, B:43:0x012a, B:44:0x0134, B:46:0x013c, B:48:0x0168, B:50:0x0177, B:54:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:67:0x01b7, B:69:0x01be, B:85:0x01f2, B:87:0x01f6, B:89:0x0211, B:94:0x022d, B:96:0x0232, B:104:0x0248, B:106:0x024c, B:107:0x0255, B:101:0x023b, B:90:0x0219, B:92:0x0223, B:74:0x01cd, B:76:0x01d2, B:79:0x01dc, B:81:0x01e1, B:82:0x01e7, B:84:0x01ec, B:31:0x00f2, B:33:0x00f8, B:34:0x0103, B:36:0x0109, B:12:0x0025), top: B:126:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0198 A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:9:0x0010, B:13:0x002e, B:15:0x003d, B:16:0x0041, B:18:0x0057, B:109:0x0258, B:110:0x026a, B:112:0x0272, B:113:0x0278, B:115:0x027e, B:116:0x028b, B:118:0x028f, B:119:0x0292, B:20:0x0061, B:22:0x0090, B:24:0x009a, B:26:0x00a6, B:28:0x00ac, B:37:0x0113, B:39:0x011b, B:41:0x0125, B:43:0x012a, B:44:0x0134, B:46:0x013c, B:48:0x0168, B:50:0x0177, B:54:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:67:0x01b7, B:69:0x01be, B:85:0x01f2, B:87:0x01f6, B:89:0x0211, B:94:0x022d, B:96:0x0232, B:104:0x0248, B:106:0x024c, B:107:0x0255, B:101:0x023b, B:90:0x0219, B:92:0x0223, B:74:0x01cd, B:76:0x01d2, B:79:0x01dc, B:81:0x01e1, B:82:0x01e7, B:84:0x01ec, B:31:0x00f2, B:33:0x00f8, B:34:0x0103, B:36:0x0109, B:12:0x0025), top: B:126:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01b7 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:9:0x0010, B:13:0x002e, B:15:0x003d, B:16:0x0041, B:18:0x0057, B:109:0x0258, B:110:0x026a, B:112:0x0272, B:113:0x0278, B:115:0x027e, B:116:0x028b, B:118:0x028f, B:119:0x0292, B:20:0x0061, B:22:0x0090, B:24:0x009a, B:26:0x00a6, B:28:0x00ac, B:37:0x0113, B:39:0x011b, B:41:0x0125, B:43:0x012a, B:44:0x0134, B:46:0x013c, B:48:0x0168, B:50:0x0177, B:54:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:67:0x01b7, B:69:0x01be, B:85:0x01f2, B:87:0x01f6, B:89:0x0211, B:94:0x022d, B:96:0x0232, B:104:0x0248, B:106:0x024c, B:107:0x0255, B:101:0x023b, B:90:0x0219, B:92:0x0223, B:74:0x01cd, B:76:0x01d2, B:79:0x01dc, B:81:0x01e1, B:82:0x01e7, B:84:0x01ec, B:31:0x00f2, B:33:0x00f8, B:34:0x0103, B:36:0x0109, B:12:0x0025), top: B:126:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x01f6 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:9:0x0010, B:13:0x002e, B:15:0x003d, B:16:0x0041, B:18:0x0057, B:109:0x0258, B:110:0x026a, B:112:0x0272, B:113:0x0278, B:115:0x027e, B:116:0x028b, B:118:0x028f, B:119:0x0292, B:20:0x0061, B:22:0x0090, B:24:0x009a, B:26:0x00a6, B:28:0x00ac, B:37:0x0113, B:39:0x011b, B:41:0x0125, B:43:0x012a, B:44:0x0134, B:46:0x013c, B:48:0x0168, B:50:0x0177, B:54:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:67:0x01b7, B:69:0x01be, B:85:0x01f2, B:87:0x01f6, B:89:0x0211, B:94:0x022d, B:96:0x0232, B:104:0x0248, B:106:0x024c, B:107:0x0255, B:101:0x023b, B:90:0x0219, B:92:0x0223, B:74:0x01cd, B:76:0x01d2, B:79:0x01dc, B:81:0x01e1, B:82:0x01e7, B:84:0x01ec, B:31:0x00f2, B:33:0x00f8, B:34:0x0103, B:36:0x0109, B:12:0x0025), top: B:126:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0219 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:9:0x0010, B:13:0x002e, B:15:0x003d, B:16:0x0041, B:18:0x0057, B:109:0x0258, B:110:0x026a, B:112:0x0272, B:113:0x0278, B:115:0x027e, B:116:0x028b, B:118:0x028f, B:119:0x0292, B:20:0x0061, B:22:0x0090, B:24:0x009a, B:26:0x00a6, B:28:0x00ac, B:37:0x0113, B:39:0x011b, B:41:0x0125, B:43:0x012a, B:44:0x0134, B:46:0x013c, B:48:0x0168, B:50:0x0177, B:54:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:67:0x01b7, B:69:0x01be, B:85:0x01f2, B:87:0x01f6, B:89:0x0211, B:94:0x022d, B:96:0x0232, B:104:0x0248, B:106:0x024c, B:107:0x0255, B:101:0x023b, B:90:0x0219, B:92:0x0223, B:74:0x01cd, B:76:0x01d2, B:79:0x01dc, B:81:0x01e1, B:82:0x01e7, B:84:0x01ec, B:31:0x00f2, B:33:0x00f8, B:34:0x0103, B:36:0x0109, B:12:0x0025), top: B:126:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0232 A[Catch: all -> 0x0294, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x000e, B:9:0x0010, B:13:0x002e, B:15:0x003d, B:16:0x0041, B:18:0x0057, B:109:0x0258, B:110:0x026a, B:112:0x0272, B:113:0x0278, B:115:0x027e, B:116:0x028b, B:118:0x028f, B:119:0x0292, B:20:0x0061, B:22:0x0090, B:24:0x009a, B:26:0x00a6, B:28:0x00ac, B:37:0x0113, B:39:0x011b, B:41:0x0125, B:43:0x012a, B:44:0x0134, B:46:0x013c, B:48:0x0168, B:50:0x0177, B:54:0x018a, B:57:0x0192, B:59:0x0198, B:63:0x01ab, B:67:0x01b7, B:69:0x01be, B:85:0x01f2, B:87:0x01f6, B:89:0x0211, B:94:0x022d, B:96:0x0232, B:104:0x0248, B:106:0x024c, B:107:0x0255, B:101:0x023b, B:90:0x0219, B:92:0x0223, B:74:0x01cd, B:76:0x01d2, B:79:0x01dc, B:81:0x01e1, B:82:0x01e7, B:84:0x01ec, B:31:0x00f2, B:33:0x00f8, B:34:0x0103, B:36:0x0109, B:12:0x0025), top: B:126:0x0007, inners: #1 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 665
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.alce.run():void");
            }
        });
    }

    public final void H() {
        int i;
        synchronized (this.o) {
            if (this.w.i()) {
                i = 1;
            } else {
                i = this.w.h() ? 2 : 0;
            }
            this.m = i;
        }
    }

    @Override // defpackage.alal
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.alal
    public final void b(String str, long j, long j2) {
        synchronized (this.o) {
            if (str == null) {
                return;
            }
            alch alchVar = (alch) this.q.get(str);
            if (alchVar == null) {
                return;
            }
            alchVar.g = j;
            alchVar.f = j2;
            G();
        }
    }

    @Override // defpackage.alal
    public final void c(String str, alda aldaVar) {
        G();
    }

    @Override // defpackage.alal
    public final /* synthetic */ void d(String str, augw augwVar) {
    }

    @Override // defpackage.alal
    public final void e(String str, double d) {
        synchronized (this.o) {
            if (str == null) {
                return;
            }
            alch alchVar = (alch) this.q.get(str);
            if (alchVar == null) {
                return;
            }
            alchVar.h = d;
            G();
        }
    }

    @Override // defpackage.alal
    public final void f(String str, long j, long j2, double d) {
        if (str == null) {
            return;
        }
        synchronized (this.o) {
            alch alchVar = (alch) this.q.get(str);
            if (alchVar == null) {
                return;
            }
            alchVar.e = j;
            alchVar.f = j2;
            G();
        }
    }

    @Override // defpackage.alal
    public final void g(String str, alct alctVar) {
        G();
    }

    @Override // defpackage.alal
    public final /* synthetic */ void h(alcw alcwVar) {
    }

    @Override // defpackage.alal
    public final void i(String str, alcw alcwVar) {
        G();
    }

    @Override // defpackage.alal
    public final void j(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadFailed ".concat(valueOf);
        }
        I(str);
        G();
    }

    @Override // defpackage.alal
    public final /* synthetic */ void k(String str, boolean z) {
    }

    @Override // defpackage.alal
    public final void l(String str, avvd avvdVar) {
        G();
    }

    @Override // defpackage.alal
    public final void m(String str, String str2) {
        G();
    }

    @Override // defpackage.alal
    public final void n(String str, alcv alcvVar) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onVideoStatusChange ".concat(valueOf);
        }
        if (alcvVar != alcv.UNKNOWN) {
            I(str);
        }
        G();
    }

    @Override // defpackage.alal
    public final void o(String str, int i) {
        G();
    }

    @Override // defpackage.algp
    public final void p(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanAbortedExecution ".concat(valueOf);
        }
        I(str);
        G();
    }

    @Override // defpackage.algp
    public final void q(String str, alcw alcwVar) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanAdded ".concat(valueOf);
        }
        if (!this.j.b(alcwVar)) {
            I(str);
            G();
        }
    }

    @Override // defpackage.algp
    public final void r(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanCompleted ".concat(valueOf);
        }
        I(str);
        G();
    }

    @Override // defpackage.algp
    public final void s(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanPaused ".concat(valueOf);
        }
        H();
        G();
    }

    @Override // defpackage.albt
    public final void sb(albu albuVar) {
        this.d.execute(new alcd(this, 1));
    }

    @Override // defpackage.algp
    public final void t(String str) {
        synchronized (this.o) {
            I(str);
            this.s.add(str);
        }
        G();
    }

    public final void u(alcm alcmVar) {
        String str = alcmVar.a;
        Bitmap bitmap = alcmVar.b;
        byte[] bArr = alcmVar.c;
        if (((alch) this.q.get(str)) != null) {
            return;
        }
        alch alchVar = new alch(str);
        alchVar.b = this.t.c();
        alchVar.i = bArr;
        if (bitmap != null) {
            Resources resources = this.c.getResources();
            try {
                alchVar.d = ThumbnailUtils.extractThumbnail(bitmap, (int) resources.getDimension(17104901), (int) resources.getDimension(17104902));
            } catch (IllegalArgumentException e) {
                zep.i("Extracting thumbnail failed", e);
                alchVar.d = null;
            }
        }
        this.q.put(alchVar.a, alchVar);
        this.s.remove(alchVar.a);
        if (this.p != null) {
            return;
        }
        this.p = alchVar.a;
    }

    public final void v(final String str) {
        D(null);
        ylx.j(anii.i(anlz.v(new aniq() { // from class: alcb
            @Override // defpackage.aniq
            public final ankt a() {
                alci alciVar = alci.this;
                String str2 = str;
                synchronized (alciVar.o) {
                    alciVar.w();
                    alciVar.u(alcm.a(str2).a());
                    alciVar.C();
                }
                return ankq.a;
            }
        }, this.k ? this.e : this.d), new anir() { // from class: alcc
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                alci alciVar = alci.this;
                Void r3 = (Void) obj;
                alciVar.h.i(str);
                alciVar.G();
                return ankq.a;
            }
        }, this.d), this.d, new ylv() { // from class: albw
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                alci alciVar = alci.this;
                zep.f("ForegroundUploadController", "Cannot cancel the executing flow.", th);
                alciVar.g.b("Cannot cancel the executing flow.", th);
                alciVar.G();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        alcn alcnVar = (alcn) this.x.b();
        if (alcnVar == null) {
            alcnVar = (alcn) this.x.a(this.c);
        }
        Notification b = ((fi) this.n.get()).b();
        UploadService uploadService = alcnVar.a;
        if (!uploadService.a) {
            uploadService.a = true;
            uploadService.startForeground(5, b);
        }
        if (!this.a) {
            Context context = this.c;
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, UploadsBootReceiver.class), 1, 1);
            this.a = true;
        }
    }

    public final void x(alfd alfdVar) {
        this.d.execute(new alby(this, alfdVar, 1));
    }

    @Override // defpackage.alfa
    public final void y(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "onUploadPlanNotificationCompleted ".concat(valueOf);
        }
        I(str);
        G();
    }

    public final void z(String str) {
        String str2;
        alch alchVar = (alch) this.q.remove(str);
        String str3 = this.p;
        if (str3 == null || !str3.equals(str) || alchVar == null) {
            return;
        }
        synchronized (this.o) {
            long j = alchVar.b;
            str2 = null;
            long j2 = Long.MAX_VALUE;
            for (String str4 : this.q.keySet()) {
                alch alchVar2 = (alch) this.q.get(str4);
                if (!alchVar2.c) {
                    long j3 = alchVar2.b;
                    if (j3 > j && j3 < j2) {
                        str2 = str4;
                        j2 = j3;
                    }
                }
            }
        }
        this.p = str2;
    }
}
