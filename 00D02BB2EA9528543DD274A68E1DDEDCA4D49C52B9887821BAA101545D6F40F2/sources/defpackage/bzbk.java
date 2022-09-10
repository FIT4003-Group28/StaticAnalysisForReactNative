package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzbk  reason: default package */
/* loaded from: classes.dex */
public final class bzbk extends afhx {
    public static final dbsl<afga> a = bzbj.a;
    private final dxio<bzbh> b;

    public bzbk(Intent intent, @dzsi String str, dxio<bzbh> dxioVar) {
        super(intent, str, afid.TRANSIT_GUIDANCE_QUESTIONS);
        this.b = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        bzbh a2 = this.b.a();
        bzdk c = a2.c.c();
        bzdh g = c.g();
        if (g instanceof bzcz) {
            bzbi bzbiVar = a2.d;
            bzdg b = g.b();
            dllb bZ = dllc.c.bZ();
            dspd bR = b.K().a.bR();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dllc dllcVar = (dllc) bZ.b;
            bR.getClass();
            dllcVar.a |= 1;
            dllcVar.b = bR;
            dllc bK = bZ.bK();
            dlnn bZ2 = dlno.f.bZ();
            dlla bZ3 = dlnm.l.bZ();
            dspd dspdVar = bzbi.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dlnm dlnmVar = (dlnm) bZ3.b;
            dspdVar.getClass();
            dlnmVar.a |= 1;
            dlnmVar.f = dspdVar;
            dspd dspdVar2 = bzbi.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dlnm dlnmVar2 = (dlnm) bZ3.b;
            dspdVar2.getClass();
            dlnmVar2.a |= 2;
            dlnmVar2.g = dspdVar2;
            bK.getClass();
            dlnmVar2.e = bK;
            dlnmVar2.d = 14;
            dllf bZ4 = dlmc.j.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dlmc dlmcVar = (dlmc) bZ4.b;
            dlmcVar.a |= 2;
            dlmcVar.e = true;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dlnm dlnmVar3 = (dlnm) bZ3.b;
            dlmc bK2 = bZ4.bK();
            bK2.getClass();
            dlnmVar3.j = bK2;
            dlnmVar3.a |= 1024;
            dlne bZ5 = dlnh.d.bZ();
            String a3 = bzbi.a(bzbiVar.h.getResources(), b);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dlnh dlnhVar = (dlnh) bZ5.b;
            a3.getClass();
            dlnhVar.a |= 1;
            dlnhVar.b = a3;
            dlnf bZ6 = dlng.f.bZ();
            dspd dspdVar3 = bzbi.b;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dlng dlngVar = (dlng) bZ6.b;
            dspdVar3.getClass();
            dlngVar.a |= 1;
            dlngVar.b = dspdVar3;
            String J = bzbi.b.J();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dlng dlngVar2 = (dlng) bZ6.b;
            J.getClass();
            dlngVar2.a |= 8;
            dlngVar2.e = J;
            String b2 = bzbiVar.b(R.string.TRANSIT_OCCUPANCY_MANY_SEATS_AVAILABLE_DESCRIPTION, new Object[0]);
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dlng dlngVar3 = (dlng) bZ6.b;
            b2.getClass();
            dlngVar3.a |= 2;
            dlngVar3.c = b2;
            bZ5.a(bZ6);
            dlnf bZ7 = dlng.f.bZ();
            dspd dspdVar4 = bzbi.c;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dlng dlngVar4 = (dlng) bZ7.b;
            dspdVar4.getClass();
            dlngVar4.a |= 1;
            dlngVar4.b = dspdVar4;
            String J2 = bzbi.c.J();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dlng dlngVar5 = (dlng) bZ7.b;
            J2.getClass();
            dlngVar5.a |= 8;
            dlngVar5.e = J2;
            String b3 = bzbiVar.b(R.string.TRANSIT_OCCUPANCY_FEW_SEATS_AVAILABLE_DESCRIPTION, new Object[0]);
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dlng dlngVar6 = (dlng) bZ7.b;
            b3.getClass();
            dlngVar6.a |= 2;
            dlngVar6.c = b3;
            bZ5.a(bZ7);
            dlnf bZ8 = dlng.f.bZ();
            dspd dspdVar5 = bzbi.d;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dlng dlngVar7 = (dlng) bZ8.b;
            dspdVar5.getClass();
            dlngVar7.a |= 1;
            dlngVar7.b = dspdVar5;
            String J3 = bzbi.d.J();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dlng dlngVar8 = (dlng) bZ8.b;
            J3.getClass();
            dlngVar8.a |= 8;
            dlngVar8.e = J3;
            String b4 = bzbiVar.b(R.string.TRANSIT_OCCUPANCY_STANDING_ROOM_ONLY_DESCRIPTION, new Object[0]);
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dlng dlngVar9 = (dlng) bZ8.b;
            b4.getClass();
            dlngVar9.a |= 2;
            dlngVar9.c = b4;
            bZ5.a(bZ8);
            dlnf bZ9 = dlng.f.bZ();
            dspd dspdVar6 = bzbi.e;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dlng dlngVar10 = (dlng) bZ9.b;
            dspdVar6.getClass();
            dlngVar10.a |= 1;
            dlngVar10.b = dspdVar6;
            String J4 = bzbi.e.J();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dlng dlngVar11 = (dlng) bZ9.b;
            J4.getClass();
            dlngVar11.a |= 8;
            dlngVar11.e = J4;
            String b5 = bzbiVar.b(R.string.TRANSIT_OCCUPANCY_CRUSHED_STANDING_ROOM_ONLY_DESCRIPTION, new Object[0]);
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dlng dlngVar12 = (dlng) bZ9.b;
            b5.getClass();
            dlngVar12.a |= 2;
            dlngVar12.c = b5;
            bZ5.a(bZ9);
            dlnf bZ10 = dlng.f.bZ();
            dspd dspdVar7 = bzbi.f;
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            dlng dlngVar13 = (dlng) bZ10.b;
            dspdVar7.getClass();
            dlngVar13.a |= 1;
            dlngVar13.b = dspdVar7;
            String J5 = bzbi.f.J();
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            dlng dlngVar14 = (dlng) bZ10.b;
            J5.getClass();
            dlngVar14.a |= 8;
            dlngVar14.e = J5;
            String b6 = bzbiVar.b(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_UNSURE, new Object[0]);
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            dlng dlngVar15 = (dlng) bZ10.b;
            b6.getClass();
            dlngVar15.a |= 2;
            dlngVar15.c = b6;
            bZ5.a(bZ10);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dlnm dlnmVar4 = (dlnm) bZ3.b;
            dlnh bK3 = bZ5.bK();
            bK3.getClass();
            dlnmVar4.c = bK3;
            dlnmVar4.b = 10;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlno dlnoVar = (dlno) bZ2.b;
            dlnm bK4 = bZ3.bK();
            bK4.getClass();
            dsrj<dlnm> dsrjVar = dlnoVar.c;
            if (!dsrjVar.a()) {
                dlnoVar.c = dsqw.cl(dsrjVar);
            }
            dlnoVar.c.add(bK4);
            dlnp bZ11 = dlny.f.bZ();
            String b7 = bzbiVar.b(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_THANKS_TITLE, new Object[0]);
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dlny dlnyVar = (dlny) bZ11.b;
            b7.getClass();
            dlnyVar.a |= 2;
            dlnyVar.b = b7;
            String b8 = bzbiVar.b(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_THANKS_CONTENT, new Object[0]);
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dlny dlnyVar2 = (dlny) bZ11.b;
            b8.getClass();
            dlnyVar2.a |= 4;
            dlnyVar2.c = b8;
            dlns bZ12 = dlnv.f.bZ();
            String b9 = bzbiVar.b(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_THANKS_CLOSE, new Object[0]);
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            dlnv dlnvVar = (dlnv) bZ12.b;
            b9.getClass();
            dlnvVar.a |= 1;
            dlnvVar.d = b9;
            dlnv dlnvVar2 = (dlnv) bZ12.b;
            dlnvVar2.e = 1;
            dlnvVar2.a |= 2;
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dlny dlnyVar3 = (dlny) bZ11.b;
            dlnv bK5 = bZ12.bK();
            bK5.getClass();
            dlnyVar3.d = bK5;
            dlnyVar3.a |= 8;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlno dlnoVar2 = (dlno) bZ2.b;
            dlny bK6 = bZ11.bK();
            bK6.getClass();
            dsrj<dlny> dsrjVar2 = dlnoVar2.d;
            if (!dsrjVar2.a()) {
                dlnoVar2.d = dsqw.cl(dsrjVar2);
            }
            dlnoVar2.d.add(bK6);
            dlno bK7 = bZ2.bK();
            amub l = c.l(a2.a);
            if (l == null) {
                return;
            }
            bzcz bzczVar = (bzcz) g;
            String g2 = l.g();
            String j = c.j();
            bzbg bzbgVar = new bzbg();
            Bundle bundle = new Bundle();
            bundle.putString("ved", g2);
            bzdg b10 = bzczVar.b();
            dphe d = b10.d();
            bundle.putString("transitTripToken", d.o);
            bundle.putString("vehicleToken", d.m);
            int u = bzczVar.b().u() - bzczVar.f();
            if (bzczVar.g()) {
                u++;
            }
            dpgw v = b10.v(u);
            dgaw dgawVar = v.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            bundle.putLong("stopTimeStampSeconds", dgawVar.b);
            dgaw dgawVar2 = v.f;
            if (dgawVar2 == null) {
                dgawVar2 = dgaw.g;
            }
            bundle.putString("departureTimeZone", dgawVar2.c);
            bundle.putString("stopFeatureId", v.n);
            bundle.putString("destination", j);
            bzbgVar.B(bundle);
            a2.b.f(bK7, bzbgVar);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TRANSIT_GUIDANCE_QUESTIONS;
    }

    @Override // defpackage.afhx
    public final afid j() {
        return afid.TRANSIT_GUIDANCE_QUESTIONS;
    }
}
