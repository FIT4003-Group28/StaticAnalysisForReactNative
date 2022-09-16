package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hut  reason: default package */
/* loaded from: classes3.dex */
public final class hut implements hvm {
    public final hux a;
    public final hvn b;
    public final Executor c;
    public final hwq d;
    public final yiw e = new joq(1);
    public final htu f;
    public final acth g;

    public hut(hux huxVar, hvn hvnVar, Executor executor, hwq hwqVar, htu htuVar, acth acthVar) {
        this.a = huxVar;
        this.b = hvnVar;
        this.c = executor;
        this.d = hwqVar;
        this.f = htuVar;
        this.g = acthVar;
    }

    public static final axbl c(axbm axbmVar, Uri uri) {
        axby axbyVar;
        axby axbyVar2;
        axbk i = axbmVar.i();
        if (i.c == 2) {
            axbyVar = (axby) i.d;
        } else {
            axbyVar = axby.a;
        }
        axbx axbxVar = axbyVar.d;
        if (axbxVar == null) {
            axbxVar = axbx.a;
        }
        aopa mo52toBuilder = axbxVar.mo52toBuilder();
        String uri2 = uri.toString();
        mo52toBuilder.copyOnWrite();
        axbx axbxVar2 = (axbx) mo52toBuilder.instance;
        uri2.getClass();
        axbxVar2.b |= 1;
        axbxVar2.c = uri2;
        axbx axbxVar3 = (axbx) mo52toBuilder.mo39build();
        String c = hve.c(uri);
        axbl axblVar = (axbl) axbmVar.mo52toBuilder();
        aopa mo52toBuilder2 = axbmVar.i().mo52toBuilder();
        axbk i2 = axbmVar.i();
        if (i2.c == 2) {
            axbyVar2 = (axby) i2.d;
        } else {
            axbyVar2 = axby.a;
        }
        aopa mo52toBuilder3 = axbyVar2.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        axby axbyVar3 = (axby) mo52toBuilder3.instance;
        axbxVar3.getClass();
        axbyVar3.d = axbxVar3;
        axbyVar3.b |= 4;
        aopa createBuilder = awzs.a.createBuilder();
        createBuilder.copyOnWrite();
        awzs awzsVar = (awzs) createBuilder.instance;
        c.getClass();
        awzsVar.b = 1;
        awzsVar.c = c;
        awzs awzsVar2 = (awzs) createBuilder.mo39build();
        mo52toBuilder3.copyOnWrite();
        axby axbyVar4 = (axby) mo52toBuilder3.instance;
        awzsVar2.getClass();
        axbyVar4.c = awzsVar2;
        axbyVar4.b |= 2;
        mo52toBuilder2.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder2.instance;
        axby axbyVar5 = (axby) mo52toBuilder3.mo39build();
        axbyVar5.getClass();
        axbkVar.d = axbyVar5;
        axbkVar.c = 2;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder2.mo39build());
        return axblVar;
    }

    private static final Uri d(axbm axbmVar) {
        axby axbyVar;
        axbk i = axbmVar.i();
        if (i.c == 2) {
            axbyVar = (axby) i.d;
        } else {
            axbyVar = axby.a;
        }
        if ((axbyVar.b & 4) != 0) {
            axbx axbxVar = axbyVar.d;
            if (axbxVar == null) {
                axbxVar = axbx.a;
            }
            aopu aopuVar = axbxVar.d;
            return Uri.parse((String) aopuVar.get((aopuVar.indexOf(axbxVar.c) + 1) % aopuVar.size()));
        }
        return null;
    }

    @Override // defpackage.hvm
    public final void a(final axaj axajVar) {
        final Uri d = d(axajVar.c());
        if (d == null) {
            afus.b(2, 24, "VideoFX: Static Sticker added without valid uri");
            this.b.aR(axajVar.mo52toBuilder());
            return;
        }
        this.g.oi().H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        this.c.execute(new Runnable() { // from class: huo
            @Override // java.lang.Runnable
            public final void run() {
                hut hutVar = hut.this;
                hutVar.a.a(d, new hur(hutVar, axajVar));
            }
        });
    }

    @Override // defpackage.hvm
    public final void mt(final axbm axbmVar) {
        final Uri d = d(axbmVar);
        if (d == null) {
            afus.b(2, 24, "VideoFX: Static Sticker added without valid uri");
            this.b.aH((axbl) axbmVar.mo52toBuilder());
            return;
        }
        this.g.oi().H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        this.c.execute(new Runnable() { // from class: hup
            @Override // java.lang.Runnable
            public final void run() {
                hut hutVar = hut.this;
                hutVar.a.a(d, new hus(hutVar, axbmVar));
            }
        });
    }
}
