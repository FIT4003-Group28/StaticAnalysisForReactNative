package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bybf  reason: default package */
/* loaded from: classes4.dex */
public final class bybf {
    public static final String a = "bybf";
    public final dxio<akvz> b;
    public final amfi c;
    public final bvrb d;
    public final dbuv<String, dehn<amfu>> e = dbuo.a().d(new bybe(this));
    public final dbuv<amfu, akuh> f;
    @dzsi
    public akuh g;
    @dzsi
    public bybl h;
    private final Resources i;

    public bybf(Activity activity, dxio<akvz> dxioVar, amfi amfiVar, bvrb bvrbVar) {
        this.i = activity.getResources();
        this.b = dxioVar;
        this.c = amfiVar;
        this.d = bvrbVar;
        dbuo<Object, Object> a2 = dbuo.a();
        a2.k(new byba(this));
        this.f = a2.d(new byaz(this));
    }

    public static boolean b(amfu amfuVar) {
        return !amfuVar.a() && amfuVar.d();
    }

    public final akuh a() {
        if (this.g == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            this.g = this.b.a().d(BitmapFactory.decodeResource(this.i, R.drawable.generic_car, options));
        }
        return this.g;
    }
}
