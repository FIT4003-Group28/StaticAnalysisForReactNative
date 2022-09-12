package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bvlq  reason: default package */
/* loaded from: classes.dex */
final class bvlq extends btnc<bvls, Bitmap> {
    public bvlq(btmz btmzVar, btmv btmvVar) {
        super(1024000, btmzVar, btmvVar);
    }

    @Override // defpackage.btnc
    public final /* bridge */ /* synthetic */ int i(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }
}
