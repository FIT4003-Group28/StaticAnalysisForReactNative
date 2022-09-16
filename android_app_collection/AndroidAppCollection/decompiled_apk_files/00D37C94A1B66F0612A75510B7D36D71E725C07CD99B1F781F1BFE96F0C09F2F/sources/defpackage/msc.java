package defpackage;
/* compiled from: PG */
/* renamed from: msc  reason: default package */
/* loaded from: classes3.dex */
final class msc implements ajrt {
    private final ajrs a;
    private final /* synthetic */ int b;

    public msc(ajrs ajrsVar) {
        this.a = ajrsVar;
    }

    public msc(ajrs ajrsVar, int i) {
        this.b = i;
        this.a = ajrsVar;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        if (this.b == 0) {
            ajrsVar.f("is_drawer_context", true);
            ajrsVar.f("avatar_selection_listener", this.a.c("avatar_selection_listener"));
            ajrsVar.f("avatar_selection_controller", this.a.c("avatar_selection_controller"));
            return;
        }
        ajrsVar.f("is_drawer_context", true);
        ajrsVar.f("avatar_selection_listener", this.a.c("avatar_selection_listener"));
        ajrsVar.f("avatar_selection_controller", this.a.c("avatar_selection_controller"));
        ajrsVar.f("SECTION_LIST_DRAWER_COMPACT_MODE", Boolean.valueOf(this.a.j("SECTION_LIST_DRAWER_COMPACT_MODE", true)));
    }
}
