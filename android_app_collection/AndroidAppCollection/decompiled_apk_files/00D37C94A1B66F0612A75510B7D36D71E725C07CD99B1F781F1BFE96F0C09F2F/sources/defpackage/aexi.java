package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aexi  reason: default package */
/* loaded from: classes.dex */
public final class aexi {
    public static final pky[] a = new pky[0];
    public final ScheduledExecutorService b;
    public final aepf c;
    public final adzz d;
    public final Context e;
    public final afhj f;
    public final afbq g;
    public final aeaf h;

    public aexi(ScheduledExecutorService scheduledExecutorService, aepf aepfVar, adzz adzzVar, Context context, afbq afbqVar, aeaf aeafVar, afhj afhjVar) {
        this.b = scheduledExecutorService;
        this.c = aepfVar;
        this.d = adzzVar;
        this.e = context;
        this.g = afbqVar;
        this.h = aeafVar;
        this.f = afhjVar;
    }

    public static void c(awb awbVar, aewx aewxVar) {
        if (j(aewxVar, aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING)) {
            awbVar.h = true;
        }
        if (j(aewxVar, aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_FORCE_WORKAROUND)) {
            awbVar.i = true;
        }
        if (j(aewxVar, aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_ASYNC_QUEUEING_SYNCHRONIZED_INTERACTIONS)) {
            awbVar.j = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final auy d(pvq pvqVar) {
        return new auy(pvqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final afhh e(aewx aewxVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (videoStreamingData.B()) {
            return new afhh(playerConfigModel, videoStreamingData, new aexc(aewxVar), aewxVar.k);
        }
        return afhh.a;
    }

    public static final asu h(aewx aewxVar, aenf aenfVar, afbi afbiVar) {
        int i;
        aflf[] aflfVarArr;
        aflf[] aflfVarArr2;
        PlayerConfigModel a2 = afbiVar.a();
        synchronized (aewxVar) {
            if (aewxVar.D != null && !a2.aa()) {
                aflfVarArr = aewxVar.D;
                aflfVarArr2 = aflfVarArr;
                aewxVar.D = null;
            }
            aflfVarArr = new aflf[0];
            aflfVarArr2 = aflfVarArr;
            aewxVar.D = null;
        }
        for (aflf aflfVar : aflfVarArr2) {
            aflfVar.b(a2, aenfVar, afbiVar.K);
        }
        return new aexe(aflfVarArr2, aewxVar.f, a2, afbiVar, aenfVar);
    }

    public static final aeyq i(aewx aewxVar, aetv aetvVar) {
        return new aexh(aewxVar, aetvVar);
    }

    private static boolean j(aewx aewxVar, aqwv aqwvVar) {
        return aewxVar.i.s.Z(aqwvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final pht a(aewx aewxVar, piv pivVar, pwx pwxVar) {
        afjz afjzVar = aewxVar.i.s;
        Context context = this.e;
        pki pkiVar = new pki(context, aewxVar, aewxVar.s, pivVar, axh.h(context), aewxVar.b);
        Looper mainLooper = Looper.getMainLooper();
        ptx.e(!pkiVar.m);
        pkiVar.h = mainLooper;
        long j = afjzVar.j();
        ptx.e(!pkiVar.m);
        pkiVar.l = j;
        ptx.e(!pkiVar.m);
        pkiVar.i = pwxVar;
        return pkiVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final afci b(aewx aewxVar, afbi afbiVar) {
        PlayerConfigModel a2 = afbiVar.a();
        return new afci(h(aewxVar, null, afbiVar), aewxVar.i.s, a2.A(), a2.z(), afbiVar.b.a(), a2.t(), new aexg[]{f(aewxVar.h)}, aewxVar.i.d);
    }

    public final aexg f(aexl aexlVar) {
        return new aexg(this, aexlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aeyi g(aewx aewxVar, aesh aeshVar, aewp aewpVar, afjz afjzVar) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("aid", zew.A(this.e));
        return new aeyi(aeshVar, hashMap, aewxVar.k, aewpVar, afjzVar);
    }
}
