package defpackage;

import android.content.Context;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: kes  reason: default package */
/* loaded from: classes7.dex */
public final class kes {
    public static final cmwz a(Context context, cmze cmzeVar, cmzh cmzhVar, cmvr cmvrVar) {
        cmxe cmxeVar = new cmxe(context, true != ako.b() ? 1 : 33);
        cmxeVar.d = cmzeVar;
        cmxeVar.e = cmzhVar;
        cmxeVar.f = cmvrVar;
        cmxeVar.g = 3;
        cmze cmzeVar2 = cmxeVar.d;
        if (cmzeVar2 == null) {
            cmzeVar2 = new cmxc();
        }
        cmze cmzeVar3 = cmzeVar2;
        cmzh cmzhVar2 = cmxeVar.e;
        if (cmzhVar2 == null) {
            cmzhVar2 = new cmxd();
        }
        cmzh cmzhVar3 = cmzhVar2;
        cmvr cmvrVar2 = cmxeVar.f;
        if (cmvrVar2 == null) {
            cmvrVar2 = new cmxb();
        }
        cmvr cmvrVar3 = cmvrVar2;
        Looper mainLooper = cmxeVar.a.getMainLooper();
        int i = cmxeVar.g;
        return cmxe.b(cmxeVar.a, cmzeVar3, cmzhVar3, cmvrVar3, mainLooper, cmxeVar.b, cmxeVar.c, i == 0 ? 1 : i);
    }
}
