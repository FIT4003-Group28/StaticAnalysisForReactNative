package defpackage;
/* compiled from: PG */
/* renamed from: jmq  reason: default package */
/* loaded from: classes7.dex */
public class jmq {
    public static final jmp a(jmo jmoVar) {
        if (jmoVar != null) {
            return new jmp(jmoVar);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
