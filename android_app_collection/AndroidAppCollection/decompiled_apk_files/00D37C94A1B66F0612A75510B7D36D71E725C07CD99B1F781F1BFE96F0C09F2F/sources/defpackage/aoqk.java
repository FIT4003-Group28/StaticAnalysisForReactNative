package defpackage;
/* compiled from: PG */
/* renamed from: aoqk  reason: default package */
/* loaded from: classes.dex */
final class aoqk implements aoqs {
    public static final aoqk a = new aoqk(1);
    private final /* synthetic */ int b;

    public aoqk() {
    }

    private aoqk(int i) {
        this.b = i;
    }

    @Override // defpackage.aoqs
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return aopi.class.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // defpackage.aoqs
    public final aoqr a(Class cls) {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!aopi.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (aoqr) aopi.getDefaultInstance(cls.asSubclass(aopi.class)).buildMessageInfo();
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
