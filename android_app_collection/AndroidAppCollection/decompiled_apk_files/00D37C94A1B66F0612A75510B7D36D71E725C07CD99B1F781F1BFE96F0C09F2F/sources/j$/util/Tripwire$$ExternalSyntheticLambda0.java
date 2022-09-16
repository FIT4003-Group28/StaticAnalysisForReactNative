package j$.util;

import java.security.PrivilegedAction;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Tripwire$$ExternalSyntheticLambda0 implements PrivilegedAction {
    public static final /* synthetic */ Tripwire$$ExternalSyntheticLambda0 INSTANCE = new Tripwire$$ExternalSyntheticLambda0();

    private /* synthetic */ Tripwire$$ExternalSyntheticLambda0() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Boolean valueOf;
        valueOf = Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        return valueOf;
    }
}
