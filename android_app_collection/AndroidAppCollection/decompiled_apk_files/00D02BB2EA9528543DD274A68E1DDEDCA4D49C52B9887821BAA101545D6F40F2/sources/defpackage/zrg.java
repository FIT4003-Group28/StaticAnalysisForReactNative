package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zrg  reason: default package */
/* loaded from: classes7.dex */
public final class zrg implements zqz {
    @Override // defpackage.zqz
    public final dwao a(boolean z, dwao dwaoVar) {
        dwal ca = dwao.R.ca(dwaoVar);
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        dowi ca2 = dowr.m.ca(dowrVar);
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dowr dowrVar2 = (dowr) ca2.b;
        dowrVar2.a |= 2;
        dowrVar2.c = z;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwao dwaoVar2 = (dwao) ca.b;
        dowr bK = ca2.bK();
        bK.getClass();
        dwaoVar2.g = bK;
        dwaoVar2.a |= 4;
        return ca.bK();
    }
}
