package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: aaod  reason: default package */
/* loaded from: classes.dex */
public final class aaod {
    public final PlayerResponseModel a;
    private final awiz b;

    public aaod(awiz awizVar, PlayerResponseModel playerResponseModel) {
        this.b = awizVar;
        this.a = playerResponseModel;
    }

    public final CharSequence b() {
        arag aragVar = this.b.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }

    public static aaod a(asaa asaaVar, long j, aanz aanzVar) {
        awiz awizVar;
        asaj asajVar;
        int cj;
        int cj2;
        if (asaaVar != null && (((cj = awwc.cj(asaaVar.c)) != 0 && cj == 3) || ((cj2 = awwc.cj(asaaVar.c)) != 0 && cj2 == 7))) {
            arzz arzzVar = asaaVar.g;
            if (arzzVar == null) {
                arzzVar = arzz.a;
            }
            if (arzzVar.b == 86164011) {
                arzz arzzVar2 = asaaVar.g;
                if (arzzVar2 == null) {
                    arzzVar2 = arzz.a;
                }
                if (arzzVar2.b == 86164011) {
                    awizVar = (awiz) arzzVar2.c;
                } else {
                    awizVar = awiz.a;
                }
                if (awizVar != null || awizVar.b.d() <= 0 || (asajVar = (asaj) aaqp.c(awizVar.b.I(), asaj.a)) == null) {
                    return null;
                }
                PlayerResponseModel playerResponseModel = new PlayerResponseModel(asajVar, j);
                if (aanzVar != null) {
                    playerResponseModel = new PlayerResponseModel(asajVar, j, aanzVar);
                }
                return new aaod(awizVar, playerResponseModel);
            }
        }
        awizVar = null;
        if (awizVar != null) {
        }
        return null;
    }
}
