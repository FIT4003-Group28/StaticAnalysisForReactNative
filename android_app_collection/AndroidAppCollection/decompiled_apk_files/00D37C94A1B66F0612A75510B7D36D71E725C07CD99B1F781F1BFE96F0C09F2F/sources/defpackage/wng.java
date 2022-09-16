package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wng  reason: default package */
/* loaded from: classes4.dex */
public final class wng implements aaoo {
    public final Set a = new HashSet();

    @Override // defpackage.aaoo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
        for (wlo wloVar : this.a) {
            wloVar.i(playerResponseModel);
        }
    }
}
