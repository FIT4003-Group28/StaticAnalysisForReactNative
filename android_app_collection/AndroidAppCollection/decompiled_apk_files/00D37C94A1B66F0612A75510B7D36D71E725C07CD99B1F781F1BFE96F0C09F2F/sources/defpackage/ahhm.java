package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ahhm  reason: default package */
/* loaded from: classes.dex */
public class ahhm {
    public static final ahhm a = new ahhm(aijx.NEW, null, null, null);
    private final aijx b;
    private final PlayerResponseModel c;
    private final WatchNextResponseModel d;
    private final apzg e;

    public ahhm(aijx aijxVar, PlayerResponseModel playerResponseModel, WatchNextResponseModel watchNextResponseModel, apzg apzgVar) {
        this.b = aijxVar;
        this.c = playerResponseModel;
        this.d = watchNextResponseModel;
        this.e = apzgVar;
    }

    public WatchNextResponseModel a() {
        return this.d;
    }

    public PlayerResponseModel b() {
        return this.c;
    }

    public aijx c() {
        return this.b;
    }

    public apzg d() {
        return this.e;
    }
}
