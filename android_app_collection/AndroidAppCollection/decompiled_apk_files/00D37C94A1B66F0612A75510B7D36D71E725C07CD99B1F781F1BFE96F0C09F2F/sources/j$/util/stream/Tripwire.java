package j$.util.stream;

import java.security.AccessController;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class Tripwire {
    static final boolean ENABLED = ((Boolean) AccessController.doPrivileged(Tripwire$$ExternalSyntheticLambda0.INSTANCE)).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void trip(Class cls, String str) {
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(" tripwire tripped but logging not supported: ");
        sb.append(str);
        throw new UnsupportedOperationException(sb.toString());
    }
}
