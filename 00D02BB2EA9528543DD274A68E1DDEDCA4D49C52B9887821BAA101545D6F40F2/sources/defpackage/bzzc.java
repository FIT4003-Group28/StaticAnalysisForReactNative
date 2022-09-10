package defpackage;

import android.app.Activity;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: PG */
/* renamed from: bzzc  reason: default package */
/* loaded from: classes4.dex */
public class bzzc extends bzzg implements cafl {
    private final dwtp d;

    public bzzc(Activity activity, btvo btvoVar, dwul dwulVar, bzzf bzzfVar) {
        super(activity, btvoVar, dwulVar, bzzfVar);
        dwtp dwtpVar;
        dwts dwtsVar = dwulVar.l;
        dwtsVar = dwtsVar == null ? dwts.g : dwtsVar;
        if (dwtsVar.b == 5) {
            dwtpVar = (dwtp) dwtsVar.c;
        } else {
            dwtpVar = dwtp.f;
        }
        this.d = dwtpVar;
    }

    @Override // defpackage.cafn
    public void a(cqiv cqivVar) {
        cqivVar.a(new came(), this);
    }

    @Override // defpackage.cafn
    public cjtd b() {
        return cjtd.a(dtxs.c);
    }

    @Override // defpackage.cafn
    public cjtd c() {
        return cjtd.a(dtxs.d);
    }

    @Override // defpackage.cafn
    public cjtd d() {
        return cjtd.a(r().booleanValue() ? dtxs.e : dtxs.f);
    }

    @Override // defpackage.cafl
    public cjtd e() {
        return cjtd.a(dtxs.g);
    }

    @Override // defpackage.cafn
    public Boolean f() {
        return true;
    }

    @Override // defpackage.cafl
    public jic g() {
        return new jic(this.d.a, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
    }

    @Override // defpackage.cafl
    public String h() {
        return this.d.b;
    }

    @Override // defpackage.cafl
    public String i() {
        return this.d.c;
    }

    @Override // defpackage.cafl
    public String j() {
        return SimpleDateFormat.getDateInstance(1).format(new Date());
    }

    @Override // defpackage.cafl
    public String k() {
        return this.d.d;
    }

    @Override // defpackage.cafl
    public cqkl l() {
        bzzf bzzfVar = this.c;
        dkcp b = dkcp.b(this.d.e);
        if (b == null) {
            b = dkcp.UNKNOWN_TAB_TYPE;
        }
        bzzfVar.a(b);
        return cqkl.a;
    }
}
