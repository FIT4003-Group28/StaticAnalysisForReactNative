package defpackage;
/* compiled from: PG */
/* renamed from: kxi  reason: default package */
/* loaded from: classes3.dex */
public final class kxi implements ajrt {
    public static final /* synthetic */ kxi a = new kxi(3);
    private final /* synthetic */ int b;

    public kxi() {
    }

    public kxi(int i) {
        this.b = i;
    }

    public static boolean b(ajrs ajrsVar) {
        return ajrsVar.j("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", false);
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            ajrsVar.f("clarify_box_in_metadata_highlights", Boolean.TRUE);
            return;
        }
        boolean z = true;
        if (i2 == 1) {
            ajrsVar.f("MainSortFilterSubMenuContextDecoratorPreventDisableWhenOfflineKey", true);
        } else if (i2 == 2) {
            ajrsVar.f("clarify_box_no_bottom", Boolean.TRUE);
        } else if (i2 == 3) {
            if (!(ajqmVar.c(i) instanceof ajxr)) {
                return;
            }
            emn.J(ajrsVar, 2);
        } else if (i2 == 4) {
            if (i != ajqmVar.a() - 1 || !(ajqmVar.c(i) instanceof awbh)) {
                return;
            }
            ajrsVar.f("video_with_context_hide_separator_present_context_decorator", true);
        } else if (i2 == 5) {
            if (i != 0) {
                z = false;
            }
            ajrsVar.f("isFirstItem", Boolean.valueOf(z));
        } else {
            if (i != ajqmVar.a() - 1) {
                z = false;
            }
            ajrsVar.f("isLastItem", Boolean.valueOf(z));
        }
    }
}
