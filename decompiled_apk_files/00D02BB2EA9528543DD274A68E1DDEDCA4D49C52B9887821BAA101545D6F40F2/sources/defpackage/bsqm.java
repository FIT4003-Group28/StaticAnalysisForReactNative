package defpackage;
/* compiled from: PG */
/* renamed from: bsqm  reason: default package */
/* loaded from: classes4.dex */
public final class bsqm {
    private final ddho a;
    @dzsi
    private final ddho b;

    private bsqm(ddho ddhoVar, @dzsi ddho ddhoVar2) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
    }

    public static bsqm a(ddho ddhoVar) {
        return new bsqm(ddhoVar, null);
    }

    public static bsqm b(ddho ddhoVar, ddho ddhoVar2) {
        return new bsqm(ddhoVar, ddhoVar2);
    }

    public final ddho c(boolean z) {
        ddho ddhoVar = this.b;
        return (ddhoVar == null || !z) ? this.a : ddhoVar;
    }
}
