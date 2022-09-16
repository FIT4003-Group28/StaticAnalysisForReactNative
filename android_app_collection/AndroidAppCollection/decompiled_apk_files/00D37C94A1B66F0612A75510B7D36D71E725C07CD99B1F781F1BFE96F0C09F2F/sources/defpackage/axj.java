package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axj  reason: default package */
/* loaded from: classes2.dex */
public final class axj implements asv {
    private final Context a;
    private final List b = new ArrayList();
    private final asv c;
    private asv d;
    private asv e;
    private asv f;
    private asv g;
    private asv h;
    private asv i;
    private asv j;
    private asv k;

    public axj(Context context, asv asvVar) {
        this.a = context.getApplicationContext();
        this.c = asvVar;
    }

    private final asv c() {
        if (this.e == null) {
            aws awsVar = new aws(this.a);
            this.e = awsVar;
            d(awsVar);
        }
        return this.e;
    }

    private final void d(asv asvVar) {
        for (int i = 0; i < this.b.size(); i++) {
            asvVar.b((atk) this.b.get(i));
        }
    }

    private static final void e(asv asvVar, atk atkVar) {
        if (asvVar != null) {
            asvVar.b(atkVar);
        }
    }

    @Override // defpackage.asv
    public final Map a() {
        asv asvVar = this.k;
        return asvVar == null ? Collections.emptyMap() : asvVar.a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ptx.a(atkVar);
        this.c.b(atkVar);
        this.b.add(atkVar);
        e(this.d, atkVar);
        e(this.e, atkVar);
        e(this.f, atkVar);
        e(this.g, atkVar);
        e(this.h, atkVar);
        e(this.i, atkVar);
        e(this.j, atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        asv asvVar = this.k;
        ptx.a(asvVar);
        return asvVar.g(bArr, i, i2);
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        asv asvVar;
        ptx.e(this.k == null);
        String scheme = asyVar.a.getScheme();
        if (pxi.R(asyVar.a)) {
            String path = asyVar.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = c();
            } else {
                if (this.d == null) {
                    axo axoVar = new axo();
                    this.d = axoVar;
                    d(axoVar);
                }
                this.k = this.d;
            }
        } else if ("asset".equals(scheme)) {
            this.k = c();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                axb axbVar = new axb(this.a);
                this.f = axbVar;
                d(axbVar);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    asv asvVar2 = (asv) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.g = asvVar2;
                    d(asvVar2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                ayi ayiVar = new ayi();
                this.h = ayiVar;
                d(ayiVar);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                axc axcVar = new axc();
                this.i = axcVar;
                d(axcVar);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    ayc aycVar = new ayc(this.a);
                    this.j = aycVar;
                    d(aycVar);
                }
                asvVar = this.j;
            } else {
                asvVar = this.c;
            }
            this.k = asvVar;
        }
        return this.k.h(asyVar);
    }

    @Override // defpackage.asv
    public final Uri i() {
        asv asvVar = this.k;
        if (asvVar == null) {
            return null;
        }
        return asvVar.i();
    }

    @Override // defpackage.asv
    public final void j() {
        asv asvVar = this.k;
        if (asvVar != null) {
            try {
                asvVar.j();
            } finally {
                this.k = null;
            }
        }
    }
}
