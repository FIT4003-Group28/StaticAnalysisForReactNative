package defpackage;
/* compiled from: PG */
/* renamed from: bqdl  reason: default package */
/* loaded from: classes4.dex */
public final class bqdl {
    public final boolean a;
    public final boolean b;

    public bqdl(btvo btvoVar) {
        dkyr ugcParameters = btvoVar.getUgcParameters();
        boolean z = true;
        this.a = ugcParameters != null && ugcParameters.aD();
        this.b = (ugcParameters == null || !ugcParameters.aE()) ? false : z;
    }
}
