package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amws  reason: default package */
/* loaded from: classes.dex */
public final class amws extends amrt {
    final /* synthetic */ Map.Entry a;

    public amws(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }
}
