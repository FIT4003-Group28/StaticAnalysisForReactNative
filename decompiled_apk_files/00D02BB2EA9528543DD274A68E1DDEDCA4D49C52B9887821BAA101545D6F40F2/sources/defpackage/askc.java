package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: askc  reason: default package */
/* loaded from: classes2.dex */
final class askc implements cjvl {
    private final List<eapd> a = new ArrayList();

    @Override // defpackage.cjvl
    public final synchronized void a() {
        if (this.a.size() >= 1000) {
            return;
        }
        this.a.add(eapd.a());
    }

    public final synchronized List<eapd> b() {
        return dcdc.r(this.a);
    }

    public final synchronized void c() {
        this.a.clear();
    }
}