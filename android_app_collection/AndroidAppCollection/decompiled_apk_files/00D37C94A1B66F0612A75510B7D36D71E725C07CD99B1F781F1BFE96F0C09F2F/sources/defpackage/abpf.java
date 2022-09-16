package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: abpf  reason: default package */
/* loaded from: classes.dex */
public abstract class abpf extends abpd {
    public abpf(Context context, ajyi ajyiVar, ajsg ajsgVar, acti actiVar, abjy abjyVar) {
        super(context, ajyiVar, ajsgVar, actiVar, abjyVar);
        a().aC(new abpe(this, e()));
    }

    @Override // defpackage.abpd
    public RecyclerView b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract View c();

    protected abstract View e();
}
