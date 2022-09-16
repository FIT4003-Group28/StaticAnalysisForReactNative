package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;
/* compiled from: PG */
/* renamed from: afda  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afda {
    public final /* synthetic */ Context a;
    public final /* synthetic */ azqb b;
    public final /* synthetic */ aesh c;

    public /* synthetic */ afda(Context context, azqb azqbVar, aesh aeshVar) {
        this.a = context;
        this.b = azqbVar;
        this.c = aeshVar;
    }

    public final aerx a(WidevineHelper$Listener widevineHelper$Listener, int i, PlayerConfigModel playerConfigModel) {
        Context context = this.a;
        return new aerx(widevineHelper$Listener, i, playerConfigModel, zew.A(context), this.b, this.c);
    }
}
