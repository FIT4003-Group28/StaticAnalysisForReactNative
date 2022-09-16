package defpackage;

import android.content.res.Resources;
import android.provider.MediaStore;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: caea  reason: default package */
/* loaded from: classes4.dex */
public class caea implements cagc {
    private final dxio<Resources> a;
    private final bbtm b;
    private final View.OnClickListener c;
    private final cjtd d;
    private final int e;
    private final String f;

    public caea(dxio<Resources> dxioVar, bbtm bbtmVar, View.OnClickListener onClickListener, @dzsi String str, @dzsi String str2, int i, String str3) {
        this.a = dxioVar;
        this.b = bbtmVar;
        this.c = onClickListener;
        cjta b = cjtd.b();
        b.b = str;
        b.g(str2);
        this.d = b.a();
        this.e = i;
        this.f = str3;
    }

    @Override // defpackage.cagc
    public Boolean a() {
        return true;
    }

    @Override // defpackage.cagc
    public View.OnClickListener b() {
        return this.c;
    }

    @Override // defpackage.cagc
    public jic c() {
        return new jic(this.b.z().toString(), ckqc.FULLY_QUALIFIED, irg.e(), 0);
    }

    @Override // defpackage.cagc
    @dzsi
    public cjtd d() {
        return this.d;
    }

    @Override // defpackage.cagc
    public bbtm e() {
        return this.b;
    }

    @Override // defpackage.cagc
    public String f() {
        if (g().booleanValue()) {
            return this.a.a().getString(R.string.DEVICE_VIDEO_THUMBNAIL_CONTENT_DESCRIPTION, Integer.valueOf(this.e + 1), this.f);
        }
        return this.a.a().getString(R.string.DEVICE_PHOTO_THUMBNAIL_CONTENT_DESCRIPTION, Integer.valueOf(this.e + 1), this.f);
    }

    @Override // defpackage.cagc
    public Boolean g() {
        String uri = this.b.z().toString();
        String valueOf = String.valueOf(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append("/");
        return Boolean.valueOf(uri.startsWith(sb.toString()));
    }
}
