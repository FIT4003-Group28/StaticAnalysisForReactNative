package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: aaqd  reason: default package */
/* loaded from: classes.dex */
public final class aaqd implements aaqx, aadb, ynl {
    public final azpm a;
    public final azpw b;
    public final azpw c;
    public final SharedPreferences d;
    public final ywk e;
    public final aaqc h;
    public final aaqc i;
    public int j;
    public volatile long k;
    public volatile long l;
    public volatile long m;
    private final snc n;
    private final File o;
    private final File p;
    private boolean q;
    public long f = -1;
    public long g = -1;
    private final ReentrantLock r = new ReentrantLock();

    public aaqd(SharedPreferences sharedPreferences, snc sncVar, azqb azqbVar, ywk ywkVar, File file) {
        this.d = sharedPreferences;
        this.n = sncVar;
        this.e = ywkVar;
        this.o = new File(file, "cfg/cg.pb");
        this.p = new File(file, "cfg/cg.pb.new");
        if (ywkVar != null) {
            this.j = (int) ywkVar.c(ywk.C);
        }
        this.i = new aaqc(aapz.e, aapz.b, aapz.c, apyy.a, (byte) 1);
        this.h = new aaqc(aapz.f, aapz.a, aapz.d, arhd.a, (byte) 2);
        if ((this.j & 4) == 0 && azqbVar != null) {
            ((yni) azqbVar.get()).g(this);
        }
        azpm e = azpm.e();
        this.a = e;
        azpw Y = azpw.Y();
        this.b = Y;
        azpw Y2 = azpw.Y();
        this.c = Y2;
        Y2.T(new aapw(this, 2), new aaga(2));
        Y.T(new aapw(this, 1), new aaga(3));
        e.an(arhd.a).T(new aapw(this), new aaga(4));
    }

    public static apej b(apyy apyyVar) {
        atfw atfwVar = apyyVar.k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        apej apejVar = atfwVar.q;
        return apejVar == null ? apej.a : apejVar;
    }

    public static void d(String str, Throwable th) {
        q(2, str, th);
    }

    public static void j(String str) {
        q(1, str, null);
    }

    public static final void m(String str, Throwable th) {
        d(str.concat(" restore failed"), th);
    }

    private final void n() {
        this.h.a = "";
    }

    private final boolean o() {
        avfg avfgVar = ((arhd) this.h.d).y;
        if (avfgVar == null) {
            avfgVar = avfg.a;
        }
        int i = this.j;
        int i2 = avfgVar.b;
        this.j = i2;
        return ((i2 ^ i) & 1) != 0;
    }

    private final boolean p() {
        try {
            OutputStream F = zgd.F(this.p);
            F.write(PrivateKeyType.INVALID);
            F.write(PrivateKeyType.INVALID);
            F.write(PrivateKeyType.INVALID);
            F.write(1);
            F.write(0);
            aaqb.b(F, b((apyy) this.i.d));
            this.i.c(F);
            this.h.c(F);
            F.close();
            zgd.G(this.o, aapy.a);
            return zgd.C(this.p, this.o, aapy.a);
        } catch (Exception e) {
            d("Failed to backup cfg", e);
            zgd.G(this.p, aapy.a);
            return false;
        }
    }

    private static void q(int i, String str, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (th == null) {
            afus.b(i, 18, str);
        } else {
            afus.c(i, 18, str, th);
        }
    }

