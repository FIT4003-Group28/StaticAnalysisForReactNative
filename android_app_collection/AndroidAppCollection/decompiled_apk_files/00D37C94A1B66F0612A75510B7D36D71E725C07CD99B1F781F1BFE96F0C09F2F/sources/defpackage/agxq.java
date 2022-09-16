package defpackage;
/* compiled from: PG */
/* renamed from: agxq  reason: default package */
/* loaded from: classes.dex */
public final class agxq extends RuntimeException {
    public final boolean a;
    public final agqe b;
    public final atsg c;

    private agxq(boolean z, String str, Exception exc, agqe agqeVar, atsg atsgVar) {
        super(str, exc);
        this.a = z;
        this.b = agqeVar;
        this.c = atsgVar;
    }

    public static agxq a(String str, Exception exc, agqe agqeVar, atsg atsgVar) {
        return new agxq(true, str, exc, agqeVar, atsgVar);
    }

    public static agxq b(String str, Exception exc, agqe agqeVar, atsg atsgVar) {
        return new agxq(false, str, exc, agqeVar, atsgVar);
    }
}
