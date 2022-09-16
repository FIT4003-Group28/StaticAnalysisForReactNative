package defpackage;
/* compiled from: PG */
/* renamed from: urj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class urj implements uri {
    private final /* synthetic */ int c;
    public static final /* synthetic */ urj b = new urj(1);
    public static final /* synthetic */ urj a = new urj();

    private /* synthetic */ urj() {
    }

    private /* synthetic */ urj(int i) {
        this.c = i;
    }

    @Override // defpackage.uri
    public final ankt a(uqe uqeVar, String str, int i) {
        if (this.c == 0) {
            return uqeVar.f(str, i);
        }
        return uqeVar.e(str, i);
    }
}
