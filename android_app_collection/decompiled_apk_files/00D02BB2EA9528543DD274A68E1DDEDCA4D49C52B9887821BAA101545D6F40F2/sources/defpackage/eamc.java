package defpackage;

import android.net.TrafficStats;
import com.google.android.filament.R;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: eamc  reason: default package */
/* loaded from: classes6.dex */
final class eamc extends eamg {
    public final ealy a;
    public final Executor b;
    public final String c;
    public final boolean g;
    public String h;
    public eaml i;
    public Executor j;
    public String l;
    public ReadableByteChannel m;
    public eamj n;
    public String o;
    public HttpURLConnection p;
    public ealz q;
    public final Map<String, String> d = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List<String> e = new ArrayList();
    public final AtomicReference<Integer> f = new AtomicReference<>(0);
    private final AtomicBoolean r = new AtomicBoolean(false);
    public volatile int k = -1;

    public eamc(UrlRequest.Callback callback, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        this.g = z;
        this.a = new ealy(this, callback, executor2);
        this.b = new eamb(new ealh(executor, !z2 ? TrafficStats.getThreadStatsTag() : i, z3, i2));
        this.l = str;
        this.c = str2;
    }

    private final void n() {
        int intValue = this.f.get().intValue();
        if (intValue == 0) {
            return;
        }
        throw new IllegalStateException("Request is already started. State is: " + intValue);
    }

    @Override // defpackage.eamg
    public final void a(String str) {
        n();
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.h = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method " + str);
    }

    @Override // defpackage.eamg
    public final void b(String str, String str2) {
        n();
        int i = 0;
        while (true) {
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                    switch (charAt) {
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            break;
                        default:
                            switch (charAt) {
                                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                    break;
                                default:
                                    switch (charAt) {
                                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                            break;
                                        default:
                                            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                i++;
                                            }
                                            break;
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (this.d.containsKey(str)) {
                    this.d.remove(str);
                }
                this.d.put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    @Override // defpackage.eamg
    public final void c(UploadDataProvider uploadDataProvider, Executor executor) {
        if (!this.d.containsKey("Content-Type")) {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        n();
        if (this.h == null) {
            this.h = "POST";
        }
        this.i = new eaml(uploadDataProvider);
        if (this.g) {
            this.j = executor;
        } else {
            this.j = new eamf(executor);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int intValue = this.f.getAndSet(8).intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5) {
            l();
            h();
            ealy ealyVar = this.a;
            eamj eamjVar = this.n;
            ealyVar.d.m();
            ealyVar.b.execute(new ealv(ealyVar, eamjVar));
        }
    }

    public final void d(CronetException cronetException) {
        int intValue;
        do {
            intValue = this.f.get().intValue();
            if (intValue == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (intValue == 6 || intValue == 7 || intValue == 8) {
                return;
            }
        } while (!this.f.compareAndSet(Integer.valueOf(intValue), 6));
        l();
        h();
        ealy ealyVar = this.a;
        eamj eamjVar = this.n;
        ealyVar.d.m();
        ealx ealxVar = new ealx(ealyVar, eamjVar, cronetException);
        try {
            ealyVar.b.execute(ealxVar);
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = ealyVar.c;
            if (executor == null) {
                return;
            }
            executor.execute(ealxVar);
        }
    }

    public final void e(Throwable th) {
        d(new eaki("Exception received from UploadDataProvider", th));
    }

    public final void f(int i, int i2, Runnable runnable) {
        if (!this.f.compareAndSet(Integer.valueOf(i), Integer.valueOf(i2))) {
            int intValue = this.f.get().intValue();
            if (intValue == 8 || intValue == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + i + " but was " + intValue);
        }
        runnable.run();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        f(3, 1, new ealj(this));
    }

    public final void g() {
        this.k = 13;
        this.b.execute(j(new ealk(this)));
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int intValue = this.f.get().intValue();
        int i = this.k;
        switch (intValue) {
            case 0:
            case 6:
            case 7:
            case 8:
                i = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i = 0;
                break;
            case 5:
                i = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + intValue);
        }
        this.a.b.execute(new ealr(new eamn(statusListener), i));
    }

    public final void h() {
        if (this.i == null || !this.r.compareAndSet(false, true)) {
            return;
        }
        try {
            this.j.execute(k(new eall(this)));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void i() {
        this.b.execute(j(new ealo(this)));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int intValue = this.f.get().intValue();
        return intValue == 7 || intValue == 6 || intValue == 8;
    }

    public final Runnable j(eamd eamdVar) {
        return new ealp(this, eamdVar);
    }

    public final Runnable k(eamd eamdVar) {
        return new ealc(this, eamdVar);
    }

    public final void l() {
        this.b.execute(new ealf(this));
    }

    public final void m() {
        this.b.execute(new ealg(this));
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (byteBuffer.hasRemaining()) {
                f(4, 5, new eale(this, byteBuffer));
                return;
            }
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.k = 10;
        f(0, 1, new eali(this));
    }
}
