package defpackage;

import android.util.Base64;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: hta  reason: default package */
/* loaded from: classes3.dex */
public final class hta {
    public final vne a;

    public hta(vne vneVar) {
        this.a = vneVar;
    }

    public final ankt a(apy apyVar) {
        return ylx.b(apyVar, this.a.a(), gvq.i);
    }

    public final void b(final aunb aunbVar, apy apyVar) {
        aunbVar.getClass();
        ylx.n(apyVar, a(apyVar), hmv.e, new zdt() { // from class: hsz
            @Override // defpackage.zdt
            public final void a(Object obj) {
                hta htaVar = hta.this;
                aunb aunbVar2 = aunbVar;
                List<aunb> list = (List) obj;
                if (list == null) {
                    return;
                }
                for (aunb aunbVar3 : list) {
                    if (!aunbVar3.qn(StickerCatalogRendererOuterClass.stickerRenderer) || !aunbVar2.qn(StickerCatalogRendererOuterClass.stickerRenderer)) {
                        auzh auzhVar = (auzh) aunbVar3.qm(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
                        auzh auzhVar2 = (auzh) aunbVar2.qm(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
                        if (aunbVar3.qn(StickerCatalogRendererOuterClass.dynamicStickerRenderer) && aunbVar2.qn(StickerCatalogRendererOuterClass.dynamicStickerRenderer)) {
                            int e = aqvb.e(auzhVar.c);
                            int i = 1;
                            if (e == 0 || e != 4) {
                                int e2 = aqvb.e(auzhVar.c);
                                if (e2 == 0) {
                                    e2 = 1;
                                }
                                int e3 = aqvb.e(auzhVar2.c);
                                if (e3 != 0) {
                                    i = e3;
                                }
                                if (e2 == i) {
                                    list.remove(aunbVar3);
                                    break;
                                }
                            } else {
                                int e4 = aqvb.e(auzhVar.c);
                                if (e4 == 0) {
                                    e4 = 1;
                                }
                                int e5 = aqvb.e(auzhVar2.c);
                                if (e5 != 0) {
                                    i = e5;
                                }
                                if (e4 == i) {
                                    arag aragVar = auzhVar.d;
                                    if (aragVar == null) {
                                        aragVar = arag.a;
                                    }
                                    arag aragVar2 = auzhVar2.d;
                                    if (aragVar2 == null) {
                                        aragVar2 = arag.a;
                                    }
                                    if (aragVar.equals(aragVar2)) {
                                        list.remove(aunbVar3);
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } else if (hve.b(aunbVar3).equals(hve.b(aunbVar2))) {
                        list.remove(aunbVar3);
                        break;
                    }
                }
                list.add(0, aunbVar2);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                aopa createBuilder = auzj.a.createBuilder();
                createBuilder.copyOnWrite();
                auzj auzjVar = (auzj) createBuilder.instance;
                aopu aopuVar = auzjVar.b;
                if (!aopuVar.c()) {
                    auzjVar.b = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) arrayList, (List) auzjVar.b);
                ylx.m(htaVar.a.b(new fct(Base64.encodeToString(((auzj) createBuilder.mo39build()).toByteArray(), 0), 8), anjk.a), gpe.f);
            }
        });
    }
}
