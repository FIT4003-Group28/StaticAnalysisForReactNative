package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: vdo  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vdo implements Runnable {
    public final /* synthetic */ ankt a;
    public final /* synthetic */ vco b;
    private final /* synthetic */ int c;

    public /* synthetic */ vdo(vco vcoVar, ankt anktVar) {
        this.b = vcoVar;
        this.a = anktVar;
    }

    public /* synthetic */ vdo(vco vcoVar, ankt anktVar, int i) {
        this.c = i;
        this.b = vcoVar;
        this.a = anktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            vco vcoVar = this.b;
            try {
                anlz.y(this.a);
                return;
            } catch (Exception e) {
                String str = vcoVar.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
                sb.append("Failed to store account on flag read for: ");
                sb.append(str);
                sb.append(" which may lead to stale flags.");
                Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
                return;
            }
        }
        this.b.e(this.a);
    }
}
