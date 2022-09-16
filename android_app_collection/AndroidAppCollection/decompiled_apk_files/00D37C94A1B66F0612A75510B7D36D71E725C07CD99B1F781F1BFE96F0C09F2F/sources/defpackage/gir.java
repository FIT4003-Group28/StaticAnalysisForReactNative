package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.livecreation.MainLiveCreationActivity;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gir  reason: default package */
/* loaded from: classes3.dex */
public final class gir implements aafl {
    private final Activity a;
    private final akfg b;
    private final airr c;
    private final yjk d;

    public gir(Activity activity, yjk yjkVar, akfg akfgVar, airr airrVar) {
        this.a = activity;
        this.d = yjkVar;
        this.b = akfgVar;
        this.c = airrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Activity activity = this.a;
        Intent addFlags = new Intent(activity, GalleryActivity.class).putExtra("navigation_endpoint", apzgVar.toByteArray()).putExtra("extra_gallery_secondary_action_class", MainLiveCreationActivity.class.getCanonicalName()).addFlags(536870912);
        yiu yiuVar = (yiu) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", yiu.class);
        if (acly.c(this.a)) {
            akfg akfgVar = this.b;
            akfh l = akfgVar.l();
            l.k(this.a.getString(R.string.screencast_blocking_snackbar_text));
            l.j(false);
            akfgVar.n(l.b());
            return;
        }
        this.c.a();
        if (yiuVar != null) {
            this.d.a(addFlags, 1800, yiuVar);
        } else {
            this.a.startActivity(addFlags);
        }
    }
}
