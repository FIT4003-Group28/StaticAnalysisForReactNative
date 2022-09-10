package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmoi  reason: default package */
/* loaded from: classes3.dex */
public final class bmoi extends cqmr {
    boolean a = false;
    final /* synthetic */ View b;
    final /* synthetic */ cqjz c;
    final /* synthetic */ bmoj d;

    public bmoi(bmoj bmojVar, View view, cqjz cqjzVar) {
        this.d = bmojVar;
        this.b = view;
        this.c = cqjzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void a(cqkp cqkpVar, boolean z) {
        bmog.b(this.b, new bmoh(this, cqkpVar), this.d.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        bmog.a(this.c.c);
        this.a = false;
    }
}
