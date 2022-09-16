package defpackage;
/* compiled from: PG */
/* renamed from: oli  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oli implements ayqf {
    public final /* synthetic */ amup a;
    private final /* synthetic */ int b;

    public /* synthetic */ oli(amup amupVar, int i) {
        this.b = i;
        this.a = amupVar;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return !this.a.containsKey(((ampr) obj).a);
        } else if (i == 1) {
            return this.a.containsKey(((ampr) obj).a);
        } else {
            return !this.a.containsValue((Integer) obj);
        }
    }
}
