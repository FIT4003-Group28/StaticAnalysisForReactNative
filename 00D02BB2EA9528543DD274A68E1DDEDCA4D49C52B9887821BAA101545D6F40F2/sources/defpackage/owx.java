package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: owx  reason: default package */
/* loaded from: classes7.dex */
public final class owx {
    public static dtie a(List<dtik> list, @dzsi Resources resources) {
        dtim bK;
        dtie bZ = dtiq.i.bZ();
        dcdc<dtic> dcdcVar = oxb.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtiq dtiqVar = (dtiq) bZ.b;
        dsrf dsrfVar = dtiqVar.c;
        if (!dsrfVar.a()) {
            dtiqVar.c = dsqw.cg(dsrfVar);
        }
        for (dtic dticVar : dcdcVar) {
            dtiqVar.c.h(dticVar.g);
        }
        dcdc<dtia> dcdcVar2 = oxb.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtiq dtiqVar2 = (dtiq) bZ.b;
        dsrf dsrfVar2 = dtiqVar2.d;
        if (!dsrfVar2.a()) {
            dtiqVar2.d = dsqw.cg(dsrfVar2);
        }
        for (dtia dtiaVar : dcdcVar2) {
            dtiqVar2.d.h(dtiaVar.e);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtiq dtiqVar3 = (dtiq) bZ.b;
        dtiqVar3.b = 2;
        dtiqVar3.a |= 1;
        dtiq dtiqVar4 = (dtiq) bZ.b;
        dsrj<dtik> dsrjVar = dtiqVar4.e;
        if (!dsrjVar.a()) {
            dtiqVar4.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dtiqVar4.e);
        bZ.a(dtio.COMBINE_ACTIONS_WITH_PREVIOUS_ITEM);
        bZ.a(dtio.REMOVE_PRECEDING_DIVIDER_LINE);
        bZ.a(dtio.REMOVE_FOLLOWING_DIVIDER_LINE);
        bZ.a(dtio.TEXT_HIGHLIGHT_STYLE_BOLD_ITALIC);
        if (resources == null) {
            bK = dtim.d;
        } else {
            dtil bZ2 = dtim.d.bZ();
            int c = oxa.c(resources);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtim dtimVar = (dtim) bZ2.b;
            dtimVar.a |= 2;
            dtimVar.b = c;
            int d = oxa.d(resources);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dtim dtimVar2 = (dtim) bZ2.b;
            dtimVar2.a |= 4;
            dtimVar2.c = d;
            bK = bZ2.bK();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtiq dtiqVar5 = (dtiq) bZ.b;
        bK.getClass();
        dtiqVar5.h = bK;
        int i = dtiqVar5.a | 4;
        dtiqVar5.a = i;
        dtiqVar5.a = i | 2;
        dtiqVar5.g = true;
        return bZ;
    }
}
