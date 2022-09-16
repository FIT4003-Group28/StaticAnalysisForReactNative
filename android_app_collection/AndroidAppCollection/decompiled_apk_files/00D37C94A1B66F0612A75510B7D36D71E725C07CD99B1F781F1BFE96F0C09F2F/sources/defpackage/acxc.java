package defpackage;
/* compiled from: PG */
/* renamed from: acxc  reason: default package */
/* loaded from: classes.dex */
public final class acxc implements acxv {
    private static final String a = zep.a("MDX.BackgroundScanStarter");
    private final acxr b;
    private boolean c;
    private final yjs d;

    public acxc(acxr acxrVar, azqb azqbVar) {
        this.b = acxrVar;
        this.d = (yjs) azqbVar.get();
    }

    @Override // defpackage.acxv
    public final synchronized void a() {
        if (this.c) {
            return;
        }
        if (this.b.a().isEmpty()) {
            zep.h(a, "no background scan clients registered, not starting background scan job");
            return;
        }
        zep.h(a, "starting background scan job");
        this.d.e("mdx_background_scanner", 0L, true, 2, null, acya.a, false);
        this.c = true;
    }
}
