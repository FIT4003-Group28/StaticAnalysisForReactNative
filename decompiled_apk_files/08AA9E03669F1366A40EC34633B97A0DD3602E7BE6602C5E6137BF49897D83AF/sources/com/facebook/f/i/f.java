package com.facebook.f.i;

import android.net.Uri;
import com.facebook.common.d.k;
/* compiled from: SimpleDraweeView.java */
/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: a  reason: collision with root package name */
    private static k<? extends com.facebook.f.h.d> f2489a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.f.h.d f2490b;

    public static void a(k<? extends com.facebook.f.h.d> kVar) {
        f2489a = kVar;
    }

    protected com.facebook.f.h.d getControllerBuilder() {
        return this.f2490b;
    }

    @Override // com.facebook.f.i.c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        a(uri, (Object) null);
    }

    public void setImageURI(String str) {
        a(str, (Object) null);
    }

    public void a(Uri uri, Object obj) {
        setController(this.f2490b.e(obj).b(uri).b(getController()).q());
    }

    public void a(String str, Object obj) {
        a(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i) {
        a(i, (Object) null);
    }

    public void a(int i, Object obj) {
        a(com.facebook.common.l.f.a(i), obj);
    }

    @Override // com.facebook.f.i.c, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }
}
