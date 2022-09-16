package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: afld  reason: default package */
/* loaded from: classes.dex */
public final class afld {
    public final String a;
    public final PlayerConfigModel b;
    public final amqo c;
    public final aenf d;
    public final aflm e;
    public final boolean f;
    public final afjp g;
    public final ampq h;
    public final aeub i;

    public afld(String str, PlayerConfigModel playerConfigModel, amqo amqoVar, aenf aenfVar, aflm aflmVar, boolean z, afjp afjpVar, ampq ampqVar, aeub aeubVar) {
        this.a = str;
        this.b = playerConfigModel;
        this.c = amqoVar;
        this.d = aenfVar;
        this.e = aflmVar;
        this.f = z;
        this.g = afjpVar;
        this.h = ampqVar;
        this.i = aeubVar;
    }

    public static aflc a(PlayerConfigModel playerConfigModel) {
        return new aflc(playerConfigModel);
    }
}
