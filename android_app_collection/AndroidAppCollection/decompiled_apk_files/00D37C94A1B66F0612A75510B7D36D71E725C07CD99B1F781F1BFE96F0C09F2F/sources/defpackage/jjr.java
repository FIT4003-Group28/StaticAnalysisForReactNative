package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.List;
/* compiled from: PG */
/* renamed from: jjr  reason: default package */
/* loaded from: classes3.dex */
public final class jjr implements jjs {
    private final Context a;
    private final jml b;
    private final agsm c;
    private final String d;
    private final boolean e;

    public jjr(Context context, jml jmlVar, agsm agsmVar, aacz aaczVar) {
        this.a = context;
        this.b = jmlVar;
        this.c = agsmVar;
        asxj asxjVar = aaczVar.b().e;
        this.d = (asxjVar == null ? asxj.a : asxjVar).aD;
        asxj asxjVar2 = aaczVar.b().e;
        this.e = (asxjVar2 == null ? asxj.a : asxjVar2).bb;
    }

    @Override // defpackage.jjs
    public final WatchNextResponseModel a(final PlaybackStartDescriptor playbackStartDescriptor, amuk amukVar) {
        final jbe a = jbe.a(this.a, this.e, amukVar);
        if (a.e.isEmpty()) {
            return new WatchNextResponseModel(asgt.a);
        }
        return new WatchNextResponseModel((asgt) this.b.f((jbc) a.e.get(playbackStartDescriptor.a()), playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.i(), aoob.x(playbackStartDescriptor.y())).map(new Function() { // from class: jjq
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return jjr.this.d((asgt) obj, a, playbackStartDescriptor);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).orElseGet(ibz.i));
    }

    @Override // defpackage.jjs
    public final WatchNextResponseModel b(WatchNextResponseModel watchNextResponseModel, PlaybackStartDescriptor playbackStartDescriptor, amuk amukVar) {
        aopc aopcVar;
        jbe a = jbe.a(this.a, this.e, amukVar);
        asgt asgtVar = watchNextResponseModel.a;
        apzg apzgVar = asgtVar.n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            apzg apzgVar2 = asgtVar.n;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            awel awelVar = (awel) apzgVar2.qm(WatchEndpointOuterClass.watchEndpoint);
            aopcVar = (aopc) asgtVar.mo52toBuilder();
            String str = (awelVar.b & 2) != 0 ? awelVar.d : null;
            String str2 = awelVar.c;
            int i = awelVar.e;
            String str3 = awelVar.f;
            apzg apzgVar3 = asgtVar.n;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            apzg d = aguy.d(str, str2, i, str3, apzgVar3.c);
            aopcVar.copyOnWrite();
            asgt asgtVar2 = (asgt) aopcVar.instance;
            d.getClass();
            asgtVar2.n = d;
            asgtVar2.b |= 4096;
        } else {
            aopcVar = (aopc) asgtVar.mo52toBuilder();
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str4 = this.d;
            apzg apzgVar4 = ((asgt) aopcVar.instance).v;
            if (apzgVar4 == null) {
                apzgVar4 = apzg.a;
            }
            if (str4.equals(ntr.e((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar4.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)))) {
                aopcVar.copyOnWrite();
                asgt asgtVar3 = (asgt) aopcVar.instance;
                asgtVar3.v = null;
                asgtVar3.b &= -262145;
            }
        }
        return new WatchNextResponseModel(d((asgt) aopcVar.mo39build(), a, playbackStartDescriptor));
    }

    @Override // defpackage.jjs
    public final WatchNextResponseModel c(PlaybackStartDescriptor playbackStartDescriptor, aajj aajjVar) {
        Optional a = jbc.a(aajjVar);
        if (a.isPresent()) {
            Optional f = this.b.f((jbc) a.get(), playbackStartDescriptor.k(), -1, playbackStartDescriptor.i(), aoob.x(playbackStartDescriptor.y()));
            if (f.isPresent()) {
                return new WatchNextResponseModel((asgt) f.get());
            }
        }
        return new WatchNextResponseModel(asgt.a);
    }

    public final asgt d(asgt asgtVar, jbe jbeVar, PlaybackStartDescriptor playbackStartDescriptor) {
        asgl asglVar;
        asgu asguVar = asgtVar.d;
        if (asguVar == null) {
            asguVar = asgu.a;
        }
        if (asguVar.b == 51779735) {
            asgu asguVar2 = asgtVar.d;
            if (asguVar2 == null) {
                asguVar2 = asgu.a;
            }
            if (asguVar2.b == 51779735) {
                asglVar = (asgl) asguVar2.c;
            } else {
                asglVar = asgl.a;
            }
            aopa mo52toBuilder = asglVar.mo52toBuilder();
            Optional map = Optional.ofNullable((audg) this.b.g(jbe.class, audg.class, jbeVar, amup.m("downloaded_playlist_selected_video_index", Integer.valueOf(playbackStartDescriptor.a()), "watch_command_params", playbackStartDescriptor.i(), "watch_command_click_tracking_params", aoob.x(playbackStartDescriptor.y())))).map(ioc.q);
            mo52toBuilder.getClass();
            map.ifPresent(new whz(mo52toBuilder, 1));
            aopa createBuilder = asgh.a.createBuilder();
            apjj a = this.c.a(playbackStartDescriptor, (List) Collection.EL.stream(jbeVar.e).map(ioc.p).collect(Collectors.toList()));
            createBuilder.copyOnWrite();
            asgh asghVar = (asgh) createBuilder.instance;
            a.getClass();
            asghVar.c = a;
            asghVar.b = 46659098;
            asgh asghVar2 = (asgh) createBuilder.mo39build();
            mo52toBuilder.copyOnWrite();
            asgl asglVar2 = (asgl) mo52toBuilder.instance;
            asghVar2.getClass();
            asglVar2.e = asghVar2;
            asglVar2.b |= 4;
            aopc aopcVar = (aopc) asgtVar.mo52toBuilder();
            asgu asguVar3 = asgtVar.d;
            if (asguVar3 == null) {
                asguVar3 = asgu.a;
            }
            aopa mo52toBuilder2 = asguVar3.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            asgu asguVar4 = (asgu) mo52toBuilder2.instance;
            asgl asglVar3 = (asgl) mo52toBuilder.mo39build();
            asglVar3.getClass();
            asguVar4.c = asglVar3;
            asguVar4.b = 51779735;
            aopcVar.copyOnWrite();
            asgt asgtVar2 = (asgt) aopcVar.instance;
            asgu asguVar5 = (asgu) mo52toBuilder2.mo39build();
            asguVar5.getClass();
            asgtVar2.d = asguVar5;
            asgtVar2.b |= 2;
            return (asgt) aopcVar.mo39build();
        }
        return asgtVar;
    }

    @Override // defpackage.jjs
    public final WatchNextResponseModel e() {
        return new WatchNextResponseModel(asgt.a);
    }
}
