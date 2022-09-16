package defpackage;
/* compiled from: PG */
/* renamed from: cgzj  reason: default package */
/* loaded from: classes4.dex */
public class cgzj implements cgwc {
    private boolean a = false;
    private boolean b = false;
    private final cgzi c;

    public cgzj(cgzi cgziVar) {
        this.c = cgziVar;
    }

    @Override // defpackage.cgwc
    public cqkl a() {
        if (this.a && !this.b) {
            ((cgdv) this.c).bt(false);
        }
        return cqkl.a;
    }

    @Override // defpackage.cgwc
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.cgwc
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    public void d(boolean z) {
        this.a = z;
        cqkx.p(this);
    }

    public void e(boolean z) {
        this.b = z;
        cqkx.p(this);
    }
}
