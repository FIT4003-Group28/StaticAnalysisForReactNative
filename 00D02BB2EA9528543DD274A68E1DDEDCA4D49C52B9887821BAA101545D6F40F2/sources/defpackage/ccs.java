package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ccs  reason: default package */
/* loaded from: classes.dex */
public final class ccs implements buc<ByteBuffer, Bitmap> {
    private final cdl a;

    public ccs(cdl cdlVar) {
        this.a = cdlVar;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, bua buaVar) {
        return true;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, bua buaVar) {
        return this.a.a(cjb.c(byteBuffer), i, i2, buaVar, cdl.e);
    }
}
