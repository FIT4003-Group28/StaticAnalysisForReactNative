package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: evs  reason: default package */
/* loaded from: classes3.dex */
public final class evs implements amqo, ynj {
    public Map a = Collections.emptyMap();

    @Override // defpackage.ynj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a = ((aaoe) obj).a();
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
