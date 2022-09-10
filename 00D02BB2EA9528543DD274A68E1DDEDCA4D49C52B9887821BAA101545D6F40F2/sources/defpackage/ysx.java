package defpackage;
/* compiled from: PG */
/* renamed from: ysx  reason: default package */
/* loaded from: classes7.dex */
public abstract class ysx {
    public static long b(dood doodVar) {
        doof doofVar;
        int i = doodVar.b;
        if (i == 1) {
            dgaw dgawVar = ((dooa) doodVar.c).c;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            return dgawVar.b;
        }
        if (i == 2) {
            doofVar = (doof) doodVar.c;
        } else {
            doofVar = doof.e;
        }
        dgaw dgawVar2 = doofVar.b;
        if (dgawVar2 == null) {
            dgawVar2 = dgaw.g;
        }
        return dgawVar2.b;
    }

    public abstract dood a();
}
