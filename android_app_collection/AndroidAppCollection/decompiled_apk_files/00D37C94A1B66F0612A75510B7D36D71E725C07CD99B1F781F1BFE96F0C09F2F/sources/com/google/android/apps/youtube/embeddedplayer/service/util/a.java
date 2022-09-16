package com.google.android.apps.youtube.embeddedplayer.service.util;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    public static PlaybackStartDescriptor a(String str, int i, long j) {
        aijl d = PlaybackStartDescriptor.d();
        d.a = f(str, i, j);
        return d.a();
    }

    public static PlaybackStartDescriptor b(String str, long j) {
        apzg g = g(str, j);
        aijl d = PlaybackStartDescriptor.d();
        d.a = g;
        return d.a();
    }

    public static PlaybackStartDescriptor c(List list, int i, long j) {
        int max = Math.max(0, Math.min(list.size() - 1, i));
        if (max != i) {
            aqvb.l("Out of bounds video list index. Using nearest valid index.", new Object[0]);
        }
        aijl d = PlaybackStartDescriptor.d();
        d.c(list);
        d.b = max;
        d.k = j;
        return d.a();
    }

    public static Optional d(PlaybackStartDescriptor playbackStartDescriptor) {
        apzg apzgVar = playbackStartDescriptor.b;
        if (apzgVar != null) {
            return Optional.of(apzgVar);
        }
        return h(playbackStartDescriptor.m(), playbackStartDescriptor.a(), playbackStartDescriptor.c());
    }

    public static asaa e(auad auadVar) {
        aopa createBuilder = asaa.a.createBuilder();
        createBuilder.copyOnWrite();
        asaa asaaVar = (asaa) createBuilder.instance;
        asaaVar.c = 1;
        asaaVar.b = 1 | asaaVar.b;
        aopa createBuilder2 = arzz.a.createBuilder();
        createBuilder2.copyOnWrite();
        arzz arzzVar = (arzz) createBuilder2.instance;
        auadVar.getClass();
        arzzVar.c = auadVar;
        arzzVar.b = 58356580;
        createBuilder.copyOnWrite();
        asaa asaaVar2 = (asaa) createBuilder.instance;
        arzz arzzVar2 = (arzz) createBuilder2.mo39build();
        arzzVar2.getClass();
        asaaVar2.g = arzzVar2;
        asaaVar2.b |= 32;
        return (asaa) createBuilder.mo39build();
    }

    public static apzg f(String str, int i, long j) {
        if (str == null) {
            return null;
        }
        aopc aopcVar = (aopc) j(j).mo52toBuilder();
        aopa mo52toBuilder = ((awel) aopcVar.qm(WatchEndpointOuterClass.watchEndpoint)).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        awel awelVar = (awel) mo52toBuilder.instance;
        awelVar.b |= 2;
        awelVar.d = str;
        mo52toBuilder.copyOnWrite();
        awel awelVar2 = (awel) mo52toBuilder.instance;
        awelVar2.b |= 4;
        awelVar2.e = i;
        aopcVar.e(WatchEndpointOuterClass.watchEndpoint, (awel) mo52toBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static apzg g(String str, long j) {
        if (str == null) {
            return null;
        }
        aopc aopcVar = (aopc) j(j).mo52toBuilder();
        aopa mo52toBuilder = ((awel) aopcVar.qm(WatchEndpointOuterClass.watchEndpoint)).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        awel awelVar = (awel) mo52toBuilder.instance;
        awelVar.b |= 1;
        awelVar.c = str;
        aopcVar.e(WatchEndpointOuterClass.watchEndpoint, (awel) mo52toBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static Optional h(List list, int i, long j) {
        if (list == null || list.isEmpty()) {
            aqvb.k("Malformed parameters. Video list cannot be empty", new Object[0]);
            return Optional.empty();
        }
        return Optional.ofNullable(g((String) list.get(Math.min(list.size() - 1, Math.max(0, i))), j));
    }

    public static Optional i(SimplePlaybackDescriptor simplePlaybackDescriptor) {
        int i = simplePlaybackDescriptor.a;
        if (i != 1) {
            if (i == 2) {
                return Optional.ofNullable(f(simplePlaybackDescriptor.c, simplePlaybackDescriptor.f, simplePlaybackDescriptor.g));
            }
            if (i == 3) {
                return h(simplePlaybackDescriptor.d, simplePlaybackDescriptor.f, simplePlaybackDescriptor.g);
            }
            aqvb.k("Malformed description, cannot create navigationEndPoint.", new Object[0]);
            return Optional.empty();
        }
        return Optional.ofNullable(g(simplePlaybackDescriptor.b, simplePlaybackDescriptor.g));
    }

    private static apzg j(long j) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = awel.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        createBuilder.copyOnWrite();
        awel awelVar = (awel) createBuilder.instance;
        awelVar.b |= 128;
        awelVar.i = (float) seconds;
        aopcVar.e(WatchEndpointOuterClass.watchEndpoint, (awel) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }
}
