package defpackage;
/* compiled from: PG */
/* renamed from: bptg  reason: default package */
/* loaded from: classes4.dex */
public class bptg extends bptp {
    public final acwo a;
    private final bvrb b;

    public bptg(boxa boxaVar, acwo acwoVar, bvrb bvrbVar) {
        super(boxaVar);
        this.a = acwoVar;
        this.b = bvrbVar;
    }

    @Override // defpackage.bptp
    public final void b(dwhd dwhdVar, boolean z) {
        super.b(dwhdVar, z);
        this.b.a(new Runnable(this) { // from class: bptf
            private final bptg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.i(dvum.ROAD_PROBLEM_REPORTED, null);
            }
        }, bvrj.UI_THREAD, 3000L);
    }
}
