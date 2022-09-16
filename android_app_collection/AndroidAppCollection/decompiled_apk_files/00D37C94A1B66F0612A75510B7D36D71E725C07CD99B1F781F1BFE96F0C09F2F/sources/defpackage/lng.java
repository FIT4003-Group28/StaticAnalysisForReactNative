package defpackage;
/* compiled from: PG */
/* renamed from: lng  reason: default package */
/* loaded from: classes3.dex */
final class lng implements fqc {
    final /* synthetic */ boolean a;
    final /* synthetic */ lni b;
    private final /* synthetic */ int c;

    public lng(lni lniVar, boolean z) {
        this.b = lniVar;
        this.a = z;
    }

    public lng(lni lniVar, boolean z, int i) {
        this.c = i;
        this.b = lniVar;
        this.a = z;
    }

    @Override // defpackage.fqc
    public final void a() {
        if (this.c == 0) {
            this.b.b.c();
            return;
        }
        lni lniVar = this.b;
        lniVar.d.removeCaptioningChangeListener(lniVar.c);
    }

    @Override // defpackage.fqc
    public final void b() {
        if (this.c == 0) {
            this.b.c();
            if (this.a) {
                return;
            }
            this.b.d();
            return;
        }
        lni lniVar = this.b;
        lniVar.d.addCaptioningChangeListener(lniVar.c);
        if (this.a) {
            return;
        }
        this.b.d();
    }
}
