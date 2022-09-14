package defpackage;
/* renamed from: arpy  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class arpy implements dbsl {
    static final dbsl a = new arpy();

    private arpy() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        return afgaVar.a.hasExtra("ResumeNavigationIntent_DIRECTIONS_STORAGE_ITEM") && afgaVar.a.hasExtra("ResumeNavigationIntent_TRIP_INDEX");
    }
}
