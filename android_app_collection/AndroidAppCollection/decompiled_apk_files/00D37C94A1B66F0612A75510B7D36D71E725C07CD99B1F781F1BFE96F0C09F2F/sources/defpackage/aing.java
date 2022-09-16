package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aing  reason: default package */
/* loaded from: classes.dex */
public final class aing implements afzf {
    private final aanz a;
    private final Set b;
    private final afzf c;
    private final String d;
    private final long e;

    public aing(aanz aanzVar, Set set, afzf afzfVar, String str, long j) {
        this.a = aanzVar;
        this.b = set;
        this.c = afzfVar;
        this.d = str;
        this.e = j;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.c.kV(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asaj asajVar = (asaj) obj;
        long j = this.e;
        PlayerResponseModel playerResponseModel = new PlayerResponseModel(asajVar, j, PlayerResponseModel.e(this.a, asajVar, j, this.d));
        for (aaoo aaooVar : this.b) {
            if (aaooVar != null) {
                aaooVar.a(playerResponseModel);
            }
        }
        this.c.lG(playerResponseModel);
    }
}
