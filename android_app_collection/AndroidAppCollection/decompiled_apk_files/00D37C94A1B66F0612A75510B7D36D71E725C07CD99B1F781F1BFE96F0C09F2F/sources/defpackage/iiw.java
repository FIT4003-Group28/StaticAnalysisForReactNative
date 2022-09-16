package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: iiw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iiw implements Callable {
    public final /* synthetic */ iix a;
    public final /* synthetic */ Activity b;
    private final /* synthetic */ int c;

    public /* synthetic */ iiw(iix iixVar, Activity activity) {
        this.a = iixVar;
        this.b = activity;
    }

    public /* synthetic */ iiw(iix iixVar, Activity activity, int i) {
        this.c = i;
        this.a = iixVar;
        this.b = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.c == 0) {
            final iix iixVar = this.a;
            final Activity activity = this.b;
            return iixVar.b.b.a.a.V(axxk.q).B().as(new ayqb() { // from class: iiu
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    iix iixVar2 = iix.this;
                    Activity activity2 = activity;
                    if (((Boolean) obj).booleanValue()) {
                        iixVar2.c.x(activity2, zhn.e(activity2, R.attr.ytTextAppearanceDisplay1));
                    }
                }
            });
        }
        iix iixVar2 = this.a;
        final Activity activity2 = this.b;
        return iixVar2.a.a.V(gam.r).V(new iiv(activity2)).as(new ayqb() { // from class: iit
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Float f = (Float) obj;
                View findViewById = activity2.findViewById(R.id.app_bar_layout);
                if (findViewById != null) {
                    findViewById.setElevation(f.floatValue());
                }
            }
        });
    }
}
