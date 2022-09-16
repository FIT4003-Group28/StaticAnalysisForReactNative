package defpackage;

import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xxn  reason: default package */
/* loaded from: classes4.dex */
public final class xxn implements View.OnClickListener {
    final /* synthetic */ apos a;
    final /* synthetic */ Map b;
    final /* synthetic */ xxp c;
    private final /* synthetic */ int d;

    public xxn(xxp xxpVar, apos aposVar, Map map) {
        this.c = xxpVar;
        this.a = aposVar;
        this.b = map;
    }

    public xxn(xxp xxpVar, apos aposVar, Map map, int i) {
        this.d = i;
        this.c = xxpVar;
        this.a = aposVar;
        this.b = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d == 0) {
            aafo aafoVar = this.c.a;
            apzg apzgVar = this.a.l;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, this.b);
            return;
        }
        aafo aafoVar2 = this.c.a;
        apzg apzgVar2 = this.a.l;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar2.c(apzgVar2, this.b);
    }
}
