package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmko  reason: default package */
/* loaded from: classes5.dex */
public final class cmko implements cmkg {
    private final Context a;
    private final List<cmlo> b;
    private final cmkg c;
    private cmkg d;
    private cmkg e;
    private cmkg f;
    private cmkg g;
    private cmkg h;
    private cmkg i;
    private cmkg j;
    private cmkg k;

    public cmko(Context context, cmkg cmkgVar) {
        this.a = context.getApplicationContext();
        cmmn.f(cmkgVar);
        this.c = cmkgVar;
        this.b = new ArrayList();
    }

    private final cmkg g() {
        if (this.e == null) {
            cmju cmjuVar = new cmju(this.a);
            this.e = cmjuVar;
            h(cmjuVar);
        }
        return this.e;
    }

    private final void h(cmkg cmkgVar) {
        for (int i = 0; i < this.b.size(); i++) {
            cmkgVar.b(this.b.get(i));
        }
    }

    private static final void i(cmkg cmkgVar, cmlo cmloVar) {
        if (cmkgVar != null) {
            cmkgVar.b(cmloVar);
        }
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        cmkg cmkgVar = this.k;
        cmmn.f(cmkgVar);
        return cmkgVar.a(bArr, i, i2);
    }

    @Override // defpackage.cmkg
    public final void b(cmlo cmloVar) {
        cmmn.f(cmloVar);
        this.c.b(cmloVar);
        this.b.add(cmloVar);
        i(this.d, cmloVar);
        i(this.e, cmloVar);
        i(this.f, cmloVar);
        i(this.g, cmloVar);
        i(this.h, cmloVar);
        i(this.i, cmloVar);
        i(this.j, cmloVar);
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        cmkg cmkgVar;
        cmmn.c(this.k == null);
        String scheme = cmkjVar.a.getScheme();
        if (cmny.a(cmkjVar.a)) {
            String path = cmkjVar.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = g();
            } else {
                if (this.d == null) {
                    cmku cmkuVar = new cmku();
                    this.d = cmkuVar;
                    h(cmkuVar);
                }
                this.k = this.d;
            }
        } else if ("asset".equals(scheme)) {
            this.k = g();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                cmkc cmkcVar = new cmkc(this.a);
                this.f = cmkcVar;
                h(cmkcVar);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    cmkg cmkgVar2 = (cmkg) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.g = cmkgVar2;
                    h(cmkgVar2);
                } catch (ClassNotFoundException unused) {
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
                cmlq cmlqVar = new cmlq();
                this.h = cmlqVar;
                h(cmlqVar);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                cmke cmkeVar = new cmke();
                this.i = cmkeVar;
                h(cmkeVar);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.a);
                    this.j = rawResourceDataSource;
                    h(rawResourceDataSource);
                }
                cmkgVar = this.j;
            } else {
                cmkgVar = this.c;
            }
            this.k = cmkgVar;
        }
        return this.k.c(cmkjVar);
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        cmkg cmkgVar = this.k;
        if (cmkgVar == null) {
            return null;
        }
        return cmkgVar.d();
    }

    @Override // defpackage.cmkg
    public final Map<String, List<String>> e() {
        cmkg cmkgVar = this.k;
        return cmkgVar == null ? Collections.emptyMap() : cmkgVar.e();
    }

    @Override // defpackage.cmkg
    public final void f() {
        cmkg cmkgVar = this.k;
        if (cmkgVar != null) {
            try {
                cmkgVar.f();
            } finally {
                this.k = null;
            }
        }
    }
}
