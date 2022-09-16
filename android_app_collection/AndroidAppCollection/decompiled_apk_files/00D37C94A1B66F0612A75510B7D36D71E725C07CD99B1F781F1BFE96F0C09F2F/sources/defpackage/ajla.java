package defpackage;

import android.content.Context;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ajla  reason: default package */
/* loaded from: classes.dex */
final class ajla extends ajmg {
    private final Context a;
    private final aodt b;
    private final aodt c;

    public ajla(Context context, aodt aodtVar, aodt aodtVar2) {
        this.a = context;
        this.b = aodtVar;
        this.c = aodtVar2;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void a(ImageView imageView) {
        aodt aodtVar = this.c;
        if (aodtVar != null) {
            aolu.t(aodtVar, imageView, this.a);
        }
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void c(ImageView imageView) {
        aodt aodtVar = this.b;
        if (aodtVar != null) {
            aolu.t(aodtVar, imageView, this.a);
        }
    }
}
