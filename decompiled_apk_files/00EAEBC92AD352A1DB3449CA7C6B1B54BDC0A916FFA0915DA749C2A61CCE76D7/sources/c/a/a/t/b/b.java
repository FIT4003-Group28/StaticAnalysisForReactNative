package c.a.a.t.b;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private List<t> f2313a = new ArrayList();

    public void a(Path path) {
        for (int size = this.f2313a.size() - 1; size >= 0; size--) {
            c.a.a.y.h.a(path, this.f2313a.get(size));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(t tVar) {
        this.f2313a.add(tVar);
    }
}
