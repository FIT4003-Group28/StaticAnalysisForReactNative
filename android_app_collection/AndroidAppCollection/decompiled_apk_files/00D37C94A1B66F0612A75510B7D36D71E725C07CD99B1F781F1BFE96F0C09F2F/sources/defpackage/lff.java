package defpackage;
/* compiled from: PG */
/* renamed from: lff  reason: default package */
/* loaded from: classes3.dex */
public final class lff implements zbu {
    final /* synthetic */ azqb a;
    private final /* synthetic */ int b;

    public lff(azqb azqbVar) {
        this.a = azqbVar;
    }

    public lff(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        if (this.b == 0) {
            return ((fnn) this.a.get()).a();
        }
        return anlz.q(Boolean.valueOf(((fcu) this.a.get()).g()));
    }

    @Override // defpackage.zbu
    public final /* bridge */ /* synthetic */ ankt b(Object obj) {
        if (this.b == 0) {
            return ((fnn) this.a.get()).a.b(new ehf(((Boolean) obj).booleanValue(), 6));
        }
        return ((fcu) this.a.get()).a.b(new liw((Boolean) obj, 1));
    }
}
