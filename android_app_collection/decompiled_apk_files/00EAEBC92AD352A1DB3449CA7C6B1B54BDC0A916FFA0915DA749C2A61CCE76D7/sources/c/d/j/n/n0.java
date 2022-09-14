package c.d.j.n;

import android.content.ContentResolver;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class n0 extends z {

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f3503c;

    public n0(Executor executor, c.d.d.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f3503c = contentResolver;
    }

    @Override // c.d.j.n.z
    protected c.d.j.k.d a(c.d.j.o.c cVar) {
        return b(this.f3503c.openInputStream(cVar.p()), -1);
    }

    @Override // c.d.j.n.z
    protected String a() {
        return "QualifiedResourceFetchProducer";
    }
}
