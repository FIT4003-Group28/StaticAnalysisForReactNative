package defpackage;
/* compiled from: PG */
/* renamed from: axpv  reason: default package */
/* loaded from: classes2.dex */
public enum axpv {
    Continuation(0),
    Text(1),
    Binary(2),
    Close(8),
    Ping(9),
    Pong(10);
    
    public final byte g;

    axpv(int i) {
        this.g = (byte) i;
    }

    public final boolean a() {
        return this == Close || this == Ping || this == Pong;
    }
}
