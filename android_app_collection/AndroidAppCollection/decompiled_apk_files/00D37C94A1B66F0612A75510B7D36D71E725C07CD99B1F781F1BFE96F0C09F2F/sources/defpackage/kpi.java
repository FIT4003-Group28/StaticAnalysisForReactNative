package defpackage;

import com.google.protos.youtube.api.innertube.ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kpi  reason: default package */
/* loaded from: classes3.dex */
public final class kpi implements aafl {
    public static final /* synthetic */ int a = 0;
    private final aagi b;

    public kpi(aagi aagiVar) {
        this.b = aagiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar.qn(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand)) {
            ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand = (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand) apzgVar.qm(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand);
            int i = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.b;
            if ((i & 1) == 0 || (i & 2) == 0) {
                return;
            }
            String str = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.c;
            String str2 = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.d;
            aagh c = this.b.c();
            c.f(str).g(atjj.class).w(new fcr(str2, 7)).j(amuk.r(str2)).c(new abba(c, str, 1)).Q();
        }
    }
}
