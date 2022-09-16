package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Collection;
import java.util.Date;
import java.util.List;
/* compiled from: PG */
/* renamed from: agsr  reason: default package */
/* loaded from: classes.dex */
public class agsr implements agup {
    private final aadd a;

    public agsr(aadd aaddVar) {
        this.a = aaddVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static arag j(String str) {
        if (TextUtils.isEmpty(str)) {
            return ajgl.g(new String[0]);
        }
        return ajgl.g(str);
    }

    private final asgt o(Context context, apzg apzgVar, agqo agqoVar) {
        aopa createBuilder = auqh.a.createBuilder();
        createBuilder.aI(e(context, agqoVar));
        auqh auqhVar = (auqh) createBuilder.mo39build();
        aopa createBuilder2 = asgl.a.createBuilder();
        aopa createBuilder3 = asgk.a.createBuilder();
        createBuilder3.copyOnWrite();
        asgk asgkVar = (asgk) createBuilder3.instance;
        auqhVar.getClass();
        asgkVar.c = auqhVar;
        asgkVar.b = 49399797;
        createBuilder2.copyOnWrite();
        asgl asglVar = (asgl) createBuilder2.instance;
        asgk asgkVar2 = (asgk) createBuilder3.mo39build();
        asgkVar2.getClass();
        asglVar.c = asgkVar2;
        asglVar.b |= 1;
        asgl asglVar2 = (asgl) createBuilder2.mo39build();
        aopc aopcVar = (aopc) asgt.a.createBuilder();
        aopcVar.copyOnWrite();
        asgt asgtVar = (asgt) aopcVar.instance;
        apzgVar.getClass();
        asgtVar.n = apzgVar;
        asgtVar.b |= 4096;
        aopa createBuilder4 = asgu.a.createBuilder();
        createBuilder4.copyOnWrite();
        asgu asguVar = (asgu) createBuilder4.instance;
        asglVar2.getClass();
        asguVar.c = asglVar2;
        asguVar.b = 51779735;
        aopcVar.copyOnWrite();
        asgt asgtVar2 = (asgt) aopcVar.instance;
        asgu asguVar2 = (asgu) createBuilder4.mo39build();
        asguVar2.getClass();
        asgtVar2.d = asguVar2;
        asgtVar2.b |= 2;
        return (asgt) aopcVar.mo39build();
    }

    private static asow p(aspc aspcVar) {
        aopc aopcVar = (aopc) asov.a.createBuilder();
        aopcVar.copyOnWrite();
        asov asovVar = (asov) aopcVar.instance;
        aspcVar.getClass();
        asovVar.c = aspcVar;
        asovVar.b |= 1;
        aoob aoobVar = aoob.b;
        aopcVar.copyOnWrite();
        asov asovVar2 = (asov) aopcVar.instance;
        aoobVar.getClass();
        asovVar2.b |= 4096;
        asovVar2.n = aoobVar;
        aopcVar.copyOnWrite();
        asov asovVar3 = (asov) aopcVar.instance;
        asovVar3.b |= 8192;
        asovVar3.o = true;
        aspb aspbVar = aspb.INDIFFERENT;
        aopcVar.copyOnWrite();
        asov asovVar4 = (asov) aopcVar.instance;
        asovVar4.d = aspbVar.e;
        asovVar4.b |= 2;
        asov asovVar5 = (asov) aopcVar.mo39build();
        aopa createBuilder = asow.a.createBuilder();
        createBuilder.copyOnWrite();
        asow asowVar = (asow) createBuilder.instance;
        asovVar5.getClass();
        asowVar.c = asovVar5;
        asowVar.b |= 1;
        return (asow) createBuilder.mo39build();
    }

    @Override // defpackage.agup
    public WatchNextResponseModel a(WatchNextResponseModel watchNextResponseModel, Context context, agqf agqfVar, List list, int i, String str, byte[] bArr, apjj apjjVar) {
        watchNextResponseModel.getClass();
        if (agqfVar != null) {
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
                aopc aopcVar = (aopc) asgtVar.mo52toBuilder();
                String str2 = (awelVar.b & 2) != 0 ? awelVar.d : null;
                String str3 = awelVar.c;
                int i2 = awelVar.e;
                String str4 = awelVar.f;
                apzg apzgVar3 = asgtVar.n;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                apzg d = aguy.d(str2, str3, i2, str4, apzgVar3.c);
                aopcVar.copyOnWrite();
                asgt asgtVar2 = (asgt) aopcVar.instance;
                d.getClass();
                asgtVar2.n = d;
                asgtVar2.b |= 4096;
                asgtVar = (asgt) aopcVar.mo39build();
            }
            return new WatchNextResponseModel(k(context, asgtVar, agqfVar, list, i, str, bArr, apjjVar));
        }
        return watchNextResponseModel;
    }

