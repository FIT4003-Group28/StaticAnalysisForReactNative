package defpackage;
/* compiled from: PG */
/* renamed from: aqwo  reason: default package */
/* loaded from: classes2.dex */
public class aqwo {
    public final apzy a;
    public final bvjj b;

    public aqwo(apzy apzyVar, bvjj bvjjVar) {
        this.a = apzyVar;
        this.b = bvjjVar;
    }

    public static bvjk a(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "MESSAGING_AVAILABLE_EXPIRED_TIME_MILLIS".concat(valueOf) : new String("MESSAGING_AVAILABLE_EXPIRED_TIME_MILLIS"), bvjk.b);
    }

    public static bvjk b(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "MESSAGING_AVAILABLE_FOR_LISTING".concat(valueOf) : new String("MESSAGING_AVAILABLE_FOR_LISTING"), bvjk.b);
    }
}
