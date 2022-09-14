package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zvc  reason: default package */
/* loaded from: classes7.dex */
public final class zvc implements vtl {
    final /* synthetic */ alcc[] a;
    final /* synthetic */ TextView b;
    final /* synthetic */ zvb c;

    public zvc(alcc[] alccVarArr, TextView textView, zvb zvbVar) {
        this.a = alccVarArr;
        this.b = textView;
        this.c = zvbVar;
    }

    @Override // defpackage.vtl
    public final void a(Drawable drawable) {
        bvrj.UI_THREAD.c();
        if (this.a[0] != null) {
            Object tag = this.b.getTag(R.id.renderable_components_applier);
            alcc alccVar = this.a[0];
            if (tag != alccVar) {
                return;
            }
            zvd.b(alccVar.b(this.c.c()), this.b);
        }
    }
}