    @Override // defpackage.agup
    public WatchNextResponseModel b(Context context, agqo agqoVar, String str, byte[] bArr) {
        return new WatchNextResponseModel(l(context, agqoVar, str, bArr));
    }

    @Override // defpackage.agup
    public WatchNextResponseModel c(Context context, agqf agqfVar, List list, int i, String str, byte[] bArr, apjj apjjVar) {
        return new WatchNextResponseModel(m(context, agqfVar, list, i, str, bArr, apjjVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection d() {
        return amvn.r("PPSV");
    }

    protected List e(Context context, agqo agqoVar) {
        aopa createBuilder = auqk.a.createBuilder();
        aopc aopcVar = (aopc) aslq.a.createBuilder();
        aopa createBuilder2 = avzw.a.createBuilder();
        agqa agqaVar = agqoVar.a;
        if (agqaVar != null) {
            arag j = j(agqaVar.b);
            createBuilder2.copyOnWrite();
            avzw avzwVar = (avzw) createBuilder2.instance;
            j.getClass();
            avzwVar.d = j;
            avzwVar.b |= 2;
            avhn e = agqaVar.c.e();
            createBuilder2.copyOnWrite();
            avzw avzwVar2 = (avzw) createBuilder2.instance;
            e.getClass();
            avzwVar2.c = e;
            avzwVar2.b |= 1;
        }
        aopa createBuilder3 = aslt.a.createBuilder();
        createBuilder3.copyOnWrite();
        aslt asltVar = (aslt) createBuilder3.instance;
        avzw avzwVar3 = (avzw) createBuilder2.mo39build();
        avzwVar3.getClass();
        asltVar.U = avzwVar3;
        asltVar.c |= 512;
        aslt asltVar2 = (aslt) createBuilder3.mo39build();
        arag j2 = j(agqoVar.j());
        arag j3 = j(context.getString(R.string.video_views, Long.valueOf(agqoVar.b())));
        arag j4 = j(agqoVar.h());
        arag j5 = j(agqoVar.e());
        arag j6 = j(agqoVar.h());
        arag j7 = j(agqoVar.e());
        aopc aopcVar2 = (aopc) arag.a.createBuilder();
        Date date = agqoVar.d;
        aopc aopcVar3 = (aopc) arai.a.createBuilder();
        aopcVar3.copyOnWrite();
        arai.a((arai) aopcVar3.instance);
        String format = DateFormat.getLongDateFormat(context).format(agqoVar.d);
        aopcVar3.copyOnWrite();
        arai araiVar = (arai) aopcVar3.instance;
        format.getClass();
        araiVar.b |= 1;
        araiVar.c = format;
        aopcVar2.ch((arai) aopcVar3.mo39build());
        arag aragVar = (arag) aopcVar2.mo39build();
        aopc aopcVar4 = (aopc) avzs.a.createBuilder();
        aopcVar4.copyOnWrite();
        avzs avzsVar = (avzs) aopcVar4.instance;
        avzsVar.b |= 16777216;
        avzsVar.g = false;
        aopcVar4.copyOnWrite();
        avzs avzsVar2 = (avzs) aopcVar4.instance;
        avzsVar2.b |= 8388608;
        avzsVar2.f = false;
        arag aragVar2 = agqoVar.e.k;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        aopcVar4.copyOnWrite();
        avzs avzsVar3 = (avzs) aopcVar4.instance;
        aragVar2.getClass();
        avzsVar3.e = aragVar2;
        avzsVar3.b |= 8192;
        aopcVar4.copyOnWrite();
        avzs avzsVar4 = (avzs) aopcVar4.instance;
        aragVar.getClass();
        avzsVar4.h = aragVar;
        avzsVar4.b |= 33554432;
        aopcVar4.copyOnWrite();
        avzs avzsVar5 = (avzs) aopcVar4.instance;
        j3.getClass();
        avzsVar5.d = j3;
        avzsVar5.b |= 16;
        aopcVar4.copyOnWrite();
        avzs avzsVar6 = (avzs) aopcVar4.instance;
        j2.getClass();
        avzsVar6.c = j2;
        avzsVar6.b |= 4;
        aopa createBuilder4 = aspc.a.createBuilder();
        String f = agqoVar.f();
        createBuilder4.copyOnWrite();
        aspc aspcVar = (aspc) createBuilder4.instance;
        f.getClass();
        aspcVar.b |= 1;
        aspcVar.c = f;
        aopa mo52toBuilder = p((aspc) createBuilder4.mo39build()).mo52toBuilder();
        asov asovVar = ((asow) mo52toBuilder.instance).c;
        if (asovVar == null) {
            asovVar = asov.a;
        }
        aopc aopcVar5 = (aopc) asovVar.mo52toBuilder();
        aopcVar5.copyOnWrite();
        asov asovVar2 = (asov) aopcVar5.instance;
        j5.getClass();
        asovVar2.j = j5;
        asovVar2.b |= 256;
        aopcVar5.copyOnWrite();
        asov asovVar3 = (asov) aopcVar5.instance;
        j7.getClass();
        asovVar3.k = j7;
        asovVar3.b |= 512;
        aopcVar5.copyOnWrite();
        asov asovVar4 = (asov) aopcVar5.instance;
        j4.getClass();
        asovVar4.f = j4;
        asovVar4.b |= 8;
        aopcVar5.copyOnWrite();
        asov asovVar5 = (asov) aopcVar5.instance;
        j6.getClass();
        asovVar5.g = j6;
        asovVar5.b |= 16;
        mo52toBuilder.copyOnWrite();
        asow asowVar = (asow) mo52toBuilder.instance;
        asov asovVar6 = (asov) aopcVar5.mo39build();
        asovVar6.getClass();
        asowVar.c = asovVar6;
        asowVar.b |= 1;
        aopcVar4.copyOnWrite();
        avzs avzsVar7 = (avzs) aopcVar4.instance;
        asow asowVar2 = (asow) mo52toBuilder.mo39build();
        asowVar2.getClass();
        avzsVar7.i = asowVar2;
        avzsVar7.b |= 536870912;
        aopa createBuilder5 = aslt.a.createBuilder();
        createBuilder5.copyOnWrite();
        aslt asltVar3 = (aslt) createBuilder5.instance;
        avzs avzsVar8 = (avzs) aopcVar4.mo39build();
        avzsVar8.getClass();
        asltVar3.T = avzsVar8;
        asltVar3.c |= 256;
        aopcVar.cj(amuk.s(asltVar2, (aslt) createBuilder5.mo39build()));
        aslq aslqVar = (aslq) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder.instance;
        aslqVar.getClass();
        auqkVar.j = aslqVar;
        auqkVar.b |= 16;
        return amuk.r((auqk) createBuilder.mo39build());
    }

    protected void f(agqo agqoVar, aopc aopcVar) {
    }

    @Override // defpackage.agup
    public final /* synthetic */ WatchNextResponseModel g(WatchNextResponseModel watchNextResponseModel, Context context, agqf agqfVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, apjj apjjVar) {
        return a(watchNextResponseModel, context, agqfVar, list, i, playbackStartDescriptor.i(), playbackStartDescriptor.y(), apjjVar);
    }

    @Override // defpackage.agup
    public final /* synthetic */ WatchNextResponseModel h(Context context, agqo agqoVar, PlaybackStartDescriptor playbackStartDescriptor) {
        return b(context, agqoVar, playbackStartDescriptor.i(), playbackStartDescriptor.y());
    }

    @Override // defpackage.agup
    public final /* synthetic */ WatchNextResponseModel i(Context context, agqf agqfVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, apjj apjjVar) {
        return c(context, agqfVar, list, i, playbackStartDescriptor.i(), playbackStartDescriptor.y(), apjjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.asgt k(android.content.Context r18, defpackage.asgt r19, defpackage.agqf r20, java.util.List r21, int r22, java.lang.String r23, byte[] r24, defpackage.apjj r25) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsr.k(android.content.Context, asgt, agqf, java.util.List, int, java.lang.String, byte[], apjj):asgt");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final asgt l(Context context, agqo agqoVar, String str, byte[] bArr) {
        agqoVar.getClass();
        return o(context, aguy.c(null, agqoVar, -1, str, bArr), agqoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final asgt m(Context context, agqf agqfVar, List list, int i, String str, byte[] bArr, apjj apjjVar) {
        int max = Math.max(0, Math.min(list.size() - 1, i));
        agqo agqoVar = (agqo) list.get(max);
        return k(context, (asgt) ((aopc) o(context, aguy.c(agqfVar.a, agqoVar, max, str, bArr), agqoVar).mo52toBuilder()).mo39build(), agqfVar, list, max, str, bArr, apjjVar);
    }

    @Override // defpackage.agup
    public final void n() {
    }
}
