package defpackage;

import com.google.android.apps.gmm.majorevents.api.MajorEvent;
/* compiled from: PG */
/* renamed from: akgc  reason: default package */
/* loaded from: classes2.dex */
public final class akgc {
    public static MajorEvent a(diwb diwbVar) {
        return new MajorEvent(aknt.COMPLETE, diwbVar);
    }

    public static MajorEvent b(ditt dittVar) {
        aknt akntVar = aknt.AMBIENT;
        diug diugVar = (diug) diwb.U.bZ();
        String str = dittVar.c;
        if (diugVar.c) {
            diugVar.bF();
            diugVar.c = false;
        }
        diwb diwbVar = (diwb) diugVar.b;
        str.getClass();
        int i = diwbVar.a | 1;
        diwbVar.a = i;
        diwbVar.c = str;
        dittVar.getClass();
        diwbVar.e = dittVar;
        diwbVar.a = i | 4;
        return new MajorEvent(akntVar, (diwb) diugVar.bK());
    }
}
