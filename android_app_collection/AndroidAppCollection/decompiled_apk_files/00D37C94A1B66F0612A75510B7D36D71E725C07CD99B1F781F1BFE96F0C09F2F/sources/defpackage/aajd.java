package defpackage;

import android.util.Base64;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aajd  reason: default package */
/* loaded from: classes.dex */
public final class aajd {
    public final aagi a;
    public final azqb b;

    public aajd(azqb azqbVar, aagi aagiVar) {
        this.b = azqbVar;
        this.a = aagiVar;
    }

    public static byte[] a(aoob aoobVar) {
        aoog l = aoobVar.l();
        try {
            if (aosl.b(l.n()) != 2) {
                String valueOf = String.valueOf(Base64.encodeToString(aoobVar.I(), 10));
                throw new IllegalStateException(valueOf.length() != 0 ? "Any field within EntityMutationPayload must have WIRETYPE_LENGTH_DELIMITED tag. Base64 payload bytes: ".concat(valueOf) : new String("Any field within EntityMutationPayload must have WIRETYPE_LENGTH_DELIMITED tag. Base64 payload bytes: "));
            }
            byte[] H = l.H();
            aqxo.z(l.E(), "There can be only one field in EntityMutationPayload");
            return H;
        } catch (IOException unused) {
            return null;
        }
    }
}
