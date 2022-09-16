package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abol  reason: default package */
/* loaded from: classes.dex */
public final class abol extends jo {
    final /* synthetic */ apzg b;
    final /* synthetic */ Map c;
    final /* synthetic */ abop d;

    public abol(abop abopVar, apzg apzgVar, Map map) {
        this.d = abopVar;
        this.b = apzgVar;
        this.c = map;
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 16) {
            this.d.c.c(this.b, this.c);
            return true;
        }
        return super.j(view, i, bundle);
    }
}
