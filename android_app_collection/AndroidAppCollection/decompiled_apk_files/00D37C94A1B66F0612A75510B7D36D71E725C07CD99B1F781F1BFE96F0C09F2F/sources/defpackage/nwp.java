package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: nwp  reason: default package */
/* loaded from: classes3.dex */
public final class nwp {
    @Backup
    public static final String FLOATY_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP = "floaty_bar_tutorial_last_shown_timestamp";
    @Backup
    public static final String FLOATY_BAR_TUTORIAL_SHOWN_COUNT = "floaty_bar_tutorial_shown_count";

    private nwp() {
    }

    public static Uri a(Context context) {
        return yhr.a(context, "watch", "floatybartutorial.pb");
    }

    public static void b(PlaybackStartDescriptor playbackStartDescriptor, airr airrVar) {
        ajbf n = airrVar.n();
        if (n == null) {
            return;
        }
        PlayerResponseModel c = n.c();
        playbackStartDescriptor.q((c == null || TimeUnit.SECONDS.toMillis((long) c.a()) - n.b() > 1000) ? n.b() : 0L);
    }

    public static WatchNextResponseModel c(String str, boolean z) {
        aopa createBuilder = auqh.a.createBuilder();
        boolean z2 = true;
        if (str != null) {
            aopc aopcVar = (aopc) aunb.a.createBuilder();
            aopg aopgVar = SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer;
            aopa createBuilder2 = auxm.a.createBuilder();
            arag h = ajgl.h(str);
            createBuilder2.copyOnWrite();
            auxm auxmVar = (auxm) createBuilder2.instance;
            h.getClass();
            auxmVar.c = h;
            auxmVar.b |= 1;
            aopcVar.e(aopgVar, (auxm) createBuilder2.mo39build());
            aopc aopcVar2 = (aopc) auxn.a.createBuilder();
            aopcVar2.co((aunb) aopcVar.mo39build());
            auxn auxnVar = (auxn) aopcVar2.mo39build();
            aopa createBuilder3 = auqk.a.createBuilder();
            createBuilder3.copyOnWrite();
            auqk auqkVar = (auqk) createBuilder3.instance;
            auxnVar.getClass();
            auqkVar.bk = auxnVar;
            auqkVar.e |= 8192;
            createBuilder.aJ((auqk) createBuilder3.mo39build());
        }
        if (z) {
            if (str != null) {
                z2 = false;
            }
            createBuilder.aJ(e(z2));
        }
        return d((auqh) createBuilder.mo39build());
    }

    public static WatchNextResponseModel d(auqh auqhVar) {
        aopa createBuilder = asgl.a.createBuilder();
        aopa createBuilder2 = asgk.a.createBuilder();
        createBuilder2.copyOnWrite();
        asgk asgkVar = (asgk) createBuilder2.instance;
        auqhVar.getClass();
        asgkVar.c = auqhVar;
        asgkVar.b = 49399797;
        asgk asgkVar2 = (asgk) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        asgl asglVar = (asgl) createBuilder.instance;
        asgkVar2.getClass();
        asglVar.c = asgkVar2;
        asglVar.b |= 1;
        asgl asglVar2 = (asgl) createBuilder.mo39build();
        aopc aopcVar = (aopc) asgt.a.createBuilder();
        aopa createBuilder3 = asgu.a.createBuilder();
        createBuilder3.copyOnWrite();
        asgu asguVar = (asgu) createBuilder3.instance;
        asglVar2.getClass();
        asguVar.c = asglVar2;
        asguVar.b = 51779735;
        asgu asguVar2 = (asgu) createBuilder3.mo39build();
        aopcVar.copyOnWrite();
        asgt asgtVar = (asgt) aopcVar.instance;
        asguVar2.getClass();
        asgtVar.d = asguVar2;
        asgtVar.b |= 2;
        return new WatchNextResponseModel((asgt) aopcVar.mo39build());
    }

    public static auqk e(boolean z) {
        aopc aopcVar = (aopc) aslq.a.createBuilder();
        if (z) {
            aopa createBuilder = auqc.a.createBuilder();
            createBuilder.copyOnWrite();
            auqc auqcVar = (auqc) createBuilder.instance;
            auqcVar.c = 1;
            auqcVar.b |= 1;
            auqc auqcVar2 = (auqc) createBuilder.mo39build();
            aopa createBuilder2 = aslt.a.createBuilder();
            createBuilder2.copyOnWrite();
            aslt asltVar = (aslt) createBuilder2.instance;
            auqcVar2.getClass();
            asltVar.au = auqcVar2;
            asltVar.h |= 512;
            aopcVar.ck((aslt) createBuilder2.mo39build());
        }
        aopa createBuilder3 = auqc.a.createBuilder();
        createBuilder3.copyOnWrite();
        auqc auqcVar3 = (auqc) createBuilder3.instance;
        auqcVar3.c = 2;
        auqcVar3.b |= 1;
        auqc auqcVar4 = (auqc) createBuilder3.mo39build();
        aopa createBuilder4 = auqc.a.createBuilder();
        createBuilder4.copyOnWrite();
        auqc auqcVar5 = (auqc) createBuilder4.instance;
        auqcVar5.c = 4;
        auqcVar5.b |= 1;
        auqc auqcVar6 = (auqc) createBuilder4.mo39build();
        aopa createBuilder5 = auqc.a.createBuilder();
        createBuilder5.copyOnWrite();
        auqc auqcVar7 = (auqc) createBuilder5.instance;
        auqcVar7.c = 3;
        auqcVar7.b = 1 | auqcVar7.b;
        auqc auqcVar8 = (auqc) createBuilder5.mo39build();
        aopa createBuilder6 = aslt.a.createBuilder();
        createBuilder6.copyOnWrite();
        aslt asltVar2 = (aslt) createBuilder6.instance;
        auqcVar4.getClass();
        asltVar2.au = auqcVar4;
        asltVar2.h |= 512;
        aopcVar.ck((aslt) createBuilder6.mo39build());
        aopa createBuilder7 = aslt.a.createBuilder();
        createBuilder7.copyOnWrite();
        aslt asltVar3 = (aslt) createBuilder7.instance;
        auqcVar6.getClass();
        asltVar3.au = auqcVar6;
        asltVar3.h |= 512;
        aopcVar.ck((aslt) createBuilder7.mo39build());
        aopa createBuilder8 = aslt.a.createBuilder();
        createBuilder8.copyOnWrite();
        aslt asltVar4 = (aslt) createBuilder8.instance;
        auqcVar8.getClass();
        asltVar4.au = auqcVar8;
        asltVar4.h |= 512;
        aopcVar.ck((aslt) createBuilder8.mo39build());
        aopa createBuilder9 = aslt.a.createBuilder();
        createBuilder9.copyOnWrite();
        aslt asltVar5 = (aslt) createBuilder9.instance;
        auqcVar8.getClass();
        asltVar5.au = auqcVar8;
        asltVar5.h |= 512;
        aopcVar.ck((aslt) createBuilder9.mo39build());
        aopa createBuilder10 = auqk.a.createBuilder();
        aslq aslqVar = (aslq) aopcVar.mo39build();
        createBuilder10.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder10.instance;
        aslqVar.getClass();
        auqkVar.j = aslqVar;
        auqkVar.b |= 16;
        return (auqk) createBuilder10.mo39build();
    }

    public static boolean f(int i) {
        return (i == 4 || i == 0) ? false : true;
    }
}
