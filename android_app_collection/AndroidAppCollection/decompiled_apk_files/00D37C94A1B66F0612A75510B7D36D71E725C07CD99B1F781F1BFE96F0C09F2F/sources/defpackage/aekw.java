package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: aekw  reason: default package */
/* loaded from: classes.dex */
public final class aekw implements ovk {
    public static final Uri a = Uri.parse("http://dummy.googlevideo.com/videoplayback");
    public final String b;
    private final ExecutorService c;
    private final boolean d;
    private MediaFormat e;
    private boolean f;
    private int g;
    private long h;
    private String i;
    private aeku j;
    private boolean k = true;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private ovk p;

    public aekw(String str, ExecutorService executorService, boolean z) {
        zgh.m(str);
        this.b = str;
        afms.a(executorService);
        this.c = executorService;
        this.d = z;
        this.j = null;
        this.e = null;
    }

    @Override // defpackage.ovk
    public final int a() {
        return 1;
    }

    @Override // defpackage.ovk
    public final synchronized MediaFormat b(int i) {
        if (this.m) {
            return this.e;
        }
        ovk ovkVar = this.p;
        if (ovkVar != null) {
            return ovkVar.b(i);
        }
        afus.b(2, 8, "OnesieDashChunkSource.getFormat() has nothing to return.");
        return null;
    }

    @Override // defpackage.ovk
    public final synchronized void c(long j) {
        ovk ovkVar = this.p;
        if (ovkVar == null || !this.n) {
            return;
        }
        ovkVar.c(j);
    }

    @Override // defpackage.ovk
    public final synchronized void d(List list) {
        this.l = false;
        ovk ovkVar = this.p;
        if (ovkVar != null) {
            ovkVar.d(list);
            this.n = false;
        }
    }

    @Override // defpackage.ovk
    public final synchronized void e(int i) {
        this.l = true;
        this.o = i;
        ovk ovkVar = this.p;
        if (ovkVar != null) {
            ovkVar.e(i);
            this.n = true;
        }
    }

    @Override // defpackage.ovk
    public final synchronized void f(List list, long j, ove oveVar) {
        aeku aekuVar;
        ovk ovkVar = this.p;
        if (ovkVar != null) {
            if (!this.n) {
                aeny.g("getChunkOperation on disabled innerChunkSource.");
            } else {
                ovkVar.f(list, j, oveVar);
            }
        } else if (oveVar.b != null || (aekuVar = this.j) == null || this.f) {
        } else {
            oveVar.b = aekuVar;
            this.f = true;
        }
    }

    @Override // defpackage.ovk
    public final synchronized void g() {
        ovk ovkVar = this.p;
        if (ovkVar != null) {
            ovkVar.g();
        }
    }

    @Override // defpackage.ovk
    public final synchronized void h(ovb ovbVar) {
        ovk ovkVar = this.p;
        if (ovkVar == null || !this.n || (ovbVar instanceof aeku)) {
            return;
        }
        ovkVar.h(ovbVar);
    }

    @Override // defpackage.ovk
    public final synchronized void i(ovb ovbVar, Exception exc) {
    }

    @Override // defpackage.ovk
    public final synchronized boolean j() {
        ovk ovkVar = this.p;
        if (ovkVar != null) {
            return ovkVar.j();
        } else if (this.e == null) {
            return false;
        } else {
            this.m = true;
            return true;
        }
    }

    public final synchronized oye k() {
        aeku aekuVar = this.j;
        if (aekuVar != null) {
            return aekuVar.n;
        }
        return null;
    }

    public final synchronized void l(aeku aekuVar) {
        this.j = aekuVar;
        this.e = aekuVar.m;
    }

    public final synchronized void m(int i, long j, String str, byte[] bArr) {
        if (!this.k) {
            return;
        }
        this.k = false;
        this.c.submit(new aekv(this, i, str, bArr, this.d));
        this.g = i;
        this.h = j;
        this.i = str;
    }

    public final synchronized void n(ovk ovkVar) {
        if (this.p != null) {
            aeny.g("innerChunkSource already set.");
        }
        this.p = ovkVar;
        if (this.m && !ovkVar.j()) {
            afus.b(2, 8, "chunkSource.prepare() returned false.");
            return;
        }
        if (this.l) {
            this.p.e(this.o);
            this.n = true;
        }
    }

    public final synchronized void o() {
        this.k = false;
    }

    public final synchronized boolean p(VideoStreamingData videoStreamingData) {
        if (this.g == 0 && this.h == 0) {
            return true;
        }
        for (FormatStreamModel formatStreamModel : videoStreamingData.n) {
            if (formatStreamModel.e() == this.g) {
                if (!TextUtils.equals(formatStreamModel.w(), this.i)) {
                    return false;
                }
                String queryParameter = formatStreamModel.d.getQueryParameter("lmt");
                if (queryParameter != null) {
                    try {
                        if (Long.parseLong(queryParameter) == this.h) {
                            return true;
                        }
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
