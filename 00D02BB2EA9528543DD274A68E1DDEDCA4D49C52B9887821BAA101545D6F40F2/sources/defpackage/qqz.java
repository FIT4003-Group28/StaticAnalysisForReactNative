package defpackage;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qqz  reason: default package */
/* loaded from: classes7.dex */
public class qqz implements qqw {
    private final Context a;
    private final btvo b;
    private final bvjj c;
    private final cqat d;

    public qqz(Application application, cqhn cqhnVar, btvo btvoVar, bvjj bvjjVar, cqat cqatVar) {
        this.a = application;
        this.b = btvoVar;
        this.c = bvjjVar;
        this.d = cqatVar;
    }

    @Override // defpackage.qqw
    public Boolean a() {
        dktt dkttVar = this.b.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        dkts dktsVar = dkttVar.u;
        if (dktsVar == null) {
            dktsVar = dkts.c;
        }
        if (dktsVar.a) {
            eapd eapdVar = new eapd(this.c.w(bvjk.cp, 0L));
            dktt dkttVar2 = this.b.getPassiveAssistParameters().a().am;
            if (dkttVar2 == null) {
                dkttVar2 = dktt.z;
            }
            dkts dktsVar2 = dkttVar2.u;
            if (dktsVar2 == null) {
                dktsVar2 = dkts.c;
            }
            return Boolean.valueOf(new eapd(this.d.b()).w(eapdVar.e(eaow.d(dktsVar2.b))));
        }
        return false;
    }

    @Override // defpackage.qqw
    public cqvf b() {
        return new cqvf(R.string.COMMUTE_QUICK_SENTIMENT_QUESTION);
    }

    @Override // defpackage.qqw
    public cqkl c() {
        this.c.Z(bvjk.cp, this.d.b());
        Context context = this.a;
        Toast.makeText(context, context.getResources().getString(R.string.COMMUTE_QUICK_SENTIMENT_FEEDBACK_THANKS_TOAST), 0).show();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.qqw
    public cjtd d() {
        return cjtd.a(dtxl.bA);
    }

    @Override // defpackage.qqw
    public cjtd e() {
        return cjtd.a(dtxl.bC);
    }

    @Override // defpackage.qqw
    public cjtd f() {
        return cjtd.a(dtxl.bB);
    }
}
