package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ydh  reason: default package */
/* loaded from: classes4.dex */
public final class ydh implements aafl {
    public final yzj a;
    public final ydq b;
    public final yat c = new yat();
    public final acrr d;
    public final aafo e;
    private final Activity f;
    private final abex g;

    public ydh(Activity activity, abex abexVar, yzj yzjVar, ydq ydqVar, acrr acrrVar, aafo aafoVar) {
        this.f = activity;
        this.g = abexVar;
        this.a = yzjVar;
        this.b = ydqVar;
        this.d = acrrVar;
        this.e = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arrh arrhVar;
        YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand = (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand) apzgVar.qm(YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.ypcResumeSubscriptionCommand);
        aoob aoobVar = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.c;
        if (!aoobVar.H()) {
            ydf ydfVar = new ydf();
            ydfVar.a = aoobVar;
            arrf a = arrh.a();
            awhn a2 = ydfVar.a();
            a.copyOnWrite();
            ((arrh) a.instance).eB(a2);
            arrhVar = (arrh) a.mo39build();
        } else {
            arrhVar = null;
        }
        abex abexVar = this.g;
        abew abewVar = new abew(abexVar.e, abexVar.a.c());
        abewVar.a = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.b;
        abewVar.j(apzgVar.c);
        this.c.show(this.f.getFragmentManager(), yat.a);
        abex abexVar2 = this.g;
        abexVar2.b.e(abewVar, new ydg(this, aoobVar, arrhVar));
    }
}
