package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahdd  reason: default package */
/* loaded from: classes.dex */
public final class ahdd {
    private final aanz a;
    private final aaqp b;

    public ahdd(aanz aanzVar, aaqp aaqpVar) {
        this.a = aanzVar;
        this.b = aaqpVar;
    }

    public final List a(PlayerResponseModel playerResponseModel) {
        ArrayList arrayList = new ArrayList();
        long j = playerResponseModel.c.e;
        aopu<askq> aopuVar = playerResponseModel.a.F;
        if (aopuVar.isEmpty()) {
            return arrayList;
        }
        for (askq askqVar : aopuVar) {
            for (askp askpVar : askqVar.d) {
                asaj asajVar = (asaj) this.b.a(askpVar.c.I(), asaj.a);
                if (asajVar != null) {
                    PlayerResponseModel playerResponseModel2 = new PlayerResponseModel(asajVar, j, this.a);
                    if (playerResponseModel2.c != null) {
                        arrayList.add(playerResponseModel2);
                    }
                }
            }
        }
        return arrayList;
    }
}
