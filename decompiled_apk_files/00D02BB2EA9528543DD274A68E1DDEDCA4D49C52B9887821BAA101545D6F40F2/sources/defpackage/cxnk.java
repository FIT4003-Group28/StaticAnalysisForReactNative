package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxnk  reason: default package */
/* loaded from: classes5.dex */
public final class cxnk {
    private final StringBuilder a = new StringBuilder();
    private final List<String> b = new ArrayList();

    private cxnk() {
    }

    public static final cxnk a() {
        return new cxnk();
    }

    public final cxnj b() {
        return new cxni(this.a.toString(), this.b);
    }

    public final void c(String str) {
        this.a.append(str);
    }

    public final void d(String str, Object... objArr) {
        this.a.append(str);
        if (objArr != null) {
            if (this.b.size() + objArr.length > 999) {
                throw new IllegalArgumentException("Single SQL statements support at most 999 parameters.");
            }
            for (Object obj : objArr) {
                if (obj == null) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Bind argument can't be null for query".concat(valueOf) : new String("Bind argument can't be null for query"));
                }
                this.b.add(obj.toString());
            }
        }
    }
}
