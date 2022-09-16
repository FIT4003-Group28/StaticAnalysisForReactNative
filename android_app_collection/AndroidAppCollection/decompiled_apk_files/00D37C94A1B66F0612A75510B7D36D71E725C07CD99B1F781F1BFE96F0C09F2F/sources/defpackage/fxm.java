package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
/* compiled from: PG */
/* renamed from: fxm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fxm implements zhc {
    private final /* synthetic */ int j;
    public static final /* synthetic */ fxm i = new fxm(8);
    public static final /* synthetic */ fxm h = new fxm(7);
    public static final /* synthetic */ fxm g = new fxm(6);
    public static final /* synthetic */ fxm f = new fxm(5);
    public static final /* synthetic */ fxm e = new fxm(4);
    public static final /* synthetic */ fxm d = new fxm(3);
    public static final /* synthetic */ fxm c = new fxm(2);
    public static final /* synthetic */ fxm b = new fxm(1);
    public static final /* synthetic */ fxm a = new fxm();

    private /* synthetic */ fxm() {
    }

    private /* synthetic */ fxm(int i2) {
        this.j = i2;
    }

    @Override // defpackage.zhc
    public final void a(Object obj, Object obj2) {
        aptn aptnVar;
        boolean z = true;
        switch (this.j) {
            case 0:
                fxq fxqVar = (fxq) obj2;
                ((fxs) obj).a();
                return;
            case 1:
                String str = (String) obj2;
                eki ekiVar = ((ekc) obj).a;
                if (!ekiVar.a.h()) {
                    return;
                }
                apto aptoVar = ((aptk) ekiVar.a.c()).f;
                if (aptoVar == null) {
                    aptoVar = apto.a;
                }
                if (aptoVar.b == 105917786) {
                    aptnVar = (aptn) aptoVar.c;
                } else {
                    aptnVar = aptn.a;
                }
                aopa mo52toBuilder = aptnVar.mo52toBuilder();
                aopa createBuilder = aptn.a.createBuilder();
                arag h2 = ajgl.h(str.length() != 0 ? "@".concat(str) : new String("@"));
                createBuilder.copyOnWrite();
                aptn aptnVar2 = (aptn) createBuilder.instance;
                h2.getClass();
                aptnVar2.d = h2;
                aptnVar2.b |= 4;
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopg aopgVar = ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint;
                aopa createBuilder2 = ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.a.createBuilder();
                aopa createBuilder3 = aptu.a.createBuilder();
                aopa createBuilder4 = aptv.a.createBuilder();
                createBuilder4.copyOnWrite();
                aptv aptvVar = (aptv) createBuilder4.instance;
                aptvVar.b |= 1;
                aptvVar.c = str;
                aptv aptvVar2 = (aptv) createBuilder4.mo39build();
                createBuilder3.copyOnWrite();
                aptu aptuVar = (aptu) createBuilder3.instance;
                aptvVar2.getClass();
                aptuVar.c = aptvVar2;
                aptuVar.b = 372524273;
                aptu aptuVar2 = (aptu) createBuilder3.mo39build();
                createBuilder2.copyOnWrite();
                ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint = (ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) createBuilder2.instance;
                aptuVar2.getClass();
                channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.c = aptuVar2;
                channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.b |= 1;
                aopcVar.e(aopgVar, (ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) createBuilder2.mo39build());
                createBuilder.copyOnWrite();
                aptn aptnVar3 = (aptn) createBuilder.instance;
                apzg apzgVar = (apzg) aopcVar.mo39build();
                apzgVar.getClass();
                aptnVar3.e = apzgVar;
                aptnVar3.b |= 8;
                mo52toBuilder.mergeFrom((aopi) ((aptn) createBuilder.mo39build()));
                ekiVar.aE((aptn) mo52toBuilder.mo39build());
                return;
            case 2:
                gar garVar = (gar) obj2;
                ((gbl) obj).pr(garVar.b(), garVar.a());
                return;
            case 3:
                ((gbm) obj).mO();
                return;
            case 4:
                gas gasVar = (gas) obj2;
                gbd c2 = gasVar.c();
                PaneDescriptor b2 = gasVar.b();
                ojl ojlVar = ((ojj) obj).a;
                aopa createBuilder5 = atnp.a.createBuilder();
                if ((ojlVar.j & 8) != 0 || c2 == null || c2.oi() == null || c2.oi().k() == null) {
                    z = false;
                } else {
                    String k = c2.oi().k();
                    createBuilder5.copyOnWrite();
                    atnp atnpVar = (atnp) createBuilder5.instance;
                    k.getClass();
                    atnpVar.b |= 1;
                    atnpVar.c = k;
                }
                int i2 = ojlVar.j & (-9);
                ojlVar.j = i2;
                if ((i2 & 4) != 0) {
                    int i3 = actj.MOBILE_BACK_BUTTON.II;
                    createBuilder5.copyOnWrite();
                    atnp atnpVar2 = (atnp) createBuilder5.instance;
                    atnpVar2.b |= 2;
                    atnpVar2.d = i3;
                } else if (!z) {
                    return;
                }
                b2.j((atnp) createBuilder5.mo39build());
                return;
            case 5:
                ((gbn) obj).e((gbd) obj2);
                return;
            case 6:
                ((gbp) obj).aI((gbr) obj2);
                return;
            case 7:
                View view = (View) obj2;
                ((Runnable) obj).run();
                return;
            default:
                ((xow) obj).u((aabn) obj2);
                return;
        }
    }
}
