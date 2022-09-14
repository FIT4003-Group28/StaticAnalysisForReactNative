package defpackage;
/* renamed from: axym  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class axym implements dbsl {
    static final dbsl a = new axym();

    private axym() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        azwu azwuVar = (azwu) obj;
        return !azwuVar.a().isEmpty() && !azwuVar.a().equals("Auto-generate a ClientId, please!");
    }
}
