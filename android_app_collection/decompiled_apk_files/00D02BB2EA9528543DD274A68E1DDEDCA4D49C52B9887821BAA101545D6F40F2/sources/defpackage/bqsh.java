package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bqsh  reason: default package */
/* loaded from: classes4.dex */
public final class bqsh {
    public final Map<String, bqsg> a = new HashMap();

    public final void a(String str, float f, String str2) {
        bqrn bqrnVar = new bqrn(str, f, str2, this.a.size());
        this.a.put(bqrnVar.a, bqrnVar);
    }
}
