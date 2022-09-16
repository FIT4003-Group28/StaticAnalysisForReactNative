package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cpx  reason: default package */
/* loaded from: classes3.dex */
public final class cpx implements cie {
    private final cpl a;
    private final /* synthetic */ int b;

    public cpx(cpl cplVar) {
        this.a = cplVar;
    }

    public cpx(cpl cplVar, int i) {
        this.b = i;
        this.a = cplVar;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        if (this.b == 0) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
            return true;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        if (this.b == 0) {
            cpl cplVar = this.a;
            return cplVar.a(new cpt((ParcelFileDescriptor) obj, cplVar.g, cplVar.f), i, i2, cicVar, cpl.e);
        }
        cpl cplVar2 = this.a;
        return cplVar2.a(new cpr((ByteBuffer) obj, cplVar2.g, cplVar2.f), i, i2, cicVar, cpl.e);
    }
}
