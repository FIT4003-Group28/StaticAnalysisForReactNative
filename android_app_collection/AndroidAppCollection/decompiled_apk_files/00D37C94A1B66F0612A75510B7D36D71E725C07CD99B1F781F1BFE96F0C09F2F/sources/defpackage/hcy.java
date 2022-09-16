package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: hcy  reason: default package */
/* loaded from: classes3.dex */
public final class hcy {
    public final axnm a;
    public final List b = Collections.synchronizedList(new ArrayList());
    public final azpq c = azpq.e();
    public final hba d;

    public hcy(axnm axnmVar, hba hbaVar) {
        this.a = axnmVar;
        this.d = hbaVar;
    }

    public final int a() {
        return this.b.size();
    }

    public final ayoi b() {
        return this.c.R();
    }
}
