package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: afdc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afdc implements amqo {
    public final /* synthetic */ PlayerConfigModel a;
    private final /* synthetic */ int b;

    public /* synthetic */ afdc(PlayerConfigModel playerConfigModel) {
        this.a = playerConfigModel;
    }

    public /* synthetic */ afdc(PlayerConfigModel playerConfigModel, int i) {
        this.b = i;
        this.a = playerConfigModel;
    }

    @Override // defpackage.amqo
    public final Object get() {
        return this.b != 0 ? this.a : this.a;
    }
}
