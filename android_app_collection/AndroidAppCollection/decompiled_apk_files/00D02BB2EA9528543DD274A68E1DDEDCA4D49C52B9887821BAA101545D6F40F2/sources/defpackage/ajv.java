package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajv  reason: default package */
/* loaded from: classes.dex */
public final class ajv implements Runnable {
    final /* synthetic */ ajy a;
    final /* synthetic */ Object b;

    public ajv(ajy ajyVar, Object obj) {
        this.a = ajyVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.b;
    }
}
