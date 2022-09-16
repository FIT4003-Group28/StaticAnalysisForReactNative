package defpackage;
/* compiled from: PG */
/* renamed from: amqq  reason: default package */
/* loaded from: classes.dex */
public final class amqq implements amqo {
    volatile amqo a;
    volatile boolean b;
    Object c;

    public amqq(amqo amqoVar) {
        amqoVar.getClass();
        this.a = amqoVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    amqo amqoVar = this.a;
                    amqoVar.getClass();
                    Object obj = amqoVar.get();
                    this.c = obj;
                    this.b = true;
                    this.a = null;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
