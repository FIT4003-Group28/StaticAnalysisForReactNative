package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lwh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lwh implements Runnable {
    public final /* synthetic */ lwk a;
    private final /* synthetic */ int b;

    public /* synthetic */ lwh(lwk lwkVar) {
        this.a = lwkVar;
    }

    public /* synthetic */ lwh(lwk lwkVar, int i) {
        this.b = i;
        this.a = lwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            lwk lwkVar = this.a;
            lwkVar.h.f.Z(lwkVar.d);
            return;
        }
        lwk lwkVar2 = this.a;
        try {
            new lxo(0, lwkVar2.g, (View) lwkVar2.e.get(), new lwc(lwkVar2, 1), 0, 400, true).b();
        } catch (IllegalArgumentException e) {
            zep.d("Error revealing feed filter bar", e);
        }
    }
}
