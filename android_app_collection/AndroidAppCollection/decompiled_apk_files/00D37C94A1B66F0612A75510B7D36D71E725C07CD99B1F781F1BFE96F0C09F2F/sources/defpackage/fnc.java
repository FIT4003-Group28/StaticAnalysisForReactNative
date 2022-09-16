package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: fnc */
/* loaded from: classes3.dex */
public final class fnc implements fnf {
    private final fnk a;
    private String b = "";
    private String c = "";
    private int d;
    private long e;

    public fnc(fnk fnkVar) {
        this.a = fnkVar;
    }

    private final void e() {
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0L;
    }

    @Override // defpackage.fnf
    public final void b(ahhx ahhxVar) {
        this.e = ahhxVar.e();
    }

    @Override // defpackage.fnf
    public final void c() {
        if (!TextUtils.isEmpty(this.b)) {
            final fnk fnkVar = this.a;
            final String str = this.b;
            final String str2 = this.c;
            final int i = this.d;
            final long j = this.e;
            ylx.m(((yve) fnkVar.a.get()).b(new ampg() { // from class: fnh
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    fnk fnkVar2 = fnk.this;
                    String str3 = str;
                    String str4 = str2;
                    int i2 = i;
                    long j2 = j;
                    aopa mo52toBuilder = ((fng) obj).mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    fng fngVar = (fng) mo52toBuilder.instance;
                    str3.getClass();
                    fngVar.b |= 1;
                    fngVar.c = str3;
                    mo52toBuilder.copyOnWrite();
                    fng fngVar2 = (fng) mo52toBuilder.instance;
                    str4.getClass();
                    fngVar2.b |= 2;
                    fngVar2.d = str4;
                    mo52toBuilder.copyOnWrite();
                    fng fngVar3 = (fng) mo52toBuilder.instance;
                    fngVar3.b |= 4;
                    fngVar3.e = i2;
                    mo52toBuilder.copyOnWrite();
                    fng fngVar4 = (fng) mo52toBuilder.instance;
                    fngVar4.b |= 8;
                    fngVar4.f = j2;
                    long d = fnkVar2.b.d();
                    mo52toBuilder.copyOnWrite();
                    fng fngVar5 = (fng) mo52toBuilder.instance;
                    fngVar5.b |= 16;
                    fngVar5.g = d;
                    return (fng) mo52toBuilder.mo39build();
                }
            }), dzl.o);
        }
    }

    @Override // defpackage.fnf
    public final boolean d() {
        return !TextUtils.isEmpty(this.b);
    }

    @Override // defpackage.fee
    public final void i() {
        e();
    }

    @Override // defpackage.fee
    public final void j(apzg apzgVar, avhn avhnVar) {
        aikb aikbVar = new aikb();
        if (!apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            e();
            return;
        }
        ory h = aikbVar.h(apzgVar);
        if (h == null) {
            return;
        }
        this.b = h.c;
        this.c = h.e;
        this.d = h.f;
        this.e = h.l;
    }
}
