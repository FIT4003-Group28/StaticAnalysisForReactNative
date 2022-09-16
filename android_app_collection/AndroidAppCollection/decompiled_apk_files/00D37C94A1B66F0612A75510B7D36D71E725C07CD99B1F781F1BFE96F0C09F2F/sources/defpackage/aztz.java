package defpackage;
/* compiled from: PG */
/* renamed from: aztz  reason: default package */
/* loaded from: classes2.dex */
public final class aztz implements azsc, azwb {
    private final azwx a;

    public aztz() {
    }

    public aztz(azwx azwxVar) {
        this((byte[]) null);
        this.a = azwxVar;
    }

    public aztz(byte[] bArr) {
        this();
    }

    @Override // defpackage.azsc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        b();
        return azqm.a;
    }

    public final void b() {
        this.a.m();
    }

    public final String toString() {
        return "RemoveReceiveOnCancel[" + this.a + ']';
    }
}
