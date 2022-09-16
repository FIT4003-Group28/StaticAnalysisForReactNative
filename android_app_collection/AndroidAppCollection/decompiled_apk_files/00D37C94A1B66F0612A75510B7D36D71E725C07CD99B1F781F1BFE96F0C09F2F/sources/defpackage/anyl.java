package defpackage;

import android.content.Context;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anyl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class anyl implements anxp {
    private final /* synthetic */ int i;
    public static final /* synthetic */ anyl h = new anyl(7);
    public static final /* synthetic */ anyl g = new anyl(6);
    public static final /* synthetic */ anyl f = new anyl(5);
    public static final /* synthetic */ anyl e = new anyl(4);
    public static final /* synthetic */ anyl d = new anyl(3);
    public static final /* synthetic */ anyl c = new anyl(2);
    public static final /* synthetic */ anyl b = new anyl(1);
    public static final /* synthetic */ anyl a = new anyl();

    private /* synthetic */ anyl() {
    }

    private /* synthetic */ anyl(int i) {
        this.i = i;
    }

    @Override // defpackage.anxp
    public final Object a(anxo anxoVar) {
        switch (this.i) {
            case 0:
                osq.b((Context) anxoVar.a(Context.class));
                return osq.a().c();
            case 1:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(anxoVar);
            case 2:
                return new anzj((Context) anxoVar.a(Context.class));
            case 3:
                anwg anwgVar = (anwg) anxoVar.a(anwg.class);
                return new FirebaseInstanceId(anwgVar, new anzv(anwgVar.a()), anzn.a(), anzn.a(), anxoVar.b(aodn.class), anxoVar.b(anzl.class), (aoal) anxoVar.a(aoal.class));
            case 4:
                return new anzw((FirebaseInstanceId) anxoVar.a(FirebaseInstanceId.class));
            case 5:
                return new aoak((anwg) anxoVar.a(anwg.class), anxoVar.b(aodn.class), anxoVar.b(anzl.class));
            case 6:
                return new FirebaseMessaging((anwg) anxoVar.a(anwg.class), (aoae) anxoVar.a(aoae.class), anxoVar.b(aodn.class), anxoVar.b(anzl.class), (aoal) anxoVar.a(aoal.class), (osn) anxoVar.a(osn.class), (anzh) anxoVar.a(anzh.class));
            default:
                anyk anykVar = (anyk) anxoVar;
                if (!anykVar.a.contains(aodl.class)) {
                    throw new anya(String.format("Attempting to request an undeclared dependency Set<%s>.", aodl.class));
                }
                Set set = (Set) ((anxk) anykVar.b).c(aodl.class).a();
                aodk aodkVar = aodk.a;
                if (aodkVar == null) {
                    synchronized (aodk.class) {
                        aodkVar = aodk.a;
                        if (aodkVar == null) {
                            aodkVar = new aodk();
                            aodk.a = aodkVar;
                        }
                    }
                }
                return new aodj(set, aodkVar);
        }
    }
}
