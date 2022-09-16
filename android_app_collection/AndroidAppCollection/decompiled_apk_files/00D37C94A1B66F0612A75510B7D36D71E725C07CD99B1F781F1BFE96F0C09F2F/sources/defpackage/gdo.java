package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: gdo  reason: default package */
/* loaded from: classes3.dex */
public final class gdo {
    public final dt a;
    public final azqb b;
    public final azqb c;

    public gdo(dt dtVar, azqb azqbVar, azqb azqbVar2) {
        this.a = dtVar;
        this.b = azqbVar;
        this.c = azqbVar2;
    }

    public static boolean a(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return false;
        }
        return aijr.g(playerResponseModel.t());
    }

    public static boolean b(PlayerResponseModel playerResponseModel, boolean z, ezx ezxVar) {
        return playerResponseModel != null && c(playerResponseModel) && z && ezxVar != null && !ezxVar.g() && ezxVar.h();
    }

    public static boolean c(PlayerResponseModel playerResponseModel) {
        atxe atxeVar;
        if (playerResponseModel == null) {
            return true;
        }
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        if (videoStreamingData != null && (videoStreamingData.w() || videoStreamingData.H())) {
            return false;
        }
        asaa t = playerResponseModel.t();
        if (!aijr.g(t)) {
            if (t != null) {
                arzx arzxVar = t.h;
                if (arzxVar == null) {
                    arzxVar = arzx.a;
                }
                if (arzxVar.b == 151635310) {
                    atxeVar = (atxe) arzxVar.c;
                } else {
                    atxeVar = atxe.a;
                }
                if (atxeVar.b) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean d(ajbf ajbfVar) {
        return (ajbfVar == null || ajbfVar.c() == null) ? false : true;
    }
}
