package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amuc  reason: default package */
/* loaded from: classes.dex */
public final class amuc extends amrt implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b;

    public amuc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
