package defpackage;
/* compiled from: PG */
/* renamed from: ckqp  reason: default package */
/* loaded from: classes4.dex */
public final class ckqp<T> extends btrh<T> {
    public ckqp(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        creu creuVar = (creu) obj;
        synchronized (((ckqo) this.a)) {
            int i = creuVar.a;
        }
    }
}
