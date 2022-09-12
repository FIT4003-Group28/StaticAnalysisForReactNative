package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zrb  reason: default package */
/* loaded from: classes7.dex */
public final class zrb implements zqz {
    @Override // defpackage.zqz
    public final dwao a(boolean z, dwao dwaoVar) {
        if (z) {
            return zri.q(dwaoVar, dowl.JAKARTA_EVEN);
        }
        vpc vpcVar = vpc.JAKARTA;
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        return vph.e(vpcVar, dowrVar.i) == dowl.JAKARTA_EVEN ? zri.q(dwaoVar, dowl.UNSET) : dwaoVar;
    }
}
