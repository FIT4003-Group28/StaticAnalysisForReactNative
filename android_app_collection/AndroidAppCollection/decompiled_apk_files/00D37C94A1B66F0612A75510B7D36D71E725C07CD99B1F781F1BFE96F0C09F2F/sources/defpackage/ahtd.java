package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ahtd  reason: default package */
/* loaded from: classes.dex */
final class ahtd implements ahtg {
    final /* synthetic */ ahti a;
    private final PlayerResponseModel b;
    private final apzg c;

    public ahtd(ahti ahtiVar, PlayerResponseModel playerResponseModel, apzg apzgVar) {
        this.a = ahtiVar;
        this.b = playerResponseModel;
        this.c = apzgVar;
    }

    @Override // defpackage.ahtg
    public final ahth a(apzg apzgVar) {
        return new ahth(this.a, apzgVar, true);
    }

    @Override // defpackage.ahtg
    public final ahty b() {
        return ahty.LOGGED_ATTACH_PLAYER;
    }

    @Override // defpackage.ahtg
    public final apzg c() {
        return this.c;
    }

    @Override // defpackage.ahtg
    public final Optional d(ahhm ahhmVar) {
        return Optional.of(new ahte(this.a, ahhmVar.a(), ahhmVar.d()));
    }

    @Override // defpackage.ahtg
    public final void e() {
        ahta ahtaVar = this.a.b;
        PlayerResponseModel playerResponseModel = this.b;
        apzg b = ahtaVar.f ? ahta.b(ahtaVar.d) : null;
        ahtx ahtxVar = ahtaVar.b;
        ahsz ahszVar = new ahsz(ahtaVar, 1);
        String str = ahtaVar.c;
        if (playerResponseModel == null) {
            return;
        }
        ahtxVar.b = ahtx.a(b);
        ahtxVar.b(ahszVar, ByteBuffer.wrap(playerResponseModel.J()), b);
        if (str != null) {
            ahtx.c(ahtxVar.e, ahtxVar.b, str);
        }
        ahtxVar.c = playerResponseModel.J();
    }
}
