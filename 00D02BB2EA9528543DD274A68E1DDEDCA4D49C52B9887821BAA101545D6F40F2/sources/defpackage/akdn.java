package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdn  reason: default package */
/* loaded from: classes2.dex */
public final class akdn implements dbty<btlu> {
    final /* synthetic */ String a;
    final /* synthetic */ akdv b;

    public akdn(akdv akdvVar, String str) {
        this.b = akdvVar;
        this.a = str;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ btlu a() {
        btlu n = this.b.b.n(this.a);
        if (n != null) {
            n.e = btls.PICKED_BY_USER_OR_TASK;
            return n;
        }
        return btlu.a;
    }
}
