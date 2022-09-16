package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaoa  reason: default package */
/* loaded from: classes.dex */
public final class aaoa {
    public final List a;

    public aaoa() {
        this.a = new ArrayList();
    }

    public final boolean a(int i) {
        return i >= 0 && i < this.a.size();
    }

    public final void b(bys bysVar) {
        this.a.add(bysVar);
    }

    public final void c(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                cdh.g(path, (bys) this.a.get(size));
            } else {
                return;
            }
        }
    }

    public aaoa(arit aritVar) {
        if (aritVar == null || aritVar.c.size() == 0 || aritVar.c.size() == 0) {
            this.a = Collections.emptyList();
            return;
        }
        int size = aritVar.c.size();
        this.a = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.a.add(false);
        }
    }
}
