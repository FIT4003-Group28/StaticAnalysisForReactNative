package defpackage;
/* compiled from: PG */
/* renamed from: dazl  reason: default package */
/* loaded from: classes.dex */
final class dazl extends dazm {
    static final dazm a;

    static {
        dazl dazlVar = new dazl(new aim(0));
        if (!dazlVar.b) {
            dazlVar.b = true;
            a = dazlVar;
            return;
        }
        throw new IllegalStateException("Already frozen");
    }

    private dazl(aim aimVar) {
        super(aimVar);
    }
}
