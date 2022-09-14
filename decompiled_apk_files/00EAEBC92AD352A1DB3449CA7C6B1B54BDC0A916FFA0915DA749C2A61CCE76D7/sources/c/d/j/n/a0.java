package c.d.j.n;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a0 extends z {
    public a0(Executor executor, c.d.d.g.h hVar) {
        super(executor, hVar);
    }

    @Override // c.d.j.n.z
    protected c.d.j.k.d a(c.d.j.o.c cVar) {
        return b(new FileInputStream(cVar.o().toString()), (int) cVar.o().length());
    }

    @Override // c.d.j.n.z
    protected String a() {
        return "LocalFileFetchProducer";
    }
}
