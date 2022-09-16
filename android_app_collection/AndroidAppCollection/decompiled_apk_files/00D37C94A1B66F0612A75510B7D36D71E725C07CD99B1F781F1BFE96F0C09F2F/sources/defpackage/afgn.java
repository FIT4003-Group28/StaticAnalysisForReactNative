package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: afgn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afgn {
    public static afgq a(PlayerConfigModel playerConfigModel) {
        return new afgp(playerConfigModel.z());
    }

    public static afgq b(PlayerConfigModel playerConfigModel, aepf aepfVar) {
        int i;
        int i2;
        aqwu aqwuVar = playerConfigModel.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        int aw = akel.aw(aqwuVar.r);
        int i3 = 1;
        if (aw == 0 || aw == 1) {
            i3 = 2;
        } else {
            aqwu aqwuVar2 = playerConfigModel.c.e;
            if (aqwuVar2 == null) {
                aqwuVar2 = aqwu.b;
            }
            int aw2 = akel.aw(aqwuVar2.r);
            if (aw2 != 0) {
                i3 = aw2;
            }
        }
        if (i3 - 1 == 2) {
            aqwu aqwuVar3 = playerConfigModel.c.e;
            if (aqwuVar3 == null) {
                aqwuVar3 = aqwu.b;
            }
            if (aqwuVar3.t != 0) {
                aqwu aqwuVar4 = playerConfigModel.c.e;
                if (aqwuVar4 == null) {
                    aqwuVar4 = aqwu.b;
                }
                i = aqwuVar4.t;
            } else {
                i = 11000;
            }
            aqwu aqwuVar5 = playerConfigModel.c.e;
            if (aqwuVar5 == null) {
                aqwuVar5 = aqwu.b;
            }
            if (aqwuVar5.u != 0) {
                aqwu aqwuVar6 = playerConfigModel.c.e;
                if (aqwuVar6 == null) {
                    aqwuVar6 = aqwu.b;
                }
                i2 = aqwuVar6.u;
            } else {
                i2 = 10000;
            }
            return new afgo(i, i2, playerConfigModel.A(), aepfVar);
        }
        return new afgp(playerConfigModel.A());
    }

    public static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public static void d(aetw aetwVar) {
        afms.a(aetwVar.a);
        afms.a(aetwVar.a());
    }

    public static final aenr e(ati atiVar, ScheduledExecutorService scheduledExecutorService, aenm aenmVar) {
        afms.a(atiVar);
        afms.a(scheduledExecutorService);
        aenr aenrVar = new aenr(aenmVar);
        aenrVar.a = new aehx(atiVar, scheduledExecutorService, aenrVar);
        return aenrVar;
    }
}
