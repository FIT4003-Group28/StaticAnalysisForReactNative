package defpackage;
/* compiled from: PG */
/* renamed from: bqai  reason: default package */
/* loaded from: classes4.dex */
public final class bqai {
    public final boolean a;
    public final boolean b;

    public bqai(btvo btvoVar) {
        dkyr ugcParameters = btvoVar.getUgcParameters();
        boolean z = true;
        this.a = ugcParameters != null && ugcParameters.aB();
        this.b = (ugcParameters == null || !ugcParameters.aC()) ? false : z;
    }
}
