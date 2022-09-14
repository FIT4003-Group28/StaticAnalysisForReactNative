package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f845a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f846b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.f845a = z;
    }

    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f846b.add(aVar);
    }

    public final void a(boolean z) {
        this.f845a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f846b.remove(aVar);
    }

    public final boolean b() {
        return this.f845a;
    }

    public final void c() {
        Iterator<a> it = this.f846b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
