package defpackage;
/* compiled from: PG */
/* renamed from: btwk  reason: default package */
/* loaded from: classes.dex */
public final class btwk {
    private final btrm a;
    private final btxc b;

    public btwk(btrm btrmVar, btxc btxcVar) {
        this.a = btrmVar;
        this.b = btxcVar;
    }

    public final void a(btvo btvoVar, boolean z) {
        btvr btvrVar = new btvr(btvoVar);
        this.a.b(new btvs(btvn.c(btvoVar), btvn.g(btvoVar)));
        this.a.b(btvrVar);
        this.b.a.a(btvoVar);
        this.a.b(new btwe(z));
    }
}
