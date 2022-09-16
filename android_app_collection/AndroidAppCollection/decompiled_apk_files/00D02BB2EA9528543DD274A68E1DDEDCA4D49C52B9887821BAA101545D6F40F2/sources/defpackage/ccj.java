package defpackage;

import android.graphics.ImageDecoder;
/* compiled from: PG */
/* renamed from: ccj  reason: default package */
/* loaded from: classes4.dex */
public abstract class ccj<T> implements buc<ImageDecoder.Source, T> {
    final cdr a = cdr.a();

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, bua buaVar) {
        return true;
    }

    @Override // defpackage.buc
    /* renamed from: c */
    public final bxd<T> b(ImageDecoder.Source source, int i, int i2, bua buaVar) {
        return d(source, new cci(this, i, i2, buaVar.c(cdl.d) != null && ((Boolean) buaVar.c(cdl.d)).booleanValue(), (btk) buaVar.c(cdl.a), (cdi) buaVar.c(cdi.g), (bub) buaVar.c(cdl.b)));
    }

    protected abstract bxd<T> d(ImageDecoder.Source source, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);
}
