package defpackage;
/* compiled from: PG */
/* renamed from: dctz  reason: default package */
/* loaded from: classes.dex */
public abstract class dctz {
    public final int a;
    public final dcrg b;

    public abstract void a(dcua dcuaVar, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public dctz(dcrg dcrgVar, int i) {
        if (dcrgVar != null) {
            if (i >= 0) {
                this.a = i;
                this.b = dcrgVar;
                return;
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("format options cannot be null");
    }
}
