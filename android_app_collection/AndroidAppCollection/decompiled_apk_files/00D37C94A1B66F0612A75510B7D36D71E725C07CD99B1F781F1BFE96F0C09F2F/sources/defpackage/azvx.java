package defpackage;
/* compiled from: PG */
/* renamed from: azvx  reason: default package */
/* loaded from: classes2.dex */
public final class azvx {
    public static final azyg a = new azyg("COMPLETING_ALREADY");
    public static final azyg b = new azyg("COMPLETING_WAITING_CHILDREN");
    public static final azyg c = new azyg("COMPLETING_RETRY");
    public static final azyg d = new azyg("TOO_LATE_TO_CANCEL");
    public static final azyg e = new azyg("SEALED");
    public static final azvf f;

    static {
        new azvf(false);
        f = new azvf(true);
    }

    public static final Object a(Object obj) {
        return obj instanceof azvm ? new bapv((azvm) obj) : obj;
    }
}
