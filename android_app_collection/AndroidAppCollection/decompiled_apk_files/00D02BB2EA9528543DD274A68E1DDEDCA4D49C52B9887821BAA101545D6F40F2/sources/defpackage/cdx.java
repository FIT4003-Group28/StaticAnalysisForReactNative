package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: cdx  reason: default package */
/* loaded from: classes.dex */
public final class cdx implements buc<ParcelFileDescriptor, Bitmap> {
    private final cdl a;

    public cdx(cdl cdlVar) {
        this.a = cdlVar;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(ParcelFileDescriptor parcelFileDescriptor, bua buaVar) {
        return true;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, bua buaVar) {
        cdl cdlVar = this.a;
        return cdlVar.b(new cdt(parcelFileDescriptor, cdlVar.g, cdlVar.f), i, i2, buaVar, cdl.e);
    }
}
