package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahug  reason: default package */
/* loaded from: classes.dex */
public final class ahug implements aiiz {
    public final Executor a;
    public final aisp b;
    private final zey c;
    private final aanz d;
    private final aaqp e;

    public ahug(zey zeyVar, aanz aanzVar, Executor executor, aaqp aaqpVar, aisp aispVar) {
        this.c = zeyVar;
        this.d = aanzVar;
        this.a = executor;
        this.e = aaqpVar;
        this.b = aispVar;
    }

    public static boolean b(askq askqVar) {
        if (askqVar == null || (askqVar.b & 1) == 0) {
            return false;
        }
        askr askrVar = askqVar.c;
        if (askrVar == null) {
            askrVar = askr.a;
        }
        int C = akzj.C(askrVar.b);
        return C != 0 && C == 2;
    }

    @Override // defpackage.aiiz
    public final void a() {
    }

    public final ajfp[] c(ajfq ajfqVar, askq askqVar, long j) {
        ArrayList arrayList = new ArrayList();
        boolean b = b(askqVar);
        for (askp askpVar : askqVar.d) {
            asaj asajVar = (asaj) this.e.a(askpVar.c.I(), asaj.a);
            if (asajVar != null) {
                PlayerResponseModel playerResponseModel = new PlayerResponseModel(asajVar, j, this.d);
                if (playerResponseModel.c != null) {
                    playerResponseModel.d.a("PLAYER_IS_CONTENT_INTERSTITIAL_KEY", true);
                    playerResponseModel.d.a("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY", b);
                    arrayList.add(ajfqVar.m(playerResponseModel, this.c.a(), 2));
                }
            }
        }
        return (ajfp[]) arrayList.toArray(new ajfp[arrayList.size()]);
    }
}
