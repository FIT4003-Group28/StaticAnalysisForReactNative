package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bhxx  reason: default package */
/* loaded from: classes3.dex */
final class bhxx implements View.OnClickListener {
    final /* synthetic */ bhxy a;
    private final String b;

    public bhxx(bhxy bhxyVar, String str) {
        this.a = bhxyVar;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bhxy bhxyVar = this.a;
        bhxyVar.l = false;
        bhxyVar.n = true;
        bhxyVar.p.a(false, new bhxw(), this.b, null, null);
    }
}
