package defpackage;
/* compiled from: PG */
/* renamed from: boyd  reason: default package */
/* loaded from: classes3.dex */
public final class boyd {
    public final boolean a;
    public final boolean b;

    public boyd(btvo btvoVar) {
        dkyr ugcParameters = btvoVar.getUgcParameters();
        boolean z = true;
        this.a = ugcParameters != null && ugcParameters.aZ();
        this.b = (ugcParameters == null || !ugcParameters.ba()) ? false : z;
    }
}
