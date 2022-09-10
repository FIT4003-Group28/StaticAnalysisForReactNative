package defpackage;

import android.os.SystemClock;
import android.view.MenuItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ux  reason: default package */
/* loaded from: classes7.dex */
public final class ux implements aar {
    final /* synthetic */ uz a;

    public ux(uz uzVar) {
        this.a = uzVar;
    }

    @Override // defpackage.aar
    public final void a(vf vfVar, MenuItem menuItem) {
        this.a.a.removeCallbacksAndMessages(vfVar);
    }

    @Override // defpackage.aar
    public final void b(vf vfVar, MenuItem menuItem) {
        uy uyVar = null;
        this.a.a.removeCallbacksAndMessages(null);
        int size = this.a.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vfVar == this.a.b.get(i).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.a.b.size()) {
            uyVar = this.a.b.get(i2);
        }
        this.a.a.postAtTime(new uw(this, uyVar, menuItem, vfVar), vfVar, SystemClock.uptimeMillis() + 200);
    }
}
