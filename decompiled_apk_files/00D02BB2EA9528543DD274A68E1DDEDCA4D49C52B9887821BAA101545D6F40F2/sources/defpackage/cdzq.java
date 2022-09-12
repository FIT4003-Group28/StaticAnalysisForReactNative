package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdzq  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdzq extends dzvw implements dzve<Uri, dztc> {
    public cdzq(ceaj ceajVar) {
        super(1, ceajVar, ceaj.class, "deselectMedia", "deselectMedia$java_com_google_android_apps_gmm_ugc_post_photo_editor_library(Landroid/net/Uri;)V");
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ dztc a(Uri uri) {
        List list;
        Uri uri2 = uri;
        dzvx.c(uri2, "p1");
        dzvx.c(uri2, "uri");
        v vVar = ((ceaj) this.b).d;
        List list2 = (List) vVar.h();
        if (list2 != null) {
            list = new ArrayList(dzti.d(list2, 10));
            boolean z = false;
            for (Object obj : list2) {
                boolean z2 = true;
                if (!z && dzvx.d(obj, uri2)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    list.add(obj);
                }
            }
        } else {
            list = dztu.a;
        }
        vVar.g(list);
        return dztc.a;
    }
}
