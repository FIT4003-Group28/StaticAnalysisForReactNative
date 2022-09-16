package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ubi  reason: default package */
/* loaded from: classes4.dex */
public final class ubi {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "INVALID_ENCODING" : "UNKNOWN_OPTION" : "MALFORMED";
    }

    public static alzf b(aogp aogpVar) {
        if (!aogpVar.b.isEmpty()) {
            alzc alzcVar = ((aogq) aogpVar.b.get(0)).b;
            if (alzcVar == null) {
                alzcVar = alzc.a;
            }
            aopu<alzf> aopuVar = alzcVar.c;
            if (aopuVar.isEmpty()) {
                return null;
            }
            for (alzf alzfVar : aopuVar) {
                if ((alzfVar.b & 1) != 0) {
                    alzd alzdVar = alzfVar.c;
                    if (alzdVar == null) {
                        alzdVar = alzd.a;
                    }
                    if (alzdVar.b) {
                        return alzfVar;
                    }
                }
            }
            return (alzf) aopuVar.get(0);
        }
        return null;
    }

    public static void c(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }
}
