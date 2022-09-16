package defpackage;
/* compiled from: PG */
/* renamed from: fzm  reason: default package */
/* loaded from: classes3.dex */
public final class fzm implements aatg, abcf {
    private final fyx a;

    public fzm(fyx fyxVar) {
        this.a = fyxVar;
    }

    @Override // defpackage.aatg
    public final void a(aatf aatfVar) {
        int h = this.a.h();
        if (h != 1) {
            aatfVar.A = h;
        }
    }

    @Override // defpackage.abcf
    public final void b(abce abceVar) {
        int h = this.a.h();
        if (h != 1) {
            abceVar.w = h;
        }
    }
}
