package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aekr  reason: default package */
/* loaded from: classes.dex */
public final class aekr implements ankb {
    public agp a;

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        if (obj != null) {
            this.a.c(obj);
        }
        this.a.d(new NullPointerException());
    }
}
