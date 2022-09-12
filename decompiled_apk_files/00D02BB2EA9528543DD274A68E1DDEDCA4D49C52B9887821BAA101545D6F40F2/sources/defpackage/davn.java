package defpackage;
/* compiled from: PG */
/* renamed from: davn  reason: default package */
/* loaded from: classes5.dex */
public final class davn extends darp {
    static {
        boolean z = darc.a.intValue() == 1 && darc.b.intValue() >= 15;
        Object[] objArr = {darc.d};
        if (z) {
            return;
        }
        throw new IllegalStateException(dbtx.b("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.25.0-SNAPSHOT of the Maps Photo Upload Internal API library.", objArr));
    }

    public davn(davk davkVar) {
        super(davkVar);
    }

    public final davm e() {
        return new davm(this);
    }
}
