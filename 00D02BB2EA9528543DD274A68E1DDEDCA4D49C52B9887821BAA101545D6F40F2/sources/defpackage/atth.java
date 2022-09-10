package defpackage;

import android.content.Context;
import android.content.res.Resources;
import defpackage.crqw;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atth  reason: default package */
/* loaded from: classes2.dex */
public class atth<T extends crqw> extends atss<T> implements atxq {
    @dzsi
    private atxw a;

    /* JADX INFO: Access modifiers changed from: protected */
    public atth(T t, Context context, btrm btrmVar, btvo btvoVar, cref crefVar, Resources resources, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, long j) {
        super(t, context, btrmVar, btvoVar, crefVar, resources, cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, j);
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.PROMPT_WITH_CHOICE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(atxw atxwVar) {
        L(atxwVar);
        this.a = atxwVar;
    }

    @Override // defpackage.atxq
    @dzsi
    public atxw k() {
        return this.a;
    }
}
