package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpbz  reason: default package */
/* loaded from: classes3.dex */
public class bpbz implements bpvq {
    @dzsi
    bpvs a;
    private final bowy b;
    private final List<bpvp> c;
    private final bomp d = new bomp(new bpby(this));

    public bpbz(Context context, bpbw bpbwVar, bowy bowyVar, dkyr dkyrVar, boolean z, cqhn cqhnVar, bpcf bpcfVar) {
        int i;
        bpbx bpbxVar;
        bowy bowyVar2 = bowyVar;
        this.b = bowyVar2;
        dccx F = dcdc.F();
        bowx[] values = bowx.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            bowx bowxVar = values[i2];
            Integer valueOf = Integer.valueOf(bowxVar.i);
            ddho ddhoVar = bowxVar.k;
            dqgh dqghVar = dqgh.UNDEFINED;
            if (bowxVar.j.ordinal() != 12) {
                bpbxVar = new bpbx(context, bowyVar, valueOf.intValue(), bowxVar.ordinal(), ddhoVar);
                i = i2;
            } else if (!z) {
                int intValue = valueOf.intValue();
                int ordinal = bowxVar.ordinal();
                bpcf.a(context, 1);
                bpcf.a(bpbwVar, 2);
                bpcf.a(bowyVar2, 3);
                bpcf.a(dkyrVar, 6);
                bwqv a = bpcfVar.a.a();
                bpcf.a(a, 7);
                bnyo a2 = bpcfVar.b.a();
                bpcf.a(a2, 8);
                bpsw a3 = bpcfVar.c.a();
                bpcf.a(a3, 9);
                i = i2;
                bpce bpceVar = new bpce(context, bpbwVar, bowyVar, intValue, ordinal, dkyrVar, a, a2, a3);
                this.a = bpceVar;
                bpbxVar = bpceVar;
            } else {
                i = i2;
                i2 = i + 1;
                bowyVar2 = bowyVar;
            }
            cqkx.j(bpbxVar, this.d);
            F.g(bpbxVar);
            i2 = i + 1;
            bowyVar2 = bowyVar;
        }
        this.c = F.f();
    }

    public void a() {
        this.d.b();
    }

    public Boolean b() {
        return Boolean.valueOf(this.b.a());
    }

    public Boolean c() {
        bpvs bpvsVar;
        if (!this.b.a() || !this.b.b().equals(dqgh.MOVED) || (bpvsVar = this.a) == null) {
            return false;
        }
        return bpvsVar.j();
    }

    @Override // defpackage.bpvq
    public List<bpvp> d() {
        return this.c;
    }

    @Override // defpackage.bpvq
    @dzsi
    public bpvs e() {
        return this.a;
    }
}
