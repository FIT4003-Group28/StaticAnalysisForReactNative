package defpackage;

import com.google.android.apps.youtube.app.extensions.lens.LensController;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gsb  reason: default package */
/* loaded from: classes3.dex */
public final class gsb implements aafl {
    public static final /* synthetic */ int a = 0;
    private final Executor b;
    private final azqb c;
    private final azqb d;
    private final azqb e;

    public gsb(Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.b = executor;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Long l;
        if (!apzgVar.qn(LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.lensWatchNextRequestContinuationCommand)) {
            throw new aafy();
        }
        String str = ((LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand) apzgVar.qm(LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.lensWatchNextRequestContinuationCommand)).b;
        if (str.isEmpty()) {
            return;
        }
        String.format(Locale.US, "[LENS] Making GetWatchNext continuation request with token: %s", str);
        final LensController lensController = (LensController) this.e.get();
        abed b = ((abec) this.d.get()).b();
        str.getClass();
        b.d = str;
        b.k(lensController.f);
        if (map != null && (l = (Long) map.get("player_timestamp_ms")) != null) {
            b.v = l.longValue();
        }
        abeb abebVar = (abeb) this.c.get();
        ylx.k(abebVar.b.o(b, anjk.a, abeb.e(abebVar.a, abebVar.c)), this.b, new ylv() { // from class: grz
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                LensController lensController2 = LensController.this;
                int i = gsb.a;
                if (!lensController2.b) {
                    return;
                }
                String.format(Locale.US, "[LENS] Received error response: %s", th.getMessage());
            }
        }, new ylw() { // from class: gsa
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                oeu oeuVar;
                aqvq aqvqVar;
                LensController lensController2 = LensController.this;
                int i = gsb.a;
                asgt asgtVar = ((WatchNextResponseModel) obj).a;
                if (lensController2.b) {
                    auna aunaVar = asgtVar.e;
                    if (aunaVar == null) {
                        aunaVar = auna.a;
                    }
                    asoj asojVar = (asoj) aunaVar.qm(asoj.b);
                    int i2 = asojVar.c;
                    if ((i2 & 8) != 0) {
                        aafo aafoVar = lensController2.c;
                        apzg apzgVar2 = asojVar.g;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.c(apzgVar2, null);
                        return;
                    }
                    if ((i2 & 1) != 0 && (oeuVar = ((oet) lensController2.d.get()).a) != null) {
                        nml nmlVar = ((DefaultWatchPanelViewController) oeuVar).e;
                        aqvm aqvmVar = asojVar.d;
                        if (aqvmVar == null) {
                            aqvmVar = aqvm.a;
                        }
                        if (aqvmVar.b == 138681066) {
                            aqvqVar = (aqvq) aqvmVar.c;
                        } else {
                            aqvqVar = aqvq.b;
                        }
                        nmlVar.q(aqvqVar);
                    }
                    int i3 = asojVar.c;
                    if ((i3 & 2) == 0 || (i3 & 4) == 0) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = lensController2.e;
                    String str2 = asojVar.f;
                    apzg apzgVar3 = asojVar.e;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    linkedHashMap.put(str2, apzgVar3);
                    if (!((airr) lensController2.a.get()).d()) {
                        return;
                    }
                    lensController2.g();
                }
            }
        });
    }
}
