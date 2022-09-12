package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
/* compiled from: PG */
/* renamed from: eakm  reason: default package */
/* loaded from: classes6.dex */
public abstract class eakm extends ICronetEngineBuilder {
    private static final Pattern c = Pattern.compile("^[0-9\\.]*$");
    public String a;
    private final Context d;
    private String g;
    private final List<eakl> e = new LinkedList();
    private final List<eakk> f = new LinkedList();
    public int b = 20;

    public eakm(Context context) {
        this.d = context.getApplicationContext();
        a(0);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        d(str, set, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        e(str);
        return this;
    }

    public final void b(String str) {
        if (new File(str).isDirectory()) {
            this.g = str;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    public final void c(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.b = i;
    }

    public final void e(String str) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
        }
        this.e.add(new eakl());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        a(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        int i;
        Context context = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (eamk.a) {
            if (eamk.b == 0) {
                try {
                    eamk.b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i = eamk.b;
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append(";");
        sb.append(" Cronet/");
        sb.append("88.0.4314.2");
        sb.append(')');
        return sb.toString();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        c(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.a = str;
        return this;
    }

    public final void a(int i) {
        if (i != 3) {
            if (i != 2) {
                if (this.g != null) {
                    throw new IllegalArgumentException("Storage path must not be set");
                }
                if (i == 0 && i != 1 && i != 2 && i != 3) {
                    throw new IllegalArgumentException("Unknown cache mode");
                }
                return;
            }
            i = 2;
        }
        if (this.g == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        if (i == 0) {
        }
    }

    public final void d(String str, Set<byte[]> set, Date date) {
        if (str != null) {
            if (set == null) {
                throw new NullPointerException("The set of SHA256 pins cannot be null");
            }
            if (date == null) {
                throw new NullPointerException("The pin expiration date cannot be null");
            }
            if (!c.matcher(str).matches()) {
                if (str.length() <= 255) {
                    try {
                        IDN.toASCII(str, 2);
                        HashMap hashMap = new HashMap();
                        for (byte[] bArr : set) {
                            if (bArr != null && bArr.length == 32) {
                                hashMap.put(Base64.encodeToString(bArr, 0), bArr);
                            } else {
                                throw new IllegalArgumentException("Public key pin is invalid");
                            }
                        }
                        List<eakk> list = this.f;
                        byte[][] bArr2 = (byte[][]) hashMap.values().toArray(new byte[hashMap.size()]);
                        list.add(new eakk());
                        return;
                    } catch (IllegalArgumentException unused) {
                        throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
                    }
                }
                throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
            }
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        }
        throw new NullPointerException("The hostname cannot be null");
    }
}
