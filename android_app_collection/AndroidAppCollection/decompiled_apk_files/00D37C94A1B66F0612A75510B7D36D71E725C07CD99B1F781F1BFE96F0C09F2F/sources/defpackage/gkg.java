package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gkg  reason: default package */
/* loaded from: classes3.dex */
public final class gkg extends xyv {
    private final airr e;
    private final YpcOffersListDialogFragmentController f;

    public gkg(Activity activity, abem abemVar, acth acthVar, yzj yzjVar, aafo aafoVar, airr airrVar, YpcOffersListDialogFragmentController ypcOffersListDialogFragmentController) {
        super(activity, abemVar, acthVar, yzjVar, aafoVar);
        this.e = airrVar;
        this.f = ypcOffersListDialogFragmentController;
    }

    @Override // defpackage.xyv
    public final void b(apzg apzgVar) {
        this.f.g(apzgVar);
        this.f.n();
    }

    @Override // defpackage.xyv, defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.e.d()) {
            this.e.a();
        }
        super.kD(apzgVar, map);
    }
}
