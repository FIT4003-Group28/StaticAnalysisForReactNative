package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cmz  reason: default package */
/* loaded from: classes5.dex */
public final class cmz implements id {
    public Long a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public Bitmap e;
    public int f;
    public int g;
    public Intent h;
    public boolean l;
    public boolean m;
    private int n = 1;
    public int i = 0;
    public int j = 0;
    public boolean k = true;

    @Override // defpackage.id
    public final void a(ib ibVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.support.CarNavExtender.EXTENDED", true);
        bundle.putSerializable("content_id", this.a);
        bundle.putInt("type", this.n);
        bundle.putCharSequence("android.title", this.b);
        bundle.putCharSequence("android.title.night", null);
        bundle.putCharSequence("android.text", this.c);
        bundle.putCharSequence("android.text.night", null);
        bundle.putCharSequence("sub_text", this.d);
        bundle.putCharSequence("sub_text.night", null);
        bundle.putParcelable("android.largeIcon", this.e);
        bundle.putInt("action_icon", this.f);
        bundle.putInt("action_icon.night", this.g);
        bundle.putParcelable("content_intent", this.h);
        bundle.putParcelable("content_pending_intent", null);
        bundle.putInt("app_color", this.i);
        bundle.putInt("app_night_color", this.j);
        bundle.putBoolean("stream_visibility", this.k);
        bundle.putBoolean("heads_up_visibility", this.l);
        bundle.putBoolean("ignore_in_stream", this.m);
        ibVar.a().putBundle("android.car.EXTENSIONS", bundle);
    }

    public final void b() {
        this.n = 0;
    }
}
