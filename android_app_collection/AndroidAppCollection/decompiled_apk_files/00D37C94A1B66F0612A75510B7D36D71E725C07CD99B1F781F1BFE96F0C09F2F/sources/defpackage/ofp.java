package defpackage;
/* compiled from: PG */
/* renamed from: ofp  reason: default package */
/* loaded from: classes3.dex */
public final class ofp extends fdm implements ezb {
    private final ezd a;
    private final ezh b;
    private final fud c;

    public ofp(feh fehVar, ezd ezdVar, ezh ezhVar, fud fudVar) {
        super(fehVar);
        this.a = ezdVar;
        this.b = ezhVar;
        this.c = fudVar;
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        if (!this.b.g().i()) {
            return;
        }
        this.c.c(false);
    }

    @Override // defpackage.feg
    public final void kF() {
        this.a.h(this);
    }

    @Override // defpackage.feg
    public final void nr() {
        this.a.d(this);
    }
}
