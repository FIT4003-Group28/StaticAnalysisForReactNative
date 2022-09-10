package defpackage;
/* compiled from: PG */
/* renamed from: ahml  reason: default package */
/* loaded from: classes2.dex */
public final class ahml<T> extends btrh<T> {
    public ahml(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        alsr alsrVar = (alsr) obj;
        ahmj ahmjVar = ((ahmi) this.a).a;
        if (ahmjVar.d) {
            return;
        }
        ahmjVar.d = true;
        if (!ahmjVar.c) {
            return;
        }
        ahmjVar.c();
    }
}
