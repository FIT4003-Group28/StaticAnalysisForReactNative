package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jhe  reason: default package */
/* loaded from: classes3.dex */
public final class jhe implements aafl {
    public final axnm a;
    public final yzj b;
    public final ProgressBarDialogFragmentController c;
    public final ahcc d;
    public final aafo e;
    public final mdv f;
    private final abeo g;

    public jhe(abeo abeoVar, axnm axnmVar, yzj yzjVar, ProgressBarDialogFragmentController progressBarDialogFragmentController, ahcc ahccVar, aafo aafoVar, mdv mdvVar) {
        this.g = abeoVar;
        this.a = axnmVar;
        this.b = yzjVar;
        this.c = progressBarDialogFragmentController;
        this.d = ahccVar;
        this.e = aafoVar;
        this.f = mdvVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String str = ((YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint) apzgVar.qm(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)).c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ProgressBarDialogFragmentController progressBarDialogFragmentController = this.c;
        if (progressBarDialogFragmentController.i() == null) {
            hqb hqbVar = progressBarDialogFragmentController.a;
            ext extVar = new ext();
            Bundle bundle = new Bundle();
            bundle.putDouble("progressbar_height", 0.5d);
            bundle.putDouble("progressbar_width", 0.5d);
            extVar.ae(bundle);
            aqxo.y(true);
            progressBarDialogFragmentController.j(extVar);
        }
        this.c.n();
        abeo abeoVar = this.g;
        aben abenVar = new aben(abeoVar.e, abeoVar.a.c());
        abenVar.a = aben.g(str);
        abenVar.j(apzgVar.c);
        abeo abeoVar2 = this.g;
        abeoVar2.b.e(abenVar, new jhd(this, apzgVar, map));
    }
}
