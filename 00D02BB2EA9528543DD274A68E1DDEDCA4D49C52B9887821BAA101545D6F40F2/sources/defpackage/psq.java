package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: psq  reason: default package */
/* loaded from: classes7.dex */
public final class psq {
    public static boolean a(@dzsi vnk vnkVar, dqvj dqvjVar) {
        if (vnkVar != null) {
            dcdc<vnu> r = vnkVar.r();
            int size = r.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                vnu vnuVar = r.get(i);
                i++;
                if (vnuVar.a() == dqvjVar) {
                    if (!vnuVar.b()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @dzsi
    public static View b(@dzsi vnk vnkVar, View view, dqvj dqvjVar) {
        int aW;
        acnz acnzVar;
        if (vnkVar == null || (aW = vnkVar.aW(dqvjVar)) == -1 || (acnzVar = (acnz) cqkx.e(view, vis.a, acnz.class)) == null) {
            return null;
        }
        return acnzVar.a.getChildAt(aW);
    }

    public static boolean c(@dzsi vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        return vnkVar != null && dqvj.DRIVE.equals(vnkVar.g()) && i == 3 && jjn.COLLAPSED.equals(jjnVar);
    }
}
