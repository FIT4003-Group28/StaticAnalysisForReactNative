package defpackage;
/* compiled from: PG */
/* renamed from: aeqk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aeqk implements akqz {
    private final /* synthetic */ int c;
    public static final /* synthetic */ aeqk b = new aeqk(1);
    public static final /* synthetic */ aeqk a = new aeqk();

    private /* synthetic */ aeqk() {
    }

    private /* synthetic */ aeqk(int i) {
        this.c = i;
    }

    @Override // defpackage.akqz
    public final byte[] a(Object obj) {
        if (this.c == 0) {
            return ((cew) obj).b;
        }
        return ((aurq) obj).toByteArray();
    }
}
