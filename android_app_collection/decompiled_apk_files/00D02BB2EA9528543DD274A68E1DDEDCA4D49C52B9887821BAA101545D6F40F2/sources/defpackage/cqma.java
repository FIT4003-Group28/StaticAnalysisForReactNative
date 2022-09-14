package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.material.progress.MaterialProgressBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqma  reason: default package */
/* loaded from: classes5.dex */
public final class cqma extends cqmj {
    final /* synthetic */ cqss a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqma(cqmp[] cqmpVarArr, cqss cqssVar) {
        super(cqmpVarArr);
        this.a = cqssVar;
    }

    @Override // defpackage.cqmj
    public final View a(cqkd cqkdVar, int i, int i2, @dzsi Integer num, @dzsi ViewGroup viewGroup, boolean z) {
        Context a = cqkdVar.a(num, viewGroup);
        int b = this.a.b(a);
        MaterialProgressBar materialProgressBar = new MaterialProgressBar(a);
        materialProgressBar.setIndeterminate(true);
        materialProgressBar.b(a, null, 0, 2132018557);
        materialProgressBar.setColor(b);
        materialProgressBar.setGrowFrom(0);
        materialProgressBar.a();
        cqkdVar.d(viewGroup, materialProgressBar, z);
        return materialProgressBar;
    }
}
