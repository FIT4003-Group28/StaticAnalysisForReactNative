package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfyk  reason: default package */
/* loaded from: classes3.dex */
public final class bfyk extends cqmr<bnii> {
    boolean a = false;
    boolean b = false;
    final /* synthetic */ View c;
    final /* synthetic */ cqjz d;

    public bfyk(View view, cqjz cqjzVar) {
        this.c = view;
        this.d = cqjzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bnii bniiVar, boolean z) {
        bmog.b(this.c, new bfyj(this, bniiVar), 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        bmog.a(this.d.c);
        this.a = false;
        this.b = false;
    }
}
