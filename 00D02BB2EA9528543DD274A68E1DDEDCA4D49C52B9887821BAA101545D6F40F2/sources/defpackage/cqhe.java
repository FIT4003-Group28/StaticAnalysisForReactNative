package defpackage;

import android.content.Context;
import android.view.View;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqhe  reason: default package */
/* loaded from: classes.dex */
public final class cqhe<K extends cqkp, V extends cqkp> extends cqiy<V> {
    final cqja<K> a;
    final cqjb<K, V> b;

    public cqhe(View view, cqho cqhoVar, cqja<K> cqjaVar, cqjb<K, V> cqjbVar, cqja<V> cqjaVar2, cqjg cqjgVar, cqiw<V> cqiwVar, int i, boolean z) {
        super(view, cqhoVar, cqjaVar2, cqjgVar, cqiwVar, z);
        this.a = cqjaVar;
        this.b = cqjbVar;
    }

    @Override // defpackage.cqjz
    @dzsi
    public final V a(@dzsi cqkp cqkpVar, Context context) {
        if (cqkpVar == null) {
            return null;
        }
        return this.b.a(cqkpVar, context);
    }

    @Override // defpackage.cqjz
    public final cqja<?> b() {
        return (cqja<K>) this.a;
    }
}
