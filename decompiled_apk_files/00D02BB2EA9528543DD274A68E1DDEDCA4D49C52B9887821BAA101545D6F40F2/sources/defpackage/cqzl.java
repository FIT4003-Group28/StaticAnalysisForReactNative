package defpackage;
/* compiled from: PG */
/* renamed from: cqzl  reason: default package */
/* loaded from: classes5.dex */
public final class cqzl extends Exception {
    public final drtc a;

    public cqzl(int i, String str) {
        this(drtc.b(i), str);
    }

    public cqzl(drtc drtcVar, String str) {
        super(String.format("Code: %s, Message: %s", drtcVar.name(), str));
        this.a = drtcVar;
    }
}
