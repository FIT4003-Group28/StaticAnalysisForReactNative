package defpackage;
/* compiled from: PG */
/* renamed from: adjr  reason: default package */
/* loaded from: classes.dex */
public final class adjr implements ankb {
    private final /* synthetic */ int a;

    public adjr() {
    }

    public adjr(int i) {
        this.a = i;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (this.a != 0) {
            return;
        }
        zep.d("Failed to hide notifications", th);
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
    }
}
