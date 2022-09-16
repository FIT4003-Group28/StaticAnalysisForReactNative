package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: aicw  reason: default package */
/* loaded from: classes.dex */
final class aicw implements aegn {
    public final aego a;
    public final aiec b;
    private final agp c;

    public aicw(aego aegoVar, agp agpVar, aiec aiecVar) {
        this.a = aegoVar;
        this.c = agpVar;
        this.b = aiecVar;
    }

    @Override // defpackage.aegn
    public final void e() {
        this.c.b();
    }

    @Override // defpackage.aegn
    public final void f() {
        this.c.c(null);
    }

    @Override // defpackage.aegj
    public final void g(FormatStreamModel formatStreamModel, long j) {
    }

    @Override // defpackage.aegn
    public final void h() {
    }

    @Override // defpackage.aegn
    public final void i(int i) {
        this.c.d(new IllegalArgumentException("Prebuffer failed"));
    }

    @Override // defpackage.aegn
    public final boolean j() {
        return false;
    }

    @Override // defpackage.aegn
    public final void k() {
    }
}
