package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qob  reason: default package */
/* loaded from: classes7.dex */
public class qob extends qno {
    final /* synthetic */ Runnable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qob(Context context, qnn qnnVar, Runnable runnable) {
        super(context, qnnVar);
        this.b = runnable;
    }

    @Override // defpackage.qno, defpackage.jam
    public Boolean h() {
        return true;
    }

    @Override // defpackage.qno, defpackage.jam
    public cqkl i() {
        this.b.run();
        return cqkl.a;
    }
}
