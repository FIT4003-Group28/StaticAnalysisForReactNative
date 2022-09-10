package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkj  reason: default package */
/* loaded from: classes3.dex */
public final class bkj {
    private final List<bla> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bla blaVar) {
        this.a.add(blaVar);
    }

    public final void b(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                bps.d(path, this.a.get(size));
            } else {
                return;
            }
        }
    }
}
