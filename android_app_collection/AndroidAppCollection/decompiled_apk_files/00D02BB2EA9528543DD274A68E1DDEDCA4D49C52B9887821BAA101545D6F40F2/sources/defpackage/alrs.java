package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alrs  reason: default package */
/* loaded from: classes.dex */
final class alrs implements alwb {
    public boolean a = false;
    @dzsi
    public List<Runnable> b = new ArrayList();

    @Override // defpackage.alwb
    public final void e(alwa alwaVar) {
        List<Runnable> list;
        synchronized (this) {
            list = null;
            if (!this.a) {
                List<Runnable> list2 = this.b;
                this.b = null;
                list = list2;
            }
            this.a = true;
        }
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
        }
    }
}
