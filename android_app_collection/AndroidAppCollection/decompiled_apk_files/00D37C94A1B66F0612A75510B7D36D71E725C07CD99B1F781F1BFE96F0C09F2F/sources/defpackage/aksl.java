package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aksl  reason: default package */
/* loaded from: classes.dex */
public final class aksl implements aksg {
    private final Map a = new HashMap();

    @Override // defpackage.aksg
    public final ankt a(String str) {
        if (this.a.containsKey(str)) {
            return anlz.q((aksu) this.a.get(str));
        }
        return anlz.q(null);
    }

    @Override // defpackage.aksg
    public final void b(String str, aksu aksuVar) {
        this.a.put(str, aksuVar);
    }
}
