package defpackage;
/* compiled from: PG */
/* renamed from: nli  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nli implements ayqf {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ nli(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return ((fbc) obj).c.matches(this.a);
            } else if (i == 2) {
                return this.a.equals(((npv) obj).a);
            } else {
                if (i == 3) {
                    return !((auog) obj).getPlaylistIds().contains(this.a);
                } else if (i == 4) {
                    return ((auog) obj).getPlaylistIds().contains(this.a);
                } else {
                    return this.a.equals(((aksd) obj).a);
                }
            }
        }
        return this.a.equals(((npv) obj).a);
    }
}
