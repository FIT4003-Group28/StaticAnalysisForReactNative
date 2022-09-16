package defpackage;

import android.view.View;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: lyp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lyp implements Callable {
    public final /* synthetic */ axxi a;
    public final /* synthetic */ ayor b;
    public final /* synthetic */ View c;
    private final /* synthetic */ int d;

    public /* synthetic */ lyp(axxi axxiVar, ayor ayorVar, View view) {
        this.a = axxiVar;
        this.b = ayorVar;
        this.c = view;
    }

    public /* synthetic */ lyp(axxi axxiVar, ayor ayorVar, View view, int i) {
        this.d = i;
        this.a = axxiVar;
        this.b = ayorVar;
        this.c = view;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.d == 0) {
            axxi axxiVar = this.a;
            return axxiVar.a().X(this.b).as(new lwf(this.c, 2));
        }
        axxi axxiVar2 = this.a;
        return axxiVar2.a().X(this.b).as(new lwf(this.c));
    }
}
