package defpackage;
/* compiled from: PG */
/* renamed from: azwg  reason: default package */
/* loaded from: classes2.dex */
public final class azwg extends azur {
    public static final /* synthetic */ int b = 0;

    static {
        new azwg();
    }

    private azwg() {
    }

    @Override // defpackage.azur
    public final boolean d(azrd azrdVar) {
        azrdVar.getClass();
        return false;
    }

    @Override // defpackage.azur
    public final void st(azrd azrdVar, Runnable runnable) {
        azrdVar.getClass();
        if (((azwj) azrdVar.get(azwj.a)) != null) {
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // defpackage.azur
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
