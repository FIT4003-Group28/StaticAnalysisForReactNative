package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abjt  reason: default package */
/* loaded from: classes.dex */
public final class abjt implements aafl {
    private final Context a;
    private final abhy b;
    private final ajmr c;
    private final aafo d;
    private final acti e;

    public abjt(Context context, abhy abhyVar, ajmr ajmrVar, aafo aafoVar, acti actiVar) {
        this.a = context;
        this.b = abhyVar;
        this.c = ajmrVar;
        this.d = aafoVar;
        this.e = actiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        LiveChatAction.ShowLiveChatDialogAction showLiveChatDialogAction = (LiveChatAction.ShowLiveChatDialogAction) apzgVar.qm(LiveChatAction.ShowLiveChatDialogAction.showLiveChatDialogAction);
        if (apzgVar.qn(LiveChatAction.ShowLiveChatDialogAction.showLiveChatDialogAction) && (showLiveChatDialogAction.b & 1) != 0) {
            aunb aunbVar = showLiveChatDialogAction.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(UpsellDialogRendererOuterClass.upsellDialogRenderer)) {
                aunb aunbVar2 = showLiveChatDialogAction.c;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                new abob((avvh) aunbVar2.qm(UpsellDialogRendererOuterClass.upsellDialogRenderer), this.a, this.b, this.c, this.d, this.e).a();
                return;
            }
        }
        throw new aafy();
    }
}
