package defpackage;
/* compiled from: PG */
/* renamed from: cvgd  reason: default package */
/* loaded from: classes5.dex */
final class cvgd extends azu {
    final /* synthetic */ cvge b;

    public cvgd(cvge cvgeVar) {
        this.b = cvgeVar;
    }

    @Override // defpackage.azu
    public final void b() {
        this.b.a.post(new Runnable(this) { // from class: cvgc
            private final cvgd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.b.start();
            }
        });
    }
}
