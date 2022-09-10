package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnoj  reason: default package */
/* loaded from: classes3.dex */
public final class bnoj implements Runnable {
    final /* synthetic */ bnom a;

    public bnoj(bnom bnomVar) {
        this.a = bnomVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bnom bnomVar = this.a;
        bnomVar.d = bnomVar.b.getResources().getString(R.string.DISMISS);
        this.a.w = true;
        cqkx.p(this.a.a);
    }
}
