package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bbto  reason: default package */
/* loaded from: classes3.dex */
public final class bbto implements bbvl {
    private final HashMap<String, bbvk> a = new HashMap<>();

    @Override // defpackage.bbvl
    public final void a(String str, bbvk bbvkVar) {
        this.a.put(str, bbvkVar);
    }

    @Override // defpackage.bbvl
    public final boolean b(String str) {
        return this.a.containsKey(str) && this.a.get(str) == bbvk.MUTED;
    }
}
