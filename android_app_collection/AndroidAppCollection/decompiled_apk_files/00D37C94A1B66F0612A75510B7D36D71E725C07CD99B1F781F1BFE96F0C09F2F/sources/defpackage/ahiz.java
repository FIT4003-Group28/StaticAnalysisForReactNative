package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahiz  reason: default package */
/* loaded from: classes.dex */
public final class ahiz extends aido {
    private final ahiw d;

    public ahiz(yni yniVar, Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, WillAutonavInformer willAutonavInformer, ahiw ahiwVar, aacz aaczVar, ampq ampqVar, Map map) {
        super(yniVar, executor, azqbVar, azqbVar2, azqbVar3, azqbVar4, willAutonavInformer, aaczVar, ampqVar, map);
        ahiwVar.getClass();
        this.d = ahiwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aido
    public final amvl b(apzg apzgVar, atzb atzbVar) {
        aopa mo52toBuilder = atzbVar.mo52toBuilder();
        ahiy ahiyVar = null;
        if (((atzb) mo52toBuilder.instance).e != 0) {
            if (this.d.a()) {
                int i = ((atzb) mo52toBuilder.instance).e;
                mo52toBuilder.copyOnWrite();
                atzb atzbVar2 = (atzb) mo52toBuilder.instance;
                atzbVar2.b |= 4;
                atzbVar2.d = i;
                if (mo52toBuilder != null && apzgVar != null && apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
                    aopa mo52toBuilder2 = ((awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint)).mo52toBuilder();
                    awel awelVar = (awel) mo52toBuilder2.instance;
                    if ((awelVar.b & 1024) != 0) {
                        awem awemVar = awelVar.l;
                        if (awemVar == null) {
                            awemVar = awem.a;
                        }
                        aopa mo52toBuilder3 = awemVar.mo52toBuilder();
                        mo52toBuilder3.copyOnWrite();
                        awem awemVar2 = (awem) mo52toBuilder3.instance;
                        atzb atzbVar3 = (atzb) mo52toBuilder.mo39build();
                        atzbVar3.getClass();
                        awemVar2.c = atzbVar3;
                        awemVar2.b |= 1;
                        mo52toBuilder2.copyOnWrite();
                        awel awelVar2 = (awel) mo52toBuilder2.instance;
                        awem awemVar3 = (awem) mo52toBuilder3.mo39build();
                        awemVar3.getClass();
                        awelVar2.l = awemVar3;
                        awelVar2.b |= 1024;
                        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                        aopcVar.e(WatchEndpointOuterClass.watchEndpoint, (awel) mo52toBuilder2.mo39build());
                        apzgVar = (apzg) aopcVar.mo39build();
                    }
                }
                apzgVar = null;
            } else {
                ahiyVar = new ahiy(this.a, ((atzb) mo52toBuilder.instance).e);
            }
        }
        amvl b = super.b(apzgVar, (atzb) mo52toBuilder.mo39build());
        if (ahiyVar != null) {
            ahiyVar.d.g(ahiyVar);
            b.c(ahiyVar);
        }
        return b;
    }
}
