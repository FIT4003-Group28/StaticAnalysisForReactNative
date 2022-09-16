package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: xda  reason: default package */
/* loaded from: classes4.dex */
public final class xda {
    private static final PlaybackTrackingModel a = new PlaybackTrackingModel(asab.a);

    public static PlayerResponseModel a(PlayerAd playerAd) {
        if (playerAd.g() != null) {
            return playerAd.g();
        }
        return new PlayerResponseModel(playerAd.e(), playerAd.f(), playerAd.k);
    }

    public static PlayerResponseModel b(aanz aanzVar, apaa apaaVar, PlayerConfigModel playerConfigModel) {
        apaaVar.getClass();
        aopa createBuilder = asan.a.createBuilder();
        for (apab apabVar : apaaVar.b) {
            if (!apabVar.d.isEmpty() && !TextUtils.equals(apabVar.d, "null/null") && !apabVar.e.isEmpty()) {
                aopc aopcVar = (aopc) aqzx.b.createBuilder();
                String trim = apabVar.e.trim();
                aopcVar.copyOnWrite();
                aqzx aqzxVar = (aqzx) aopcVar.instance;
                trim.getClass();
                aqzxVar.c |= 2;
                aqzxVar.e = trim;
                String str = apabVar.d;
                aopcVar.copyOnWrite();
                aqzx aqzxVar2 = (aqzx) aopcVar.instance;
                str.getClass();
                aqzxVar2.c |= 4;
                aqzxVar2.f = str;
                int i = apabVar.b;
                aopcVar.copyOnWrite();
                aqzx aqzxVar3 = (aqzx) aopcVar.instance;
                aqzxVar3.c |= 64;
                aqzxVar3.j = i;
                int i2 = apabVar.c;
                aopcVar.copyOnWrite();
                aqzx aqzxVar4 = (aqzx) aopcVar.instance;
                aqzxVar4.c |= 32;
                aqzxVar4.i = i2;
                createBuilder.copyOnWrite();
                asan asanVar = (asan) createBuilder.instance;
                aqzx aqzxVar5 = (aqzx) aopcVar.mo39build();
                aqzxVar5.getClass();
                asanVar.b();
                asanVar.d.add(aqzxVar5);
            }
        }
        if (Collections.unmodifiableList(((asan) createBuilder.instance).d).isEmpty()) {
            return null;
        }
        return new PlayerResponseModel(aanzVar.e((asan) createBuilder.mo39build(), null, apaaVar.c), a, playerConfigModel);
    }
}
