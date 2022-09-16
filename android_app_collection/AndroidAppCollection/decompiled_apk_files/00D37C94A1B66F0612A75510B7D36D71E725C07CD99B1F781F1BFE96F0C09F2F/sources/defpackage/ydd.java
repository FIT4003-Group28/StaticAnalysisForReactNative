package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ydd  reason: default package */
/* loaded from: classes4.dex */
public final class ydd implements aafl {
    public final yzj a;
    public final ydq b;
    public final yat c = new yat();
    public final acrr d;
    public final aafo e;
    private final Activity f;
    private final abev g;

    public ydd(Activity activity, abev abevVar, yzj yzjVar, ydq ydqVar, acrr acrrVar, aafo aafoVar) {
        this.f = activity;
        this.g = abevVar;
        this.a = yzjVar;
        this.b = ydqVar;
        this.d = acrrVar;
        this.e = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arrh arrhVar;
        YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand = (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand) apzgVar.qm(YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.ypcPauseSubscriptionCommand);
        aoob aoobVar = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.d;
        if (!aoobVar.H()) {
            ydb ydbVar = new ydb();
            ydbVar.a = aoobVar;
            arrf a = arrh.a();
            awhk a2 = ydbVar.a();
            a.copyOnWrite();
            ((arrh) a.instance).ew(a2);
            arrhVar = (arrh) a.mo39build();
        } else {
            arrhVar = null;
        }
        abev abevVar = this.g;
        abeu abeuVar = new abeu(abevVar.e, abevVar.a.c());
        abeuVar.a = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.c;
        if ((ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.b & 4) != 0) {
            long j = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.e;
            if (j > 0) {
                abeuVar.b = j;
                abeuVar.j(apzgVar.c);
                this.c.show(this.f.getFragmentManager(), yat.a);
                abev abevVar2 = this.g;
                abevVar2.b.e(abeuVar, new ydc(this, aoobVar, arrhVar));
            }
        }
        abeuVar.b = ((Long) map.get("pause_subscription_resume_time_ms_key")).longValue();
        abeuVar.j(apzgVar.c);
        this.c.show(this.f.getFragmentManager(), yat.a);
        abev abevVar22 = this.g;
        abevVar22.b.e(abeuVar, new ydc(this, aoobVar, arrhVar));
    }
}
