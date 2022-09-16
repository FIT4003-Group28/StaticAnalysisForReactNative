package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
/* compiled from: PG */
/* renamed from: jmw  reason: default package */
/* loaded from: classes3.dex */
public final class jmw extends jlp {
    private final Context a;

    public jmw(Context context) {
        super(avny.class);
        this.a = context;
    }

    private final arag f(int i) {
        return ajgl.h(this.a.getString(i));
    }

    @Override // defpackage.jlp
    public final /* bridge */ /* synthetic */ Object a(amup amupVar) {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = UrlEndpointOuterClass.urlEndpoint;
        aopa createBuilder = avvk.a.createBuilder();
        createBuilder.copyOnWrite();
        avvk avvkVar = (avvk) createBuilder.instance;
        avvkVar.b |= 1;
        avvkVar.c = "https://support.google.com/youtube/answer/6307365";
        createBuilder.copyOnWrite();
        avvk avvkVar2 = (avvk) createBuilder.instance;
        avvkVar2.d = 1;
        avvkVar2.b |= 2;
        aopcVar.e(aopgVar, (avvk) createBuilder.mo39build());
        boolean z = amupVar != null && ((Boolean) amupVar.getOrDefault("is_travel_message", false)).booleanValue();
        boolean z2 = amupVar != null && ((Boolean) amupVar.getOrDefault("is_texit_message", false)).booleanValue();
        aopa createBuilder2 = avny.a.createBuilder();
        if (z) {
            createBuilder2.aT(f(R.string.travel_error_message));
        } else if (z2) {
            aopg aopgVar2 = UrlEndpointOuterClass.urlEndpoint;
            aopa createBuilder3 = avvk.a.createBuilder();
            createBuilder3.copyOnWrite();
            avvk avvkVar3 = (avvk) createBuilder3.instance;
            avvkVar3.b |= 1;
            avvkVar3.c = "https://support.google.com/youtube/answer/6141269";
            createBuilder3.copyOnWrite();
            avvk avvkVar4 = (avvk) createBuilder3.instance;
            avvkVar4.d = 1;
            avvkVar4.b |= 2;
            aopcVar.e(aopgVar2, (avvk) createBuilder3.mo39build());
            createBuilder2.aT(ajgl.h(nni.p(this.a, ((Integer) e(amupVar, "unplayable_in_secs")).intValue(), false)));
        }
        avgg avggVar = avgg.THEME_ATTRIBUTE_SUGGESTED_ACTION;
        createBuilder2.copyOnWrite();
        avny avnyVar = (avny) createBuilder2.instance;
        avnyVar.d = Integer.valueOf(avggVar.ai);
        avnyVar.c = 8;
        avgg avggVar2 = avgg.THEME_ATTRIBUTE_TEXT1;
        createBuilder2.copyOnWrite();
        avny avnyVar2 = (avny) createBuilder2.instance;
        avnyVar2.i = avggVar2.ai;
        avnyVar2.b |= 32;
        aopa createBuilder4 = apok.a.createBuilder();
        aopc aopcVar2 = (aopc) apoj.a.createBuilder();
        arag f = f(R.string.learn_more);
        aopcVar2.copyOnWrite();
        apoj apojVar = (apoj) aopcVar2.instance;
        f.getClass();
        apojVar.i = f;
        apojVar.b |= 256;
        aopcVar2.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar2.instance;
        apojVar2.d = 13;
        apojVar2.c = 1;
        aopcVar2.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar2.instance;
        apzg apzgVar = (apzg) aopcVar.mo39build();
        apzgVar.getClass();
        apojVar3.p = apzgVar;
        apojVar3.b |= 32768;
        createBuilder4.copyOnWrite();
        apok apokVar = (apok) createBuilder4.instance;
        apoj apojVar4 = (apoj) aopcVar2.mo39build();
        apojVar4.getClass();
        apokVar.c = apojVar4;
        apokVar.b |= 1;
        createBuilder2.copyOnWrite();
        avny avnyVar3 = (avny) createBuilder2.instance;
        apok apokVar2 = (apok) createBuilder4.mo39build();
        apokVar2.getClass();
        avnyVar3.g = apokVar2;
        avnyVar3.b |= 2;
        return (avny) createBuilder2.mo39build();
    }
}
