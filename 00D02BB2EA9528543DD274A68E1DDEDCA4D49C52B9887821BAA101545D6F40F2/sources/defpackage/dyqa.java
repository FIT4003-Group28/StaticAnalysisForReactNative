package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyqa  reason: default package */
/* loaded from: classes6.dex */
public final class dyqa {
    private static final Logger a = Logger.getLogger(dyqa.class.getName());

    private dyqa() {
    }

    public static Object a(String str) {
        dgxe dgxeVar = new dgxe(new StringReader(str));
        try {
            return b(dgxeVar);
        } finally {
            try {
                dgxeVar.close();
            } catch (IOException e) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
            }
        }
    }

    private static Object b(dgxe dgxeVar) {
        dbsk.m(dgxeVar.e(), "unexpected end of JSON");
        int q = dgxeVar.q();
        int i = q - 1;
        if (q != 0) {
            boolean z = true;
            if (i == 0) {
                dgxeVar.a();
                ArrayList arrayList = new ArrayList();
                while (dgxeVar.e()) {
                    arrayList.add(b(dgxeVar));
                }
                if (dgxeVar.q() != 2) {
                    z = false;
                }
                String valueOf = String.valueOf(dgxeVar.p());
                dbsk.m(z, valueOf.length() != 0 ? "Bad token: ".concat(valueOf) : new String("Bad token: "));
                dgxeVar.b();
                return Collections.unmodifiableList(arrayList);
            } else if (i == 2) {
                dgxeVar.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (dgxeVar.e()) {
                    linkedHashMap.put(dgxeVar.g(), b(dgxeVar));
                }
                if (dgxeVar.q() != 4) {
                    z = false;
                }
                String valueOf2 = String.valueOf(dgxeVar.p());
                dbsk.m(z, valueOf2.length() != 0 ? "Bad token: ".concat(valueOf2) : new String("Bad token: "));
                dgxeVar.d();
                return Collections.unmodifiableMap(linkedHashMap);
            } else if (i == 5) {
                return dgxeVar.h();
            } else {
                if (i == 6) {
                    return Double.valueOf(dgxeVar.k());
                }
                if (i == 7) {
                    return Boolean.valueOf(dgxeVar.i());
                }
                if (i == 8) {
                    dgxeVar.j();
                    return null;
                }
                String valueOf3 = String.valueOf(dgxeVar.p());
                throw new IllegalStateException(valueOf3.length() != 0 ? "Bad token: ".concat(valueOf3) : new String("Bad token: "));
            }
        }
        throw null;
    }
}
