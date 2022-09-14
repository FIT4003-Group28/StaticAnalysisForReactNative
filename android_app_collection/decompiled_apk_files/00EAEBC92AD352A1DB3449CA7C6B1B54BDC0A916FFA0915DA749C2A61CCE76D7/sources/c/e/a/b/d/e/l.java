package c.e.a.b.d.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final d f3942a;

    /* renamed from: b  reason: collision with root package name */
    private final q f3943b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3944c;

    private l(q qVar) {
        this(qVar, false, h.f3914b, Integer.MAX_VALUE);
    }

    private l(q qVar, boolean z, d dVar, int i) {
        this.f3943b = qVar;
        this.f3942a = dVar;
        this.f3944c = Integer.MAX_VALUE;
    }

    public static l a(char c2) {
        f fVar = new f('.');
        m.a(fVar);
        return new l(new o(fVar));
    }

    public final List<String> a(CharSequence charSequence) {
        m.a(charSequence);
        Iterator<String> a2 = this.f3943b.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a2.hasNext()) {
            arrayList.add(a2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
