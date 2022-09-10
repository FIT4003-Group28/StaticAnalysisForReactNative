package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: PG */
/* renamed from: ccm  reason: default package */
/* loaded from: classes.dex */
public final class ccm<DataType> implements buc<DataType, BitmapDrawable> {
    private final buc<DataType, Bitmap> a;
    private final Resources b;

    public ccm(Resources resources, buc<DataType, Bitmap> bucVar) {
        cjn.b(resources);
        this.b = resources;
        cjn.b(bucVar);
        this.a = bucVar;
    }

    @Override // defpackage.buc
    public final boolean a(DataType datatype, bua buaVar) {
        return this.a.a(datatype, buaVar);
    }

    @Override // defpackage.buc
    public final bxd<BitmapDrawable> b(DataType datatype, int i, int i2, bua buaVar) {
        return cdw.f(this.b, this.a.b(datatype, i, i2, buaVar));
    }
}
