package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import com.google.android.gms.common.internal.ImagesContract;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public final class BitmapDescriptor {

    /* renamed from: a  reason: collision with root package name */
    Bitmap f1560a;

    /* renamed from: b  reason: collision with root package name */
    private Bundle f1561b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitmapDescriptor(Bitmap bitmap) {
        if (bitmap != null) {
            this.f1560a = a(bitmap, bitmap.getWidth(), bitmap.getHeight());
        }
    }

    private Bitmap a(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, paint);
        return createBitmap;
    }

    byte[] a() {
        ByteBuffer allocate = ByteBuffer.allocate(this.f1560a.getWidth() * this.f1560a.getHeight() * 4);
        this.f1560a.copyPixelsToBuffer(allocate);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle b() {
        if (this.f1560a == null) {
            throw new IllegalStateException("the bitmap has been recycled! you can not use it again");
        }
        if (this.f1561b == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("image_width", this.f1560a.getWidth());
            bundle.putInt("image_height", this.f1560a.getHeight());
            byte[] a2 = a();
            bundle.putByteArray(ImagesContract.IMAGE_DATA, a2);
            MessageDigest messageDigest = null;
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            messageDigest.update(a2, 0, a2.length);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder("");
            for (byte b2 : digest) {
                sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
            }
            bundle.putString("image_hashcode", sb.toString());
            this.f1561b = bundle;
        }
        return this.f1561b;
    }

    public Bitmap getBitmap() {
        return this.f1560a;
    }

    public void recycle() {
        if (this.f1560a == null || this.f1560a.isRecycled()) {
            return;
        }
        this.f1560a.recycle();
        this.f1560a = null;
    }
}
