package defpackage;

import com.google.android.libraries.phenotype.client.stable.PhenotypeUpdateBackgroundBroadcastReceiver;
import java.util.concurrent.Executors;
/* renamed from: cxlu  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cxlu implements dbty {
    public static final dbty a = new cxlu();

    private cxlu() {
    }

    @Override // defpackage.dbty
    public final Object a() {
        dehq dehqVar = PhenotypeUpdateBackgroundBroadcastReceiver.a;
        return dehx.d(Executors.newSingleThreadScheduledExecutor(cxlt.a));
    }
}
