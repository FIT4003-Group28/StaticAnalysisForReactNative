package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
/* compiled from: PG */
/* renamed from: alco  reason: default package */
/* loaded from: classes.dex */
public final class alco {
    private final MediaMetadataRetriever a;
    private final MediaExtractor b;

    public alco() {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.a = mediaMetadataRetriever;
        this.b = mediaExtractor;
    }

    public static apxd a(alcs alcsVar) {
        if (alcsVar == null) {
            return null;
        }
        aopa createBuilder = apxd.a.createBuilder();
        double d = alcsVar.b;
        createBuilder.copyOnWrite();
        apxd apxdVar = (apxd) createBuilder.instance;
        int i = 1;
        apxdVar.b |= 1;
        apxdVar.c = d;
        int i2 = alcsVar.c;
        createBuilder.copyOnWrite();
        apxd apxdVar2 = (apxd) createBuilder.instance;
        int i3 = 2;
        apxdVar2.b |= 2;
        apxdVar2.d = i2;
        int i4 = alcsVar.d;
        createBuilder.copyOnWrite();
        apxd apxdVar3 = (apxd) createBuilder.instance;
        apxdVar3.b |= 4;
        apxdVar3.e = i4;
        boolean z = alcsVar.e;
        createBuilder.copyOnWrite();
        apxd apxdVar4 = (apxd) createBuilder.instance;
        apxdVar4.b |= 8;
        apxdVar4.f = z;
        int w = akpq.w(alcsVar.f);
        if (w == 0) {
            w = 2;
        }
        createBuilder.copyOnWrite();
        apxd apxdVar5 = (apxd) createBuilder.instance;
        apxdVar5.g = w - 1;
        apxdVar5.b |= 16;
        int x = akpq.x(alcsVar.g);
        if (x == 0) {
            x = 2;
        }
        createBuilder.copyOnWrite();
        apxd apxdVar6 = (apxd) createBuilder.instance;
        apxdVar6.h = x - 1;
        apxdVar6.b |= 32;
        int x2 = akpq.x(alcsVar.h);
        if (x2 != 0) {
            i3 = x2;
        }
        createBuilder.copyOnWrite();
        apxd apxdVar7 = (apxd) createBuilder.instance;
        apxdVar7.i = i3 - 1;
        apxdVar7.b |= 64;
        double d2 = alcsVar.i;
        createBuilder.copyOnWrite();
        apxd apxdVar8 = (apxd) createBuilder.instance;
        apxdVar8.b |= 128;
        apxdVar8.j = d2;
        int v = akpq.v(alcsVar.j);
        if (v != 0) {
            i = v;
        }
        createBuilder.copyOnWrite();
        apxd apxdVar9 = (apxd) createBuilder.instance;
        apxdVar9.k = i - 1;
        apxdVar9.b |= 256;
        int i5 = alcsVar.k;
        createBuilder.copyOnWrite();
        apxd apxdVar10 = (apxd) createBuilder.instance;
        apxdVar10.b |= 512;
        apxdVar10.l = i5;
        return (apxd) createBuilder.mo39build();
    }
}
