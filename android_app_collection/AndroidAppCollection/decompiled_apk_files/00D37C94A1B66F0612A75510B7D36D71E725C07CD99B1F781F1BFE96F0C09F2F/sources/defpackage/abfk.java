package defpackage;
/* compiled from: PG */
/* renamed from: abfk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abfk implements aniq {
    public final /* synthetic */ ankt a;
    public final /* synthetic */ ankt b;
    private final /* synthetic */ int c;

    public /* synthetic */ abfk(ankt anktVar, ankt anktVar2) {
        this.a = anktVar;
        this.b = anktVar2;
    }

    public /* synthetic */ abfk(ankt anktVar, ankt anktVar2, int i) {
        this.c = i;
        this.a = anktVar;
        this.b = anktVar2;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        if (this.c == 0) {
            ankt anktVar = this.a;
            ankt anktVar2 = this.b;
            anlz.y(anktVar);
            anlz.y(anktVar2);
            return anlz.q(null);
        }
        return anlz.q(new ldj((String) anlz.y(this.a), (aurq) anlz.y(this.b)));
    }
}
