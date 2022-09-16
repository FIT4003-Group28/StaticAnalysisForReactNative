package defpackage;

import android.view.View;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: syv  reason: default package */
/* loaded from: classes4.dex */
public final class syv implements tdp, tdj {
    private final String a;
    private final teb b;
    private final AtomicReference c;
    private final List d;
    private final List e = new ArrayList();

    public syv(AtomicReference atomicReference, List list, String str, teb tebVar) {
        this.c = atomicReference;
        this.d = list;
        this.a = str;
        this.b = tebVar;
    }

    @Override // defpackage.tdj
    public final void a(View view) {
        c();
        view.setTag(333384171, null);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ void b(View view, View view2) {
        tfo.k(this, view);
    }

    public final void c() {
        for (ter terVar : this.e) {
            try {
                terVar.a();
            } catch (RuntimeException unused) {
                this.b.b(28, "Error in cancelling intersection subscription.");
            }
        }
        this.e.clear();
    }

    @Override // defpackage.tdp
    public final void d(View view) {
        tes tesVar = (tes) this.c.get();
        if (tesVar == null) {
            this.b.b(28, "ScrollStrategyScrollListener is unavailable");
            return;
        }
        for (IntersectionObserver intersectionObserver : this.d) {
            this.e.add(tesVar.a(this.a, intersectionObserver));
        }
        view.setTag(333384171, this.a);
    }
}
