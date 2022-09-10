package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anna  reason: default package */
/* loaded from: classes2.dex */
public final class anna {
    public final aogb a;
    public final dbsg<String> b;
    public final List<btzi<duzc, duzk>> c = new ArrayList();
    public final List<btzi<duzc, duzk>> d = new ArrayList();
    public boolean e = false;

    public anna(aogb aogbVar, dbsg<String> dbsgVar) {
        this.a = aogbVar;
        this.b = dbsgVar;
    }

    public final void a() {
        if (!this.d.isEmpty()) {
            bvoo.h("Starting enqueued request despite ongoing request for the same day %s", this.a);
        }
        this.d.addAll(this.c);
        this.c.clear();
    }
}
