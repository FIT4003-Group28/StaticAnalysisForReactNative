package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: coe  reason: default package */
/* loaded from: classes5.dex */
public final class coe implements id {
    public CharSequence a;
    public CharSequence b;
    public Bitmap c;
    public int d;
    public Intent e;
    public int f = 0;
    public int g = 0;
    public boolean h = true;
    public boolean i;

    @Override // defpackage.id
    public final void a(ib ibVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED", true);
        bundle.putInt("type", 0);
        bundle.putSerializable("content_id", null);
        bundle.putCharSequence("android.title", this.a);
        bundle.putCharSequence("subtitle", this.b);
        bundle.putCharSequence("android.text", null);
        bundle.putParcelable("thumbnail", this.c);
        bundle.putInt("action_icon", this.d);
        bundle.putParcelable("content_intent", this.e);
        bundle.putInt("app_color", this.f);
        bundle.putInt("app_night_color", this.g);
        bundle.putBoolean("stream_visibility", this.h);
        bundle.putBoolean("heads_up_visibility", this.i);
        ibVar.a().putBundle("android.car.EXTENSIONS", bundle);
    }
}
