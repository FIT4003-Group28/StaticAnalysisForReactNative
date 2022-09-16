package defpackage;

import android.graphics.ImageDecoder;
/* compiled from: PG */
/* renamed from: cos  reason: default package */
/* loaded from: classes3.dex */
public final class cos implements cie {
    final cpq a;
    private final cld b;

    public cos() {
        this.a = cpq.a();
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    @Override // defpackage.cie
    /* renamed from: c */
    public final cku a(ImageDecoder.Source source, int i, int i2, cic cicVar) {
        return new coy(ImageDecoder.decodeBitmap(source, new cor(this, i, i2, cicVar.b(cpl.d) != null && ((Boolean) cicVar.b(cpl.d)).booleanValue(), (chm) cicVar.b(cpl.a), (cpi) cicVar.b(cpi.f), (cid) cicVar.b(cpl.b))), this.b);
    }

    public cos(byte[] bArr) {
        this.a = cpq.a();
        this.b = new cle();
    }
}
