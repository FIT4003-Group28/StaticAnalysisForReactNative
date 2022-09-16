package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
/* compiled from: PG */
/* renamed from: eoz  reason: default package */
/* loaded from: classes3.dex */
final class eoz implements yiu, fqc {
    private final apzg a;
    private final aafo b;
    private final fqd c;
    private final fyy d;
    private boolean e;

    public eoz(apzg apzgVar, aafo aafoVar, fqd fqdVar, fyy fyyVar) {
        this.a = apzgVar;
        this.b = aafoVar;
        this.c = fqdVar;
        this.d = fyyVar;
    }

    private final void c() {
        this.b.e(((apht) this.a.qm(AppStoreEndpointOuterClass.appStoreEndpoint)).g, null);
    }

    @Override // defpackage.fqc
    public final void a() {
    }

    @Override // defpackage.fqc
    public final void b() {
        if (this.e) {
            c();
            this.c.i(this);
        }
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        if (i != 907) {
            return;
        }
        this.d.m(5);
        if (i2 != 0) {
            return;
        }
        fqd fqdVar = this.c;
        if (fqdVar.b) {
            c();
            return;
        }
        fqdVar.g(this);
        this.e = true;
    }
}
