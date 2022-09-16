package defpackage;
/* compiled from: PG */
/* renamed from: eqa  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eqa implements ampt {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqa(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return this.a.equals((String) obj);
            }
            if (i == 2) {
                return this.a.equals((String) obj);
            }
            return this.a.startsWith((String) obj);
        }
        return this.a.equals((String) obj);
    }
}
