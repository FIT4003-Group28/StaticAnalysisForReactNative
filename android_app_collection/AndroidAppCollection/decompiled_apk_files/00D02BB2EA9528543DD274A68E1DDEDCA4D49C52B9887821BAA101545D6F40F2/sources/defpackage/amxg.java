package defpackage;
/* compiled from: PG */
/* renamed from: amxg  reason: default package */
/* loaded from: classes.dex */
public class amxg extends bnsc {
    private final int a;
    public final bnrz d;

    public amxg(bnrz bnrzVar) {
        this(bnrzVar, 0);
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final int h() {
        return this.a;
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final bnrz i() {
        return this.d;
    }

    public amxg(bnrz bnrzVar, int i) {
        this(bnrzVar, bnrw.e, i);
    }

    public amxg(bnrz bnrzVar, bnrw bnrwVar, int i) {
        super(bnrzVar.a(), bnrwVar);
        this.a = i;
        this.d = bnrzVar;
    }
}
