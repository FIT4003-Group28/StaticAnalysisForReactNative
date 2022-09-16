package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand;
import com.google.protos.youtube.api.innertube.ClickLoggingWrapperCommandOuterClass;
import com.google.protos.youtube.api.innertube.WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnj  reason: default package */
/* loaded from: classes3.dex */
public final class gnj implements aafl {
    private final aafo a;
    private final acth b;
    private final /* synthetic */ int c;

    public gnj(aafo aafoVar, acth acthVar) {
        this.a = aafoVar;
        this.b = acthVar;
    }

    public gnj(aafo aafoVar, acth acthVar, int i) {
        this.c = i;
        this.a = aafoVar;
        this.b = acthVar;
    }

    public gnj(acth acthVar, aafo aafoVar, int i) {
        this.c = i;
        this.b = acthVar;
        this.a = aafoVar;
    }

    private static View b(View view) {
        if (view.getTag(R.id.elements_image) instanceof awny) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View b = b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aopa createBuilder;
        View view;
        View b;
        int i = this.c;
        asjj asjjVar = null;
        avhn avhnVar = null;
        if (i == 0) {
            if (!apzgVar.qn(AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.adsVisualElementLoggingWrapperCommand)) {
                return;
            }
            AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand = (AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand) apzgVar.qm(AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.adsVisualElementLoggingWrapperCommand);
            apzh apzhVar = apzgVar.e;
            if (apzhVar == null) {
                apzhVar = apzh.a;
            }
            if (apzhVar.qn(askh.a)) {
                createBuilder = ((asjj) apzhVar.qm(askh.a)).mo52toBuilder();
            } else {
                createBuilder = asjj.a.createBuilder();
            }
            if (adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.e && apzhVar.qn(asjb.b)) {
                asjb asjbVar = (asjb) apzhVar.qm(asjb.b);
                createBuilder.copyOnWrite();
                asjj asjjVar2 = (asjj) createBuilder.instance;
                asjbVar.getClass();
                asjjVar2.w = asjbVar;
                asjjVar2.c |= 8192;
            }
            asjj asjjVar3 = (asjj) createBuilder.mo39build();
            if (adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.d) {
                acti oi = this.b.oi();
                acte acteVar = new acte(apzgVar.c);
                if (true != asjj.a.equals(asjjVar3)) {
                    asjjVar = asjjVar3;
                }
                oi.H(3, acteVar, asjjVar);
            }
            if ((adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.b & 1) == 0) {
                return;
            }
            apzg apzgVar2 = adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            if (!asjj.a.equals(asjjVar3)) {
                aopc aopcVar = (aopc) apzgVar2.mo52toBuilder();
                aopc aopcVar2 = (aopc) apzh.a.createBuilder();
                aopcVar2.e(askh.a, asjjVar3);
                apzh apzhVar2 = (apzh) aopcVar2.mo39build();
                aopcVar.copyOnWrite();
                apzg apzgVar3 = (apzg) aopcVar.instance;
                apzhVar2.getClass();
                apzgVar3.e = apzhVar2;
                apzgVar3.b |= 2;
                apzgVar2 = (apzg) aopcVar.mo39build();
            }
            this.a.c(apzgVar2, map);
        } else if (i == 1) {
            if (!apzgVar.qn(WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.watchNextWatchEndpointMutationCommand)) {
                return;
            }
            apzg apzgVar4 = ((WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand) apzgVar.qm(WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.watchNextWatchEndpointMutationCommand)).b;
            if (apzgVar4 == null) {
                apzgVar4 = apzg.a;
            }
            if (map != null && (view = (View) map.get("com.google.android.libraries.youtube.rendering.elements.sender_view")) != null && (b = b(view)) != null) {
                map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", b);
                Object tag = b.getTag(R.id.elements_image);
                if (tag instanceof awny) {
                    aopc aopcVar3 = (aopc) avhn.a.createBuilder();
                    for (awoa awoaVar : ((awny) tag).c) {
                        aopa createBuilder2 = avhm.a.createBuilder();
                        String str = "";
                        String str2 = true != (awoaVar.c == 1 ? (String) awoaVar.d : str).startsWith("//") ? str : "https:";
                        if (awoaVar.c == 1) {
                            str = (String) awoaVar.d;
                        }
                        String valueOf = String.valueOf(str);
                        String concat = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                        createBuilder2.copyOnWrite();
                        avhm avhmVar = (avhm) createBuilder2.instance;
                        concat.getClass();
                        avhmVar.b |= 1;
                        avhmVar.c = concat;
                        int i2 = awoaVar.e;
                        createBuilder2.copyOnWrite();
                        avhm avhmVar2 = (avhm) createBuilder2.instance;
                        avhmVar2.b |= 2;
                        avhmVar2.d = i2;
                        int i3 = awoaVar.f;
                        createBuilder2.copyOnWrite();
                        avhm avhmVar3 = (avhm) createBuilder2.instance;
                        avhmVar3.b |= 4;
                        avhmVar3.e = i3;
                        aopcVar3.cw(createBuilder2);
                    }
                    avhnVar = (avhn) aopcVar3.mo39build();
                }
                map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avhnVar);
            }
            this.a.c(this.b.oi().f(apzgVar4), map);
        } else if (apzgVar.qn(ClickLoggingWrapperCommandOuterClass.clickLoggingWrapperCommand)) {
            apvp apvpVar = (apvp) apzgVar.qm(ClickLoggingWrapperCommandOuterClass.clickLoggingWrapperCommand);
            if ((apvpVar.b & 2) == 0) {
                if (!apvpVar.c) {
                    return;
                }
                this.b.oi().H(3, new acte(apzgVar.c), null);
                return;
            }
            Map j = actk.j(map, apvpVar.c);
            aafo aafoVar = this.a;
            apzg apzgVar5 = apvpVar.d;
            if (apzgVar5 == null) {
                apzgVar5 = apzg.a;
            }
            aafoVar.c(apzgVar5, j);
        }
    }
}
