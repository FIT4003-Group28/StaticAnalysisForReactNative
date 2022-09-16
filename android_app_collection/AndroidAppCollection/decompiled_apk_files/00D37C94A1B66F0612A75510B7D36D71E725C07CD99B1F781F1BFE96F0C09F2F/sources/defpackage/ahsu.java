package defpackage;

import com.google.vr.sdk.base.HeadsetSelector;
/* compiled from: PG */
/* renamed from: ahsu  reason: default package */
/* loaded from: classes.dex */
public final class ahsu implements ahst {
    private static final String d = "ahsu";
    public ahso b;
    public dt c;
    private final yve f;
    private boolean g;
    private final ahsr e = new ahsr();
    public final ahsv a = new ahsv();

    public ahsu(yve yveVar) {
        this.f = yveVar;
    }

    @Override // defpackage.ahst
    public final boolean a() {
        dt dtVar = this.c;
        if (dtVar == null) {
            return false;
        }
        HeadsetSelector.HeadsetInfo a = ahsp.a(dtVar, this.f);
        String str = d;
        String valueOf = String.valueOf(a.getDisplayName());
        zep.h(str, valueOf.length() != 0 ? "Current viewer: ".concat(valueOf) : new String("Current viewer: "));
        int e = ahsp.e(a);
        if (e == 0) {
            return false;
        }
        int i = e - 1;
        if (i == 1 || i == 2) {
            this.g = true;
            ahso ahsoVar = this.b;
            if (ahsoVar != null) {
                ahsoVar.k(e);
            }
        } else {
            this.g = true;
            ahso ahsoVar2 = this.b;
            if (ahsoVar2 != null) {
                ahsoVar2.e();
            }
        }
        return true;
    }

    @Override // defpackage.ahst
    public final boolean b() {
        ylr.c();
        dt dtVar = this.c;
        if (dtVar == null) {
            return false;
        }
        if (this.g) {
            this.g = false;
            return false;
        } else if (ahsp.b(dtVar, this.f).size() < 2) {
            zep.h(d, "Less than 2 viewers available. Skipping showing the speed bump.");
            return a();
        } else {
            ahsr ahsrVar = this.e;
            dt dtVar2 = this.c;
            if (ahsrVar.ap() || ahsrVar.at()) {
                return true;
            }
            ahsrVar.ag = this;
            ahsrVar.qv(dtVar2.getSupportFragmentManager(), ahsr.ae);
            return true;
        }
    }
}
