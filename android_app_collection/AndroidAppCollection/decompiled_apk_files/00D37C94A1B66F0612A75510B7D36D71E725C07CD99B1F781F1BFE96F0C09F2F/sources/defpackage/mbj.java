package defpackage;
/* compiled from: PG */
/* renamed from: mbj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mbj implements aluy {
    private final /* synthetic */ int c;
    public static final /* synthetic */ mbj b = new mbj(1);
    public static final /* synthetic */ mbj a = new mbj();

    private /* synthetic */ mbj() {
    }

    private /* synthetic */ mbj(int i) {
        this.c = i;
    }

    @Override // defpackage.aluy
    public final void a(Exception exc) {
        if (this.c == 0) {
            zep.d("Failed to request In-App Review", exc);
        } else {
            zep.d("Failed to launch review flow", exc);
        }
    }
}
