package defpackage;

import android.net.Uri;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: crwz  reason: default package */
/* loaded from: classes5.dex */
public abstract class crwz {
    public static String f() {
        return UUID.randomUUID().toString();
    }

    public static crwz g(crts crtsVar, int i) {
        dbsk.b(!crtsVar.b.isEmpty(), "UploadOption.uri is required.");
        crwr crwrVar = new crwr();
        String f = f();
        if (f != null) {
            crwrVar.a = f;
            if (crtsVar != null) {
                crwrVar.b = crtsVar;
                Uri parse = Uri.parse(crtsVar.b);
                if (parse != null) {
                    crwrVar.c = parse;
                    crwrVar.b(i);
                    return crwrVar.a();
                }
                throw new NullPointerException("Null uri");
            }
            throw new NullPointerException("Null uploadOption");
        }
        throw new NullPointerException("Null gpuMediaId");
    }

    public abstract String a();

    public abstract crts b();

    public abstract Uri c();

    public abstract crwy d();

    public abstract int e();
}
