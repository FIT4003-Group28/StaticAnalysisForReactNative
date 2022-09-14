package defpackage;
/* compiled from: PG */
/* renamed from: cljh  reason: default package */
/* loaded from: classes5.dex */
final class cljh extends IllegalArgumentException {
    public cljh(String str) {
        super(str);
    }

    public cljh(Throwable th) {
        super("Invalid base64 payload in data URL", th);
    }
}
