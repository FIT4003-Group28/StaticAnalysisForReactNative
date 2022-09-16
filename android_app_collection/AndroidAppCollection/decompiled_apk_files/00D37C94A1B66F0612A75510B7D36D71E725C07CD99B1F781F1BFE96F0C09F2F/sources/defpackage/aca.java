package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aca  reason: default package */
/* loaded from: classes.dex */
public final class aca extends aby {
    final /* synthetic */ String a;
    final /* synthetic */ ach b;
    final /* synthetic */ acd c;

    public aca(acd acdVar, String str, ach achVar) {
        this.c = acdVar;
        this.a = str;
        this.b = achVar;
    }

    @Override // defpackage.aby
    public final void a() {
        this.c.d(this.a);
    }

    @Override // defpackage.aby
    public final void b(Object obj) {
        Integer num = (Integer) this.c.c.get(this.a);
        if (num == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        this.c.d.add(this.a);
        this.c.f(num.intValue(), this.b, obj);
    }
}
