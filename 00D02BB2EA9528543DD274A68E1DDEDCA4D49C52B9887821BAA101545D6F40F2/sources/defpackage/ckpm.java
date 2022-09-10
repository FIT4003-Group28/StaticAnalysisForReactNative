package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ckpm  reason: default package */
/* loaded from: classes4.dex */
public final class ckpm extends itb {
    public final ckcw a;
    public final ckpn b;
    private final Executor c;
    private final crzp<btvo> d = new crzp(this) { // from class: ckpl
        private final ckpm a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            ckpm ckpmVar = this.a;
            btvo btvoVar = (btvo) crzmVar.l();
            if (btvoVar != null) {
                dvcz memoryManagementParameters = btvoVar.getMemoryManagementParameters();
                if (!memoryManagementParameters.e) {
                    return;
                }
                int i = (memoryManagementParameters.a & 128) != 0 ? memoryManagementParameters.f : 0;
                if (i <= 0 || i >= 100) {
                    ((ckco) ckpmVar.a.a(ckja.ak)).a(i);
                    return;
                }
                int i2 = ImageMetadata.SHADING_MODE * i;
                if (i2 == ckpmVar.b.a()) {
                    return;
                }
                ((ckco) ckpmVar.a.a(ckja.aj)).a(i);
                ckpn ckpnVar = ckpmVar.b;
                ckpnVar.a = new byte[i2];
                Arrays.fill(ckpnVar.a, (byte) 1);
                ((ckco) ckpmVar.a.a(ckja.ai)).a((ckpmVar.b.a() >> 10) >> 10);
            }
        }
    };
    private final btxc e;

    public ckpm(btxc btxcVar, Executor executor, ckcw ckcwVar, ckpn ckpnVar) {
        this.e = btxcVar;
        this.c = executor;
        this.a = ckcwVar;
        this.b = ckpnVar;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.e.a().d(this.d, this.c);
    }

    @Override // defpackage.itb
    public final void Po() {
        this.e.a().c(this.d);
        this.b.a = new byte[0];
        super.Po();
    }
}
