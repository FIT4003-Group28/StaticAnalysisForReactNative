package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jrk  reason: default package */
/* loaded from: classes7.dex */
public class jrk implements jqy {
    private final String a;
    private final String b;
    private final String c;
    private final Activity d;
    private final dxio<afha> e;

    public jrk(Activity activity, dxio<afha> dxioVar, String str, String str2, String str3) {
        this.d = activity;
        this.e = dxioVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.jqy
    public String a() {
        return this.a;
    }

    @Override // defpackage.jqy
    public jic b() {
        return new jic(this.c, ckqc.FULLY_QUALIFIED, R.drawable.generic_image_placeholder);
    }

    @Override // defpackage.jqy
    public cqkl c() {
        jru.a(this.d, this.e, this.b);
        return cqkl.a;
    }
}
