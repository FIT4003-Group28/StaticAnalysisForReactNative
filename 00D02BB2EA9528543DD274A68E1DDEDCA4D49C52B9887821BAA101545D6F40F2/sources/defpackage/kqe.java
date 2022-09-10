package defpackage;
/* compiled from: PG */
/* renamed from: kqe  reason: default package */
/* loaded from: classes7.dex */
final class kqe implements Runnable {
    final /* synthetic */ kqf a;
    private final ldm b;
    private final boolean c;

    public kqe(kqf kqfVar, ldm ldmVar, boolean z) {
        this.a = kqfVar;
        this.b = ldmVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mnz mnzVar;
        kdj kdjVar = this.a.j;
        ldm ldmVar = this.b;
        kdk kdkVar = this.c ? kdk.NAVIGATE : kdk.NOTHING;
        if (this.c) {
            mnzVar = mnz.INTENT_NAVIGATE_NON_VOICE;
        } else {
            mnzVar = mnz.INTENT_PLACE_NON_VOICE;
        }
        kdjVar.i(ldmVar, kdkVar, null, mnzVar);
    }
}
