package defpackage;
/* compiled from: PG */
/* renamed from: aleq  reason: default package */
/* loaded from: classes.dex */
public final class aleq extends aleo {
    public final abdu a;
    private final asfs b;
    private final akze c;
    private final albs e;

    public aleq(aadd aaddVar, asfs asfsVar, abdu abduVar, albs albsVar, akze akzeVar, albf albfVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_CANCELLATION, albfVar, akzeVar, alhtVar);
        this.b = asfsVar;
        this.a = abduVar;
        this.c = akzeVar;
        this.e = albsVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return null;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.ag;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        return anlz.q(t(this.d.e(), true));
    }

    @Override // defpackage.algt
    public final ankt d(final String str, final akzp akzpVar) {
        return anlz.v(new aniq() { // from class: alep
            @Override // defpackage.aniq
            public final ankt a() {
                aleq aleqVar = aleq.this;
                alcw o = aleqVar.o(str, akzpVar, false);
                abdt b = aleqVar.a.b(o.e);
                b.i();
                b.a = o.W;
                if (!aleqVar.a.e(b).c) {
                    throw new aart("Video deletion failed");
                }
                return anlz.q(aleqVar.t(aleqVar.d.e(), false));
            }
        }, anjk.a);
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.o;
    }

    @Override // defpackage.algt
    public final String f() {
        return "DeleteVideoOnCancellationTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        return ((alcwVar.b & 1) == 0 || (alcwVar.c & 32768) == 0) ? false : true;
    }

    @Override // defpackage.algt
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (th instanceof aart) {
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            alct alctVar = alcwVar.ag;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return t(alhtVar.d(avunVar, alctVar, this.b.g, this.c), z);
        }
        return super.k(th, alcwVar, z);
    }

    @Override // defpackage.algt
    public final albu l() {
        return this.e;
    }
}
