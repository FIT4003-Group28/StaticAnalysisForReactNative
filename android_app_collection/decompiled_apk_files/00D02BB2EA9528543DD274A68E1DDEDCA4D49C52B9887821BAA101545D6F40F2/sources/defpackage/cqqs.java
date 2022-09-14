package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqqs  reason: default package */
/* loaded from: classes.dex */
public final class cqqs extends cqrb {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqqs(Object[] objArr, int i) {
        super(objArr);
        this.a = i;
    }

    @Override // defpackage.cqrb
    public final abs a(Context context) {
        return new zy(context, this.a);
    }
}
