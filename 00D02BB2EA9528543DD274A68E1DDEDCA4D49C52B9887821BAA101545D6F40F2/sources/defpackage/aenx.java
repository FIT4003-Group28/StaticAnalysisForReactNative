package defpackage;
/* compiled from: PG */
/* renamed from: aenx  reason: default package */
/* loaded from: classes2.dex */
public class aenx {
    public static final aenw a(aenv aenvVar, eapg eapgVar, eapg eapgVar2, eapg eapgVar3) {
        b(aenvVar, 1);
        b(eapgVar, 2);
        b(eapgVar2, 3);
        b(eapgVar3, 4);
        return new aenw(aenvVar, eapgVar, eapgVar2, eapgVar3);
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
