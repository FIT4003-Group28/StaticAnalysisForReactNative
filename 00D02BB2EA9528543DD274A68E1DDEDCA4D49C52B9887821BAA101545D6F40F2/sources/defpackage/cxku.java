package defpackage;

import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.StrictMode;
import android.util.Base64;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cxku  reason: default package */
/* loaded from: classes5.dex */
final class cxku extends cxlb<String> {
    static volatile boolean a;
    public static final /* synthetic */ int b = 0;
    private static dbsg<Boolean> h = dbpy.a;

    public cxku(cxji cxjiVar, String str) {
        super(cxjiVar, str);
    }

    private final Map<String, String> g(ContentResolver contentResolver, Uri uri, String[] strArr, final CancellationSignal cancellationSignal) {
        dcdn<Object, Object> r;
        if (a) {
            return h();
        }
        dehu d = this.d.c().d(new Runnable(cancellationSignal) { // from class: cxkr
            private final CancellationSignal a;

            {
                this.a = cancellationSignal;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.cancel();
            }
        }, 2000L, TimeUnit.MILLISECONDS);
        try {
            Cursor query = contentResolver.query(uri, strArr, null, null, null, cancellationSignal);
            try {
                if (query == null) {
                    r = dcmn.a;
                } else {
                    HashMap f = dcjz.f(query.getCount());
                    while (query.moveToNext()) {
                        f.put(query.getString(0), query.getString(1));
                    }
                    r = dcdn.r(f);
                }
                d.cancel(true);
                if (query != null) {
                    query.close();
                }
                return r;
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException | OperationCanceledException | IllegalStateException | SecurityException e) {
            if (e instanceof OperationCanceledException) {
                a = true;
            }
            return h();
        }
    }

    private final Map<String, String> h() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(f(), "r");
        try {
            cxmx cxmxVar = (cxmx) dsqw.co(cxmx.h, randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length()));
            HashMap f = dcjz.f(cxmxVar.g.size() + 3);
            for (cxmz cxmzVar : cxmxVar.g) {
                String str = cxmzVar.d;
                String str2 = "";
                if (cxmzVar.b == 5) {
                    str2 = (String) cxmzVar.c;
                }
                f.put(str, str2);
            }
            f.put("__phenotype_server_token", cxmxVar.d);
            f.put("__phenotype_snapshot_token", cxmxVar.b);
            f.put("__phenotype_configuration_version", Long.toString(cxmxVar.e));
            dcdn r = dcdn.r(f);
            randomAccessFile.close();
            return r;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                deki.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cxlb
    public final Map<String, String> a() {
        boolean booleanValue;
        Uri a2 = cxjd.a(this.e);
        if (cxjc.a(this.d.b, a2)) {
            synchronized (cxku.class) {
                if (!h.a()) {
                    try {
                        h = dbsg.i(Boolean.valueOf(cnnm.a(this.d.b).c(this.d.b.getPackageManager().getPackageInfo("com.google.android.gms", 64))));
                    } catch (PackageManager.NameNotFoundException unused) {
                        h = dbsg.i(false);
                    }
                }
                booleanValue = h.b().booleanValue();
            }
            if (booleanValue) {
                ContentResolver contentResolver = this.d.b.getContentResolver();
                String[] strArr = cqvm.b(this.d.b) ? null : new String[]{"account", ""};
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    final Map<String, String> g = g(contentResolver, a2, strArr, new CancellationSignal());
                    this.d.c().execute(new Runnable(this, g) { // from class: cxkq
                        private final cxku a;
                        private final Map b;

                        {
                            this.a = this;
                            this.b = g;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c(this.b);
                        }
                    });
                    return g;
                } catch (Exception unused2) {
                    String str = this.e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
                    sb.append("Could not read flags for ");
                    sb.append(str);
                    sb.append(", falling back to default values");
                    sb.toString();
                    return dcmn.a;
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                }
            }
        }
        return dcmn.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cxlb
    public final void b() {
        if (this.f.b != null) {
            final Map<String, T> map = this.f.b;
            cpcq<Configurations> b2 = coxs.a(this.d.b).b(this.e, "", map != 0 ? (String) map.get("__phenotype_snapshot_token") : null);
            dehq c = this.d.c();
            final cpcf cpcfVar = new cpcf(this, map) { // from class: cxks
                private final cxku a;
                private final Map b;

                {
                    this.a = this;
                    this.b = map;
                }

                @Override // defpackage.cpcf
                public final void a(cpcq cpcqVar) {
                    Configurations configurations;
                    String str;
                    String l;
                    cxku cxkuVar = this.a;
                    Map map2 = this.b;
                    if (cpcqVar.b() && (configurations = (Configurations) cpcqVar.d()) != null && (str = configurations.a) != null && !str.isEmpty()) {
                        HashMap e = configurations.f ? dcjz.e(map2) : dcjz.d();
                        Configuration[] configurationArr = configurations.d;
                        int length = configurationArr.length;
                        int i = 0;
                        while (true) {
                            int i2 = 2;
                            int i3 = 1;
                            if (i < length) {
                                Configuration configuration = configurationArr[i];
                                Flag[] flagArr = configuration.b;
                                int length2 = flagArr.length;
                                int i4 = 0;
                                while (i4 < length2) {
                                    Flag flag = flagArr[i4];
                                    String str2 = flag.a;
                                    int i5 = flag.g;
                                    if (i5 == i3) {
                                        l = Long.toString(flag.b);
                                    } else if (i5 == i2) {
                                        l = true != flag.c ? "false" : "true";
                                    } else if (i5 == 3) {
                                        l = Double.toString(flag.d);
                                    } else if (i5 == 4) {
                                        l = flag.e;
                                    } else if (i5 == 5) {
                                        l = Base64.encodeToString(flag.f, 3);
                                    } else {
                                        StringBuilder sb = new StringBuilder(31);
                                        sb.append("Invalid enum value: ");
                                        sb.append(i5);
                                        throw new AssertionError(sb.toString());
                                    }
                                    e.put(str2, l);
                                    i4++;
                                    i2 = 2;
                                    i3 = 1;
                                }
                                for (String str3 : configuration.c) {
                                    e.remove(str3);
                                }
                                i++;
                            } else {
                                e.put("__phenotype_server_token", configurations.c);
                                e.put("__phenotype_snapshot_token", configurations.a);
                                e.put("__phenotype_configuration_version", Long.toString(configurations.g));
                                dcdn r = dcdn.r(e);
                                if (!cxkuVar.f.a(r)) {
                                    cxly.a(cxkuVar.d.c());
                                }
                                cxkuVar.c(r);
                                cxmw bZ = cxmx.h.bZ();
                                Configuration[] configurationArr2 = configurations.d;
                                if (configurationArr2 != null) {
                                    for (Configuration configuration2 : configurationArr2) {
                                        Flag[] flagArr2 = configuration2.b;
                                        if (flagArr2 != null) {
                                            for (Flag flag2 : flagArr2) {
                                                cxmy bZ2 = cxmz.e.bZ();
                                                String str4 = flag2.a;
                                                if (bZ2.c) {
                                                    bZ2.bF();
                                                    bZ2.c = false;
                                                }
                                                cxmz cxmzVar = (cxmz) bZ2.b;
                                                str4.getClass();
                                                cxmzVar.a |= 1;
                                                cxmzVar.d = str4;
                                                int i6 = flag2.g;
                                                if (i6 == 1) {
                                                    long a2 = flag2.a();
                                                    if (bZ2.c) {
                                                        bZ2.bF();
                                                        bZ2.c = false;
                                                    }
                                                    cxmz cxmzVar2 = (cxmz) bZ2.b;
                                                    cxmzVar2.b = 2;
                                                    cxmzVar2.c = Long.valueOf(a2);
                                                } else if (i6 == 2) {
                                                    boolean b3 = flag2.b();
                                                    if (bZ2.c) {
                                                        bZ2.bF();
                                                        bZ2.c = false;
                                                    }
                                                    cxmz cxmzVar3 = (cxmz) bZ2.b;
                                                    cxmzVar3.b = 3;
                                                    cxmzVar3.c = Boolean.valueOf(b3);
                                                } else if (i6 == 3) {
                                                    double c2 = flag2.c();
                                                    if (bZ2.c) {
                                                        bZ2.bF();
                                                        bZ2.c = false;
                                                    }
                                                    cxmz cxmzVar4 = (cxmz) bZ2.b;
                                                    cxmzVar4.b = 4;
                                                    cxmzVar4.c = Double.valueOf(c2);
                                                } else if (i6 == 4) {
                                                    String d = flag2.d();
                                                    if (bZ2.c) {
                                                        bZ2.bF();
                                                        bZ2.c = false;
                                                    }
                                                    cxmz cxmzVar5 = (cxmz) bZ2.b;
                                                    d.getClass();
                                                    cxmzVar5.b = 5;
                                                    cxmzVar5.c = d;
                                                } else if (i6 == 5) {
                                                    dspd x = dspd.x(flag2.e());
                                                    if (bZ2.c) {
                                                        bZ2.bF();
                                                        bZ2.c = false;
                                                    }
                                                    cxmz cxmzVar6 = (cxmz) bZ2.b;
                                                    x.getClass();
                                                    cxmzVar6.b = 6;
                                                    cxmzVar6.c = x;
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder(39);
                                                    sb2.append("Impossible flag value type: ");
                                                    sb2.append(i6);
                                                    throw new AssertionError(sb2.toString());
                                                }
                                                bZ.a(bZ2);
                                            }
                                            continue;
                                        }
                                    }
                                }
                                String str5 = configurations.c;
                                if (str5 != null) {
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    cxmx cxmxVar = (cxmx) bZ.b;
                                    str5.getClass();
                                    cxmxVar.a |= 4;
                                    cxmxVar.d = str5;
                                }
                                String str6 = configurations.a;
                                if (str6 != null) {
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    cxmx cxmxVar2 = (cxmx) bZ.b;
                                    str6.getClass();
                                    cxmxVar2.a |= 1;
                                    cxmxVar2.b = str6;
                                }
                                long j = configurations.g;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                cxmx cxmxVar3 = (cxmx) bZ.b;
                                cxmxVar3.a |= 8;
                                cxmxVar3.e = j;
                                byte[] bArr = configurations.b;
                                if (bArr != null) {
                                    dspd x2 = dspd.x(bArr);
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    cxmx cxmxVar4 = (cxmx) bZ.b;
                                    x2.getClass();
                                    cxmxVar4.a |= 2;
                                    cxmxVar4.c = x2;
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                cxmx cxmxVar5 = (cxmx) bZ.b;
                                cxmxVar5.a |= 16;
                                cxmxVar5.f = currentTimeMillis;
                                final dehn<Void> d2 = cxmv.d(cxkuVar.d, cxkuVar.e, bZ.bK(), false);
                                d2.Pk(new Runnable(d2) { // from class: cxkt
                                    private final dehn a;

                                    {
                                        this.a = d2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        dehn dehnVar = this.a;
                                        int i7 = cxku.b;
                                        try {
                                            deha.r(dehnVar);
                                        } catch (ExecutionException unused) {
                                        }
                                    }
                                }, cxkuVar.d.c());
                                return;
                            }
                        }
                    }
                }
            };
            b2.n(c, new cpcf(cpcfVar) { // from class: cxlg
                private final cpcf a;

                {
                    this.a = cpcfVar;
                }

                @Override // defpackage.cpcf
                public final void a(cpcq cpcqVar) {
                    try {
                        this.a.a(cpcqVar);
                    } catch (Exception e) {
                        czhz.e(new Runnable(e) { // from class: cxlh
                            private final Exception a;

                            {
                                this.a = e;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                throw new RuntimeException(this.a);
                            }
                        });
                    }
                }
            });
        }
    }

    public final void c(Map<String, String> map) {
        File f = f();
        if (!map.isEmpty()) {
            cxmw bZ = cxmx.h.bZ();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if ("__phenotype_server_token".equals(entry.getKey())) {
                    String str = map.get("__phenotype_server_token");
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cxmx cxmxVar = (cxmx) bZ.b;
                    str.getClass();
                    cxmxVar.a |= 4;
                    cxmxVar.d = str;
                } else if ("__phenotype_snapshot_token".equals(entry.getKey())) {
                    String str2 = map.get("__phenotype_snapshot_token");
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cxmx cxmxVar2 = (cxmx) bZ.b;
                    str2.getClass();
                    cxmxVar2.a |= 1;
                    cxmxVar2.b = str2;
                } else if ("__phenotype_configuration_version".equals(entry.getKey())) {
                    long parseLong = Long.parseLong(map.get("__phenotype_configuration_version"));
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cxmx cxmxVar3 = (cxmx) bZ.b;
                    cxmxVar3.a |= 8;
                    cxmxVar3.e = parseLong;
                } else {
                    cxmy bZ2 = cxmz.e.bZ();
                    String key = entry.getKey();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cxmz cxmzVar = (cxmz) bZ2.b;
                    key.getClass();
                    cxmzVar.a |= 1;
                    cxmzVar.d = key;
                    String value = entry.getValue();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cxmz cxmzVar2 = (cxmz) bZ2.b;
                    value.getClass();
                    cxmzVar2.b = 5;
                    cxmzVar2.c = value;
                    bZ.a(bZ2);
                }
            }
            cxmx bK = bZ.bK();
            File dir = this.d.b.getDir("phenotype_file", 0);
            String str3 = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 8);
            sb.append("temp-");
            sb.append(str3);
            sb.append(".pb");
            File file = new File(dir, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bK.bT(fileOutputStream);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (!file.exists() || file.renameTo(f)) {
                    return;
                }
                file.delete();
            } catch (IOException unused) {
                file.delete();
            }
        } else if (f.exists()) {
            f.delete();
        }
    }
}
