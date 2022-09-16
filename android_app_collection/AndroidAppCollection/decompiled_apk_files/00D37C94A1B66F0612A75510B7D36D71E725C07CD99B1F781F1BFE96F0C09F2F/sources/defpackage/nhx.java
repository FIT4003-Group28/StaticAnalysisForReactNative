package defpackage;

import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: nhx  reason: default package */
/* loaded from: classes3.dex */
public final class nhx extends ngj {
    private final lve e;

    public nhx(lve lveVar, avkv avkvVar) {
        super(avkvVar);
        this.e = lveVar;
    }

    @Override // defpackage.ngj
    public final amvn a(amvn amvnVar) {
        amuk q;
        amvl i = amvn.i();
        avkv avkvVar = (avkv) this.a;
        aunb aunbVar = avkvVar.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(MenuRendererOuterClass.menuRenderer)) {
            lve lveVar = this.e;
            aunb aunbVar2 = avkvVar.g;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            lveVar.c((atep) aunbVar2.qm(MenuRendererOuterClass.menuRenderer));
            q = amuk.o(this.e.b());
        } else {
            q = amuk.q();
        }
        i.j(q);
        i.j(amvnVar);
        return i.g();
    }

    @Override // defpackage.ngj
    public final CharSequence c() {
        arag aragVar = ((avkv) this.a).b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ngj
    public final boolean h() {
        return ((avkv) this.a).h;
    }

    @Override // defpackage.ngj
    public final boolean i() {
        return ((((avkv) this.a).c >> 24) & PrivateKeyType.INVALID) < 255;
    }
}
