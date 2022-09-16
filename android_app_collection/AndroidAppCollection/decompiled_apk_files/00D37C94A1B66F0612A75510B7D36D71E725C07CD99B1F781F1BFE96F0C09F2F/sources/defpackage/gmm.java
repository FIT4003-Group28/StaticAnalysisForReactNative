package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.GoogleMapsNavigationEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gmm  reason: default package */
/* loaded from: classes3.dex */
public final class gmm implements aafl, yiu {
    private final Context a;
    private final aafo b;
    private final yjk c;

    public gmm(yjk yjkVar, aafo aafoVar, Context context) {
        this.c = yjkVar;
        aafoVar.getClass();
        this.b = aafoVar;
        this.a = context;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint)) {
            return;
        }
        area areaVar = (area) apzgVar.qm(GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint);
        Uri parse = (areaVar.b & 1) != 0 ? Uri.parse(areaVar.c) : null;
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.setPackage("com.google.android.apps.maps");
        PackageManager packageManager = this.a.getPackageManager();
        if (parse == null || packageManager.resolveActivity(intent, 65536) == null) {
            if ((areaVar.b & 2) == 0) {
                return;
            }
            aafo aafoVar = this.b;
            apzg apzgVar2 = areaVar.d;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.c(apzgVar2, map);
            return;
        }
        this.c.a(intent, 2100, this);
    }
}
