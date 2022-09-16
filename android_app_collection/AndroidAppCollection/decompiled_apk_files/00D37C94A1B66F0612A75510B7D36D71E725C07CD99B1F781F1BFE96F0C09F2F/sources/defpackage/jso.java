package defpackage;
/* compiled from: PG */
/* renamed from: jso  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jso implements ajrt {
    public final /* synthetic */ jsv a;
    private final /* synthetic */ int b;

    public /* synthetic */ jso(jsv jsvVar, int i) {
        this.b = i;
        this.a = jsvVar;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        int i2 = this.b;
        int i3 = -1;
        if (i2 == 0) {
            if (true == this.a.a.n()) {
                i3 = 20;
            }
            ajrsVar.f("BackgroundPromoPresenter.BottomPaddingKey", Integer.valueOf(i3));
        } else if (i2 == 1) {
            if (true == this.a.a.e()) {
                i3 = 16;
            }
            ajrsVar.f("BackgroundPromoPresenter.BodyTextTopPaddingKey", Integer.valueOf(i3));
        } else {
            ajrsVar.f("downloads_page_section_key", this.a.d);
        }
    }
}
