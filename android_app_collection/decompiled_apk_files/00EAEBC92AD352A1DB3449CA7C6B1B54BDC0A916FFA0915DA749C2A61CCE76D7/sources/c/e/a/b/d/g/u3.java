package c.e.a.b.d.g;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u3 extends w3 {

    /* renamed from: b  reason: collision with root package name */
    private int f4448b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f4449c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ v3 f4450d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u3(v3 v3Var) {
        this.f4450d = v3Var;
        this.f4449c = this.f4450d.f();
    }

    @Override // c.e.a.b.d.g.a4
    public final byte f() {
        int i = this.f4448b;
        if (i < this.f4449c) {
            this.f4448b = i + 1;
            return this.f4450d.b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4448b < this.f4449c;
    }
}
