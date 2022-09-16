package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: gps  reason: default package */
/* loaded from: classes3.dex */
public final class gps {
    public static final /* synthetic */ int b = 0;
    public final slp a;
    private final afvn c;
    private boolean d = false;
    private ampq e = amon.a;

    static {
        zep.a("Assistant");
    }

    public gps(slp slpVar, afvn afvnVar) {
        this.a = slpVar;
        this.c = afvnVar;
    }

    public final synchronized void a(boolean z, ampq ampqVar) {
        this.d = z;
        this.e = ampqVar;
    }

    public final void b(String str) {
        if (str == null) {
            slp slpVar = this.a;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            slpVar.c(slpVar.c.b);
            if (slpVar.c.a() != 3) {
                throw new IllegalStateException("Check connected state before use.");
            }
            slpVar.d();
            aopa createBuilder = smr.a.createBuilder();
            aopa createBuilder2 = smm.a.createBuilder();
            createBuilder2.copyOnWrite();
            smm smmVar = (smm) createBuilder2.instance;
            smmVar.b = 2 | smmVar.b;
            smmVar.d = elapsedRealtimeNanos;
            smm smmVar2 = (smm) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            smr smrVar = (smr) createBuilder.instance;
            smmVar2.getClass();
            smrVar.c = smmVar2;
            smrVar.b |= 1;
            try {
                slpVar.g(createBuilder);
            } catch (RemoteException e) {
                Log.w("AssistantIntegClient", "Sending command to service is failed", e);
            }
            anlz.q(slx.a);
            return;
        }
        slt sltVar = new slt((byte[]) null);
        sltVar.b(1);
        sltVar.a = ampq.j(str);
        sltVar.b(2);
        sltVar.b = ampq.j(false);
        sltVar.c = ampq.j(true);
        slu a = sltVar.a();
        slp slpVar2 = this.a;
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        slpVar2.c(slpVar2.c.b);
        slt sltVar2 = new slt(a);
        sltVar2.d = ampq.j(Long.valueOf(elapsedRealtimeNanos2));
        slu a2 = sltVar2.a();
        if (slpVar2.c.a() != 3) {
            throw new IllegalStateException("Check connected state before use.");
        }
        slpVar2.d();
        aopa createBuilder3 = smr.a.createBuilder();
        aopa createBuilder4 = smm.a.createBuilder();
        if (a2.a.h()) {
            createBuilder4.copyOnWrite();
            smm smmVar3 = (smm) createBuilder4.instance;
            smmVar3.b |= 1;
            smmVar3.c = (String) a2.a.c();
        }
        if (a2.b.h()) {
            boolean booleanValue = ((Boolean) a2.b.c()).booleanValue();
            createBuilder4.copyOnWrite();
            smm smmVar4 = (smm) createBuilder4.instance;
            smmVar4.b |= 32;
            smmVar4.f = booleanValue;
        }
        if (a2.c.h()) {
            boolean booleanValue2 = ((Boolean) a2.c.c()).booleanValue();
            createBuilder4.copyOnWrite();
            smm smmVar5 = (smm) createBuilder4.instance;
            smmVar5.b |= 128;
            smmVar5.g = booleanValue2;
        }
        if (a2.h.h()) {
            long longValue = ((Long) a2.h.c()).longValue();
            createBuilder4.copyOnWrite();
            smm smmVar6 = (smm) createBuilder4.instance;
            smmVar6.b = 2 | smmVar6.b;
            smmVar6.d = longValue;
        }
        int a3 = smc.a(a2.f);
        createBuilder4.copyOnWrite();
        smm smmVar7 = (smm) createBuilder4.instance;
        int i = a3 - 1;
        if (a3 == 0) {
            throw null;
        }
        smmVar7.e = i;
        smmVar7.b |= 8;
        smm smmVar8 = (smm) createBuilder4.mo39build();
        createBuilder3.copyOnWrite();
        smr smrVar2 = (smr) createBuilder3.instance;
        smmVar8.getClass();
        smrVar2.c = smmVar8;
        smrVar2.b |= 1;
        try {
            slpVar2.g(createBuilder3);
        } catch (RemoteException e2) {
            Log.w("AssistantIntegClient", "Sending command to service is failed", e2);
        }
        anlz.q(slx.a);
    }

    public final synchronized boolean c() {
        if (!this.d) {
            return false;
        }
        afvn afvnVar = this.c;
        if (afvnVar != null && afvnVar.c() != null) {
            afvm c = this.c.c();
            if (c.g()) {
                return false;
            }
            if (c.y()) {
                return false;
            }
            if (!(c instanceof AccountIdentity)) {
                return false;
            }
            AccountIdentity accountIdentity = (AccountIdentity) c;
            if (!accountIdentity.j() && !accountIdentity.f()) {
                if (accountIdentity.x()) {
                    return false;
                }
                if (this.e.h()) {
                    if (!((String) this.e.c()).equals(accountIdentity.a())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
