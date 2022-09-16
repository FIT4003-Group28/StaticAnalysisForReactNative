package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
@Deprecated
/* renamed from: aant  reason: default package */
/* loaded from: classes.dex */
public final class aant implements amqo {
    public final azqb a;
    public PlayerConfigModel b;
    private final ankt c;

    public aant(azqb azqbVar) {
        this.a = azqbVar;
        this.c = ((abfh) azqbVar.get()).e();
    }

    @Override // defpackage.amqo
    @Deprecated
    /* renamed from: a */
    public final synchronized PlayerConfigModel get() {
        if (this.b == null) {
            PlayerConfigModel playerConfigModel = null;
            try {
                playerConfigModel = new PlayerConfigModel((atzv) this.c.get());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                zep.d("Failed to read PlayerConfig from ProtoDataStore.", e);
            }
            if (playerConfigModel == null) {
                playerConfigModel = PlayerConfigModel.b;
            }
            this.b = playerConfigModel;
        }
        return this.b;
    }
}
