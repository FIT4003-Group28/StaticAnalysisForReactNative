package defpackage;

import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: bfbz  reason: default package */
/* loaded from: classes3.dex */
public final class bfbz {
    private static final EnumMap<bfby, EnumMap<bfbx, ddho>> a;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(bfbx.OPT_OUT, dtxu.U);
        dcdgVar.f(bfbx.OPT_OUT_ACCEPT, dtxu.V);
        dcdgVar.f(bfbx.OPT_OUT_DISMISS, dtxu.W);
        dcdgVar.f(bfbx.OPT_OUT_PROFILE, dtxu.Z);
        dcdgVar.f(bfbx.OPT_OUT_PRIVATE_OPT_IN, dtxu.Y);
        dcdgVar.f(bfbx.OPT_OUT_LEARN_MORE, dtxu.X);
        dcdgVar.f(bfbx.WELCOME_OFFER, dtxy.mY);
        dcdgVar.f(bfbx.WELCOME_OFFER_CLOSE, dtxy.mZ);
        dcdgVar.f(bfbx.WELCOME_OFFER_REDEEM_ONLINE, dtxy.na);
        dcdgVar.f(bfbx.WELCOME_OFFER_SAVE, dtxy.nb);
        dcdgVar.f(bfbx.WELCOME_OFFER_SAVED, dtxy.nc);
        dcdgVar.f(bfbx.WELCOME_OFFER_SAVED_DISMISS, dtxy.nd);
        dcdgVar.f(bfbx.WELCOME_OFFER_SAVED_OK, dtxy.ne);
        dcdgVar.f(bfbx.FOLLOW_BUTTON, dtxy.dG);
        dcdgVar.f(bfbx.UNFOLLOW_BUTTON, dtxy.nx);
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(bfbx.OPT_OUT, dtyc.n);
        dcdgVar2.f(bfbx.OPT_OUT_ACCEPT, dtyc.o);
        dcdgVar2.f(bfbx.OPT_OUT_DISMISS, dtyc.p);
        dcdgVar2.f(bfbx.OPT_OUT_PROFILE, dtyc.s);
        dcdgVar2.f(bfbx.OPT_OUT_PRIVATE_OPT_IN, dtyc.r);
        dcdgVar2.f(bfbx.OPT_OUT_LEARN_MORE, dtyc.q);
        dcdgVar2.f(bfbx.WELCOME_OFFER, dtyc.E);
        dcdgVar2.f(bfbx.WELCOME_OFFER_CLOSE, dtyc.F);
        dcdgVar2.f(bfbx.WELCOME_OFFER_REDEEM_ONLINE, dtyc.G);
        dcdgVar2.f(bfbx.WELCOME_OFFER_SAVE, dtyc.H);
        dcdgVar2.f(bfbx.WELCOME_OFFER_SAVED, dtyc.I);
        dcdgVar2.f(bfbx.WELCOME_OFFER_SAVED_DISMISS, dtyc.J);
        dcdgVar2.f(bfbx.WELCOME_OFFER_SAVED_OK, dtyc.K);
        dcdgVar2.f(bfbx.FOLLOW_BUTTON, dtyc.i);
        dcdgVar2.f(bfbx.UNFOLLOW_BUTTON, dtyc.j);
        dcdg dcdgVar3 = new dcdg();
        dcdgVar3.f(bfbx.FOLLOW_BUTTON, dtxr.bE);
        dcdgVar3.f(bfbx.UNFOLLOW_BUTTON, dtxr.bE);
        dcdgVar3.f(bfbx.OPT_OUT, dtxu.U);
        dcdgVar3.f(bfbx.OPT_OUT_ACCEPT, dtxu.V);
        dcdgVar3.f(bfbx.OPT_OUT_DISMISS, dtxu.W);
        dcdgVar3.f(bfbx.OPT_OUT_PROFILE, dtxu.Z);
        dcdgVar3.f(bfbx.OPT_OUT_PRIVATE_OPT_IN, dtxu.Y);
        dcdgVar3.f(bfbx.OPT_OUT_LEARN_MORE, dtxu.X);
        dcdg dcdgVar4 = new dcdg();
        dcdgVar4.f(bfby.PLACESHEET_HEADER, new EnumMap(dcdgVar.b()));
        dcdgVar4.f(bfby.THANKS_PAGE, new EnumMap(dcdgVar2.b()));
        dcdgVar4.f(bfby.YOUR_EXPLORE_FEED, new EnumMap(dcdgVar3.b()));
        a = new EnumMap<>(dcdgVar4.b());
    }

    public static cjtd a(bfby bfbyVar, bfbx bfbxVar) {
        ddho c = c(bfbyVar, bfbxVar);
        if (c == null) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.d = c;
        d(b, bfbyVar, bfbxVar);
        return b.a();
    }

    public static cjtd b(bfby bfbyVar, bfbx bfbxVar, ilo iloVar, dbsg<String> dbsgVar) {
        ddho c = c(bfbyVar, bfbxVar);
        if (c == null) {
            return cjtd.b;
        }
        cjta c2 = cjtd.c(iloVar.bZ());
        c2.d = c;
        if (dbsgVar.a()) {
            c2.g(dbsgVar.b());
        }
        d(c2, bfbyVar, bfbxVar);
        return c2.a();
    }

    @dzsi
    public static ddho c(bfby bfbyVar, bfbx bfbxVar) {
        EnumMap<bfbx, ddho> enumMap = a.get(bfbyVar);
        if (enumMap != null) {
            return enumMap.get(bfbxVar);
        }
        return null;
    }

    private static void d(cjta cjtaVar, bfby bfbyVar, bfbx bfbxVar) {
        bfby bfbyVar2 = bfby.PLACESHEET_HEADER;
        if (bfbyVar.ordinal() != 2) {
            return;
        }
        if (bfbx.UNFOLLOW_BUTTON.equals(bfbxVar)) {
            ddzy bZ = deab.c.bZ();
            deaa deaaVar = deaa.TOGGLE_ON;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            cjtaVar.a = bZ.bK();
        } else if (!bfbx.FOLLOW_BUTTON.equals(bfbxVar)) {
        } else {
            ddzy bZ2 = deab.c.bZ();
            deaa deaaVar2 = deaa.TOGGLE_OFF;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            deab deabVar2 = (deab) bZ2.b;
            deabVar2.b = deaaVar2.d;
            deabVar2.a |= 1;
            cjtaVar.a = bZ2.bK();
        }
    }
}
