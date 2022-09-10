package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nwn  reason: default package */
/* loaded from: classes7.dex */
public final class nwn implements nxe {
    private final gga a;
    private final dxio<akpm> b;

    public nwn(gga ggaVar, dxio<akpm> dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.a.w();
        akpm a = this.b.a();
        dtph dtphVar = nviVar.a.n;
        if (dtphVar == null) {
            dtphVar = dtph.b;
        }
        dhjx dhjxVar = dtphVar.a;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        alao.d(a, alad.c(dhjxVar));
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.SHOW_MAP);
    }
}
