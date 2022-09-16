package defpackage;
/* compiled from: PG */
/* renamed from: ggl  reason: default package */
/* loaded from: classes3.dex */
public final class ggl extends ajlj {
    private final yel c;
    private final fyy d;

    public ggl(yel yelVar, srv srvVar, axnm axnmVar, acti actiVar, akge akgeVar, fyy fyyVar) {
        super(srvVar, axnmVar, actiVar, akgeVar);
        this.c = yelVar;
        this.d = fyyVar;
    }

    @Override // defpackage.ajlj, defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        return b((auvh) obj, tcsVar);
    }

    @Override // defpackage.ajlj
    public final aynr d(auvh auvhVar, tcs tcsVar) {
        ezf ezfVar;
        if ((auvhVar.c & 32) != 0) {
            yel yelVar = this.c;
            if ((yelVar instanceof ggk) && (ezfVar = ((ggk) yelVar).c) != null && ezfVar.k()) {
                return aynr.f();
            }
        }
        return super.b(auvhVar, tcsVar);
    }

    @Override // defpackage.ajlj, defpackage.srt
    public final void e() {
        this.d.m(3);
    }

    @Override // defpackage.ajlj, defpackage.srt
    public final void f() {
        this.d.h(3);
    }
}
