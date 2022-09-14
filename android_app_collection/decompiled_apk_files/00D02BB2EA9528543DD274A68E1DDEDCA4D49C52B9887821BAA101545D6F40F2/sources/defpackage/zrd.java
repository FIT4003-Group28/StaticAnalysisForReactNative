package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zrd  reason: default package */
/* loaded from: classes7.dex */
public final class zrd implements zqz {
    @Override // defpackage.zqz
    public final dwao a(boolean z, dwao dwaoVar) {
        if (z) {
            return zri.q(dwaoVar, dowl.JAKARTA_ODD);
        }
        vpc vpcVar = vpc.JAKARTA;
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        return vph.e(vpcVar, dowrVar.i) == dowl.JAKARTA_ODD ? zri.q(dwaoVar, dowl.UNSET) : dwaoVar;
    }
}
