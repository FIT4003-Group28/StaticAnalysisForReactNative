package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;
/* compiled from: PG */
/* renamed from: zyt  reason: default package */
/* loaded from: classes4.dex */
public final class zyt implements yiw {
    final /* synthetic */ Activity a;
    final /* synthetic */ ThirdPartyAccountPreference b;

    public zyt(ThirdPartyAccountPreference thirdPartyAccountPreference, Activity activity) {
        this.b = thirdPartyAccountPreference;
        this.a = activity;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final hm j = iy.j(this.a.getResources(), (Bitmap) obj2);
        j.c();
        this.a.runOnUiThread(new Runnable() { // from class: zys
            @Override // java.lang.Runnable
            public final void run() {
                zyt zytVar = zyt.this;
                zytVar.b.H(j);
            }
        });
    }
}
