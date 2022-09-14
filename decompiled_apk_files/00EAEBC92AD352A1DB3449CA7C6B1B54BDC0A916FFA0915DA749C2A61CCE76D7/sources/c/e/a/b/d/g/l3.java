package c.e.a.b.d.g;

import c.e.a.b.d.g.l3;
import c.e.a.b.d.g.m3;
/* loaded from: classes.dex */
public abstract class l3<MessageType extends m3<MessageType, BuilderType>, BuilderType extends l3<MessageType, BuilderType>> implements n6 {
    protected abstract BuilderType a(MessageType messagetype);

    public abstract BuilderType a(byte[] bArr, int i, int i2);

    public abstract BuilderType a(byte[] bArr, int i, int i2, p4 p4Var);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.e.a.b.d.g.n6
    public final /* synthetic */ n6 a(k6 k6Var) {
        if (a().getClass().isInstance(k6Var)) {
            return a((l3<MessageType, BuilderType>) ((m3) k6Var));
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // c.e.a.b.d.g.n6
    public final /* synthetic */ n6 a(byte[] bArr) {
        a(bArr, 0, bArr.length);
        return this;
    }

    @Override // c.e.a.b.d.g.n6
    public final /* synthetic */ n6 a(byte[] bArr, p4 p4Var) {
        a(bArr, 0, bArr.length, p4Var);
        return this;
    }
}
