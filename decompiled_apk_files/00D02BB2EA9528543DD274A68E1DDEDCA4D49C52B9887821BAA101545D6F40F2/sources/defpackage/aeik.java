package defpackage;
/* compiled from: PG */
/* renamed from: aeik  reason: default package */
/* loaded from: classes2.dex */
public final class aeik extends aeis {
    public ddho a;
    public ddho b;
    public ddho c;

    @Override // defpackage.aeis
    public final aeit a() {
        String str = this.a == null ? " carouselVisualElement" : "";
        if (this.b == null) {
            str = str.concat(" hotelVisualElement");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" moreButtonVisualElement");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aeil(this.a, this.b, this.c);
    }
}
