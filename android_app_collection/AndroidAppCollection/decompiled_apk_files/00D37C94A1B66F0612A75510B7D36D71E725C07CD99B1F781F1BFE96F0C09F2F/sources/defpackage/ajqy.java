package defpackage;
/* compiled from: PG */
/* renamed from: ajqy  reason: default package */
/* loaded from: classes.dex */
public final class ajqy implements ajrt {
    private final int a;
    private final int b;

    public ajqy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        ajrsVar.f("grid_row_presenter_horizontal_row_padding", Integer.valueOf(this.a));
        if (i == 0) {
            ajrsVar.f("grid_row_presenter_top_padding", Integer.valueOf(this.b));
            i = 0;
        }
        if (i == ajqmVar.a() - 1) {
            ajrsVar.f("grid_row_presenter_bottom_padding", Integer.valueOf(this.b));
        }
    }
}