    private final void r(SharedPreferences.Editor editor) {
        editor.putString("com.google.android.libraries.youtube.innertube.cold_config_group", this.i.a()).putString("com.google.android.libraries.youtube.innertube.cold_hash_data", this.i.a).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", this.i.b).putString("com.google.android.libraries.youtube.innertube.hot_config_group", this.h.a()).putString("com.google.android.libraries.youtube.innertube.hot_hash_data", this.h.a).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", this.h.b);
        this.f = this.i.c;
        this.g = this.h.b;
        zgd.G(this.o, aapy.a);
        zgd.G(this.p, aapy.a);
    }

    public final long a() {
        return this.n.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015a A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:35:0x00b4, B:37:0x00be, B:38:0x00c0, B:41:0x00ca, B:42:0x00d1, B:45:0x00db, B:46:0x00e2, B:48:0x00e6, B:49:0x00e8, B:52:0x00f5, B:53:0x00f9, B:65:0x0132, B:67:0x0156, B:69:0x015a, B:70:0x015c, B:73:0x0165, B:74:0x0169, B:84:0x01a0, B:86:0x01bd, B:88:0x01c3, B:90:0x01d7, B:91:0x01dc, B:92:0x01f4, B:94:0x01f8, B:95:0x0207, B:85:0x01b8, B:77:0x017b, B:79:0x0183, B:80:0x0188, B:82:0x018e, B:66:0x0151, B:56:0x010b, B:59:0x0114, B:61:0x011a, B:63:0x0120), top: B:102:0x00b4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[Catch: all -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:35:0x00b4, B:37:0x00be, B:38:0x00c0, B:41:0x00ca, B:42:0x00d1, B:45:0x00db, B:46:0x00e2, B:48:0x00e6, B:49:0x00e8, B:52:0x00f5, B:53:0x00f9, B:65:0x0132, B:67:0x0156, B:69:0x015a, B:70:0x015c, B:73:0x0165, B:74:0x0169, B:84:0x01a0, B:86:0x01bd, B:88:0x01c3, B:90:0x01d7, B:91:0x01dc, B:92:0x01f4, B:94:0x01f8, B:95:0x0207, B:85:0x01b8, B:77:0x017b, B:79:0x0183, B:80:0x0188, B:82:0x018e, B:66:0x0151, B:56:0x010b, B:59:0x0114, B:61:0x011a, B:63:0x0120), top: B:102:0x00b4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:35:0x00b4, B:37:0x00be, B:38:0x00c0, B:41:0x00ca, B:42:0x00d1, B:45:0x00db, B:46:0x00e2, B:48:0x00e6, B:49:0x00e8, B:52:0x00f5, B:53:0x00f9, B:65:0x0132, B:67:0x0156, B:69:0x015a, B:70:0x015c, B:73:0x0165, B:74:0x0169, B:84:0x01a0, B:86:0x01bd, B:88:0x01c3, B:90:0x01d7, B:91:0x01dc, B:92:0x01f4, B:94:0x01f8, B:95:0x0207, B:85:0x01b8, B:77:0x017b, B:79:0x0183, B:80:0x0188, B:82:0x018e, B:66:0x0151, B:56:0x010b, B:59:0x0114, B:61:0x011a, B:63:0x0120), top: B:102:0x00b4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b8 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:35:0x00b4, B:37:0x00be, B:38:0x00c0, B:41:0x00ca, B:42:0x00d1, B:45:0x00db, B:46:0x00e2, B:48:0x00e6, B:49:0x00e8, B:52:0x00f5, B:53:0x00f9, B:65:0x0132, B:67:0x0156, B:69:0x015a, B:70:0x015c, B:73:0x0165, B:74:0x0169, B:84:0x01a0, B:86:0x01bd, B:88:0x01c3, B:90:0x01d7, B:91:0x01dc, B:92:0x01f4, B:94:0x01f8, B:95:0x0207, B:85:0x01b8, B:77:0x017b, B:79:0x0183, B:80:0x0188, B:82:0x018e, B:66:0x0151, B:56:0x010b, B:59:0x0114, B:61:0x011a, B:63:0x0120), top: B:102:0x00b4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:35:0x00b4, B:37:0x00be, B:38:0x00c0, B:41:0x00ca, B:42:0x00d1, B:45:0x00db, B:46:0x00e2, B:48:0x00e6, B:49:0x00e8, B:52:0x00f5, B:53:0x00f9, B:65:0x0132, B:67:0x0156, B:69:0x015a, B:70:0x015c, B:73:0x0165, B:74:0x0169, B:84:0x01a0, B:86:0x01bd, B:88:0x01c3, B:90:0x01d7, B:91:0x01dc, B:92:0x01f4, B:94:0x01f8, B:95:0x0207, B:85:0x01b8, B:77:0x017b, B:79:0x0183, B:80:0x0188, B:82:0x018e, B:66:0x0151, B:56:0x010b, B:59:0x0114, B:61:0x011a, B:63:0x0120), top: B:102:0x00b4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f8 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:35:0x00b4, B:37:0x00be, B:38:0x00c0, B:41:0x00ca, B:42:0x00d1, B:45:0x00db, B:46:0x00e2, B:48:0x00e6, B:49:0x00e8, B:52:0x00f5, B:53:0x00f9, B:65:0x0132, B:67:0x0156, B:69:0x015a, B:70:0x015c, B:73:0x0165, B:74:0x0169, B:84:0x01a0, B:86:0x01bd, B:88:0x01c3, B:90:0x01d7, B:91:0x01dc, B:92:0x01f4, B:94:0x01f8, B:95:0x0207, B:85:0x01b8, B:77:0x017b, B:79:0x0183, B:80:0x0188, B:82:0x018e, B:66:0x0151, B:56:0x010b, B:59:0x0114, B:61:0x011a, B:63:0x0120), top: B:102:0x00b4, inners: #2, #3 }] */
    @Override // defpackage.aaqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.arpa r15) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaqd.c(arpa):void");
    }

    @Override // defpackage.aaqx
    public final /* synthetic */ boolean e(aaqs aaqsVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(yni yniVar) {
        yniVar.a(this, afwb.class, new aapx(this, 1));
        yniVar.a(this, afwd.class, new aapx(this));
    }

    public final void h(Executor executor, azqb azqbVar, azqb azqbVar2) {
        byte b;
        apej apejVar;
        if (i()) {
            File[] fileArr = {this.o, this.p};
            int i = 0;
            char c = 0;
            loop0: while (true) {
                if (i >= 2) {
                    break;
                }
                try {
                    aaqb aaqbVar = new aaqb(fileArr[i]);
                    while (true) {
                        int i2 = aaqbVar.b;
                        byte[] bArr = aaqbVar.a;
                        if (i2 >= bArr.length - 1) {
                            break loop0;
                        }
                        if (aaqbVar.c <= 0) {
                            b = aaqbVar.d;
                            aaqbVar.d = (byte) (b + 1);
                        } else {
                            aaqbVar.b = i2 + 1;
                            b = bArr[i2];
                        }
                        if (b == 0) {
                            apejVar = (apej) aaqbVar.a(apej.a);
                            if (apejVar == null) {
                                apejVar = apej.a;
                            }
                        } else {
                            if (b == 1) {
                                this.i.e(aaqbVar);
                            } else if (b == 2) {
                                this.h.e(aaqbVar);
                                apejVar = null;
                                b = 2;
                            }
                            apejVar = null;
                        }
                        if (c == 0 && b != 0) {
                            if (((Boolean) ((aacu) azqbVar.get()).b().get()).booleanValue()) {
                                c = 2;
                                break loop0;
                            }
                            c = 1;
                        }
                        if (b == 0) {
                            this.c.sh(apejVar);
                        } else if (b == 1) {
                            this.b.sh((apyy) this.i.d);
                        } else if (b != 2 || this.a.aM()) {
                            d("Bin unknown type", null);
                        } else {
                            this.a.c((arhd) this.h.d);
                        }
                    }
                } catch (FileNotFoundException unused) {
                } catch (Throwable th) {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    d("Bin restore fail", th);
                }
                i++;
            }
            if (c == 2) {
                j("bin resetConfigs");
                this.i.b();
                this.h.b();
                this.j = 0;
                SharedPreferences.Editor edit = this.d.edit();
                r(edit);
                ywk ywkVar = this.e;
                if (ywkVar != null) {
                    ywkVar.e(edit);
                }
                edit.apply();
            }
            aaqc aaqcVar = this.i;
            aaqcVar.c = aaqcVar.b;
            if (!this.c.ac()) {
                this.c.sh(b((apyy) this.i.d));
            }
            if (!this.b.ac()) {
                this.b.sh((apyy) this.i.d);
            }
            if (!this.a.aM()) {
                this.a.c((arhd) this.h.d);
            }
            if ((this.j & 4) == 0 || azqbVar2 == null) {
                return;
            }
            g((yni) azqbVar2.get());
            return;
        }
        executor.execute(new aaqa(this, azqbVar, azqbVar2));
    }

    public final boolean i() {
        return (this.j & 1) != 0;
    }

    public final void k() {
        if (i()) {
            n();
            return;
        }
        this.d.edit().remove("com.google.android.libraries.youtube.innertube.hot_hash_data").apply();
        this.h.a = "";
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                k();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                l();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }

    public final void l() {
        if (i()) {
            n();
            return;
        }
        this.d.edit().remove("com.google.android.libraries.youtube.innertube.hot_hash_data").apply();
        this.h.a = "";
    }
}
