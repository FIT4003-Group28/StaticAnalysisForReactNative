package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d {
    private static final acup[] j = {acuo.b(28240), acuo.b(28239), acuo.b(28244), acuo.b(16499), acuo.b(70346), acuo.b(70347), acuo.b(23851), acuo.b(28666)};
    final c a;
    final c b;
    final c c;
    final int d;
    final String e;
    public c i;
    public final Set f = new HashSet();
    private final Set k = new HashSet();
    public Optional g = Optional.empty();
    public Optional h = Optional.empty();

    public d(azqb azqbVar, int i, String str) {
        acsy acsyVar = (acsy) azqbVar;
        this.a = new c(this, acsyVar.get());
        this.b = new c(this, acsyVar.get());
        this.c = new c(this, acsyVar.get());
        this.d = i;
        this.e = str;
    }

    public static final boolean k(Optional optional) {
        return !optional.isPresent() || TextUtils.isEmpty((CharSequence) optional.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final asjj a(String str) {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjp.a.createBuilder();
        if (str != null) {
            createBuilder2.copyOnWrite();
            asjp asjpVar = (asjp) createBuilder2.instance;
            asjpVar.b |= 1;
            asjpVar.c = str;
        }
        String str2 = this.e;
        createBuilder2.copyOnWrite();
        asjp asjpVar2 = (asjp) createBuilder2.instance;
        str2.getClass();
        asjpVar2.b |= 2;
        asjpVar2.d = str2;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjp asjpVar3 = (asjp) createBuilder2.mo39build();
        asjpVar3.getClass();
        asjjVar.j = asjpVar3;
        asjjVar.b |= 64;
        return (asjj) createBuilder.mo39build();
    }

    public final void b() {
        this.f.clear();
    }

    public final void c() {
        for (b bVar : this.k) {
            this.c.a(bVar, (String) this.h.orElse(null));
        }
        this.k.clear();
    }

    public final void d(PlayerResponseModel playerResponseModel, Optional optional) {
        if (playerResponseModel == null) {
            afus.b(2, 4, "handlePlayerResponse called on empty player response");
            return;
        }
        g(optional, playerResponseModel.B());
        b bVar = new b(a.ATTACH, playerResponseModel.J());
        if (j(bVar)) {
            return;
        }
        i(bVar);
        acup[] acupVarArr = j;
        int length = acupVarArr.length;
        for (int i = 0; i < 8; i++) {
            b bVar2 = new b(a.ATTACH, acupVarArr[i]);
            if (!j(bVar2)) {
                i(bVar2);
            }
        }
    }

    public final void e(b bVar) {
        c cVar = this.b;
        if (!cVar.a) {
            afus.b(2, 4, "logChildRequestForPreview called without logNewEmbedPreviewPage");
        } else {
            cVar.a(bVar, null);
        }
    }

    public final void f(Optional optional) {
        c cVar;
        c();
        b();
        c cVar2 = this.c;
        if (cVar2.a) {
            cVar = cVar2;
        } else {
            cVar = this.b;
            if (!cVar.a) {
                cVar = this.a;
            }
        }
        this.i = cVar2;
        cVar.d(optional);
        this.c.b(acuo.a(27240), optional, a(null));
        this.g = optional;
        this.h = Optional.empty();
    }

    public final void g(Optional optional, String str) {
        boolean equals;
        if (this.g.isPresent()) {
            if (!optional.isPresent()) {
                equals = akzj.f(((awel) ((apzg) this.g.get()).qm(WatchEndpointOuterClass.watchEndpoint)).c, str);
            } else {
                equals = ((awel) ((apzg) this.g.get()).qm(WatchEndpointOuterClass.watchEndpoint)).equals(((apzg) optional.get()).qm(WatchEndpointOuterClass.watchEndpoint));
            }
            if (!(!equals)) {
                return;
            }
        }
        if (!optional.isPresent()) {
            optional = Optional.ofNullable(com.google.android.apps.youtube.embeddedplayer.service.util.a.g(str, 0L));
        }
        f(optional);
    }

    public final void h(acup acupVar) {
        b bVar = new b(a.VISIBILITY_UPDATE, acupVar);
        if (!j(bVar)) {
            e(bVar);
        }
    }

    public final void i(b bVar) {
        if (!this.c.a) {
            afus.c(2, 4, "queueOrLogChildRequestForPlayback called before EmbedWatchPage is logged.", new Throwable());
            return;
        }
        this.f.add(bVar);
        if (k(this.h)) {
            this.k.add(bVar);
        } else {
            this.c.a(bVar, (String) this.h.get());
        }
    }

    public final boolean j(b bVar) {
        return this.f.contains(bVar);
    }
}
